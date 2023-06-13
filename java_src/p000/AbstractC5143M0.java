package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000.InterfaceC45139mX2;
/* renamed from: M0 */
/* loaded from: classes6.dex */
public abstract class AbstractC5143M0<E> extends AbstractC9586Y0<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    public transient C33749Jd3<E> f22412d;

    /* renamed from: e */
    public transient long f22413e;

    /* renamed from: M0$a */
    /* loaded from: classes6.dex */
    public class C5144a extends AbstractC5143M0<E>.AbstractC5146c<E> {
        public C5144a() {
            super();
        }

        @Override // p000.AbstractC5143M0.AbstractC5146c
        /* renamed from: b */
        public E mo96017b(int i) {
            return AbstractC5143M0.this.f22412d.m100092f(i);
        }
    }

    /* renamed from: M0$b */
    /* loaded from: classes6.dex */
    public class C5145b extends AbstractC5143M0<E>.AbstractC5146c<InterfaceC45139mX2.InterfaceC26111a<E>> {
        public C5145b() {
            super();
        }

        @Override // p000.AbstractC5143M0.AbstractC5146c
        /* renamed from: c */
        public InterfaceC45139mX2.InterfaceC26111a<E> mo96017b(int i) {
            return AbstractC5143M0.this.f22412d.m100094d(i);
        }
    }

    /* renamed from: M0$c */
    /* loaded from: classes6.dex */
    public abstract class AbstractC5146c<T> implements Iterator<T> {

        /* renamed from: b */
        public int f22416b;

        /* renamed from: c */
        public int f22417c = -1;

        /* renamed from: d */
        public int f22418d;

        public AbstractC5146c() {
            this.f22416b = AbstractC5143M0.this.f22412d.m100096b();
            this.f22418d = AbstractC5143M0.this.f22412d.f17920d;
        }

        /* renamed from: a */
        public final void m96018a() {
            if (AbstractC5143M0.this.f22412d.f17920d == this.f22418d) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public abstract T mo96017b(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            m96018a();
            if (this.f22416b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T mo96017b = mo96017b(this.f22416b);
                int i = this.f22416b;
                this.f22417c = i;
                this.f22416b = AbstractC5143M0.this.f22412d.m100082p(i);
                return mo96017b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            AbstractC5143M0 abstractC5143M0;
            m96018a();
            if (this.f22417c != -1) {
                z = true;
            } else {
                z = false;
            }
            C39948dm0.m43731d(z);
            AbstractC5143M0.this.f22413e -= abstractC5143M0.f22412d.m100077u(this.f22417c);
            this.f22416b = AbstractC5143M0.this.f22412d.m100081q(this.f22416b, this.f22417c);
            this.f22417c = -1;
            this.f22418d = AbstractC5143M0.this.f22412d.f17920d;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int m72361c = C37630Zs5.m72361c(objectInputStream);
        this.f22412d = m96020j(3);
        C37630Zs5.m72362b(this, objectInputStream, m72361c);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C37630Zs5.m72359e(this, objectOutputStream);
    }

    @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
    /* renamed from: A2 */
    public final int mo20922A2(Object obj, int i) {
        boolean z;
        if (i == 0) {
            return mo20918d3(obj);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108809f(z, "occurrences cannot be negative: %s", i);
        int m100088j = this.f22412d.m100088j(obj);
        if (m100088j == -1) {
            return 0;
        }
        int m100090h = this.f22412d.m100090h(m100088j);
        if (m100090h > i) {
            this.f22412d.m100073y(m100088j, m100090h - i);
        } else {
            this.f22412d.m100077u(m100088j);
            i = m100090h;
        }
        this.f22413e -= i;
        return m100090h;
    }

    @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
    /* renamed from: H0 */
    public final int mo20921H0(E e, int i) {
        boolean z;
        if (i == 0) {
            return mo20918d3(e);
        }
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108809f(z, "occurrences cannot be negative: %s", i);
        int m100088j = this.f22412d.m100088j(e);
        if (m100088j == -1) {
            this.f22412d.m100080r(e, i);
            this.f22413e += i;
            return 0;
        }
        int m100090h = this.f22412d.m100090h(m100088j);
        long j = i;
        long j2 = m100090h + j;
        if (j2 > 2147483647L) {
            z2 = false;
        }
        EZ3.m108807h(z2, "too many occurrences: %s", j2);
        this.f22412d.m100073y(m100088j, (int) j2);
        this.f22413e += j;
        return m100090h;
    }

    @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
    /* renamed from: P0 */
    public final boolean mo25464P0(E e, int i, int i2) {
        C39948dm0.m43733b(i, "oldCount");
        C39948dm0.m43733b(i2, "newCount");
        int m100088j = this.f22412d.m100088j(e);
        if (m100088j == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.f22412d.m100080r(e, i2);
                this.f22413e += i2;
            }
            return true;
        } else if (this.f22412d.m100090h(m100088j) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.f22412d.m100077u(m100088j);
                this.f22413e -= i;
            } else {
                this.f22412d.m100073y(m100088j, i2);
                this.f22413e += i2 - i;
            }
            return true;
        }
    }

    @Override // p000.AbstractC9586Y0, p000.InterfaceC45139mX2
    /* renamed from: Q1 */
    public final int mo25463Q1(E e, int i) {
        int m100080r;
        C39948dm0.m43733b(i, "count");
        C33749Jd3<E> c33749Jd3 = this.f22412d;
        if (i == 0) {
            m100080r = c33749Jd3.m100079s(e);
        } else {
            m100080r = c33749Jd3.m100080r(e, i);
        }
        this.f22413e += i - m100080r;
        return m100080r;
    }

    @Override // p000.AbstractC9586Y0
    /* renamed from: c */
    public final int mo20913c() {
        return this.f22412d.m100072z();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f22412d.m100097a();
        this.f22413e = 0L;
    }

    @Override // p000.InterfaceC45139mX2
    /* renamed from: d3 */
    public final int mo20918d3(Object obj) {
        return this.f22412d.m100095c(obj);
    }

    @Override // p000.AbstractC9586Y0
    /* renamed from: e */
    public final Iterator<E> mo20917e() {
        return new C5144a();
    }

    @Override // p000.AbstractC9586Y0
    /* renamed from: f */
    public final Iterator<InterfaceC45139mX2.InterfaceC26111a<E>> mo20916f() {
        return new C5145b();
    }

    /* renamed from: h */
    public void m96021h(InterfaceC45139mX2<? super E> interfaceC45139mX2) {
        EZ3.m108801n(interfaceC45139mX2);
        int m100096b = this.f22412d.m100096b();
        while (m100096b >= 0) {
            interfaceC45139mX2.mo20921H0((E) this.f22412d.m100092f(m100096b), this.f22412d.m100090h(m100096b));
            m100096b = this.f22412d.m100082p(m100096b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.InterfaceC45139mX2
    public final Iterator<E> iterator() {
        return C46325oX2.m20930h(this);
    }

    /* renamed from: j */
    public abstract C33749Jd3<E> m96020j(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, p000.InterfaceC45139mX2
    public final int size() {
        return C41344g72.m39991b(this.f22413e);
    }
}
