package committee.nova.mods.fastlogin.api.util;

public interface ThrowableSupplier<T, E extends Throwable> {
    T get() throws E;
}
