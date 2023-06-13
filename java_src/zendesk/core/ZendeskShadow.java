package zendesk.core;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class ZendeskShadow {
    private static final String LOG_TAG = "ZendeskShadow";
    private final BlipsCoreProvider blipsCoreProvider;
    private final CoreModule coreModule;
    private final IdentityManager identityManager;
    private final LegacyIdentityMigrator legacyIdentityMigrator;
    private final ProviderStore providerStore;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final Storage storage;

    public ZendeskShadow(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        this.storage = storage;
        this.legacyIdentityMigrator = legacyIdentityMigrator;
        this.identityManager = identityManager;
        this.blipsCoreProvider = blipsCoreProvider;
        this.pushRegistrationProvider = pushRegistrationProvider;
        this.coreModule = coreModule;
        this.providerStore = providerStore;
    }

    private static boolean checkIdentityValid(Identity identity) {
        if (identity == null) {
            C33694Ix2.m101447l(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        } else if (!(identity instanceof AnonymousIdentity) && !(identity instanceof JwtIdentity)) {
            C33694Ix2.m101447l(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        } else if ((identity instanceof JwtIdentity) && C44504lS5.m27271d(((JwtIdentity) identity).getJwtUserIdentifier())) {
            C33694Ix2.m101447l(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    public void cleanupIfNewConfig(ApplicationConfiguration applicationConfiguration) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            this.pushRegistrationProvider.unregisterDevice(null);
        }
    }

    public CoreModule coreModule() {
        return this.coreModule;
    }

    public Identity getIdentity() {
        return this.identityManager.getIdentity();
    }

    public void init(ApplicationConfiguration applicationConfiguration, boolean z) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            C33694Ix2.m101457b(LOG_TAG, "SDK app config details have changed, cleaning up old config storage.", new Object[0]);
            this.storage.clear();
            this.storage.storeSdkHash(applicationConfiguration);
        } else if (z) {
            C33694Ix2.m101452g(LOG_TAG, "Zendesk is already initialized with these details, skipping.", new Object[0]);
            return;
        }
        this.blipsCoreProvider.coreInitialized();
    }

    public ProviderStore providers() {
        return this.providerStore;
    }

    public void reset() {
        this.pushRegistrationProvider.unregisterDevice(null);
        this.storage.getSessionStorage().clear();
        this.storage.clear();
    }

    public void setIdentity(Identity identity) {
        if (!checkIdentityValid(identity)) {
            return;
        }
        this.legacyIdentityMigrator.checkAndMigrateIdentity();
        if (this.identityManager.identityIsDifferent(identity)) {
            this.pushRegistrationProvider.unregisterDevice(null);
            this.storage.getSessionStorage().clear();
            this.identityManager.updateAndPersistIdentity(identity);
            return;
        }
        C33694Ix2.m101452g(LOG_TAG, "Zendesk is already initialized with this identity, skipping.", new Object[0]);
    }
}
