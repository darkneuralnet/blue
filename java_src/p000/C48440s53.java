package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: s53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48440s53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f108235a;

    /* renamed from: b */
    public final Y94<Context> f108236b;

    /* renamed from: c */
    public final Y94<C22454gl> f108237c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f108238d;

    public C48440s53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f108235a = p43;
        this.f108236b = y94;
        this.f108237c = y942;
        this.f108238d = y943;
    }

    /* renamed from: a */
    public static C48440s53 m14796a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C48440s53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m14794c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m91011D(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m14794c(this.f108235a, this.f108236b.get(), this.f108237c.get(), this.f108238d.get());
    }
}
