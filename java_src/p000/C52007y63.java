package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: y63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52007y63 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f118752a;

    /* renamed from: b */
    public final Y94<Context> f118753b;

    /* renamed from: c */
    public final Y94<C22454gl> f118754c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f118755d;

    public C52007y63(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f118752a = p43;
        this.f118753b = y94;
        this.f118754c = y942;
        this.f118755d = y943;
    }

    /* renamed from: a */
    public static C52007y63 m4140a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C52007y63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m4138c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90986M0(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m4138c(this.f118752a, this.f118753b.get(), this.f118754c.get(), this.f118755d.get());
    }
}