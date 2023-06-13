package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: Yq5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37378Yq5 {

    /* renamed from: a */
    public Map f47477a = new TreeMap();

    /* renamed from: b */
    public S83 f47478b;

    public C37378Yq5(S83 s83) {
        this.f47478b = s83;
    }

    /* renamed from: a */
    public C37144Xq5 m74107a(C52053yB0 c52053yB0, int i) {
        S83 s83 = this.f47478b;
        C37144Xq5 c37144Xq5 = new C37144Xq5(s83, c52053yB0, i, s83.m85909j(i));
        C37144Xq5 c37144Xq52 = (C37144Xq5) this.f47477a.get(c37144Xq5);
        if (c37144Xq52 != null) {
            C4596Ko.m98281d(c37144Xq52.f44065c.m3886g(c52053yB0), "Found equal nodes with different coordinates");
            return c37144Xq52;
        }
        this.f47477a.put(c37144Xq5, c37144Xq5);
        return c37144Xq5;
    }

    /* renamed from: b */
    public final void m74106b() {
        ArrayList<Integer> arrayList = new ArrayList();
        m74098j(arrayList);
        m74099i(arrayList);
        for (Integer num : arrayList) {
            int intValue = num.intValue();
            m74107a(this.f47478b.mo44966u(intValue), intValue);
        }
    }

    /* renamed from: c */
    public final void m74105c(C37144Xq5 c37144Xq5, C37144Xq5 c37144Xq52, DB0 db0) {
        db0.m110796h(m74101g(c37144Xq5, c37144Xq52), false);
    }

    /* renamed from: d */
    public final void m74104d() {
        int size = this.f47478b.size() - 1;
        m74107a(this.f47478b.mo44966u(0), 0);
        m74107a(this.f47478b.mo44966u(size), size);
    }

    /* renamed from: e */
    public void m74103e(Collection collection) {
        m74104d();
        m74106b();
        Iterator m74096l = m74096l();
        C37144Xq5 c37144Xq5 = (C37144Xq5) m74096l.next();
        while (m74096l.hasNext()) {
            C37144Xq5 c37144Xq52 = (C37144Xq5) m74096l.next();
            collection.add(m74102f(c37144Xq5, c37144Xq52));
            c37144Xq5 = c37144Xq52;
        }
    }

    /* renamed from: f */
    public final InterfaceC39410cr5 m74102f(C37144Xq5 c37144Xq5, C37144Xq5 c37144Xq52) {
        return new S83(m74101g(c37144Xq5, c37144Xq52), this.f47478b.getData());
    }

    /* renamed from: g */
    public final C52053yB0[] m74101g(C37144Xq5 c37144Xq5, C37144Xq5 c37144Xq52) {
        boolean z;
        int i = c37144Xq52.f44066d;
        int i2 = (i - c37144Xq5.f44066d) + 2;
        int i3 = 1;
        if (i2 == 2) {
            return new C52053yB0[]{new C52053yB0(c37144Xq5.f44065c), new C52053yB0(c37144Xq52.f44065c)};
        }
        C52053yB0 mo44966u = this.f47478b.mo44966u(i);
        if (!c37144Xq52.m76213a() && c37144Xq52.f44065c.m3886g(mo44966u)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i2--;
        }
        C52053yB0[] c52053yB0Arr = new C52053yB0[i2];
        c52053yB0Arr[0] = new C52053yB0(c37144Xq5.f44065c);
        int i4 = c37144Xq5.f44066d + 1;
        while (i4 <= c37144Xq52.f44066d) {
            c52053yB0Arr[i3] = this.f47478b.mo44966u(i4);
            i4++;
            i3++;
        }
        if (z) {
            c52053yB0Arr[i3] = new C52053yB0(c37144Xq52.f44065c);
        }
        return c52053yB0Arr;
    }

    /* renamed from: h */
    public final boolean m74100h(C37144Xq5 c37144Xq5, C37144Xq5 c37144Xq52, int[] iArr) {
        if (!c37144Xq5.f44065c.m3886g(c37144Xq52.f44065c)) {
            return false;
        }
        int i = c37144Xq52.f44066d - c37144Xq5.f44066d;
        if (!c37144Xq52.m76213a()) {
            i--;
        }
        if (i != 1) {
            return false;
        }
        iArr[0] = c37144Xq5.f44066d + 1;
        return true;
    }

    /* renamed from: i */
    public final void m74099i(List list) {
        int i = 0;
        while (i < this.f47478b.size() - 2) {
            C52053yB0 mo44966u = this.f47478b.mo44966u(i);
            int i2 = i + 1;
            this.f47478b.mo44966u(i2);
            if (mo44966u.m3886g(this.f47478b.mo44966u(i + 2))) {
                list.add(Integer.valueOf(i2));
            }
            i = i2;
        }
    }

    /* renamed from: j */
    public final void m74098j(List list) {
        int[] iArr = new int[1];
        Iterator m74096l = m74096l();
        C37144Xq5 c37144Xq5 = (C37144Xq5) m74096l.next();
        while (m74096l.hasNext()) {
            C37144Xq5 c37144Xq52 = (C37144Xq5) m74096l.next();
            if (m74100h(c37144Xq5, c37144Xq52, iArr)) {
                list.add(Integer.valueOf(iArr[0]));
            }
            c37144Xq5 = c37144Xq52;
        }
    }

    /* renamed from: k */
    public C52053yB0[] m74097k() {
        DB0 db0 = new DB0();
        m74104d();
        Iterator m74096l = m74096l();
        C37144Xq5 c37144Xq5 = (C37144Xq5) m74096l.next();
        while (m74096l.hasNext()) {
            C37144Xq5 c37144Xq52 = (C37144Xq5) m74096l.next();
            m74105c(c37144Xq5, c37144Xq52, db0);
            c37144Xq5 = c37144Xq52;
        }
        return db0.m110799b2();
    }

    /* renamed from: l */
    public Iterator m74096l() {
        return this.f47477a.values().iterator();
    }
}
