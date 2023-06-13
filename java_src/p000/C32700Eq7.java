package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Eq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32700Eq7 extends AbstractCollection {

    /* renamed from: b */
    public final Object f8185b;

    /* renamed from: c */
    public Collection f8186c;

    /* renamed from: d */
    public final C32700Eq7 f8187d;

    /* renamed from: e */
    public final Collection f8188e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC38821bt7 f8189f;

    public C32700Eq7(AbstractC38821bt7 abstractC38821bt7, Object obj, Collection collection, C32700Eq7 c32700Eq7) {
        this.f8189f = abstractC38821bt7;
        this.f8185b = obj;
        this.f8186c = collection;
        this.f8187d = c32700Eq7;
        this.f8188e = c32700Eq7 == null ? null : c32700Eq7.f8186c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m108328a() {
        Map map;
        C32700Eq7 c32700Eq7 = this.f8187d;
        if (c32700Eq7 != null) {
            c32700Eq7.m108328a();
            return;
        }
        map = this.f8189f.f59723d;
        map.put(this.f8185b, this.f8186c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f8186c.isEmpty();
        boolean add = this.f8186c.add(obj);
        if (add) {
            AbstractC38821bt7.m62193f(this.f8189f);
            if (isEmpty) {
                m108328a();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f8186c.addAll(collection);
        if (addAll) {
            AbstractC38821bt7.m62190j(this.f8189f, this.f8186c.size() - size);
            if (size == 0) {
                m108328a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m108327b() {
        Map map;
        C32700Eq7 c32700Eq7 = this.f8187d;
        if (c32700Eq7 != null) {
            c32700Eq7.m108327b();
        } else if (this.f8186c.isEmpty()) {
            map = this.f8189f.f59723d;
            map.remove(this.f8185b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f8186c.clear();
        AbstractC38821bt7.m62189k(this.f8189f, size);
        m108327b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f8186c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f8186c.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f8186c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f8186c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C34095Kp7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f8186c.remove(obj);
        if (remove) {
            AbstractC38821bt7.m62192g(this.f8189f);
            m108327b();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f8186c.removeAll(collection);
        if (removeAll) {
            AbstractC38821bt7.m62190j(this.f8189f, this.f8186c.size() - size);
            m108327b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f8186c.retainAll(collection);
        if (retainAll) {
            AbstractC38821bt7.m62190j(this.f8189f, this.f8186c.size() - size);
            m108327b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f8186c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f8186c.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        C32700Eq7 c32700Eq7 = this.f8187d;
        if (c32700Eq7 != null) {
            c32700Eq7.zzb();
            if (this.f8187d.f8186c != this.f8188e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f8186c.isEmpty()) {
            map = this.f8189f.f59723d;
            Collection collection = (Collection) map.get(this.f8185b);
            if (collection != null) {
                this.f8186c = collection;
            }
        }
    }
}
