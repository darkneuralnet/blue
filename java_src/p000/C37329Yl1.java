package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Yl1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37329Yl1<K, V> extends AbstractCollection<V> {

    /* renamed from: b */
    public final InterfaceC37095Xl1<K, V> f46536b;

    public C37329Yl1(InterfaceC37095Xl1<K, V> interfaceC37095Xl1) {
        this.f46536b = (InterfaceC37095Xl1) EZ3.m108801n(interfaceC37095Xl1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f46536b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f46536b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return C37907aM2.m71541u(this.f46536b.mo24584b().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        IZ3<? super Map.Entry<K, V>> mo76375c = this.f46536b.mo76375c();
        Iterator<Map.Entry<K, V>> it = this.f46536b.mo72552a().mo24584b().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (mo76375c.apply(next) && C37025Xd3.m76748a(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return C52340yg2.m2979e(this.f46536b.mo72552a().mo24584b(), JZ3.m100201b(this.f46536b.mo76375c(), C37907aM2.m71540v(JZ3.m100197f(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return C52340yg2.m2979e(this.f46536b.mo72552a().mo24584b(), JZ3.m100201b(this.f46536b.mo76375c(), C37907aM2.m71540v(JZ3.m100194i(JZ3.m100197f(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f46536b.size();
    }
}
