package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: CM7 */
/* loaded from: classes5.dex */
public final class CM7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C52761zN7 f4003b;

    public CM7(C52761zN7 c52761zN7) {
        this.f4003b = c52761zN7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4003b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4003b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C52761zN7 c52761zN7 = this.f4003b;
        Map m1449j = c52761zN7.m1449j();
        if (m1449j != null) {
            return m1449j.keySet().iterator();
        }
        return new KK7(c52761zN7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m1440s;
        Object obj2;
        Map m1449j = this.f4003b.m1449j();
        if (m1449j != null) {
            return m1449j.keySet().remove(obj);
        }
        m1440s = this.f4003b.m1440s(obj);
        obj2 = C52761zN7.f121259k;
        if (m1440s == obj2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4003b.size();
    }
}
