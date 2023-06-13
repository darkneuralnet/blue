package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: Y63 */
/* loaded from: classes4.dex */
public final class Y63 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f44555a;

    /* renamed from: b */
    public final Y94<Context> f44556b;

    /* renamed from: c */
    public final Y94<C22454gl> f44557c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f44558d;

    public Y63(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f44555a = p43;
        this.f44556b = y94;
        this.f44557c = y942;
        this.f44558d = y943;
    }

    /* renamed from: a */
    public static Y63 m75703a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new Y63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m75701c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90921m1(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m75701c(this.f44555a, this.f44556b.get(), this.f44557c.get(), this.f44558d.get());
    }
}
