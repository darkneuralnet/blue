package p000;

import android.os.Handler;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: ZS2 */
/* loaded from: classes2.dex */
public final class ZS2 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f48593a;

    /* renamed from: b */
    public final Y94<InterfaceC23227iO> f48594b;

    /* renamed from: c */
    public final Y94<Handler> f48595c;

    /* renamed from: d */
    public final Y94<V74> f48596d;

    public ZS2(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC23227iO> y942, Y94<Handler> y943, Y94<V74> y944) {
        this.f48593a = y94;
        this.f48594b = y942;
        this.f48595c = y943;
        this.f48596d = y944;
    }

    /* renamed from: a */
    public static ZS2 m73096a(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC23227iO> y942, Y94<Handler> y943, Y94<V74> y944) {
        return new ZS2(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static WS2 m73094c(InterfaceC1880Ea interfaceC1880Ea, InterfaceC23227iO interfaceC23227iO, Handler handler, V74 v74, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, DQ3 dq3, InterfaceC39156cT2 interfaceC39156cT2, InterfaceC40099e13 interfaceC40099e13) {
        return new WS2(interfaceC1880Ea, interfaceC23227iO, handler, v74, lifecycleScopeProvider, dq3, interfaceC39156cT2, interfaceC40099e13);
    }

    /* renamed from: b */
    public WS2 m73095b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, DQ3 dq3, InterfaceC39156cT2 interfaceC39156cT2, InterfaceC40099e13 interfaceC40099e13) {
        return m73094c(this.f48593a.get(), this.f48594b.get(), this.f48595c.get(), this.f48596d.get(), lifecycleScopeProvider, dq3, interfaceC39156cT2, interfaceC40099e13);
    }
}
