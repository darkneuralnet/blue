package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
@DynamiteApi
/* loaded from: classes6.dex */
public class AppMeasurementDynamiteService extends YQ7 {
    @VisibleForTesting

    /* renamed from: a */
    public C35248Pn8 f71515a = null;

    /* renamed from: b */
    public final Map f71516b = new C28385so();

    @Override // p000.InterfaceC45683nR7
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.f71515a.m89752v().m71230i(str, j);
    }

    @Override // p000.InterfaceC45683nR7
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.f71515a.m89781I().m87163l(str, str2, bundle);
    }

    @Override // p000.InterfaceC45683nR7
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.f71515a.m89781I().m87187I(null);
    }

    /* renamed from: d5 */
    public final void m50588d5(InterfaceC42134hS7 interfaceC42134hS7, String str) {
        zzb();
        this.f71515a.m89776N().m92094K(interfaceC42134hS7, str);
    }

    @Override // p000.InterfaceC45683nR7
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.f71515a.m89752v().m71229j(str, j);
    }

    @Override // p000.InterfaceC45683nR7
    public void generateEventId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        long m92049t0 = this.f71515a.m89776N().m92049t0();
        zzb();
        this.f71515a.m89776N().m92095J(interfaceC42134hS7, m92049t0);
    }

    @Override // p000.InterfaceC45683nR7
    public void getAppInstanceId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        this.f71515a.mo22257c().m43695w(new RunnableC47310qA8(this, interfaceC42134hS7));
    }

    @Override // p000.InterfaceC45683nR7
    public void getCachedAppInstanceId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        m50588d5(interfaceC42134hS7, this.f71515a.m89781I().m87174V());
    }

    @Override // p000.InterfaceC45683nR7
    public void getConditionalUserProperties(String str, String str2, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        this.f71515a.mo22257c().m43695w(new RunnableC45163mZ8(this, interfaceC42134hS7, str, str2));
    }

    @Override // p000.InterfaceC45683nR7
    public void getCurrentScreenClass(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        m50588d5(interfaceC42134hS7, this.f71515a.m89781I().m87173W());
    }

    @Override // p000.InterfaceC45683nR7
    public void getCurrentScreenName(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        m50588d5(interfaceC42134hS7, this.f71515a.m89781I().m87172X());
    }

    @Override // p000.InterfaceC45683nR7
    public void getGmpAppId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        String str;
        zzb();
        RC8 m89781I = this.f71515a.m89781I();
        if (m89781I.f100966a.m89775O() != null) {
            str = m89781I.f100966a.m89775O();
        } else {
            try {
                str = C43195jE8.m30953c(m89781I.f100966a.mo22255z(), "google_app_id", m89781I.f100966a.m89772R());
            } catch (IllegalStateException e) {
                m89781I.f100966a.mo22258a().m106893o().m42707b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m50588d5(interfaceC42134hS7, str);
    }

    @Override // p000.InterfaceC45683nR7
    public void getMaxUserProperties(String str, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        this.f71515a.m89781I().m87179Q(str);
        zzb();
        this.f71515a.m89776N().m92096I(interfaceC42134hS7, 25);
    }

    @Override // p000.InterfaceC45683nR7
    public void getSessionId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        RC8 m89781I = this.f71515a.m89781I();
        m89781I.f100966a.mo22257c().m43695w(new RunnableC50757vz8(m89781I, interfaceC42134hS7));
    }

    @Override // p000.InterfaceC45683nR7
    public void getTestFlag(InterfaceC42134hS7 interfaceC42134hS7, int i) throws RemoteException {
        zzb();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        this.f71515a.m89776N().m92100E(interfaceC42134hS7, this.f71515a.m89781I().m87178R().booleanValue());
                        return;
                    }
                    this.f71515a.m89776N().m92096I(interfaceC42134hS7, this.f71515a.m89781I().m87176T().intValue());
                    return;
                }
                OW8 m89776N = this.f71515a.m89776N();
                double doubleValue = this.f71515a.m89781I().m87177S().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    interfaceC42134hS7.mo30653W0(bundle);
                    return;
                } catch (RemoteException e) {
                    m89776N.f100966a.mo22258a().m106888t().m42707b("Error returning double value to wrapper", e);
                    return;
                }
            }
            this.f71515a.m89776N().m92095J(interfaceC42134hS7, this.f71515a.m89781I().m87175U().longValue());
            return;
        }
        this.f71515a.m89776N().m92094K(interfaceC42134hS7, this.f71515a.m89781I().m87171Y());
    }

    @Override // p000.InterfaceC45683nR7
    public void getUserProperties(String str, String str2, boolean z, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        this.f71515a.mo22257c().m43695w(new RunnableC50390vN8(this, interfaceC42134hS7, str, str2, z));
    }

    @Override // p000.InterfaceC45683nR7
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // p000.InterfaceC45683nR7
    public void initialize(WO1 wo1, zzcl zzclVar, long j) throws RemoteException {
        C35248Pn8 c35248Pn8 = this.f71515a;
        if (c35248Pn8 == null) {
            this.f71515a = C35248Pn8.m89782H((Context) Preconditions.checkNotNull((Context) BinderC36557Vd3.m79637d5(wo1)), zzclVar, Long.valueOf(j));
        } else {
            c35248Pn8.mo22258a().m106888t().m42708a("Attempting to initialize multiple times");
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void isDataCollectionEnabled(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException {
        zzb();
        this.f71515a.mo22257c().m43695w(new N49(this, interfaceC42134hS7));
    }

    @Override // p000.InterfaceC45683nR7
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.f71515a.m89781I().m87159p(str, str2, bundle, z, z2, j);
    }

    @Override // p000.InterfaceC45683nR7
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC42134hS7 interfaceC42134hS7, long j) throws RemoteException {
        Bundle bundle2;
        zzb();
        Preconditions.checkNotEmpty(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", Stripe3ds2AuthParams.FIELD_APP);
        this.f71515a.mo22257c().m43695w(new VG8(this, interfaceC42134hS7, new zzaw(str2, new zzau(bundle), Stripe3ds2AuthParams.FIELD_APP, j), str));
    }

    @Override // p000.InterfaceC45683nR7
    public void logHealthData(int i, String str, WO1 wo1, WO1 wo12, WO1 wo13) throws RemoteException {
        Object m79637d5;
        Object m79637d52;
        zzb();
        Object obj = null;
        if (wo1 == null) {
            m79637d5 = null;
        } else {
            m79637d5 = BinderC36557Vd3.m79637d5(wo1);
        }
        if (wo12 == null) {
            m79637d52 = null;
        } else {
            m79637d52 = BinderC36557Vd3.m79637d5(wo12);
        }
        if (wo13 != null) {
            obj = BinderC36557Vd3.m79637d5(wo13);
        }
        this.f71515a.mo22258a().m106897G(i, true, false, str, m79637d5, m79637d52, obj);
    }

    @Override // p000.InterfaceC45683nR7
    public void onActivityCreated(WO1 wo1, Bundle bundle, long j) throws RemoteException {
        zzb();
        GC8 gc8 = this.f71515a.m89781I().f31673c;
        if (gc8 != null) {
            this.f71515a.m89781I().m87162m();
            gc8.onActivityCreated((Activity) BinderC36557Vd3.m79637d5(wo1), bundle);
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void onActivityDestroyed(WO1 wo1, long j) throws RemoteException {
        zzb();
        GC8 gc8 = this.f71515a.m89781I().f31673c;
        if (gc8 != null) {
            this.f71515a.m89781I().m87162m();
            gc8.onActivityDestroyed((Activity) BinderC36557Vd3.m79637d5(wo1));
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void onActivityPaused(WO1 wo1, long j) throws RemoteException {
        zzb();
        GC8 gc8 = this.f71515a.m89781I().f31673c;
        if (gc8 != null) {
            this.f71515a.m89781I().m87162m();
            gc8.onActivityPaused((Activity) BinderC36557Vd3.m79637d5(wo1));
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void onActivityResumed(WO1 wo1, long j) throws RemoteException {
        zzb();
        GC8 gc8 = this.f71515a.m89781I().f31673c;
        if (gc8 != null) {
            this.f71515a.m89781I().m87162m();
            gc8.onActivityResumed((Activity) BinderC36557Vd3.m79637d5(wo1));
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void onActivitySaveInstanceState(WO1 wo1, InterfaceC42134hS7 interfaceC42134hS7, long j) throws RemoteException {
        zzb();
        GC8 gc8 = this.f71515a.m89781I().f31673c;
        Bundle bundle = new Bundle();
        if (gc8 != null) {
            this.f71515a.m89781I().m87162m();
            gc8.onActivitySaveInstanceState((Activity) BinderC36557Vd3.m79637d5(wo1), bundle);
        }
        try {
            interfaceC42134hS7.mo30653W0(bundle);
        } catch (RemoteException e) {
            this.f71515a.mo22258a().m106888t().m42707b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void onActivityStarted(WO1 wo1, long j) throws RemoteException {
        zzb();
        if (this.f71515a.m89781I().f31673c != null) {
            this.f71515a.m89781I().m87162m();
            Activity activity = (Activity) BinderC36557Vd3.m79637d5(wo1);
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void onActivityStopped(WO1 wo1, long j) throws RemoteException {
        zzb();
        if (this.f71515a.m89781I().f31673c != null) {
            this.f71515a.m89781I().m87162m();
            Activity activity = (Activity) BinderC36557Vd3.m79637d5(wo1);
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void performAction(Bundle bundle, InterfaceC42134hS7 interfaceC42134hS7, long j) throws RemoteException {
        zzb();
        interfaceC42134hS7.mo30653W0(null);
    }

    @Override // p000.InterfaceC45683nR7
    public void registerOnMeasurementEventListener(InterfaceC38568bT7 interfaceC38568bT7) throws RemoteException {
        InterfaceC41231fv8 interfaceC41231fv8;
        zzb();
        synchronized (this.f71516b) {
            interfaceC41231fv8 = (InterfaceC41231fv8) this.f71516b.get(Integer.valueOf(interfaceC38568bT7.zzd()));
            if (interfaceC41231fv8 == null) {
                interfaceC41231fv8 = new C45203md9(this, interfaceC38568bT7);
                this.f71516b.put(Integer.valueOf(interfaceC38568bT7.zzd()), interfaceC41231fv8);
            }
        }
        this.f71515a.m89781I().m87154u(interfaceC41231fv8);
    }

    @Override // p000.InterfaceC45683nR7
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.f71515a.m89781I().m87153v(j);
    }

    @Override // p000.InterfaceC45683nR7
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.f71515a.mo22258a().m106893o().m42708a("Conditional user property must not be null");
        } else {
            this.f71515a.m89781I().m87191E(bundle, j);
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void setConsent(final Bundle bundle, final long j) throws RemoteException {
        zzb();
        final RC8 m89781I = this.f71515a.m89781I();
        m89781I.f100966a.mo22257c().m43694x(new Runnable() { // from class: Uv8
            @Override // java.lang.Runnable
            public final void run() {
                RC8 rc8 = RC8.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(rc8.f100966a.m89749y().m27125q())) {
                    rc8.m87190F(bundle2, 0, j2);
                } else {
                    rc8.f100966a.mo22258a().m106887u().m42708a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // p000.InterfaceC45683nR7
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.f71515a.m89781I().m87190F(bundle, -20, j);
    }

    @Override // p000.InterfaceC45683nR7
    public void setCurrentScreen(WO1 wo1, String str, String str2, long j) throws RemoteException {
        zzb();
        this.f71515a.m89779K().m24015D((Activity) BinderC36557Vd3.m79637d5(wo1), str, str2);
    }

    @Override // p000.InterfaceC45683nR7
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        RC8 m89781I = this.f71515a.m89781I();
        m89781I.m6551f();
        m89781I.f100966a.mo22257c().m43695w(new RunnableC43177jC8(m89781I, z));
    }

    @Override // p000.InterfaceC45683nR7
    public void setDefaultEventParameters(Bundle bundle) {
        final Bundle bundle2;
        zzb();
        final RC8 m89781I = this.f71515a.m89781I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        m89781I.f100966a.mo22257c().m43695w(new Runnable() { // from class: hw8
            @Override // java.lang.Runnable
            public final void run() {
                RC8.this.m87161n(bundle2);
            }
        });
    }

    @Override // p000.InterfaceC45683nR7
    public void setEventInterceptor(InterfaceC38568bT7 interfaceC38568bT7) throws RemoteException {
        zzb();
        C45522n99 c45522n99 = new C45522n99(this, interfaceC38568bT7);
        if (this.f71515a.mo22257c().m43709B()) {
            this.f71515a.m89781I().m87188H(c45522n99);
        } else {
            this.f71515a.mo22257c().m43695w(new RunnableC52223yT8(this, c45522n99));
        }
    }

    @Override // p000.InterfaceC45683nR7
    public void setInstanceIdProvider(ET7 et7) throws RemoteException {
        zzb();
    }

    @Override // p000.InterfaceC45683nR7
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.f71515a.m89781I().m87187I(Boolean.valueOf(z));
    }

    @Override // p000.InterfaceC45683nR7
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // p000.InterfaceC45683nR7
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        RC8 m89781I = this.f71515a.m89781I();
        m89781I.f100966a.mo22257c().m43695w(new RunnableC42437hx8(m89781I, j));
    }

    @Override // p000.InterfaceC45683nR7
    public void setUserId(final String str, long j) throws RemoteException {
        zzb();
        final RC8 m89781I = this.f71515a.m89781I();
        if (str != null && TextUtils.isEmpty(str)) {
            m89781I.f100966a.mo22258a().m106888t().m42708a("User ID must be non-empty or null");
            return;
        }
        m89781I.f100966a.mo22257c().m43695w(new Runnable() { // from class: vw8
            @Override // java.lang.Runnable
            public final void run() {
                RC8 rc8 = RC8.this;
                if (rc8.f100966a.m89749y().m27122t(str)) {
                    rc8.f100966a.m89749y().m27123s();
                }
            }
        });
        m89781I.m87184L(null, TransferTable.COLUMN_ID, str, true, j);
    }

    @Override // p000.InterfaceC45683nR7
    public void setUserProperty(String str, String str2, WO1 wo1, boolean z, long j) throws RemoteException {
        zzb();
        this.f71515a.m89781I().m87184L(str, str2, BinderC36557Vd3.m79637d5(wo1), z, j);
    }

    @Override // p000.InterfaceC45683nR7
    public void unregisterOnMeasurementEventListener(InterfaceC38568bT7 interfaceC38568bT7) throws RemoteException {
        InterfaceC41231fv8 interfaceC41231fv8;
        zzb();
        synchronized (this.f71516b) {
            interfaceC41231fv8 = (InterfaceC41231fv8) this.f71516b.remove(Integer.valueOf(interfaceC38568bT7.zzd()));
        }
        if (interfaceC41231fv8 == null) {
            interfaceC41231fv8 = new C45203md9(this, interfaceC38568bT7);
        }
        this.f71515a.m89781I().m87182N(interfaceC41231fv8);
    }

    public final void zzb() {
        if (this.f71515a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
