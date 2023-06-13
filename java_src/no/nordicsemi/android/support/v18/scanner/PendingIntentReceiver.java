package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.ArrayList;
import no.nordicsemi.android.support.v18.scanner.C26711c;
/* loaded from: classes8.dex */
public class PendingIntentReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        C26711c.C26712a m22364p;
        if (context == null || intent == null || (pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT")) == null) {
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
        android.bluetooth.le.ScanSettings scanSettings = (android.bluetooth.le.ScanSettings) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
        if (parcelableArrayListExtra != null && scanSettings != null) {
            boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_BATCHING", true);
            boolean booleanExtra2 = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_FILTERING", true);
            boolean booleanExtra3 = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_CALLBACK_TYPES", true);
            long longExtra = intent.getLongExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_TIMEOUT", AbstractComponentTracker.LINGERING_TIMEOUT);
            long longExtra2 = intent.getLongExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_INTERVAL", AbstractComponentTracker.LINGERING_TIMEOUT);
            int intExtra = intent.getIntExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_MODE", 1);
            int intExtra2 = intent.getIntExtra("no.nordicsemi.android.support.v18.EXTRA_NUM_OF_MATCHES", 3);
            AbstractC26703a m22396b = AbstractC26703a.m22396b();
            C26711c c26711c = (C26711c) m22396b;
            ArrayList<ScanFilter> m22366n = c26711c.m22366n(parcelableArrayListExtra);
            ScanSettings m22365o = c26711c.m22365o(scanSettings, booleanExtra, booleanExtra2, booleanExtra3, longExtra, longExtra2, intExtra, intExtra2);
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean isOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
            boolean isOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
            synchronized (m22396b) {
                try {
                    m22364p = c26711c.m22364p(pendingIntent);
                    if (m22364p == null) {
                        C26711c.C26712a c26712a = new C26711c.C26712a(isOffloadedScanBatchingSupported, isOffloadedFilteringSupported, m22366n, m22365o, new C39130cQ3(pendingIntent, m22365o));
                        c26711c.m22368l(pendingIntent, c26712a);
                        m22364p = c26712a;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            m22364p.f100844n.m61418d(context);
            ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
            if (parcelableArrayListExtra2 != null) {
                ArrayList<ScanResult> m22379h = c26711c.m22379h(parcelableArrayListExtra2);
                if (m22365o.m22419j() > 0) {
                    m22364p.m22386h(m22379h);
                } else if (!m22379h.isEmpty()) {
                    m22364p.m22387g(intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1), m22379h.get(0));
                }
            } else {
                int intExtra3 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", 0);
                if (intExtra3 != 0) {
                    m22364p.m22388f(intExtra3);
                }
            }
            m22364p.f100844n.m61418d(null);
        }
    }
}
