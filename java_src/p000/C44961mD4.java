package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: mD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44961mD4 implements InterfaceC48812sj1<C44368lD4> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f97632a;

    /* renamed from: b */
    public final Y94<InterfaceC45554nD4> f97633b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f97634c;

    /* renamed from: d */
    public final Y94<InterfaceC38421bD4> f97635d;

    public C44961mD4(Y94<ScopeProvider> y94, Y94<InterfaceC45554nD4> y942, Y94<InterfaceC40099e13> y943, Y94<InterfaceC38421bD4> y944) {
        this.f97632a = y94;
        this.f97633b = y942;
        this.f97634c = y943;
        this.f97635d = y944;
    }

    /* renamed from: a */
    public static C44961mD4 m26001a(Y94<ScopeProvider> y94, Y94<InterfaceC45554nD4> y942, Y94<InterfaceC40099e13> y943, Y94<InterfaceC38421bD4> y944) {
        return new C44961mD4(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C44368lD4 m25999c(ScopeProvider scopeProvider, InterfaceC45554nD4 interfaceC45554nD4, InterfaceC40099e13 interfaceC40099e13, InterfaceC38421bD4 interfaceC38421bD4) {
        return new C44368lD4(scopeProvider, interfaceC45554nD4, interfaceC40099e13, interfaceC38421bD4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44368lD4 get() {
        return m25999c(this.f97632a.get(), this.f97633b.get(), this.f97634c.get(), this.f97635d.get());
    }
}
