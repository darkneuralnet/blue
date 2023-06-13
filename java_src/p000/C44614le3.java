package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* renamed from: le3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44614le3 extends AbstractC41085fh2 {

    /* renamed from: r */
    public static final Set<C41417gF0> f96477r = Collections.unmodifiableSet(new HashSet(Arrays.asList(C41417gF0.f81836j, C41417gF0.f81837k, C41417gF0.f81838l, C41417gF0.f81839m)));
    private static final long serialVersionUID = 1;

    /* renamed from: m */
    public final C41417gF0 f96478m;

    /* renamed from: n */
    public final C3824Iy f96479n;

    /* renamed from: o */
    public final byte[] f96480o;

    /* renamed from: p */
    public final C3824Iy f96481p;

    /* renamed from: q */
    public final byte[] f96482q;

    public C44614le3(C41417gF0 c41417gF0, C3824Iy c3824Iy, C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set, C1744E9 c1744e9, String str, URI uri, C3824Iy c3824Iy2, C3824Iy c3824Iy3, List<C2990Gy> list, KeyStore keyStore) {
        super(C34981Ok2.f27174g, c35683Rk2, set, c1744e9, str, uri, c3824Iy2, c3824Iy3, list, keyStore);
        if (c41417gF0 != null) {
            if (f96477r.contains(c41417gF0)) {
                this.f96478m = c41417gF0;
                if (c3824Iy != null) {
                    this.f96479n = c3824Iy;
                    this.f96480o = c3824Iy.m104549a();
                    this.f96481p = null;
                    this.f96482q = null;
                    return;
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + c41417gF0);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    /* renamed from: o */
    public static C44614le3 m27059o(Map<String, Object> map) throws ParseException {
        C34981Ok2 c34981Ok2 = C34981Ok2.f27174g;
        if (c34981Ok2.equals(C41678gh2.m37900d(map))) {
            try {
                C41417gF0 m39799d = C41417gF0.m39799d(C34477Mg2.m95060h(map, "crv"));
                C3824Iy m95067a = C34477Mg2.m95067a(map, "x");
                C3824Iy m95067a2 = C34477Mg2.m95067a(map, DateTokenConverter.CONVERTER_KEY);
                try {
                    if (m95067a2 == null) {
                        return new C44614le3(m39799d, m95067a, C41678gh2.m37899e(map), C41678gh2.m37901c(map), C41678gh2.m37903a(map), C41678gh2.m37902b(map), C41678gh2.m37895i(map), C41678gh2.m37896h(map), C41678gh2.m37897g(map), C41678gh2.m37898f(map), null);
                    }
                    return new C44614le3(m39799d, m95067a, m95067a2, C41678gh2.m37899e(map), C41678gh2.m37901c(map), C41678gh2.m37903a(map), C41678gh2.m37902b(map), C41678gh2.m37895i(map), C41678gh2.m37896h(map), C41678gh2.m37897g(map), C41678gh2.m37898f(map), null);
                } catch (IllegalArgumentException e) {
                    throw new ParseException(e.getMessage(), 0);
                }
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + c34981Ok2.m91591a(), 0);
    }

    @Override // p000.AbstractC41085fh2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44614le3) || !super.equals(obj)) {
            return false;
        }
        C44614le3 c44614le3 = (C44614le3) obj;
        if (Objects.equals(this.f96478m, c44614le3.f96478m) && Objects.equals(this.f96479n, c44614le3.f96479n) && Arrays.equals(this.f96480o, c44614le3.f96480o) && Objects.equals(this.f96481p, c44614le3.f96481p) && Arrays.equals(this.f96482q, c44614le3.f96482q)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC41085fh2
    public int hashCode() {
        return (((Objects.hash(Integer.valueOf(super.hashCode()), this.f96478m, this.f96479n, this.f96481p) * 31) + Arrays.hashCode(this.f96480o)) * 31) + Arrays.hashCode(this.f96482q);
    }

    @Override // p000.AbstractC41085fh2
    /* renamed from: k */
    public boolean mo20514k() {
        return this.f96481p != null;
    }

    @Override // p000.AbstractC41085fh2
    /* renamed from: m */
    public Map<String, Object> mo20513m() {
        Map<String, Object> mo20513m = super.mo20513m();
        mo20513m.put("crv", this.f96478m.toString());
        mo20513m.put("x", this.f96479n.toString());
        C3824Iy c3824Iy = this.f96481p;
        if (c3824Iy != null) {
            mo20513m.put(DateTokenConverter.CONVERTER_KEY, c3824Iy.toString());
        }
        return mo20513m;
    }

    public C44614le3(C41417gF0 c41417gF0, C3824Iy c3824Iy, C3824Iy c3824Iy2, C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set, C1744E9 c1744e9, String str, URI uri, C3824Iy c3824Iy3, C3824Iy c3824Iy4, List<C2990Gy> list, KeyStore keyStore) {
        super(C34981Ok2.f27174g, c35683Rk2, set, c1744e9, str, uri, c3824Iy3, c3824Iy4, list, keyStore);
        if (c41417gF0 != null) {
            if (f96477r.contains(c41417gF0)) {
                this.f96478m = c41417gF0;
                if (c3824Iy != null) {
                    this.f96479n = c3824Iy;
                    this.f96480o = c3824Iy.m104549a();
                    if (c3824Iy2 != null) {
                        this.f96481p = c3824Iy2;
                        this.f96482q = c3824Iy2.m104549a();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + c41417gF0);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
