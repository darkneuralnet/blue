package p000;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import p000.C44098km0;
/* renamed from: dw5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40052dw5 {

    /* renamed from: dw5$a */
    /* loaded from: classes6.dex */
    public class C19909a extends AbstractC19914e<E> {

        /* renamed from: b */
        public final /* synthetic */ Set f77441b;

        /* renamed from: c */
        public final /* synthetic */ Set f77442c;

        /* renamed from: dw5$a$a */
        /* loaded from: classes6.dex */
        public class C19910a extends AbstractC0367B0<E> {

            /* renamed from: d */
            public final Iterator<? extends E> f77443d;

            /* renamed from: e */
            public final Iterator<? extends E> f77444e;

            public C19910a() {
                this.f77443d = C19909a.this.f77441b.iterator();
                this.f77444e = C19909a.this.f77442c.iterator();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [E, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v8, types: [E, java.lang.Object] */
            @Override // p000.AbstractC0367B0
            /* renamed from: a */
            public E mo575a() {
                if (this.f77443d.hasNext()) {
                    return this.f77443d.next();
                }
                while (this.f77444e.hasNext()) {
                    ?? next = this.f77444e.next();
                    if (!C19909a.this.f77441b.contains(next)) {
                        return next;
                    }
                }
                return m114802b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19909a(Set set, Set set2) {
            super(null);
            this.f77441b = set;
            this.f77442c = set2;
        }

        @Override // p000.C40052dw5.AbstractC19914e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public AbstractC48175re6<E> iterator() {
            return new C19910a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f77441b.contains(obj) || this.f77442c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f77441b.isEmpty() && this.f77442c.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f77441b.size();
            for (Object obj : this.f77442c) {
                if (!this.f77441b.contains(obj)) {
                    size++;
                }
            }
            return size;
        }
    }

    /* renamed from: dw5$b */
    /* loaded from: classes6.dex */
    public static class C19911b<E> extends C44098km0.C25229a<E> implements Set<E> {
        public C19911b(Set<E> set, IZ3<? super E> iz3) {
            super(set, iz3);
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

    /* renamed from: dw5$c */
    /* loaded from: classes6.dex */
    public static class C19912c<E> extends C19911b<E> implements SortedSet<E> {
        public C19912c(SortedSet<E> sortedSet, IZ3<? super E> iz3) {
            super(sortedSet, iz3);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f94887b).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) C52933zg2.m587k(this.f94887b.iterator(), this.f94888c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return new C19912c(((SortedSet) this.f94887b).headSet(e), this.f94888c);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f94887b;
            while (true) {
                ?? r1 = (Object) sortedSet.last();
                if (this.f94888c.apply(r1)) {
                    return r1;
                }
                sortedSet = sortedSet.headSet(r1);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return new C19912c(((SortedSet) this.f94887b).subSet(e, e2), this.f94888c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return new C19912c(((SortedSet) this.f94887b).tailSet(e), this.f94888c);
        }
    }

    /* renamed from: dw5$d */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC19913d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return C40052dw5.m43484k(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) EZ3.m108801n(collection));
        }
    }

    /* renamed from: dw5$e */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC19914e<E> extends AbstractSet<E> {
        public /* synthetic */ AbstractC19914e(C19909a c19909a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public abstract AbstractC48175re6<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private AbstractC19914e() {
        }
    }

    /* renamed from: dw5$f */
    /* loaded from: classes6.dex */
    public static final class C19915f<E> extends AbstractC35097Ox1<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final NavigableSet<E> f77446b;

        /* renamed from: c */
        public final SortedSet<E> f77447c;

        /* renamed from: d */
        public transient C19915f<E> f77448d;

        public C19915f(NavigableSet<E> navigableSet) {
            this.f77446b = (NavigableSet) EZ3.m108801n(navigableSet);
            this.f77447c = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // p000.AbstractC35097Ox1, p000.AbstractC34395Lx1, p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
        /* renamed from: b */
        public SortedSet<E> delegate() {
            return this.f77447c;
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return this.f77446b.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return C52933zg2.m576v(this.f77446b.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            C19915f<E> c19915f = this.f77448d;
            if (c19915f == null) {
                C19915f<E> c19915f2 = new C19915f<>(this.f77446b.descendingSet());
                this.f77448d = c19915f2;
                c19915f2.f77448d = this;
                return c19915f2;
            }
            return c19915f;
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return this.f77446b.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return C40052dw5.m43481n(this.f77446b.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return this.f77446b.higher(e);
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return this.f77446b.lower(e);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return C40052dw5.m43481n(this.f77446b.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return C40052dw5.m43481n(this.f77446b.tailSet(e, z));
        }
    }

    private C40052dw5() {
    }

    /* renamed from: a */
    public static boolean m43494a(Set<?> set, Object obj) {
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

    /* renamed from: b */
    public static <E> Set<E> m43493b(Set<E> set, IZ3<? super E> iz3) {
        if (set instanceof SortedSet) {
            return m43492c((SortedSet) set, iz3);
        }
        if (set instanceof C19911b) {
            C19911b c19911b = (C19911b) set;
            return new C19911b((Set) c19911b.f94887b, JZ3.m100201b(c19911b.f94888c, iz3));
        }
        return new C19911b((Set) EZ3.m108801n(set), (IZ3) EZ3.m108801n(iz3));
    }

    /* renamed from: c */
    public static <E> SortedSet<E> m43492c(SortedSet<E> sortedSet, IZ3<? super E> iz3) {
        if (sortedSet instanceof C19911b) {
            C19911b c19911b = (C19911b) sortedSet;
            return new C19912c((SortedSet) c19911b.f94887b, JZ3.m100201b(c19911b.f94888c, iz3));
        }
        return new C19912c((SortedSet) EZ3.m108801n(sortedSet), (IZ3) EZ3.m108801n(iz3));
    }

    /* renamed from: d */
    public static int m43491d(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    /* renamed from: e */
    public static <E> Set<E> m43490e() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: f */
    public static <E> HashSet<E> m43489f() {
        return new HashSet<>();
    }

    /* renamed from: g */
    public static <E> HashSet<E> m43488g(int i) {
        return new HashSet<>(C37907aM2.m71559c(i));
    }

    /* renamed from: h */
    public static <E> Set<E> m43487h() {
        return Collections.newSetFromMap(C37907aM2.m71550l());
    }

    /* renamed from: i */
    public static <E> LinkedHashSet<E> m43486i() {
        return new LinkedHashSet<>();
    }

    /* renamed from: j */
    public static <E> LinkedHashSet<E> m43485j(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> m43486i = m43486i();
        C52340yg2.m2983a(m43486i, iterable);
        return m43486i;
    }

    /* renamed from: k */
    public static boolean m43484k(Set<?> set, Collection<?> collection) {
        EZ3.m108801n(collection);
        if (collection instanceof InterfaceC45139mX2) {
            collection = ((InterfaceC45139mX2) collection).mo25465F2();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return C52933zg2.m583o(set.iterator(), collection);
        }
        return m43483l(set, collection.iterator());
    }

    /* renamed from: l */
    public static boolean m43483l(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: m */
    public static <E> AbstractC19914e<E> m43482m(Set<? extends E> set, Set<? extends E> set2) {
        EZ3.m108800o(set, "set1");
        EZ3.m108800o(set2, "set2");
        return new C19909a(set, set2);
    }

    /* renamed from: n */
    public static <E> NavigableSet<E> m43481n(NavigableSet<E> navigableSet) {
        if (!(navigableSet instanceof QY1) && !(navigableSet instanceof C19915f)) {
            return new C19915f(navigableSet);
        }
        return navigableSet;
    }
}
