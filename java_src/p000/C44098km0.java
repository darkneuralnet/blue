package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: km0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44098km0 {

    /* renamed from: km0$a */
    /* loaded from: classes6.dex */
    public static class C25229a<E> extends AbstractCollection<E> {

        /* renamed from: b */
        public final Collection<E> f94887b;

        /* renamed from: c */
        public final IZ3<? super E> f94888c;

        public C25229a(Collection<E> collection, IZ3<? super E> iz3) {
            this.f94887b = collection;
            this.f94888c = iz3;
        }

        /* renamed from: a */
        public C25229a<E> m28475a(IZ3<? super E> iz3) {
            return new C25229a<>(this.f94887b, JZ3.m100201b(this.f94888c, iz3));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            EZ3.m108811d(this.f94888c.apply(e));
            return this.f94887b.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            for (E e : collection) {
                EZ3.m108811d(this.f94888c.apply(e));
            }
            return this.f94887b.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C52340yg2.m2979e(this.f94887b, this.f94888c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (C44098km0.m28477d(this.f94887b, obj)) {
                return this.f94888c.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C44098km0.m28480a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !C52340yg2.m2982b(this.f94887b, this.f94888c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return C52933zg2.m588j(this.f94887b.iterator(), this.f94888c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f94887b.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f94887b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f94888c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f94887b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f94888c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (E e : this.f94887b) {
                if (this.f94888c.apply(e)) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return C34819Ns2.m93253i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C34819Ns2.m93253i(iterator()).toArray(tArr);
        }
    }

    private C44098km0() {
    }

    /* renamed from: a */
    public static boolean m28480a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <E> Collection<E> m28479b(Collection<E> collection, IZ3<? super E> iz3) {
        if (collection instanceof C25229a) {
            return ((C25229a) collection).m28475a(iz3);
        }
        return new C25229a((Collection) EZ3.m108801n(collection), (IZ3) EZ3.m108801n(iz3));
    }

    /* renamed from: c */
    public static StringBuilder m28478c(int i) {
        C39948dm0.m43733b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    /* renamed from: d */
    public static boolean m28477d(Collection<?> collection, Object obj) {
        EZ3.m108801n(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static String m28476e(Collection<?> collection) {
        StringBuilder m28478c = m28478c(collection.size());
        m28478c.append('[');
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                m28478c.append(", ");
            }
            if (obj == collection) {
                m28478c.append("(this Collection)");
            } else {
                m28478c.append(obj);
            }
            z = false;
        }
        m28478c.append(']');
        return m28478c.toString();
    }
}
