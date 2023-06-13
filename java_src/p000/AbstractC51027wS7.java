package p000;

import java.util.Set;
/* renamed from: wS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC51027wS7 extends VO7 implements Set {

    /* renamed from: c */
    public transient DR7 f116023c;

    @Override // p000.VO7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: e */
    public abstract AbstractC41011fZ7 iterator();

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
    public final DR7 m6793h() {
        DR7 dr7 = this.f116023c;
        if (dr7 == null) {
            DR7 mo6792j = mo6792j();
            this.f116023c = mo6792j;
            return mo6792j;
        }
        return dr7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return CX7.m112153a(this);
    }

    /* renamed from: j */
    public DR7 mo6792j() {
        Object[] array = toArray();
        AbstractC49312tZ7 abstractC49312tZ7 = DR7.f5706c;
        return DR7.m110447j(array, array.length);
    }
}
