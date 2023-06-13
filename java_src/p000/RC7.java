package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: RC7 */
/* loaded from: classes5.dex */
public final class RC7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C43796kF7 f31672b;

    public RC7(C43796kF7 c43796kF7) {
        this.f31672b = c43796kF7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f31672b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f31672b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C43796kF7 c43796kF7 = this.f31672b;
        Map m29126j = c43796kF7.m29126j();
        if (m29126j != null) {
            return m29126j.keySet().iterator();
        }
        return new C35562Qw7(c43796kF7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m29117s;
        Object obj2;
        Map m29126j = this.f31672b.m29126j();
        if (m29126j != null) {
            return m29126j.keySet().remove(obj);
        }
        m29117s = this.f31672b.m29117s(obj);
        obj2 = C43796kF7.f94162k;
        if (m29117s == obj2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31672b.size();
    }
}
