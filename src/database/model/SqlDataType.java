package database.model;

public enum SqlDataType {
        BIGINT("BIGINT"),
        INT("INT"),
        BIT("BIT"),
        MONEY("MONEY"),
        DECIMAL("DECIMAL"),
        NVARCHAR("NVARCHAR"),
        DATETIME2("DATETIME2"),
        UNIQUEIDENTIFIER("UNIQUEIDENTIFIER");

        private final String keyword;

        SqlDataType(String keyword) {
                this.keyword = keyword;
        }

        public String getKeyword() {
                return keyword;
        }
}
