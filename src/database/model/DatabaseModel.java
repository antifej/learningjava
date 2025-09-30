package database.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DatabaseModel {

        private final List<TableDefinition> tables;

        private DatabaseModel(List<TableDefinition> tables) {
                this.tables = Collections.unmodifiableList(new ArrayList<>(tables));
        }

        public static DatabaseModel createDefaultModel() {
                List<TableDefinition> tables = new ArrayList<>();
                tables.add(createProductTable());
                tables.add(createCategoryTable());
                tables.add(createInventoryTable());
                return new DatabaseModel(tables);
        }

        public List<TableDefinition> getTables() {
                return tables;
        }

        public List<String> toCreateTableStatements() {
                List<String> statements = new ArrayList<>();
                for (TableDefinition table : tables) {
                        statements.add(table.toCreateTableStatement());
                }
                return statements;
        }

        private static TableDefinition createProductTable() {
                return TableDefinition.builder("Products")
                        .withColumn(ColumnDefinition.builder("ProductId", SqlDataType.BIGINT)
                                .withIdentity()
                                .asPrimaryKey()
                                .build())
                        .withColumn(ColumnDefinition.builder("ProductName", SqlDataType.NVARCHAR)
                                .withLength(200)
                                .notNull()
                                .build())
                        .withColumn(ColumnDefinition.builder("Description", SqlDataType.NVARCHAR)
                                .withLength(1000)
                                .build())
                        .withColumn(ColumnDefinition.builder("Price", SqlDataType.DECIMAL)
                                .withLengthAndScale(10, 2)
                                .notNull()
                                .build())
                        .withColumn(ColumnDefinition.builder("Active", SqlDataType.BIT)
                                .notNull()
                                .build())
                        .withColumn(ColumnDefinition.builder("CategoryId", SqlDataType.BIGINT)
                                .notNull()
                                .build())
                        .withConstraint("FOREIGN KEY ([CategoryId]) REFERENCES [ProductCategories]([CategoryId])")
                        .build();
        }

        private static TableDefinition createCategoryTable() {
                return TableDefinition.builder("ProductCategories")
                        .withColumn(ColumnDefinition.builder("CategoryId", SqlDataType.BIGINT)
                                .withIdentity()
                                .asPrimaryKey()
                                .build())
                        .withColumn(ColumnDefinition.builder("CategoryName", SqlDataType.NVARCHAR)
                                .withLength(150)
                                .notNull()
                                .build())
                        .withColumn(ColumnDefinition.builder("Description", SqlDataType.NVARCHAR)
                                .withLength(1000)
                                .build())
                        .build();
        }

        private static TableDefinition createInventoryTable() {
                return TableDefinition.builder("ProductInventory")
                        .withColumn(ColumnDefinition.builder("InventoryId", SqlDataType.BIGINT)
                                .withIdentity()
                                .asPrimaryKey()
                                .build())
                        .withColumn(ColumnDefinition.builder("ProductId", SqlDataType.BIGINT)
                                .notNull()
                                .build())
                        .withColumn(ColumnDefinition.builder("Quantity", SqlDataType.INT)
                                .notNull()
                                .build())
                        .withColumn(ColumnDefinition.builder("LastUpdated", SqlDataType.DATETIME2)
                                .notNull()
                                .build())
                        .withConstraint("FOREIGN KEY ([ProductId]) REFERENCES [Products]([ProductId])")
                        .build();
        }
}
