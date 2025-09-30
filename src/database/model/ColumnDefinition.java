package database.model;

import java.util.Objects;

public class ColumnDefinition {

        private final String name;
        private final SqlDataType dataType;
        private final Integer length;
        private final Integer scale;
        private final boolean nullable;
        private final boolean primaryKey;
        private final boolean identity;
        private final String references;

        private ColumnDefinition(Builder builder) {
                this.name = builder.name;
                this.dataType = builder.dataType;
                this.length = builder.length;
                this.scale = builder.scale;
                this.nullable = builder.nullable;
                this.primaryKey = builder.primaryKey;
                this.identity = builder.identity;
                this.references = builder.references;
        }

        public String getName() {
                return name;
        }

        public SqlDataType getDataType() {
                return dataType;
        }

        public Integer getLength() {
                return length;
        }

        public Integer getScale() {
                return scale;
        }

        public boolean isNullable() {
                return nullable;
        }

        public boolean isPrimaryKey() {
                return primaryKey;
        }

        public boolean isIdentity() {
                return identity;
        }

        public String getReferences() {
                return references;
        }

        public String toSql() {
                StringBuilder builder = new StringBuilder();
                builder.append('[').append(name).append(']').append(' ');
                builder.append(dataType.getKeyword());
                if (length != null && scale == null) {
                        builder.append('(').append(length).append(')');
                } else if (length != null) {
                        builder.append('(').append(length).append(',').append(scale).append(')');
                }
                if (identity) {
                        builder.append(" IDENTITY(1,1)");
                }
                if (!nullable || primaryKey) {
                        builder.append(" NOT NULL");
                }
                if (primaryKey) {
                        builder.append(" PRIMARY KEY");
                }
                if (references != null) {
                        builder.append(" REFERENCES ").append(references);
                }
                return builder.toString();
        }

        public static Builder builder(String name, SqlDataType dataType) {
                return new Builder(name, dataType);
        }

        public static final class Builder {
                private final String name;
                private final SqlDataType dataType;
                private Integer length;
                private Integer scale;
                private boolean nullable = true;
                private boolean primaryKey;
                private boolean identity;
                private String references;

                private Builder(String name, SqlDataType dataType) {
                        this.name = Objects.requireNonNull(name, "Column name");
                        this.dataType = Objects.requireNonNull(dataType, "SQL data type");
                }

                public Builder withLength(int value) {
                        this.length = value;
                        return this;
                }

                public Builder withLengthAndScale(int length, int scale) {
                        this.length = length;
                        this.scale = scale;
                        return this;
                }

                public Builder notNull() {
                        this.nullable = false;
                        return this;
                }

                public Builder asPrimaryKey() {
                        this.primaryKey = true;
                        this.nullable = false;
                        return this;
                }

                public Builder withIdentity() {
                        this.identity = true;
                        return this;
                }

                public Builder references(String table, String column) {
                        this.references = '[' + table + "].[" + column + ']';
                        return this;
                }

                public ColumnDefinition build() {
                        return new ColumnDefinition(this);
                }
        }
}
