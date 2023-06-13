package no.nordicsemi.android.support.v18.scanner;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.AbstractC26703a;
import no.nordicsemi.android.support.v18.scanner.ScanFilter;
import no.nordicsemi.android.support.v18.scanner.ScanSettings;
@TargetApi(26)
/* renamed from: no.nordicsemi.android.support.v18.scanner.c */
/* loaded from: classes8.dex */
public class C26711c extends C27612qX {

    /* renamed from: c */
    public final HashMap<PendingIntent, C26712a> f100843c = new HashMap<>();

    /* renamed from: no.nordicsemi.android.support.v18.scanner.c$a */
    /* loaded from: classes8.dex */
    public static class C26712a extends AbstractC26703a.C26704a {

        /* renamed from: n */
        public final C39130cQ3 f100844n;

        public C26712a(boolean z, boolean z2, List<ScanFilter> list, ScanSettings scanSettings, C39130cQ3 c39130cQ3) {
            super(z, z2, list, scanSettings, c39130cQ3, new Handler());
            this.f100844n = c39130cQ3;
        }
    }

    @Override // no.nordicsemi.android.support.v18.scanner.C26707b
    /* renamed from: g */
    public ScanResult mo22369g(android.bluetooth.le.ScanResult scanResult) {
        int dataStatus;
        boolean isLegacy;
        int i;
        boolean isConnectable;
        byte[] bArr;
        int primaryPhy;
        int secondaryPhy;
        int advertisingSid;
        int txPower;
        int periodicAdvertisingInterval;
        dataStatus = scanResult.getDataStatus();
        int i2 = dataStatus << 5;
        isLegacy = scanResult.isLegacy();
        if (isLegacy) {
            i = 16;
        } else {
            i = 0;
        }
        int i3 = i2 | i;
        isConnectable = scanResult.isConnectable();
        int i4 = i3 | (isConnectable ? 1 : 0);
        if (scanResult.getScanRecord() != null) {
            bArr = scanResult.getScanRecord().getBytes();
        } else {
            bArr = null;
        }
        BluetoothDevice device = scanResult.getDevice();
        primaryPhy = scanResult.getPrimaryPhy();
        secondaryPhy = scanResult.getSecondaryPhy();
        advertisingSid = scanResult.getAdvertisingSid();
        txPower = scanResult.getTxPower();
        int rssi = scanResult.getRssi();
        periodicAdvertisingInterval = scanResult.getPeriodicAdvertisingInterval();
        return new ScanResult(device, i4, primaryPhy, secondaryPhy, advertisingSid, txPower, rssi, periodicAdvertisingInterval, C31942Bk5.m113533h(bArr), scanResult.getTimestampNanos());
    }

    @Override // p000.C27612qX, no.nordicsemi.android.support.v18.scanner.C26707b
    /* renamed from: k */
    public android.bluetooth.le.ScanSettings mo17472k(BluetoothAdapter bluetoothAdapter, ScanSettings scanSettings, boolean z) {
        ScanSettings.Builder legacy;
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && scanSettings.m22417l())) {
            builder.setReportDelay(scanSettings.m22419j());
        }
        if (z || scanSettings.m22416m()) {
            builder.setCallbackType(scanSettings.m22426b()).setMatchMode(scanSettings.m22422g()).setNumOfMatches(scanSettings.m22421h());
        }
        legacy = builder.setScanMode(scanSettings.m22418k()).setLegacy(scanSettings.m22425c());
        legacy.setPhy(scanSettings.m22420i());
        return builder.build();
    }

    /* renamed from: l */
    public void m22368l(PendingIntent pendingIntent, C26712a c26712a) {
        synchronized (this.f100843c) {
            this.f100843c.put(pendingIntent, c26712a);
        }
    }

    /* renamed from: m */
    public ScanFilter m22367m(android.bluetooth.le.ScanFilter scanFilter) {
        ScanFilter.C26699b c26699b = new ScanFilter.C26699b();
        c26699b.m22442b(scanFilter.getDeviceAddress()).m22441c(scanFilter.getDeviceName()).m22435i(scanFilter.getServiceUuid(), scanFilter.getServiceUuidMask()).m22439e(scanFilter.getManufacturerId(), scanFilter.getManufacturerData(), scanFilter.getManufacturerDataMask());
        if (scanFilter.getServiceDataUuid() != null) {
            c26699b.m22437g(scanFilter.getServiceDataUuid(), scanFilter.getServiceData(), scanFilter.getServiceDataMask());
        }
        return c26699b.m22443a();
    }

    /* renamed from: n */
    public ArrayList<ScanFilter> m22366n(List<android.bluetooth.le.ScanFilter> list) {
        ArrayList<ScanFilter> arrayList = new ArrayList<>();
        for (android.bluetooth.le.ScanFilter scanFilter : list) {
            arrayList.add(m22367m(scanFilter));
        }
        return arrayList;
    }

    /* renamed from: o */
    public ScanSettings m22365o(android.bluetooth.le.ScanSettings scanSettings, boolean z, boolean z2, boolean z3, long j, long j2, int i, int i2) {
        boolean legacy;
        int phy;
        ScanSettings.C26702b c26702b = new ScanSettings.C26702b();
        legacy = scanSettings.getLegacy();
        ScanSettings.C26702b m22409d = c26702b.m22409d(legacy);
        phy = scanSettings.getPhy();
        return m22409d.m22405h(phy).m22410c(scanSettings.getCallbackType()).m22403j(scanSettings.getScanMode()).m22404i(scanSettings.getReportDelayMillis()).m22402k(z).m22400m(z2).m22401l(z3).m22407f(j, j2).m22408e(i).m22406g(i2).m22412a();
    }

    /* renamed from: p */
    public C26712a m22364p(PendingIntent pendingIntent) {
        synchronized (this.f100843c) {
            if (this.f100843c.containsKey(pendingIntent)) {
                C26712a c26712a = this.f100843c.get(pendingIntent);
                if (c26712a != null) {
                    return c26712a;
                }
                throw new IllegalStateException("Scanning has been stopped");
            }
            return null;
        }
    }
}
