package p000;

import android.content.Context;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: bV0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38579bV0 {

    /* renamed from: a */
    public final Y94<Context> f57564a;

    /* renamed from: b */
    public final Y94<C22454gl> f57565b;

    /* renamed from: c */
    public final Y94<InterfaceC31844Az6> f57566c;

    /* renamed from: d */
    public final Y94<InterfaceC39059cI4> f57567d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f57568e;

    public C38579bV0(Y94<Context> y94, Y94<C22454gl> y942, Y94<InterfaceC31844Az6> y943, Y94<InterfaceC39059cI4> y944, Y94<InterfaceC40099e13> y945) {
        this.f57564a = y94;
        this.f57565b = y942;
        this.f57566c = y943;
        this.f57567d = y944;
        this.f57568e = y945;
    }

    /* renamed from: a */
    public static C38579bV0 m64508a(Y94<Context> y94, Y94<C22454gl> y942, Y94<InterfaceC31844Az6> y943, Y94<InterfaceC39059cI4> y944, Y94<InterfaceC40099e13> y945) {
        return new C38579bV0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static WU0 m64506c(Context context, C22454gl c22454gl, InterfaceC31844Az6 interfaceC31844Az6, InterfaceC39059cI4 interfaceC39059cI4, InterfaceC40099e13 interfaceC40099e13, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40375eV0 interfaceC40375eV0) {
        return new WU0(context, c22454gl, interfaceC31844Az6, interfaceC39059cI4, interfaceC40099e13, lifecycleScopeProvider, interfaceC40375eV0);
    }

    /* renamed from: b */
    public WU0 m64507b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40375eV0 interfaceC40375eV0) {
        return m64506c(this.f57564a.get(), this.f57565b.get(), this.f57566c.get(), this.f57567d.get(), this.f57568e.get(), lifecycleScopeProvider, interfaceC40375eV0);
    }
}
