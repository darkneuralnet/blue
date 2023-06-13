package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideZendeskFactory implements InterfaceC48812sj1<ZendeskShadow> {
    private final Y94<BlipsCoreProvider> blipsCoreProvider;
    private final Y94<CoreModule> coreModuleProvider;
    private final Y94<IdentityManager> identityManagerProvider;
    private final Y94<LegacyIdentityMigrator> legacyIdentityMigratorProvider;
    private final Y94<ProviderStore> providerStoreProvider;
    private final Y94<PushRegistrationProvider> pushRegistrationProvider;
    private final Y94<Storage> storageProvider;

    public ZendeskApplicationModule_ProvideZendeskFactory(Y94<Storage> y94, Y94<LegacyIdentityMigrator> y942, Y94<IdentityManager> y943, Y94<BlipsCoreProvider> y944, Y94<PushRegistrationProvider> y945, Y94<CoreModule> y946, Y94<ProviderStore> y947) {
        this.storageProvider = y94;
        this.legacyIdentityMigratorProvider = y942;
        this.identityManagerProvider = y943;
        this.blipsCoreProvider = y944;
        this.pushRegistrationProvider = y945;
        this.coreModuleProvider = y946;
        this.providerStoreProvider = y947;
    }

    public static ZendeskApplicationModule_ProvideZendeskFactory create(Y94<Storage> y94, Y94<LegacyIdentityMigrator> y942, Y94<IdentityManager> y943, Y94<BlipsCoreProvider> y944, Y94<PushRegistrationProvider> y945, Y94<CoreModule> y946, Y94<ProviderStore> y947) {
        return new ZendeskApplicationModule_ProvideZendeskFactory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static ZendeskShadow provideZendesk(Object obj, Object obj2, Object obj3, Object obj4, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        return (ZendeskShadow) C51679xZ3.m5002e(ZendeskApplicationModule.provideZendesk((Storage) obj, (LegacyIdentityMigrator) obj2, (IdentityManager) obj3, (BlipsCoreProvider) obj4, pushRegistrationProvider, coreModule, providerStore));
    }

    @Override // p000.Y94
    public ZendeskShadow get() {
        return provideZendesk(this.storageProvider.get(), this.legacyIdentityMigratorProvider.get(), this.identityManagerProvider.get(), this.blipsCoreProvider.get(), this.pushRegistrationProvider.get(), this.coreModuleProvider.get(), this.providerStoreProvider.get());
    }
}
