package p000;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
/* renamed from: yo */
/* loaded from: classes.dex */
public final class C30704yo<E> implements Collection<E>, Set<E> {

    /* renamed from: e */
    public static Object[] f120194e;

    /* renamed from: f */
    public static int f120195f;

    /* renamed from: g */
    public static Object[] f120196g;

    /* renamed from: h */
    public static int f120197h;

    /* renamed from: i */
    public static final Object f120198i = new Object();

    /* renamed from: j */
    public static final Object f120199j = new Object();

    /* renamed from: b */
    public int[] f120200b;

    /* renamed from: c */
    public Object[] f120201c;

    /* renamed from: d */
    public int f120202d;

    /* renamed from: yo$a */
    /* loaded from: classes.dex */
    public class C30705a extends AbstractC48992t12<E> {
        public C30705a() {
            super(C30704yo.this.f120202d);
        }

        @Override // p000.AbstractC48992t12
        /* renamed from: a */
        public E mo2570a(int i) {
            return (E) C30704yo.this.m2571s(i);
        }

        @Override // p000.AbstractC48992t12
        /* renamed from: b */
        public void mo2569b(int i) {
            C30704yo.this.m2572o(i);
        }
    }

    public C30704yo() {
        this(0);
    }

    /* renamed from: e */
    public static void m2576e(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f120199j) {
                if (f120197h < 10) {
                    objArr[0] = f120196g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f120196g = objArr;
                    f120197h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f120198i) {
                if (f120195f < 10) {
                    objArr[0] = f120194e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f120194e = objArr;
                    f120195f++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2579a(int i) {
        if (i == 8) {
            synchronized (f120199j) {
                Object[] objArr = f120196g;
                if (objArr != null) {
                    try {
                        this.f120201c = objArr;
                        f120196g = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f120200b = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f120197h--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f120196g = null;
                    f120197h = 0;
                }
            }
        } else if (i == 4) {
            synchronized (f120198i) {
                Object[] objArr2 = f120194e;
                if (objArr2 != null) {
                    try {
                        this.f120201c = objArr2;
                        f120194e = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f120200b = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f120195f--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f120194e = null;
                    f120195f = 0;
                }
            }
        }
        this.f120200b = new int[i];
        this.f120201c = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m2575f;
        int i2 = this.f120202d;
        if (e == null) {
            m2575f = m2574h();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m2575f = m2575f(e, hashCode);
        }
        if (m2575f >= 0) {
            return false;
        }
        int i3 = ~m2575f;
        int[] iArr = this.f120200b;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f120201c;
            m2579a(i4);
            if (i2 == this.f120202d) {
                int[] iArr2 = this.f120200b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f120201c, 0, objArr.length);
                }
                m2576e(iArr, objArr, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f120200b;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.f120201c;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.f120202d;
        if (i2 == i7) {
            int[] iArr4 = this.f120200b;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f120201c[i3] = e;
                this.f120202d = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m2577c(this.f120202d + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    /* renamed from: b */
    public final int m2578b(int i) {
        try {
            return C51342wz0.m6015a(this.f120200b, this.f120202d, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public void m2577c(int i) {
        int i2 = this.f120202d;
        int[] iArr = this.f120200b;
        if (iArr.length < i) {
            Object[] objArr = this.f120201c;
            m2579a(i);
            int i3 = this.f120202d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f120200b, 0, i3);
                System.arraycopy(objArr, 0, this.f120201c, 0, this.f120202d);
            }
            m2576e(iArr, objArr, this.f120202d);
        }
        if (this.f120202d == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f120202d;
        if (i != 0) {
            int[] iArr = this.f120200b;
            Object[] objArr = this.f120201c;
            this.f120200b = C51342wz0.f116939a;
            this.f120201c = C51342wz0.f116941c;
            this.f120202d = 0;
            m2576e(iArr, objArr, i);
        }
        if (this.f120202d == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f120202d; i++) {
                try {
                    if (!set.contains(m2571s(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m2575f(Object obj, int i) {
        int i2 = this.f120202d;
        if (i2 == 0) {
            return -1;
        }
        int m2578b = m2578b(i);
        if (m2578b < 0) {
            return m2578b;
        }
        if (obj.equals(this.f120201c[m2578b])) {
            return m2578b;
        }
        int i3 = m2578b + 1;
        while (i3 < i2 && this.f120200b[i3] == i) {
            if (obj.equals(this.f120201c[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m2578b - 1; i4 >= 0 && this.f120200b[i4] == i; i4--) {
            if (obj.equals(this.f120201c[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: h */
    public final int m2574h() {
        int i = this.f120202d;
        if (i == 0) {
            return -1;
        }
        int m2578b = m2578b(0);
        if (m2578b < 0) {
            return m2578b;
        }
        if (this.f120201c[m2578b] == null) {
            return m2578b;
        }
        int i2 = m2578b + 1;
        while (i2 < i && this.f120200b[i2] == 0) {
            if (this.f120201c[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m2578b - 1; i3 >= 0 && this.f120200b[i3] == 0; i3--) {
            if (this.f120201c[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f120200b;
        int i = this.f120202d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m2574h() : m2575f(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f120202d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new C30705a();
    }

    /* renamed from: j */
    public boolean m2573j(C30704yo<? extends E> c30704yo) {
        int i = c30704yo.f120202d;
        int i2 = this.f120202d;
        for (int i3 = 0; i3 < i; i3++) {
            remove(c30704yo.m2571s(i3));
        }
        if (i2 == this.f120202d) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public E m2572o(int i) {
        int i2 = this.f120202d;
        Object[] objArr = this.f120201c;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f120200b;
            int i4 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i4 = i2 + (i2 >> 1);
                }
                m2579a(i4);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f120200b, 0, i);
                    System.arraycopy(objArr, 0, this.f120201c, 0, i);
                }
                if (i < i3) {
                    int i5 = i + 1;
                    int i6 = i3 - i;
                    System.arraycopy(iArr, i5, this.f120200b, i, i6);
                    System.arraycopy(objArr, i5, this.f120201c, i, i6);
                }
            } else {
                if (i < i3) {
                    int i7 = i + 1;
                    int i8 = i3 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f120201c;
                    System.arraycopy(objArr2, i7, objArr2, i, i8);
                }
                this.f120201c[i3] = null;
            }
            if (i2 == this.f120202d) {
                this.f120202d = i3;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m2572o(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f120202d - 1; i >= 0; i--) {
            if (!collection.contains(this.f120201c[i])) {
                m2572o(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public E m2571s(int i) {
        return (E) this.f120201c[i];
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f120202d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f120202d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f120201c, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f120202d * 14);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i = 0; i < this.f120202d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E m2571s = m2571s(i);
            if (m2571s != this) {
                sb.append(m2571s);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public C30704yo(int i) {
        if (i == 0) {
            this.f120200b = C51342wz0.f116939a;
            this.f120201c = C51342wz0.f116941c;
        } else {
            m2579a(i);
        }
        this.f120202d = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f120202d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f120202d));
        }
        System.arraycopy(this.f120201c, 0, tArr, 0, this.f120202d);
        int length = tArr.length;
        int i = this.f120202d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
