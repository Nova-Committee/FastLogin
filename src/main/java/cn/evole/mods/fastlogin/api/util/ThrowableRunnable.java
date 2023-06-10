package cn.evole.mods.fastlogin.api.util;

public interface ThrowableRunnable<E extends Throwable> {
    void run() throws E;
}
