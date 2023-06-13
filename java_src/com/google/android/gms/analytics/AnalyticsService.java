package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;
/* loaded from: classes5.dex */
public final class AnalyticsService extends Service implements zzfm {

    /* renamed from: b */
    public zzfn<AnalyticsService> f70288b;

    /* renamed from: a */
    public final zzfn<AnalyticsService> m51643a() {
        if (this.f70288b == null) {
            this.f70288b = new zzfn<>(this);
        }
        return this.f70288b;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        m51643a();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m51643a().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m51643a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        m51643a().zza(intent, i, i2);
        return 2;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final void zza(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
