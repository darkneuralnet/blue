package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetSessionStorageFactory implements InterfaceC48812sj1<SessionStorage> {
    private final CoreModule module;

    public CoreModule_GetSessionStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSessionStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetSessionStorageFactory(coreModule);
    }

    public static SessionStorage getSessionStorage(CoreModule coreModule) {
        return (SessionStorage) C51679xZ3.m5002e(coreModule.getSessionStorage());
    }

    @Override // p000.Y94
    public SessionStorage get() {
        return getSessionStorage(this.module);
    }
}
