package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: c53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38936c53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f60067a;

    /* renamed from: b */
    public final Y94<Context> f60068b;

    /* renamed from: c */
    public final Y94<C22454gl> f60069c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f60070d;

    public C38936c53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f60067a = p43;
        this.f60068b = y94;
        this.f60069c = y942;
        this.f60070d = y943;
    }

    /* renamed from: a */
    public static C38936c53 m61945a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C38936c53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m61943c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90920n(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m61943c(this.f60067a, this.f60068b.get(), this.f60069c.get(), this.f60070d.get());
    }
}
