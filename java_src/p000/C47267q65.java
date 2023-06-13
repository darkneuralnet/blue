package p000;

import co.bird.android.model.wire.WirePhysicalLock;
import com.uber.autodispose.ScopeProvider;
/* renamed from: q65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47267q65 implements InterfaceC46674p65 {

    /* renamed from: a */
    public final C47860r65 f104706a;

    public C47267q65(C47860r65 c47860r65) {
        this.f104706a = c47860r65;
    }

    /* renamed from: b */
    public static Y94<InterfaceC46674p65> m18164b(C47860r65 c47860r65) {
        return C39546d52.m44621a(new C47267q65(c47860r65));
    }

    @Override // p000.InterfaceC46674p65
    /* renamed from: a */
    public C46081o65 mo18165a(ScopeProvider scopeProvider, C49045t65 c49045t65, InterfaceC40099e13 interfaceC40099e13, WirePhysicalLock wirePhysicalLock) {
        return this.f104706a.m16475b(scopeProvider, c49045t65, interfaceC40099e13, wirePhysicalLock);
    }
}
