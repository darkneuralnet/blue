package p000;

import co.bird.android.model.wire.WireBird;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: IR4 */
/* loaded from: classes2.dex */
public final class IR4 implements HR4 {

    /* renamed from: a */
    public final JR4 f15480a;

    public IR4(JR4 jr4) {
        this.f15480a = jr4;
    }

    /* renamed from: b */
    public static Y94<HR4> m102405b(JR4 jr4) {
        return C39546d52.m44621a(new IR4(jr4));
    }

    @Override // p000.HR4
    /* renamed from: a */
    public GR4 mo102406a(WireBird wireBird, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, RR4 rr4, InterfaceC40099e13 interfaceC40099e13) {
        return this.f15480a.m100464b(wireBird, lifecycleScopeProvider, rr4, interfaceC40099e13);
    }
}
