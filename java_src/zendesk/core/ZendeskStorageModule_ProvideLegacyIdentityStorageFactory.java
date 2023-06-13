package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideLegacyIdentityStorageFactory implements InterfaceC48812sj1<LegacyIdentityMigrator> {
    private final Y94<IdentityManager> identityManagerProvider;
    private final Y94<IdentityStorage> identityStorageProvider;
    private final Y94<SharedPreferencesStorage> legacyIdentityBaseStorageProvider;
    private final Y94<SharedPreferencesStorage> legacyPushBaseStorageProvider;
    private final Y94<PushDeviceIdStorage> pushDeviceIdStorageProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(Y94<SharedPreferencesStorage> y94, Y94<SharedPreferencesStorage> y942, Y94<IdentityStorage> y943, Y94<IdentityManager> y944, Y94<PushDeviceIdStorage> y945) {
        this.legacyIdentityBaseStorageProvider = y94;
        this.legacyPushBaseStorageProvider = y942;
        this.identityStorageProvider = y943;
        this.identityManagerProvider = y944;
        this.pushDeviceIdStorageProvider = y945;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityStorageFactory create(Y94<SharedPreferencesStorage> y94, Y94<SharedPreferencesStorage> y942, Y94<IdentityStorage> y943, Y94<IdentityManager> y944, Y94<PushDeviceIdStorage> y945) {
        return new ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(y94, y942, y943, y944, y945);
    }

    public static LegacyIdentityMigrator provideLegacyIdentityStorage(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (LegacyIdentityMigrator) C51679xZ3.m5002e(ZendeskStorageModule.provideLegacyIdentityStorage((SharedPreferencesStorage) obj, (SharedPreferencesStorage) obj2, (IdentityStorage) obj3, (IdentityManager) obj4, (PushDeviceIdStorage) obj5));
    }

    @Override // p000.Y94
    public LegacyIdentityMigrator get() {
        return provideLegacyIdentityStorage(this.legacyIdentityBaseStorageProvider.get(), this.legacyPushBaseStorageProvider.get(), this.identityStorageProvider.get(), this.identityManagerProvider.get(), this.pushDeviceIdStorageProvider.get());
    }
}
