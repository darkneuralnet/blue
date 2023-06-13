package no.nordicsemi.android.ble;

import android.os.Handler;
import java.util.Deque;
import java.util.LinkedList;
import no.nordicsemi.android.ble.AbstractC26684u0;
/* renamed from: no.nordicsemi.android.ble.v0 */
/* loaded from: classes8.dex */
public class C26689v0 extends AbstractC26684u0 {

    /* renamed from: r */
    public final Deque<AbstractC26684u0> f100749r;

    public C26689v0() {
        super(AbstractC26684u0.EnumC26687c.SET);
        this.f100749r = new LinkedList();
    }

    /* renamed from: H */
    public void m22487H(AbstractC26684u0 abstractC26684u0) {
        this.f100749r.addFirst(abstractC26684u0);
    }

    /* renamed from: I */
    public void mo22486I() {
        this.f100749r.clear();
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: J */
    public C26689v0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: K */
    public C26689v0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    /* renamed from: L */
    public AbstractC26684u0 mo22483L() {
        try {
            return this.f100749r.remove();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: M */
    public boolean mo22482M() {
        return (this.f100706p || this.f100749r.isEmpty()) ? false : true;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: N */
    public C26689v0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    /* renamed from: O */
    public boolean m22480O() {
        return this.f100749r.isEmpty();
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: P */
    public C26689v0 mo22470F(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: Q */
    public C26689v0 mo22469G(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }
}
