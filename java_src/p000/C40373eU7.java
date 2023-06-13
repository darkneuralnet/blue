package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: eU7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C40373eU7 extends AbstractC45737nX7 {

    /* renamed from: b */
    public final Map f78453b;

    public C40373eU7(Map map) {
        map.getClass();
        this.f78453b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f78453b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f78453b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f78453b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C48073rT7(this.f78453b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj)) {
            this.f78453b.remove(obj);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f78453b.size();
    }
}
