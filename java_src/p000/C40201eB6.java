package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: eB6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40201eB6 {

    /* renamed from: g */
    public static int f78079g;

    /* renamed from: b */
    public int f78081b;

    /* renamed from: d */
    public int f78083d;

    /* renamed from: a */
    public ArrayList<C43042iz0> f78080a = new ArrayList<>();

    /* renamed from: c */
    public boolean f78082c = false;

    /* renamed from: e */
    public ArrayList<C19982a> f78084e = null;

    /* renamed from: f */
    public int f78085f = -1;

    /* renamed from: eB6$a */
    /* loaded from: classes.dex */
    public class C19982a {

        /* renamed from: a */
        public WeakReference<C43042iz0> f78086a;

        /* renamed from: b */
        public int f78087b;

        /* renamed from: c */
        public int f78088c;

        /* renamed from: d */
        public int f78089d;

        /* renamed from: e */
        public int f78090e;

        /* renamed from: f */
        public int f78091f;

        /* renamed from: g */
        public int f78092g;

        public C19982a(C43042iz0 c43042iz0, C34342Lr2 c34342Lr2, int i) {
            this.f78086a = new WeakReference<>(c43042iz0);
            this.f78087b = c34342Lr2.m96267y(c43042iz0.f91869Q);
            this.f78088c = c34342Lr2.m96267y(c43042iz0.f91871R);
            this.f78089d = c34342Lr2.m96267y(c43042iz0.f91873S);
            this.f78090e = c34342Lr2.m96267y(c43042iz0.f91875T);
            this.f78091f = c34342Lr2.m96267y(c43042iz0.f91877U);
            this.f78092g = i;
        }
    }

    public C40201eB6(int i) {
        int i2 = f78079g;
        f78079g = i2 + 1;
        this.f78081b = i2;
        this.f78083d = i;
    }

    /* renamed from: a */
    public boolean m43138a(C43042iz0 c43042iz0) {
        if (this.f78080a.contains(c43042iz0)) {
            return false;
        }
        this.f78080a.add(c43042iz0);
        return true;
    }

    /* renamed from: b */
    public void m43137b(ArrayList<C40201eB6> arrayList) {
        int size = this.f78080a.size();
        if (this.f78085f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C40201eB6 c40201eB6 = arrayList.get(i);
                if (this.f78085f == c40201eB6.f78081b) {
                    m43132g(this.f78083d, c40201eB6);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m43136c() {
        return this.f78081b;
    }

    /* renamed from: d */
    public int m43135d() {
        return this.f78083d;
    }

    /* renamed from: e */
    public final String m43134e() {
        int i = this.f78083d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: f */
    public int m43133f(C34342Lr2 c34342Lr2, int i) {
        if (this.f78080a.size() == 0) {
            return 0;
        }
        return m43129j(c34342Lr2, this.f78080a, i);
    }

    /* renamed from: g */
    public void m43132g(int i, C40201eB6 c40201eB6) {
        Iterator<C43042iz0> it = this.f78080a.iterator();
        while (it.hasNext()) {
            C43042iz0 next = it.next();
            c40201eB6.m43138a(next);
            if (i == 0) {
                next.f91874S0 = c40201eB6.m43136c();
            } else {
                next.f91876T0 = c40201eB6.m43136c();
            }
        }
        this.f78085f = c40201eB6.f78081b;
    }

    /* renamed from: h */
    public void m43131h(boolean z) {
        this.f78082c = z;
    }

    /* renamed from: i */
    public void m43130i(int i) {
        this.f78083d = i;
    }

    /* renamed from: j */
    public final int m43129j(C34342Lr2 c34342Lr2, ArrayList<C43042iz0> arrayList, int i) {
        int m96267y;
        int m96267y2;
        C43635jz0 c43635jz0 = (C43635jz0) arrayList.get(0).m31414M();
        c34342Lr2.m96292E();
        c43635jz0.mo7204g(c34342Lr2, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo7204g(c34342Lr2, false);
        }
        if (i == 0 && c43635jz0.f93677h1 > 0) {
            C45234mh0.m25163b(c43635jz0, c34342Lr2, arrayList, 0);
        }
        if (i == 1 && c43635jz0.f93678i1 > 0) {
            C45234mh0.m25163b(c43635jz0, c34342Lr2, arrayList, 1);
        }
        try {
            c34342Lr2.m96296A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f78084e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f78084e.add(new C19982a(arrayList.get(i3), c34342Lr2, i));
        }
        if (i == 0) {
            m96267y = c34342Lr2.m96267y(c43635jz0.f91869Q);
            m96267y2 = c34342Lr2.m96267y(c43635jz0.f91873S);
            c34342Lr2.m96292E();
        } else {
            m96267y = c34342Lr2.m96267y(c43635jz0.f91871R);
            m96267y2 = c34342Lr2.m96267y(c43635jz0.f91875T);
            c34342Lr2.m96292E();
        }
        return m96267y2 - m96267y;
    }

    public String toString() {
        Iterator<C43042iz0> it;
        String str = m43134e() + " [" + this.f78081b + "] <";
        while (this.f78080a.iterator().hasNext()) {
            str = str + " " + it.next().m31335v();
        }
        return str + " >";
    }
}
