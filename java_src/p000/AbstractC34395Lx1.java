package p000;

import java.util.Collection;
import java.util.Set;
/* renamed from: Lx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34395Lx1<E> extends AbstractC31821Ax1<E> implements Set<E> {
    @Override // p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
    /* renamed from: a */
    public abstract Set<E> delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // p000.AbstractC31821Ax1
    public boolean standardRemoveAll(Collection<?> collection) {
        return C40052dw5.m43484k(this, (Collection) EZ3.m108801n(collection));
    }
}
