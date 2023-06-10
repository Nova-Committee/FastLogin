package committee.nova.mods.fastlogin.api.authorization;

import committee.nova.mods.fastlogin.api.database.User;

/**
 * Author cnlimiter
 * CreateTime 2023/6/10 17:58
 * Name IAuthorization
 * Description
 */

public interface AuthorizationProvider<P> {

    boolean isAuthorized(P player);

    void authorize(User user, P player, AuthenticationReason reason);
}
