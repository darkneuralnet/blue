package p000;

import co.bird.android.model.wire.WirePhysicalLock;
import com.uber.autodispose.ScopeProvider;
/* renamed from: r65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47860r65 {

    /* renamed from: a */
    public final Y94<InterfaceC37971aT3> f106476a;

    public C47860r65(Y94<InterfaceC37971aT3> y94) {
        this.f106476a = y94;
    }

    /* renamed from: a */
    public static C47860r65 m16476a(Y94<InterfaceC37971aT3> y94) {
        return new C47860r65(y94);
    }

    /* renamed from: c */
    public static C46081o65 m16474c(InterfaceC37971aT3 interfaceC37971aT3, ScopeProvider scopeProvider, C49045t65 c49045t65, InterfaceC40099e13 interfaceC40099e13, WirePhysicalLock wirePhysicalLock) {
        return new C46081o65(interfaceC37971aT3, scopeProvider, c49045t65, interfaceC40099e13, wirePhysicalLock);
    }

    /* renamed from: b */
    public C46081o65 m16475b(ScopeProvider scopeProvider, C49045t65 c49045t65, InterfaceC40099e13 interfaceC40099e13, WirePhysicalLock wirePhysicalLock) {
        return m16474c(this.f106476a.get(), scopeProvider, c49045t65, interfaceC40099e13, wirePhysicalLock);
    }
}
