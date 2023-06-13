package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: f53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40732f53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f79417a;

    /* renamed from: b */
    public final Y94<Context> f79418b;

    /* renamed from: c */
    public final Y94<C22454gl> f79419c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f79420d;

    public C40732f53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f79417a = p43;
        this.f79418b = y94;
        this.f79419c = y942;
        this.f79420d = y943;
    }

    /* renamed from: a */
    public static C40732f53 m42104a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C40732f53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m42102c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90911q(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m42102c(this.f79417a, this.f79418b.get(), this.f79419c.get(), this.f79420d.get());
    }
}
