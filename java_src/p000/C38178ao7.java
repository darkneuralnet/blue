package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: ao7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38178ao7 extends C49213tO7 {

    /* renamed from: c */
    public final /* synthetic */ AbstractC38821bt7 f56336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38178ao7(AbstractC38821bt7 abstractC38821bt7, Map map) {
        super(map);
        this.f56336c = abstractC38821bt7;
    }

    @Override // p000.C49213tO7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        UM7.m81584a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f110423b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f110423b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f110423b.keySet().hashCode();
    }

    @Override // p000.C49213tO7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C35472Qm7(this, this.f110423b.entrySet().iterator());
    }

    @Override // p000.C49213tO7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f110423b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            AbstractC38821bt7.m62189k(this.f56336c, size);
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
