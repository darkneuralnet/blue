package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory implements InterfaceC48812sj1<ZendeskAuthHeaderInterceptor> {
    private final Y94<IdentityManager> identityManagerProvider;

    public ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(Y94<IdentityManager> y94) {
        this.identityManagerProvider = y94;
    }

    public static ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory create(Y94<IdentityManager> y94) {
        return new ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(y94);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(Object obj) {
        return (ZendeskAuthHeaderInterceptor) C51679xZ3.m5002e(ZendeskNetworkModule.provideAuthHeaderInterceptor((IdentityManager) obj));
    }

    @Override // p000.Y94
    public ZendeskAuthHeaderInterceptor get() {
        return provideAuthHeaderInterceptor(this.identityManagerProvider.get());
    }
}
