package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: xp7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C51842xp7 extends AbstractCollection {

    /* renamed from: b */
    public final Object f118195b;

    /* renamed from: c */
    public Collection f118196c;

    /* renamed from: d */
    public final C51842xp7 f118197d;

    /* renamed from: e */
    public final Collection f118198e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC37389Yr7 f118199f;

    public C51842xp7(AbstractC37389Yr7 abstractC37389Yr7, Object obj, Collection collection, C51842xp7 c51842xp7) {
        this.f118199f = abstractC37389Yr7;
        this.f118195b = obj;
        this.f118196c = collection;
        this.f118197d = c51842xp7;
        this.f118198e = c51842xp7 == null ? null : c51842xp7.f118196c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4585a() {
        Map map;
        C51842xp7 c51842xp7 = this.f118197d;
        if (c51842xp7 != null) {
            c51842xp7.m4585a();
            return;
        }
        map = this.f118199f.f47500d;
        map.put(this.f118195b, this.f118196c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.f118196c.isEmpty();
        boolean add = this.f118196c.add(obj);
        if (add) {
            AbstractC37389Yr7 abstractC37389Yr7 = this.f118199f;
            i = abstractC37389Yr7.f47501e;
            abstractC37389Yr7.f47501e = i + 1;
            if (isEmpty) {
                m4585a();
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
        boolean addAll = this.f118196c.addAll(collection);
        if (addAll) {
            int size2 = this.f118196c.size();
            AbstractC37389Yr7 abstractC37389Yr7 = this.f118199f;
            i = abstractC37389Yr7.f47501e;
            abstractC37389Yr7.f47501e = i + (size2 - size);
            if (size == 0) {
                m4585a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m4584b() {
        Map map;
        C51842xp7 c51842xp7 = this.f118197d;
        if (c51842xp7 != null) {
            c51842xp7.m4584b();
        } else if (this.f118196c.isEmpty()) {
            map = this.f118199f.f47500d;
            map.remove(this.f118195b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.f118196c.clear();
        AbstractC37389Yr7 abstractC37389Yr7 = this.f118199f;
        i = abstractC37389Yr7.f47501e;
        abstractC37389Yr7.f47501e = i - size;
        m4584b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f118196c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f118196c.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f118196c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f118196c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C32916Fo7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zzb();
        boolean remove = this.f118196c.remove(obj);
        if (remove) {
            AbstractC37389Yr7 abstractC37389Yr7 = this.f118199f;
            i = abstractC37389Yr7.f47501e;
            abstractC37389Yr7.f47501e = i - 1;
            m4584b();
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
        boolean removeAll = this.f118196c.removeAll(collection);
        if (removeAll) {
            int size2 = this.f118196c.size();
            AbstractC37389Yr7 abstractC37389Yr7 = this.f118199f;
            i = abstractC37389Yr7.f47501e;
            abstractC37389Yr7.f47501e = i + (size2 - size);
            m4584b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.f118196c.retainAll(collection);
        if (retainAll) {
            int size2 = this.f118196c.size();
            AbstractC37389Yr7 abstractC37389Yr7 = this.f118199f;
            i = abstractC37389Yr7.f47501e;
            abstractC37389Yr7.f47501e = i + (size2 - size);
            m4584b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f118196c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f118196c.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        C51842xp7 c51842xp7 = this.f118197d;
        if (c51842xp7 != null) {
            c51842xp7.zzb();
            if (this.f118197d.f118196c != this.f118198e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f118196c.isEmpty()) {
            map = this.f118199f.f47500d;
            Collection collection = (Collection) map.get(this.f118195b);
            if (collection != null) {
                this.f118196c = collection;
            }
        }
    }
}
