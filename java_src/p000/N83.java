package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: N83 */
/* loaded from: classes8.dex */
public class N83 {

    /* renamed from: a */
    public Map f24183a = new TreeMap();

    /* renamed from: b */
    public J83 f24184b;

    public N83(J83 j83) {
        this.f24184b = j83;
    }

    /* renamed from: a */
    public void m94325a(C50256v91 c50256v91) {
        m94324b(c50256v91.m9130c()).m110885i(c50256v91);
    }

    /* renamed from: b */
    public D83 m94324b(C52053yB0 c52053yB0) {
        D83 d83 = (D83) this.f24183a.get(c52053yB0);
        if (d83 == null) {
            D83 mo9064a = this.f24184b.mo9064a(c52053yB0);
            this.f24183a.put(c52053yB0, mo9064a);
            return mo9064a;
        }
        return d83;
    }

    /* renamed from: c */
    public D83 m94323c(C52053yB0 c52053yB0) {
        return (D83) this.f24183a.get(c52053yB0);
    }

    /* renamed from: d */
    public Collection m94322d(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator m94321e = m94321e();
        while (m94321e.hasNext()) {
            D83 d83 = (D83) m94321e.next();
            if (d83.m85838b().m84874d(i) == 1) {
                arrayList.add(d83);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public Iterator m94321e() {
        return this.f24183a.values().iterator();
    }

    /* renamed from: f */
    public Collection m94320f() {
        return this.f24183a.values();
    }
}
