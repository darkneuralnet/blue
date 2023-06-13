package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetAuthenticationProviderFactory implements InterfaceC48812sj1<AuthenticationProvider> {
    private final CoreModule module;

    public CoreModule_GetAuthenticationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetAuthenticationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetAuthenticationProviderFactory(coreModule);
    }

    public static AuthenticationProvider getAuthenticationProvider(CoreModule coreModule) {
        return (AuthenticationProvider) C51679xZ3.m5002e(coreModule.getAuthenticationProvider());
    }

    @Override // p000.Y94
    public AuthenticationProvider get() {
        return getAuthenticationProvider(this.module);
    }
}
