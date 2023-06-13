package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
/* renamed from: GE7 */
/* loaded from: classes5.dex */
public abstract class GE7 extends AbstractC39098cM7 {
    /* renamed from: a */
    public abstract Map mo12292a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo12292a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object m104060a = HH7.m104060a(mo12292a(), key);
        if (!QX7.m88418a(m104060a, entry.getValue())) {
            return false;
        }
        if (m104060a == null && !HH7.m104059b(((I49) mo12292a()).f14460e, key)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo12292a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return ((I49) mo12292a()).f14461f.mo1545h().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // p000.AbstractC39098cM7, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return C48602sM7.m14269b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C48602sM7.m14268c(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC39098cM7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C31665Af7.m115392a(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                i = (int) ((size / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((I49) mo12292a()).f14461f.mo1545h().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo12292a().size();
    }
}
