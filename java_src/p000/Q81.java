package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.nimbusds.jose.JOSEException;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* renamed from: Q81 */
/* loaded from: classes6.dex */
public final class Q81 extends AbstractC41085fh2 {

    /* renamed from: r */
    public static final Set<C41417gF0> f29863r = Collections.unmodifiableSet(new HashSet(Arrays.asList(C41417gF0.f81831e, C41417gF0.f81832f, C41417gF0.f81834h, C41417gF0.f81835i)));
    private static final long serialVersionUID = 1;

    /* renamed from: m */
    public final C41417gF0 f29864m;

    /* renamed from: n */
    public final C3824Iy f29865n;

    /* renamed from: o */
    public final C3824Iy f29866o;

    /* renamed from: p */
    public final C3824Iy f29867p;

    /* renamed from: q */
    public final PrivateKey f29868q;

    public Q81(C41417gF0 c41417gF0, C3824Iy c3824Iy, C3824Iy c3824Iy2, C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set, C1744E9 c1744e9, String str, URI uri, C3824Iy c3824Iy3, C3824Iy c3824Iy4, List<C2990Gy> list, KeyStore keyStore) {
        super(C34981Ok2.f27171d, c35683Rk2, set, c1744e9, str, uri, c3824Iy3, c3824Iy4, list, keyStore);
        if (c41417gF0 != null) {
            this.f29864m = c41417gF0;
            if (c3824Iy != null) {
                this.f29865n = c3824Iy;
                if (c3824Iy2 != null) {
                    this.f29866o = c3824Iy2;
                    m88894q(c41417gF0, c3824Iy, c3824Iy2);
                    m88895p(m41028f());
                    this.f29867p = null;
                    this.f29868q = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    /* renamed from: o */
    public static C3824Iy m88896o(int i, BigInteger bigInteger) {
        byte[] m100768a = C3992JG.m100768a(bigInteger);
        int i2 = (i + 7) / 8;
        if (m100768a.length >= i2) {
            return C3824Iy.m101442e(m100768a);
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(m100768a, 0, bArr, i2 - m100768a.length, m100768a.length);
        return C3824Iy.m101442e(bArr);
    }

    /* renamed from: q */
    public static void m88894q(C41417gF0 c41417gF0, C3824Iy c3824Iy, C3824Iy c3824Iy2) {
        if (f29863r.contains(c41417gF0)) {
            if (L81.m97673a(c3824Iy.m104548b(), c3824Iy2.m104548b(), c41417gF0.m39798e())) {
                return;
            }
            throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + c41417gF0 + " curve");
        }
        throw new IllegalArgumentException("Unknown / unsupported curve: " + c41417gF0);
    }

    /* renamed from: v */
    public static Q81 m88889v(String str) throws ParseException {
        return m88888w(C34477Mg2.m95055m(str));
    }

    /* renamed from: w */
    public static Q81 m88888w(Map<String, Object> map) throws ParseException {
        if (C34981Ok2.f27171d.equals(C41678gh2.m37900d(map))) {
            try {
                C41417gF0 m39799d = C41417gF0.m39799d(C34477Mg2.m95060h(map, "crv"));
                C3824Iy m95067a = C34477Mg2.m95067a(map, "x");
                C3824Iy m95067a2 = C34477Mg2.m95067a(map, "y");
                C3824Iy m95067a3 = C34477Mg2.m95067a(map, DateTokenConverter.CONVERTER_KEY);
                try {
                    if (m95067a3 == null) {
                        return new Q81(m39799d, m95067a, m95067a2, C41678gh2.m37899e(map), C41678gh2.m37901c(map), C41678gh2.m37903a(map), C41678gh2.m37902b(map), C41678gh2.m37895i(map), C41678gh2.m37896h(map), C41678gh2.m37897g(map), C41678gh2.m37898f(map), null);
                    }
                    return new Q81(m39799d, m95067a, m95067a2, m95067a3, C41678gh2.m37899e(map), C41678gh2.m37901c(map), C41678gh2.m37903a(map), C41678gh2.m37902b(map), C41678gh2.m37895i(map), C41678gh2.m37896h(map), C41678gh2.m37897g(map), C41678gh2.m37898f(map), (KeyStore) null);
                } catch (IllegalArgumentException e) {
                    throw new ParseException(e.getMessage(), 0);
                }
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        }
        throw new ParseException("The key type \"kty\" must be EC", 0);
    }

    @Override // p000.AbstractC41085fh2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q81) || !super.equals(obj)) {
            return false;
        }
        Q81 q81 = (Q81) obj;
        if (Objects.equals(this.f29864m, q81.f29864m) && Objects.equals(this.f29865n, q81.f29865n) && Objects.equals(this.f29866o, q81.f29866o) && Objects.equals(this.f29867p, q81.f29867p) && Objects.equals(this.f29868q, q81.f29868q)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC41085fh2
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f29864m, this.f29865n, this.f29866o, this.f29867p, this.f29868q);
    }

    @Override // p000.AbstractC41085fh2
    /* renamed from: k */
    public boolean mo20514k() {
        return (this.f29867p == null && this.f29868q == null) ? false : true;
    }

    @Override // p000.AbstractC41085fh2
    /* renamed from: m */
    public Map<String, Object> mo20513m() {
        Map<String, Object> mo20513m = super.mo20513m();
        mo20513m.put("crv", this.f29864m.toString());
        mo20513m.put("x", this.f29865n.toString());
        mo20513m.put("y", this.f29866o.toString());
        C3824Iy c3824Iy = this.f29867p;
        if (c3824Iy != null) {
            mo20513m.put(DateTokenConverter.CONVERTER_KEY, c3824Iy.toString());
        }
        return mo20513m;
    }

    /* renamed from: p */
    public final void m88895p(List<X509Certificate> list) {
        if (list == null || m88890u(list.get(0))) {
            return;
        }
        throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
    }

    /* renamed from: r */
    public C41417gF0 m88893r() {
        return this.f29864m;
    }

    /* renamed from: s */
    public C3824Iy m88892s() {
        return this.f29865n;
    }

    /* renamed from: t */
    public C3824Iy m88891t() {
        return this.f29866o;
    }

    /* renamed from: u */
    public boolean m88890u(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) m41028f().get(0).getPublicKey();
            if (!m88892s().m104548b().equals(eCPublicKey.getW().getAffineX())) {
                return false;
            }
            return m88891t().m104548b().equals(eCPublicKey.getW().getAffineY());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: x */
    public ECPublicKey m88887x() throws JOSEException {
        return m88886y(null);
    }

    /* renamed from: y */
    public ECPublicKey m88886y(Provider provider) throws JOSEException {
        KeyFactory keyFactory;
        ECParameterSpec m39798e = this.f29864m.m39798e();
        if (m39798e != null) {
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(new ECPoint(this.f29865n.m104548b(), this.f29866o.m104548b()), m39798e);
            try {
                if (provider == null) {
                    keyFactory = KeyFactory.getInstance("EC");
                } else {
                    keyFactory = KeyFactory.getInstance("EC", provider);
                }
                return (ECPublicKey) keyFactory.generatePublic(eCPublicKeySpec);
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        }
        throw new JOSEException("Couldn't get EC parameter spec for curve " + this.f29864m);
    }

    /* renamed from: z */
    public Q81 m88885z() {
        return new Q81(m88893r(), m88892s(), m88891t(), m41029e(), m41031c(), m41033a(), m41032b(), m41024j(), m41025i(), m41026h(), m41027g(), m41030d());
    }

    /* renamed from: Q81$a */
    /* loaded from: classes6.dex */
    public static class C6685a {

        /* renamed from: a */
        public final C41417gF0 f29869a;

        /* renamed from: b */
        public final C3824Iy f29870b;

        /* renamed from: c */
        public final C3824Iy f29871c;

        /* renamed from: d */
        public C3824Iy f29872d;

        /* renamed from: e */
        public PrivateKey f29873e;

        /* renamed from: f */
        public C35683Rk2 f29874f;

        /* renamed from: g */
        public Set<EnumC52380yk2> f29875g;

        /* renamed from: h */
        public C1744E9 f29876h;

        /* renamed from: i */
        public String f29877i;

        /* renamed from: j */
        public URI f29878j;
        @Deprecated

        /* renamed from: k */
        public C3824Iy f29879k;

        /* renamed from: l */
        public C3824Iy f29880l;

        /* renamed from: m */
        public List<C2990Gy> f29881m;

        /* renamed from: n */
        public KeyStore f29882n;

        public C6685a(C41417gF0 c41417gF0, C3824Iy c3824Iy, C3824Iy c3824Iy2) {
            if (c41417gF0 != null) {
                this.f29869a = c41417gF0;
                if (c3824Iy != null) {
                    this.f29870b = c3824Iy;
                    if (c3824Iy2 != null) {
                        this.f29871c = c3824Iy2;
                        return;
                    }
                    throw new IllegalArgumentException("The 'y' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            throw new IllegalArgumentException("The curve must not be null");
        }

        /* renamed from: a */
        public Q81 m88884a() {
            try {
                if (this.f29872d == null && this.f29873e == null) {
                    return new Q81(this.f29869a, this.f29870b, this.f29871c, this.f29874f, this.f29875g, this.f29876h, this.f29877i, this.f29878j, this.f29879k, this.f29880l, this.f29881m, this.f29882n);
                }
                if (this.f29873e != null) {
                    return new Q81(this.f29869a, this.f29870b, this.f29871c, this.f29873e, this.f29874f, this.f29875g, this.f29876h, this.f29877i, this.f29878j, this.f29879k, this.f29880l, this.f29881m, this.f29882n);
                }
                return new Q81(this.f29869a, this.f29870b, this.f29871c, this.f29872d, this.f29874f, this.f29875g, this.f29876h, this.f29877i, this.f29878j, this.f29879k, this.f29880l, this.f29881m, this.f29882n);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        /* renamed from: b */
        public C6685a m88883b(String str) {
            this.f29877i = str;
            return this;
        }

        /* renamed from: c */
        public C6685a m88882c(C35683Rk2 c35683Rk2) {
            this.f29874f = c35683Rk2;
            return this;
        }

        public C6685a(C41417gF0 c41417gF0, ECPublicKey eCPublicKey) {
            this(c41417gF0, Q81.m88896o(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), Q81.m88896o(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }
    }

    public Q81(C41417gF0 c41417gF0, C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3, C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set, C1744E9 c1744e9, String str, URI uri, C3824Iy c3824Iy4, C3824Iy c3824Iy5, List<C2990Gy> list, KeyStore keyStore) {
        super(C34981Ok2.f27171d, c35683Rk2, set, c1744e9, str, uri, c3824Iy4, c3824Iy5, list, keyStore);
        if (c41417gF0 != null) {
            this.f29864m = c41417gF0;
            if (c3824Iy != null) {
                this.f29865n = c3824Iy;
                if (c3824Iy2 != null) {
                    this.f29866o = c3824Iy2;
                    m88894q(c41417gF0, c3824Iy, c3824Iy2);
                    m88895p(m41028f());
                    if (c3824Iy3 != null) {
                        this.f29867p = c3824Iy3;
                        this.f29868q = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public Q81(C41417gF0 c41417gF0, C3824Iy c3824Iy, C3824Iy c3824Iy2, PrivateKey privateKey, C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set, C1744E9 c1744e9, String str, URI uri, C3824Iy c3824Iy3, C3824Iy c3824Iy4, List<C2990Gy> list, KeyStore keyStore) {
        super(C34981Ok2.f27171d, c35683Rk2, set, c1744e9, str, uri, c3824Iy3, c3824Iy4, list, keyStore);
        if (c41417gF0 != null) {
            this.f29864m = c41417gF0;
            if (c3824Iy != null) {
                this.f29865n = c3824Iy;
                if (c3824Iy2 != null) {
                    this.f29866o = c3824Iy2;
                    m88894q(c41417gF0, c3824Iy, c3824Iy2);
                    m88895p(m41028f());
                    this.f29867p = null;
                    this.f29868q = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
