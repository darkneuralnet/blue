package p000;

import java.util.Set;
/* renamed from: Ao9 */
/* loaded from: classes5.dex */
public abstract class Ao9 extends TT8 implements Set {

    /* renamed from: c */
    public transient Ed9 f1166c;

    @Override // p000.TT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public abstract AbstractC49974ug7 iterator();

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
    public final Ed9 m115141h() {
        Ed9 ed9 = this.f1166c;
        if (ed9 == null) {
            Ed9 mo44813j = mo44813j();
            this.f1166c = mo44813j;
            return mo44813j;
        }
        return ed9;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C51149wf7.m6535a(this);
    }

    /* renamed from: j */
    public Ed9 mo44813j() {
        return Ed9.m108632j(toArray());
    }
}
