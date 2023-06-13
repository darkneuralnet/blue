package p000;

import android.content.Context;
/* renamed from: rF */
/* loaded from: classes3.dex */
public final class C27889rF implements InterfaceC48812sj1<C27561qF> {

    /* renamed from: a */
    public final Y94<Context> f106758a;

    public C27889rF(Y94<Context> y94) {
        this.f106758a = y94;
    }

    /* renamed from: a */
    public static C27889rF m16161a(Y94<Context> y94) {
        return new C27889rF(y94);
    }

    /* renamed from: c */
    public static C27561qF m16159c(Context context) {
        return new C27561qF(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C27561qF get() {
        return m16159c(this.f106758a.get());
    }
}
