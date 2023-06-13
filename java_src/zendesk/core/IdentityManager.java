package zendesk.core;
/* loaded from: classes8.dex */
interface IdentityManager {
    String getBlipsUuid();

    Identity getIdentity();

    String getSdkGuid();

    String getStoredAccessTokenAsBearerToken();

    Long getUserId();

    boolean identityIsDifferent(Identity identity);

    void storeAccessToken(AccessToken accessToken);

    Identity updateAndPersistIdentity(Identity identity);
}
