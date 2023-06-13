package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory implements InterfaceC48812sj1<AcceptHeaderInterceptor> {

    /* loaded from: classes8.dex */
    public static final class InstanceHolder {
        private static final ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory INSTANCE = new ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return (AcceptHeaderInterceptor) C51679xZ3.m5002e(ZendeskNetworkModule.providesAcceptHeaderInterceptor());
    }

    @Override // p000.Y94
    public AcceptHeaderInterceptor get() {
        return providesAcceptHeaderInterceptor();
    }
}
