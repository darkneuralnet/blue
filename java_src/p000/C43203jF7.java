package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: jF7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C43203jF7 extends AbstractC39098cM7 {

    /* renamed from: b */
    public final Map f92402b;

    public C43203jF7(Map map) {
        map.getClass();
        this.f92402b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f92402b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f92402b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f92402b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C39628dD7(this.f92402b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj)) {
            this.f92402b.remove(obj);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f92402b.size();
    }
}
