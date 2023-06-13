package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import p000.AbstractC4667L0;
import p000.C46325oX2;
import p000.InterfaceC45139mX2;
/* renamed from: jX2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43360jX2 {

    /* renamed from: jX2$a */
    /* loaded from: classes6.dex */
    public static class C24922a<K, V> extends AbstractC26334n1<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: i */
        public transient YU5<? extends Set<V>> f92898i;

        public C24922a(Map<K, Collection<V>> map, YU5<? extends Set<V>> yu5) {
            super(map);
            this.f92898i = (YU5) EZ3.m108801n(yu5);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f92898i = (YU5) objectInputStream.readObject();
            m97993D((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f92898i);
            objectOutputStream.writeObject(m97985w());
        }

        @Override // p000.AbstractC26334n1, p000.AbstractC4667L0
        /* renamed from: E */
        public <E> Collection<E> mo24587E(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return C40052dw5.m43481n((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            return Collections.unmodifiableSet((Set) collection);
        }

        @Override // p000.AbstractC26334n1, p000.AbstractC4667L0
        /* renamed from: F */
        public Collection<V> mo24586F(K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractC4667L0.C4682k(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractC4667L0.C4684m(k, (SortedSet) collection, null);
            }
            return new AbstractC4667L0.C4683l(k, (Set) collection);
        }

        @Override // p000.AbstractC26334n1, p000.AbstractC4667L0
        /* renamed from: H */
        public Set<V> mo24582x() {
            return this.f92898i.get();
        }

        @Override // p000.AbstractC4667L0, p000.AbstractC9263X0
        /* renamed from: h */
        public Map<K, Collection<V>> mo30368h() {
            return m97983z();
        }

        @Override // p000.AbstractC4667L0, p000.AbstractC9263X0
        /* renamed from: j */
        public Set<K> mo30367j() {
            return m97996A();
        }
    }

    /* renamed from: jX2$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC24923b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* renamed from: a */
        public abstract InterfaceC41581gX2<K, V> mo30366a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo30366a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return mo30366a().mo39188g(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return mo30366a().remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo30366a().size();
        }
    }

    /* renamed from: jX2$c */
    /* loaded from: classes6.dex */
    public static class C24924c<K, V> extends AbstractC9586Y0<K> {

        /* renamed from: d */
        public final InterfaceC41581gX2<K, V> f92899d;

        /* renamed from: jX2$c$a */
        /* loaded from: classes6.dex */
        public class C24925a extends AbstractC50261v96<Map.Entry<K, Collection<V>>, InterfaceC45139mX2.InterfaceC26111a<K>> {

            /* renamed from: jX2$c$a$a */
            /* loaded from: classes6.dex */
            public class C24926a extends C46325oX2.AbstractC26997a<K> {

                /* renamed from: b */
                public final /* synthetic */ Map.Entry f92900b;

                public C24926a(C24925a c24925a, Map.Entry entry) {
                    this.f92900b = entry;
                }

                @Override // p000.InterfaceC45139mX2.InterfaceC26111a
                public int getCount() {
                    return ((Collection) this.f92900b.getValue()).size();
                }

                @Override // p000.InterfaceC45139mX2.InterfaceC26111a
                public K getElement() {
                    return (K) this.f92900b.getKey();
                }
            }

            public C24925a(C24924c c24924c, Iterator it) {
                super(it);
            }

            @Override // p000.AbstractC50261v96
            /* renamed from: b */
            public InterfaceC45139mX2.InterfaceC26111a<K> mo574a(Map.Entry<K, Collection<V>> entry) {
                return new C24926a(this, entry);
            }
        }

        public C24924c(InterfaceC41581gX2<K, V> interfaceC41581gX2) {
            this.f92899d = interfaceC41581gX2;
        }

        @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
        /* renamed from: A2 */
        public int mo20922A2(Object obj, int i) {
            C39948dm0.m43733b(i, "occurrences");
            if (i == 0) {
                return mo20918d3(obj);
            }
            Collection collection = (Collection) C37907aM2.m71548n(this.f92899d.mo24583f(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
        /* renamed from: F2 */
        public Set<K> mo25465F2() {
            return this.f92899d.keySet();
        }

        @Override // p000.AbstractC9586Y0
        /* renamed from: c */
        public int mo20913c() {
            return this.f92899d.mo24583f().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f92899d.clear();
        }

        @Override // p000.AbstractC9586Y0, java.util.AbstractCollection, java.util.Collection, p000.InterfaceC45139mX2
        public boolean contains(Object obj) {
            return this.f92899d.containsKey(obj);
        }

        @Override // p000.InterfaceC45139mX2
        /* renamed from: d3 */
        public int mo20918d3(Object obj) {
            Collection collection = (Collection) C37907aM2.m71548n(this.f92899d.mo24583f(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // p000.AbstractC9586Y0
        /* renamed from: e */
        public Iterator<K> mo20917e() {
            throw new AssertionError("should never be called");
        }

        @Override // p000.AbstractC9586Y0
        /* renamed from: f */
        public Iterator<InterfaceC45139mX2.InterfaceC26111a<K>> mo20916f() {
            return new C24925a(this, this.f92899d.mo24583f().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.InterfaceC45139mX2
        public Iterator<K> iterator() {
            return C37907aM2.m71553i(this.f92899d.mo24584b().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p000.InterfaceC45139mX2
        public int size() {
            return this.f92899d.size();
        }
    }

    private C43360jX2() {
    }

    /* renamed from: a */
    public static boolean m30372a(InterfaceC41581gX2<?, ?> interfaceC41581gX2, Object obj) {
        if (obj == interfaceC41581gX2) {
            return true;
        }
        if (obj instanceof InterfaceC41581gX2) {
            return interfaceC41581gX2.mo24583f().equals(((InterfaceC41581gX2) obj).mo24583f());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> InterfaceC37423Yv5<K, V> m30371b(InterfaceC37563Zl1<K, V> interfaceC37563Zl1, IZ3<? super Map.Entry<K, V>> iz3) {
        return new C36393Ul1(interfaceC37563Zl1.mo72552a(), JZ3.m100201b(interfaceC37563Zl1.mo76375c(), iz3));
    }

    /* renamed from: c */
    public static <K, V> InterfaceC37423Yv5<K, V> m30370c(InterfaceC37423Yv5<K, V> interfaceC37423Yv5, IZ3<? super K> iz3) {
        if (interfaceC37423Yv5 instanceof C36861Wl1) {
            C36861Wl1 c36861Wl1 = (C36861Wl1) interfaceC37423Yv5;
            return new C36861Wl1(c36861Wl1.mo72552a(), JZ3.m100201b(c36861Wl1.f39700h, iz3));
        } else if (interfaceC37423Yv5 instanceof InterfaceC37563Zl1) {
            return m30371b((InterfaceC37563Zl1) interfaceC37423Yv5, C37907aM2.m71552j(iz3));
        } else {
            return new C36861Wl1(interfaceC37423Yv5, iz3);
        }
    }

    /* renamed from: d */
    public static <K, V> InterfaceC37423Yv5<K, V> m30369d(Map<K, Collection<V>> map, YU5<? extends Set<V>> yu5) {
        return new C24922a(map, yu5);
    }
}
