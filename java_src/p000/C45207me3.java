package p000;

import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: me3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45207me3 extends AbstractC41085fh2 {
    private static final long serialVersionUID = 1;

    /* renamed from: m */
    public final C3824Iy f98495m;

    public C45207me3(C3824Iy c3824Iy, C35683Rk2 c35683Rk2, Set<EnumC52380yk2> set, C1744E9 c1744e9, String str, URI uri, C3824Iy c3824Iy2, C3824Iy c3824Iy3, List<C2990Gy> list, KeyStore keyStore) {
        super(C34981Ok2.f27173f, c35683Rk2, set, c1744e9, str, uri, c3824Iy2, c3824Iy3, list, keyStore);
        if (c3824Iy != null) {
            this.f98495m = c3824Iy;
            return;
        }
        throw new IllegalArgumentException("The key value must not be null");
    }

    /* renamed from: p */
    public static C45207me3 m25239p(Map<String, Object> map) throws ParseException {
        C34981Ok2 c34981Ok2 = C34981Ok2.f27173f;
        if (c34981Ok2.equals(C41678gh2.m37900d(map))) {
            try {
                return new C45207me3(C34477Mg2.m95067a(map, "k"), C41678gh2.m37899e(map), C41678gh2.m37901c(map), C41678gh2.m37903a(map), C41678gh2.m37902b(map), C41678gh2.m37895i(map), C41678gh2.m37896h(map), C41678gh2.m37897g(map), C41678gh2.m37898f(map), null);
            } catch (IllegalArgumentException e) {
                throw new ParseException(e.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + c34981Ok2.m91591a(), 0);
    }

    @Override // p000.AbstractC41085fh2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45207me3) || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f98495m, ((C45207me3) obj).f98495m);
    }

    @Override // p000.AbstractC41085fh2
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f98495m);
    }

    @Override // p000.AbstractC41085fh2
    /* renamed from: k */
    public boolean mo20514k() {
        return true;
    }

    @Override // p000.AbstractC41085fh2
    /* renamed from: m */
    public Map<String, Object> mo20513m() {
        Map<String, Object> mo20513m = super.mo20513m();
        mo20513m.put("k", this.f98495m.toString());
        return mo20513m;
    }

    /* renamed from: o */
    public C3824Iy m25240o() {
        return this.f98495m;
    }

    /* renamed from: q */
    public byte[] m25238q() {
        return m25240o().m104549a();
    }

    /* renamed from: r */
    public SecretKey m25237r(String str) {
        return new SecretKeySpec(m25238q(), str);
    }
}
