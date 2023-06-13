package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import p000.AbstractC38616bZ1;
/* renamed from: eZ1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC40412eZ1<E> extends AbstractC41005fZ1<E> implements NavigableSet<E>, InterfaceC50387vN5<E> {

    /* renamed from: d */
    public final transient Comparator<? super E> f78539d;

    /* renamed from: e */
    public transient AbstractC40412eZ1<E> f78540e;

    /* renamed from: eZ1$a */
    /* loaded from: classes6.dex */
    public static final class C20065a<E> extends AbstractC38616bZ1.C12445a<E> {

        /* renamed from: f */
        public final Comparator<? super E> f78541f;

        public C20065a(Comparator<? super E> comparator) {
            this.f78541f = (Comparator) EZ3.m108801n(comparator);
        }

        @Override // p000.AbstractC38616bZ1.C12445a
        /* renamed from: l */
        public C20065a<E> mo42770h(E e) {
            super.mo42771d(e);
            return this;
        }

        /* renamed from: m */
        public C20065a<E> m42767m(E... eArr) {
            super.m64356i(eArr);
            return this;
        }

        @Override // p000.AbstractC38616bZ1.C12445a
        /* renamed from: n */
        public AbstractC40412eZ1<E> mo42769k() {
            AbstractC40412eZ1<E> m42790H = AbstractC40412eZ1.m42790H(this.f78541f, this.f30503b, this.f30502a);
            this.f30503b = m42790H.size();
            this.f30504c = true;
            return m42790H;
        }
    }

    /* renamed from: eZ1$b */
    /* loaded from: classes6.dex */
    public static class C20066b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Comparator<? super E> f78542b;

        /* renamed from: c */
        public final Object[] f78543c;

        public C20066b(Comparator<? super E> comparator, Object[] objArr) {
            this.f78542b = comparator;
            this.f78543c = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            return new C20065a(this.f78542b).m42767m(this.f78543c).mo42769k();
        }
    }

    public AbstractC40412eZ1(Comparator<? super E> comparator) {
        this.f78539d = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public static <E> AbstractC40412eZ1<E> m42790H(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return m42784N(comparator);
        }
        C33281Hd3.m103639c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = (Object) eArr[i3];
            if (comparator.compare(obj, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new C36000St4(VY1.m79772s(eArr, i2), comparator);
    }

    /* renamed from: I */
    public static <E> AbstractC40412eZ1<E> m42789I(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        EZ3.m108801n(comparator);
        if (C50980wN5.m6956b(comparator, iterable) && (iterable instanceof AbstractC40412eZ1)) {
            AbstractC40412eZ1<E> abstractC40412eZ1 = (AbstractC40412eZ1) iterable;
            if (!abstractC40412eZ1.mo9378h()) {
                return abstractC40412eZ1;
            }
        }
        Object[] m2976h = C52340yg2.m2976h(iterable);
        return m42790H(comparator, m2976h.length, m2976h);
    }

    /* renamed from: J */
    public static <E> AbstractC40412eZ1<E> m42788J(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return m42789I(comparator, collection);
    }

    /* renamed from: N */
    public static <E> C36000St4<E> m42784N(Comparator<? super E> comparator) {
        if (AbstractC53114zy3.m58c().equals(comparator)) {
            return (C36000St4<E>) C36000St4.f34399g;
        }
        return new C36000St4<>(VY1.m79781E(), comparator);
    }

    /* renamed from: a0 */
    public static int m42773a0(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: K */
    public abstract AbstractC40412eZ1<E> mo42787K();

    @Override // java.util.NavigableSet
    /* renamed from: L */
    public abstract AbstractC48175re6<E> descendingIterator();

    @Override // java.util.NavigableSet
    /* renamed from: M */
    public AbstractC40412eZ1<E> descendingSet() {
        AbstractC40412eZ1<E> abstractC40412eZ1 = this.f78540e;
        if (abstractC40412eZ1 == null) {
            AbstractC40412eZ1<E> mo42787K = mo42787K();
            this.f78540e = mo42787K;
            mo42787K.f78540e = this;
            return mo42787K;
        }
        return abstractC40412eZ1;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: O */
    public AbstractC40412eZ1<E> headSet(E e) {
        return headSet(e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: Q */
    public AbstractC40412eZ1<E> headSet(E e, boolean z) {
        return mo42781R(EZ3.m108801n(e), z);
    }

    /* renamed from: R */
    public abstract AbstractC40412eZ1<E> mo42781R(E e, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: S */
    public AbstractC40412eZ1<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: T */
    public AbstractC40412eZ1<E> subSet(E e, boolean z, E e2, boolean z2) {
        boolean z3;
        EZ3.m108801n(e);
        EZ3.m108801n(e2);
        if (this.f78539d.compare(e, e2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        EZ3.m108811d(z3);
        return mo42778U(e, z, e2, z2);
    }

    /* renamed from: U */
    public abstract AbstractC40412eZ1<E> mo42778U(E e, boolean z, E e2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: V */
    public AbstractC40412eZ1<E> tailSet(E e) {
        return tailSet(e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: X */
    public AbstractC40412eZ1<E> tailSet(E e, boolean z) {
        return mo42775Y(EZ3.m108801n(e), z);
    }

    /* renamed from: Y */
    public abstract AbstractC40412eZ1<E> mo42775Y(E e, boolean z);

    /* renamed from: Z */
    public int m42774Z(Object obj, Object obj2) {
        return m42773a0(this.f78539d, obj, obj2);
    }

    public E ceiling(E e) {
        return (E) C52340yg2.m2980d(tailSet(e, true), null);
    }

    @Override // java.util.SortedSet, p000.InterfaceC50387vN5
    public Comparator<? super E> comparator() {
        return this.f78539d;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return (E) C52933zg2.m586l(headSet(e, true).descendingIterator(), null);
    }

    public E higher(E e) {
        return (E) C52340yg2.m2980d(tailSet(e, false), null);
    }

    @Override // p000.AbstractC38616bZ1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public abstract AbstractC48175re6<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e) {
        return (E) C52933zg2.m586l(headSet(e, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC38616bZ1, p000.QY1
    public Object writeReplace() {
        return new C20066b(this.f78539d, toArray());
    }
}
