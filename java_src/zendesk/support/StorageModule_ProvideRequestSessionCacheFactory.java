package zendesk.support;
/* loaded from: classes8.dex */
public final class StorageModule_ProvideRequestSessionCacheFactory implements InterfaceC48812sj1<RequestSessionCache> {
    private final StorageModule module;

    public StorageModule_ProvideRequestSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public static StorageModule_ProvideRequestSessionCacheFactory create(StorageModule storageModule) {
        return new StorageModule_ProvideRequestSessionCacheFactory(storageModule);
    }

    public static RequestSessionCache provideRequestSessionCache(StorageModule storageModule) {
        return (RequestSessionCache) C51679xZ3.m5002e(storageModule.provideRequestSessionCache());
    }

    @Override // p000.Y94
    public RequestSessionCache get() {
        return provideRequestSessionCache(this.module);
    }
}
