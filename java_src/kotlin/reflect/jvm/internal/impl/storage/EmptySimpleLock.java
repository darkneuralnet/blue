package kotlin.reflect.jvm.internal.impl.storage;
/* loaded from: classes8.dex */
public final class EmptySimpleLock implements SimpleLock {
    public static final EmptySimpleLock INSTANCE = new EmptySimpleLock();

    private EmptySimpleLock() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
    }
}
