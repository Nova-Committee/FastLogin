package cn.evole.mods.fastlogin.api.util;

public interface ThrowableFunction<T, V, E extends Throwable> {

    V apply(T t) throws E;

}

