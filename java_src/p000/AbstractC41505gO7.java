package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
/* renamed from: gO7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC41505gO7 extends AbstractC40957fT7 {
    /* renamed from: a */
    public abstract Map mo4751a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo4751a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object m23829a = C45665nP7.m23829a(mo4751a(), key);
        if (!C45986nw9.m22158a(m23829a, entry.getValue())) {
            return false;
        }
        if (m23829a == null && !C45665nP7.m23828b(((C36399Ul7) mo4751a()).f37957e, key)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo4751a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return ((C36399Ul7) mo4751a()).f37958f.mo95303h().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // p000.AbstractC40957fT7, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return C49851uT7.m10232b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C49851uT7.m10231c(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC40957fT7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C38861bx7.m62068a(size, "expectedSize");
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
            return ((C36399Ul7) mo4751a()).f37958f.mo95303h().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo4751a().size();
    }
}
