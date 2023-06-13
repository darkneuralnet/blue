package zendesk.core;
/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory */
/* loaded from: classes8.dex */
public final class C31160x5893b2b5 implements InterfaceC48812sj1<ZendeskUnauthorizedInterceptor> {
    private final Y94<IdentityManager> identityManagerProvider;
    private final Y94<SessionStorage> sessionStorageProvider;

    public C31160x5893b2b5(Y94<SessionStorage> y94, Y94<IdentityManager> y942) {
        this.sessionStorageProvider = y94;
        this.identityManagerProvider = y942;
    }

    public static C31160x5893b2b5 create(Y94<SessionStorage> y94, Y94<IdentityManager> y942) {
        return new C31160x5893b2b5(y94, y942);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, Object obj) {
        return (ZendeskUnauthorizedInterceptor) C51679xZ3.m5002e(ZendeskNetworkModule.provideZendeskUnauthorizedInterceptor(sessionStorage, (IdentityManager) obj));
    }

    @Override // p000.Y94
    public ZendeskUnauthorizedInterceptor get() {
        return provideZendeskUnauthorizedInterceptor(this.sessionStorageProvider.get(), this.identityManagerProvider.get());
    }
}
