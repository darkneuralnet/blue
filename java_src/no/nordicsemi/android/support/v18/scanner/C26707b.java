package no.nordicsemi.android.support.v18.scanner;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.AbstractC26703a;
import no.nordicsemi.android.support.v18.scanner.C26707b;
@TargetApi(21)
/* renamed from: no.nordicsemi.android.support.v18.scanner.b */
/* loaded from: classes8.dex */
public class C26707b extends AbstractC26703a {

    /* renamed from: b */
    public final C26713d<C26709b> f100839b = new C26713d<>();

    /* renamed from: no.nordicsemi.android.support.v18.scanner.b$b */
    /* loaded from: classes8.dex */
    public static class C26709b extends AbstractC26703a.C26704a {

        /* renamed from: n */
        public final ScanCallback f100840n;

        /* renamed from: no.nordicsemi.android.support.v18.scanner.b$b$a */
        /* loaded from: classes8.dex */
        public class C26710a extends ScanCallback {

            /* renamed from: a */
            public long f100841a;

            public C26710a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m22372d(List list) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f100841a > (elapsedRealtime - C26709b.this.f100829g.m22419j()) + 5) {
                    return;
                }
                this.f100841a = elapsedRealtime;
                C26709b.this.m22386h(((C26707b) AbstractC26703a.m22396b()).m22379h(list));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m22371e(int i) {
                if (C26709b.this.f100829g.m22416m() && C26709b.this.f100829g.m22426b() != 1) {
                    C26709b.this.f100829g.m22427a();
                    AbstractC26703a m22396b = AbstractC26703a.m22396b();
                    try {
                        m22396b.m22394e(C26709b.this.f100830h);
                    } catch (Exception unused) {
                    }
                    try {
                        C26709b c26709b = C26709b.this;
                        m22396b.mo22381d(c26709b.f100828f, c26709b.f100829g, c26709b.f100830h, c26709b.f100831i);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                C26709b.this.m22388f(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m22370f(android.bluetooth.le.ScanResult scanResult, int i) {
                C26709b.this.m22387g(i, ((C26707b) AbstractC26703a.m22396b()).mo22369g(scanResult));
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(final List<android.bluetooth.le.ScanResult> list) {
                C26709b.this.f100831i.post(new Runnable() { // from class: nX
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26707b.C26709b.C26710a.this.m22372d(list);
                    }
                });
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(final int i) {
                C26709b.this.f100831i.post(new Runnable() { // from class: oX
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26707b.C26709b.C26710a.this.m22371e(i);
                    }
                });
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(final int i, final android.bluetooth.le.ScanResult scanResult) {
                C26709b.this.f100831i.post(new Runnable() { // from class: pX
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26707b.C26709b.C26710a.this.m22370f(scanResult, i);
                    }
                });
            }
        }

        public C26709b(boolean z, boolean z2, List<ScanFilter> list, ScanSettings scanSettings, AbstractC43480jj5 abstractC43480jj5, Handler handler) {
            super(z, z2, list, scanSettings, abstractC43480jj5, handler);
            this.f100840n = new C26710a();
        }
    }

    @Override // no.nordicsemi.android.support.v18.scanner.AbstractC26703a
    /* renamed from: a */
    public void mo22382a(AbstractC43480jj5 abstractC43480jj5) {
        C26709b m22360d;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (abstractC43480jj5 != null) {
            synchronized (this.f100839b) {
                m22360d = this.f100839b.m22360d(abstractC43480jj5);
            }
            if (m22360d != null) {
                ScanSettings scanSettings = m22360d.f100829g;
                if (defaultAdapter.isOffloadedScanBatchingSupported() && scanSettings.m22417l()) {
                    BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
                    if (bluetoothLeScanner == null) {
                        return;
                    }
                    bluetoothLeScanner.flushPendingScanResults(m22360d.f100840n);
                    return;
                }
                m22360d.m22389e();
                return;
            }
            throw new IllegalArgumentException("callback not registered!");
        }
        throw new IllegalArgumentException("callback cannot be null!");
    }

    @Override // no.nordicsemi.android.support.v18.scanner.AbstractC26703a
    /* renamed from: d */
    public void mo22381d(List<ScanFilter> list, ScanSettings scanSettings, AbstractC43480jj5 abstractC43480jj5, Handler handler) {
        C26709b c26709b;
        ArrayList<android.bluetooth.le.ScanFilter> arrayList;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            boolean isOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
            boolean isOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
            synchronized (this.f100839b) {
                if (!this.f100839b.m22361c(abstractC43480jj5)) {
                    c26709b = new C26709b(isOffloadedScanBatchingSupported, isOffloadedFilteringSupported, list, scanSettings, new C35426Qh6(abstractC43480jj5), handler);
                    this.f100839b.m22363a(c26709b);
                } else {
                    throw new IllegalArgumentException("scanner already started with given callback");
                }
            }
            android.bluetooth.le.ScanSettings mo17472k = mo17472k(defaultAdapter, scanSettings, false);
            if (!list.isEmpty() && isOffloadedFilteringSupported && scanSettings.m22415n()) {
                arrayList = m22377j(list);
            } else {
                arrayList = null;
            }
            bluetoothLeScanner.startScan(arrayList, mo17472k, c26709b.f100840n);
            return;
        }
        throw new IllegalStateException("BT le scanner not available");
    }

    @Override // no.nordicsemi.android.support.v18.scanner.AbstractC26703a
    /* renamed from: f */
    public void mo22380f(AbstractC43480jj5 abstractC43480jj5) {
        C26709b m22359e;
        BluetoothLeScanner bluetoothLeScanner;
        synchronized (this.f100839b) {
            m22359e = this.f100839b.m22359e(abstractC43480jj5);
        }
        if (m22359e == null) {
            return;
        }
        m22359e.m22390d();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) != null) {
            bluetoothLeScanner.stopScan(m22359e.f100840n);
        }
    }

