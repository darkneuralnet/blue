package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: F63 */
/* loaded from: classes4.dex */
public final class F63 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f8748a;

    /* renamed from: b */
    public final Y94<Context> f8749b;

    /* renamed from: c */
    public final Y94<C22454gl> f8750c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f8751d;

    public F63(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f8748a = p43;
        this.f8749b = y94;
        this.f8750c = y942;
        this.f8751d = y943;
    }

    /* renamed from: a */
    public static F63 m107743a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new F63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m107741c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90972T0(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m107741c(this.f8748a, this.f8749b.get(), this.f8750c.get(), this.f8751d.get());
    }
}
