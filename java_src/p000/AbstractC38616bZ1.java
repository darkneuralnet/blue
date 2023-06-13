package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p000.QY1;
/* renamed from: bZ1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC38616bZ1<E> extends QY1<E> implements Set<E> {

    /* renamed from: c */
    public transient VY1<E> f57692c;

    /* renamed from: bZ1$a */
    /* loaded from: classes6.dex */
    public static class C12445a<E> extends QY1.AbstractC6797a<E> {

        /* renamed from: d */
        public Object[] f57693d;

        /* renamed from: e */
        public int f57694e;

        public C12445a() {
            super(4);
        }

        @Override // p000.QY1.AbstractC6797a
        /* renamed from: h */
        public C12445a<E> mo42771d(E e) {
            EZ3.m108801n(e);
            if (this.f57693d != null && AbstractC38616bZ1.m64361u(this.f30503b) <= this.f57693d.length) {
                m64355j(e);
                return this;
            }
            this.f57693d = null;
            super.mo42772a(e);
            return this;
        }

        /* renamed from: i */
        public C12445a<E> m64356i(E... eArr) {
            if (this.f57693d != null) {
                for (E e : eArr) {
                    mo42771d(e);
                }
            } else {
                super.m88417e(eArr);
            }
            return this;
        }

        /* renamed from: j */
        public final void m64355j(E e) {
            Objects.requireNonNull(this.f57693d);
            int length = this.f57693d.length - 1;
            int hashCode = e.hashCode();
            int m7052b = C50922wH1.m7052b(hashCode);
            while (true) {
                int i = m7052b & length;
                Object[] objArr = this.f57693d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f57694e += hashCode;
                    super.mo42772a(e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    m7052b = i + 1;
                }
            }
        }

        /* renamed from: k */
        public AbstractC38616bZ1<E> mo42769k() {
            AbstractC38616bZ1<E> m64360v;
            Object[] objArr;
            int i = this.f30503b;
            if (i != 0) {
                if (i != 1) {
                    if (this.f57693d != null && AbstractC38616bZ1.m64361u(i) == this.f57693d.length) {
                        if (AbstractC38616bZ1.m64364F(this.f30503b, this.f30502a.length)) {
                            objArr = Arrays.copyOf(this.f30502a, this.f30503b);
                        } else {
                            objArr = this.f30502a;
                        }
                        int i2 = this.f57694e;
                        Object[] objArr2 = this.f57693d;
                        m64360v = new C35766Rt4<>(objArr, i2, objArr2, objArr2.length - 1, this.f30503b);
                    } else {
                        m64360v = AbstractC38616bZ1.m64360v(this.f30503b, this.f30502a);
                        this.f30503b = m64360v.size();
                    }
                    this.f30504c = true;
                    this.f57693d = null;
                    return m64360v;
                }
                Object obj = this.f30502a[0];
                Objects.requireNonNull(obj);
                return AbstractC38616bZ1.m64367C(obj);
            }
            return AbstractC38616bZ1.m64368A();
        }
    }

    /* renamed from: bZ1$b */
    /* loaded from: classes6.dex */
    public static class C12446b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Object[] f57695b;

        public C12446b(Object[] objArr) {
            this.f57695b = objArr;
        }

        public Object readResolve() {
            return AbstractC38616bZ1.m64358x(this.f57695b);
        }
    }

    /* renamed from: A */
    public static <E> AbstractC38616bZ1<E> m64368A() {
        return C35766Rt4.f32798j;
    }

    /* renamed from: C */
    public static <E> AbstractC38616bZ1<E> m64367C(E e) {
        return new C49687uB5(e);
    }

    /* renamed from: D */
    public static <E> AbstractC38616bZ1<E> m64366D(E e, E e2) {
        return m64360v(2, e, e2);
    }

    /* renamed from: E */
    public static <E> AbstractC38616bZ1<E> m64365E(E e, E e2, E e3) {
        return m64360v(3, e, e2, e3);
    }

    /* renamed from: F */
    public static boolean m64364F(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: u */
    public static int m64361u(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        EZ3.m108810e(z, "collection too large");
        return 1073741824;
    }

    /* renamed from: v */
    public static <E> AbstractC38616bZ1<E> m64360v(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m64361u = m64361u(i);
                Object[] objArr2 = new Object[m64361u];
                int i2 = m64361u - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object m103641a = C33281Hd3.m103641a(objArr[i5], i5);
                    int hashCode = m103641a.hashCode();
                    int m7052b = C50922wH1.m7052b(hashCode);
                    while (true) {
                        int i6 = m7052b & i2;
                        Object obj = objArr2[i6];
                        if (obj == null) {
                            objArr[i4] = m103641a;
                            objArr2[i6] = m103641a;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj.equals(m103641a)) {
                            break;
                        } else {
                            m7052b++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new C49687uB5(obj2);
                } else if (m64361u(i4) < m64361u / 2) {
                    return m64360v(i4, objArr);
                } else {
                    if (m64364F(i4, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new C35766Rt4(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return m64367C(obj3);
        }
        return m64368A();
    }

    /* renamed from: w */
    public static <E> AbstractC38616bZ1<E> m64359w(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC38616bZ1) && !(collection instanceof SortedSet)) {
            AbstractC38616bZ1<E> abstractC38616bZ1 = (AbstractC38616bZ1) collection;
            if (!abstractC38616bZ1.mo9378h()) {
                return abstractC38616bZ1;
            }
        }
        Object[] array = collection.toArray();
        return m64360v(array.length, array);
    }

    /* renamed from: x */
    public static <E> AbstractC38616bZ1<E> m64358x(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return m64360v(eArr.length, (Object[]) eArr.clone());
            }
            return m64367C(eArr[0]);
        }
        return m64368A();
    }

    @Override // p000.QY1
    /* renamed from: a */
    public VY1<E> mo10675a() {
        VY1<E> vy1 = this.f57692c;
        if (vy1 == null) {
            VY1<E> mo9379y = mo9379y();
            this.f57692c = mo9379y;
            return mo9379y;
        }
        return vy1;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC38616bZ1) && mo64357z() && ((AbstractC38616bZ1) obj).mo64357z() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C40052dw5.m43494a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C40052dw5.m43491d(this);
    }

    @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public abstract AbstractC48175re6<E> iterator();

    @Override // p000.QY1
    Object writeReplace() {
        return new C12446b(toArray());
    }

    /* renamed from: y */
    public VY1<E> mo9379y() {
        return VY1.m79773o(toArray());
    }

    /* renamed from: z */
    public boolean mo64357z() {
        return false;
    }
}
