package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* renamed from: pt8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47141pt8 {

    /* renamed from: A */
    public long f104236A;

    /* renamed from: B */
    public long f104237B;

    /* renamed from: C */
    public long f104238C;

    /* renamed from: D */
    public String f104239D;

    /* renamed from: E */
    public boolean f104240E;

    /* renamed from: F */
    public long f104241F;

    /* renamed from: G */
    public long f104242G;

    /* renamed from: a */
    public final C35248Pn8 f104243a;

    /* renamed from: b */
    public final String f104244b;

    /* renamed from: c */
    public String f104245c;

    /* renamed from: d */
    public String f104246d;

    /* renamed from: e */
    public String f104247e;

    /* renamed from: f */
    public String f104248f;

    /* renamed from: g */
    public long f104249g;

    /* renamed from: h */
    public long f104250h;

    /* renamed from: i */
    public long f104251i;

    /* renamed from: j */
    public String f104252j;

    /* renamed from: k */
    public long f104253k;

    /* renamed from: l */
    public String f104254l;

    /* renamed from: m */
    public long f104255m;

    /* renamed from: n */
    public long f104256n;

    /* renamed from: o */
    public boolean f104257o;

    /* renamed from: p */
    public boolean f104258p;

    /* renamed from: q */
    public String f104259q;

    /* renamed from: r */
    public Boolean f104260r;

    /* renamed from: s */
    public long f104261s;

    /* renamed from: t */
    public List f104262t;

    /* renamed from: u */
    public String f104263u;

    /* renamed from: v */
    public boolean f104264v;

    /* renamed from: w */
    public long f104265w;

    /* renamed from: x */
    public long f104266x;

    /* renamed from: y */
    public long f104267y;

    /* renamed from: z */
    public long f104268z;

    public C47141pt8(C35248Pn8 c35248Pn8, String str) {
        Preconditions.checkNotNull(c35248Pn8);
        Preconditions.checkNotEmpty(str);
        this.f104243a = c35248Pn8;
        this.f104244b = str;
        c35248Pn8.mo22257c().mo19953e();
    }

    /* renamed from: A */
    public final long m18515A() {
        this.f104243a.mo22257c().mo19953e();
        return 0L;
    }

    /* renamed from: B */
    public final void m18514B(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104251i != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104251i = j;
    }

    /* renamed from: C */
    public final void m18513C(long j) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f104243a.mo22257c().mo19953e();
        boolean z3 = this.f104240E;
        if (this.f104249g == j) {
            z2 = false;
        }
        this.f104240E = z3 | z2;
        this.f104249g = j;
    }

    /* renamed from: D */
    public final void m18512D(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104250h != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104250h = j;
    }

    /* renamed from: E */
    public final void m18511E(boolean z) {
        boolean z2;
        this.f104243a.mo22257c().mo19953e();
        boolean z3 = this.f104240E;
        if (this.f104257o != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f104240E = z3 | z2;
        this.f104257o = z;
    }

    /* renamed from: F */
    public final void m18510F(Boolean bool) {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E |= !C45885nm8.m23152a(this.f104260r, bool);
        this.f104260r = bool;
    }

    /* renamed from: G */
    public final void m18509G(String str) {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E |= !C45885nm8.m23152a(this.f104247e, str);
        this.f104247e = str;
    }

    /* renamed from: H */
    public final void m18508H(List list) {
        ArrayList arrayList;
        this.f104243a.mo22257c().mo19953e();
        if (!C45885nm8.m23152a(this.f104262t, list)) {
            this.f104240E = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f104262t = arrayList;
        }
    }

    /* renamed from: I */
    public final void m18507I(String str) {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E |= !C45885nm8.m23152a(this.f104263u, str);
        this.f104263u = str;
    }

    /* renamed from: J */
    public final void m18506J(boolean z) {
        boolean z2;
        this.f104243a.mo22257c().mo19953e();
        boolean z3 = this.f104240E;
        if (this.f104264v != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f104240E = z3 | z2;
        this.f104264v = z;
    }

    /* renamed from: K */
    public final void m18505K(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104265w != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104265w = j;
    }

    /* renamed from: L */
    public final boolean m18504L() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104258p;
    }

    /* renamed from: M */
    public final boolean m18503M() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104257o;
    }

    /* renamed from: N */
    public final boolean m18502N() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104240E;
    }

    /* renamed from: O */
    public final boolean m18501O() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104264v;
    }

    /* renamed from: P */
    public final long m18500P() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104253k;
    }

    /* renamed from: Q */
    public final long m18499Q() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104241F;
    }

    /* renamed from: R */
    public final long m18498R() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104236A;
    }

    /* renamed from: S */
    public final long m18497S() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104237B;
    }

    /* renamed from: T */
    public final long m18496T() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104268z;
    }

    /* renamed from: U */
    public final long m18495U() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104267y;
    }

    /* renamed from: V */
    public final long m18494V() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104238C;
    }

    /* renamed from: W */
    public final long m18493W() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104266x;
    }

    /* renamed from: X */
    public final long m18492X() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104256n;
    }

    /* renamed from: Y */
    public final long m18491Y() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104261s;
    }

    /* renamed from: Z */
    public final long m18490Z() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104242G;
    }

    /* renamed from: a */
    public final String m18489a() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104239D;
    }

    /* renamed from: a0 */
    public final long m18488a0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104255m;
    }

    /* renamed from: b */
    public final String m18487b() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104247e;
    }

    /* renamed from: b0 */
    public final long m18486b0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104251i;
    }

    /* renamed from: c */
    public final String m18485c() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104263u;
    }

    /* renamed from: c0 */
    public final long m18484c0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104249g;
    }

    /* renamed from: d */
    public final List m18483d() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104262t;
    }

    /* renamed from: d0 */
    public final long m18482d0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104250h;
    }

    /* renamed from: e */
    public final void m18481e() {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E = false;
    }

    /* renamed from: e0 */
    public final long m18480e0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104265w;
    }

    /* renamed from: f */
    public final void m18479f() {
        this.f104243a.mo22257c().mo19953e();
        long j = this.f104249g + 1;
        if (j > 2147483647L) {
            this.f104243a.mo22258a().m106888t().m42707b("Bundle index overflow. appId", C32809Fc8.m106885w(this.f104244b));
            j = 0;
        }
        this.f104240E = true;
        this.f104249g = j;
    }

    /* renamed from: f0 */
    public final Boolean m18478f0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104260r;
    }

    /* renamed from: g */
    public final void m18477g(String str) {
        this.f104243a.mo22257c().mo19953e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f104240E |= true ^ C45885nm8.m23152a(this.f104259q, str);
        this.f104259q = str;
    }

    /* renamed from: g0 */
    public final String m18476g0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104259q;
    }

    /* renamed from: h */
    public final void m18475h(boolean z) {
        boolean z2;
        this.f104243a.mo22257c().mo19953e();
        boolean z3 = this.f104240E;
        if (this.f104258p != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f104240E = z3 | z2;
        this.f104258p = z;
    }

    /* renamed from: h0 */
    public final String m18474h0() {
        this.f104243a.mo22257c().mo19953e();
        String str = this.f104239D;
        m18450z(null);
        return str;
    }

    /* renamed from: i */
    public final void m18473i(String str) {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E |= !C45885nm8.m23152a(this.f104245c, str);
        this.f104245c = str;
    }

    /* renamed from: i0 */
    public final String m18472i0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104244b;
    }

    /* renamed from: j */
    public final void m18471j(String str) {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E |= !C45885nm8.m23152a(this.f104254l, str);
        this.f104254l = str;
    }

    /* renamed from: j0 */
    public final String m18470j0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104245c;
    }

    /* renamed from: k */
    public final void m18469k(String str) {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E |= !C45885nm8.m23152a(this.f104252j, str);
        this.f104252j = str;
    }

    /* renamed from: k0 */
    public final String m18468k0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104254l;
    }

    /* renamed from: l */
    public final void m18467l(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104253k != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104253k = j;
    }

    /* renamed from: l0 */
    public final String m18466l0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104252j;
    }

    /* renamed from: m */
    public final void m18465m(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104241F != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104241F = j;
    }

    /* renamed from: m0 */
    public final String m18464m0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104248f;
    }

    /* renamed from: n */
    public final void m18463n(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104236A != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104236A = j;
    }

    /* renamed from: n0 */
    public final String m18462n0() {
        this.f104243a.mo22257c().mo19953e();
        return this.f104246d;
    }

    /* renamed from: o */
    public final void m18461o(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104237B != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104237B = j;
    }

    /* renamed from: p */
    public final void m18460p(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104268z != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104268z = j;
    }

    /* renamed from: q */
    public final void m18459q(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104267y != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104267y = j;
    }

    /* renamed from: r */
    public final void m18458r(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104238C != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104238C = j;
    }

    /* renamed from: s */
    public final void m18457s(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104266x != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104266x = j;
    }

    /* renamed from: t */
    public final void m18456t(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104256n != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104256n = j;
    }

    /* renamed from: u */
    public final void m18455u(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104261s != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104261s = j;
    }

    /* renamed from: v */
    public final void m18454v(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104242G != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104242G = j;
    }

    /* renamed from: w */
    public final void m18453w(String str) {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E |= !C45885nm8.m23152a(this.f104248f, str);
        this.f104248f = str;
    }

    /* renamed from: x */
    public final void m18452x(String str) {
        this.f104243a.mo22257c().mo19953e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f104240E |= true ^ C45885nm8.m23152a(this.f104246d, str);
        this.f104246d = str;
    }

    /* renamed from: y */
    public final void m18451y(long j) {
        boolean z;
        this.f104243a.mo22257c().mo19953e();
        boolean z2 = this.f104240E;
        if (this.f104255m != j) {
            z = true;
        } else {
            z = false;
        }
        this.f104240E = z2 | z;
        this.f104255m = j;
    }

    /* renamed from: z */
    public final void m18450z(String str) {
        this.f104243a.mo22257c().mo19953e();
        this.f104240E |= !C45885nm8.m23152a(this.f104239D, str);
        this.f104239D = str;
    }
}
