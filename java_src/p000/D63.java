package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: D63 */
/* loaded from: classes4.dex */
public final class D63 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f5254a;

    /* renamed from: b */
    public final Y94<Context> f5255b;

    /* renamed from: c */
    public final Y94<C22454gl> f5256c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f5257d;

    public D63(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f5254a = p43;
        this.f5255b = y94;
        this.f5256c = y942;
        this.f5257d = y943;
    }

    /* renamed from: a */
    public static D63 m110909a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new D63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m110907c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90976R0(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m110907c(this.f5254a, this.f5255b.get(), this.f5256c.get(), this.f5257d.get());
    }
}
