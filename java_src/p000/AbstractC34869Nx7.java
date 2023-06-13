package p000;

import java.util.Set;
/* renamed from: Nx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC34869Nx7 extends AbstractC48306rr7 implements Set {

    /* renamed from: c */
    public transient AbstractC32268Cu7 f25409c;

    @Override // p000.AbstractC48306rr7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: e */
    public abstract AbstractC42026hG7 iterator();

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
    public final AbstractC32268Cu7 m93164h() {
        AbstractC32268Cu7 abstractC32268Cu7 = this.f25409c;
        if (abstractC32268Cu7 == null) {
            AbstractC32268Cu7 mo80262j = mo80262j();
            this.f25409c = mo80262j;
            return mo80262j;
        }
        return abstractC32268Cu7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C48539sF7.m14491a(this);
    }

    /* renamed from: j */
    public AbstractC32268Cu7 mo80262j() {
        Object[] array = toArray();
        AbstractC37867aH7 abstractC37867aH7 = AbstractC32268Cu7.f4881c;
        return AbstractC32268Cu7.m111361j(array, array.length);
    }
}
