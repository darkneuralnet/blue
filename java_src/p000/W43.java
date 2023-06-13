package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: W43 */
/* loaded from: classes4.dex */
public final class W43 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f40374a;

    /* renamed from: b */
    public final Y94<Context> f40375b;

    /* renamed from: c */
    public final Y94<C22454gl> f40376c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f40377d;

    public W43(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f40374a = p43;
        this.f40375b = y94;
        this.f40376c = y942;
        this.f40377d = y943;
    }

    /* renamed from: a */
    public static W43 m78863a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new W43(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m78861c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90938h(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m78861c(this.f40374a, this.f40375b.get(), this.f40376c.get(), this.f40377d.get());
    }
}
