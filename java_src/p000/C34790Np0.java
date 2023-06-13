package p000;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* renamed from: Np0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34790Np0<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: b */
    public transient Object f25217b;

    /* renamed from: c */
    public transient int[] f25218c;

    /* renamed from: d */
    public transient Object[] f25219d;

    /* renamed from: e */
    public transient int f25220e;

    /* renamed from: f */
    public transient int f25221f;

    /* renamed from: Np0$a */
    /* loaded from: classes6.dex */
    public class C5701a implements Iterator<E> {

        /* renamed from: b */
        public int f25222b;

        /* renamed from: c */
        public int f25223c;

        /* renamed from: d */
        public int f25224d = -1;

        public C5701a() {
            this.f25222b = C34790Np0.this.f25220e;
            this.f25223c = C34790Np0.this.mo89729v();
        }

        /* renamed from: a */
        public final void m93347a() {
            if (C34790Np0.this.f25220e == this.f25222b) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public void m93346b() {
            this.f25222b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25223c >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            m93347a();
            if (hasNext()) {
                int i = this.f25223c;
                this.f25224d = i;
                E e = (E) C34790Np0.this.m93351s(i);
                this.f25223c = C34790Np0.this.mo89728w(this.f25223c);
                return e;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            m93347a();
            if (this.f25224d >= 0) {
                z = true;
            } else {
                z = false;
            }
            C39948dm0.m43731d(z);
            m93346b();
            C34790Np0 c34790Np0 = C34790Np0.this;
            c34790Np0.remove(c34790Np0.m93351s(this.f25224d));
            this.f25223c = C34790Np0.this.mo89732c(this.f25223c, this.f25224d);
            this.f25224d = -1;
        }
    }

    public C34790Np0() {
        mo89727z(3);
    }

    /* renamed from: h */
    public static <E> C34790Np0<E> m93354h() {
        return new C34790Np0<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo89727z(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* renamed from: A */
    public void mo89742A(int i, E e, int i2, int i3) {
        m93358M(i, C35024Op0.m91330d(i2, 0, i3));
        m93359L(i, e);
    }

    /* renamed from: C */
    public void mo89741C(int i, int i2) {
        Object m93362H = m93362H();
        int[] m93363F = m93363F();
        Object[] m93364E = m93364E();
        int size = size() - 1;
        if (i < size) {
            Object obj = m93364E[size];
            m93364E[i] = obj;
            m93364E[size] = null;
            m93363F[i] = m93363F[size];
            m93363F[size] = 0;
            int m7051c = C50922wH1.m7051c(obj) & i2;
            int m91326h = C35024Op0.m91326h(m93362H, m7051c);
            int i3 = size + 1;
            if (m91326h == i3) {
                C35024Op0.m91325i(m93362H, m7051c, i + 1);
                return;
            }
            while (true) {
                int i4 = m91326h - 1;
                int i5 = m93363F[i4];
                int m91331c = C35024Op0.m91331c(i5, i2);
                if (m91331c == i3) {
                    m93363F[i4] = C35024Op0.m91330d(i5, i + 1, i2);
                    return;
                }
                m91326h = m91331c;
            }
        } else {
            m93364E[i] = null;
            m93363F[i] = 0;
        }
    }

    /* renamed from: D */
    public boolean m93365D() {
        return this.f25217b == null;
    }

    /* renamed from: E */
    public final Object[] m93364E() {
        Object[] objArr = this.f25219d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: F */
    public final int[] m93363F() {
        int[] iArr = this.f25218c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: H */
    public final Object m93362H() {
        Object obj = this.f25217b;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: I */
    public void mo89740I(int i) {
        this.f25218c = Arrays.copyOf(m93363F(), i);
        this.f25219d = Arrays.copyOf(m93364E(), i);
    }

    /* renamed from: J */
    public final void m93361J(int i) {
        int min;
        int length = m93363F().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            mo89740I(min);
        }
    }

    /* renamed from: K */
    public final int m93360K(int i, int i2, int i3, int i4) {
        Object m91333a = C35024Op0.m91333a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C35024Op0.m91325i(m91333a, i3 & i5, i4 + 1);
        }
        Object m93362H = m93362H();
        int[] m93363F = m93363F();
        for (int i6 = 0; i6 <= i; i6++) {
            int m91326h = C35024Op0.m91326h(m93362H, i6);
            while (m91326h != 0) {
                int i7 = m91326h - 1;
                int i8 = m93363F[i7];
                int m91332b = C35024Op0.m91332b(i8, i) | i6;
                int i9 = m91332b & i5;
                int m91326h2 = C35024Op0.m91326h(m91333a, i9);
                C35024Op0.m91325i(m91333a, i9, m91326h);
                m93363F[i7] = C35024Op0.m91330d(m91332b, m91326h2, i5);
                m91326h = C35024Op0.m91331c(i8, i);
            }
        }
        this.f25217b = m91333a;
        m93357N(i5);
        return i5;
    }

    /* renamed from: L */
    public final void m93359L(int i, E e) {
        m93364E()[i] = e;
    }

    /* renamed from: M */
    public final void m93358M(int i, int i2) {
        m93363F()[i] = i2;
    }

    /* renamed from: N */
    public final void m93357N(int i) {
        this.f25220e = C35024Op0.m91330d(this.f25220e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (m93365D()) {
            mo89731e();
        }
        Set<E> m93352o = m93352o();
        if (m93352o != null) {
            return m93352o.add(e);
        }
        int[] m93363F = m93363F();
        Object[] m93364E = m93364E();
        int i = this.f25221f;
        int i2 = i + 1;
        int m7051c = C50922wH1.m7051c(e);
        int m93349x = m93349x();
        int i3 = m7051c & m93349x;
        int m91326h = C35024Op0.m91326h(m93362H(), i3);
        if (m91326h == 0) {
            if (i2 > m93349x) {
                m93349x = m93360K(m93349x, C35024Op0.m91329e(m93349x), m7051c, i);
            } else {
                C35024Op0.m91325i(m93362H(), i3, i2);
            }
        } else {
            int m91332b = C35024Op0.m91332b(m7051c, m93349x);
            int i4 = 0;
            while (true) {
                int i5 = m91326h - 1;
                int i6 = m93363F[i5];
                if (C35024Op0.m91332b(i6, m93349x) == m91332b && C37025Xd3.m76748a(e, m93364E[i5])) {
                    return false;
                }
                int m91331c = C35024Op0.m91331c(i6, m93349x);
                i4++;
                if (m91331c == 0) {
                    if (i4 >= 9) {
                        return mo89730f().add(e);
                    }
                    if (i2 > m93349x) {
                        m93349x = m93360K(m93349x, C35024Op0.m91329e(m93349x), m7051c, i);
                    } else {
                        m93363F[i5] = C35024Op0.m91330d(i6, i2, m93349x);
                    }
                } else {
                    m91326h = m91331c;
                }
            }
        }
        m93361J(i2);
        mo89742A(i, e, m7051c, m93349x);
        this.f25221f = i2;
        m93348y();
        return true;
    }

    /* renamed from: c */
    public int mo89732c(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m93365D()) {
            return;
        }
        m93348y();
        Set<E> m93352o = m93352o();
        if (m93352o != null) {
            this.f25220e = C41344g72.m39992a(size(), 3, 1073741823);
            m93352o.clear();
            this.f25217b = null;
            this.f25221f = 0;
            return;
        }
        Arrays.fill(m93364E(), 0, this.f25221f, (Object) null);
        C35024Op0.m91327g(m93362H());
        Arrays.fill(m93363F(), 0, this.f25221f, 0);
        this.f25221f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (m93365D()) {
            return false;
        }
        Set<E> m93352o = m93352o();
        if (m93352o != null) {
            return m93352o.contains(obj);
        }
        int m7051c = C50922wH1.m7051c(obj);
        int m93349x = m93349x();
        int m91326h = C35024Op0.m91326h(m93362H(), m7051c & m93349x);
        if (m91326h == 0) {
            return false;
        }
        int m91332b = C35024Op0.m91332b(m7051c, m93349x);
        do {
            int i = m91326h - 1;
            int m93350u = m93350u(i);
            if (C35024Op0.m91332b(m93350u, m93349x) == m91332b && C37025Xd3.m76748a(obj, m93351s(i))) {
                return true;
            }
            m91326h = C35024Op0.m91331c(m93350u, m93349x);
        } while (m91326h != 0);
        return false;
    }

    /* renamed from: e */
    public int mo89731e() {
        EZ3.m108794u(m93365D(), "Arrays already allocated");
        int i = this.f25220e;
        int m91324j = C35024Op0.m91324j(i);
        this.f25217b = C35024Op0.m91333a(m91324j);
        m93357N(m91324j - 1);
        this.f25218c = new int[i];
        this.f25219d = new Object[i];
        return i;
    }

    /* renamed from: f */
    public Set<E> mo89730f() {
        Set<E> m93353j = m93353j(m93349x() + 1);
        int mo89729v = mo89729v();
        while (mo89729v >= 0) {
            m93353j.add(m93351s(mo89729v));
            mo89729v = mo89728w(mo89729v);
        }
        this.f25217b = m93353j;
        this.f25218c = null;
        this.f25219d = null;
        m93348y();
        return m93353j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> m93352o = m93352o();
        if (m93352o != null) {
            return m93352o.iterator();
        }
        return new C5701a();
    }

    /* renamed from: j */
    public final Set<E> m93353j(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    /* renamed from: o */
    public Set<E> m93352o() {
        Object obj = this.f25217b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (m93365D()) {
            return false;
        }
        Set<E> m93352o = m93352o();
        if (m93352o != null) {
            return m93352o.remove(obj);
        }
        int m93349x = m93349x();
        int m91328f = C35024Op0.m91328f(obj, null, m93349x, m93362H(), m93363F(), m93364E(), null);
        if (m91328f == -1) {
            return false;
        }
        mo89741C(m91328f, m93349x);
        this.f25221f--;
        m93348y();
        return true;
    }

    /* renamed from: s */
    public final E m93351s(int i) {
        return (E) m93364E()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> m93352o = m93352o();
        if (m93352o != null) {
            return m93352o.size();
        }
        return this.f25221f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (m93365D()) {
            return new Object[0];
        }
        Set<E> m93352o = m93352o();
        return m93352o != null ? m93352o.toArray() : Arrays.copyOf(m93364E(), this.f25221f);
    }

    /* renamed from: u */
    public final int m93350u(int i) {
        return m93363F()[i];
    }

    /* renamed from: v */
    public int mo89729v() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: w */
    public int mo89728w(int i) {
        int i2 = i + 1;
        if (i2 < this.f25221f) {
            return i2;
        }
        return -1;
    }

    /* renamed from: x */
    public final int m93349x() {
        return (1 << (this.f25220e & 31)) - 1;
    }

    /* renamed from: y */
    public void m93348y() {
        this.f25220e += 32;
    }

    /* renamed from: z */
    public void mo89727z(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108810e(z, "Expected size must be >= 0");
        this.f25220e = C41344g72.m39992a(i, 1, 1073741823);
    }

    public C34790Np0(int i) {
        mo89727z(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (m93365D()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> m93352o = m93352o();
        if (m93352o != null) {
            return (T[]) m93352o.toArray(tArr);
        }
        return (T[]) C33281Hd3.m103632j(m93364E(), 0, this.f25221f, tArr);
    }
}
