package p000;

import co.bird.android.model.wire.WireBird;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: JR4 */
/* loaded from: classes2.dex */
public final class JR4 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f17544a;

    /* renamed from: b */
    public final Y94<YR4> f17545b;

    /* renamed from: c */
    public final Y94<InterfaceC46473om3> f17546c;

    public JR4(Y94<InterfaceC1880Ea> y94, Y94<YR4> y942, Y94<InterfaceC46473om3> y943) {
        this.f17544a = y94;
        this.f17545b = y942;
        this.f17546c = y943;
    }

    /* renamed from: a */
    public static JR4 m100465a(Y94<InterfaceC1880Ea> y94, Y94<YR4> y942, Y94<InterfaceC46473om3> y943) {
        return new JR4(y94, y942, y943);
    }

    /* renamed from: c */
    public static GR4 m100463c(InterfaceC1880Ea interfaceC1880Ea, YR4 yr4, InterfaceC46473om3 interfaceC46473om3, WireBird wireBird, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, RR4 rr4, InterfaceC40099e13 interfaceC40099e13) {
        return new GR4(interfaceC1880Ea, yr4, interfaceC46473om3, wireBird, lifecycleScopeProvider, rr4, interfaceC40099e13);
    }

    /* renamed from: b */
    public GR4 m100464b(WireBird wireBird, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, RR4 rr4, InterfaceC40099e13 interfaceC40099e13) {
        return m100463c(this.f17544a.get(), this.f17545b.get(), this.f17546c.get(), wireBird, lifecycleScopeProvider, rr4, interfaceC40099e13);
    }
}
