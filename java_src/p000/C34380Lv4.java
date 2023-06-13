package p000;

import android.os.Handler;
import no.nordicsemi.android.ble.AbstractC26684u0;
import no.nordicsemi.android.ble.C26689v0;
/* renamed from: Lv4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34380Lv4 extends C26689v0 {

    /* renamed from: s */
    public boolean f22274s;

    /* renamed from: t */
    public boolean f22275t;

    /* renamed from: u */
    public boolean f22276u;

    @Override // no.nordicsemi.android.ble.C26689v0
    /* renamed from: I */
    public void mo22486I() {
        this.f22276u = true;
        super.mo22486I();
    }

    @Override // no.nordicsemi.android.ble.C26689v0
    /* renamed from: L */
    public AbstractC26684u0 mo22483L() {
        if (!this.f22274s) {
            this.f22274s = true;
            return AbstractC26684u0.m22501s();
        } else if (super.m22480O()) {
            this.f22275t = true;
            if (this.f22276u) {
                return AbstractC26684u0.m22502r();
            }
            return AbstractC26684u0.m22497w();
        } else {
            return super.mo22483L();
        }
    }

    @Override // no.nordicsemi.android.ble.C26689v0
    /* renamed from: M */
    public boolean mo22482M() {
        if (!this.f22274s) {
            return super.mo22482M();
        }
        return !this.f22275t;
    }

    @Override // no.nordicsemi.android.ble.C26689v0, no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: R */
    public C34380Lv4 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.C26689v0, no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: S */
    public C34380Lv4 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    @Override // no.nordicsemi.android.ble.C26689v0, no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: T */
    public C34380Lv4 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    @Override // no.nordicsemi.android.ble.C26689v0
    /* renamed from: U */
    public C34380Lv4 mo22479P(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.C26689v0
    /* renamed from: V */
    public C34380Lv4 mo22478Q(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }
}
