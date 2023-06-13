package zendesk.core;

import android.content.Context;
/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory */
/* loaded from: classes8.dex */
public final class C31158x23150492 implements InterfaceC48812sj1<AcceptLanguageHeaderInterceptor> {
    private final Y94<Context> contextProvider;

    public C31158x23150492(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static C31158x23150492 create(Y94<Context> y94) {
        return new C31158x23150492(y94);
    }

    public static AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor(Context context) {
        return (AcceptLanguageHeaderInterceptor) C51679xZ3.m5002e(ZendeskNetworkModule.provideAcceptLanguageHeaderInterceptor(context));
    }

    @Override // p000.Y94
    public AcceptLanguageHeaderInterceptor get() {
        return provideAcceptLanguageHeaderInterceptor(this.contextProvider.get());
    }
}
