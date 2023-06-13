package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: bl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38741bl7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C34545Mn7 f58046b;

    public C38741bl7(C34545Mn7 c34545Mn7) {
        this.f58046b = c34545Mn7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f58046b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f58046b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C34545Mn7 c34545Mn7 = this.f58046b;
        Map m94811n = c34545Mn7.m94811n();
        if (m94811n != null) {
            return m94811n.keySet().iterator();
        }
        return new C52345yg7(c34545Mn7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m94799z;
        Object obj2;
        Map m94811n = this.f58046b.m94811n();
        if (m94811n != null) {
            return m94811n.keySet().remove(obj);
        }
        m94799z = this.f58046b.m94799z(obj);
        obj2 = C34545Mn7.f23579k;
        if (m94799z == obj2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f58046b.size();
    }
}
