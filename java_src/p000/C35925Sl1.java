package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.C35925Sl1;
import p000.C37907aM2;
import p000.C43360jX2;
import p000.C46325oX2;
import p000.InterfaceC45139mX2;
/* renamed from: Sl1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35925Sl1<K, V> extends AbstractC9263X0<K, V> implements InterfaceC37095Xl1<K, V> {

    /* renamed from: g */
    public final InterfaceC41581gX2<K, V> f34219g;

    /* renamed from: h */
    public final IZ3<? super Map.Entry<K, V>> f34220h;

    /* renamed from: Sl1$a */
    /* loaded from: classes6.dex */
    public class C7532a extends C37907aM2.AbstractC10661q<K, Collection<V>> {

        /* renamed from: Sl1$a$a */
        /* loaded from: classes6.dex */
        public class C7533a extends C37907aM2.AbstractC10647h<K, Collection<V>> {

            /* renamed from: Sl1$a$a$a */
            /* loaded from: classes6.dex */
            public class C7534a extends AbstractC0367B0<Map.Entry<K, Collection<V>>> {

                /* renamed from: d */
                public final Iterator<Map.Entry<K, Collection<V>>> f34223d;

                public C7534a() {
                    this.f34223d = C35925Sl1.this.f34219g.mo24583f().entrySet().iterator();
                }

                @Override // p000.AbstractC0367B0
                /* renamed from: d */
                public Map.Entry<K, Collection<V>> mo575a() {
                    while (this.f34223d.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.f34223d.next();
                        K key = next.getKey();
                        Collection m84886q = C35925Sl1.m84886q(next.getValue(), new C7539c(key));
                        if (!m84886q.isEmpty()) {
                            return C37907aM2.m71555g(key, m84886q);
                        }
                    }
                    return m114802b();
                }
            }

            public C7533a() {
            }

            @Override // p000.C37907aM2.AbstractC10647h
            /* renamed from: a */
            public Map<K, Collection<V>> mo71527a() {
                return C7532a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C7534a();
            }

            @Override // p000.C37907aM2.AbstractC10647h, p000.C40052dw5.AbstractC19913d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C35925Sl1.this.m84885r(JZ3.m100197f(collection));
            }

            @Override // p000.C37907aM2.AbstractC10647h, p000.C40052dw5.AbstractC19913d, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C35925Sl1.this.m84885r(JZ3.m100194i(JZ3.m100197f(collection)));
            }

            @Override // p000.C37907aM2.AbstractC10647h, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C52933zg2.m579s(iterator());
            }
        }

        /* renamed from: Sl1$a$b */
        /* loaded from: classes6.dex */
        public class C7535b extends C37907aM2.C10658n<K, Collection<V>> {
            public C7535b() {
                super(C7532a.this);
            }

            @Override // p000.C37907aM2.C10658n, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return C7532a.this.remove(obj) != null;
            }

            @Override // p000.C40052dw5.AbstractC19913d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C35925Sl1.this.m84885r(C37907aM2.m71552j(JZ3.m100197f(collection)));
            }

            @Override // p000.C40052dw5.AbstractC19913d, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C35925Sl1.this.m84885r(C37907aM2.m71552j(JZ3.m100194i(JZ3.m100197f(collection))));
            }
        }

        /* renamed from: Sl1$a$c */
        /* loaded from: classes6.dex */
        public class C7536c extends C37907aM2.C10660p<K, Collection<V>> {
            public C7536c() {
                super(C7532a.this);
            }

            @Override // p000.C37907aM2.C10660p, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    Iterator<Map.Entry<K, Collection<V>>> it = C35925Sl1.this.f34219g.mo24583f().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<K, Collection<V>> next = it.next();
                        Collection m84886q = C35925Sl1.m84886q(next.getValue(), new C7539c(next.getKey()));
                        if (!m84886q.isEmpty() && collection.equals(m84886q)) {
                            if (m84886q.size() == next.getValue().size()) {
                                it.remove();
                                return true;
                            }
                            m84886q.clear();
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            @Override // p000.C37907aM2.C10660p, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return C35925Sl1.this.m84885r(C37907aM2.m71540v(JZ3.m100197f(collection)));
            }

            @Override // p000.C37907aM2.C10660p, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return C35925Sl1.this.m84885r(C37907aM2.m71540v(JZ3.m100194i(JZ3.m100197f(collection))));
            }
        }

        public C7532a() {
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo71523a() {
            return new C7533a();
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: b */
        public Set<K> mo71522b() {
            return new C7535b();
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: c */
        public Collection<Collection<V>> mo71521c() {
            return new C7536c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            C35925Sl1.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection<V> collection = C35925Sl1.this.f34219g.mo24583f().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> m84886q = C35925Sl1.m84886q(collection, new C7539c(obj));
            if (m84886q.isEmpty()) {
                return null;
            }
            return m84886q;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection<V> collection = C35925Sl1.this.f34219g.mo24583f().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList m93255g = C34819Ns2.m93255g();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (C35925Sl1.this.m84884s(obj, next)) {
                    it.remove();
                    m93255g.add(next);
                }
            }
            if (m93255g.isEmpty()) {
                return null;
            }
            if (C35925Sl1.this.f34219g instanceof InterfaceC37423Yv5) {
                return Collections.unmodifiableSet(C40052dw5.m43485j(m93255g));
            }
            return Collections.unmodifiableList(m93255g);
        }
    }

    /* renamed from: Sl1$b */
    /* loaded from: classes6.dex */
    public class C7537b extends C43360jX2.C24924c<K, V> {

        /* renamed from: Sl1$b$a */
        /* loaded from: classes6.dex */
        public class C7538a extends C46325oX2.AbstractC26999c<K> {
            public C7538a() {
            }

            /* renamed from: c */
            public static /* synthetic */ boolean m84879c(IZ3 iz3, Map.Entry entry) {
                return iz3.apply(C46325oX2.m20931g(entry.getKey(), ((Collection) entry.getValue()).size()));
            }

            @Override // p000.C46325oX2.AbstractC26999c
            /* renamed from: a */
            public InterfaceC45139mX2<K> mo20923a() {
                return C7537b.this;
            }

            /* renamed from: e */
            public final boolean m84878e(final IZ3<? super InterfaceC45139mX2.InterfaceC26111a<K>> iz3) {
                return C35925Sl1.this.m84885r(new IZ3() { // from class: Tl1
                    @Override // p000.IZ3
                    public final boolean apply(Object obj) {
                        boolean m84879c;
                        m84879c = C35925Sl1.C7537b.C7538a.m84879c(IZ3.this, (Map.Entry) obj);
                        return m84879c;
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<InterfaceC45139mX2.InterfaceC26111a<K>> iterator() {
                return C7537b.this.mo20916f();
            }

            @Override // p000.C40052dw5.AbstractC19913d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return m84878e(JZ3.m100197f(collection));
            }

            @Override // p000.C40052dw5.AbstractC19913d, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return m84878e(JZ3.m100194i(JZ3.m100197f(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C35925Sl1.this.keySet().size();
            }
        }

        public C7537b() {
            super(C35925Sl1.this);
        }

        @Override // p000.C43360jX2.C24924c, p000.AbstractC9586Y0, p000.InterfaceC45139mX2
        /* renamed from: A2 */
        public int mo20922A2(Object obj, int i) {
            C39948dm0.m43733b(i, "occurrences");
            if (i == 0) {
                return mo20918d3(obj);
            }
            Collection<V> collection = C35925Sl1.this.f34219g.mo24583f().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (C35925Sl1.this.m84884s(obj, it.next()) && (i2 = i2 + 1) <= i) {
                    it.remove();
                }
            }
            return i2;
        }

        @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
        public Set<InterfaceC45139mX2.InterfaceC26111a<K>> entrySet() {
            return new C7538a();
        }
    }

    /* renamed from: Sl1$c */
    /* loaded from: classes6.dex */
    public final class C7539c implements IZ3<V> {

        /* renamed from: b */
        public final K f34229b;

        public C7539c(K k) {
            this.f34229b = k;
        }

        @Override // p000.IZ3
        public boolean apply(V v) {
            return C35925Sl1.this.m84884s(this.f34229b, v);
        }
    }

    public C35925Sl1(InterfaceC41581gX2<K, V> interfaceC41581gX2, IZ3<? super Map.Entry<K, V>> iz3) {
        this.f34219g = (InterfaceC41581gX2) EZ3.m108801n(interfaceC41581gX2);
        this.f34220h = (IZ3) EZ3.m108801n(iz3);
    }

    /* renamed from: q */
    public static <E> Collection<E> m84886q(Collection<E> collection, IZ3<? super E> iz3) {
        if (collection instanceof Set) {
            return C40052dw5.m43493b((Set) collection, iz3);
        }
        return C44098km0.m28479b(collection, iz3);
    }

    @Override // p000.InterfaceC37095Xl1
    /* renamed from: a */
    public InterfaceC41581gX2<K, V> mo72552a() {
        return this.f34219g;
    }

    @Override // p000.InterfaceC37095Xl1
    /* renamed from: c */
    public IZ3<? super Map.Entry<K, V>> mo76375c() {
        return this.f34220h;
    }

    @Override // p000.InterfaceC41581gX2
    public void clear() {
        mo24584b().clear();
    }

    @Override // p000.InterfaceC41581gX2
    public boolean containsKey(Object obj) {
        return mo24583f().get(obj) != null;
    }

    @Override // p000.InterfaceC41581gX2
    public Collection<V> get(K k) {
        return m84886q(this.f34219g.get(k), new C7539c(k));
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: h */
    public Map<K, Collection<V>> mo30368h() {
        return new C7532a();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: i */
    public Collection<Map.Entry<K, V>> mo74915i() {
        return m84886q(this.f34219g.mo24584b(), this.f34220h);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: j */
    public Set<K> mo30367j() {
        return mo24583f().keySet();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: k */
    public InterfaceC45139mX2<K> mo74914k() {
        return new C7537b();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: l */
    public Collection<V> mo74913l() {
        return new C37329Yl1(this);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: m */
    public Iterator<Map.Entry<K, V>> mo74912m() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: r */
    public boolean m84885r(IZ3<? super Map.Entry<K, Collection<V>>> iz3) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f34219g.mo24583f().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection m84886q = m84886q(next.getValue(), new C7539c(key));
            if (!m84886q.isEmpty() && iz3.apply(C37907aM2.m71555g(key, m84886q))) {
                if (m84886q.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    m84886q.clear();
                }
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public final boolean m84884s(K k, V v) {
        return this.f34220h.apply(C37907aM2.m71555g(k, v));
    }

    @Override // p000.InterfaceC41581gX2
    public int size() {
        return mo24584b().size();
    }
}
