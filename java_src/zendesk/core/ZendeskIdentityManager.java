package zendesk.core;

import java.util.Locale;
/* loaded from: classes8.dex */
class ZendeskIdentityManager implements IdentityManager {
    private static final String LOG_TAG = "ZendeskIdentityManager";
    private final IdentityStorage identityStorage;

    public ZendeskIdentityManager(IdentityStorage identityStorage) {
        this.identityStorage = identityStorage;
    }

    @Override // zendesk.core.IdentityManager
    public String getBlipsUuid() {
        String blipsUuid = this.identityStorage.getBlipsUuid();
        if (C44504lS5.m27271d(blipsUuid)) {
            return this.identityStorage.updateBlipsUuid();
        }
        return blipsUuid;
    }

    @Override // zendesk.core.IdentityManager
    public Identity getIdentity() {
        Identity identity = this.identityStorage.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
            anonymousIdentity.setSdkGuid(getSdkGuid());
            return anonymousIdentity;
        }
        return identity;
    }

    @Override // zendesk.core.IdentityManager
    public String getSdkGuid() {
        String uuid = this.identityStorage.getUuid();
        if (C44504lS5.m27271d(uuid)) {
            return this.identityStorage.updateSdkGuid();
        }
        return uuid;
    }

    @Override // zendesk.core.IdentityManager
    public String getStoredAccessTokenAsBearerToken() {
        AccessToken storedAccessToken = this.identityStorage.getStoredAccessToken();
        if (storedAccessToken != null) {
            return String.format(Locale.US, Constants.AUTHORIZATION_BEARER_FORMAT, storedAccessToken.getAccessToken());
        }
        C33694Ix2.m101447l(LOG_TAG, "There is no stored access token, have you initialised an identity and requested an access token?", new Object[0]);
        return null;
    }

    @Override // zendesk.core.IdentityManager
    public Long getUserId() {
        return this.identityStorage.getUserId();
    }

    @Override // zendesk.core.IdentityManager
    public boolean identityIsDifferent(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        if (identity2 != null && identity != null && identity2.equals(identity)) {
            return false;
        }
        return true;
    }

    @Override // zendesk.core.IdentityManager
    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken == null) {
            C33694Ix2.m101447l(LOG_TAG, "Access Token object was null, cannot store.", new Object[0]);
            return;
        }
        if (!C44504lS5.m27271d(accessToken.getAccessToken())) {
            this.identityStorage.storeAccessToken(accessToken);
        } else {
            C33694Ix2.m101447l(LOG_TAG, "Access token String was null or empty, cannot store.", new Object[0]);
        }
        String userId = accessToken.getUserId();
        if (C44504lS5.m27270e(userId)) {
            this.identityStorage.storeUserId(Long.valueOf(userId));
        } else {
            C33694Ix2.m101447l(LOG_TAG, "User ID String was null or empty, cannot store.", new Object[0]);
        }
    }

    @Override // zendesk.core.IdentityManager
    public Identity updateAndPersistIdentity(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        if (identity2 == null) {
            C33694Ix2.m101457b(LOG_TAG, "No previous identity set, storing identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        } else if (identity != null && identityIsDifferent(identity)) {
            C33694Ix2.m101457b(LOG_TAG, "Identity has changed, storing new identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        } else {
            return identity2;
        }
    }
}
