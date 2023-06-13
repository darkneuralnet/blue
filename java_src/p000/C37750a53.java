package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: a53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37750a53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f49812a;

    /* renamed from: b */
    public final Y94<Context> f49813b;

    /* renamed from: c */
    public final Y94<C22454gl> f49814c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f49815d;

    public C37750a53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f49812a = p43;
        this.f49813b = y94;
        this.f49814c = y942;
        this.f49815d = y943;
    }

    /* renamed from: a */
    public static C37750a53 m71907a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C37750a53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m71905c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90926l(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m71905c(this.f49812a, this.f49813b.get(), this.f49814c.get(), this.f49815d.get());
    }
}
