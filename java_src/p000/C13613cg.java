package p000;

import android.content.Context;
/* renamed from: cg */
/* loaded from: classes3.dex */
public final class C13613cg implements InterfaceC48812sj1<C12470bg> {

    /* renamed from: a */
    public final Y94<Context> f61027a;

    public C13613cg(Y94<Context> y94) {
        this.f61027a = y94;
    }

    /* renamed from: a */
    public static C13613cg m61075a(Y94<Context> y94) {
        return new C13613cg(y94);
    }

    /* renamed from: c */
    public static C12470bg m61073c(Context context) {
        return new C12470bg(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C12470bg get() {
        return m61073c(this.f61027a.get());
    }
}
