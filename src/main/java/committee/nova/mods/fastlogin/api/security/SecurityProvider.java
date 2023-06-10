package committee.nova.mods.fastlogin.api.security;

/**
 * Author cnlimiter
 * CreateTime 2023/6/11 3:41
 * Name SecurityProvider
 * Description
 */

public interface SecurityProvider {

    HashedPassword createHash(String password);

    boolean matches(String input, HashedPassword password);

    String getIdentifier();
}
