package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Cv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32271Cv1 {

    /* renamed from: a */
    public final List<RT2> f4886a;

    /* renamed from: b */
    public final List<RT2> f4887b;

    /* renamed from: c */
    public final List<RT2> f4888c;

    /* renamed from: d */
    public final long f4889d;

    /* renamed from: Cv1$a */
    /* loaded from: classes.dex */
    public static class C1229a {

        /* renamed from: a */
        public final List<RT2> f4890a;

        /* renamed from: b */
        public final List<RT2> f4891b;

        /* renamed from: c */
        public final List<RT2> f4892c;

        /* renamed from: d */
        public long f4893d;

        public C1229a(RT2 rt2) {
            this(rt2, 7);
        }

        /* renamed from: a */
        public C1229a m111347a(RT2 rt2, int i) {
            boolean z;
            boolean z2 = false;
            if (rt2 != null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103736b(z, "Point cannot be null.");
            if (i >= 1 && i <= 7) {
                z2 = true;
            }
            HZ3.m103736b(z2, "Invalid metering mode " + i);
            if ((i & 1) != 0) {
                this.f4890a.add(rt2);
            }
            if ((i & 2) != 0) {
                this.f4891b.add(rt2);
            }
            if ((i & 4) != 0) {
                this.f4892c.add(rt2);
            }
            return this;
        }

        /* renamed from: b */
        public C32271Cv1 m111346b() {
            return new C32271Cv1(this);
        }

        public C1229a(RT2 rt2, int i) {
            this.f4890a = new ArrayList();
            this.f4891b = new ArrayList();
            this.f4892c = new ArrayList();
            this.f4893d = 5000L;
            m111347a(rt2, i);
        }
    }

    public C32271Cv1(C1229a c1229a) {
        this.f4886a = Collections.unmodifiableList(c1229a.f4890a);
        this.f4887b = Collections.unmodifiableList(c1229a.f4891b);
        this.f4888c = Collections.unmodifiableList(c1229a.f4892c);
        this.f4889d = c1229a.f4893d;
    }

    /* renamed from: a */
    public long m111352a() {
        return this.f4889d;
    }

    /* renamed from: b */
    public List<RT2> m111351b() {
        return this.f4887b;
    }

    /* renamed from: c */
    public List<RT2> m111350c() {
        return this.f4886a;
    }

    /* renamed from: d */
    public List<RT2> m111349d() {
        return this.f4888c;
    }

    /* renamed from: e */
    public boolean m111348e() {
        return this.f4889d > 0;
    }
}
