package database.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TableDefinition {

        private final String name;
        private final List<ColumnDefinition> columns;
        private final List<String> additionalConstraints;

        private TableDefinition(Builder builder) {
                this.name = builder.name;
                this.columns = Collections.unmodifiableList(new ArrayList<>(builder.columns));
                this.additionalConstraints = Collections.unmodifiableList(new ArrayList<>(builder.additionalConstraints));
        }

        public String getName() {
                return name;
        }

        public List<ColumnDefinition> getColumns() {
                return columns;
        }

        public List<String> getAdditionalConstraints() {
                return additionalConstraints;
        }

        public String toCreateTableStatement() {
                StringBuilder builder = new StringBuilder();
                builder.append("CREATE TABLE [").append(name).append("] (");
                for (int i = 0; i < columns.size(); i++) {
                        builder.append(columns.get(i).toSql());
                        if (i < columns.size() - 1 || !additionalConstraints.isEmpty()) {
                                builder.append(',');
                        }
                        builder.append(System.lineSeparator()).append(' ');
                }
                for (int i = 0; i < additionalConstraints.size(); i++) {
                        builder.append(additionalConstraints.get(i));
                        if (i < additionalConstraints.size() - 1) {
                                builder.append(',');
                        }
                        builder.append(System.lineSeparator()).append(' ');
                }
                builder.append(')');
                return builder.toString();
        }

        public static Builder builder(String name) {
                return new Builder(name);
        }

        public static final class Builder {
                private final String name;
                private final List<ColumnDefinition> columns = new ArrayList<>();
                private final List<String> additionalConstraints = new ArrayList<>();

                private Builder(String name) {
                        this.name = Objects.requireNonNull(name, "Table name");
                }

                public Builder withColumn(ColumnDefinition column) {
                        columns.add(Objects.requireNonNull(column, "column"));
                        return this;
                }

                public Builder withConstraint(String constraintSql) {
                        additionalConstraints.add(Objects.requireNonNull(constraintSql, "constraintSql"));
                        return this;
                }

                public TableDefinition build() {
                        return new TableDefinition(this);
                }
        }
}
