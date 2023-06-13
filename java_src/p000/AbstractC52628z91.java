package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.locationtech.jts.geom.TopologyException;
/* renamed from: z91  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC52628z91 {

    /* renamed from: b */
    public List f120868b;

    /* renamed from: a */
    public Map f120867a = new TreeMap();

    /* renamed from: c */
    public int[] f120869c = {-1, -1};

    /* renamed from: a */
    public final void m1762a(InterfaceC49573u00 interfaceC49573u00) {
        Iterator m1754i = m1754i();
        while (m1754i.hasNext()) {
            ((C50256v91) m1754i.next()).mo5788b(interfaceC49573u00);
        }
    }

    /* renamed from: b */
    public void mo1761b(C39002cC1[] c39002cC1Arr) {
        int m1757f;
        m1762a(c39002cC1Arr[0].m61697x());
        m1753j(0);
        m1753j(1);
        boolean[] zArr = {false, false};
        Iterator m1754i = m1754i();
        while (m1754i.hasNext()) {
            C35926Sl2 mo5787f = ((C50256v91) m1754i.next()).mo5787f();
            for (int i = 0; i < 2; i++) {
                if (mo5787f.m84869i(i) && mo5787f.m84874d(i) == 1) {
                    zArr[i] = true;
                }
            }
        }
        Iterator m1754i2 = m1754i();
        while (m1754i2.hasNext()) {
            C50256v91 c50256v91 = (C50256v91) m1754i2.next();
            C35926Sl2 mo5787f2 = c50256v91.mo5787f();
            for (int i2 = 0; i2 < 2; i2++) {
                if (mo5787f2.m84872f(i2)) {
                    if (zArr[i2]) {
                        m1757f = 2;
                    } else {
                        m1757f = m1757f(i2, c50256v91.m9130c(), c39002cC1Arr);
                    }
                    mo5787f2.m84865m(i2, m1757f);
                }
            }
        }
    }

    /* renamed from: c */
    public C52053yB0 m1760c() {
        Iterator m1754i = m1754i();
        if (!m1754i.hasNext()) {
            return null;
        }
        return ((C50256v91) m1754i.next()).m9130c();
    }

    /* renamed from: d */
    public int m1759d() {
        return this.f120867a.size();
    }

    /* renamed from: e */
    public List m1758e() {
        if (this.f120868b == null) {
            this.f120868b = new ArrayList(this.f120867a.values());
        }
        return this.f120868b;
    }

    /* renamed from: f */
    public final int m1757f(int i, C52053yB0 c52053yB0, C39002cC1[] c39002cC1Arr) {
        int[] iArr = this.f120869c;
        if (iArr[i] == -1) {
            iArr[i] = SA5.m85864c(c52053yB0, c39002cC1Arr[i].m61695z());
        }
        return this.f120869c[i];
    }

    /* renamed from: g */
    public abstract void mo1756g(C50256v91 c50256v91);

    /* renamed from: h */
    public void m1755h(C50256v91 c50256v91, Object obj) {
        this.f120867a.put(c50256v91, obj);
        this.f120868b = null;
    }

    /* renamed from: i */
    public Iterator m1754i() {
        return m1758e().iterator();
    }

    /* renamed from: j */
    public void m1753j(int i) {
        Iterator m1754i = m1754i();
        int i2 = -1;
        while (m1754i.hasNext()) {
            C35926Sl2 mo5787f = ((C50256v91) m1754i.next()).mo5787f();
            if (mo5787f.m84870h(i) && mo5787f.m84873e(i, 1) != -1) {
                i2 = mo5787f.m84873e(i, 1);
            }
        }
        if (i2 == -1) {
            return;
        }
        Iterator m1754i2 = m1754i();
        while (m1754i2.hasNext()) {
            C50256v91 c50256v91 = (C50256v91) m1754i2.next();
            C35926Sl2 mo5787f2 = c50256v91.mo5787f();
            boolean z = false;
            if (mo5787f2.m84873e(i, 0) == -1) {
                mo5787f2.m84863o(i, 0, i2);
            }
            if (mo5787f2.m84870h(i)) {
                int m84873e = mo5787f2.m84873e(i, 1);
                int m84873e2 = mo5787f2.m84873e(i, 2);
                if (m84873e2 != -1) {
                    if (m84873e2 == i2) {
                        if (m84873e == -1) {
                            C4596Ko.m98279f("found single null side (at " + c50256v91.m9130c() + ")");
                        }
                        i2 = m84873e;
                    } else {
                        throw new TopologyException("side location conflict", c50256v91.m9130c());
                    }
                } else {
                    if (mo5787f2.m84873e(i, 1) == -1) {
                        z = true;
                    }
                    C4596Ko.m98281d(z, "found single null side");
                    mo5787f2.m84863o(i, 2, i2);
                    mo5787f2.m84863o(i, 1, i2);
                }
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EdgeEndStar:   " + m1760c());
        stringBuffer.append("\n");
        Iterator m1754i = m1754i();
        while (m1754i.hasNext()) {
            stringBuffer.append((C50256v91) m1754i.next());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
