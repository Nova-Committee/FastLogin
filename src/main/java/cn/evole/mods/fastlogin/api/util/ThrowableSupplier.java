package cn.evole.mods.fastlogin.api.util;

public interface ThrowableSupplier<T, E extends Throwable> {
    T get() throws E;
}
