package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Balance;
import co.bird.android.model.wire.configs.RideConfig;
import com.uber.autodispose.ScopeProvider;
/* renamed from: ns */
/* loaded from: classes2.dex */
public final class C26732ns implements InterfaceC26274ms {

    /* renamed from: a */
    public final C27083os f100933a;

    public C26732ns(C27083os c27083os) {
        this.f100933a = c27083os;
    }

    /* renamed from: b */
    public static Y94<InterfaceC26274ms> m22270b(C27083os c27083os) {
        return C39546d52.m44621a(new C26732ns(c27083os));
    }

    @Override // p000.InterfaceC26274ms
    /* renamed from: a */
    public C25506ks mo22271a(BaseActivity baseActivity, ScopeProvider scopeProvider, InterfaceC27711qs interfaceC27711qs, InterfaceC40099e13 interfaceC40099e13, RideConfig rideConfig, Balance balance, boolean z, InterfaceC38875bz1 interfaceC38875bz1, InterfaceC26272mr interfaceC26272mr) {
        return this.f100933a.m20417b(baseActivity, scopeProvider, interfaceC27711qs, interfaceC40099e13, rideConfig, balance, z, interfaceC38875bz1, interfaceC26272mr);
    }
}
