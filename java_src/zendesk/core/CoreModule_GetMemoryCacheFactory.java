package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetMemoryCacheFactory implements InterfaceC48812sj1<MemoryCache> {
    private final CoreModule module;

    public CoreModule_GetMemoryCacheFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMemoryCacheFactory create(CoreModule coreModule) {
        return new CoreModule_GetMemoryCacheFactory(coreModule);
    }

    public static MemoryCache getMemoryCache(CoreModule coreModule) {
        return (MemoryCache) C51679xZ3.m5002e(coreModule.getMemoryCache());
    }

    @Override // p000.Y94
    public MemoryCache get() {
        return getMemoryCache(this.module);
    }
}
