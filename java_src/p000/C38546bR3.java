package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
/* renamed from: bR3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38546bR3 implements InterfaceC48812sj1<C37953aR3> {

    /* renamed from: a */
    public final Y94<InterfaceC49820uQ3> f57489a;

    /* renamed from: b */
    public final Y94<LifecycleScopeProvider<EnumC7097RE>> f57490b;

    /* renamed from: c */
    public final Y94<InterfaceC40342eR3> f57491c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f57492d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f57493e;

    /* renamed from: f */
    public final Y94<DQ3> f57494f;

    /* renamed from: g */
    public final Y94<Observable<Boolean>> f57495g;

    /* renamed from: h */
    public final Y94<Observable<Boolean>> f57496h;

    public C38546bR3(Y94<InterfaceC49820uQ3> y94, Y94<LifecycleScopeProvider<EnumC7097RE>> y942, Y94<InterfaceC40342eR3> y943, Y94<C36207Tq4> y944, Y94<InterfaceC40099e13> y945, Y94<DQ3> y946, Y94<Observable<Boolean>> y947, Y94<Observable<Boolean>> y948) {
        this.f57489a = y94;
        this.f57490b = y942;
        this.f57491c = y943;
        this.f57492d = y944;
        this.f57493e = y945;
        this.f57494f = y946;
        this.f57495g = y947;
        this.f57496h = y948;
    }

    /* renamed from: a */
    public static C38546bR3 m64534a(Y94<InterfaceC49820uQ3> y94, Y94<LifecycleScopeProvider<EnumC7097RE>> y942, Y94<InterfaceC40342eR3> y943, Y94<C36207Tq4> y944, Y94<InterfaceC40099e13> y945, Y94<DQ3> y946, Y94<Observable<Boolean>> y947, Y94<Observable<Boolean>> y948) {
        return new C38546bR3(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C37953aR3 m64532c(InterfaceC49820uQ3 interfaceC49820uQ3, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40342eR3 interfaceC40342eR3, C36207Tq4 c36207Tq4, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3, Observable<Boolean> observable, Observable<Boolean> observable2) {
        return new C37953aR3(interfaceC49820uQ3, lifecycleScopeProvider, interfaceC40342eR3, c36207Tq4, interfaceC40099e13, dq3, observable, observable2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C37953aR3 get() {
        return m64532c(this.f57489a.get(), this.f57490b.get(), this.f57491c.get(), this.f57492d.get(), this.f57493e.get(), this.f57494f.get(), this.f57495g.get(), this.f57496h.get());
    }
}
