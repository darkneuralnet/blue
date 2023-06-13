package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.ConcurrentMapC51543xK2;
import p000.KV2;
/* renamed from: wK2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50950wK2 {

    /* renamed from: a */
    public boolean f115806a;

    /* renamed from: b */
    public int f115807b = -1;

    /* renamed from: c */
    public int f115808c = -1;

    /* renamed from: d */
    public ConcurrentMapC51543xK2.EnumC30113p f115809d;

    /* renamed from: e */
    public ConcurrentMapC51543xK2.EnumC30113p f115810e;

    /* renamed from: f */
    public AbstractC35637Rf1<Object> f115811f;

    /* renamed from: a */
    public C50950wK2 m7004a(int i) {
        boolean z;
        int i2 = this.f115808c;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108793v(z, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z2 = false;
        }
        EZ3.m108811d(z2);
        this.f115808c = i;
        return this;
    }

    /* renamed from: b */
    public int m7003b() {
        int i = this.f115808c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* renamed from: c */
    public int m7002c() {
        int i = this.f115807b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* renamed from: d */
    public AbstractC35637Rf1<Object> m7001d() {
        return (AbstractC35637Rf1) KV2.m98828a(this.f115811f, m7000e().mo5490b());
    }

    /* renamed from: e */
    public ConcurrentMapC51543xK2.EnumC30113p m7000e() {
        return (ConcurrentMapC51543xK2.EnumC30113p) KV2.m98828a(this.f115809d, ConcurrentMapC51543xK2.EnumC30113p.f117412b);
    }

    /* renamed from: f */
    public ConcurrentMapC51543xK2.EnumC30113p m6999f() {
        return (ConcurrentMapC51543xK2.EnumC30113p) KV2.m98828a(this.f115810e, ConcurrentMapC51543xK2.EnumC30113p.f117412b);
    }

    /* renamed from: g */
    public C50950wK2 m6998g(int i) {
        boolean z;
        int i2 = this.f115807b;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108793v(z, "initial capacity was already set to %s", i2);
        if (i < 0) {
            z2 = false;
        }
        EZ3.m108811d(z2);
        this.f115807b = i;
        return this;
    }

    /* renamed from: h */
    public C50950wK2 m6997h(AbstractC35637Rf1<Object> abstractC35637Rf1) {
        boolean z;
        AbstractC35637Rf1<Object> abstractC35637Rf12 = this.f115811f;
        if (abstractC35637Rf12 == null) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108792w(z, "key equivalence was already set to %s", abstractC35637Rf12);
        this.f115811f = (AbstractC35637Rf1) EZ3.m108801n(abstractC35637Rf1);
        this.f115806a = true;
        return this;
    }

    /* renamed from: i */
    public <K, V> ConcurrentMap<K, V> m6996i() {
        if (!this.f115806a) {
            return new ConcurrentHashMap(m7002c(), 0.75f, m7003b());
        }
        return ConcurrentMapC51543xK2.m5550b(this);
    }

    /* renamed from: j */
    public C50950wK2 m6995j(ConcurrentMapC51543xK2.EnumC30113p enumC30113p) {
        boolean z;
        ConcurrentMapC51543xK2.EnumC30113p enumC30113p2 = this.f115809d;
        if (enumC30113p2 == null) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108792w(z, "Key strength was already set to %s", enumC30113p2);
        this.f115809d = (ConcurrentMapC51543xK2.EnumC30113p) EZ3.m108801n(enumC30113p);
        if (enumC30113p != ConcurrentMapC51543xK2.EnumC30113p.f117412b) {
            this.f115806a = true;
        }
        return this;
    }

    /* renamed from: k */
    public C50950wK2 m6994k(ConcurrentMapC51543xK2.EnumC30113p enumC30113p) {
        boolean z;
        ConcurrentMapC51543xK2.EnumC30113p enumC30113p2 = this.f115810e;
        if (enumC30113p2 == null) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108792w(z, "Value strength was already set to %s", enumC30113p2);
        this.f115810e = (ConcurrentMapC51543xK2.EnumC30113p) EZ3.m108801n(enumC30113p);
        if (enumC30113p != ConcurrentMapC51543xK2.EnumC30113p.f117412b) {
            this.f115806a = true;
        }
        return this;
    }

    /* renamed from: l */
    public C50950wK2 m6993l() {
        return m6995j(ConcurrentMapC51543xK2.EnumC30113p.f117413c);
    }

    /* renamed from: m */
    public C50950wK2 m6992m() {
        return m6994k(ConcurrentMapC51543xK2.EnumC30113p.f117413c);
    }

    public String toString() {
        KV2.C4454b m98826c = KV2.m98826c(this);
        int i = this.f115807b;
        if (i != -1) {
            m98826c.m98825a("initialCapacity", i);
        }
        int i2 = this.f115808c;
        if (i2 != -1) {
            m98826c.m98825a("concurrencyLevel", i2);
        }
        ConcurrentMapC51543xK2.EnumC30113p enumC30113p = this.f115809d;
        if (enumC30113p != null) {
            m98826c.m98824b("keyStrength", C2950Go.m104712b(enumC30113p.toString()));
        }
        ConcurrentMapC51543xK2.EnumC30113p enumC30113p2 = this.f115810e;
        if (enumC30113p2 != null) {
            m98826c.m98824b("valueStrength", C2950Go.m104712b(enumC30113p2.toString()));
        }
        if (this.f115811f != null) {
            m98826c.m98818h("keyEquivalence");
        }
        return m98826c.toString();
    }
}
