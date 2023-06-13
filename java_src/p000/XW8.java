package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: XW8 */
/* loaded from: classes6.dex */
public class XW8 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ BV8 f43356b;

    public XW8(BV8 bv8) {
        this.f43356b = bv8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            this.f43356b.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f43356b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f43356b.get(entry.getKey());
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
        return new C42180hX8(this.f43356b, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.f43356b.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f43356b.size();
    }

    public /* synthetic */ XW8(BV8 bv8, C47499qV8 c47499qV8) {
        this(bv8);
    }
}
