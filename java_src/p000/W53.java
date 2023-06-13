package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: W53 */
/* loaded from: classes4.dex */
public final class W53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f40395a;

    /* renamed from: b */
    public final Y94<Context> f40396b;

    /* renamed from: c */
    public final Y94<C22454gl> f40397c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f40398d;

    public W53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f40395a = p43;
        this.f40396b = y94;
        this.f40397c = y942;
        this.f40398d = y943;
    }

    /* renamed from: a */
    public static W53 m78849a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new W53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m78847c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90931j0(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m78847c(this.f40395a, this.f40396b.get(), this.f40397c.get(), this.f40398d.get());
    }
}
