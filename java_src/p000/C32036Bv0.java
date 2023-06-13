package p000;

import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;
/* renamed from: Bv0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32036Bv0 {

    /* renamed from: d */
    public static final C10776ad f3033d = C10776ad.m71007e();

    /* renamed from: e */
    public static volatile C32036Bv0 f3034e;

    /* renamed from: a */
    public final RemoteConfigManager f3035a;

    /* renamed from: b */
    public PY1 f3036b;

    /* renamed from: c */
    public C42479i21 f3037c;

    public C32036Bv0(RemoteConfigManager remoteConfigManager, PY1 py1, C42479i21 c42479i21) {
        this.f3035a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f3036b = py1 == null ? new PY1() : py1;
        this.f3037c = c42479i21 == null ? C42479i21.m35346e() : c42479i21;
    }

    /* renamed from: g */
    public static synchronized C32036Bv0 m113351g() {
        C32036Bv0 c32036Bv0;
        synchronized (C32036Bv0.class) {
            if (f3034e == null) {
                f3034e = new C32036Bv0(null, null, null);
            }
            c32036Bv0 = f3034e;
        }
        return c32036Bv0;
    }

    /* renamed from: A */
    public long m113373A() {
        C49544tx0 m11170e = C49544tx0.m11170e();
        C43628jy3<Long> m113342p = m113342p(m11170e);
        if (m113342p.m29582d() && m113361M(m113342p.m29583c().longValue())) {
            return m113342p.m29583c().longValue();
        }
        C43628jy3<Long> m113335w = m113335w(m11170e);
        if (m113335w.m29582d() && m113361M(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m11170e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m11170e);
        if (m113354d.m29582d() && m113361M(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m11170e.m11171d().longValue();
    }

    /* renamed from: B */
    public long m113372B() {
        C50137ux0 m9442e = C50137ux0.m9442e();
        C43628jy3<Long> m113342p = m113342p(m9442e);
        if (m113342p.m29582d() && m113364J(m113342p.m29583c().longValue())) {
            return m113342p.m29583c().longValue();
        }
        C43628jy3<Long> m113335w = m113335w(m9442e);
        if (m113335w.m29582d() && m113364J(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m9442e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m9442e);
        if (m113354d.m29582d() && m113364J(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m9442e.m9443d().longValue();
    }

    /* renamed from: C */
    public long m113371C() {
        C50729vx0 m7723e = C50729vx0.m7723e();
        C43628jy3<Long> m113342p = m113342p(m7723e);
        if (m113342p.m29582d() && m113364J(m113342p.m29583c().longValue())) {
            return m113342p.m29583c().longValue();
        }
        C43628jy3<Long> m113335w = m113335w(m7723e);
        if (m113335w.m29582d() && m113364J(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m7723e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m7723e);
        if (m113354d.m29582d() && m113364J(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m7723e.m7724d().longValue();
    }

    /* renamed from: D */
    public double m113370D() {
        C51322wx0 m6071e = C51322wx0.m6071e();
        C43628jy3<Double> m113343o = m113343o(m6071e);
        if (m113343o.m29582d()) {
            double doubleValue = m113343o.m29583c().doubleValue() / 100.0d;
            if (m113362L(doubleValue)) {
                return doubleValue;
            }
        }
        C43628jy3<Double> m113336v = m113336v(m6071e);
        if (m113336v.m29582d() && m113362L(m113336v.m29583c().doubleValue())) {
            this.f3037c.m35341j(m6071e.mo89a(), m113336v.m29583c().doubleValue());
            return m113336v.m29583c().doubleValue();
        }
        C43628jy3<Double> m113355c = m113355c(m6071e);
        if (m113355c.m29582d() && m113362L(m113355c.m29583c().doubleValue())) {
            return m113355c.m29583c().doubleValue();
        }
        return m6071e.m6072d().doubleValue();
    }

    /* renamed from: E */
    public long m113369E() {
        C51915xx0 m4412e = C51915xx0.m4412e();
        C43628jy3<Long> m113335w = m113335w(m4412e);
        if (m113335w.m29582d() && m113366H(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m4412e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m4412e);
        if (m113354d.m29582d() && m113366H(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m4412e.m4413d().longValue();
    }

    /* renamed from: F */
    public long m113368F() {
        C52508yx0 m2227e = C52508yx0.m2227e();
        C43628jy3<Long> m113335w = m113335w(m2227e);
        if (m113335w.m29582d() && m113366H(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m2227e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m2227e);
        if (m113354d.m29582d() && m113366H(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m2227e.m2228d().longValue();
    }

    /* renamed from: G */
    public double m113367G() {
        C53101zx0 m86e = C53101zx0.m86e();
        C43628jy3<Double> m113336v = m113336v(m86e);
        if (m113336v.m29582d() && m113362L(m113336v.m29583c().doubleValue())) {
            this.f3037c.m35341j(m86e.mo89a(), m113336v.m29583c().doubleValue());
            return m113336v.m29583c().doubleValue();
        }
        C43628jy3<Double> m113355c = m113355c(m86e);
        if (m113355c.m29582d() && m113362L(m113355c.m29583c().doubleValue())) {
            return m113355c.m29583c().doubleValue();
        }
        return m86e.m87d().doubleValue();
    }

    /* renamed from: H */
    public final boolean m113366H(long j) {
        return j >= 0;
    }

    /* renamed from: I */
    public final boolean m113365I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(U30.f36765b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m113364J(long j) {
        return j >= 0;
    }

    /* renamed from: K */
    public boolean m113363K() {
        Boolean m113348j = m113348j();
        if ((m113348j == null || m113348j.booleanValue()) && m113345m()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m113362L(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    /* renamed from: M */
    public final boolean m113361M(long j) {
        return j > 0;
    }

    /* renamed from: N */
    public final boolean m113360N(long j) {
        return j > 0;
    }

    /* renamed from: O */
    public void m113359O(Context context) {
        f3033d.m71003i(C35435Qi6.m88157b(context));
        this.f3037c.m35342i(context);
    }

    /* renamed from: P */
    public void m113358P(PY1 py1) {
        this.f3036b = py1;
    }

    /* renamed from: a */
    public String m113357a() {
        String m28096f;
        C44208kx0 m28097e = C44208kx0.m28097e();
        if (U30.f36764a.booleanValue()) {
            return m28097e.m28098d();
        }
        String mo88c = m28097e.mo88c();
        long j = -1;
        if (mo88c != null) {
            j = ((Long) this.f3035a.getRemoteConfigValueOrDefault(mo88c, -1L)).longValue();
        }
        String mo89a = m28097e.mo89a();
        if (C44208kx0.m28095g(j) && (m28096f = C44208kx0.m28096f(j)) != null) {
            this.f3037c.m35339l(mo89a, m28096f);
            return m28096f;
        }
        C43628jy3<String> m113353e = m113353e(m28097e);
        if (m113353e.m29582d()) {
            return m113353e.m29583c();
        }
        return m28097e.m28098d();
    }

    /* renamed from: b */
    public final C43628jy3<Boolean> m113356b(AbstractC31820Ax0<Boolean> abstractC31820Ax0) {
        return this.f3037c.m35349b(abstractC31820Ax0.mo89a());
    }

    /* renamed from: c */
    public final C43628jy3<Double> m113355c(AbstractC31820Ax0<Double> abstractC31820Ax0) {
        return this.f3037c.m35348c(abstractC31820Ax0.mo89a());
    }

    /* renamed from: d */
    public final C43628jy3<Long> m113354d(AbstractC31820Ax0<Long> abstractC31820Ax0) {
        return this.f3037c.m35345f(abstractC31820Ax0.mo89a());
    }

    /* renamed from: e */
    public final C43628jy3<String> m113353e(AbstractC31820Ax0<String> abstractC31820Ax0) {
        return this.f3037c.m35344g(abstractC31820Ax0.mo89a());
    }

    /* renamed from: f */
    public double m113352f() {
        C43615jx0 m29678e = C43615jx0.m29678e();
        C43628jy3<Double> m113343o = m113343o(m29678e);
        if (m113343o.m29582d()) {
            double doubleValue = m113343o.m29583c().doubleValue() / 100.0d;
            if (m113362L(doubleValue)) {
                return doubleValue;
            }
        }
        C43628jy3<Double> m113336v = m113336v(m29678e);
        if (m113336v.m29582d() && m113362L(m113336v.m29583c().doubleValue())) {
            this.f3037c.m35341j(m29678e.mo89a(), m113336v.m29583c().doubleValue());
            return m113336v.m29583c().doubleValue();
        }
        C43628jy3<Double> m113355c = m113355c(m29678e);
        if (m113355c.m29582d() && m113362L(m113355c.m29583c().doubleValue())) {
            return m113355c.m29583c().doubleValue();
        }
        return m29678e.m29679d().doubleValue();
    }

    /* renamed from: h */
    public boolean m113350h() {
        C43022ix0 m31565e = C43022ix0.m31565e();
        C43628jy3<Boolean> m113344n = m113344n(m31565e);
        if (m113344n.m29582d()) {
            return m113344n.m29583c().booleanValue();
        }
        C43628jy3<Boolean> m113337u = m113337u(m31565e);
        if (m113337u.m29582d()) {
            this.f3037c.m35338m(m31565e.mo89a(), m113337u.m29583c().booleanValue());
            return m113337u.m29583c().booleanValue();
        }
        C43628jy3<Boolean> m113356b = m113356b(m31565e);
        if (m113356b.m29582d()) {
            return m113356b.m29583c().booleanValue();
        }
        return m31565e.m31566d().booleanValue();
    }

    /* renamed from: i */
    public Boolean m113349i() {
        C41836gx0 m37298e = C41836gx0.m37298e();
        C43628jy3<Boolean> m113344n = m113344n(m37298e);
        if (m113344n.m29582d()) {
            return m113344n.m29583c();
        }
        return m37298e.m37299d();
    }

    /* renamed from: j */
    public Boolean m113348j() {
        if (m113349i().booleanValue()) {
            return Boolean.FALSE;
        }
        C42429hx0 m35451d = C42429hx0.m35451d();
        C43628jy3<Boolean> m113356b = m113356b(m35451d);
        if (m113356b.m29582d()) {
            return m113356b.m29583c();
        }
        C43628jy3<Boolean> m113344n = m113344n(m35451d);
        if (m113344n.m29582d()) {
            return m113344n.m29583c();
        }
        return null;
    }

    /* renamed from: k */
    public final boolean m113347k() {
        C47766qx0 m16763e = C47766qx0.m16763e();
        C43628jy3<Boolean> m113337u = m113337u(m16763e);
        if (m113337u.m29582d()) {
            if (this.f3035a.isLastFetchFailed()) {
                return false;
            }
            this.f3037c.m35338m(m16763e.mo89a(), m113337u.m29583c().booleanValue());
            return m113337u.m29583c().booleanValue();
        }
        C43628jy3<Boolean> m113356b = m113356b(m16763e);
        if (m113356b.m29582d()) {
            return m113356b.m29583c().booleanValue();
        }
        return m16763e.m16764d().booleanValue();
    }

    /* renamed from: l */
    public final boolean m113346l() {
        C47173px0 m18410e = C47173px0.m18410e();
        C43628jy3<String> m113334x = m113334x(m18410e);
        if (m113334x.m29582d()) {
            this.f3037c.m35339l(m18410e.mo89a(), m113334x.m29583c());
            return m113365I(m113334x.m29583c());
        }
        C43628jy3<String> m113353e = m113353e(m18410e);
        if (m113353e.m29582d()) {
            return m113365I(m113353e.m29583c());
        }
        return m113365I(m18410e.m18411d());
    }

    /* renamed from: m */
    public boolean m113345m() {
        return m113347k() && !m113346l();
    }

    /* renamed from: n */
    public final C43628jy3<Boolean> m113344n(AbstractC31820Ax0<Boolean> abstractC31820Ax0) {
        return this.f3036b.m90130b(abstractC31820Ax0.mo6073b());
    }

    /* renamed from: o */
    public final C43628jy3<Double> m113343o(AbstractC31820Ax0<Double> abstractC31820Ax0) {
        return this.f3036b.m90129c(abstractC31820Ax0.mo6073b());
    }

    /* renamed from: p */
    public final C43628jy3<Long> m113342p(AbstractC31820Ax0<Long> abstractC31820Ax0) {
        return this.f3036b.m90127e(abstractC31820Ax0.mo6073b());
    }

    /* renamed from: q */
    public long m113341q() {
        C44801lx0 m26607e = C44801lx0.m26607e();
        C43628jy3<Long> m113335w = m113335w(m26607e);
        if (m113335w.m29582d() && m113366H(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m26607e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m26607e);
        if (m113354d.m29582d() && m113366H(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m26607e.m26608d().longValue();
    }

    /* renamed from: r */
    public long m113340r() {
        C45394mx0 m24679e = C45394mx0.m24679e();
        C43628jy3<Long> m113335w = m113335w(m24679e);
        if (m113335w.m29582d() && m113366H(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m24679e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m24679e);
        if (m113354d.m29582d() && m113366H(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m24679e.m24680d().longValue();
    }

    /* renamed from: s */
    public double m113339s() {
        C45987nx0 m22156e = C45987nx0.m22156e();
        C43628jy3<Double> m113336v = m113336v(m22156e);
        if (m113336v.m29582d() && m113362L(m113336v.m29583c().doubleValue())) {
            this.f3037c.m35341j(m22156e.mo89a(), m113336v.m29583c().doubleValue());
            return m113336v.m29583c().doubleValue();
        }
        C43628jy3<Double> m113355c = m113355c(m22156e);
        if (m113355c.m29582d() && m113362L(m113355c.m29583c().doubleValue())) {
            return m113355c.m29583c().doubleValue();
        }
        return m22156e.m22157d().doubleValue();
    }

    /* renamed from: t */
    public long m113338t() {
        C46580ox0 m20244e = C46580ox0.m20244e();
        C43628jy3<Long> m113335w = m113335w(m20244e);
        if (m113335w.m29582d() && m113360N(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m20244e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m20244e);
        if (m113354d.m29582d() && m113360N(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m20244e.m20245d().longValue();
    }

    /* renamed from: u */
    public final C43628jy3<Boolean> m113337u(AbstractC31820Ax0<Boolean> abstractC31820Ax0) {
        return this.f3035a.getBoolean(abstractC31820Ax0.mo88c());
    }

    /* renamed from: v */
    public final C43628jy3<Double> m113336v(AbstractC31820Ax0<Double> abstractC31820Ax0) {
        return this.f3035a.getDouble(abstractC31820Ax0.mo88c());
    }

    /* renamed from: w */
    public final C43628jy3<Long> m113335w(AbstractC31820Ax0<Long> abstractC31820Ax0) {
        return this.f3035a.getLong(abstractC31820Ax0.mo88c());
    }

    /* renamed from: x */
    public final C43628jy3<String> m113334x(AbstractC31820Ax0<String> abstractC31820Ax0) {
        return this.f3035a.getString(abstractC31820Ax0.mo88c());
    }

    /* renamed from: y */
    public long m113333y() {
        C48359rx0 m14990e = C48359rx0.m14990e();
        C43628jy3<Long> m113342p = m113342p(m14990e);
        if (m113342p.m29582d() && m113364J(m113342p.m29583c().longValue())) {
            return m113342p.m29583c().longValue();
        }
        C43628jy3<Long> m113335w = m113335w(m14990e);
        if (m113335w.m29582d() && m113364J(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m14990e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m14990e);
        if (m113354d.m29582d() && m113364J(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m14990e.m14991d().longValue();
    }

    /* renamed from: z */
    public long m113332z() {
        C48951sx0 m13370e = C48951sx0.m13370e();
        C43628jy3<Long> m113342p = m113342p(m13370e);
        if (m113342p.m29582d() && m113364J(m113342p.m29583c().longValue())) {
            return m113342p.m29583c().longValue();
        }
        C43628jy3<Long> m113335w = m113335w(m13370e);
        if (m113335w.m29582d() && m113364J(m113335w.m29583c().longValue())) {
            this.f3037c.m35340k(m13370e.mo89a(), m113335w.m29583c().longValue());
            return m113335w.m29583c().longValue();
        }
        C43628jy3<Long> m113354d = m113354d(m13370e);
        if (m113354d.m29582d() && m113364J(m113354d.m29583c().longValue())) {
            return m113354d.m29583c().longValue();
        }
        return m13370e.m13371d().longValue();
    }
}
