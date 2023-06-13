package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: W63 */
/* loaded from: classes4.dex */
public final class W63 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f40415a;

    /* renamed from: b */
    public final Y94<Context> f40416b;

    /* renamed from: c */
    public final Y94<C22454gl> f40417c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f40418d;

    public W63(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f40415a = p43;
        this.f40416b = y94;
        this.f40417c = y942;
        this.f40418d = y943;
    }

    /* renamed from: a */
    public static W63 m78828a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new W63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m78826c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90927k1(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m78826c(this.f40415a, this.f40416b.get(), this.f40417c.get(), this.f40418d.get());
    }
}
