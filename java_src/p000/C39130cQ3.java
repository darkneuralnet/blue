package p000;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import no.nordicsemi.android.support.v18.scanner.ScanSettings;
/* renamed from: cQ3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39130cQ3 extends AbstractC43480jj5 {

    /* renamed from: a */
    public final PendingIntent f60612a;

    /* renamed from: b */
    public Context f60613b;

    /* renamed from: c */
    public Context f60614c;

    /* renamed from: d */
    public long f60615d;

    /* renamed from: e */
    public final long f60616e;

    public C39130cQ3(PendingIntent pendingIntent, ScanSettings scanSettings) {
        this.f60612a = pendingIntent;
        this.f60616e = scanSettings.m22419j();
    }

    @Override // p000.AbstractC43480jj5
    /* renamed from: a */
    public void mo30024a(List<ScanResult> list) {
        Context context = this.f60613b;
        if (context == null) {
            context = this.f60614c;
        }
        if (context == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f60615d > (elapsedRealtime - this.f60616e) + 5) {
            return;
        }
        this.f60615d = elapsedRealtime;
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1);
            intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList<>(list));
            intent.setExtrasClassLoader(ScanResult.class.getClassLoader());
            this.f60612a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // p000.AbstractC43480jj5
    /* renamed from: b */
    public void mo30023b(int i) {
        Context context = this.f60613b;
        if (context == null) {
            context = this.f60614c;
        }
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.ERROR_CODE", i);
            this.f60612a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // p000.AbstractC43480jj5
    /* renamed from: c */
    public void mo30022c(int i, ScanResult scanResult) {
        Context context = this.f60613b;
        if (context == null) {
            context = this.f60614c;
        }
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", i);
            intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList<>(Collections.singletonList(scanResult)));
            this.f60612a.send(context, 0, intent);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    /* renamed from: d */
    public void m61418d(Context context) {
        this.f60613b = context;
    }

    public C39130cQ3(PendingIntent pendingIntent, ScanSettings scanSettings, Service service) {
        this.f60612a = pendingIntent;
        this.f60616e = scanSettings.m22419j();
        this.f60614c = service;
    }
}
