package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
@TargetApi(24)
/* loaded from: classes6.dex */
public final class AppMeasurementJobService extends JobService implements PO8 {

    /* renamed from: b */
    public C37940aP8 f71512b;

    @Override // p000.PO8
    /* renamed from: a */
    public final boolean mo50592a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.PO8
    /* renamed from: b */
    public final void mo50591b(Intent intent) {
    }

    @Override // p000.PO8
    @TargetApi(24)
    /* renamed from: c */
    public final void mo50590c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: d */
    public final C37940aP8 m50594d() {
        if (this.f71512b == null) {
            this.f71512b = new C37940aP8(this);
        }
        return this.f71512b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m50594d().m71437e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m50594d().m71436f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m50594d().m71435g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m50594d().m71433i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m50594d().m71432j(intent);
        return true;
    }
}
