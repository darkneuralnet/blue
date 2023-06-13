package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: i73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42531i73 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f86774a;

    /* renamed from: b */
    public final Y94<Context> f86775b;

    /* renamed from: c */
    public final Y94<C22454gl> f86776c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f86777d;

    public C42531i73(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f86774a = p43;
        this.f86775b = y94;
        this.f86776c = y942;
        this.f86777d = y943;
    }

    /* renamed from: a */
    public static C42531i73 m34431a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C42531i73(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m34429c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90888x1(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m34429c(this.f86774a, this.f86775b.get(), this.f86776c.get(), this.f86777d.get());
    }
}
