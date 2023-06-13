package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p000.VY1;
/* renamed from: QY1 */
/* loaded from: classes6.dex */
public abstract class QY1<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    public static final Object[] f30501b = new Object[0];

    /* renamed from: QY1$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC6797a<E> extends AbstractC6798b<E> {

        /* renamed from: a */
        public Object[] f30502a;

        /* renamed from: b */
        public int f30503b;

        /* renamed from: c */
        public boolean f30504c;

        public AbstractC6797a(int i) {
            C39948dm0.m43733b(i, "initialCapacity");
            this.f30502a = new Object[i];
            this.f30503b = 0;
        }

        @Override // p000.QY1.AbstractC6798b
        /* renamed from: d */
        public AbstractC6797a<E> mo42772a(E e) {
            EZ3.m108801n(e);
            m88415g(this.f30503b + 1);
            Object[] objArr = this.f30502a;
            int i = this.f30503b;
            this.f30503b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: e */
        public AbstractC6798b<E> m88417e(E... eArr) {
            m88416f(eArr, eArr.length);
            return this;
        }

        /* renamed from: f */
        public final void m88416f(Object[] objArr, int i) {
            C33281Hd3.m103639c(objArr, i);
            m88415g(this.f30503b + i);
            System.arraycopy(objArr, 0, this.f30502a, this.f30503b, i);
            this.f30503b += i;
        }

        /* renamed from: g */
        public final void m88415g(int i) {
            Object[] objArr = this.f30502a;
            if (objArr.length < i) {
                this.f30502a = Arrays.copyOf(objArr, AbstractC6798b.m88413c(objArr.length, i));
                this.f30504c = false;
            } else if (this.f30504c) {
                this.f30502a = (Object[]) objArr.clone();
                this.f30504c = false;
            }
        }
    }

    /* renamed from: QY1$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC6798b<E> {
        /* renamed from: c */
        public static int m88413c(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        /* renamed from: a */
        public abstract AbstractC6798b<E> mo42772a(E e);

        /* renamed from: b */
        public AbstractC6798b<E> m88414b(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo42772a(it.next());
            }
            return this;
        }
    }

    /* renamed from: a */
    public VY1<E> mo10675a() {
        return isEmpty() ? VY1.m79781E() : VY1.m79773o(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo9381b(Object[] objArr, int i) {
        AbstractC48175re6<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    /* renamed from: c */
    public Object[] mo79758c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* renamed from: e */
    public int mo79757e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public int mo79756f() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract boolean mo9378h();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public abstract AbstractC48175re6<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f30501b);
    }

    Object writeReplace() {
        return new VY1.C8675d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        EZ3.m108801n(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo79758c = mo79758c();
            if (mo79758c != null) {
                return (T[]) C49865uV3.m10210a(mo79758c, mo79756f(), mo79757e(), tArr);
            }
            tArr = (T[]) C33281Hd3.m103635g(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo9381b(tArr, 0);
        return tArr;
    }
}
