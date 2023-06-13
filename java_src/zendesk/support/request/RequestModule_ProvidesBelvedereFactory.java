package zendesk.support.request;

import android.content.Context;
import zendesk.belvedere.C31096a;
/* loaded from: classes8.dex */
public final class RequestModule_ProvidesBelvedereFactory implements InterfaceC48812sj1<C31096a> {
    private final Y94<Context> contextProvider;

    public RequestModule_ProvidesBelvedereFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static RequestModule_ProvidesBelvedereFactory create(Y94<Context> y94) {
        return new RequestModule_ProvidesBelvedereFactory(y94);
    }

    public static C31096a providesBelvedere(Context context) {
        return (C31096a) C51679xZ3.m5002e(RequestModule.providesBelvedere(context));
    }

    @Override // p000.Y94
    public C31096a get() {
        return providesBelvedere(this.contextProvider.get());
    }
}
