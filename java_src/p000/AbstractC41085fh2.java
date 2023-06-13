package p000;

import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* renamed from: fh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC41085fh2 implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final C34981Ok2 f80448b;

    /* renamed from: c */
    public final C35683Rk2 f80449c;

    /* renamed from: d */
    public final Set<EnumC52380yk2> f80450d;

    /* renamed from: e */
    public final C1744E9 f80451e;

    /* renamed from: f */
    public final String f80452f;

    /* renamed from: g */
    public final URI f80453g;
    @Deprecated

    /* renamed from: h */
    public final C3824Iy f80454h;

    /* renamed from: i */
    public final C3824Iy f80455i;

    /* renamed from: j */
    public final List<C2990Gy> f80456j;

    /* renamed from: k */
    public final List<X509Certificate> f80457k;

    /* renamed from: l */
    public final KeyStore f80458l;

    public AbstractC41085fh2(C34981Ok2 c34981Ok2, C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set, C1744E9 c1744e9, String str, URI uri, C3824Iy c3824Iy, C3824Iy c3824Iy2, List<C2990Gy> list, KeyStore keyStore) {
        if (c34981Ok2 != null) {
            this.f80448b = c34981Ok2;
            if (C35917Sk2.m84924a(c35683Rk2, set)) {
                this.f80449c = c35683Rk2;
                this.f80450d = set;
                this.f80451e = c1744e9;
                this.f80452f = str;
                this.f80453g = uri;
                this.f80454h = c3824Iy;
                this.f80455i = c3824Iy2;
                if (list != null && list.isEmpty()) {
                    throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
                }
                this.f80456j = list;
                try {
                    this.f80457k = C47964rH6.m16114a(list);
                    this.f80458l = keyStore;
                    return;
                } catch (ParseException e) {
                    throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e.getMessage(), e);
                }
            }
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
    }

    /* renamed from: l */
    public static AbstractC41085fh2 m41023l(Map<String, Object> map) throws ParseException {
        String m95060h = C34477Mg2.m95060h(map, "kty");
        if (m95060h != null) {
            C34981Ok2 m91590b = C34981Ok2.m91590b(m95060h);
            if (m91590b == C34981Ok2.f27171d) {
                return Q81.m88888w(map);
            }
            if (m91590b == C34981Ok2.f27172e) {
                return C46474om4.m20511p(map);
            }
            if (m91590b == C34981Ok2.f27173f) {
                return C45207me3.m25239p(map);
            }
            if (m91590b == C34981Ok2.f27174g) {
                return C44614le3.m27059o(map);
            }
            throw new ParseException("Unsupported key type \"kty\" parameter: " + m91590b, 0);
        }
        throw new ParseException("Missing key type \"kty\" parameter", 0);
    }

    /* renamed from: a */
    public C1744E9 m41033a() {
        return this.f80451e;
    }

    /* renamed from: b */
    public String m41032b() {
        return this.f80452f;
    }

    /* renamed from: c */
    public Set<EnumC52380yk2> m41031c() {
        return this.f80450d;
    }

    /* renamed from: d */
    public KeyStore m41030d() {
        return this.f80458l;
    }

    /* renamed from: e */
    public C35683Rk2 m41029e() {
        return this.f80449c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC41085fh2)) {
            return false;
        }
        AbstractC41085fh2 abstractC41085fh2 = (AbstractC41085fh2) obj;
        if (Objects.equals(this.f80448b, abstractC41085fh2.f80448b) && Objects.equals(this.f80449c, abstractC41085fh2.f80449c) && Objects.equals(this.f80450d, abstractC41085fh2.f80450d) && Objects.equals(this.f80451e, abstractC41085fh2.f80451e) && Objects.equals(this.f80452f, abstractC41085fh2.f80452f) && Objects.equals(this.f80453g, abstractC41085fh2.f80453g) && Objects.equals(this.f80454h, abstractC41085fh2.f80454h) && Objects.equals(this.f80455i, abstractC41085fh2.f80455i) && Objects.equals(this.f80456j, abstractC41085fh2.f80456j) && Objects.equals(this.f80458l, abstractC41085fh2.f80458l)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<X509Certificate> m41028f() {
        List<X509Certificate> list = this.f80457k;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: g */
    public List<C2990Gy> m41027g() {
        List<C2990Gy> list = this.f80456j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: h */
    public C3824Iy m41026h() {
        return this.f80455i;
    }

    public int hashCode() {
        return Objects.hash(this.f80448b, this.f80449c, this.f80450d, this.f80451e, this.f80452f, this.f80453g, this.f80454h, this.f80455i, this.f80456j, this.f80458l);
    }

    @Deprecated
    /* renamed from: i */
    public C3824Iy m41025i() {
        return this.f80454h;
    }

    /* renamed from: j */
    public URI m41024j() {
        return this.f80453g;
    }

    /* renamed from: k */
    public abstract boolean mo20514k();

    /* renamed from: m */
    public Map<String, Object> mo20513m() {
        Map<String, Object> m95056l = C34477Mg2.m95056l();
        m95056l.put("kty", this.f80448b.m91591a());
        C35683Rk2 c35683Rk2 = this.f80449c;
        if (c35683Rk2 != null) {
            m95056l.put("use", c35683Rk2.m86403a());
        }
        if (this.f80450d != null) {
            List<Object> m101818a = C33541Ig2.m101818a();
            for (EnumC52380yk2 enumC52380yk2 : this.f80450d) {
                m101818a.add(enumC52380yk2.m2708a());
            }
            m95056l.put("key_ops", m101818a);
        }
        C1744E9 c1744e9 = this.f80451e;
        if (c1744e9 != null) {
            m95056l.put("alg", c1744e9.getName());
        }
        String str = this.f80452f;
        if (str != null) {
            m95056l.put("kid", str);
        }
        URI uri = this.f80453g;
        if (uri != null) {
            m95056l.put("x5u", uri.toString());
        }
        C3824Iy c3824Iy = this.f80454h;
        if (c3824Iy != null) {
            m95056l.put("x5t", c3824Iy.toString());
        }
        C3824Iy c3824Iy2 = this.f80455i;
        if (c3824Iy2 != null) {
            m95056l.put("x5t#S256", c3824Iy2.toString());
        }
        if (this.f80456j != null) {
            List<Object> m101818a2 = C33541Ig2.m101818a();
            for (C2990Gy c2990Gy : this.f80456j) {
                m101818a2.add(c2990Gy.toString());
            }
            m95056l.put("x5c", m101818a2);
        }
        return m95056l;
    }

    /* renamed from: n */
    public String m41022n() {
        return C34477Mg2.m95053o(mo20513m());
    }

    public String toString() {
        return C34477Mg2.m95053o(mo20513m());
    }
}
