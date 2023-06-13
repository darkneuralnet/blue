package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* renamed from: om4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46474om4 extends AbstractC41085fh2 {
    private static final long serialVersionUID = 1;

    /* renamed from: m */
    public final C3824Iy f102465m;

    /* renamed from: n */
    public final C3824Iy f102466n;

    /* renamed from: o */
    public final C3824Iy f102467o;

    /* renamed from: p */
    public final C3824Iy f102468p;

    /* renamed from: q */
    public final C3824Iy f102469q;

    /* renamed from: r */
    public final C3824Iy f102470r;

    /* renamed from: s */
    public final C3824Iy f102471s;

    /* renamed from: t */
    public final C3824Iy f102472t;

    /* renamed from: u */
    public final List<C27058a> f102473u;

    /* renamed from: v */
    public final PrivateKey f102474v;

    /* renamed from: om4$a */
    /* loaded from: classes6.dex */
    public static class C27058a implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b */
        public final C3824Iy f102475b;

        /* renamed from: c */
        public final C3824Iy f102476c;

        /* renamed from: d */
        public final C3824Iy f102477d;

        public C27058a(C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3) {
            if (c3824Iy != null) {
                this.f102475b = c3824Iy;
                if (c3824Iy2 != null) {
                    this.f102476c = c3824Iy2;
                    if (c3824Iy3 != null) {
                        this.f102477d = c3824Iy3;
                        return;
                    }
                    throw new IllegalArgumentException("The factor CRT coefficient must not be null");
                }
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            throw new IllegalArgumentException("The prime factor must not be null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C46474om4(C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3, C3824Iy c3824Iy4, C3824Iy c3824Iy5, C3824Iy c3824Iy6, C3824Iy c3824Iy7, C3824Iy c3824Iy8, List<C27058a> list, PrivateKey privateKey, C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set, C1744E9 c1744e9, String str, URI uri, C3824Iy c3824Iy9, C3824Iy c3824Iy10, List<C2990Gy> list2, KeyStore keyStore) {
        super(C34981Ok2.f27172e, c35683Rk2, set, c1744e9, str, uri, c3824Iy9, c3824Iy10, list2, keyStore);
        C3824Iy c3824Iy11;
        C3824Iy c3824Iy12;
        C3824Iy c3824Iy13;
        if (c3824Iy != null) {
            this.f102465m = c3824Iy;
            if (c3824Iy2 != null) {
                this.f102466n = c3824Iy2;
                if (m41028f() != null && !m20512o(m41028f().get(0))) {
                    throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
                }
                this.f102467o = c3824Iy3;
                if (c3824Iy4 == null || c3824Iy5 == null) {
                    c3824Iy11 = c3824Iy6;
                    c3824Iy12 = c3824Iy7;
                } else {
                    c3824Iy11 = c3824Iy6;
                    c3824Iy12 = c3824Iy7;
                    if (c3824Iy11 != null) {
                        c3824Iy13 = c3824Iy8;
                        if (c3824Iy12 != null && c3824Iy13 != null) {
                            this.f102468p = c3824Iy4;
                            this.f102469q = c3824Iy5;
                            this.f102470r = c3824Iy11;
                            this.f102471s = c3824Iy12;
                            this.f102472t = c3824Iy13;
                            if (list != null) {
                                this.f102473u = Collections.unmodifiableList(list);
                            } else {
                                this.f102473u = Collections.emptyList();
                            }
                            this.f102474v = privateKey;
                            return;
                        }
                        if (c3824Iy4 != null && c3824Iy5 == null && c3824Iy11 == null && c3824Iy12 == null && c3824Iy13 == null && list == null) {
                            this.f102468p = null;
                            this.f102469q = null;
                            this.f102470r = null;
                            this.f102471s = null;
                            this.f102472t = null;
                            this.f102473u = Collections.emptyList();
                        } else if (c3824Iy4 == null || c3824Iy5 != null || c3824Iy11 != null || c3824Iy12 != null || c3824Iy13 != null) {
                            if (c3824Iy4 != null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                            }
                            if (c3824Iy5 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                            }
                            if (c3824Iy11 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                            }
                            if (c3824Iy12 == null) {
                                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                            }
                            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                        } else {
                            this.f102468p = null;
                            this.f102469q = null;
                            this.f102470r = null;
                            this.f102471s = null;
                            this.f102472t = null;
                            this.f102473u = Collections.emptyList();
                        }
                        this.f102474v = privateKey;
                        return;
                    }
                }
                c3824Iy13 = c3824Iy8;
                if (c3824Iy4 != null) {
                }
                if (c3824Iy4 == null) {
                }
                if (c3824Iy4 != null) {
                }
            } else {
                throw new IllegalArgumentException("The public exponent value must not be null");
            }
        } else {
            throw new IllegalArgumentException("The modulus value must not be null");
        }
    }

    /* renamed from: p */
    public static C46474om4 m20511p(Map<String, Object> map) throws ParseException {
        ArrayList arrayList;
        List<Object> m95063e;
        if (C34981Ok2.f27172e.equals(C41678gh2.m37900d(map))) {
            C3824Iy m95067a = C34477Mg2.m95067a(map, "n");
            C3824Iy m95067a2 = C34477Mg2.m95067a(map, "e");
            C3824Iy m95067a3 = C34477Mg2.m95067a(map, DateTokenConverter.CONVERTER_KEY);
            C3824Iy m95067a4 = C34477Mg2.m95067a(map, "p");
            C3824Iy m95067a5 = C34477Mg2.m95067a(map, "q");
            C3824Iy m95067a6 = C34477Mg2.m95067a(map, "dp");
            C3824Iy m95067a7 = C34477Mg2.m95067a(map, "dq");
            C3824Iy m95067a8 = C34477Mg2.m95067a(map, "qi");
            if (map.containsKey("oth") && (m95063e = C34477Mg2.m95063e(map, "oth")) != null) {
                arrayList = new ArrayList(m95063e.size());
                for (Object obj : m95063e) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        try {
                            arrayList.add(new C27058a(C34477Mg2.m95067a(map2, "r"), C34477Mg2.m95067a(map2, "dq"), C34477Mg2.m95067a(map2, "t")));
                        } catch (IllegalArgumentException e) {
                            throw new ParseException(e.getMessage(), 0);
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            try {
                return new C46474om4(m95067a, m95067a2, m95067a3, m95067a4, m95067a5, m95067a6, m95067a7, m95067a8, arrayList, null, C41678gh2.m37899e(map), C41678gh2.m37901c(map), C41678gh2.m37903a(map), C41678gh2.m37902b(map), C41678gh2.m37895i(map), C41678gh2.m37896h(map), C41678gh2.m37897g(map), C41678gh2.m37898f(map), null);
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        }
        throw new ParseException("The key type \"kty\" must be RSA", 0);
    }

    @Override // p000.AbstractC41085fh2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46474om4) || !super.equals(obj)) {
            return false;
        }
        C46474om4 c46474om4 = (C46474om4) obj;
        if (Objects.equals(this.f102465m, c46474om4.f102465m) && Objects.equals(this.f102466n, c46474om4.f102466n) && Objects.equals(this.f102467o, c46474om4.f102467o) && Objects.equals(this.f102468p, c46474om4.f102468p) && Objects.equals(this.f102469q, c46474om4.f102469q) && Objects.equals(this.f102470r, c46474om4.f102470r) && Objects.equals(this.f102471s, c46474om4.f102471s) && Objects.equals(this.f102472t, c46474om4.f102472t) && Objects.equals(this.f102473u, c46474om4.f102473u) && Objects.equals(this.f102474v, c46474om4.f102474v)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC41085fh2
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f102465m, this.f102466n, this.f102467o, this.f102468p, this.f102469q, this.f102470r, this.f102471s, this.f102472t, this.f102473u, this.f102474v);
    }

    @Override // p000.AbstractC41085fh2
    /* renamed from: k */
    public boolean mo20514k() {
        return (this.f102467o == null && this.f102468p == null && this.f102474v == null) ? false : true;
    }

    @Override // p000.AbstractC41085fh2
    /* renamed from: m */
    public Map<String, Object> mo20513m() {
        Map<String, Object> mo20513m = super.mo20513m();
        mo20513m.put("n", this.f102465m.toString());
        mo20513m.put("e", this.f102466n.toString());
        C3824Iy c3824Iy = this.f102467o;
        if (c3824Iy != null) {
            mo20513m.put(DateTokenConverter.CONVERTER_KEY, c3824Iy.toString());
        }
        C3824Iy c3824Iy2 = this.f102468p;
        if (c3824Iy2 != null) {
            mo20513m.put("p", c3824Iy2.toString());
        }
        C3824Iy c3824Iy3 = this.f102469q;
        if (c3824Iy3 != null) {
            mo20513m.put("q", c3824Iy3.toString());
        }
        C3824Iy c3824Iy4 = this.f102470r;
        if (c3824Iy4 != null) {
            mo20513m.put("dp", c3824Iy4.toString());
        }
        C3824Iy c3824Iy5 = this.f102471s;
        if (c3824Iy5 != null) {
            mo20513m.put("dq", c3824Iy5.toString());
        }
        C3824Iy c3824Iy6 = this.f102472t;
        if (c3824Iy6 != null) {
            mo20513m.put("qi", c3824Iy6.toString());
        }
        List<C27058a> list = this.f102473u;
        if (list != null && !list.isEmpty()) {
            List<Object> m101818a = C33541Ig2.m101818a();
            for (C27058a c27058a : this.f102473u) {
                Map<String, Object> m95056l = C34477Mg2.m95056l();
                m95056l.put("r", c27058a.f102475b.toString());
                m95056l.put(DateTokenConverter.CONVERTER_KEY, c27058a.f102476c.toString());
                m95056l.put("t", c27058a.f102477d.toString());
                m101818a.add(m95056l);
            }
            mo20513m.put("oth", m101818a);
        }
        return mo20513m;
    }

    /* renamed from: o */
    public boolean m20512o(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) m41028f().get(0).getPublicKey();
            if (!this.f102466n.m104548b().equals(rSAPublicKey.getPublicExponent())) {
                return false;
            }
            return this.f102465m.m104548b().equals(rSAPublicKey.getModulus());
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
