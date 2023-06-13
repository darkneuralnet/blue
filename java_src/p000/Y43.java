package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: Y43 */
/* loaded from: classes4.dex */
public final class Y43 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f44496a;

    /* renamed from: b */
    public final Y94<Context> f44497b;

    /* renamed from: c */
    public final Y94<C22454gl> f44498c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f44499d;

    public Y43(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f44496a = p43;
        this.f44497b = y94;
        this.f44498c = y942;
        this.f44499d = y943;
    }

    /* renamed from: a */
    public static Y43 m75780a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new Y43(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m75778c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90932j(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m75778c(this.f44496a, this.f44497b.get(), this.f44498c.get(), this.f44499d.get());
    }
}
