package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvideCachingInterceptorFactory implements InterfaceC48812sj1<CachingInterceptor> {
    private final Y94<BaseStorage> mediaCacheProvider;

    public ZendeskNetworkModule_ProvideCachingInterceptorFactory(Y94<BaseStorage> y94) {
        this.mediaCacheProvider = y94;
    }

    public static ZendeskNetworkModule_ProvideCachingInterceptorFactory create(Y94<BaseStorage> y94) {
        return new ZendeskNetworkModule_ProvideCachingInterceptorFactory(y94);
    }

    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return (CachingInterceptor) C51679xZ3.m5002e(ZendeskNetworkModule.provideCachingInterceptor(baseStorage));
    }

    @Override // p000.Y94
    public CachingInterceptor get() {
        return provideCachingInterceptor(this.mediaCacheProvider.get());
    }
}
