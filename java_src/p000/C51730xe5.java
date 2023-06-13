package p000;

import android.bluetooth.BluetoothDevice;
/* renamed from: xe5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51730xe5 implements InterfaceC36622Vk5 {

    /* renamed from: a */
    public final BluetoothDevice f117927a;

    /* renamed from: b */
    public final int f117928b;

    /* renamed from: c */
    public final long f117929c;

    /* renamed from: d */
    public final InterfaceC32176Ck5 f117930d;

    /* renamed from: e */
    public final EnumC44073kj5 f117931e;

    /* renamed from: f */
    public final Y92 f117932f;

    public C51730xe5(BluetoothDevice bluetoothDevice, int i, long j, InterfaceC32176Ck5 interfaceC32176Ck5, EnumC44073kj5 enumC44073kj5, Y92 y92) {
        this.f117927a = bluetoothDevice;
        this.f117928b = i;
        this.f117929c = j;
        this.f117930d = interfaceC32176Ck5;
        this.f117931e = enumC44073kj5;
        this.f117932f = y92;
    }

    /* renamed from: a */
    public BluetoothDevice m4909a() {
        return this.f117927a;
    }

    /* renamed from: b */
    public int m4908b() {
        return this.f117928b;
    }

    /* renamed from: c */
    public EnumC44073kj5 m4907c() {
        return this.f117931e;
    }

    /* renamed from: d */
    public long m4906d() {
        return this.f117929c;
    }

    /* renamed from: e */
    public Y92 m4905e() {
        return this.f117932f;
    }

    @Override // p000.InterfaceC36622Vk5
    public String getAddress() {
        return this.f117927a.getAddress();
    }

    @Override // p000.InterfaceC36622Vk5
    public String getDeviceName() {
        BluetoothDevice m4909a = m4909a();
        if (m4909a == null) {
            return null;
        }
        return m4909a.getName();
    }

    @Override // p000.InterfaceC36622Vk5
    public InterfaceC32176Ck5 getScanRecord() {
        return this.f117930d;
    }
}
