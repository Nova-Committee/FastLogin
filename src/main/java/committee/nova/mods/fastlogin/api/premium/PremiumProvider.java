package committee.nova.mods.fastlogin.api.premium;

/**
 * Author cnlimiter
 * CreateTime 2023/6/11 4:14
 * Name PremiumProvider
 * Description
 */

public interface PremiumProvider {
    PremiumUser getUserForName(String name) throws PremiumException;

}
