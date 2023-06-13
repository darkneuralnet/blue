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
/* renamed from: ih2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42864ih2 extends AbstractC31982Bp0 {

    /* renamed from: q */
    public static final Set<String> f87739q;
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    public final boolean f87740p;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
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
        hashSet.add("b64");
        f87739q = Collections.unmodifiableSet(hashSet);
    }

    public C42864ih2(C42271hh2 c42271hh2, C33073Gg2 c33073Gg2, String str, Set<String> set, URI uri, AbstractC41085fh2 abstractC41085fh2, URI uri2, C3824Iy c3824Iy, C3824Iy c3824Iy2, List<C2990Gy> list, String str2, boolean z, Map<String, Object> map, C3824Iy c3824Iy3) {
        super(c42271hh2, c33073Gg2, str, set, uri, abstractC41085fh2, uri2, c3824Iy, c3824Iy2, list, str2, map, c3824Iy3);
        if (!c42271hh2.getName().equals(C1744E9.f7018d.getName())) {
            this.f87740p = z;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    /* renamed from: s */
    public static Set<String> m33576s() {
        return f87739q;
    }

    /* renamed from: u */
    public static C42864ih2 m33574u(C3824Iy c3824Iy) throws ParseException {
        return m33573v(c3824Iy.m104547c(), c3824Iy);
    }

    /* renamed from: v */
    public static C42864ih2 m33573v(String str, C3824Iy c3824Iy) throws ParseException {
        return m33572w(C34477Mg2.m95054n(str, Level.INFO_INT), c3824Iy);
    }

    /* renamed from: w */
    public static C42864ih2 m33572w(Map<String, Object> map, C3824Iy c3824Iy) throws ParseException {
        C1744E9 m3724g = AbstractC52108yH1.m3724g(map);
        if (m3724g instanceof C42271hh2) {
            C23328a m33563i = new C23328a((C42271hh2) m3724g).m33563i(c3824Iy);
            for (String str : map.keySet()) {
                if (!"alg".equals(str)) {
                    if ("typ".equals(str)) {
                        String m95060h = C34477Mg2.m95060h(map, str);
                        if (m95060h != null) {
                            m33563i = m33563i.m33562j(new C33073Gg2(m95060h));
                        }
                    } else if ("cty".equals(str)) {
                        m33563i = m33563i.m33569c(C34477Mg2.m95060h(map, str));
                    } else if ("crit".equals(str)) {
                        List<String> m95058j = C34477Mg2.m95058j(map, str);
                        if (m95058j != null) {
                            m33563i = m33563i.m33568d(new HashSet(m95058j));
                        }
                    } else if ("jku".equals(str)) {
                        m33563i = m33563i.m33565g(C34477Mg2.m95057k(map, str));
                    } else if ("jwk".equals(str)) {
                        m33563i = m33563i.m33566f(AbstractC31982Bp0.m113455q(C34477Mg2.m95062f(map, str)));
                    } else if ("x5u".equals(str)) {
                        m33563i = m33563i.m33558n(C34477Mg2.m95057k(map, str));
                    } else if ("x5t".equals(str)) {
                        m33563i = m33563i.m33559m(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        m33563i = m33563i.m33560l(C3824Iy.m101441f(C34477Mg2.m95060h(map, str)));
                    } else if ("x5c".equals(str)) {
                        m33563i = m33563i.m33561k(C47964rH6.m16113b(C34477Mg2.m95063e(map, str)));
                    } else if ("kid".equals(str)) {
                        m33563i = m33563i.m33564h(C34477Mg2.m95060h(map, str));
                    } else if ("b64".equals(str)) {
                        m33563i = m33563i.m33571a(C34477Mg2.m95066b(map, str));
                    } else {
                        m33563i = m33563i.m33567e(str, map.get(str));
                    }
                }
            }
            return m33563i.m33570b();
        }
        throw new ParseException("Not a JWS header", 0);
    }

    @Override // p000.AbstractC31982Bp0, p000.AbstractC52108yH1
    /* renamed from: i */
    public Map<String, Object> mo3722i() {
        Map<String, Object> mo3722i = super.mo3722i();
        if (!m33575t()) {
            mo3722i.put("b64", Boolean.FALSE);
        }
        return mo3722i;
    }

    @Override // p000.AbstractC31982Bp0
    /* renamed from: j */
    public /* bridge */ /* synthetic */ AbstractC41085fh2 mo33584j() {
        return super.mo33584j();
    }

    @Override // p000.AbstractC31982Bp0
    /* renamed from: k */
    public /* bridge */ /* synthetic */ URI mo33583k() {
        return super.mo33583k();
    }

    @Override // p000.AbstractC31982Bp0
    /* renamed from: l */
    public /* bridge */ /* synthetic */ String mo33582l() {
        return super.mo33582l();
    }

    @Override // p000.AbstractC31982Bp0
    /* renamed from: m */
    public /* bridge */ /* synthetic */ List mo33581m() {
        return super.mo33581m();
    }

    @Override // p000.AbstractC31982Bp0
    /* renamed from: n */
    public /* bridge */ /* synthetic */ C3824Iy mo33580n() {
        return super.mo33580n();
    }

    @Override // p000.AbstractC31982Bp0
    @Deprecated
    /* renamed from: o */
    public /* bridge */ /* synthetic */ C3824Iy mo33579o() {
        return super.mo33579o();
    }

    @Override // p000.AbstractC31982Bp0
    /* renamed from: p */
    public /* bridge */ /* synthetic */ URI mo33578p() {
        return super.mo33578p();
    }

    /* renamed from: r */
    public C42271hh2 m33577r() {
        return (C42271hh2) super.m3730a();
    }

    /* renamed from: t */
    public boolean m33575t() {
        return this.f87740p;
    }

    /* renamed from: ih2$a */
    /* loaded from: classes6.dex */
    public static class C23328a {

        /* renamed from: a */
        public final C42271hh2 f87741a;

        /* renamed from: b */
        public C33073Gg2 f87742b;

        /* renamed from: c */
        public String f87743c;

        /* renamed from: d */
        public Set<String> f87744d;

        /* renamed from: e */
        public URI f87745e;

        /* renamed from: f */
        public AbstractC41085fh2 f87746f;

        /* renamed from: g */
        public URI f87747g;
        @Deprecated

        /* renamed from: h */
        public C3824Iy f87748h;

        /* renamed from: i */
        public C3824Iy f87749i;

        /* renamed from: j */
        public List<C2990Gy> f87750j;

        /* renamed from: k */
        public String f87751k;

        /* renamed from: l */
        public boolean f87752l;

        /* renamed from: m */
        public Map<String, Object> f87753m;

        /* renamed from: n */
        public C3824Iy f87754n;

        public C23328a(C42271hh2 c42271hh2) {
            this.f87752l = true;
            if (!c42271hh2.getName().equals(C1744E9.f7018d.getName())) {
                this.f87741a = c42271hh2;
                return;
            }
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }

        /* renamed from: a */
        public C23328a m33571a(boolean z) {
            this.f87752l = z;
            return this;
        }

        /* renamed from: b */
        public C42864ih2 m33570b() {
            return new C42864ih2(this.f87741a, this.f87742b, this.f87743c, this.f87744d, this.f87745e, this.f87746f, this.f87747g, this.f87748h, this.f87749i, this.f87750j, this.f87751k, this.f87752l, this.f87753m, this.f87754n);
        }

        /* renamed from: c */
        public C23328a m33569c(String str) {
            this.f87743c = str;
            return this;
        }

        /* renamed from: d */
        public C23328a m33568d(Set<String> set) {
            this.f87744d = set;
            return this;
        }

        /* renamed from: e */
        public C23328a m33567e(String str, Object obj) {
            if (!C42864ih2.m33576s().contains(str)) {
                if (this.f87753m == null) {
                    this.f87753m = new HashMap();
                }
                this.f87753m.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        /* renamed from: f */
        public C23328a m33566f(AbstractC41085fh2 abstractC41085fh2) {
            if (abstractC41085fh2 != null && abstractC41085fh2.mo20514k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f87746f = abstractC41085fh2;
            return this;
        }

        /* renamed from: g */
        public C23328a m33565g(URI uri) {
            this.f87745e = uri;
            return this;
        }

        /* renamed from: h */
        public C23328a m33564h(String str) {
            this.f87751k = str;
            return this;
        }

        /* renamed from: i */
        public C23328a m33563i(C3824Iy c3824Iy) {
            this.f87754n = c3824Iy;
            return this;
        }

        /* renamed from: j */
        public C23328a m33562j(C33073Gg2 c33073Gg2) {
            this.f87742b = c33073Gg2;
            return this;
        }

        /* renamed from: k */
        public C23328a m33561k(List<C2990Gy> list) {
            this.f87750j = list;
            return this;
        }

        /* renamed from: l */
        public C23328a m33560l(C3824Iy c3824Iy) {
            this.f87749i = c3824Iy;
            return this;
        }

        @Deprecated
        /* renamed from: m */
        public C23328a m33559m(C3824Iy c3824Iy) {
            this.f87748h = c3824Iy;
            return this;
        }

        /* renamed from: n */
        public C23328a m33558n(URI uri) {
            this.f87747g = uri;
            return this;
        }

        public C23328a(C42864ih2 c42864ih2) {
            this(c42864ih2.m33577r());
            this.f87742b = c42864ih2.m3725f();
            this.f87743c = c42864ih2.m3729b();
            this.f87744d = c42864ih2.m3728c();
            this.f87745e = c42864ih2.mo33583k();
            this.f87746f = c42864ih2.mo33584j();
            this.f87747g = c42864ih2.mo33578p();
            this.f87748h = c42864ih2.mo33579o();
            this.f87749i = c42864ih2.mo33580n();
            this.f87750j = c42864ih2.mo33581m();
            this.f87751k = c42864ih2.mo33582l();
            this.f87752l = c42864ih2.m33575t();
            this.f87753m = c42864ih2.m3726e();
        }
    }
}
