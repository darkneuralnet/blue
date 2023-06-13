package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: aG4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37855aG4 implements InterfaceC48812sj1<ZF4> {

    /* renamed from: a */
    public final Y94<C43038iy6> f50201a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f50202b;

    /* renamed from: c */
    public final Y94<InterfaceC38448bG4> f50203c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f50204d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f50205e;

    /* renamed from: f */
    public final Y94<DQ3> f50206f;

    public C37855aG4(Y94<C43038iy6> y94, Y94<C36207Tq4> y942, Y94<InterfaceC38448bG4> y943, Y94<ScopeProvider> y944, Y94<InterfaceC40099e13> y945, Y94<DQ3> y946) {
        this.f50201a = y94;
        this.f50202b = y942;
        this.f50203c = y943;
        this.f50204d = y944;
        this.f50205e = y945;
        this.f50206f = y946;
    }

    /* renamed from: a */
    public static C37855aG4 m71720a(Y94<C43038iy6> y94, Y94<C36207Tq4> y942, Y94<InterfaceC38448bG4> y943, Y94<ScopeProvider> y944, Y94<InterfaceC40099e13> y945, Y94<DQ3> y946) {
        return new C37855aG4(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static ZF4 m71718c(C43038iy6 c43038iy6, C36207Tq4 c36207Tq4, InterfaceC38448bG4 interfaceC38448bG4, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return new ZF4(c43038iy6, c36207Tq4, interfaceC38448bG4, scopeProvider, interfaceC40099e13, dq3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ZF4 get() {
        return m71718c(this.f50201a.get(), this.f50202b.get(), this.f50203c.get(), this.f50204d.get(), this.f50205e.get(), this.f50206f.get());
    }
}
