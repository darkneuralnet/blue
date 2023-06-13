package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
@VisibleForTesting
/* renamed from: QM8 */
/* loaded from: classes6.dex */
public final class QM8 extends AbstractC51140we8 {

    /* renamed from: c */
    public final EM8 f30283c;

    /* renamed from: d */
    public V98 f30284d;

    /* renamed from: e */
    public volatile Boolean f30285e;

    /* renamed from: f */
    public final AbstractC36228Ts7 f30286f;

    /* renamed from: g */
    public final C45091mR8 f30287g;

    /* renamed from: h */
    public final List f30288h;

    /* renamed from: i */
    public final AbstractC36228Ts7 f30289i;

    public QM8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f30288h = new ArrayList();
        this.f30287g = new C45091mR8(c35248Pn8.mo22260A());
        this.f30283c = new EM8(this);
        this.f30286f = new C43240jJ8(this, c35248Pn8);
        this.f30289i = new GJ8(this, c35248Pn8);
    }

    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m88568M(QM8 qm8, ComponentName componentName) {
        qm8.mo19953e();
        if (qm8.f30284d != null) {
            qm8.f30284d = null;
            qm8.f100966a.mo22258a().m106889s().m42707b("Disconnected from device MeasurementService", componentName);
            qm8.mo19953e();
            qm8.m88565P();
        }
    }

    /* renamed from: B */
    public final zzq m88578B(boolean z) {
        Pair m42620a;
        this.f100966a.mo22259C();
        C44579la8 m89749y = this.f100966a.m89749y();
        String str = null;
        if (z) {
            C32809Fc8 mo22258a = this.f100966a.mo22258a();
            if (mo22258a.f100966a.m89784F().f16065d != null && (m42620a = mo22258a.f100966a.m89784F().f16065d.m42620a()) != null && m42620a != C33556Ih8.f16063y) {
                str = String.valueOf(m42620a.second) + ":" + ((String) m42620a.first);
            }
        }
        return m89749y.m27128n(str);
    }

    /* renamed from: D */
    public final void m88577D() {
        mo19953e();
        this.f100966a.mo22258a().m106889s().m42707b("Processing queued up service tasks", Integer.valueOf(this.f30288h.size()));
        for (Runnable runnable : this.f30288h) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                this.f100966a.mo22258a().m106893o().m42707b("Task exception while flushing queue", e);
            }
        }
        this.f30288h.clear();
        this.f30289i.m82320b();
    }

    /* renamed from: E */
    public final void m88576E() {
        mo19953e();
        this.f30287g.m25615b();
        AbstractC36228Ts7 abstractC36228Ts7 = this.f30286f;
        this.f100966a.m89751w();
        abstractC36228Ts7.m82319d(((Long) C37795a98.f49944L.m97658a(null)).longValue());
    }

    /* renamed from: F */
    public final void m88575F(Runnable runnable) throws IllegalStateException {
        mo19953e();
        if (m88546w()) {
            runnable.run();
            return;
        }
        this.f100966a.m89751w();
        if (this.f30288h.size() >= 1000) {
            this.f100966a.mo22258a().m106893o().m42708a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f30288h.add(runnable);
        this.f30289i.m82319d(60000L);
        m88565P();
    }

    /* renamed from: G */
    public final boolean m88574G() {
        this.f100966a.mo22259C();
        return true;
    }

    /* renamed from: J */
    public final Boolean m88571J() {
        return this.f30285e;
    }

    /* renamed from: O */
    public final void m88566O() {
        mo19953e();
        m6551f();
        zzq m88578B = m88578B(true);
        this.f100966a.m89787B().m91999o();
        m88575F(new RunnableC52717zI8(this, m88578B));
    }

    /* renamed from: P */
    public final void m88565P() {
        mo19953e();
        m6551f();
        if (m88546w()) {
            return;
        }
        if (!m88544y()) {
            if (!this.f100966a.m89751w().m37524G()) {
                this.f100966a.mo22259C();
                List<ResolveInfo> queryIntentServices = this.f100966a.mo22255z().getPackageManager().queryIntentServices(new Intent().setClassName(this.f100966a.mo22255z(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context mo22255z = this.f100966a.mo22255z();
                    this.f100966a.mo22259C();
                    intent.setComponent(new ComponentName(mo22255z, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f30283c.m109108b(intent);
                    return;
                }
                this.f100966a.mo22258a().m106893o().m42708a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        this.f30283c.m109107c();
    }

    /* renamed from: Q */
    public final void m88564Q() {
        mo19953e();
        m6551f();
        this.f30283c.m109106d();
        try {
            ConnectionTracker.getInstance().unbindService(this.f100966a.mo22255z(), this.f30283c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f30284d = null;
    }

    /* renamed from: R */
    public final void m88563R(InterfaceC42134hS7 interfaceC42134hS7) {
        mo19953e();
        m6551f();
        m88575F(new RunnableC45603nI8(this, m88578B(false), interfaceC42134hS7));
    }

    /* renamed from: S */
    public final void m88562S(AtomicReference atomicReference) {
        mo19953e();
        m6551f();
        m88575F(new RunnableC38470bI8(this, atomicReference, m88578B(false)));
    }

    /* renamed from: T */
    public final void m88561T(InterfaceC42134hS7 interfaceC42134hS7, String str, String str2) {
        mo19953e();
        m6551f();
        m88575F(new ZK8(this, str, str2, m88578B(false), interfaceC42134hS7));
    }

    /* renamed from: U */
    public final void m88560U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo19953e();
        m6551f();
        m88575F(new NK8(this, atomicReference, null, str2, str3, m88578B(false)));
    }

    /* renamed from: V */
    public final void m88559V(InterfaceC42134hS7 interfaceC42134hS7, String str, String str2, boolean z) {
        mo19953e();
        m6551f();
        m88575F(new RunnableC52699zG8(this, str, str2, m88578B(false), z, interfaceC42134hS7));
    }

    /* renamed from: W */
    public final void m88558W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo19953e();
        m6551f();
        m88575F(new RunnableC44444lL8(this, atomicReference, null, str2, str3, m88578B(false), z));
    }

    @Override // p000.AbstractC51140we8
    /* renamed from: k */
    public final boolean mo6546k() {
        return false;
    }

    /* renamed from: l */
    public final void m88557l(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        mo19953e();
        m6551f();
        m88574G();
        m88575F(new RunnableC46807pK8(this, true, m88578B(true), this.f100966a.m89787B().m91995s(zzawVar), zzawVar, str));
    }

    /* renamed from: m */
    public final void m88556m(InterfaceC42134hS7 interfaceC42134hS7, zzaw zzawVar, String str) {
        mo19953e();
        m6551f();
        if (this.f100966a.m89776N().m92053r0(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            this.f100966a.mo22258a().m106888t().m42708a("Not bundling data. Service unavailable or out of date");
            this.f100966a.m89776N().m92097H(interfaceC42134hS7, new byte[0]);
            return;
        }
        m88575F(new RunnableC50354vJ8(this, zzawVar, str, interfaceC42134hS7));
    }

    /* renamed from: n */
    public final void m88555n() {
        mo19953e();
        m6551f();
        zzq m88578B = m88578B(false);
        m88574G();
        this.f100966a.m89787B().m92000n();
        m88575F(new PH8(this, m88578B));
    }

    @VisibleForTesting
    /* renamed from: o */
    public final void m88554o(V98 v98, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i;
        mo19953e();
        m6551f();
        m88574G();
        this.f100966a.m89751w();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List m92001m = this.f100966a.m89787B().m92001m(100);
            if (m92001m != null) {
                arrayList.addAll(m92001m);
                i = m92001m.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        v98.mo18052J2((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        this.f100966a.mo22258a().m106893o().m42707b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlj) {
                    try {
                        v98.mo18040z((zzlj) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        this.f100966a.mo22258a().m106893o().m42707b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        v98.mo18048R4((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        this.f100966a.mo22258a().m106893o().m42707b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f100966a.mo22258a().m106893o().m42708a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* renamed from: p */
    public final void m88553p(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        mo19953e();
        m6551f();
        this.f100966a.mo22259C();
        m88575F(new BK8(this, true, m88578B(true), this.f100966a.m89787B().m91996r(zzacVar), new zzac(zzacVar), zzacVar));
    }

    /* renamed from: q */
    public final void m88552q(boolean z) {
        mo19953e();
        m6551f();
        if (z) {
            m88574G();
            this.f100966a.m89787B().m92000n();
        }
        if (m88545x()) {
            m88575F(new RunnableC40284eK8(this, m88578B(false)));
        }
    }

    /* renamed from: r */
    public final void m88551r(C50902wE8 c50902wE8) {
        mo19953e();
        m6551f();
        m88575F(new LI8(this, c50902wE8));
    }

    /* renamed from: s */
    public final void m88550s(Bundle bundle) {
        mo19953e();
        m6551f();
        m88575F(new XI8(this, m88578B(false), bundle));
    }

    /* renamed from: t */
    public final void m88549t() {
        mo19953e();
        m6551f();
        m88575F(new SJ8(this, m88578B(true)));
    }

    @VisibleForTesting
    /* renamed from: u */
    public final void m88548u(V98 v98) {
        mo19953e();
        Preconditions.checkNotNull(v98);
        this.f30284d = v98;
        m88576E();
        m88577D();
    }

    /* renamed from: v */
    public final void m88547v(zzlj zzljVar) {
        mo19953e();
        m6551f();
        m88574G();
        m88575F(new DH8(this, m88578B(true), this.f100966a.m89787B().m91994t(zzljVar), zzljVar));
    }

    /* renamed from: w */
    public final boolean m88546w() {
        mo19953e();
        m6551f();
        if (this.f30284d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m88545x() {
        mo19953e();
        m6551f();
        if (!m88544y() || this.f100966a.m89776N().m92055q0() >= ((Integer) C37795a98.f49978j0.m97658a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m88544y() {
        Boolean valueOf;
        mo19953e();
        m6551f();
        if (this.f30285e == null) {
            mo19953e();
            m6551f();
            C33556Ih8 m89784F = this.f100966a.m89784F();
            m89784F.mo19953e();
            boolean z = false;
            if (!m89784F.m101802l().contains("use_service")) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(m89784F.m101802l().getBoolean("use_service", false));
            }
            boolean z2 = true;
            if (valueOf == null || !valueOf.booleanValue()) {
                this.f100966a.mo22259C();
                if (this.f100966a.m89749y().m27130l() != 1) {
                    this.f100966a.mo22258a().m106889s().m42708a("Checking service availability");
                    int m92053r0 = this.f100966a.m89776N().m92053r0(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (m92053r0 != 0) {
                        if (m92053r0 != 1) {
                            if (m92053r0 != 2) {
                                if (m92053r0 != 3) {
                                    if (m92053r0 != 9) {
                                        if (m92053r0 != 18) {
                                            this.f100966a.mo22258a().m106888t().m42707b("Unexpected service status", Integer.valueOf(m92053r0));
                                        } else {
                                            this.f100966a.mo22258a().m106888t().m42708a("Service updating");
                                        }
                                    } else {
                                        this.f100966a.mo22258a().m106888t().m42708a("Service invalid");
                                    }
                                } else {
                                    this.f100966a.mo22258a().m106888t().m42708a("Service disabled");
                                }
                                z2 = false;
                            } else {
                                this.f100966a.mo22258a().m106894n().m42708a("Service container out of date");
                                if (this.f100966a.m89776N().m92055q0() >= 17443) {
                                    if (valueOf != null) {
                                        z2 = false;
                                    }
                                    z = z2;
                                    z2 = false;
                                }
                            }
                        } else {
                            this.f100966a.mo22258a().m106889s().m42708a("Service missing");
                        }
                        if (z && this.f100966a.m89751w().m37524G()) {
                            this.f100966a.mo22258a().m106893o().m42708a("No way to upload. Consider using the full version of Analytics");
                        } else if (z2) {
                            C33556Ih8 m89784F2 = this.f100966a.m89784F();
                            m89784F2.mo19953e();
                            SharedPreferences.Editor edit = m89784F2.m101802l().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        z2 = z;
                    } else {
                        this.f100966a.mo22258a().m106889s().m42708a("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (z2) {
                }
                z2 = z;
            }
            this.f30285e = Boolean.valueOf(z2);
        }
        return this.f30285e.booleanValue();
    }
}
