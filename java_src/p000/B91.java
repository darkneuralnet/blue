package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: B91 */
/* loaded from: classes8.dex */
public class B91 {

    /* renamed from: a */
    public Map f1915a = new TreeMap();

    /* renamed from: b */
    public C47293q91 f1916b;

    public B91(C47293q91 c47293q91) {
        this.f1916b = c47293q91;
    }

    /* renamed from: a */
    public A91 m114328a(C52053yB0 c52053yB0, int i, double d) {
        A91 a91 = new A91(c52053yB0, i, d);
        A91 a912 = (A91) this.f1915a.get(a91);
        if (a912 != null) {
            return a912;
        }
        this.f1915a.put(a91, a91);
        return a91;
    }

    /* renamed from: b */
    public void m114327b() {
        C52053yB0[] c52053yB0Arr = this.f1916b.f104783f;
        int length = c52053yB0Arr.length - 1;
        m114328a(c52053yB0Arr[0], 0, 0.0d);
        m114328a(this.f1916b.f104783f[length], length, 0.0d);
    }

    /* renamed from: c */
    public void m114326c(List list) {
        m114327b();
        Iterator m114324e = m114324e();
        A91 a91 = (A91) m114324e.next();
        while (m114324e.hasNext()) {
            A91 a912 = (A91) m114324e.next();
            list.add(m114325d(a91, a912));
            a91 = a912;
        }
    }

    /* renamed from: d */
    public C47293q91 m114325d(A91 a91, A91 a912) {
        boolean z;
        int i = a912.f201c;
        int i2 = (i - a91.f201c) + 2;
        C52053yB0 c52053yB0 = this.f1916b.f104783f[i];
        int i3 = 1;
        if (a912.f202d <= 0.0d && a912.f200b.m3886g(c52053yB0)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i2--;
        }
        C52053yB0[] c52053yB0Arr = new C52053yB0[i2];
        c52053yB0Arr[0] = new C52053yB0(a91.f200b);
        int i4 = a91.f201c + 1;
        while (i4 <= a912.f201c) {
            c52053yB0Arr[i3] = this.f1916b.f104783f[i4];
            i4++;
            i3++;
        }
        if (z) {
            c52053yB0Arr[i3] = a912.f200b;
        }
        return new C47293q91(c52053yB0Arr, new C35926Sl2(this.f1916b.f33341a));
    }

    /* renamed from: e */
    public Iterator m114324e() {
        return this.f1915a.values().iterator();
    }
}
