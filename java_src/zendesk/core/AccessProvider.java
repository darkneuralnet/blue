package zendesk.core;
/* loaded from: classes8.dex */
interface AccessProvider {
    public static final String NO_JWT_ERROR_MESSAGE = "The jwt user identifier is null or empty. We cannot proceed to get an access token";

    HM4<AuthenticationResponse> getAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity);

    HM4<AuthenticationResponse> getAuthTokenViaJwt(JwtIdentity jwtIdentity);
}
