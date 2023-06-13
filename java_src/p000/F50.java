package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: F50 */
/* loaded from: classes3.dex */
public final class F50 implements InterfaceC48812sj1<D50> {

    /* renamed from: a */
    public final Y94<InterfaceC46473om3> f8695a;

    /* renamed from: b */
    public final Y94<InterfaceC33193Gt5> f8696b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f8697c;

    /* renamed from: d */
    public final Y94<InterfaceC25660lE> f8698d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f8699e;

    /* renamed from: f */
    public final Y94<InterfaceC46066o50> f8700f;

    /* renamed from: g */
    public final Y94<C36207Tq4> f8701g;

    public F50(Y94<InterfaceC46473om3> y94, Y94<InterfaceC33193Gt5> y942, Y94<ScopeProvider> y943, Y94<InterfaceC25660lE> y944, Y94<InterfaceC40099e13> y945, Y94<InterfaceC46066o50> y946, Y94<C36207Tq4> y947) {
        this.f8695a = y94;
        this.f8696b = y942;
        this.f8697c = y943;
        this.f8698d = y944;
        this.f8699e = y945;
        this.f8700f = y946;
        this.f8701g = y947;
    }

    /* renamed from: a */
    public static F50 m107807a(Y94<InterfaceC46473om3> y94, Y94<InterfaceC33193Gt5> y942, Y94<ScopeProvider> y943, Y94<InterfaceC25660lE> y944, Y94<InterfaceC40099e13> y945, Y94<InterfaceC46066o50> y946, Y94<C36207Tq4> y947) {
        return new F50(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static D50 m107805c(InterfaceC46473om3 interfaceC46473om3, InterfaceC33193Gt5 interfaceC33193Gt5, ScopeProvider scopeProvider, InterfaceC25660lE interfaceC25660lE, InterfaceC40099e13 interfaceC40099e13, InterfaceC46066o50 interfaceC46066o50, C36207Tq4 c36207Tq4) {
        return new D50(interfaceC46473om3, interfaceC33193Gt5, scopeProvider, interfaceC25660lE, interfaceC40099e13, interfaceC46066o50, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public D50 get() {
        return m107805c(this.f8695a.get(), this.f8696b.get(), this.f8697c.get(), this.f8698d.get(), this.f8699e.get(), this.f8700f.get(), this.f8701g.get());
    }
}
