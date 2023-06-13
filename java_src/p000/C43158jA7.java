package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: jA7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43158jA7 extends C40373eU7 {

    /* renamed from: c */
    public final /* synthetic */ AbstractC42619iG7 f92263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43158jA7(AbstractC42619iG7 abstractC42619iG7, Map map) {
        super(map);
        this.f92263c = abstractC42619iG7;
    }

    @Override // p000.C40373eU7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        NS7.m93876a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f78453b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f78453b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f78453b.keySet().hashCode();
    }

    @Override // p000.C40373eU7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C48978sz7(this, this.f78453b.entrySet().iterator());
    }

    @Override // p000.C40373eU7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f78453b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            AbstractC42619iG7 abstractC42619iG7 = this.f92263c;
            i = abstractC42619iG7.f87049e;
            abstractC42619iG7.f87049e = i - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
