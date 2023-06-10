package cn.evole.mods.fastlogin.api.database;

import java.util.Collection;
import java.util.UUID;

/**
 * Author cnlimiter
 * CreateTime 2023/6/11 3:56
 * Name ReadDatabaseProvider
 * Description
 */

public interface ReadDBProvider {
    User getByName(String name);

    User getByUUID(UUID uuid);

    User getByPremiumUUID(UUID uuid);

    Collection<User> getAllUsers();

    Collection<User> getByIP(String ip);
}
