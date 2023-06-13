package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: b53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38343b53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f56909a;

    /* renamed from: b */
    public final Y94<Context> f56910b;

    /* renamed from: c */
    public final Y94<C22454gl> f56911c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f56912d;

    public C38343b53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f56909a = p43;
        this.f56910b = y94;
        this.f56911c = y942;
        this.f56912d = y943;
    }

    /* renamed from: a */
    public static C38343b53 m64987a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C38343b53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m64985c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90923m(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m64985c(this.f56909a, this.f56910b.get(), this.f56911c.get(), this.f56912d.get());
    }
}
