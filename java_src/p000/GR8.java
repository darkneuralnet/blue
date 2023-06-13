package p000;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
/* renamed from: GR8 */
/* loaded from: classes6.dex */
public final class GR8 extends TR8 {

    /* renamed from: d */
    public final AlarmManager f11937d;

    /* renamed from: e */
    public AbstractC36228Ts7 f11938e;

    /* renamed from: f */
    public Integer f11939f;

    public GR8(C42162hV8 c42162hV8) {
        super(c42162hV8);
        this.f11937d = (AlarmManager) this.f100966a.mo22255z().getSystemService("alarm");
    }

    @Override // p000.TR8
    /* renamed from: i */
    public final boolean mo11655i() {
        AlarmManager alarmManager = this.f11937d;
        if (alarmManager != null) {
            alarmManager.cancel(m105086m());
        }
        m105084o();
        return false;
    }

    /* renamed from: j */
    public final void m105089j() {
        m83601f();
        this.f100966a.mo22258a().m106889s().m42708a("Unscheduling upload");
        AlarmManager alarmManager = this.f11937d;
        if (alarmManager != null) {
            alarmManager.cancel(m105086m());
        }
        m105085n().m82320b();
        m105084o();
    }

    /* renamed from: k */
    public final void m105088k(long j) {
        m83601f();
        this.f100966a.mo22259C();
        Context mo22255z = this.f100966a.mo22255z();
        if (!OW8.m92078a0(mo22255z)) {
            this.f100966a.mo22258a().m106894n().m42708a("Receiver not registered/enabled");
        }
        if (!OW8.m92077b0(mo22255z, false)) {
            this.f100966a.mo22258a().m106894n().m42708a("Service not registered/enabled");
        }
        m105089j();
        this.f100966a.mo22258a().m106889s().m42707b("Scheduling upload, millis", Long.valueOf(j));
        this.f100966a.mo22260A().elapsedRealtime();
        this.f100966a.m89751w();
        if (j < Math.max(0L, ((Long) C37795a98.f50009z.m97658a(null)).longValue()) && !m105085n().m82318e()) {
            m105085n().m82319d(j);
        }
        this.f100966a.mo22259C();
        Context mo22255z2 = this.f100966a.mo22255z();
        ComponentName componentName = new ComponentName(mo22255z2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m105087l = m105087l();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        C52168yN7.m3531a(mo22255z2, new JobInfo.Builder(m105087l, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* renamed from: l */
    public final int m105087l() {
        if (this.f11939f == null) {
            this.f11939f = Integer.valueOf("measurement".concat(String.valueOf(this.f100966a.mo22255z().getPackageName())).hashCode());
        }
        return this.f11939f.intValue();
    }

    /* renamed from: m */
    public final PendingIntent m105086m() {
        Context mo22255z = this.f100966a.mo22255z();
        return PendingIntent.getBroadcast(mo22255z, 0, new Intent().setClassName(mo22255z, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C42682iN7.f87224a);
    }

    /* renamed from: n */
    public final AbstractC36228Ts7 m105085n() {
        if (this.f11938e == null) {
            this.f11938e = new C51019wR8(this, this.f15489b.m36293c0());
        }
        return this.f11938e;
    }

    @TargetApi(24)
    /* renamed from: o */
    public final void m105084o() {
        JobScheduler jobScheduler = (JobScheduler) this.f100966a.mo22255z().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m105087l());
        }
    }
}
