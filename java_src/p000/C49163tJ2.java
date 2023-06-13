package p000;

import android.content.Context;
/* renamed from: tJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49163tJ2 implements InterfaceC48812sj1<InterfaceC47825r30> {

    /* renamed from: a */
    public final VH2 f110281a;

    /* renamed from: b */
    public final Y94<InterfaceC47232q30> f110282b;

    /* renamed from: c */
    public final Y94<InterfaceC40001dr4> f110283c;

    /* renamed from: d */
    public final Y94<InterfaceC40476ef6> f110284d;

    /* renamed from: e */
    public final Y94<Context> f110285e;

    public C49163tJ2(VH2 vh2, Y94<InterfaceC47232q30> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC40476ef6> y943, Y94<Context> y944) {
        this.f110281a = vh2;
        this.f110282b = y94;
        this.f110283c = y942;
        this.f110284d = y943;
        this.f110285e = y944;
    }

    /* renamed from: a */
    public static C49163tJ2 m12517a(VH2 vh2, Y94<InterfaceC47232q30> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC40476ef6> y943, Y94<Context> y944) {
        return new C49163tJ2(vh2, y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static InterfaceC47825r30 m12515c(VH2 vh2, InterfaceC47232q30 interfaceC47232q30, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC40476ef6 interfaceC40476ef6, Context context) {
        return (InterfaceC47825r30) C51679xZ3.m5002e(vh2.m80022z0(interfaceC47232q30, interfaceC40001dr4, interfaceC40476ef6, context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47825r30 get() {
        return m12515c(this.f110281a, this.f110282b.get(), this.f110283c.get(), this.f110284d.get(), this.f110285e.get());
    }
}
