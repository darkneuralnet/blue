package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Gv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33209Gv3 implements InterfaceC48812sj1<C32273Cv3> {

    /* renamed from: a */
    public final Y94<InterfaceC46473om3> f12617a;

    /* renamed from: b */
    public final Y94<InterfaceC27246pJ> f12618b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f12619c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f12620d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f12621e;

    /* renamed from: f */
    public final Y94<InterfaceC36476Uu3> f12622f;

    /* renamed from: g */
    public final Y94<InterfaceC33443Hv3> f12623g;

    public C33209Gv3(Y94<InterfaceC46473om3> y94, Y94<InterfaceC27246pJ> y942, Y94<C36207Tq4> y943, Y94<ScopeProvider> y944, Y94<InterfaceC40099e13> y945, Y94<InterfaceC36476Uu3> y946, Y94<InterfaceC33443Hv3> y947) {
        this.f12617a = y94;
        this.f12618b = y942;
        this.f12619c = y943;
        this.f12620d = y944;
        this.f12621e = y945;
        this.f12622f = y946;
        this.f12623g = y947;
    }

    /* renamed from: a */
    public static C33209Gv3 m104585a(Y94<InterfaceC46473om3> y94, Y94<InterfaceC27246pJ> y942, Y94<C36207Tq4> y943, Y94<ScopeProvider> y944, Y94<InterfaceC40099e13> y945, Y94<InterfaceC36476Uu3> y946, Y94<InterfaceC33443Hv3> y947) {
        return new C33209Gv3(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C32273Cv3 m104583c(InterfaceC46473om3 interfaceC46473om3, InterfaceC27246pJ interfaceC27246pJ, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC36476Uu3 interfaceC36476Uu3, InterfaceC33443Hv3 interfaceC33443Hv3) {
        return new C32273Cv3(interfaceC46473om3, interfaceC27246pJ, c36207Tq4, scopeProvider, interfaceC40099e13, interfaceC36476Uu3, interfaceC33443Hv3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32273Cv3 get() {
        return m104583c(this.f12617a.get(), this.f12618b.get(), this.f12619c.get(), this.f12620d.get(), this.f12621e.get(), this.f12622f.get(), this.f12623g.get());
    }
}
