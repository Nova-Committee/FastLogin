package committee.nova.mods.fastlogin.api.util;

public interface ThrowableConsumer<T, E extends Throwable> {

    void accept(T t) throws E;

}
