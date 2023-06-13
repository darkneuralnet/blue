package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: g63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41335g63 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f81608a;

    /* renamed from: b */
    public final Y94<Context> f81609b;

    /* renamed from: c */
    public final Y94<C22454gl> f81610c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f81611d;

    public C41335g63(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f81608a = p43;
        this.f81609b = y94;
        this.f81610c = y942;
        this.f81611d = y943;
    }

    /* renamed from: a */
    public static C41335g63 m40066a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C41335g63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m40064c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90901t0(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m40064c(this.f81608a, this.f81609b.get(), this.f81610c.get(), this.f81611d.get());
    }
}
