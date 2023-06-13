package p000;

import android.content.Context;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: Qy2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35575Qy2 {

    /* renamed from: a */
    public final Y94<Context> f31319a;

    /* renamed from: b */
    public final Y94<C22454gl> f31320b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f31321c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f31322d;

    /* renamed from: e */
    public final Y94<InterfaceC32684Ep0> f31323e;

    /* renamed from: f */
    public final Y94<InterfaceC44647lh6> f31324f;

    public C35575Qy2(Y94<Context> y94, Y94<C22454gl> y942, Y94<InterfaceC1880Ea> y943, Y94<C36207Tq4> y944, Y94<InterfaceC32684Ep0> y945, Y94<InterfaceC44647lh6> y946) {
        this.f31319a = y94;
        this.f31320b = y942;
        this.f31321c = y943;
        this.f31322d = y944;
        this.f31323e = y945;
        this.f31324f = y946;
    }

    /* renamed from: a */
    public static C35575Qy2 m87494a(Y94<Context> y94, Y94<C22454gl> y942, Y94<InterfaceC1880Ea> y943, Y94<C36207Tq4> y944, Y94<InterfaceC32684Ep0> y945, Y94<InterfaceC44647lh6> y946) {
        return new C35575Qy2(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C34873Ny2 m87492c(Context context, C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4, InterfaceC32684Ep0 interfaceC32684Ep0, InterfaceC44647lh6 interfaceC44647lh6, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC36043Sy2 interfaceC36043Sy2, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return new C34873Ny2(context, c22454gl, interfaceC1880Ea, c36207Tq4, interfaceC32684Ep0, interfaceC44647lh6, lifecycleScopeProvider, interfaceC36043Sy2, interfaceC40099e13, dq3);
    }

    /* renamed from: b */
    public C34873Ny2 m87493b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC36043Sy2 interfaceC36043Sy2, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return m87492c(this.f31319a.get(), this.f31320b.get(), this.f31321c.get(), this.f31322d.get(), this.f31323e.get(), this.f31324f.get(), lifecycleScopeProvider, interfaceC36043Sy2, interfaceC40099e13, dq3);
    }
}
