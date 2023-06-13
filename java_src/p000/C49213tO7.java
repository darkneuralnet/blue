package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: tO7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49213tO7 extends AbstractC40957fT7 {

    /* renamed from: b */
    public final Map f110423b;

    public C49213tO7(Map map) {
        map.getClass();
        this.f110423b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f110423b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f110423b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f110423b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new CN7(this.f110423b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj)) {
            this.f110423b.remove(obj);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f110423b.size();
    }
}
