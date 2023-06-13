package zendesk.core;

import com.google.gson.JsonSyntaxException;
import zendesk.core.AnonymousIdentity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class LegacyIdentityMigrator {
    private static final String ANONYMOUS_EMAIL_KEY = "email";
    private static final String ANONYMOUS_NAME_KEY = "name";
    private static final String JWT_TOKEN_KEY = "token";
    private static final String LEGACY_ACCESS_TOKEN_KEY = "access_token";
    private static final String LEGACY_ACCESS_TOKEN_USER_ID_KEY = "user_id";
    private static final String LEGACY_IDENTITY_KEY = "zendesk-identity";
    private static final String LEGACY_IDENTITY_TYPE_KEY = "zendesk-identity-type";
    private static final String LEGACY_PUSH_DEVICE_ID_KEY = "identifier";
    private static final String LEGACY_PUSH_RESPONSE_KEY = "pushRegResponseIdentifier";
    private static final String LEGACY_SDK_GUID_KEY = "uuid";
    private static final String LEGACY_STORED_TOKEN_KEY = "stored_token";
    private static final String LEGACY_USER_ID_KEY = "user_id";
    private static final String LOG_TAG = "LegacyIdentityStorage";
    private IdentityManager identityManager;
    private IdentityStorage identityStorage;
    private SharedPreferencesStorage legacyIdentityStorage;
    private SharedPreferencesStorage legacyPushStorage;
    private PushDeviceIdStorage pushDeviceIdStorage;

    /* renamed from: zendesk.core.LegacyIdentityMigrator$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C311451 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$AuthenticationType;

        static {
            int[] iArr = new int[AuthenticationType.values().length];
            $SwitchMap$zendesk$core$AuthenticationType = iArr;
            try {
                iArr[AuthenticationType.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$AuthenticationType[AuthenticationType.JWT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LegacyIdentityMigrator(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage, IdentityManager identityManager, PushDeviceIdStorage pushDeviceIdStorage) {
        this.legacyIdentityStorage = sharedPreferencesStorage;
        this.legacyPushStorage = sharedPreferencesStorage2;
        this.identityStorage = identityStorage;
        this.identityManager = identityManager;
        this.pushDeviceIdStorage = pushDeviceIdStorage;
    }

    private void clear() {
        this.legacyIdentityStorage.remove(LEGACY_IDENTITY_TYPE_KEY);
        this.legacyIdentityStorage.remove(LEGACY_IDENTITY_KEY);
        this.legacyIdentityStorage.remove(LEGACY_STORED_TOKEN_KEY);
        this.legacyIdentityStorage.remove(LEGACY_SDK_GUID_KEY);
        this.legacyIdentityStorage.remove("user_id");
        this.legacyPushStorage.remove(LEGACY_PUSH_RESPONSE_KEY);
    }

    private AccessToken getLegacyAccessToken() {
        String str = this.legacyIdentityStorage.get(LEGACY_STORED_TOKEN_KEY);
        if (C44504lS5.m27271d(str)) {
            return null;
        }
        try {
            AbstractC52360yi2 m77960a = new C36835Wi2().m77960a(str);
            if (m77960a != null && m77960a.m2879u()) {
                C36133Ti2 m2885e = m77960a.m2885e();
                AbstractC52360yi2 m83135y = m2885e.m83135y(LEGACY_ACCESS_TOKEN_KEY);
                AbstractC52360yi2 m83135y2 = m2885e.m83135y("user_id");
                if (m83135y != null && m83135y2 != null) {
                    return new AccessToken(m83135y.mo2882j(), m83135y2.mo2882j());
                }
            }
            return null;
        } catch (JsonSyntaxException e) {
            C33694Ix2.m101448k(LOG_TAG, "Unable to read legacy AccessToken.", e, new Object[0]);
            return null;
        }
    }

    private Identity getLegacyIdentity() {
        AuthenticationType legacyIdentityType = getLegacyIdentityType();
        if (legacyIdentityType == null) {
            return null;
        }
        int i = C311451.$SwitchMap$zendesk$core$AuthenticationType[legacyIdentityType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return readLegacyJwtIdentity();
        }
        return readLegacyAnonymousIdentity();
    }

    private AuthenticationType getLegacyIdentityType() {
        return AuthenticationType.getAuthType(this.legacyIdentityStorage.get(LEGACY_IDENTITY_TYPE_KEY));
    }

    private String getLegacyPushId() {
        AbstractC52360yi2 m83135y;
        String str = this.legacyPushStorage.get(LEGACY_PUSH_RESPONSE_KEY);
        if (C44504lS5.m27273b(str)) {
            try {
                AbstractC52360yi2 m77960a = new C36835Wi2().m77960a(str);
                if (m77960a != null && m77960a.m2879u() && (m83135y = m77960a.m2885e().m83135y(LEGACY_PUSH_DEVICE_ID_KEY)) != null) {
                    return m83135y.mo2882j();
                }
            } catch (JsonSyntaxException e) {
                C33694Ix2.m101448k(LOG_TAG, "Unable to read legacy push device ID.", e, new Object[0]);
            }
        }
        return null;
    }

    private String getLegacySdkGuid() {
        return this.legacyIdentityStorage.get(LEGACY_SDK_GUID_KEY);
    }

    private long getLegacyUserId() {
        return this.legacyIdentityStorage.getLong("user_id");
    }

    private AnonymousIdentity readLegacyAnonymousIdentity() {
        String str = this.legacyIdentityStorage.get(LEGACY_IDENTITY_KEY);
        if (C44504lS5.m27271d(str)) {
            return null;
        }
        try {
            AbstractC52360yi2 m77960a = new C36835Wi2().m77960a(str);
            if (m77960a != null && m77960a.m2879u()) {
                C36133Ti2 m2885e = m77960a.m2885e();
                AnonymousIdentity.Builder builder = new AnonymousIdentity.Builder();
                AbstractC52360yi2 m83135y = m2885e.m83135y("email");
                if (m83135y != null) {
                    builder.withEmailIdentifier(m83135y.mo2882j());
                }
                AbstractC52360yi2 m83135y2 = m2885e.m83135y("name");
                if (m83135y2 != null) {
                    builder.withNameIdentifier(m83135y2.mo2882j());
                }
                return (AnonymousIdentity) builder.build();
            }
            return null;
        } catch (JsonSyntaxException e) {
            C33694Ix2.m101448k(LOG_TAG, "Unable to read legacy AnonymousIdentity.", e, new Object[0]);
            return null;
        }
    }

    private JwtIdentity readLegacyJwtIdentity() {
        C36133Ti2 m2885e;
        AbstractC52360yi2 m83135y;
        String str = this.legacyIdentityStorage.get(LEGACY_IDENTITY_KEY);
        if (C44504lS5.m27271d(str)) {
            return null;
        }
        try {
            AbstractC52360yi2 m77960a = new C36835Wi2().m77960a(str);
            if (m77960a == null || (m2885e = m77960a.m2885e()) == null || (m83135y = m2885e.m83135y(JWT_TOKEN_KEY)) == null) {
                return null;
            }
            return new JwtIdentity(m83135y.mo2882j());
        } catch (JsonSyntaxException e) {
            C33694Ix2.m101448k(LOG_TAG, "Unable to read legacy JwtIdentity.", e, new Object[0]);
            return null;
        }
    }

    public void checkAndMigrateIdentity() {
        Identity legacyIdentity = getLegacyIdentity();
        if (legacyIdentity == null) {
            return;
        }
        this.identityStorage.storeIdentity(legacyIdentity);
        long legacyUserId = getLegacyUserId();
        if (legacyUserId != 0) {
            this.identityStorage.storeUserId(Long.valueOf(legacyUserId));
        }
        AccessToken legacyAccessToken = getLegacyAccessToken();
        if (legacyAccessToken != null) {
            this.identityManager.storeAccessToken(legacyAccessToken);
        }
        if (getLegacyIdentityType() == AuthenticationType.ANONYMOUS) {
            String legacySdkGuid = getLegacySdkGuid();
            if (C44504lS5.m27273b(legacySdkGuid)) {
                this.identityStorage.storeSdkGuid(legacySdkGuid);
            }
        }
        String legacyPushId = getLegacyPushId();
        if (C44504lS5.m27273b(legacyPushId)) {
            this.pushDeviceIdStorage.storeRegisteredDeviceId(legacyPushId);
        }
        clear();
    }
}
