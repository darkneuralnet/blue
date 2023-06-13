package p000;

import android.content.Context;
import p000.MN4;
/* renamed from: t53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49033t53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f109816a;

    /* renamed from: b */
    public final Y94<Context> f109817b;

    /* renamed from: c */
    public final Y94<C22454gl> f109818c;

    /* renamed from: d */
    public final Y94<MN4.C5282b> f109819d;

    public C49033t53(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        this.f109816a = p43;
        this.f109817b = y94;
        this.f109818c = y942;
        this.f109819d = y943;
    }

    /* renamed from: a */
    public static C49033t53 m13139a(P43 p43, Y94<Context> y94, Y94<C22454gl> y942, Y94<MN4.C5282b> y943) {
        return new C49033t53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static MN4 m13137c(P43 p43, Context context, C22454gl c22454gl, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m91008E(context, c22454gl, c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m13137c(this.f109816a, this.f109817b.get(), this.f109818c.get(), this.f109819d.get());
    }
}
