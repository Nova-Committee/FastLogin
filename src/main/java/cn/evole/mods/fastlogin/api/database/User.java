package cn.evole.mods.fastlogin.api.database;

import cn.evole.mods.fastlogin.api.security.HashedPassword;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Author cnlimiter
 * CreateTime 2023/6/11 3:48
 * Name User
 * Description
 */

public interface User {
    String getSecret();

    void setSecret(String secret);

    String getIp();

    void setIp(String ip);

    String getLastServer();

    void setLastServer(String lastServer);

    Timestamp getLastAuthentication();

    void setLastAuthentication(Timestamp lastAuthentication);

    Timestamp getJoinDate();

    void setJoinDate(Timestamp joinDate);

    Timestamp getLastSeen();

    void setLastSeen(Timestamp lastSeen);

    HashedPassword getHashedPassword();

    void setHashedPassword(HashedPassword hashedPassword);

    UUID getUuid();

    UUID getPremiumUUID();

    void setPremiumUUID(UUID premiumUUID);

    String getLastNickname();

    void setLastNickname(String lastNickname);

    boolean isRegistered();

    boolean autoLoginEnabled();
}
