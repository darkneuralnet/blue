package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0019"}, m28432d2 = {"LCk6;", "LyU;", "Landroid/bluetooth/BluetoothDevice;", "device", "", DateTokenConverter.CONVERTER_KEY, "m", "b", "e", "f", "", "optionalServicesFound", "h", "g", "k", "n", C17296a.f69688o, "", "message", "", "errorCode", "i", "c", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ck6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C32177Ck6 implements InterfaceC30597yU {
    @Override // p000.InterfaceC30597yU
    /* renamed from: a */
    public void mo3467a(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onDeviceReady " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: b */
    public void mo3466b(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onDeviceConnected " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: c */
    public void mo3465c(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onDeviceConnecting " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: d */
    public void mo3464d(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onDeviceDisconnecting " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: e */
    public void mo3463e(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onDeviceNotSupported " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: f */
    public void mo3462f(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onBondingFailed " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: g */
    public void mo3461g(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onBondingRequired " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: h */
    public void mo3460h(BluetoothDevice device, boolean z) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onServicesDiscovered " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: i */
    public void mo3459i(BluetoothDevice device, String message, int i) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(message, "message");
        String address = device.getAddress();
        C41318g46.m40151m("onError " + address + " - message: " + message + " - error code: " + i, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: k */
    public void mo3457k(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onLinkLossOccurred " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: m */
    public void mo3455m(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onDeviceDisconnected " + address, new Object[0]);
    }

    @Override // p000.InterfaceC30597yU
    /* renamed from: n */
    public void mo3454n(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        C41318g46.m40151m("onBonded " + address, new Object[0]);
    }
}
