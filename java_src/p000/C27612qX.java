package p000;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanSettings;
import no.nordicsemi.android.support.v18.scanner.C26707b;
@TargetApi(23)
/* renamed from: qX */
/* loaded from: classes8.dex */
public class C27612qX extends C26707b {
    @Override // no.nordicsemi.android.support.v18.scanner.C26707b
    /* renamed from: k */
    public ScanSettings mo17472k(BluetoothAdapter bluetoothAdapter, no.nordicsemi.android.support.v18.scanner.ScanSettings scanSettings, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && scanSettings.m22417l())) {
            builder.setReportDelay(scanSettings.m22419j());
        }
        if (z || scanSettings.m22416m()) {
            builder.setCallbackType(scanSettings.m22426b()).setMatchMode(scanSettings.m22422g()).setNumOfMatches(scanSettings.m22421h());
        }
        builder.setScanMode(scanSettings.m22418k());
        return builder.build();
    }
}
