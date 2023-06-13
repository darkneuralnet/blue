package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: ND7 */
/* loaded from: classes5.dex */
public class ND7 extends AbstractCollection {

    /* renamed from: b */
    public final Object f24307b;

    /* renamed from: c */
    public Collection f24308c;

    /* renamed from: d */
    public final ND7 f24309d;

    /* renamed from: e */
    public final Collection f24310e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC42619iG7 f24311f;

    public ND7(AbstractC42619iG7 abstractC42619iG7, Object obj, Collection collection, ND7 nd7) {
        this.f24311f = abstractC42619iG7;
        this.f24307b = obj;
        this.f24308c = collection;
        this.f24309d = nd7;
        this.f24310e = nd7 == null ? null : nd7.f24308c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m94171a() {
        Map map;
        ND7 nd7 = this.f24309d;
        if (nd7 != null) {
            nd7.m94171a();
            return;
        }
        map = this.f24311f.f87048d;
        map.put(this.f24307b, this.f24308c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.f24308c.isEmpty();
        boolean add = this.f24308c.add(obj);
        if (add) {
            AbstractC42619iG7 abstractC42619iG7 = this.f24311f;
            i = abstractC42619iG7.f87049e;
            abstractC42619iG7.f87049e = i + 1;
            if (isEmpty) {
                m94171a();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f24308c.addAll(collection);
        if (addAll) {
            int size2 = this.f24308c.size();
            AbstractC42619iG7 abstractC42619iG7 = this.f24311f;
            i = abstractC42619iG7.f87049e;
            abstractC42619iG7.f87049e = i + (size2 - size);
            if (size == 0) {
                m94171a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m94170b() {
        Map map;
        ND7 nd7 = this.f24309d;
        if (nd7 != null) {
            nd7.m94170b();
        } else if (this.f24308c.isEmpty()) {
            map = this.f24311f.f87048d;
            map.remove(this.f24307b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.f24308c.clear();
        AbstractC42619iG7 abstractC42619iG7 = this.f24311f;
        i = abstractC42619iG7.f87049e;
        abstractC42619iG7.f87049e = i - size;
        m94170b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f24308c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f24308c.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f24308c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f24308c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new YC7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zzb();
        boolean remove = this.f24308c.remove(obj);
        if (remove) {
            AbstractC42619iG7 abstractC42619iG7 = this.f24311f;
            i = abstractC42619iG7.f87049e;
            abstractC42619iG7.f87049e = i - 1;
            m94170b();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f24308c.removeAll(collection);
        if (removeAll) {
            int size2 = this.f24308c.size();
            AbstractC42619iG7 abstractC42619iG7 = this.f24311f;
            i = abstractC42619iG7.f87049e;
            abstractC42619iG7.f87049e = i + (size2 - size);
            m94170b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.f24308c.retainAll(collection);
        if (retainAll) {
            int size2 = this.f24308c.size();
            AbstractC42619iG7 abstractC42619iG7 = this.f24311f;
            i = abstractC42619iG7.f87049e;
            abstractC42619iG7.f87049e = i + (size2 - size);
            m94170b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f24308c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f24308c.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        ND7 nd7 = this.f24309d;
        if (nd7 != null) {
            nd7.zzb();
            if (this.f24309d.f24308c != this.f24310e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f24308c.isEmpty()) {
            map = this.f24311f.f87048d;
            Collection collection = (Collection) map.get(this.f24307b);
            if (collection != null) {
                this.f24308c = collection;
            }
        }
    }
}
