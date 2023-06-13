package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: p53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46662p53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f103119a;

    /* renamed from: b */
    public final Y94<Context> f103120b;

    /* renamed from: c */
    public final Y94<C22454gl> f103121c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f103122d;

    public C46662p53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f103119a = p43;
        this.f103120b = y94;
        this.f103121c = y942;
        this.f103122d = y943;
    }

    /* renamed from: a */
    public static C46662p53 m19977a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C46662p53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m19975c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m91020A(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m19975c(this.f103119a, this.f103120b.get(), this.f103121c.get(), this.f103122d.get());
    }
}
