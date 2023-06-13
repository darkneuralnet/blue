package p000;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: yH1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC52108yH1 implements Serializable {

    /* renamed from: h */
    public static final Map<String, Object> f119284h = Collections.unmodifiableMap(new HashMap());
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final C1744E9 f119285b;

    /* renamed from: c */
    public final C33073Gg2 f119286c;

    /* renamed from: d */
    public final String f119287d;

    /* renamed from: e */
    public final Set<String> f119288e;

    /* renamed from: f */
    public final Map<String, Object> f119289f;

    /* renamed from: g */
    public final C3824Iy f119290g;

    public AbstractC52108yH1(C1744E9 c1744e9, C33073Gg2 c33073Gg2, String str, Set<String> set, Map<String, Object> map, C3824Iy c3824Iy) {
        if (c1744e9 != null) {
            this.f119285b = c1744e9;
            this.f119286c = c33073Gg2;
            this.f119287d = str;
            if (set != null) {
                this.f119288e = Collections.unmodifiableSet(new HashSet(set));
            } else {
                this.f119288e = null;
            }
            if (map != null) {
                this.f119289f = Collections.unmodifiableMap(new HashMap(map));
            } else {
                this.f119289f = f119284h;
            }
            this.f119290g = c3824Iy;
            return;
        }
        throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
    }

    /* renamed from: g */
    public static C1744E9 m3724g(Map<String, Object> map) throws ParseException {
        String m95060h = C34477Mg2.m95060h(map, "alg");
        if (m95060h != null) {
            C1744E9 c1744e9 = C1744E9.f7018d;
            if (m95060h.equals(c1744e9.getName())) {
                return c1744e9;
            }
            if (map.containsKey("enc")) {
                return C37051Xg2.m76703b(m95060h);
            }
            return C42271hh2.m36096b(m95060h);
        }
        throw new ParseException("Missing \"alg\" in header JSON object", 0);
    }

    /* renamed from: a */
    public C1744E9 m3730a() {
        return this.f119285b;
    }

    /* renamed from: b */
    public String m3729b() {
        return this.f119287d;
    }

    /* renamed from: c */
    public Set<String> m3728c() {
        return this.f119288e;
    }

    /* renamed from: d */
    public Object m3727d(String str) {
        return this.f119289f.get(str);
    }

    /* renamed from: e */
    public Map<String, Object> m3726e() {
        return this.f119289f;
    }

    /* renamed from: f */
    public C33073Gg2 m3725f() {
        return this.f119286c;
    }

    /* renamed from: h */
    public C3824Iy m3723h() {
        C3824Iy c3824Iy = this.f119290g;
        if (c3824Iy == null) {
            return C3824Iy.m101443d(toString());
        }
        return c3824Iy;
    }

    /* renamed from: i */
    public Map<String, Object> mo3722i() {
        Map<String, Object> m95056l = C34477Mg2.m95056l();
        m95056l.putAll(this.f119289f);
        m95056l.put("alg", this.f119285b.toString());
        C33073Gg2 c33073Gg2 = this.f119286c;
        if (c33073Gg2 != null) {
            m95056l.put("typ", c33073Gg2.toString());
        }
        String str = this.f119287d;
        if (str != null) {
            m95056l.put("cty", str);
        }
        Set<String> set = this.f119288e;
        if (set != null && !set.isEmpty()) {
            m95056l.put("crit", new ArrayList(this.f119288e));
        }
        return m95056l;
    }

    public String toString() {
        return C34477Mg2.m95053o(mo3722i());
    }
}
