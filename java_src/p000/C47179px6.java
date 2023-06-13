package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: px6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47179px6 implements InterfaceC48812sj1<C45993nx6> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f104394a;

    /* renamed from: b */
    public final Y94<InterfaceC46473om3> f104395b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f104396c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f104397d;

    /* renamed from: e */
    public final Y94<InterfaceC47772qx6> f104398e;

    /* renamed from: f */
    public final Y94<DQ3> f104399f;

    public C47179px6(Y94<C36207Tq4> y94, Y94<InterfaceC46473om3> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40099e13> y944, Y94<InterfaceC47772qx6> y945, Y94<DQ3> y946) {
        this.f104394a = y94;
        this.f104395b = y942;
        this.f104396c = y943;
        this.f104397d = y944;
        this.f104398e = y945;
        this.f104399f = y946;
    }

    /* renamed from: a */
    public static C47179px6 m18382a(Y94<C36207Tq4> y94, Y94<InterfaceC46473om3> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40099e13> y944, Y94<InterfaceC47772qx6> y945, Y94<DQ3> y946) {
        return new C47179px6(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C45993nx6 m18380c(C36207Tq4 c36207Tq4, InterfaceC46473om3 interfaceC46473om3, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC47772qx6 interfaceC47772qx6, DQ3 dq3) {
        return new C45993nx6(c36207Tq4, interfaceC46473om3, scopeProvider, interfaceC40099e13, interfaceC47772qx6, dq3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45993nx6 get() {
        return m18380c(this.f104394a.get(), this.f104395b.get(), this.f104396c.get(), this.f104397d.get(), this.f104398e.get(), this.f104399f.get());
    }
}
