package p000;

import java.util.Set;
/* renamed from: tM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC49195tM7 extends AbstractC47983rJ7 implements Set {

    /* renamed from: c */
    public transient AbstractC51557xL7 f110337c;

    @Override // p000.AbstractC47983rJ7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public abstract AbstractC46312oV7 iterator();

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
    public final AbstractC51557xL7 m12491h() {
        AbstractC51557xL7 abstractC51557xL7 = this.f110337c;
        if (abstractC51557xL7 == null) {
            AbstractC51557xL7 mo12490j = mo12490j();
            this.f110337c = mo12490j;
            return mo12490j;
        }
        return abstractC51557xL7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return LU7.m96794a(this);
    }

    /* renamed from: j */
    public AbstractC51557xL7 mo12490j() {
        Object[] array = toArray();
        OV7 ov7 = AbstractC51557xL7.f117443c;
        return AbstractC51557xL7.m5426j(array, array.length);
    }
}
