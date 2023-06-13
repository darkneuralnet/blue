package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideMemoryCacheFactory implements InterfaceC48812sj1<MemoryCache> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final ZendeskStorageModule_ProvideMemoryCacheFactory INSTANCE = new ZendeskStorageModule_ProvideMemoryCacheFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskStorageModule_ProvideMemoryCacheFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MemoryCache provideMemoryCache() {
        return (MemoryCache) C51679xZ3.m5002e(ZendeskStorageModule.provideMemoryCache());
    }

    @Override // p000.Y94
    public MemoryCache get() {
        return provideMemoryCache();
    }
}
