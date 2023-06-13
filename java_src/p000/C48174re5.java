package p000;

import android.bluetooth.BluetoothDevice;
import p000.InterfaceC44023ke5;
/* renamed from: re5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48174re5 implements InterfaceC49405tj1<C47581qe5> {

    /* renamed from: a */
    public final Z94<BluetoothDevice> f107396a;

    /* renamed from: b */
    public final Z94<InterfaceC33233Gy0> f107397b;

    /* renamed from: c */
    public final Z94<C0058AG<InterfaceC44023ke5.EnumC25197a>> f107398c;

    /* renamed from: d */
    public final Z94<C50579vi0> f107399d;

    public C48174re5(Z94<BluetoothDevice> z94, Z94<InterfaceC33233Gy0> z942, Z94<C0058AG<InterfaceC44023ke5.EnumC25197a>> z943, Z94<C50579vi0> z944) {
        this.f107396a = z94;
        this.f107397b = z942;
        this.f107398c = z943;
        this.f107399d = z944;
    }

    /* renamed from: a */
    public static C48174re5 m15632a(Z94<BluetoothDevice> z94, Z94<InterfaceC33233Gy0> z942, Z94<C0058AG<InterfaceC44023ke5.EnumC25197a>> z943, Z94<C50579vi0> z944) {
        return new C48174re5(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static C47581qe5 m15630c(BluetoothDevice bluetoothDevice, InterfaceC33233Gy0 interfaceC33233Gy0, C0058AG<InterfaceC44023ke5.EnumC25197a> c0058ag, C50579vi0 c50579vi0) {
        return new C47581qe5(bluetoothDevice, interfaceC33233Gy0, c0058ag, c50579vi0);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C47581qe5 get() {
        return m15630c(this.f107396a.get(), this.f107397b.get(), this.f107398c.get(), this.f107399d.get());
    }
}
