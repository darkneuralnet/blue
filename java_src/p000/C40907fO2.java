package p000;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: fO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40907fO2 {

    /* renamed from: a */
    public C45526nA3 f80031a;

    public C40907fO2(C45526nA3 c45526nA3) {
        this.f80031a = c45526nA3;
        m41462a(c45526nA3);
    }

    /* renamed from: d */
    public static boolean m41459d(C45526nA3 c45526nA3, C40907fO2 c40907fO2) {
        if (c45526nA3.m24238w() == c40907fO2 && c45526nA3.m24262F()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static C45526nA3 m41458e(C45526nA3 c45526nA3, C45526nA3 c45526nA32, C40907fO2 c40907fO2) {
        C45526nA3 m24247U = c45526nA3.m24247U();
        if (m24247U.m24238w() != c40907fO2) {
            return c45526nA32;
        }
        m24247U.m24249S(c45526nA32);
        return null;
    }

    /* renamed from: f */
    public static void m41457f(C45526nA3 c45526nA3, C40907fO2 c40907fO2) {
        C45526nA3 m24253O = c45526nA3.m24253O();
        C45526nA3 c45526nA32 = c45526nA3;
        while (!m41459d(m24253O.m24247U(), c40907fO2)) {
            if (c45526nA32 == null) {
                c45526nA32 = m41454i(m24253O, c40907fO2);
            } else {
                c45526nA32 = m41458e(m24253O, c45526nA32, c40907fO2);
            }
            m24253O = m24253O.m24253O();
            if (m24253O == c45526nA3) {
                if (c45526nA32 == null) {
                    return;
                }
                throw new TopologyException("Unmatched edge found during min-ring linking", c45526nA3.m24241t());
            }
        }
    }

    /* renamed from: h */
    public static void m41455h(C45526nA3 c45526nA3) {
        C4596Ko.m98281d(c45526nA3.m24266B(), "Attempt to link non-result edge");
        C45526nA3 m24253O = c45526nA3.m24253O();
        C45526nA3 c45526nA32 = null;
        C45526nA3 c45526nA33 = m24253O;
        boolean z = true;
        do {
            if (c45526nA32 != null && c45526nA32.m24261G()) {
                return;
            }
            if (!z) {
                if (z && c45526nA33.m24266B()) {
                    c45526nA32.m24248T(c45526nA33);
                    z = true;
                }
            } else {
                C45526nA3 m24247U = c45526nA33.m24247U();
                if (m24247U.m24266B()) {
                    z = true;
                    c45526nA32 = m24247U;
                }
            }
            c45526nA33 = c45526nA33.m24253O();
        } while (c45526nA33 != m24253O);
        if (!z) {
            return;
        }
        throw new TopologyException("no outgoing edge found", c45526nA3.m24241t());
    }

    /* renamed from: i */
    public static C45526nA3 m41454i(C45526nA3 c45526nA3, C40907fO2 c40907fO2) {
        if (c45526nA3.m24238w() == c40907fO2) {
            return c45526nA3;
        }
        return null;
    }

    /* renamed from: a */
    public final void m41462a(C45526nA3 c45526nA3) {
        C45526nA3 c45526nA32 = c45526nA3;
        while (c45526nA32 != null) {
            if (c45526nA32.m24238w() != this) {
                if (c45526nA32.m24254N() != null) {
                    c45526nA32.m24250R(this);
                    c45526nA32 = c45526nA32.m24254N();
                    if (c45526nA32 == c45526nA3) {
                        return;
                    }
                } else {
                    throw new TopologyException("Ring edge missing at", c45526nA32.m107421d());
                }
            } else {
                throw new TopologyException("Ring edge visited twice at " + c45526nA32.m24241t(), c45526nA32.m24241t());
            }
        }
        throw new TopologyException("Ring edge is null");
    }

    /* renamed from: b */
    public List<C46119oA3> m41461b(C38409bC1 c38409bC1) {
        m41456g();
        ArrayList arrayList = new ArrayList();
        C45526nA3 c45526nA3 = this.f80031a;
        do {
            if (c45526nA3.m24239v() == null) {
                arrayList.add(new C46119oA3(c45526nA3, c38409bC1));
            }
            c45526nA3 = c45526nA3.m24254N();
        } while (c45526nA3 != this.f80031a);
        return arrayList;
    }

    /* renamed from: c */
    public final C52053yB0[] m41460c() {
        DB0 db0 = new DB0();
        C45526nA3 c45526nA3 = this.f80031a;
        do {
            db0.add(c45526nA3.m107413m());
            if (c45526nA3.m24254N() == null) {
                break;
            }
            c45526nA3 = c45526nA3.m24254N();
        } while (c45526nA3 != this.f80031a);
        db0.add(c45526nA3.m107421d());
        return db0.m110799b2();
    }

    /* renamed from: g */
    public final void m41456g() {
        C45526nA3 c45526nA3 = this.f80031a;
        do {
            m41457f(c45526nA3, this);
            c45526nA3 = c45526nA3.m24254N();
        } while (c45526nA3 != this.f80031a);
    }

    public String toString() {
        return C44204kw6.m28147C(m41460c());
    }
}
