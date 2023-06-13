package p000;

import android.content.Context;
/* renamed from: Ai0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31685Ai0 implements InterfaceC49405tj1<C52951zi0> {

    /* renamed from: a */
    public final Z94<Context> f964a;

    public C31685Ai0(Z94<Context> z94) {
        this.f964a = z94;
    }

    /* renamed from: a */
    public static C31685Ai0 m115383a(Z94<Context> z94) {
        return new C31685Ai0(z94);
    }

    /* renamed from: c */
    public static C52951zi0 m115381c(Context context) {
        return new C52951zi0(context);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C52951zi0 get() {
        return m115381c(this.f964a.get());
    }
}
