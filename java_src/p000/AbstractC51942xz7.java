package p000;

import java.util.Set;
/* renamed from: xz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC51942xz7 extends AbstractC45944ns7 implements Set {

    /* renamed from: c */
    public transient AbstractC38851bw7 f118554c;

    @Override // p000.AbstractC45944ns7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public abstract ZM7 iterator();

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
    public final AbstractC38851bw7 m4272h() {
        AbstractC38851bw7 abstractC38851bw7 = this.f118554c;
        if (abstractC38851bw7 == null) {
            AbstractC38851bw7 mo4271j = mo4271j();
            this.f118554c = mo4271j;
            return mo4271j;
        }
        return abstractC38851bw7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C48602sM7.m14270a(this);
    }

    /* renamed from: j */
    public AbstractC38851bw7 mo4271j() {
        return AbstractC38851bw7.m62113j(toArray());
    }
}
