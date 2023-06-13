package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideSettingsStorageFactory implements InterfaceC48812sj1<SettingsStorage> {
    private final Y94<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideSettingsStorageFactory(Y94<BaseStorage> y94) {
        this.baseStorageProvider = y94;
    }

    public static ZendeskStorageModule_ProvideSettingsStorageFactory create(Y94<BaseStorage> y94) {
        return new ZendeskStorageModule_ProvideSettingsStorageFactory(y94);
    }

    public static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        return (SettingsStorage) C51679xZ3.m5002e(ZendeskStorageModule.provideSettingsStorage(baseStorage));
    }

    @Override // p000.Y94
    public SettingsStorage get() {
        return provideSettingsStorage(this.baseStorageProvider.get());
    }
}
