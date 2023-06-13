package p000;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import com.polidea.rxandroidble2.exceptions.BleException;
import java.util.List;
/* renamed from: pd5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46978pd5 {

    /* renamed from: b */
    public static BleException f103868b = new BleException("bluetoothAdapter is null");

    /* renamed from: a */
    public final BluetoothAdapter f103869a;

    public C46978pd5(BluetoothAdapter bluetoothAdapter) {
        this.f103869a = bluetoothAdapter;
    }

    /* renamed from: a */
    public BluetoothDevice m19050a(String str) {
        BluetoothAdapter bluetoothAdapter = this.f103869a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getRemoteDevice(str);
        }
        throw f103868b;
    }

    /* renamed from: b */
    public boolean m19049b() {
        return this.f103869a != null;
    }

    /* renamed from: c */
    public boolean m19048c() {
        BluetoothAdapter bluetoothAdapter = this.f103869a;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    @TargetApi(21)
    /* renamed from: d */
    public void m19047d(List<ScanFilter> list, ScanSettings scanSettings, ScanCallback scanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f103869a;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.getBluetoothLeScanner().startScan(list, scanSettings, scanCallback);
            return;
        }
        throw f103868b;
    }

    /* renamed from: e */
    public boolean m19046e(BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f103869a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.startLeScan(leScanCallback);
        }
        throw f103868b;
    }

    @TargetApi(21)
    /* renamed from: f */
    public void m19045f(ScanCallback scanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f103869a;
        if (bluetoothAdapter != null) {
            if (!bluetoothAdapter.isEnabled()) {
                C52323ye5.m3112q("BluetoothAdapter is disabled, calling BluetoothLeScanner.stopScan(ScanCallback) may cause IllegalStateException", new Object[0]);
                return;
            }
            BluetoothLeScanner bluetoothLeScanner = this.f103869a.getBluetoothLeScanner();
            if (bluetoothLeScanner == null) {
                C52323ye5.m3111r("Cannot call BluetoothLeScanner.stopScan(ScanCallback) on 'null' reference; BluetoothAdapter.isEnabled() == %b", Boolean.valueOf(this.f103869a.isEnabled()));
                return;
            } else {
                bluetoothLeScanner.stopScan(scanCallback);
                return;
            }
        }
        throw f103868b;
    }

    /* renamed from: g */
    public void m19044g(BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f103869a;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.stopLeScan(leScanCallback);
            return;
        }
        throw f103868b;
    }
}
