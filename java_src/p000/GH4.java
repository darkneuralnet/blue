package p000;

import android.os.Handler;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: GH4 */
/* loaded from: classes2.dex */
public final class GH4 {

    /* renamed from: a */
    public final Y94<InterfaceC34088Kp0> f11485a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f11486b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f11487c;

    /* renamed from: d */
    public final Y94<Handler> f11488d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f11489e;

    public GH4(Y94<InterfaceC34088Kp0> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC1880Ea> y943, Y94<Handler> y944, Y94<C36207Tq4> y945) {
        this.f11485a = y94;
        this.f11486b = y942;
        this.f11487c = y943;
        this.f11488d = y944;
        this.f11489e = y945;
    }

    /* renamed from: a */
    public static GH4 m105531a(Y94<InterfaceC34088Kp0> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC1880Ea> y943, Y94<Handler> y944, Y94<C36207Tq4> y945) {
        return new GH4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static CH4 m105529c(InterfaceC34088Kp0 interfaceC34088Kp0, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC1880Ea interfaceC1880Ea, Handler handler, C36207Tq4 c36207Tq4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC32604Eg1 interfaceC32604Eg1, HH4 hh4, DQ3 dq3, InterfaceC40099e13 interfaceC40099e13, InterfaceC46333oY1 interfaceC46333oY1) {
        return new CH4(interfaceC34088Kp0, interfaceC40001dr4, interfaceC1880Ea, handler, c36207Tq4, lifecycleScopeProvider, interfaceC32604Eg1, hh4, dq3, interfaceC40099e13, interfaceC46333oY1);
    }

    /* renamed from: b */
    public CH4 m105530b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC32604Eg1 interfaceC32604Eg1, HH4 hh4, DQ3 dq3, InterfaceC40099e13 interfaceC40099e13, InterfaceC46333oY1 interfaceC46333oY1) {
        return m105529c(this.f11485a.get(), this.f11486b.get(), this.f11487c.get(), this.f11488d.get(), this.f11489e.get(), lifecycleScopeProvider, interfaceC32604Eg1, hh4, dq3, interfaceC40099e13, interfaceC46333oY1);
    }
}
