package p000;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* renamed from: so */
/* loaded from: classes.dex */
public class C28385so<K, V> extends NA5<K, V> implements Map<K, V> {

    /* renamed from: i */
    public C28385so<K, V>.C28386a f109261i;

    /* renamed from: j */
    public C28385so<K, V>.C28388c f109262j;

    /* renamed from: k */
    public C28385so<K, V>.C28390e f109263k;

    /* renamed from: so$a */
    /* loaded from: classes.dex */
    public final class C28386a extends AbstractSet<Map.Entry<K, V>> {
        public C28386a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C28389d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C28385so.this.f24236d;
        }
    }

    /* renamed from: so$b */
    /* loaded from: classes.dex */
    public final class C28387b extends AbstractC48992t12<K> {
        public C28387b() {
            super(C28385so.this.f24236d);
        }

        @Override // p000.AbstractC48992t12
        /* renamed from: a */
        public K mo2570a(int i) {
            return C28385so.this.m94264i(i);
        }

        @Override // p000.AbstractC48992t12
        /* renamed from: b */
        public void mo2569b(int i) {
            C28385so.this.mo34405k(i);
        }
    }

    /* renamed from: so$d */
    /* loaded from: classes.dex */
    public final class C28389d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public int f109267b;

        /* renamed from: c */
        public int f109268c = -1;

        /* renamed from: d */
        public boolean f109269d;

        public C28389d() {
            this.f109267b = C28385so.this.f24236d - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f109268c++;
                this.f109269d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f109269d) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!C51342wz0.m6013c(entry.getKey(), C28385so.this.m94264i(this.f109268c)) || !C51342wz0.m6013c(entry.getValue(), C28385so.this.m94263m(this.f109268c))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f109269d) {
                return C28385so.this.m94264i(this.f109268c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f109269d) {
                return C28385so.this.m94263m(this.f109268c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f109268c < this.f109267b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.f109269d) {
                K m94264i = C28385so.this.m94264i(this.f109268c);
                V m94263m = C28385so.this.m94263m(this.f109268c);
                int i = 0;
                if (m94264i == null) {
                    hashCode = 0;
                } else {
                    hashCode = m94264i.hashCode();
                }
                if (m94263m != null) {
                    i = m94263m.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f109269d) {
                C28385so.this.mo34405k(this.f109268c);
                this.f109268c--;
                this.f109267b--;
                this.f109269d = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f109269d) {
                return C28385so.this.mo34404l(this.f109268c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: so$f */
    /* loaded from: classes.dex */
    public final class C28391f extends AbstractC48992t12<V> {
        public C28391f() {
            super(C28385so.this.f24236d);
        }

        @Override // p000.AbstractC48992t12
        /* renamed from: a */
        public V mo2570a(int i) {
            return C28385so.this.m94263m(i);
        }

        @Override // p000.AbstractC48992t12
        /* renamed from: b */
        public void mo2569b(int i) {
            C28385so.this.mo34405k(i);
        }
    }

    public C28385so() {
    }

    /* renamed from: o */
    public static <T> boolean m13659o(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C28385so<K, V>.C28386a c28386a = this.f109261i;
        if (c28386a == null) {
            C28385so<K, V>.C28386a c28386a2 = new C28386a();
            this.f109261i = c28386a2;
            return c28386a2;
        }
        return c28386a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        C28385so<K, V>.C28388c c28388c = this.f109262j;
        if (c28388c == null) {
            C28385so<K, V>.C28388c c28388c2 = new C28388c();
            this.f109262j = c28388c2;
            return c28388c2;
        }
        return c28388c;
    }

    /* renamed from: n */
    public boolean m13660n(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public boolean m13658p(Collection<?> collection) {
        int i = this.f24236d;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (i != this.f24236d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m94270c(this.f24236d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: q */
    public boolean m13657q(Collection<?> collection) {
        int i = this.f24236d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m94264i(i2))) {
                mo34405k(i2);
            }
        }
        if (i != this.f24236d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public <T> T[] m13656r(T[] tArr, int i) {
        int i2 = this.f24236d;
        if (tArr.length < i2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.f24235c[(i3 << 1) + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        C28385so<K, V>.C28390e c28390e = this.f109263k;
        if (c28390e == null) {
            C28385so<K, V>.C28390e c28390e2 = new C28390e();
            this.f109263k = c28390e2;
            return c28390e2;
        }
        return c28390e;
    }

    public C28385so(int i) {
        super(i);
    }

    /* renamed from: so$c */
    /* loaded from: classes.dex */
    public final class C28388c implements Set<K> {
        public C28388c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C28385so.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C28385so.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C28385so.this.m13660n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C28385so.m13659o(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i = 0;
            for (int i2 = C28385so.this.f24236d - 1; i2 >= 0; i2--) {
                K m94264i = C28385so.this.m94264i(i2);
                if (m94264i == null) {
                    hashCode = 0;
                } else {
                    hashCode = m94264i.hashCode();
                }
                i += hashCode;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C28385so.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C28387b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int m94267f = C28385so.this.m94267f(obj);
            if (m94267f >= 0) {
                C28385so.this.mo34405k(m94267f);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return C28385so.this.m13658p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return C28385so.this.m13657q(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C28385so.this.f24236d;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int i = C28385so.this.f24236d;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C28385so.this.m94264i(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C28385so.this.m13656r(tArr, 0);
        }
    }

    /* renamed from: so$e */
    /* loaded from: classes.dex */
    public final class C28390e implements Collection<V> {
        public C28390e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C28385so.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C28385so.this.m94265h(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C28385so.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C28391f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int m94265h = C28385so.this.m94265h(obj);
            if (m94265h >= 0) {
                C28385so.this.mo34405k(m94265h);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i = C28385so.this.f24236d;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(C28385so.this.m94263m(i2))) {
                    C28385so.this.mo34405k(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i = C28385so.this.f24236d;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(C28385so.this.m94263m(i2))) {
                    C28385so.this.mo34405k(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return C28385so.this.f24236d;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int i = C28385so.this.f24236d;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C28385so.this.m94263m(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C28385so.this.m13656r(tArr, 1);
        }
    }

    public C28385so(NA5 na5) {
        super(na5);
    }
}
