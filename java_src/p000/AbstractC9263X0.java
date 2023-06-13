package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.C43360jX2;
/* renamed from: X0 */
/* loaded from: classes6.dex */
public abstract class AbstractC9263X0<K, V> implements InterfaceC41581gX2<K, V> {

    /* renamed from: b */
    public transient Collection<Map.Entry<K, V>> f42453b;

    /* renamed from: c */
    public transient Set<K> f42454c;

    /* renamed from: d */
    public transient InterfaceC45139mX2<K> f42455d;

    /* renamed from: e */
    public transient Collection<V> f42456e;

    /* renamed from: f */
    public transient Map<K, Collection<V>> f42457f;

    /* renamed from: X0$a */
    /* loaded from: classes6.dex */
    public class C9264a extends C43360jX2.AbstractC24923b<K, V> {
        public C9264a() {
        }

        @Override // p000.C43360jX2.AbstractC24923b
        /* renamed from: a */
        public InterfaceC41581gX2<K, V> mo30366a() {
            return AbstractC9263X0.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC9263X0.this.mo74912m();
        }
    }

    /* renamed from: X0$b */
    /* loaded from: classes6.dex */
    public class C9265b extends AbstractC9263X0<K, V>.C9264a implements Set<Map.Entry<K, V>> {
        public C9265b(AbstractC9263X0 abstractC9263X0) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return C40052dw5.m43494a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C40052dw5.m43491d(this);
        }
    }

    /* renamed from: X0$c */
    /* loaded from: classes6.dex */
    public class C9266c extends AbstractCollection<V> {
        public C9266c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC9263X0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC9263X0.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC9263X0.this.mo74911n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC9263X0.this.size();
        }
    }

    @Override // p000.InterfaceC41581gX2
    /* renamed from: b */
    public Collection<Map.Entry<K, V>> mo24584b() {
        Collection<Map.Entry<K, V>> collection = this.f42453b;
        if (collection == null) {
            Collection<Map.Entry<K, V>> mo74915i = mo74915i();
            this.f42453b = mo74915i;
            return mo74915i;
        }
        return collection;
    }

    @Override // p000.InterfaceC41581gX2
    public boolean containsValue(Object obj) {
        for (Collection<V> collection : mo24583f().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC41581gX2
    /* renamed from: d */
    public InterfaceC45139mX2<K> mo39190d() {
        InterfaceC45139mX2<K> interfaceC45139mX2 = this.f42455d;
        if (interfaceC45139mX2 == null) {
            InterfaceC45139mX2<K> mo74914k = mo74914k();
            this.f42455d = mo74914k;
            return mo74914k;
        }
        return interfaceC45139mX2;
    }

    @Override // p000.InterfaceC41581gX2
    /* renamed from: e */
    public boolean mo39189e(K k, Iterable<? extends V> iterable) {
        EZ3.m108801n(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            if (!collection.isEmpty() && get(k).addAll(collection)) {
                return true;
            }
            return false;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (it.hasNext() && C52933zg2.m597a(get(k), it)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        return C43360jX2.m30372a(this, obj);
    }

    @Override // p000.InterfaceC41581gX2
    /* renamed from: f */
    public Map<K, Collection<V>> mo24583f() {
        Map<K, Collection<V>> map = this.f42457f;
        if (map == null) {
            Map<K, Collection<V>> mo30368h = mo30368h();
            this.f42457f = mo30368h;
            return mo30368h;
        }
        return map;
    }

    @Override // p000.InterfaceC41581gX2
    /* renamed from: g */
    public boolean mo39188g(Object obj, Object obj2) {
        Collection<V> collection = mo24583f().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public abstract Map<K, Collection<V>> mo30368h();

    public int hashCode() {
        return mo24583f().hashCode();
    }

    /* renamed from: i */
    public abstract Collection<Map.Entry<K, V>> mo74915i();

    /* renamed from: j */
    public abstract Set<K> mo30367j();

    /* renamed from: k */
    public abstract InterfaceC45139mX2<K> mo74914k();

    @Override // p000.InterfaceC41581gX2
    public Set<K> keySet() {
        Set<K> set = this.f42454c;
        if (set == null) {
            Set<K> mo30367j = mo30367j();
            this.f42454c = mo30367j;
            return mo30367j;
        }
        return set;
    }

    /* renamed from: l */
    public abstract Collection<V> mo74913l();

    /* renamed from: m */
    public abstract Iterator<Map.Entry<K, V>> mo74912m();

    /* renamed from: n */
    public Iterator<V> mo74911n() {
        return C37907aM2.m71541u(mo24584b().iterator());
    }

    /* renamed from: o */
    public Collection<V> m77565o() {
        Collection<V> collection = this.f42456e;
        if (collection == null) {
            Collection<V> mo74913l = mo74913l();
            this.f42456e = mo74913l;
            return mo74913l;
        }
        return collection;
    }

    @Override // p000.InterfaceC41581gX2
    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    @Override // p000.InterfaceC41581gX2
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = mo24583f().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return mo24583f().toString();
    }
}
