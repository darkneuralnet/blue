package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.QY1;
/* renamed from: VY1 */
/* loaded from: classes6.dex */
public abstract class VY1<E> extends QY1<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    public static final AbstractC49953ue6<Object> f39215c = new C8673b(C35298Pt4.f29352f, 0);

    /* renamed from: VY1$a */
    /* loaded from: classes6.dex */
    public static final class C8672a<E> extends QY1.AbstractC6797a<E> {
        public C8672a() {
            this(4);
        }

        @Override // p000.QY1.AbstractC6797a
        /* renamed from: h */
        public C8672a<E> mo42771d(E e) {
            super.mo42772a(e);
            return this;
        }

        /* renamed from: i */
        public C8672a<E> m79764i(Iterator<? extends E> it) {
            super.m88414b(it);
            return this;
        }

        /* renamed from: j */
        public VY1<E> m79763j() {
            this.f30504c = true;
            return VY1.m79772s(this.f30502a, this.f30503b);
        }

        public C8672a(int i) {
            super(i);
        }
    }

    /* renamed from: VY1$b */
    /* loaded from: classes6.dex */
    public static class C8673b<E> extends AbstractC30014x0<E> {

        /* renamed from: d */
        public final VY1<E> f39216d;

        public C8673b(VY1<E> vy1, int i) {
            super(vy1.size(), i);
            this.f39216d = vy1;
        }

        @Override // p000.AbstractC30014x0
        /* renamed from: a */
        public E mo573a(int i) {
            return this.f39216d.get(i);
        }
    }

    /* renamed from: VY1$c */
    /* loaded from: classes6.dex */
    public static class C8674c<E> extends VY1<E> {

        /* renamed from: d */
        public final transient VY1<E> f39217d;

        public C8674c(VY1<E> vy1) {
            this.f39217d = vy1;
        }

        @Override // p000.VY1
        /* renamed from: L */
        public VY1<E> mo79762L() {
            return this.f39217d;
        }

        @Override // p000.VY1, java.util.List
        /* renamed from: N */
        public VY1<E> subList(int i, int i2) {
            EZ3.m108796s(i, i2, size());
            return this.f39217d.subList(m79760R(i2), m79760R(i)).mo79762L();
        }

        /* renamed from: Q */
        public final int m79761Q(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: R */
        public final int m79760R(int i) {
            return size() - i;
        }

        @Override // p000.VY1, p000.QY1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f39217d.contains(obj);
        }

        @Override // java.util.List
        public E get(int i) {
            EZ3.m108803l(i, size());
            return this.f39217d.get(m79761Q(i));
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return this.f39217d.mo9378h();
        }

        @Override // p000.VY1, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f39217d.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m79761Q(lastIndexOf);
            }
            return -1;
        }

        @Override // p000.VY1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p000.VY1, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f39217d.indexOf(obj);
            if (indexOf >= 0) {
                return m79761Q(indexOf);
            }
            return -1;
        }

        @Override // p000.VY1, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f39217d.size();
        }

        @Override // p000.VY1, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* renamed from: VY1$d */
    /* loaded from: classes6.dex */
    public static class C8675d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Object[] f39218b;

        public C8675d(Object[] objArr) {
            this.f39218b = objArr;
        }

        public Object readResolve() {
            return VY1.m79784A(this.f39218b);
        }
    }

    /* renamed from: VY1$e */
    /* loaded from: classes6.dex */
    public class C8676e extends VY1<E> {

        /* renamed from: d */
        public final transient int f39219d;

        /* renamed from: e */
        public final transient int f39220e;

        public C8676e(int i, int i2) {
            this.f39219d = i;
            this.f39220e = i2;
        }

        @Override // p000.VY1, java.util.List
        /* renamed from: N */
        public VY1<E> subList(int i, int i2) {
            EZ3.m108796s(i, i2, this.f39220e);
            VY1 vy1 = VY1.this;
            int i3 = this.f39219d;
            return vy1.subList(i + i3, i2 + i3);
        }

        @Override // p000.QY1
        /* renamed from: c */
        public Object[] mo79758c() {
            return VY1.this.mo79758c();
        }

        @Override // p000.QY1
        /* renamed from: e */
        public int mo79757e() {
            return VY1.this.mo79756f() + this.f39219d + this.f39220e;
        }

        @Override // p000.QY1
        /* renamed from: f */
        public int mo79756f() {
            return VY1.this.mo79756f() + this.f39219d;
        }

        @Override // java.util.List
        public E get(int i) {
            EZ3.m108803l(i, this.f39220e);
            return VY1.this.get(i + this.f39219d);
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return true;
        }

        @Override // p000.VY1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p000.VY1, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f39220e;
        }

        @Override // p000.VY1, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* renamed from: A */
    public static <E> VY1<E> m79784A(E[] eArr) {
        if (eArr.length == 0) {
            return m79781E();
        }
        return m79769w((Object[]) eArr.clone());
    }

    /* renamed from: E */
    public static <E> VY1<E> m79781E() {
        return (VY1<E>) C35298Pt4.f29352f;
    }

    /* renamed from: F */
    public static <E> VY1<E> m79780F(E e) {
        return m79769w(e);
    }

    /* renamed from: H */
    public static <E> VY1<E> m79779H(E e, E e2) {
        return m79769w(e, e2);
    }

    /* renamed from: I */
    public static <E> VY1<E> m79778I(E e, E e2, E e3) {
        return m79769w(e, e2, e3);
    }

    /* renamed from: J */
    public static <E> VY1<E> m79777J(E e, E e2, E e3, E e4) {
        return m79769w(e, e2, e3, e4);
    }

    /* renamed from: K */
    public static <E> VY1<E> m79776K(E e, E e2, E e3, E e4, E e5) {
        return m79769w(e, e2, e3, e4, e5);
    }

    /* renamed from: M */
    public static <E> VY1<E> m79775M(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        EZ3.m108801n(comparator);
        Object[] m2976h = C52340yg2.m2976h(iterable);
        C33281Hd3.m103640b(m2976h);
        Arrays.sort(m2976h, comparator);
        return m79773o(m2976h);
    }

    /* renamed from: o */
    public static <E> VY1<E> m79773o(Object[] objArr) {
        return m79772s(objArr, objArr.length);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: s */
    public static <E> VY1<E> m79772s(Object[] objArr, int i) {
        if (i == 0) {
            return m79781E();
        }
        return new C35298Pt4(objArr, i);
    }

    /* renamed from: u */
    public static <E> C8672a<E> m79771u() {
        return new C8672a<>();
    }

    /* renamed from: v */
    public static <E> C8672a<E> m79770v(int i) {
        C39948dm0.m43733b(i, "expectedSize");
        return new C8672a<>(i);
    }

    /* renamed from: w */
    public static <E> VY1<E> m79769w(Object... objArr) {
        return m79773o(C33281Hd3.m103640b(objArr));
    }

    /* renamed from: x */
    public static <E> VY1<E> m79768x(Iterable<? extends E> iterable) {
        EZ3.m108801n(iterable);
        if (iterable instanceof Collection) {
            return m79767y((Collection) iterable);
        }
        return m79766z(iterable.iterator());
    }

    /* renamed from: y */
    public static <E> VY1<E> m79767y(Collection<? extends E> collection) {
        if (collection instanceof QY1) {
            VY1<E> mo10675a = ((QY1) collection).mo10675a();
            if (mo10675a.mo9378h()) {
                return m79773o(mo10675a.toArray());
            }
            return mo10675a;
        }
        return m79769w(collection.toArray());
    }

    /* renamed from: z */
    public static <E> VY1<E> m79766z(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m79781E();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return m79780F(next);
        }
        return new C8672a().mo42771d(next).m79764i(it).m79763j();
    }

    @Override // java.util.List
    /* renamed from: C */
    public AbstractC49953ue6<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: D */
    public AbstractC49953ue6<E> listIterator(int i) {
        EZ3.m108798q(i, size());
        if (isEmpty()) {
            return (AbstractC49953ue6<E>) f39215c;
        }
        return new C8673b(this, i);
    }

    /* renamed from: L */
    public VY1<E> mo79762L() {
        return size() <= 1 ? this : new C8674c(this);
    }

    @Override // java.util.List
    /* renamed from: N */
    public VY1<E> subList(int i, int i2) {
        EZ3.m108796s(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m79781E();
        }
        return m79774O(i, i2);
    }

    /* renamed from: O */
    public VY1<E> m79774O(int i, int i2) {
        return new C8676e(i, i2 - i);
    }

    @Override // p000.QY1
    @Deprecated
    /* renamed from: a */
    public final VY1<E> mo10675a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.QY1
    /* renamed from: b */
    public int mo9381b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return C34819Ns2.m93260b(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C34819Ns2.m93259c(this, obj);
    }

    @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC48175re6<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C34819Ns2.m93257e(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.QY1
    public Object writeReplace() {
        return new C8675d(toArray());
    }
}
