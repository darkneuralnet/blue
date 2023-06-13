package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: e63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40149e63 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f77950a;

    /* renamed from: b */
    public final Y94<Context> f77951b;

    /* renamed from: c */
    public final Y94<C22454gl> f77952c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f77953d;

    public C40149e63(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f77950a = p43;
        this.f77951b = y94;
        this.f77952c = y942;
        this.f77953d = y943;
    }

    /* renamed from: a */
    public static C40149e63 m43280a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C40149e63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m43278c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90907r0(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m43278c(this.f77950a, this.f77951b.get(), this.f77952c.get(), this.f77953d.get());
    }
}
