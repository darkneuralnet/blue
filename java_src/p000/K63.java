package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: K63 */
/* loaded from: classes4.dex */
public final class K63 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f19082a;

    /* renamed from: b */
    public final Y94<Context> f19083b;

    /* renamed from: c */
    public final Y94<C22454gl> f19084c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f19085d;

    public K63(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f19082a = p43;
        this.f19083b = y94;
        this.f19084c = y942;
        this.f19085d = y943;
    }

    /* renamed from: a */
    public static K63 m99233a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new K63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m99231c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90962Y0(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m99231c(this.f19082a, this.f19083b.get(), this.f19084c.get(), this.f19085d.get());
    }
}
