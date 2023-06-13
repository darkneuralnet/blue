package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.ScanSettings;
/* loaded from: classes8.dex */
public class ScannerService extends Service {

    /* renamed from: b */
    public final Object f100819b = new Object();

    /* renamed from: c */
    public HashMap<Integer, AbstractC43480jj5> f100820c;

    /* renamed from: d */
    public Handler f100821d;

    /* renamed from: a */
    public final void m22398a(List<ScanFilter> list, ScanSettings scanSettings, PendingIntent pendingIntent, int i) {
        C39130cQ3 c39130cQ3 = new C39130cQ3(pendingIntent, scanSettings, this);
        synchronized (this.f100819b) {
            this.f100820c.put(Integer.valueOf(i), c39130cQ3);
        }
        try {
            AbstractC26703a.m22396b().mo22381d(list, scanSettings, c39130cQ3, this.f100821d);
        } catch (Exception e) {
            Log.w("ScannerService", "Starting scanning failed", e);
        }
    }

    /* renamed from: b */
    public final void m22397b(int i) {
        AbstractC43480jj5 remove;
        boolean isEmpty;
        synchronized (this.f100819b) {
            remove = this.f100820c.remove(Integer.valueOf(i));
            isEmpty = this.f100820c.isEmpty();
        }
        if (remove == null) {
            return;
        }
        try {
            AbstractC26703a.m22396b().m22394e(remove);
        } catch (Exception e) {
            Log.w("ScannerService", "Stopping scanning failed", e);
        }
        if (isEmpty) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f100820c = new HashMap<>();
        this.f100821d = new Handler();
    }

    @Override // android.app.Service
    public void onDestroy() {
        AbstractC26703a m22396b = AbstractC26703a.m22396b();
        for (AbstractC43480jj5 abstractC43480jj5 : this.f100820c.values()) {
            try {
                m22396b.m22394e(abstractC43480jj5);
            } catch (Exception unused) {
            }
        }
        this.f100820c.clear();
        this.f100820c = null;
        this.f100821d = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        boolean containsKey;
        boolean isEmpty;
        if (intent != null) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT");
            int intExtra = intent.getIntExtra("no.nordicsemi.android.support.v18.REQUEST_CODE", 0);
            boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_START", false);
            boolean z = !booleanExtra;
            if (pendingIntent == null) {
                synchronized (this.f100819b) {
                    isEmpty = this.f100820c.isEmpty();
                }
                if (isEmpty) {
                    stopSelf();
                }
                return 2;
            }
            synchronized (this.f100819b) {
                containsKey = this.f100820c.containsKey(Integer.valueOf(intExtra));
            }
            if (booleanExtra && !containsKey) {
                List<ScanFilter> parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
                ScanSettings scanSettings = (ScanSettings) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = Collections.emptyList();
                }
                if (scanSettings == null) {
                    scanSettings = new ScanSettings.C26702b().m22412a();
                }
                m22398a(parcelableArrayListExtra, scanSettings, pendingIntent, intExtra);
            } else if (z && containsKey) {
                m22397b(intExtra);
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }
}
