package database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

/**
 * Configuration helper for connecting to the Microsoft SQL Server LocalDB
 * instance that ships with the SQL Server Express edition.
 *
 * <p>The configuration exposes a ready-to-use JDBC URL and a helper method that
 * creates a {@link Connection} using integrated security. The default instance
 * name provided by Microsoft is {@code MSSQLLocalDB}, therefore the connection
 * string is built around the {@code (localdb)\\MSSQLLocalDB} server name.</p>
 */
public class LocalDbConfig {

        private static final String DEFAULT_INSTANCE = "(localdb)\\\\MSSQLLocalDB";
        private static final String JDBC_DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        private final String databaseName;
        private final Properties connectionProperties;

        public LocalDbConfig(String databaseName) {
                this(databaseName, buildDefaultProperties());
        }

        public LocalDbConfig(String databaseName, Properties connectionProperties) {
                this.databaseName = Objects.requireNonNull(databaseName, "Database name is required");
                this.connectionProperties = new Properties();
                this.connectionProperties.putAll(connectionProperties);
        }

        public String getDatabaseName() {
                return databaseName;
        }

        public Properties getConnectionProperties() {
                Properties copy = new Properties();
                copy.putAll(connectionProperties);
                return copy;
        }

        public String getConnectionUrl() {
                return "jdbc:sqlserver://" + DEFAULT_INSTANCE + ";databaseName=" + databaseName + ";";
        }

        public Connection openConnection() throws SQLException {
                loadDriverIfRequired();
                return DriverManager.getConnection(getConnectionUrl(), connectionProperties);
        }

        private void loadDriverIfRequired() {
                try {
                        Class.forName(JDBC_DRIVER_CLASS);
                } catch (ClassNotFoundException ex) {
                        throw new IllegalStateException("The Microsoft SQL Server JDBC driver is not available on the classpath", ex);
                }
        }

        private static Properties buildDefaultProperties() {
                Properties props = new Properties();
                props.setProperty("encrypt", "true");
                props.setProperty("trustServerCertificate", "true");
                props.setProperty("integratedSecurity", "true");
                return props;
        }
}
