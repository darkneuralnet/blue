package p000;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: aP8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37940aP8 {

    /* renamed from: a */
    public final Context f50439a;

    public C37940aP8(Context context) {
        Preconditions.checkNotNull(context);
        this.f50439a = context;
    }

    /* renamed from: a */
    public final int m71441a(final Intent intent, int i, final int i2) {
        C35248Pn8 m89782H = C35248Pn8.m89782H(this.f50439a, null, null);
        final C32809Fc8 mo22258a = m89782H.mo22258a();
        if (intent == null) {
            mo22258a.m106888t().m42708a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m89782H.mo22259C();
        mo22258a.m106889s().m42706c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m71434h(new Runnable() { // from class: tO8
                @Override // java.lang.Runnable
                public final void run() {
                    C37940aP8.this.m71439c(i2, mo22258a, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m71440b(Intent intent) {
        if (intent == null) {
            m71431k().m106893o().m42708a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC39423cs8(C42162hV8.m36287f0(this.f50439a), null);
        }
        m71431k().m106888t().m42707b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ void m71439c(int i, C32809Fc8 c32809Fc8, Intent intent) {
        if (((PO8) this.f50439a).mo50592a(i)) {
            c32809Fc8.m106889s().m42707b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m71431k().m106889s().m42708a("Completed wakeful intent.");
            ((PO8) this.f50439a).mo50591b(intent);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m71438d(C32809Fc8 c32809Fc8, JobParameters jobParameters) {
        c32809Fc8.m106889s().m42708a("AppMeasurementJobService processed last upload request.");
        ((PO8) this.f50439a).mo50590c(jobParameters, false);
    }

    /* renamed from: e */
    public final void m71437e() {
        C35248Pn8 m89782H = C35248Pn8.m89782H(this.f50439a, null, null);
        C32809Fc8 mo22258a = m89782H.mo22258a();
        m89782H.mo22259C();
        mo22258a.m106889s().m42708a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void m71436f() {
        C35248Pn8 m89782H = C35248Pn8.m89782H(this.f50439a, null, null);
        C32809Fc8 mo22258a = m89782H.mo22258a();
        m89782H.mo22259C();
        mo22258a.m106889s().m42708a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void m71435g(Intent intent) {
        if (intent == null) {
            m71431k().m106893o().m42708a("onRebind called with null intent");
            return;
        }
        m71431k().m106889s().m42707b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void m71434h(Runnable runnable) {
        C42162hV8 m36287f0 = C42162hV8.m36287f0(this.f50439a);
        m36287f0.mo22257c().m43695w(new EO8(this, m36287f0, runnable));
    }

    @TargetApi(24)
    /* renamed from: i */
    public final boolean m71433i(final JobParameters jobParameters) {
        C35248Pn8 m89782H = C35248Pn8.m89782H(this.f50439a, null, null);
        final C32809Fc8 mo22258a = m89782H.mo22258a();
        String string = jobParameters.getExtras().getString("action");
        m89782H.mo22259C();
        mo22258a.m106889s().m42707b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m71434h(new Runnable() { // from class: hO8
                @Override // java.lang.Runnable
                public final void run() {
                    C37940aP8.this.m71438d(mo22258a, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m71432j(Intent intent) {
        if (intent == null) {
            m71431k().m106893o().m42708a("onUnbind called with null intent");
            return true;
        }
        m71431k().m106889s().m42707b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: k */
    public final C32809Fc8 m71431k() {
        return C35248Pn8.m89782H(this.f50439a, null, null).mo22258a();
    }
}
