package zendesk.core;

import java.util.UUID;
/* loaded from: classes8.dex */
class ZendeskIdentityStorage implements IdentityStorage {
    static final String BLIPS_UUID_KEY = "blips_buid";
    static final String IDENTITY_KEY = "zendesk-identity";
    static final String IDENTITY_TYPE_KEY = "zendesk-identity-type";
    static final String LOG_TAG = "ZendeskIdentityStorage";
    static final String TOKEN_KEY = "stored_token";
    static final String USER_ID_KEY = "user_id";
    static final String UUID_KEY = "uuid";
    private final BaseStorage identityStorage;

    /* renamed from: zendesk.core.ZendeskIdentityStorage$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C311541 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$AuthenticationType;

        static {
            int[] iArr = new int[AuthenticationType.values().length];
            $SwitchMap$zendesk$core$AuthenticationType = iArr;
            try {
                iArr[AuthenticationType.JWT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$AuthenticationType[AuthenticationType.ANONYMOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ZendeskIdentityStorage(BaseStorage baseStorage) {
        this.identityStorage = baseStorage;
    }

    @Override // zendesk.core.IdentityStorage
    public void clear() {
        this.identityStorage.clear();
    }

    @Override // zendesk.core.IdentityStorage
    public String getBlipsUuid() {
        return this.identityStorage.get(BLIPS_UUID_KEY);
    }

    @Override // zendesk.core.IdentityStorage
    public Identity getIdentity() {
        AuthenticationType authType;
        String str = this.identityStorage.get(IDENTITY_TYPE_KEY);
        if (C44504lS5.m27273b(str) && (authType = AuthenticationType.getAuthType(str)) != null) {
            int i = C311541.$SwitchMap$zendesk$core$AuthenticationType[authType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C33694Ix2.m101457b(LOG_TAG, "Loading Anonymous identity", new Object[0]);
                    return (Identity) this.identityStorage.get(IDENTITY_KEY, AnonymousIdentity.class);
                }
            } else {
                C33694Ix2.m101457b(LOG_TAG, "Loading Jwt identity", new Object[0]);
                return (Identity) this.identityStorage.get(IDENTITY_KEY, JwtIdentity.class);
            }
        }
        return null;
    }

    @Override // zendesk.core.IdentityStorage
    public AccessToken getStoredAccessToken() {
        return (AccessToken) this.identityStorage.get(TOKEN_KEY, AccessToken.class);
    }

    @Override // zendesk.core.IdentityStorage
    public Long getUserId() {
        return (Long) this.identityStorage.get(USER_ID_KEY, Long.class);
    }

    @Override // zendesk.core.IdentityStorage
    public String getUuid() {
        C33694Ix2.m101457b(LOG_TAG, "Fetching UUID from preferences store", new Object[0]);
        String str = this.identityStorage.get(UUID_KEY);
        if (C44504lS5.m27271d(str)) {
            return "";
        }
        return str;
    }

    @Override // zendesk.core.IdentityStorage
    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken != null) {
            this.identityStorage.put(TOKEN_KEY, accessToken);
        }
    }

    @Override // zendesk.core.IdentityStorage
    public void storeIdentity(Identity identity) {
        String str;
        if (identity == null) {
            C33694Ix2.m101454e(LOG_TAG, "identity is null, will not store the identity", new Object[0]);
            return;
        }
        if (identity instanceof AnonymousIdentity) {
            C33694Ix2.m101457b(LOG_TAG, "Storing anonymous identity", new Object[0]);
            str = AuthenticationType.ANONYMOUS.getAuthenticationType();
        } else if (identity instanceof JwtIdentity) {
            C33694Ix2.m101457b(LOG_TAG, "Storing jwt identity", new Object[0]);
            str = AuthenticationType.JWT.getAuthenticationType();
        } else {
            C33694Ix2.m101454e(LOG_TAG, "Unknown authentication type, identity will not be stored", new Object[0]);
            str = null;
        }
        if (str != null) {
            this.identityStorage.put(IDENTITY_KEY, identity);
            this.identityStorage.put(IDENTITY_TYPE_KEY, str);
        }
    }

    @Override // zendesk.core.IdentityStorage
    public void storeSdkGuid(String str) {
        C33694Ix2.m101457b(LOG_TAG, "Storing new UUID in preference store", new Object[0]);
        this.identityStorage.put(UUID_KEY, str);
    }

    @Override // zendesk.core.IdentityStorage
    public void storeUserId(Long l) {
        if (l != null) {
            this.identityStorage.put(USER_ID_KEY, l);
        }
    }

    @Override // zendesk.core.IdentityStorage
    public String updateBlipsUuid() {
        String uuid = UUID.randomUUID().toString();
        C33694Ix2.m101457b(LOG_TAG, "Generate new Blips BUID", new Object[0]);
        this.identityStorage.put(BLIPS_UUID_KEY, uuid);
        return uuid;
    }

    @Override // zendesk.core.IdentityStorage
    public String updateSdkGuid() {
        String uuid = UUID.randomUUID().toString();
        storeSdkGuid(uuid);
        return uuid;
    }
}
