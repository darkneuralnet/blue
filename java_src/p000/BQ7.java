package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
/* renamed from: BQ7 */
/* loaded from: classes5.dex */
public abstract class BQ7 extends AbstractC52231yU7 {
    /* renamed from: a */
    public abstract Map mo26904a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo26904a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object m96936a = LR7.m96936a(mo26904a(), key);
        if (!C42418hv9.m35483a(m96936a, entry.getValue())) {
            return false;
        }
        if (m96936a == null && !LR7.m96935b(((C39334cl7) mo26904a()).f61206e, key)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo26904a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return ((C39334cl7) mo26904a()).f61207f.mo64522f().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // p000.AbstractC52231yU7, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return LU7.m96793b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return LU7.m96792c(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC52231yU7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C39462cw7.m44806a(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                i = (int) Math.ceil(size / 0.75d);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((C39334cl7) mo26904a()).f61207f.mo64522f().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo26904a().size();
    }
}
