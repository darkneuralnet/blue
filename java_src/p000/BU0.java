package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: BU0 */
/* loaded from: classes2.dex */
public final class BU0 {

    /* renamed from: a */
    public final Y94<InterfaceC42586iD1> f2402a;

    /* renamed from: b */
    public final Y94<InterfaceC52757zN3> f2403b;

    /* renamed from: c */
    public final Y94<InterfaceC44647lh6> f2404c;

    /* renamed from: d */
    public final Y94<JT0> f2405d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f2406e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f2407f;

    public BU0(Y94<InterfaceC42586iD1> y94, Y94<InterfaceC52757zN3> y942, Y94<InterfaceC44647lh6> y943, Y94<JT0> y944, Y94<C36207Tq4> y945, Y94<InterfaceC1880Ea> y946) {
        this.f2402a = y94;
        this.f2403b = y942;
        this.f2404c = y943;
        this.f2405d = y944;
        this.f2406e = y945;
        this.f2407f = y946;
    }

    /* renamed from: a */
    public static BU0 m113977a(Y94<InterfaceC42586iD1> y94, Y94<InterfaceC52757zN3> y942, Y94<InterfaceC44647lh6> y943, Y94<JT0> y944, Y94<C36207Tq4> y945, Y94<InterfaceC1880Ea> y946) {
        return new BU0(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C51631xU0 m113975c(InterfaceC42586iD1 interfaceC42586iD1, InterfaceC52757zN3 interfaceC52757zN3, InterfaceC44647lh6 interfaceC44647lh6, JT0 jt0, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, CU0 cu0, InterfaceC40099e13 interfaceC40099e13, C22454gl c22454gl) {
        return new C51631xU0(interfaceC42586iD1, interfaceC52757zN3, interfaceC44647lh6, jt0, c36207Tq4, interfaceC1880Ea, baseActivity, lifecycleScopeProvider, cu0, interfaceC40099e13, c22454gl);
    }

    /* renamed from: b */
    public C51631xU0 m113976b(BaseActivity baseActivity, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, CU0 cu0, InterfaceC40099e13 interfaceC40099e13, C22454gl c22454gl) {
        return m113975c(this.f2402a.get(), this.f2403b.get(), this.f2404c.get(), this.f2405d.get(), this.f2406e.get(), this.f2407f.get(), baseActivity, lifecycleScopeProvider, cu0, interfaceC40099e13, c22454gl);
    }
}
