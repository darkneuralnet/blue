package p000;

import android.content.Context;
/* renamed from: wM3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50969wM3 implements InterfaceC48812sj1<C50376vM3> {

    /* renamed from: a */
    public final Y94<Context> f115863a;

    /* renamed from: b */
    public final Y94<InterfaceC35660Rh6> f115864b;

    /* renamed from: c */
    public final Y94<AM3> f115865c;

    /* renamed from: d */
    public final Y94<BS5> f115866d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f115867e;

    /* renamed from: f */
    public final Y94<InterfaceC6097Oh> f115868f;

    public C50969wM3(Y94<Context> y94, Y94<InterfaceC35660Rh6> y942, Y94<AM3> y943, Y94<BS5> y944, Y94<C36207Tq4> y945, Y94<InterfaceC6097Oh> y946) {
        this.f115863a = y94;
        this.f115864b = y942;
        this.f115865c = y943;
        this.f115866d = y944;
        this.f115867e = y945;
        this.f115868f = y946;
    }

    /* renamed from: a */
    public static C50969wM3 m6973a(Y94<Context> y94, Y94<InterfaceC35660Rh6> y942, Y94<AM3> y943, Y94<BS5> y944, Y94<C36207Tq4> y945, Y94<InterfaceC6097Oh> y946) {
        return new C50969wM3(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C50376vM3 m6971c(Context context, InterfaceC35660Rh6 interfaceC35660Rh6, AM3 am3, BS5 bs5, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh) {
        return new C50376vM3(context, interfaceC35660Rh6, am3, bs5, c36207Tq4, interfaceC6097Oh);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C50376vM3 get() {
        return m6971c(this.f115863a.get(), this.f115864b.get(), this.f115865c.get(), this.f115866d.get(), this.f115867e.get(), this.f115868f.get());
    }
}
