package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
/* loaded from: classes6.dex */
public final class AppMeasurementService extends Service implements PO8 {

    /* renamed from: b */
    public C37940aP8 f71514b;

    @Override // p000.PO8
    /* renamed from: a */
    public final boolean mo50592a(int i) {
        return stopSelfResult(i);
    }

    @Override // p000.PO8
    /* renamed from: b */
    public final void mo50591b(Intent intent) {
        WakefulBroadcastReceiver.m67051b(intent);
    }

    @Override // p000.PO8
    /* renamed from: c */
    public final void mo50590c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final C37940aP8 m50589d() {
        if (this.f71514b == null) {
            this.f71514b = new C37940aP8(this);
        }
        return this.f71514b;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m50589d().m71440b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m50589d().m71437e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m50589d().m71436f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m50589d().m71435g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        m50589d().m71441a(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m50589d().m71432j(intent);
        return true;
    }
}
