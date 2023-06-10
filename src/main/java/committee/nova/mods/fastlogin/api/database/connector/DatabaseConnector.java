package committee.nova.mods.fastlogin.api.database.connector;

import committee.nova.mods.fastlogin.api.util.ThrowableConsumer;
import committee.nova.mods.fastlogin.api.util.ThrowableFunction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Author cnlimiter
 * CreateTime 2023/6/11 3:52
 * Name DatabaseConnector
 * Description
 */

public interface DatabaseConnector {

    void connect() throws SQLException;

    boolean connected();

    void disconnect() throws SQLException;

    Connection obtainInterface() throws SQLException, IllegalStateException;

    <V> V runQuery(ThrowableFunction<Connection, V, SQLException> function) throws IllegalStateException;

    default void runQuery(ThrowableConsumer<Connection, SQLException> consumer) throws IllegalStateException {
        runQuery((i) -> {
            consumer.accept(i);
            return null;
        });
    }
}
