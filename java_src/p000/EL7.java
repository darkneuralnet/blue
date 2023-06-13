package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: EL7 */
/* loaded from: classes5.dex */
public final class EL7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C52761zN7 f7313b;

    public EL7(C52761zN7 c52761zN7) {
        this.f7313b = c52761zN7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7313b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m1442q;
        Map m1449j = this.f7313b.m1449j();
        if (m1449j != null) {
            return m1449j.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m1442q = this.f7313b.m1442q(entry.getKey());
            if (m1442q != -1) {
                Object[] objArr = this.f7313b.f121263e;
                objArr.getClass();
                if (C31998Bq7.m113442a(objArr[m1442q], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C52761zN7 c52761zN7 = this.f7313b;
        Map m1449j = c52761zN7.m1449j();
        if (m1449j != null) {
            return m1449j.entrySet().iterator();
        }
        return new C37903aL7(c52761zN7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m1443p;
        int i;
        Map m1449j = this.f7313b.m1449j();
        if (m1449j != null) {
            return m1449j.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C52761zN7 c52761zN7 = this.f7313b;
        if (c52761zN7.m1444o()) {
            return false;
        }
        m1443p = c52761zN7.m1443p();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object m1451h = C52761zN7.m1451h(this.f7313b);
        C52761zN7 c52761zN72 = this.f7313b;
        int[] iArr = c52761zN72.f121261c;
        iArr.getClass();
        Object[] objArr = c52761zN72.f121262d;
        objArr.getClass();
        Object[] objArr2 = c52761zN72.f121263e;
        objArr2.getClass();
        int m92360b = ON7.m92360b(key, value, m1443p, m1451h, iArr, objArr, objArr2);
        if (m92360b == -1) {
            return false;
        }
        this.f7313b.m1445n(m92360b, m1443p);
        C52761zN7 c52761zN73 = this.f7313b;
        i = c52761zN73.f121265g;
        c52761zN73.f121265g = i - 1;
        this.f7313b.m1447l();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7313b.size();
    }
}
