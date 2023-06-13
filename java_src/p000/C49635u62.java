package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
/* renamed from: u62  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49635u62 {

    /* renamed from: a */
    public final C33112Gk5 f111754a;

    /* renamed from: b */
    public final Z92 f111755b;

    public C49635u62(C33112Gk5 c33112Gk5, Z92 z92) {
        this.f111754a = c33112Gk5;
        this.f111755b = z92;
    }

    /* renamed from: d */
    public static EnumC44073kj5 m10859d(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    C52323ye5.m3111r("Unknown callback type %d -> check android.bluetooth.le.ScanSettings", Integer.valueOf(i));
                    return EnumC44073kj5.CALLBACK_TYPE_UNKNOWN;
                }
                return EnumC44073kj5.CALLBACK_TYPE_MATCH_LOST;
            }
            return EnumC44073kj5.CALLBACK_TYPE_FIRST_MATCH;
        }
        return EnumC44073kj5.CALLBACK_TYPE_ALL_MATCHES;
    }

    /* renamed from: a */
    public C51730xe5 m10862a(int i, ScanResult scanResult) {
        return new C51730xe5(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new C32878Fk5(scanResult.getScanRecord(), this.f111754a), m10859d(i), this.f111755b.mo44116a(scanResult));
    }

    /* renamed from: b */
    public C51730xe5 m10861b(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        return new C51730xe5(bluetoothDevice, i, System.nanoTime(), this.f111754a.m104812c(bArr), EnumC44073kj5.CALLBACK_TYPE_UNSPECIFIED, Y92.LEGACY_UNKNOWN);
    }

    /* renamed from: c */
    public C51730xe5 m10860c(ScanResult scanResult) {
        return new C51730xe5(scanResult.getDevice(), scanResult.getRssi(), scanResult.getTimestampNanos(), new C32878Fk5(scanResult.getScanRecord(), this.f111754a), EnumC44073kj5.CALLBACK_TYPE_BATCH, this.f111755b.mo44116a(scanResult));
    }
}
