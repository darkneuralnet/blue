package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: WO */
/* loaded from: classes2.dex */
public final class C9014WO implements InterfaceC48812sj1<C8642VO> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f40929a;

    /* renamed from: b */
    public final Y94<InterfaceC9408XO> f40930b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f40931c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f40932d;

    /* renamed from: e */
    public final Y94<InterfaceC1880Ea> f40933e;

    public C9014WO(Y94<ScopeProvider> y94, Y94<InterfaceC9408XO> y942, Y94<InterfaceC40099e13> y943, Y94<C36207Tq4> y944, Y94<InterfaceC1880Ea> y945) {
        this.f40929a = y94;
        this.f40930b = y942;
        this.f40931c = y943;
        this.f40932d = y944;
        this.f40933e = y945;
    }

    /* renamed from: a */
    public static C9014WO m78504a(Y94<ScopeProvider> y94, Y94<InterfaceC9408XO> y942, Y94<InterfaceC40099e13> y943, Y94<C36207Tq4> y944, Y94<InterfaceC1880Ea> y945) {
        return new C9014WO(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C8642VO m78502c(ScopeProvider scopeProvider, InterfaceC9408XO interfaceC9408XO, InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea) {
        return new C8642VO(scopeProvider, interfaceC9408XO, interfaceC40099e13, c36207Tq4, interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C8642VO get() {
        return m78502c(this.f40929a.get(), this.f40930b.get(), this.f40931c.get(), this.f40932d.get(), this.f40933e.get());
    }
}
