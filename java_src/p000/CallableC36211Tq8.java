package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaw;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Tq8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC36211Tq8 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ zzaw f36334b;

    /* renamed from: c */
    public final /* synthetic */ String f36335c;

    /* renamed from: d */
    public final /* synthetic */ BinderC39423cs8 f36336d;

    public CallableC36211Tq8(BinderC39423cs8 binderC39423cs8, zzaw zzawVar, String str) {
        this.f36336d = binderC39423cs8;
        this.f36334b = zzawVar;
        this.f36335c = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        C47508qW8 c47508qW8;
        C47141pt8 c47141pt8;
        C35941Sm8 c35941Sm8;
        String str;
        Bundle bundle;
        C47674qn8 c47674qn8;
        String str2;
        C47160pv7 m18423c;
        long j;
        byte[] bArr;
        C42162hV8 c42162hV83;
        c42162hV8 = this.f36336d.f75753a;
        c42162hV8.m36295b();
        c42162hV82 = this.f36336d.f75753a;
        YD8 m36291d0 = c42162hV82.m36291d0();
        zzaw zzawVar = this.f36334b;
        String str3 = this.f36335c;
        m36291d0.mo19953e();
        C35248Pn8.m89757q();
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str3);
        if (!m36291d0.f100966a.m89751w().m37502y(str3, C37795a98.f49955W)) {
            m36291d0.f100966a.mo22258a().m106894n().m42707b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if (!"_iap".equals(zzawVar.f71529b) && !"_iapx".equals(zzawVar.f71529b)) {
            m36291d0.f100966a.mo22258a().m106894n().m42706c("Generating a payload for this event is not available. package_name, event_name", str3, zzawVar.f71529b);
            return null;
        } else {
            C35941Sm8 m40816B = C41151fn8.m40816B();
            m36291d0.f15489b.m36300W().m11659e0();
            try {
                C47141pt8 m11672R = m36291d0.f15489b.m36300W().m11672R(str3);
                if (m11672R == null) {
                    m36291d0.f100966a.mo22258a().m106894n().m42707b("Log and bundle not available. package_name", str3);
                    bArr = new byte[0];
                    c42162hV83 = m36291d0.f15489b;
                } else if (!m11672R.m18503M()) {
                    m36291d0.f100966a.mo22258a().m106894n().m42707b("Log and bundle disabled. package_name", str3);
                    bArr = new byte[0];
                    c42162hV83 = m36291d0.f15489b;
                } else {
                    C47674qn8 m111630S1 = C32206Cn8.m111630S1();
                    m111630S1.m16989i0(1);
                    m111630S1.m16998d0("android");
                    if (!TextUtils.isEmpty(m11672R.m18472i0())) {
                        m111630S1.m17043B(m11672R.m18472i0());
                    }
                    if (!TextUtils.isEmpty(m11672R.m18468k0())) {
                        m111630S1.m17039D((String) Preconditions.checkNotNull(m11672R.m18468k0()));
                    }
                    if (!TextUtils.isEmpty(m11672R.m18466l0())) {
                        m111630S1.m17037G((String) Preconditions.checkNotNull(m11672R.m18466l0()));
                    }
                    if (m11672R.m18500P() != -2147483648L) {
                        m111630S1.m17035H((int) m11672R.m18500P());
                    }
                    m111630S1.m17006Z(m11672R.m18488a0());
                    m111630S1.m17017S(m11672R.m18491Y());
                    String m18462n0 = m11672R.m18462n0();
                    String m18476g0 = m11672R.m18476g0();
                    if (!TextUtils.isEmpty(m18462n0)) {
                        m111630S1.m17007Y(m18462n0);
                    } else if (!TextUtils.isEmpty(m18476g0)) {
                        m111630S1.m17045A(m18476g0);
                    }
                    Yg9.m74465b();
                    if (m36291d0.f100966a.m89751w().m37502y(null, C37795a98.f49936G0)) {
                        m111630S1.m16983r0(m11672R.m18480e0());
                    }
                    C37110Xm7 m36301V = m36291d0.f15489b.m36301V(str3);
                    m111630S1.m17024O(m11672R.m18492X());
                    if (m36291d0.f100966a.m89762l() && m36291d0.f100966a.m89751w().m37528B(m111630S1.m16975y0()) && m36301V.m76357i(EnumC39344cm7.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        m111630S1.m17020Q(null);
                    }
                    m111630S1.m17025N(m36301V.m76358h());
                    if (m36301V.m76357i(EnumC39344cm7.AD_STORAGE) && m11672R.m18504L()) {
                        Pair m79906k = m36291d0.f15489b.m36289e0().m79906k(m11672R.m18472i0(), m36301V);
                        if (m11672R.m18504L() && !TextUtils.isEmpty((CharSequence) m79906k.first)) {
                            try {
                                m111630S1.m16988k0(YD8.m75394b((String) m79906k.first, Long.toString(zzawVar.f71532e)));
                                Object obj = m79906k.second;
                                if (obj != null) {
                                    m111630S1.m17002b0(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e) {
                                m36291d0.f100966a.mo22258a().m106894n().m42707b("Resettable device id encryption failed", e.getMessage());
                                bArr = new byte[0];
                                c42162hV83 = m36291d0.f15489b;
                            }
                        }
                    }
                    m36291d0.f100966a.m89750x().m113419h();
                    m111630S1.m17022P(Build.MODEL);
                    m36291d0.f100966a.m89750x().m113419h();
                    m111630S1.m17000c0(Build.VERSION.RELEASE);
                    m111630S1.m16982s0((int) m36291d0.f100966a.m89750x().m99593m());
                    m111630S1.m16978w0(m36291d0.f100966a.m89750x().m99592n());
                    try {
                        if (m36301V.m76357i(EnumC39344cm7.ANALYTICS_STORAGE) && m11672R.m18470j0() != null) {
                            m111630S1.m17041C(YD8.m75394b((String) Preconditions.checkNotNull(m11672R.m18470j0()), Long.toString(zzawVar.f71532e)));
                        }
                        if (!TextUtils.isEmpty(m11672R.m18464m0())) {
                            m111630S1.m17009X((String) Preconditions.checkNotNull(m11672R.m18464m0()));
                        }
                        String m18472i0 = m11672R.m18472i0();
                        List m11661c0 = m36291d0.f15489b.m36300W().m11661c0(m18472i0);
                        Iterator it = m11661c0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c47508qW8 = (C47508qW8) it.next();
                                if ("_lte".equals(c47508qW8.f105373c)) {
                                    break;
                                }
                            } else {
                                c47508qW8 = null;
                                break;
                            }
                        }
                        if (c47508qW8 == null || c47508qW8.f105375e == null) {
                            C47508qW8 c47508qW82 = new C47508qW8(m18472i0, "auto", "_lte", m36291d0.f100966a.mo22260A().currentTimeMillis(), 0L);
                            m11661c0.add(c47508qW82);
                            m36291d0.f15489b.m36300W().m11643u(c47508qW82);
                        }
                        DV8 m36285g0 = m36291d0.f15489b.m36285g0();
                        m36285g0.f100966a.mo22258a().m106889s().m42708a("Checking account type status for ad personalization signals");
                        if (m36285g0.f100966a.m89750x().m99590p()) {
                            String m18472i02 = m11672R.m18472i0();
                            Preconditions.checkNotNull(m18472i02);
                            if (m11672R.m18504L() && m36285g0.f15489b.m36296a0().m91559y(m18472i02)) {
                                m36285g0.f100966a.mo22258a().m106894n().m42708a("Turning off ad personalization due to account type");
                                Iterator it2 = m11661c0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((C47508qW8) it2.next()).f105373c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                m11661c0.add(new C47508qW8(m18472i02, "auto", "_npa", m36285g0.f100966a.mo22260A().currentTimeMillis(), 1L));
                            }
                        }
                        C34096Kp8[] c34096Kp8Arr = new C34096Kp8[m11661c0.size()];
                        for (int i = 0; i < m11661c0.size(); i++) {
                            C52436yp8 m98256E = C34096Kp8.m98256E();
                            m98256E.m2515D(((C47508qW8) m11661c0.get(i)).f105373c);
                            m98256E.m2514G(((C47508qW8) m11661c0.get(i)).f105374d);
                            m36291d0.f15489b.m36285g0().m110334K(m98256E, ((C47508qW8) m11661c0.get(i)).f105375e);
                            c34096Kp8Arr[i] = (C34096Kp8) m98256E.m81476q();
                        }
                        m111630S1.m17023O0(Arrays.asList(c34096Kp8Arr));
                        C36319Uc8 m81227b = C36319Uc8.m81227b(zzawVar);
                        m36291d0.f100966a.m89776N().m92044w(m81227b.f37693d, m36291d0.f15489b.m36300W().m11673Q(str3));
                        m36291d0.f100966a.m89776N().m92040y(m81227b, m36291d0.f100966a.m89751w().m37516k(str3));
                        Bundle bundle2 = m81227b.f37693d;
                        bundle2.putLong("_c", 1L);
                        m36291d0.f100966a.mo22258a().m106894n().m42708a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzawVar.f71531d);
                        if (m36291d0.f100966a.m89776N().m92084U(m111630S1.m16975y0())) {
                            m36291d0.f100966a.m89776N().m92101D(bundle2, "_dbg", 1L);
                            m36291d0.f100966a.m89776N().m92101D(bundle2, "_r", 1L);
                        }
                        C47160pv7 m11668V = m36291d0.f15489b.m36300W().m11668V(str3, zzawVar.f71529b);
                        if (m11668V == null) {
                            c47674qn8 = m111630S1;
                            c47141pt8 = m11672R;
                            c35941Sm8 = m40816B;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            m18423c = new C47160pv7(str3, zzawVar.f71529b, 0L, 0L, 0L, zzawVar.f71532e, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            c47141pt8 = m11672R;
                            c35941Sm8 = m40816B;
                            str = str3;
                            bundle = bundle2;
                            c47674qn8 = m111630S1;
                            str2 = null;
                            long j2 = m11668V.f104329f;
                            m18423c = m11668V.m18423c(zzawVar.f71532e);
                            j = j2;
                        }
                        m36291d0.f15489b.m36300W().m11650n(m18423c);
                        C51892xu7 c51892xu7 = new C51892xu7(m36291d0.f100966a, zzawVar.f71531d, str, zzawVar.f71529b, zzawVar.f71532e, j, bundle);
                        C39936dk8 m18861F = C47051pk8.m18861F();
                        m18861F.m43796O(c51892xu7.f118331d);
                        m18861F.m43800I(c51892xu7.f118329b);
                        m18861F.m43797N(c51892xu7.f118332e);
                        C40647ew7 c40647ew7 = new C40647ew7(c51892xu7.f118333f);
                        while (c40647ew7.hasNext()) {
                            String next = c40647ew7.next();
                            C39946dl8 m18782F = C47061pl8.m18782F();
                            m18782F.m43763J(next);
                            Object m50586F = c51892xu7.f118333f.m50586F(next);
                            if (m50586F != null) {
                                m36291d0.f15489b.m36285g0().m110335J(m18782F, m50586F);
                                m18861F.m43804C(m18782F);
                            }
                        }
                        C47674qn8 c47674qn82 = c47674qn8;
                        c47674qn82.m17021P0(m18861F);
                        C35482Qn8 m18669B = C47091po8.m18669B();
                        C32413Dk8 m89874B = C35221Pk8.m89874B();
                        m89874B.m109985y(m18423c.f104326c);
                        m89874B.m109984z(zzawVar.f71529b);
                        m18669B.m87914y(m89874B);
                        c47674qn82.m16994f0(m18669B);
                        c47674qn82.m17030J0(m36291d0.f15489b.m36303T().m106760j(c47141pt8.m18472i0(), Collections.emptyList(), c47674qn82.m17040C0(), Long.valueOf(m18861F.m43806A()), Long.valueOf(m18861F.m43806A())));
                        if (m18861F.m43792U()) {
                            c47674qn82.m16984q0(m18861F.m43806A());
                            c47674qn82.m17014U(m18861F.m43806A());
                        }
                        long m18486b0 = c47141pt8.m18486b0();
                        int i2 = (m18486b0 > 0L ? 1 : (m18486b0 == 0L ? 0 : -1));
                        if (i2 != 0) {
                            c47674qn82.m16992g0(m18486b0);
                        }
                        long m18482d0 = c47141pt8.m18482d0();
                        if (m18482d0 != 0) {
                            c47674qn82.m16990h0(m18482d0);
                        } else if (i2 != 0) {
                            c47674qn82.m16990h0(m18486b0);
                        }
                        String m18485c = c47141pt8.m18485c();
                        C49423tk9.m11813b();
                        String str4 = str;
                        if (m36291d0.f100966a.m89751w().m37502y(str4, C37795a98.f49992q0) && m18485c != null) {
                            c47674qn82.m16985o0(m18485c);
                        }
                        c47141pt8.m18479f();
                        c47674qn82.m17033I((int) c47141pt8.m18484c0());
                        m36291d0.f100966a.m89751w().m37513n();
                        c47674qn82.m16980u0(77000L);
                        c47674qn82.m16981t0(m36291d0.f100966a.mo22260A().currentTimeMillis());
                        c47674qn82.m16986n0(true);
                        if (m36291d0.f100966a.m89751w().m37502y(str2, C37795a98.f50000u0)) {
                            m36291d0.f15489b.m36290e(c47674qn82.m16975y0(), c47674qn82);
                        }
                        C35941Sm8 c35941Sm82 = c35941Sm8;
                        c35941Sm82.m84847y(c47674qn82);
                        C47141pt8 c47141pt82 = c47141pt8;
                        c47141pt82.m18512D(c47674qn82.m17034H0());
                        c47141pt82.m18514B(c47674qn82.m17036G0());
                        m36291d0.f15489b.m36300W().m11651m(c47141pt82);
                        m36291d0.f15489b.m36300W().m11652l();
                        m36291d0.f15489b.m36300W().m11658f0();
                        try {
                            return m36291d0.f15489b.m36285g0().m110330O(((C41151fn8) c35941Sm82.m81476q()).m88653c());
                        } catch (IOException e2) {
                            m36291d0.f100966a.mo22258a().m106893o().m42706c("Data loss. Failed to bundle and serialize. appId", C32809Fc8.m106885w(str4), e2);
                            return str2;
                        }
                    } catch (SecurityException e3) {
                        m36291d0.f100966a.mo22258a().m106894n().m42707b("app instance id encryption failed", e3.getMessage());
                        byte[] bArr2 = new byte[0];
                        m36291d0.f15489b.m36300W().m11658f0();
                        return bArr2;
                    }
                }
                c42162hV83.m36300W().m11658f0();
                return bArr;
            } catch (Throwable th) {
                m36291d0.f15489b.m36300W().m11658f0();
                throw th;
            }
        }
    }
}
