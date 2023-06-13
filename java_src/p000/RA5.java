package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: RA5 */
/* loaded from: classes8.dex */
public class RA5 extends I91 {

    /* renamed from: a */
    public List f31623a = new ArrayList();

    /* renamed from: b */
    public int f31624b;

    @Override // p000.I91
    /* renamed from: a */
    public void mo87227a(List list, C36910Wq5 c36910Wq5, boolean z) {
        if (z) {
            m87223e(list, null);
        } else {
            m87224d(list);
        }
        m87222f(c36910Wq5);
    }

    @Override // p000.I91
    /* renamed from: b */
    public void mo87226b(List list, List list2, C36910Wq5 c36910Wq5) {
        m87223e(list, list);
        m87223e(list2, list2);
        m87222f(c36910Wq5);
    }

    /* renamed from: c */
    public final void m87225c(C47293q91 c47293q91, Object obj) {
        EV2 m18065q = c47293q91.m18065q();
        int[] m108920e = m18065q.m108920e();
        for (int i = 0; i < m108920e.length - 1; i++) {
            AW5 aw5 = new AW5(obj, m18065q.m108921d(i), new CV2(m18065q, i));
            this.f31623a.add(aw5);
            this.f31623a.add(new AW5(m18065q.m108922c(i), aw5));
        }
    }

    /* renamed from: d */
    public final void m87224d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47293q91 c47293q91 = (C47293q91) it.next();
            m87225c(c47293q91, c47293q91);
        }
    }

    /* renamed from: e */
    public final void m87223e(List list, Object obj) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m87225c((C47293q91) it.next(), obj);
        }
    }

    /* renamed from: f */
    public final void m87222f(C36910Wq5 c36910Wq5) {
        this.f31624b = 0;
        m87221g();
        for (int i = 0; i < this.f31623a.size(); i++) {
            AW5 aw5 = (AW5) this.f31623a.get(i);
            if (aw5.m115682e()) {
                m87220h(i, aw5.m115686a(), aw5, c36910Wq5);
            }
            if (c36910Wq5.m77806g()) {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void m87221g() {
        Collections.sort(this.f31623a);
        for (int i = 0; i < this.f31623a.size(); i++) {
            AW5 aw5 = (AW5) this.f31623a.get(i);
            if (aw5.m115683d()) {
                aw5.m115685b().m115680g(i);
            }
        }
    }

    /* renamed from: h */
    public final void m87220h(int i, int i2, AW5 aw5, C36910Wq5 c36910Wq5) {
        CV2 cv2 = (CV2) aw5.m115684c();
        while (i < i2) {
            AW5 aw52 = (AW5) this.f31623a.get(i);
            if (aw52.m115682e()) {
                CV2 cv22 = (CV2) aw52.m115684c();
                if (!aw5.m115681f(aw52)) {
                    cv2.m112187a(cv22, c36910Wq5);
                    this.f31624b++;
                }
            }
            i++;
        }
    }
}
