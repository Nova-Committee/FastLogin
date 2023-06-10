package committee.nova.mods.fastlogin.api.database.provider;

import committee.nova.mods.fastlogin.api.database.User;

import java.util.Collection;

/**
 * Author cnlimiter
 * CreateTime 2023/6/11 3:57
 * Name WriteDatabaseProvider
 * Description
 */

public interface WriteDBProvider {
    void insertUser(User user);

    void insertUsers(Collection<User> users);

    void updateUser(User user);

    void deleteUser(User user);
}
