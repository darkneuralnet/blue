package p000;

import java.util.Set;
/* renamed from: ZL7 */
/* loaded from: classes5.dex */
public abstract class ZL7 extends OI7 implements Set {

    /* renamed from: c */
    public transient AbstractC40292eL7 f48378c;

    @Override // p000.OI7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract AbstractC49806uO7 iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: h */
    public final AbstractC40292eL7 m73249h() {
        AbstractC40292eL7 abstractC40292eL7 = this.f48378c;
        if (abstractC40292eL7 == null) {
            AbstractC40292eL7 mo73248j = mo73248j();
            this.f48378c = mo73248j;
            return mo73248j;
        }
        return abstractC40292eL7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C42098hO7.m36461a(this);
    }

    /* renamed from: j */
    public AbstractC40292eL7 mo73248j() {
        return AbstractC40292eL7.m43010j(toArray());
    }
}
