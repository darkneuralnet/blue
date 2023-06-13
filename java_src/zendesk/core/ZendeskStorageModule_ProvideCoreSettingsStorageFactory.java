package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideCoreSettingsStorageFactory implements InterfaceC48812sj1<CoreSettingsStorage> {
    private final Y94<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideCoreSettingsStorageFactory(Y94<SettingsStorage> y94) {
        this.settingsStorageProvider = y94;
    }

    public static ZendeskStorageModule_ProvideCoreSettingsStorageFactory create(Y94<SettingsStorage> y94) {
        return new ZendeskStorageModule_ProvideCoreSettingsStorageFactory(y94);
    }

    public static CoreSettingsStorage provideCoreSettingsStorage(Object obj) {
        return (CoreSettingsStorage) C51679xZ3.m5002e(ZendeskStorageModule.provideCoreSettingsStorage((SettingsStorage) obj));
    }

    @Override // p000.Y94
    public CoreSettingsStorage get() {
        return provideCoreSettingsStorage(this.settingsStorageProvider.get());
    }
}
