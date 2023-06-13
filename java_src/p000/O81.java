package p000;

import com.nimbusds.jose.JOSEException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/* renamed from: O81 */
/* loaded from: classes6.dex */
public abstract class O81 extends AbstractC25933mB {

    /* renamed from: c */
    public static final Set<C42271hh2> f25939c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(C42271hh2.f85669k);
        linkedHashSet.add(C42271hh2.f85670l);
        linkedHashSet.add(C42271hh2.f85671m);
        linkedHashSet.add(C42271hh2.f85672n);
        f25939c = Collections.unmodifiableSet(linkedHashSet);
    }

    public O81(C42271hh2 c42271hh2) throws JOSEException {
        super(new HashSet(Collections.singletonList(c42271hh2)));
        if (f25939c.contains(c42271hh2)) {
            return;
        }
        throw new JOSEException("Unsupported EC DSA algorithm: " + c42271hh2);
    }

    /* renamed from: d */
    public C42271hh2 m92854d() {
        return m26190c().iterator().next();
    }
}
