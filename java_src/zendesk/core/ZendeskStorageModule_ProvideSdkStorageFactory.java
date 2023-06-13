package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideSdkStorageFactory implements InterfaceC48812sj1<Storage> {
    private final Y94<MemoryCache> memoryCacheProvider;
    private final Y94<BaseStorage> sdkBaseStorageProvider;
    private final Y94<SessionStorage> sessionStorageProvider;
    private final Y94<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideSdkStorageFactory(Y94<SettingsStorage> y94, Y94<SessionStorage> y942, Y94<BaseStorage> y943, Y94<MemoryCache> y944) {
        this.settingsStorageProvider = y94;
        this.sessionStorageProvider = y942;
        this.sdkBaseStorageProvider = y943;
        this.memoryCacheProvider = y944;
    }

    public static ZendeskStorageModule_ProvideSdkStorageFactory create(Y94<SettingsStorage> y94, Y94<SessionStorage> y942, Y94<BaseStorage> y943, Y94<MemoryCache> y944) {
        return new ZendeskStorageModule_ProvideSdkStorageFactory(y94, y942, y943, y944);
    }

    public static Storage provideSdkStorage(Object obj, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        return (Storage) C51679xZ3.m5002e(ZendeskStorageModule.provideSdkStorage((SettingsStorage) obj, sessionStorage, baseStorage, memoryCache));
    }

    @Override // p000.Y94
    public Storage get() {
        return provideSdkStorage(this.settingsStorageProvider.get(), this.sessionStorageProvider.get(), this.sdkBaseStorageProvider.get(), this.memoryCacheProvider.get());
    }
}
