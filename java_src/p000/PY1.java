package p000;

import android.os.Bundle;
/* renamed from: PY1 */
/* loaded from: classes6.dex */
public final class PY1 {

    /* renamed from: b */
    public static final C10776ad f28678b = C10776ad.m71007e();

    /* renamed from: a */
    public final Bundle f28679a;

    public PY1() {
        this(new Bundle());
    }

    /* renamed from: a */
    public boolean m90131a(String str) {
        return str != null && this.f28679a.containsKey(str);
    }

    /* renamed from: b */
    public C43628jy3<Boolean> m90130b(String str) {
        if (!m90131a(str)) {
            return C43628jy3.m29585a();
        }
        try {
            return C43628jy3.m29584b((Boolean) this.f28679a.get(str));
        } catch (ClassCastException e) {
            f28678b.m71010b("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return C43628jy3.m29585a();
        }
    }

    /* renamed from: c */
    public C43628jy3<Double> m90129c(String str) {
        if (!m90131a(str)) {
            return C43628jy3.m29585a();
        }
        Object obj = this.f28679a.get(str);
        if (obj == null) {
            return C43628jy3.m29585a();
        }
        if (obj instanceof Float) {
            return C43628jy3.m29581e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return C43628jy3.m29581e((Double) obj);
        }
        f28678b.m71010b("Metadata key %s contains type other than double: %s", str);
        return C43628jy3.m29585a();
    }

    /* renamed from: d */
    public final C43628jy3<Integer> m90128d(String str) {
        if (!m90131a(str)) {
            return C43628jy3.m29585a();
        }
        try {
            return C43628jy3.m29584b((Integer) this.f28679a.get(str));
        } catch (ClassCastException e) {
            f28678b.m71010b("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return C43628jy3.m29585a();
        }
    }

    /* renamed from: e */
    public C43628jy3<Long> m90127e(String str) {
        C43628jy3<Integer> m90128d = m90128d(str);
        if (m90128d.m29582d()) {
            return C43628jy3.m29581e(Long.valueOf(m90128d.m29583c().intValue()));
        }
        return C43628jy3.m29585a();
    }

    public PY1(Bundle bundle) {
        this.f28679a = (Bundle) bundle.clone();
    }
}
