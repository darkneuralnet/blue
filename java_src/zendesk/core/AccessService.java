package zendesk.core;
/* loaded from: classes8.dex */
interface AccessService {
    @AD3("/access/sdk/anonymous")
    InterfaceC51431x80<AuthenticationResponse> getAuthTokenForAnonymous(@InterfaceC6404PY AuthenticationRequestWrapper authenticationRequestWrapper);

    @AD3("/access/sdk/jwt")
    InterfaceC51431x80<AuthenticationResponse> getAuthTokenForJwt(@InterfaceC6404PY AuthenticationRequestWrapper authenticationRequestWrapper);
}
