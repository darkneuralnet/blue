package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: T7 */
/* loaded from: classes3.dex */
public final class C7660T7 implements InterfaceC48812sj1<C7333S7> {

    /* renamed from: a */
    public final Y94<InterfaceC8198U7> f34801a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f34802b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f34803c;

    /* renamed from: d */
    public final Y94<InterfaceC20340fF> f34804d;

    /* renamed from: e */
    public final Y94<InterfaceC1738E7> f34805e;

    public C7660T7(Y94<InterfaceC8198U7> y94, Y94<ScopeProvider> y942, Y94<InterfaceC40099e13> y943, Y94<InterfaceC20340fF> y944, Y94<InterfaceC1738E7> y945) {
        this.f34801a = y94;
        this.f34802b = y942;
        this.f34803c = y943;
        this.f34804d = y944;
        this.f34805e = y945;
    }

    /* renamed from: a */
    public static C7660T7 m84300a(Y94<InterfaceC8198U7> y94, Y94<ScopeProvider> y942, Y94<InterfaceC40099e13> y943, Y94<InterfaceC20340fF> y944, Y94<InterfaceC1738E7> y945) {
        return new C7660T7(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C7333S7 m84298c(InterfaceC8198U7 interfaceC8198U7, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC20340fF interfaceC20340fF, InterfaceC1738E7 interfaceC1738E7) {
        return new C7333S7(interfaceC8198U7, scopeProvider, interfaceC40099e13, interfaceC20340fF, interfaceC1738E7);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C7333S7 get() {
        return m84298c(this.f34801a.get(), this.f34802b.get(), this.f34803c.get(), this.f34804d.get(), this.f34805e.get());
    }
}
