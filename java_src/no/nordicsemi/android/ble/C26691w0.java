package no.nordicsemi.android.ble;

import android.os.Handler;
/* renamed from: no.nordicsemi.android.ble.w0 */
/* loaded from: classes8.dex */
public final class C26691w0 extends C26693x0 {

    /* renamed from: r */
    public final byte[] f100752r;

    /* renamed from: s */
    public boolean f100753s;

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: H */
    public C26691w0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: I */
    public C26691w0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    /* renamed from: J */
    public byte[] m22475J(int i) {
        int i2;
        if (this.f100753s) {
            i2 = 512;
        } else {
            i2 = i - 3;
        }
        byte[] bArr = this.f100752r;
        if (bArr.length < i2) {
            return bArr;
        }
        return S70.m85979a(bArr, 0, i2);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: K */
    public C26691w0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: L */
    public C26691w0 mo22470F(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: M */
    public C26691w0 mo22469G(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }
}
