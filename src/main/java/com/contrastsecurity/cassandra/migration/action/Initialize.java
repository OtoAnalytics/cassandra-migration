package com.contrastsecurity.cassandra.migration.action;

import com.contrastsecurity.cassandra.migration.config.Keyspace;
import com.contrastsecurity.cassandra.migration.dao.SchemaVersionDAO;
import com.datastax.driver.core.Session;

public class Initialize {

    public void run(SchemaVersionDAO dao) {
        dao.createTablesIfNotExist();
    }
}
