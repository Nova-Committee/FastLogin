package cn.evole.mods.fastlogin.api.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.jetbrains.annotations.Nullable;

/**
 * Author cnlimiter
 * CreateTime 2023/6/10 18:00
 * Name HashedPassword
 * Description
 */
@Builder
@AllArgsConstructor

public class HashedPassword {
    String hash;
    @Nullable String salt;
    String algo;
}
