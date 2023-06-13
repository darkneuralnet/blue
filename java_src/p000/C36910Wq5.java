package p000;

import java.util.Collection;
import java.util.Iterator;
/* renamed from: Wq5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36910Wq5 {

    /* renamed from: e */
    public AbstractC48893sr2 f42181e;

    /* renamed from: f */
    public boolean f42182f;

    /* renamed from: g */
    public boolean f42183g;

    /* renamed from: j */
    public Collection[] f42186j;

    /* renamed from: a */
    public boolean f42177a = false;

    /* renamed from: b */
    public boolean f42178b = false;

    /* renamed from: c */
    public boolean f42179c = false;

    /* renamed from: d */
    public C52053yB0 f42180d = null;

    /* renamed from: h */
    public int f42184h = 0;

    /* renamed from: i */
    public int f42185i = 0;

    public C36910Wq5(AbstractC48893sr2 abstractC48893sr2, boolean z, boolean z2) {
        this.f42181e = abstractC48893sr2;
        this.f42182f = z;
        this.f42183g = z2;
    }

    /* renamed from: d */
    public static boolean m77809d(int i, int i2) {
        return Math.abs(i - i2) == 1;
    }

    /* renamed from: a */
    public void m77812a(C47293q91 c47293q91, int i, C47293q91 c47293q912, int i2) {
        boolean z;
        if (c47293q91 == c47293q912 && i == i2) {
            return;
        }
        this.f42185i++;
        this.f42181e.m13587d(c47293q91.m18069m(i), c47293q91.m18069m(i + 1), c47293q912.m18069m(i2), c47293q912.m18069m(i2 + 1));
        if (this.f42181e.m13582i()) {
            if (this.f42183g) {
                c47293q91.m18059w(false);
                c47293q912.m18059w(false);
            }
            this.f42184h++;
            if (!m77805h(c47293q91, i, c47293q912, i2)) {
                this.f42177a = true;
                boolean m77808e = m77808e(this.f42181e, this.f42186j);
                if (this.f42181e.m13576o() && !m77808e) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.f42182f || z) {
                    c47293q91.m18072j(this.f42181e, i, 0);
                    c47293q912.m18072j(this.f42181e, i2, 1);
                }
                if (this.f42181e.m13576o()) {
                    this.f42180d = this.f42181e.m13585f(0).mo3888e();
                    this.f42178b = true;
                    if (!m77808e) {
                        this.f42179c = true;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m77811b() {
        return this.f42179c;
    }

    /* renamed from: c */
    public boolean m77810c() {
        return this.f42178b;
    }

    /* renamed from: e */
    public final boolean m77808e(AbstractC48893sr2 abstractC48893sr2, Collection[] collectionArr) {
        if (collectionArr == null) {
            return false;
        }
        if (!m77807f(abstractC48893sr2, collectionArr[0]) && !m77807f(abstractC48893sr2, collectionArr[1])) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m77807f(AbstractC48893sr2 abstractC48893sr2, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (abstractC48893sr2.m13577n(((D83) it.next()).m110884j())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean m77806g() {
        return false;
    }

    /* renamed from: h */
    public final boolean m77805h(C47293q91 c47293q91, int i, C47293q91 c47293q912, int i2) {
        if (c47293q91 == c47293q912 && this.f42181e.m13584g() == 1) {
            if (m77809d(i, i2)) {
                return true;
            }
            if (c47293q91.m18063s()) {
                int m18064r = c47293q91.m18064r() - 1;
                if ((i == 0 && i2 == m18064r) || (i2 == 0 && i == m18064r)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: i */
    public void m77804i(Collection collection, Collection collection2) {
        this.f42186j = r0;
        Collection[] collectionArr = {collection, collection2};
    }
}
