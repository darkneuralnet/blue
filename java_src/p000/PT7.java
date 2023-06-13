package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
/* renamed from: PT7 */
/* loaded from: classes5.dex */
public abstract class PT7 extends AbstractC45737nX7 {
    /* renamed from: a */
    public abstract Map mo72287a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo72287a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object m85345a = SU7.m85345a(mo72287a(), key);
        if (!C31998Bq7.m113442a(m85345a, entry.getValue())) {
            return false;
        }
        if (m85345a == null && !SU7.m85344b(((C32772Ey7) mo72287a()).f8388e, key)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo72287a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return ((C32772Ey7) mo72287a()).f8389f.mo39238f().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // p000.AbstractC45737nX7, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return CX7.m112152b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return CX7.m112151c(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC45737nX7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C45620nK7.m23966a(size, "expectedSize");
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
            return ((C32772Ey7) mo72287a()).f8389f.mo39238f().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo72287a().size();
    }
}
