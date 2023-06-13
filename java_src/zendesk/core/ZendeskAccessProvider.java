package zendesk.core;

import java.io.IOException;
/* loaded from: classes8.dex */
class ZendeskAccessProvider implements AccessProvider {
    private static final String LOG_TAG = "ZendeskAccessProvider";
    private final AccessService accessService;
    private final IdentityManager identityManager;

    public ZendeskAccessProvider(IdentityManager identityManager, AccessService accessService) {
        this.identityManager = identityManager;
        this.accessService = accessService;
    }

    @Override // zendesk.core.AccessProvider
    public HM4<AuthenticationResponse> getAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity) {
        C33694Ix2.m101457b(LOG_TAG, "Requesting an access token for anonymous identity.", new Object[0]);
        try {
            return this.accessService.getAuthTokenForAnonymous(new AuthenticationRequestWrapper(new ApiAnonymousIdentity(anonymousIdentity, this.identityManager.getSdkGuid()))).execute();
        } catch (IOException e) {
            C33694Ix2.m101455d(LOG_TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }

    @Override // zendesk.core.AccessProvider
    public HM4<AuthenticationResponse> getAuthTokenViaJwt(JwtIdentity jwtIdentity) {
        C33694Ix2.m101457b(LOG_TAG, "Requesting an access token for jwt identity.", new Object[0]);
        if (C44504lS5.m27271d(jwtIdentity.getJwtUserIdentifier())) {
            C33694Ix2.m101454e(LOG_TAG, AccessProvider.NO_JWT_ERROR_MESSAGE, new Object[0]);
            return null;
        }
        try {
            return this.accessService.getAuthTokenForJwt(new AuthenticationRequestWrapper(jwtIdentity)).execute();
        } catch (IOException e) {
            C33694Ix2.m101455d(LOG_TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }
}
