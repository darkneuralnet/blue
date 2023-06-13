package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: uE0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49709uE0 implements InterfaceC48812sj1<C47338qE0> {

    /* renamed from: a */
    public final Y94<InterfaceC20340fF> f111990a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f111991b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f111992c;

    /* renamed from: d */
    public final Y94<InterfaceC50301vE0> f111993d;

    public C49709uE0(Y94<InterfaceC20340fF> y94, Y94<InterfaceC40099e13> y942, Y94<ScopeProvider> y943, Y94<InterfaceC50301vE0> y944) {
        this.f111990a = y94;
        this.f111991b = y942;
        this.f111992c = y943;
        this.f111993d = y944;
    }

    /* renamed from: a */
    public static C49709uE0 m10538a(Y94<InterfaceC20340fF> y94, Y94<InterfaceC40099e13> y942, Y94<ScopeProvider> y943, Y94<InterfaceC50301vE0> y944) {
        return new C49709uE0(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C47338qE0 m10536c(InterfaceC20340fF interfaceC20340fF, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, InterfaceC50301vE0 interfaceC50301vE0) {
        return new C47338qE0(interfaceC20340fF, interfaceC40099e13, scopeProvider, interfaceC50301vE0);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C47338qE0 get() {
        return m10536c(this.f111990a.get(), this.f111991b.get(), this.f111992c.get(), this.f111993d.get());
    }
}
