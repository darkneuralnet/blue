package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory implements InterfaceC48812sj1<UserAgentAndClientHeadersInterceptor> {
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule) {
        this.module = zendeskNetworkModule;
    }

    public static ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule) {
        return new ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(zendeskNetworkModule);
    }

    public static UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor(ZendeskNetworkModule zendeskNetworkModule) {
        return (UserAgentAndClientHeadersInterceptor) C51679xZ3.m5002e(zendeskNetworkModule.providesUserAgentHeaderInterceptor());
    }

    @Override // p000.Y94
    public UserAgentAndClientHeadersInterceptor get() {
        return providesUserAgentHeaderInterceptor(this.module);
    }
}
