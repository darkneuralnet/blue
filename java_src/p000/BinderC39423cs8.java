package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* renamed from: cs8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC39423cs8 extends F98 {

    /* renamed from: a */
    public final C42162hV8 f75753a;

    /* renamed from: b */
    public Boolean f75754b;

    /* renamed from: c */
    public String f75755c;

    public BinderC39423cs8(C42162hV8 c42162hV8, String str) {
        Preconditions.checkNotNull(c42162hV8);
        this.f75753a = c42162hV8;
        this.f75755c = null;
    }

    @Override // p000.V98
    /* renamed from: C0 */
    public final void mo18054C0(zzq zzqVar) {
        m44929j5(zzqVar, false);
        m44931i5(new RunnableC36904Wp8(this, zzqVar));
    }

    @Override // p000.V98
    /* renamed from: E */
    public final List mo44937E(zzq zzqVar, boolean z) {
        m44929j5(zzqVar, false);
        String str = zzqVar.f71541b;
        Preconditions.checkNotNull(str);
        try {
            List<C47508qW8> list = (List) this.f75753a.mo22257c().m43702p(new CallableC48307rr8(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C47508qW8 c47508qW8 : list) {
                if (z || !OW8.m92080Y(c47508qW8.f105373c)) {
                    arrayList.add(new zzlj(c47508qW8));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f75753a.mo22258a().m106893o().m42706c("Failed to get user properties. appId", C32809Fc8.m106885w(zzqVar.f71541b), e);
            return null;
        }
    }

    @Override // p000.V98
    /* renamed from: E0 */
    public final void mo18053E0(final Bundle bundle, zzq zzqVar) {
        m44929j5(zzqVar, false);
        final String str = zzqVar.f71541b;
        Preconditions.checkNotNull(str);
        m44931i5(new Runnable() { // from class: co8
            @Override // java.lang.Runnable
            public final void run() {
                BinderC39423cs8.this.m44932h5(str, bundle);
            }
        });
    }

    @Override // p000.V98
    /* renamed from: J2 */
    public final void mo18052J2(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        m44929j5(zzqVar, false);
        m44931i5(new RunnableC49482tq8(this, zzawVar, zzqVar));
    }

    @Override // p000.V98
    /* renamed from: O2 */
    public final void mo18051O2(long j, String str, String str2, String str3) {
        m44931i5(new RunnableC35518Qr8(this, str2, str3, str, j));
    }

    @Override // p000.V98
    /* renamed from: Q0 */
    public final List mo18050Q0(String str, String str2, String str3) {
        m44928k5(str, true);
        try {
            return (List) this.f75753a.mo22257c().m43702p(new CallableC51843xp8(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f75753a.mo22258a().m106893o().m42707b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // p000.V98
    /* renamed from: Q3 */
    public final List mo18049Q3(String str, String str2, String str3, boolean z) {
        m44928k5(str, true);
        try {
            List<C47508qW8> list = (List) this.f75753a.mo22257c().m43702p(new CallableC37597Zo8(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C47508qW8 c47508qW8 : list) {
                if (z || !OW8.m92080Y(c47508qW8.f105373c)) {
                    arrayList.add(new zzlj(c47508qW8));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f75753a.mo22258a().m106893o().m42706c("Failed to get user properties as. appId", C32809Fc8.m106885w(str), e);
            return Collections.emptyList();
        }
    }

    @Override // p000.V98
    /* renamed from: R4 */
    public final void mo18048R4(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.f71519d);
        m44929j5(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.f71517b = zzqVar.f71541b;
        m44931i5(new RunnableC46498oo8(this, zzacVar2, zzqVar));
    }

    @Override // p000.V98
    /* renamed from: X3 */
    public final byte[] mo18047X3(zzaw zzawVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzawVar);
        m44928k5(str, true);
        this.f75753a.mo22258a().m106894n().m42707b("Log and bundle. event", this.f75753a.m36299X().m17332d(zzawVar.f71529b));
        long nanoTime = this.f75753a.mo22260A().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f75753a.mo22257c().m43701q(new CallableC36211Tq8(this, zzawVar, str)).get();
            if (bArr == null) {
                this.f75753a.mo22258a().m106893o().m42707b("Log and bundle returned null. appId", C32809Fc8.m106885w(str));
                bArr = new byte[0];
            }
            this.f75753a.mo22258a().m106894n().m42705d("Log and bundle processed. event, size, time_ms", this.f75753a.m36299X().m17332d(zzawVar.f71529b), Integer.valueOf(bArr.length), Long.valueOf((this.f75753a.mo22260A().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f75753a.mo22258a().m106893o().m42705d("Failed to log and bundle. appId, event, error", C32809Fc8.m106885w(str), this.f75753a.m36299X().m17332d(zzawVar.f71529b), e);
            return null;
        }
    }

    @Override // p000.V98
    /* renamed from: a0 */
    public final void mo18046a0(zzq zzqVar) {
        m44929j5(zzqVar, false);
        m44931i5(new RunnableC32476Dr8(this, zzqVar));
    }

    @Override // p000.V98
    /* renamed from: d3 */
    public final List mo18045d3(String str, String str2, boolean z, zzq zzqVar) {
        m44929j5(zzqVar, false);
        String str3 = zzqVar.f71541b;
        Preconditions.checkNotNull(str3);
        try {
            List<C47508qW8> list = (List) this.f75753a.mo22257c().m43702p(new CallableC34555Mo8(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C47508qW8 c47508qW8 : list) {
                if (z || !OW8.m92080Y(c47508qW8.f105373c)) {
                    arrayList.add(new zzlj(c47508qW8));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f75753a.mo22258a().m106893o().m42706c("Failed to query user properties. appId", C32809Fc8.m106885w(zzqVar.f71541b), e);
            return Collections.emptyList();
        }
    }

    @Override // p000.V98
    /* renamed from: d4 */
    public final String mo18044d4(zzq zzqVar) {
        m44929j5(zzqVar, false);
        return this.f75753a.m36279j0(zzqVar);
    }

    /* renamed from: d5 */
    public final void m44936d5(zzaw zzawVar, zzq zzqVar) {
        this.f75753a.m36295b();
        this.f75753a.m36286g(zzawVar, zzqVar);
    }

    @VisibleForTesting
    /* renamed from: e5 */
    public final zzaw m44935e5(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if ("_cmp".equals(zzawVar.f71529b) && (zzauVar = zzawVar.f71530c) != null && zzauVar.zza() != 0) {
            String m50585K = zzawVar.f71530c.m50585K("_cis");
            if ("referrer broadcast".equals(m50585K) || "referrer API".equals(m50585K)) {
                this.f75753a.mo22258a().m106890r().m42707b("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.f71530c, zzawVar.f71531d, zzawVar.f71532e);
            }
        }
        return zzawVar;
    }

    /* renamed from: g5 */
    public final void m44933g5(zzaw zzawVar, zzq zzqVar) {
        C52186yP7 c52186yP7;
        if (!this.f75753a.m36296a0().m91586B(zzqVar.f71541b)) {
            m44936d5(zzawVar, zzqVar);
            return;
        }
        this.f75753a.mo22258a().m106889s().m42707b("EES config found for", zzqVar.f71541b);
        C34987Ok8 m36296a0 = this.f75753a.m36296a0();
        String str = zzqVar.f71541b;
        if (TextUtils.isEmpty(str)) {
            c52186yP7 = null;
        } else {
            c52186yP7 = (C52186yP7) m36296a0.f27191j.m8993d(str);
        }
        if (c52186yP7 != null) {
            try {
                Map m110336I = this.f75753a.m36285g0().m110336I(zzawVar.f71530c.m50583u(), true);
                String m42394a = C40628eu8.m42394a(zzawVar.f71529b);
                if (m42394a == null) {
                    m42394a = zzawVar.f71529b;
                }
                if (c52186yP7.m3518e(new C35175Pf7(m42394a, zzawVar.f71532e, m110336I))) {
                    if (c52186yP7.m3516g()) {
                        this.f75753a.mo22258a().m106889s().m42707b("EES edited event", zzawVar.f71529b);
                        m44936d5(this.f75753a.m36285g0().m110314x(c52186yP7.m3522a().m91683b()), zzqVar);
                    } else {
                        m44936d5(zzawVar, zzqVar);
                    }
                    if (c52186yP7.m3517f()) {
                        for (C35175Pf7 c35175Pf7 : c52186yP7.m3522a().m91682c()) {
                            this.f75753a.mo22258a().m106889s().m42707b("EES logging created event", c35175Pf7.m89960d());
                            m44936d5(this.f75753a.m36285g0().m110314x(c35175Pf7), zzqVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f75753a.mo22258a().m106893o().m42706c("EES error. appId, eventName", zzqVar.f71542c, zzawVar.f71529b);
            }
            this.f75753a.mo22258a().m106889s().m42707b("EES was not applied to event", zzawVar.f71529b);
            m44936d5(zzawVar, zzqVar);
            return;
        }
        this.f75753a.mo22258a().m106889s().m42707b("EES not loaded for", zzqVar.f71541b);
        m44936d5(zzawVar, zzqVar);
    }

    /* renamed from: h5 */
    public final /* synthetic */ void m44932h5(String str, Bundle bundle) {
        C49481tq7 m36300W = this.f75753a.m36300W();
        m36300W.mo19953e();
        m36300W.m83601f();
        byte[] m88653c = m36300W.f15489b.m36285g0().m110313y(new C51892xu7(m36300W.f100966a, "", str, "dep", 0L, 0L, bundle)).m88653c();
        m36300W.f100966a.mo22258a().m106889s().m42706c("Saving default event parameters, appId, data size", m36300W.f100966a.m89786D().m17332d(str), Integer.valueOf(m88653c.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, str);
        contentValues.put("parameters", m88653c);
        try {
            if (m36300W.m11674P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                m36300W.f100966a.mo22258a().m106893o().m42707b("Failed to insert default event parameters (got -1). appId", C32809Fc8.m106885w(str));
            }
        } catch (SQLiteException e) {
            m36300W.f100966a.mo22258a().m106893o().m42706c("Error storing default event parameters. appId", C32809Fc8.m106885w(str), e);
        }
    }

    @VisibleForTesting
    /* renamed from: i5 */
    public final void m44931i5(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f75753a.mo22257c().m43709B()) {
            runnable.run();
        } else {
            this.f75753a.mo22257c().m43695w(runnable);
        }
    }

    @Override // p000.V98
    /* renamed from: j2 */
    public final void mo44930j2(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.f71519d);
        Preconditions.checkNotEmpty(zzacVar.f71517b);
        m44928k5(zzacVar.f71517b, true);
        m44931i5(new RunnableC31747Ao8(this, new zzac(zzacVar)));
    }

    /* renamed from: j5 */
    public final void m44929j5(zzq zzqVar, boolean z) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        m44928k5(zzqVar.f71541b, false);
        this.f75753a.m36283h0().m92092M(zzqVar.f71542c, zzqVar.f71557r);
    }

    @Override // p000.V98
    /* renamed from: k0 */
    public final void mo18043k0(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        Preconditions.checkNotNull(zzqVar.f71562w);
        RunnableC42367hq8 runnableC42367hq8 = new RunnableC42367hq8(this, zzqVar);
        Preconditions.checkNotNull(runnableC42367hq8);
        if (this.f75753a.mo22257c().m43709B()) {
            runnableC42367hq8.run();
        } else {
            this.f75753a.mo22257c().m43694x(runnableC42367hq8);
        }
    }

    /* renamed from: k5 */
    public final void m44928k5(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f75754b == null) {
                        if (!"com.google.android.gms".equals(this.f75755c) && !UidVerifier.isGooglePlayServicesUid(this.f75753a.mo22255z(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.f75753a.mo22255z()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z2 = false;
                            this.f75754b = Boolean.valueOf(z2);
                        }
                        z2 = true;
                        this.f75754b = Boolean.valueOf(z2);
                    }
                    if (this.f75754b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f75753a.mo22258a().m106893o().m42707b("Measurement Service called with invalid calling package. appId", C32809Fc8.m106885w(str));
                    throw e;
                }
            }
            if (this.f75755c == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f75753a.mo22255z(), Binder.getCallingUid(), str)) {
                this.f75755c = str;
            }
            if (str.equals(this.f75755c)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.f75753a.mo22258a().m106893o().m42708a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // p000.V98
    /* renamed from: q0 */
    public final void mo18042q0(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        m44928k5(zzqVar.f71541b, false);
        m44931i5(new RunnableC33862Jp8(this, zzqVar));
    }

    @Override // p000.V98
    /* renamed from: t4 */
    public final List mo18041t4(String str, String str2, zzq zzqVar) {
        m44929j5(zzqVar, false);
        String str3 = zzqVar.f71541b;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.f75753a.mo22257c().m43702p(new CallableC44729lp8(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f75753a.mo22258a().m106893o().m42707b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // p000.V98
    /* renamed from: z */
    public final void mo18040z(zzlj zzljVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzljVar);
        m44929j5(zzqVar, false);
        m44931i5(new RunnableC41191fr8(this, zzljVar, zzqVar));
    }

    @Override // p000.V98
    /* renamed from: z4 */
    public final void mo44927z4(zzaw zzawVar, String str, String str2) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        m44928k5(str, true);
        m44931i5(new RunnableC32935Fq8(this, zzawVar, str));
    }
}
