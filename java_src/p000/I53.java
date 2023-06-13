package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: I53 */
/* loaded from: classes4.dex */
public final class I53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f14473a;

    /* renamed from: b */
    public final Y94<Context> f14474b;

    /* renamed from: c */
    public final Y94<C22454gl> f14475c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f14476d;

    public I53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f14473a = p43;
        this.f14474b = y94;
        this.f14475c = y942;
        this.f14476d = y943;
    }

    /* renamed from: a */
    public static I53 m102981a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new I53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m102979c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90973T(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m102979c(this.f14473a, this.f14474b.get(), this.f14475c.get(), this.f14476d.get());
    }
}
