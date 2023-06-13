package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p000.AbstractC9263X0;
import p000.C37907aM2;
import p000.C43360jX2;
/* renamed from: L0 */
/* loaded from: classes6.dex */
public abstract class AbstractC4667L0<K, V> extends AbstractC9263X0<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: g */
    public transient Map<K, Collection<V>> f20526g;

    /* renamed from: h */
    public transient int f20527h;

    /* renamed from: L0$a */
    /* loaded from: classes6.dex */
    public class C4668a extends AbstractC4667L0<K, V>.AbstractC4673d<V> {
        public C4668a(AbstractC4667L0 abstractC4667L0) {
            super();
        }

        @Override // p000.AbstractC4667L0.AbstractC4673d
        /* renamed from: a */
        public V mo97977a(K k, V v) {
            return v;
        }
    }

    /* renamed from: L0$b */
    /* loaded from: classes6.dex */
    public class C4669b extends AbstractC4667L0<K, V>.AbstractC4673d<Map.Entry<K, V>> {
        public C4669b(AbstractC4667L0 abstractC4667L0) {
            super();
        }

        @Override // p000.AbstractC4667L0.AbstractC4673d
        /* renamed from: b */
        public Map.Entry<K, V> mo97977a(K k, V v) {
            return C37907aM2.m71555g(k, v);
        }
    }

    /* renamed from: L0$c */
    /* loaded from: classes6.dex */
    public class C4670c extends C37907aM2.AbstractC10661q<K, Collection<V>> {

        /* renamed from: e */
        public final transient Map<K, Collection<V>> f20528e;

        /* renamed from: L0$c$a */
        /* loaded from: classes6.dex */
        public class C4671a extends C37907aM2.AbstractC10647h<K, Collection<V>> {
            public C4671a() {
            }

            @Override // p000.C37907aM2.AbstractC10647h
            /* renamed from: a */
            public Map<K, Collection<V>> mo71527a() {
                return C4670c.this;
            }

            @Override // p000.C37907aM2.AbstractC10647h, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C44098km0.m28477d(C4670c.this.f20528e.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C4672b();
            }

            @Override // p000.C37907aM2.AbstractC10647h, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC4667L0.this.m97994C(entry.getKey());
                return true;
            }
        }

        /* renamed from: L0$c$b */
        /* loaded from: classes6.dex */
        public class C4672b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b */
            public final Iterator<Map.Entry<K, Collection<V>>> f20531b;

            /* renamed from: c */
            public Collection<V> f20532c;

            public C4672b() {
                this.f20531b = C4670c.this.f20528e.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f20531b.next();
                this.f20532c = next.getValue();
                return C4670c.this.m97979f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f20531b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.f20532c != null) {
                    z = true;
                } else {
                    z = false;
                }
                EZ3.m108794u(z, "no calls to next() since the last call to remove()");
                this.f20531b.remove();
                AbstractC4667L0.m97987u(AbstractC4667L0.this, this.f20532c.size());
                this.f20532c.clear();
                this.f20532c = null;
            }
        }

        public C4670c(Map<K, Collection<V>> map) {
            this.f20528e = map;
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo71523a() {
            return new C4671a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f20528e == AbstractC4667L0.this.f20526g) {
                AbstractC4667L0.this.clear();
            } else {
                C52933zg2.m595c(new C4672b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return C37907aM2.m71549m(this.f20528e, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) C37907aM2.m71548n(this.f20528e, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC4667L0.this.mo24586F(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f20528e.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> mo24582x = AbstractC4667L0.this.mo24582x();
            mo24582x.addAll(remove);
            AbstractC4667L0.m97987u(AbstractC4667L0.this, remove.size());
            remove.clear();
            return mo24582x;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f20528e.equals(obj);
        }

        /* renamed from: f */
        public Map.Entry<K, Collection<V>> m97979f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C37907aM2.m71555g(key, AbstractC4667L0.this.mo24586F(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f20528e.hashCode();
        }

        @Override // p000.C37907aM2.AbstractC10661q, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC4667L0.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f20528e.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f20528e.toString();
        }
    }

    /* renamed from: L0$d */
    /* loaded from: classes6.dex */
    public abstract class AbstractC4673d<T> implements Iterator<T> {

        /* renamed from: b */
        public final Iterator<Map.Entry<K, Collection<V>>> f20534b;

        /* renamed from: c */
        public K f20535c = null;

        /* renamed from: d */
        public Collection<V> f20536d = null;

        /* renamed from: e */
        public Iterator<V> f20537e = C52933zg2.m589i();

        public AbstractC4673d() {
            this.f20534b = (Iterator<Map.Entry<K, V>>) AbstractC4667L0.this.f20526g.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract T mo97977a(K k, V v);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20534b.hasNext() || this.f20537e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f20537e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f20534b.next();
                this.f20535c = next.getKey();
                Collection<V> value = next.getValue();
                this.f20536d = value;
                this.f20537e = value.iterator();
            }
            return mo97977a(C48162rd3.m15690a(this.f20535c), this.f20537e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f20537e.remove();
            Collection<V> collection = this.f20536d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f20534b.remove();
            }
            AbstractC4667L0.m97989s(AbstractC4667L0.this);
        }
    }

    /* renamed from: L0$e */
    /* loaded from: classes6.dex */
    public class C4674e extends C37907aM2.C10658n<K, Collection<V>> {

        /* renamed from: L0$e$a */
        /* loaded from: classes6.dex */
        public class C4675a implements Iterator<K> {

            /* renamed from: b */
            public Map.Entry<K, Collection<V>> f20540b;

            /* renamed from: c */
            public final /* synthetic */ Iterator f20541c;

            public C4675a(Iterator it) {
                this.f20541c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f20541c.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f20541c.next();
                this.f20540b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.f20540b != null) {
                    z = true;
                } else {
                    z = false;
                }
                EZ3.m108794u(z, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f20540b.getValue();
                this.f20541c.remove();
                AbstractC4667L0.m97987u(AbstractC4667L0.this, value.size());
                value.clear();
                this.f20540b = null;
            }
        }

        public C4674e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // p000.C37907aM2.C10658n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C52933zg2.m595c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return m71526a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || m71526a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m71526a().keySet().hashCode();
        }

        @Override // p000.C37907aM2.C10658n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C4675a(m71526a().entrySet().iterator());
        }

        @Override // p000.C37907aM2.C10658n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i;
            Collection<V> remove = m71526a().remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                AbstractC4667L0.m97987u(AbstractC4667L0.this, i);
            } else {
                i = 0;
            }
            if (i <= 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: L0$f */
    /* loaded from: classes6.dex */
    public class C4676f extends AbstractC4667L0<K, V>.C4678h implements NavigableMap<K, Collection<V>> {
        public C4676f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo97963i().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return m97979f(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return mo97963i().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C4676f(mo97963i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo97963i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m97979f(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> floorEntry = mo97963i().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return m97979f(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return mo97963i().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> higherEntry = mo97963i().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return m97979f(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return mo97963i().higherKey(k);
        }

        @Override // p000.AbstractC4667L0.C4678h
        /* renamed from: j */
        public NavigableSet<K> mo97965g() {
            return new C4677g(mo97963i());
        }

        @Override // p000.AbstractC4667L0.C4678h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // p000.AbstractC4667L0.C4678h, p000.AbstractC4667L0.C4670c, p000.C37907aM2.AbstractC10661q, java.util.AbstractMap, java.util.Map
        /* renamed from: l */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo97963i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m97979f(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> lowerEntry = mo97963i().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return m97979f(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return mo97963i().lowerKey(k);
        }

        /* renamed from: m */
        public Map.Entry<K, Collection<V>> m97973m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> mo24582x = AbstractC4667L0.this.mo24582x();
            mo24582x.addAll(next.getValue());
            it.remove();
            return C37907aM2.m71555g(next.getKey(), AbstractC4667L0.this.mo24587E(mo24582x));
        }

        @Override // p000.AbstractC4667L0.C4678h
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> mo97963i() {
            return (NavigableMap) super.mo97963i();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // p000.AbstractC4667L0.C4678h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // p000.AbstractC4667L0.C4678h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: p */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m97973m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m97973m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C4676f(mo97963i().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C4676f(mo97963i().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C4676f(mo97963i().tailMap(k, z));
        }
    }

    /* renamed from: L0$g */
    /* loaded from: classes6.dex */
    public class C4677g extends AbstractC4667L0<K, V>.C4679i implements NavigableSet<K> {
        public C4677g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // p000.AbstractC4667L0.C4679i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: c */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return mo97962b().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new C4677g(mo97962b().descendingMap());
        }

        @Override // p000.AbstractC4667L0.C4679i
        /* renamed from: e */
        public NavigableMap<K, Collection<V>> mo97962b() {
            return (NavigableMap) super.mo97962b();
        }

        @Override // p000.AbstractC4667L0.C4679i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return mo97962b().floorKey(k);
        }

        @Override // p000.AbstractC4667L0.C4679i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: h */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return mo97962b().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return mo97962b().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) C52933zg2.m584n(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) C52933zg2.m584n(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new C4677g(mo97962b().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C4677g(mo97962b().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C4677g(mo97962b().tailMap(k, z));
        }
    }

    /* renamed from: L0$h */
    /* loaded from: classes6.dex */
    public class C4678h extends AbstractC4667L0<K, V>.C4670c implements SortedMap<K, Collection<V>> {

        /* renamed from: g */
        public SortedSet<K> f20545g;

        public C4678h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo97963i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo97963i().firstKey();
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: g */
        public SortedSet<K> mo71522b() {
            return new C4679i(mo97963i());
        }

        @Override // p000.AbstractC4667L0.C4670c, p000.C37907aM2.AbstractC10661q, java.util.AbstractMap, java.util.Map
        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f20545g;
            if (sortedSet == null) {
                SortedSet<K> mo71522b = mo71522b();
                this.f20545g = mo71522b;
                return mo71522b;
            }
            return sortedSet;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C4678h(mo97963i().headMap(k));
        }

        /* renamed from: i */
        public SortedMap<K, Collection<V>> mo97963i() {
            return (SortedMap) this.f20528e;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo97963i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C4678h(mo97963i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C4678h(mo97963i().tailMap(k));
        }
    }

    /* renamed from: L0$i */
    /* loaded from: classes6.dex */
    public class C4679i extends AbstractC4667L0<K, V>.C4674e implements SortedSet<K> {
        public C4679i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: b */
        public SortedMap<K, Collection<V>> mo97962b() {
            return (SortedMap) super.m71526a();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo97962b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo97962b().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C4679i(mo97962b().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo97962b().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C4679i(mo97962b().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C4679i(mo97962b().tailMap(k));
        }
    }

    /* renamed from: L0$k */
    /* loaded from: classes6.dex */
    public class C4682k extends AbstractC4667L0<K, V>.C4684m implements NavigableSet<V> {
        public C4682k(K k, NavigableSet<V> navigableSet, AbstractC4667L0<K, V>.C4680j c4680j) {
            super(k, navigableSet, c4680j);
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v) {
            return mo97952j().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new C4680j.C4681a(mo97952j().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m97953s(mo97952j().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v) {
            return mo97952j().floor(v);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v, boolean z) {
            return m97953s(mo97952j().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        public V higher(V v) {
            return mo97952j().higher(v);
        }

        @Override // java.util.NavigableSet
        public V lower(V v) {
            return mo97952j().lower(v);
        }

        @Override // p000.AbstractC4667L0.C4684m
        /* renamed from: o */
        public NavigableSet<V> mo97952j() {
            return (NavigableSet) super.mo97952j();
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) C52933zg2.m584n(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) C52933zg2.m584n(descendingIterator());
        }

        /* renamed from: s */
        public final NavigableSet<V> m97953s(NavigableSet<V> navigableSet) {
            return new C4682k(this.f20548b, navigableSet, m97960b() == null ? this : m97960b());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return m97953s(mo97952j().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v, boolean z) {
            return m97953s(mo97952j().tailSet(v, z));
        }
    }

    /* renamed from: L0$l */
    /* loaded from: classes6.dex */
    public class C4683l extends AbstractC4667L0<K, V>.C4680j implements Set<V> {
        public C4683l(K k, Set<V> set) {
            super(k, set, null);
        }

        @Override // p000.AbstractC4667L0.C4680j, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean m43484k = C40052dw5.m43484k((Set) this.f20549c, collection);
            if (m43484k) {
                AbstractC4667L0.m97988t(AbstractC4667L0.this, this.f20549c.size() - size);
                m97956h();
            }
            return m43484k;
        }
    }

    /* renamed from: L0$m */
    /* loaded from: classes6.dex */
    public class C4684m extends AbstractC4667L0<K, V>.C4680j implements SortedSet<V> {
        public C4684m(K k, SortedSet<V> sortedSet, AbstractC4667L0<K, V>.C4680j c4680j) {
            super(k, sortedSet, c4680j);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return mo97952j().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            m97957f();
            return mo97952j().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v) {
            AbstractC4667L0<K, V>.C4680j m97960b;
            m97957f();
            AbstractC4667L0 abstractC4667L0 = AbstractC4667L0.this;
            Object m97958e = m97958e();
            SortedSet<V> headSet = mo97952j().headSet(v);
            if (m97960b() == null) {
                m97960b = this;
            } else {
                m97960b = m97960b();
            }
            return new C4684m(m97958e, headSet, m97960b);
        }

        /* renamed from: j */
        public SortedSet<V> mo97952j() {
            return (SortedSet) m97959c();
        }

        @Override // java.util.SortedSet
        public V last() {
            m97957f();
            return mo97952j().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v, V v2) {
            AbstractC4667L0<K, V>.C4680j m97960b;
            m97957f();
            AbstractC4667L0 abstractC4667L0 = AbstractC4667L0.this;
            Object m97958e = m97958e();
            SortedSet<V> subSet = mo97952j().subSet(v, v2);
            if (m97960b() == null) {
                m97960b = this;
            } else {
                m97960b = m97960b();
            }
            return new C4684m(m97958e, subSet, m97960b);
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v) {
            AbstractC4667L0<K, V>.C4680j m97960b;
            m97957f();
            AbstractC4667L0 abstractC4667L0 = AbstractC4667L0.this;
            Object m97958e = m97958e();
            SortedSet<V> tailSet = mo97952j().tailSet(v);
            if (m97960b() == null) {
                m97960b = this;
            } else {
                m97960b = m97960b();
            }
            return new C4684m(m97958e, tailSet, m97960b);
        }
    }

    public AbstractC4667L0(Map<K, Collection<V>> map) {
        EZ3.m108811d(map.isEmpty());
        this.f20526g = map;
    }

    /* renamed from: B */
    public static <E> Iterator<E> m97995B(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* renamed from: r */
    public static /* synthetic */ int m97990r(AbstractC4667L0 abstractC4667L0) {
        int i = abstractC4667L0.f20527h;
        abstractC4667L0.f20527h = i + 1;
        return i;
    }

    /* renamed from: s */
    public static /* synthetic */ int m97989s(AbstractC4667L0 abstractC4667L0) {
        int i = abstractC4667L0.f20527h;
        abstractC4667L0.f20527h = i - 1;
        return i;
    }

    /* renamed from: t */
    public static /* synthetic */ int m97988t(AbstractC4667L0 abstractC4667L0, int i) {
        int i2 = abstractC4667L0.f20527h + i;
        abstractC4667L0.f20527h = i2;
        return i2;
    }

    /* renamed from: u */
    public static /* synthetic */ int m97987u(AbstractC4667L0 abstractC4667L0, int i) {
        int i2 = abstractC4667L0.f20527h - i;
        abstractC4667L0.f20527h = i2;
        return i2;
    }

    /* renamed from: A */
    public final Set<K> m97996A() {
        Map<K, Collection<V>> map = this.f20526g;
        if (map instanceof NavigableMap) {
            return new C4677g((NavigableMap) this.f20526g);
        }
        if (map instanceof SortedMap) {
            return new C4679i((SortedMap) this.f20526g);
        }
        return new C4674e(this.f20526g);
    }

    /* renamed from: C */
    public final void m97994C(Object obj) {
        Collection collection = (Collection) C37907aM2.m71547o(this.f20526g, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f20527h -= size;
        }
    }

    /* renamed from: D */
    public final void m97993D(Map<K, Collection<V>> map) {
        this.f20526g = map;
        this.f20527h = 0;
        for (Collection<V> collection : map.values()) {
            EZ3.m108811d(!collection.isEmpty());
            this.f20527h += collection.size();
        }
    }

    /* renamed from: E */
    public <E> Collection<E> mo24587E(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    /* renamed from: F */
    public Collection<V> mo24586F(K k, Collection<V> collection) {
        return new C4680j(k, collection, null);
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: b */
    public Collection<Map.Entry<K, V>> mo24584b() {
        return super.mo24584b();
    }

    @Override // p000.InterfaceC41581gX2
    public void clear() {
        for (Collection<V> collection : this.f20526g.values()) {
            collection.clear();
        }
        this.f20526g.clear();
        this.f20527h = 0;
    }

    @Override // p000.InterfaceC41581gX2
    public boolean containsKey(Object obj) {
        return this.f20526g.containsKey(obj);
    }

    @Override // p000.InterfaceC41581gX2
    public Collection<V> get(K k) {
        Collection<V> collection = this.f20526g.get(k);
        if (collection == null) {
            collection = m97984y(k);
        }
        return mo24586F(k, collection);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: h */
    public Map<K, Collection<V>> mo30368h() {
        return new C4670c(this.f20526g);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: i */
    public Collection<Map.Entry<K, V>> mo74915i() {
        if (this instanceof InterfaceC37423Yv5) {
            return new AbstractC9263X0.C9265b(this);
        }
        return new AbstractC9263X0.C9264a();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: j */
    public Set<K> mo30367j() {
        return new C4674e(this.f20526g);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: k */
    public InterfaceC45139mX2<K> mo74914k() {
        return new C43360jX2.C24924c(this);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: l */
    public Collection<V> mo74913l() {
        return new AbstractC9263X0.C9266c();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: m */
    public Iterator<Map.Entry<K, V>> mo74912m() {
        return new C4669b(this);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: n */
    public Iterator<V> mo74911n() {
        return new C4668a(this);
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    public boolean put(K k, V v) {
        Collection<V> collection = this.f20526g.get(k);
        if (collection == null) {
            Collection<V> m97984y = m97984y(k);
            if (m97984y.add(v)) {
                this.f20527h++;
                this.f20526g.put(k, m97984y);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.f20527h++;
            return true;
        } else {
            return false;
        }
    }

    @Override // p000.InterfaceC41581gX2
    public int size() {
        return this.f20527h;
    }

    /* renamed from: w */
    public Map<K, Collection<V>> m97985w() {
        return this.f20526g;
    }

    /* renamed from: x */
    public abstract Collection<V> mo24582x();

    /* renamed from: y */
    public Collection<V> m97984y(K k) {
        return mo24582x();
    }

    /* renamed from: z */
    public final Map<K, Collection<V>> m97983z() {
        Map<K, Collection<V>> map = this.f20526g;
        if (map instanceof NavigableMap) {
            return new C4676f((NavigableMap) this.f20526g);
        }
        if (map instanceof SortedMap) {
            return new C4678h((SortedMap) this.f20526g);
        }
        return new C4670c(this.f20526g);
    }

    /* renamed from: L0$j */
    /* loaded from: classes6.dex */
    public class C4680j extends AbstractCollection<V> {

        /* renamed from: b */
        public final K f20548b;

        /* renamed from: c */
        public Collection<V> f20549c;

        /* renamed from: d */
        public final AbstractC4667L0<K, V>.C4680j f20550d;

        /* renamed from: e */
        public final Collection<V> f20551e;

        public C4680j(K k, Collection<V> collection, AbstractC4667L0<K, V>.C4680j c4680j) {
            Collection<V> m97959c;
            this.f20548b = k;
            this.f20549c = collection;
            this.f20550d = c4680j;
            if (c4680j == null) {
                m97959c = null;
            } else {
                m97959c = c4680j.m97959c();
            }
            this.f20551e = m97959c;
        }

        /* renamed from: a */
        public void m97961a() {
            AbstractC4667L0<K, V>.C4680j c4680j = this.f20550d;
            if (c4680j != null) {
                c4680j.m97961a();
            } else {
                AbstractC4667L0.this.f20526g.put(this.f20548b, this.f20549c);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            m97957f();
            boolean isEmpty = this.f20549c.isEmpty();
            boolean add = this.f20549c.add(v);
            if (add) {
                AbstractC4667L0.m97990r(AbstractC4667L0.this);
                if (isEmpty) {
                    m97961a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f20549c.addAll(collection);
            if (addAll) {
                AbstractC4667L0.m97988t(AbstractC4667L0.this, this.f20549c.size() - size);
                if (size == 0) {
                    m97961a();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        public AbstractC4667L0<K, V>.C4680j m97960b() {
            return this.f20550d;
        }

        /* renamed from: c */
        public Collection<V> m97959c() {
            return this.f20549c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f20549c.clear();
            AbstractC4667L0.m97987u(AbstractC4667L0.this, size);
            m97956h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m97957f();
            return this.f20549c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m97957f();
            return this.f20549c.containsAll(collection);
        }

        /* renamed from: e */
        K m97958e() {
            return this.f20548b;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m97957f();
            return this.f20549c.equals(obj);
        }

        /* renamed from: f */
        public void m97957f() {
            Collection<V> collection;
            AbstractC4667L0<K, V>.C4680j c4680j = this.f20550d;
            if (c4680j != null) {
                c4680j.m97957f();
                if (this.f20550d.m97959c() != this.f20551e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f20549c.isEmpty() && (collection = (Collection) AbstractC4667L0.this.f20526g.get(this.f20548b)) != null) {
                this.f20549c = collection;
            }
        }

        /* renamed from: h */
        public void m97956h() {
            AbstractC4667L0<K, V>.C4680j c4680j = this.f20550d;
            if (c4680j != null) {
                c4680j.m97956h();
            } else if (this.f20549c.isEmpty()) {
                AbstractC4667L0.this.f20526g.remove(this.f20548b);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m97957f();
            return this.f20549c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m97957f();
            return new C4681a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m97957f();
            boolean remove = this.f20549c.remove(obj);
            if (remove) {
                AbstractC4667L0.m97989s(AbstractC4667L0.this);
                m97956h();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f20549c.removeAll(collection);
            if (removeAll) {
                AbstractC4667L0.m97988t(AbstractC4667L0.this, this.f20549c.size() - size);
                m97956h();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            EZ3.m108801n(collection);
            int size = size();
            boolean retainAll = this.f20549c.retainAll(collection);
            if (retainAll) {
                AbstractC4667L0.m97988t(AbstractC4667L0.this, this.f20549c.size() - size);
                m97956h();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m97957f();
            return this.f20549c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m97957f();
            return this.f20549c.toString();
        }

        /* renamed from: L0$j$a */
        /* loaded from: classes6.dex */
        public class C4681a implements Iterator<V> {

            /* renamed from: b */
            public final Iterator<V> f20553b;

            /* renamed from: c */
            public final Collection<V> f20554c;

            public C4681a() {
                Collection<V> collection = C4680j.this.f20549c;
                this.f20554c = collection;
                this.f20553b = AbstractC4667L0.m97995B(collection);
            }

            /* renamed from: a */
            public void m97955a() {
                C4680j.this.m97957f();
                if (C4680j.this.f20549c == this.f20554c) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m97955a();
                return this.f20553b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                m97955a();
                return this.f20553b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f20553b.remove();
                AbstractC4667L0.m97989s(AbstractC4667L0.this);
                C4680j.this.m97956h();
            }

            public C4681a(Iterator<V> it) {
                this.f20554c = C4680j.this.f20549c;
                this.f20553b = it;
            }
        }
    }
}
