package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Um7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36408Um7 extends RQ7 {

    /* renamed from: c */
    public final /* synthetic */ AbstractC37389Yr7 f37981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36408Um7(AbstractC37389Yr7 abstractC37389Yr7, Map map) {
        super(map);
        this.f37981c = abstractC37389Yr7;
    }

    @Override // p000.RQ7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        JM7.m100639a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f32022b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f32022b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32022b.keySet().hashCode();
    }

    @Override // p000.RQ7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C37335Yl7(this, this.f32022b.entrySet().iterator());
    }

    @Override // p000.RQ7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f32022b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            AbstractC37389Yr7 abstractC37389Yr7 = this.f37981c;
            i = abstractC37389Yr7.f47501e;
            abstractC37389Yr7.f47501e = i - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
