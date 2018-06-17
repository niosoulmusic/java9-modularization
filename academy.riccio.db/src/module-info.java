module academy.riccio.db {
    requires java.sql;
    requires sqlite.jdbc;
    requires transitive academy.riccio.common;

    exports academy.riccio.db;
}