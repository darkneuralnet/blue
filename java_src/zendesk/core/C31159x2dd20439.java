package zendesk.core;
/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory */
/* loaded from: classes8.dex */
public final class C31159x2dd20439 implements InterfaceC48812sj1<ZendeskOauthIdHeaderInterceptor> {
    private final Y94<ApplicationConfiguration> configurationProvider;
    private final ZendeskNetworkModule module;

    public C31159x2dd20439(ZendeskNetworkModule zendeskNetworkModule, Y94<ApplicationConfiguration> y94) {
        this.module = zendeskNetworkModule;
        this.configurationProvider = y94;
    }

    public static C31159x2dd20439 create(ZendeskNetworkModule zendeskNetworkModule, Y94<ApplicationConfiguration> y94) {
        return new C31159x2dd20439(zendeskNetworkModule, y94);
    }

    public static ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ZendeskNetworkModule zendeskNetworkModule, ApplicationConfiguration applicationConfiguration) {
        return (ZendeskOauthIdHeaderInterceptor) C51679xZ3.m5002e(zendeskNetworkModule.provideZendeskBasicHeadersInterceptor(applicationConfiguration));
    }

    @Override // p000.Y94
    public ZendeskOauthIdHeaderInterceptor get() {
        return provideZendeskBasicHeadersInterceptor(this.module, this.configurationProvider.get());
    }
}
