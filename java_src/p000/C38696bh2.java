package p000;

import ch.qos.logback.classic.Level;
import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: bh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38696bh2 extends AbstractC31982Bp0 {
    private static final long serialVersionUID = 1;

    /* renamed from: z */
    public static final Set<String> f57872z;

    /* renamed from: p */
    public final C36312Uc1 f57873p;

    /* renamed from: q */
    public final AbstractC41085fh2 f57874q;

    /* renamed from: r */
    public final C50699vu0 f57875r;

    /* renamed from: s */
    public final C3824Iy f57876s;

    /* renamed from: t */
    public final C3824Iy f57877t;

    /* renamed from: u */
    public final C3824Iy f57878u;

    /* renamed from: v */
    public final int f57879v;

    /* renamed from: w */
    public final C3824Iy f57880w;

    /* renamed from: x */
    public final C3824Iy f57881x;

    /* renamed from: y */
    public final String f57882y;

    /* renamed from: bh2$a */
    /* loaded from: classes6.dex */
    public static class C12474a {

        /* renamed from: a */
        public final C37051Xg2 f57883a;

        /* renamed from: b */
        public final C36312Uc1 f57884b;

        /* renamed from: c */
        public C33073Gg2 f57885c;

        /* renamed from: d */
        public String f57886d;

        /* renamed from: e */
        public Set<String> f57887e;

        /* renamed from: f */
        public URI f57888f;

        /* renamed from: g */
        public AbstractC41085fh2 f57889g;

        /* renamed from: h */
        public URI f57890h;
        @Deprecated

        /* renamed from: i */
        public C3824Iy f57891i;

        /* renamed from: j */
        public C3824Iy f57892j;

        /* renamed from: k */
        public List<C2990Gy> f57893k;

        /* renamed from: l */
        public String f57894l;

        /* renamed from: m */
        public AbstractC41085fh2 f57895m;

        /* renamed from: n */
        public C50699vu0 f57896n;

        /* renamed from: o */
        public C3824Iy f57897o;

        /* renamed from: p */
        public C3824Iy f57898p;

        /* renamed from: q */
        public C3824Iy f57899q;

        /* renamed from: r */
        public int f57900r;

        /* renamed from: s */
        public C3824Iy f57901s;

        /* renamed from: t */
        public C3824Iy f57902t;

        /* renamed from: u */
        public String f57903u;

        /* renamed from: v */
        public Map<String, Object> f57904v;

        /* renamed from: w */
        public C3824Iy f57905w;

        public C12474a(C37051Xg2 c37051Xg2, C36312Uc1 c36312Uc1) {
            if (!c37051Xg2.getName().equals(C1744E9.f7018d.getName())) {
                this.f57883a = c37051Xg2;
                if (c36312Uc1 != null) {
                    this.f57884b = c36312Uc1;
                    return;
                }
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        }

        /* renamed from: a */
        public C12474a m64161a(C3824Iy c3824Iy) {
            this.f57897o = c3824Iy;
            return this;
        }

        /* renamed from: b */
        public C12474a m64160b(C3824Iy c3824Iy) {
            this.f57898p = c3824Iy;
            return this;
        }

        /* renamed from: c */
        public C12474a m64159c(C3824Iy c3824Iy) {
            this.f57902t = c3824Iy;
            return this;
        }

        /* renamed from: d */
        public C38696bh2 m64158d() {
            return new C38696bh2(this.f57883a, this.f57884b, this.f57885c, this.f57886d, this.f57887e, this.f57888f, this.f57889g, this.f57890h, this.f57891i, this.f57892j, this.f57893k, this.f57894l, this.f57895m, this.f57896n, this.f57897o, this.f57898p, this.f57899q, this.f57900r, this.f57901s, this.f57902t, this.f57903u, this.f57904v, this.f57905w);
        }

        /* renamed from: e */
        public C12474a m64157e(C50699vu0 c50699vu0) {
            this.f57896n = c50699vu0;
            return this;
        }

        /* renamed from: f */
        public C12474a m64156f(String str) {
            this.f57886d = str;
            return this;
        }

        /* renamed from: g */
        public C12474a m64155g(Set<String> set) {
            this.f57887e = set;
            return this;
        }

        /* renamed from: h */
        public C12474a m64154h(String str, Object obj) {
            if (!C38696bh2.m64166u().contains(str)) {
                if (this.f57904v == null) {
                    this.f57904v = new HashMap();
                }
                this.f57904v.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        /* renamed from: i */
        public C12474a m64153i(AbstractC41085fh2 abstractC41085fh2) {
            this.f57895m = abstractC41085fh2;
            return this;
        }

        /* renamed from: j */
        public C12474a m64152j(C3824Iy c3824Iy) {
            this.f57901s = c3824Iy;
            return this;
        }

        /* renamed from: k */
        public C12474a m64151k(AbstractC41085fh2 abstractC41085fh2) {
            if (abstractC41085fh2 != null && abstractC41085fh2.mo20514k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f57889g = abstractC41085fh2;
            return this;
        }

        /* renamed from: l */
        public C12474a m64150l(URI uri) {
            this.f57888f = uri;
            return this;
        }

        /* renamed from: m */
        public C12474a m64149m(String str) {
            this.f57894l = str;
            return this;
        }

        /* renamed from: n */
        public C12474a m64148n(C3824Iy c3824Iy) {
            this.f57905w = c3824Iy;
            return this;
        }

        /* renamed from: o */
        public C12474a m64147o(int i) {
            if (i >= 0) {
                this.f57900r = i;
                return this;
            }
            throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
        }

        /* renamed from: p */
        public C12474a m64146p(C3824Iy c3824Iy) {
            this.f57899q = c3824Iy;
            return this;
        }

        /* renamed from: q */
        public C12474a m64145q(String str) {
            this.f57903u = str;
            return this;
        }

        /* renamed from: r */
        public C12474a m64144r(C33073Gg2 c33073Gg2) {
            this.f57885c = c33073Gg2;
            return this;
        }

        /* renamed from: s */
        public C12474a m64143s(List<C2990Gy> list) {
            this.f57893k = list;
            return this;
        }

        /* renamed from: t */
        public C12474a m64142t(C3824Iy c3824Iy) {
            this.f57892j = c3824Iy;
            return this;
        }

        @Deprecated
        /* renamed from: u */
        public C12474a m64141u(C3824Iy c3824Iy) {
            this.f57891i = c3824Iy;
            return this;
        }

        /* renamed from: v */
        public C12474a m64140v(URI uri) {
            this.f57890h = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("authTag");
        f57872z = Collections.unmodifiableSet(hashSet);
    }

    public C38696bh2(C1744E9 c1744e9, C36312Uc1 c36312Uc1, C33073Gg2 c33073Gg2, String str, Set<String> set, URI uri, AbstractC41085fh2 abstractC41085fh2, URI uri2, C3824Iy c3824Iy, C3824Iy c3824Iy2, List<C2990Gy> list, String str2, AbstractC41085fh2 abstractC41085fh22, C50699vu0 c50699vu0, C3824Iy c3824Iy3, C3824Iy c3824Iy4, C3824Iy c3824Iy5, int i, C3824Iy c3824Iy6, C3824Iy c3824Iy7, String str3, Map<String, Object> map, C3824Iy c3824Iy8) {
        super(c1744e9, c33073Gg2, str, set, uri, abstractC41085fh2, uri2, c3824Iy, c3824Iy2, list, str2, map, c3824Iy8);
        if (c1744e9.getName().equals(C1744E9.f7018d.getName())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (c36312Uc1 != null) {
            if (abstractC41085fh22 != null && abstractC41085fh22.mo20514k()) {
                throw new IllegalArgumentException("Ephemeral public key should not be a private key");
            }
            this.f57873p = c36312Uc1;
            this.f57874q = abstractC41085fh22;
            this.f57875r = c50699vu0;
            this.f57876s = c3824Iy3;
            this.f57877t = c3824Iy4;
            this.f57878u = c3824Iy5;
            this.f57879v = i;
            this.f57880w = c3824Iy6;
            this.f57881x = c3824Iy7;
            this.f57882y = str3;
            return;
        }
        throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
    }

    /* renamed from: u */
    public static Set<String> m64166u() {
        return f57872z;
    }

    /* renamed from: v */
    public static C38696bh2 m64165v(C3824Iy c3824Iy) throws ParseException {
        return m64164w(c3824Iy.m104547c(), c3824Iy);
    }

    /* renamed from: w */
    public static C38696bh2 m64164w(String str, C3824Iy c3824Iy) throws ParseException {
        return m64163x(C34477Mg2.m95054n(str, Level.INFO_INT), c3824Iy);
    }

    /* renamed from: x */
    public static C38696bh2 m64163x(Map<String, Object> map, C3824Iy c3824Iy) throws ParseException {
        C1744E9 m3724g = AbstractC52108yH1.m3724g(map);
        if (m3724g instanceof C37051Xg2) {
            C12474a m64148n = new C12474a((C37051Xg2) m3724g, m64162y(map)).m64148n(c3824Iy);
            for (String str : map.keySet()) {
                if (!"alg".equals(str) && !"enc".equals(str)) {
                    if ("typ".equals(str)) {
                        String m95060h = C34477Mg2.m95060h(map, str);
                        if (m95060h != null) {
                            m64148n = m64148n.m64144r(new C33073Gg2(m95060h));
                        }
                    } else if ("cty".equals(str)) {
                        m64148n = m64148n.m64156f(C34477Mg2.m95060h(map, str));
                    } else if ("crit".equals(str)) {
                        List<String> m95058j = C34477Mg2.m95058j(map, str);
                        if (m95058j != null) {
                            m64148n = m64148n.m64155g(new HashSet(m95058j));
                        }
                    } else if ("jku".equals(str)) {
                        m64148n = m64148n.m64150l(C34477Mg2.m95057k(map, str));
                    } else if ("jwk".equals(str)) {
                        m64148n = m64148n.m64151k(AbstractC31982Bp0.m113455q(C34477Mg2.m95062f(map, str)));
                    } else if ("x5u".equals(str)) {
                        m64148n = m64148n.m64140v(C34477Mg2.m95057k(map, str));
                    } else if ("x5t".equals(str)) {
                        m64148n = m64148n.m64141u(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        m64148n = m64148n.m64142t(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("x5c".equals(str)) {
                        m64148n = m64148n.m64143s(C47964rH6.m16113b(C34477Mg2.m95063e(map, str)));
                    } else if ("kid".equals(str)) {
                        m64148n = m64148n.m64149m(C34477Mg2.m95060h(map, str));
                    } else if ("epk".equals(str)) {
                        m64148n = m64148n.m64153i(AbstractC41085fh2.m41023l(C34477Mg2.m95062f(map, str)));
                    } else if ("zip".equals(str)) {
                        String m95060h2 = C34477Mg2.m95060h(map, str);
                        if (m95060h2 != null) {
                            m64148n = m64148n.m64157e(new C50699vu0(m95060h2));
                        }
                    } else if ("apu".equals(str)) {
                        m64148n = m64148n.m64161a(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("apv".equals(str)) {
                        m64148n = m64148n.m64160b(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("p2s".equals(str)) {
                        m64148n = m64148n.m64146p(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("p2c".equals(str)) {
                        m64148n = m64148n.m64147o(C34477Mg2.m95064d(map, str));
                    } else if ("iv".equals(str)) {
                        m64148n = m64148n.m64152j(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("tag".equals(str)) {
                        m64148n = m64148n.m64159c(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("skid".equals(str)) {
                        m64148n = m64148n.m64145q(C34477Mg2.m95060h(map, str));
                    } else {
                        m64148n = m64148n.m64154h(str, map.get(str));
                    }
                }
            }
            return m64148n.m64158d();
        }
        throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
    }

    /* renamed from: y */
    public static C36312Uc1 m64162y(Map<String, Object> map) throws ParseException {
        return C36312Uc1.m81264c(C34477Mg2.m95060h(map, "enc"));
    }

    @Override // p000.AbstractC31982Bp0, p000.AbstractC52108yH1
    /* renamed from: i */
    public Map<String, Object> mo3722i() {
        Map<String, Object> mo3722i = super.mo3722i();
        C36312Uc1 c36312Uc1 = this.f57873p;
        if (c36312Uc1 != null) {
            mo3722i.put("enc", c36312Uc1.toString());
        }
        AbstractC41085fh2 abstractC41085fh2 = this.f57874q;
        if (abstractC41085fh2 != null) {
            mo3722i.put("epk", abstractC41085fh2.mo20513m());
        }
        C50699vu0 c50699vu0 = this.f57875r;
        if (c50699vu0 != null) {
            mo3722i.put("zip", c50699vu0.toString());
        }
        C3824Iy c3824Iy = this.f57876s;
        if (c3824Iy != null) {
            mo3722i.put("apu", c3824Iy.toString());
        }
        C3824Iy c3824Iy2 = this.f57877t;
        if (c3824Iy2 != null) {
            mo3722i.put("apv", c3824Iy2.toString());
        }
        C3824Iy c3824Iy3 = this.f57878u;
        if (c3824Iy3 != null) {
            mo3722i.put("p2s", c3824Iy3.toString());
        }
        int i = this.f57879v;
        if (i > 0) {
            mo3722i.put("p2c", Integer.valueOf(i));
        }
        C3824Iy c3824Iy4 = this.f57880w;
        if (c3824Iy4 != null) {
            mo3722i.put("iv", c3824Iy4.toString());
        }
        C3824Iy c3824Iy5 = this.f57881x;
        if (c3824Iy5 != null) {
            mo3722i.put("tag", c3824Iy5.toString());
        }
        String str = this.f57882y;
        if (str != null) {
            mo3722i.put("skid", str);
        }
        return mo3722i;
    }

    /* renamed from: r */
    public C37051Xg2 m64169r() {
        return (C37051Xg2) super.m3730a();
    }

    /* renamed from: s */
    public C50699vu0 m64168s() {
        return this.f57875r;
    }

    /* renamed from: t */
    public C36312Uc1 m64167t() {
        return this.f57873p;
    }
}