    /* renamed from: g */
    public ScanResult mo22369g(android.bluetooth.le.ScanResult scanResult) {
        byte[] bArr;
        if (scanResult.getScanRecord() != null) {
            bArr = scanResult.getScanRecord().getBytes();
        } else {
            bArr = null;
        }
        return new ScanResult(scanResult.getDevice(), C31942Bk5.m113533h(bArr), scanResult.getRssi(), scanResult.getTimestampNanos());
    }

    /* renamed from: h */
    public ArrayList<ScanResult> m22379h(List<android.bluetooth.le.ScanResult> list) {
        ArrayList<ScanResult> arrayList = new ArrayList<>();
        for (android.bluetooth.le.ScanResult scanResult : list) {
            arrayList.add(mo22369g(scanResult));
        }
        return arrayList;
    }

    /* renamed from: i */
    public android.bluetooth.le.ScanFilter m22378i(ScanFilter scanFilter) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        builder.setServiceUuid(scanFilter.m22451j(), scanFilter.m22450k()).setManufacturerData(scanFilter.m22455e(), scanFilter.m22457c(), scanFilter.m22456d());
        if (scanFilter.m22459a() != null) {
            builder.setDeviceAddress(scanFilter.m22459a());
        }
        if (scanFilter.m22458b() != null) {
            builder.setDeviceName(scanFilter.m22458b());
        }
        if (scanFilter.m22452i() != null) {
            builder.setServiceData(scanFilter.m22452i(), scanFilter.m22454g(), scanFilter.m22453h());
        }
        return builder.build();
    }

    /* renamed from: j */
    public ArrayList<android.bluetooth.le.ScanFilter> m22377j(List<ScanFilter> list) {
        ArrayList<android.bluetooth.le.ScanFilter> arrayList = new ArrayList<>();
        for (ScanFilter scanFilter : list) {
            arrayList.add(m22378i(scanFilter));
        }
        return arrayList;
    }

    /* renamed from: k */
    public android.bluetooth.le.ScanSettings mo17472k(BluetoothAdapter bluetoothAdapter, ScanSettings scanSettings, boolean z) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && scanSettings.m22417l())) {
            builder.setReportDelay(scanSettings.m22419j());
        }
        if (scanSettings.m22418k() != -1) {
            builder.setScanMode(scanSettings.m22418k());
        } else {
            builder.setScanMode(0);
        }
        scanSettings.m22427a();
        return builder.build();
    }
}
