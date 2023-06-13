package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: a28  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37725a28 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ ZY7 f49747b;

    public C37725a28(ZY7 zy7) {
        this.f49747b = zy7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            this.f49747b.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f49747b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f49747b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            if (obj2 == null || !obj2.equals(value)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C43662k18(this.f49747b, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.f49747b.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f49747b.size();
    }

    public /* synthetic */ C37725a28(ZY7 zy7, QZ7 qz7) {
        this(zy7);
    }
}
