package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* renamed from: Do9 */
/* loaded from: classes5.dex */
public class Do9 extends AbstractCollection {

    /* renamed from: b */
    public final Object f6377b;

    /* renamed from: c */
    public Collection f6378c;

    /* renamed from: d */
    public final Do9 f6379d;

    /* renamed from: e */
    public final Collection f6380e;

    /* renamed from: f */
    public final /* synthetic */ Jt9 f6381f;

    public Do9(Jt9 jt9, Object obj, Collection collection, Do9 do9) {
        this.f6381f = jt9;
        this.f6377b = obj;
        this.f6378c = collection;
        this.f6379d = do9;
        this.f6380e = do9 == null ? null : do9.f6378c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m109899a() {
        Do9 do9 = this.f6379d;
        if (do9 != null) {
            do9.m109899a();
        } else {
            Jt9.m99582n(this.f6381f).put(this.f6377b, this.f6378c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f6378c.isEmpty();
        boolean add = this.f6378c.add(obj);
        if (add) {
            Jt9.m99588f(this.f6381f);
            if (isEmpty) {
                m109899a();
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
        boolean addAll = this.f6378c.addAll(collection);
        if (addAll) {
            Jt9.m99586j(this.f6381f, this.f6378c.size() - size);
            if (size == 0) {
                m109899a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m109898b() {
        Do9 do9 = this.f6379d;
        if (do9 != null) {
            do9.m109898b();
        } else if (this.f6378c.isEmpty()) {
            Jt9.m99582n(this.f6381f).remove(this.f6377b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f6378c.clear();
        Jt9.m99585k(this.f6381f, size);
        m109898b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f6378c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f6378c.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f6378c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f6378c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C48840sl9(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f6378c.remove(obj);
        if (remove) {
            Jt9.m99587g(this.f6381f);
            m109898b();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f6378c.removeAll(collection);
        if (removeAll) {
            Jt9.m99586j(this.f6381f, this.f6378c.size() - size);
            m109898b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f6378c.retainAll(collection);
        if (retainAll) {
            Jt9.m99586j(this.f6381f, this.f6378c.size() - size);
            m109898b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f6378c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f6378c.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        Do9 do9 = this.f6379d;
        if (do9 != null) {
            do9.zzb();
            if (this.f6379d.f6378c != this.f6380e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f6378c.isEmpty() && (collection = (Collection) Jt9.m99582n(this.f6381f).get(this.f6377b)) != null) {
            this.f6378c = collection;
        }
    }
}
