package committee.nova.mods.fastlogin.api.database.provider;

import committee.nova.mods.fastlogin.api.database.connector.DatabaseConnector;
import committee.nova.mods.fastlogin.api.util.ThrowableFunction;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.Nullable;

/**
 * Author cnlimiter
 * CreateTime 2023/6/11 4:09
 * Name DBProviderRegister
 * Description
 */
@AllArgsConstructor
public class DBProviderRegister <R extends ReadDBProvider, C extends DatabaseConnector, E extends Exception>{

    ThrowableFunction<C, R, E> factory;
    String id;
    @Nullable Class<C> databaseConnector;

    public R create(DatabaseConnector connector) throws E {
        return factory.apply((C) connector);
    }
}
