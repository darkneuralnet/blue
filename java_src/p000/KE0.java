package p000;

import com.nimbusds.jose.JOSEException;
import java.util.Collections;
import java.util.Set;
/* renamed from: KE0 */
/* loaded from: classes6.dex */
public class KE0 {

    /* renamed from: a */
    public Set<String> f19301a = Collections.emptySet();

    /* renamed from: a */
    public void m99066a(C38696bh2 c38696bh2) throws JOSEException {
        if (m99063d(c38696bh2)) {
            return;
        }
        throw new JOSEException("Unsupported critical header parameter(s)");
    }

    /* renamed from: b */
    public Set<String> m99065b() {
        return Collections.unmodifiableSet(this.f19301a);
    }

    /* renamed from: c */
    public Set<String> m99064c() {
        return Collections.singleton("b64");
    }

    /* renamed from: d */
    public boolean m99063d(AbstractC52108yH1 abstractC52108yH1) {
        if (abstractC52108yH1.m3728c() == null) {
            return true;
        }
        for (String str : abstractC52108yH1.m3728c()) {
            if (!m99064c().contains(str) && !m99065b().contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void m99062e(Set<String> set) {
        if (set == null) {
            this.f19301a = Collections.emptySet();
        } else {
            this.f19301a = set;
        }
    }
}
