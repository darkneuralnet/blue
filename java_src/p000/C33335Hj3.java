package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: Hj3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33335Hj3 {

    /* renamed from: a */
    public final Y94<InterfaceC12495bn> f13799a;

    /* renamed from: b */
    public final Y94<InterfaceC46473om3> f13800b;

    /* renamed from: c */
    public final Y94<InterfaceC46545ot5> f13801c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f13802d;

    /* renamed from: e */
    public final Y94<InterfaceC32282Cw3> f13803e;

    /* renamed from: f */
    public final Y94<C7540Sm> f13804f;

    /* renamed from: g */
    public final Y94<InterfaceC40099e13> f13805g;

    public C33335Hj3(Y94<InterfaceC12495bn> y94, Y94<InterfaceC46473om3> y942, Y94<InterfaceC46545ot5> y943, Y94<C36207Tq4> y944, Y94<InterfaceC32282Cw3> y945, Y94<C7540Sm> y946, Y94<InterfaceC40099e13> y947) {
        this.f13799a = y94;
        this.f13800b = y942;
        this.f13801c = y943;
        this.f13802d = y944;
        this.f13803e = y945;
        this.f13804f = y946;
        this.f13805g = y947;
    }

    /* renamed from: a */
    public static C33335Hj3 m103490a(Y94<InterfaceC12495bn> y94, Y94<InterfaceC46473om3> y942, Y94<InterfaceC46545ot5> y943, Y94<C36207Tq4> y944, Y94<InterfaceC32282Cw3> y945, Y94<C7540Sm> y946, Y94<InterfaceC40099e13> y947) {
        return new C33335Hj3(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C31931Bj3 m103488c(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC34766Nm3 interfaceC34766Nm3, InterfaceC12495bn interfaceC12495bn, InterfaceC46473om3 interfaceC46473om3, InterfaceC46545ot5 interfaceC46545ot5, C36207Tq4 c36207Tq4, InterfaceC32282Cw3 interfaceC32282Cw3, C7540Sm c7540Sm, InterfaceC40099e13 interfaceC40099e13) {
        return new C31931Bj3(lifecycleScopeProvider, interfaceC34766Nm3, interfaceC12495bn, interfaceC46473om3, interfaceC46545ot5, c36207Tq4, interfaceC32282Cw3, c7540Sm, interfaceC40099e13);
    }

    /* renamed from: b */
    public C31931Bj3 m103489b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC34766Nm3 interfaceC34766Nm3) {
        return m103488c(lifecycleScopeProvider, interfaceC34766Nm3, this.f13799a.get(), this.f13800b.get(), this.f13801c.get(), this.f13802d.get(), this.f13803e.get(), this.f13804f.get(), this.f13805g.get());
    }
}
