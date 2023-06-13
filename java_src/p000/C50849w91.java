package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: w91  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50849w91 {
    /* renamed from: a */
    public List m7354a(Iterator it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            m7353b((C47293q91) it.next(), arrayList);
        }
        return arrayList;
    }

    /* renamed from: b */
    public void m7353b(C47293q91 c47293q91, List list) {
        A91 a91;
        B91 m18066p = c47293q91.m18066p();
        m18066p.m114327b();
        Iterator m114324e = m18066p.m114324e();
        if (!m114324e.hasNext()) {
            return;
        }
        A91 a912 = (A91) m114324e.next();
        A91 a913 = null;
        while (true) {
            if (m114324e.hasNext()) {
                a91 = (A91) m114324e.next();
            } else {
                a91 = null;
            }
            if (a912 != null) {
                m7351d(c47293q91, list, a912, a913);
                m7352c(c47293q91, list, a912, a91);
            }
            if (a912 == null) {
                return;
            }
            a913 = a912;
            a912 = a91;
        }
    }

    /* renamed from: c */
    public void m7352c(C47293q91 c47293q91, List list, A91 a91, A91 a912) {
        int i = a91.f201c + 1;
        if (i >= c47293q91.m18064r() && a912 == null) {
            return;
        }
        C52053yB0 m18069m = c47293q91.m18069m(i);
        if (a912 != null && a912.f201c == a91.f201c) {
            m18069m = a912.f200b;
        }
        list.add(new C50256v91(c47293q91, a91.f200b, m18069m, new C35926Sl2(c47293q91.m85838b())));
    }

    /* renamed from: d */
    public void m7351d(C47293q91 c47293q91, List list, A91 a91, A91 a912) {
        int i = a91.f201c;
        if (a91.f202d == 0.0d) {
            if (i == 0) {
                return;
            }
            i--;
        }
        C52053yB0 m18069m = c47293q91.m18069m(i);
        if (a912 != null && a912.f201c >= i) {
            m18069m = a912.f200b;
        }
        C35926Sl2 c35926Sl2 = new C35926Sl2(c47293q91.m85838b());
        c35926Sl2.m84876b();
        list.add(new C50256v91(c47293q91, a91.f200b, m18069m, c35926Sl2));
    }
}
