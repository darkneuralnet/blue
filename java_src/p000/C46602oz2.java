package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: oz2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46602oz2<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f102858f = new Object();

    /* renamed from: b */
    public boolean f102859b;

    /* renamed from: c */
    public long[] f102860c;

    /* renamed from: d */
    public Object[] f102861d;

    /* renamed from: e */
    public int f102862e;

    public C46602oz2() {
        this(10);
    }

    /* renamed from: d */
    public void m20200d() {
        int i = this.f102862e;
        Object[] objArr = this.f102861d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f102862e = 0;
        this.f102859b = false;
    }

    /* renamed from: e */
    public C46602oz2<E> clone() {
        try {
            C46602oz2<E> c46602oz2 = (C46602oz2) super.clone();
            c46602oz2.f102860c = (long[]) this.f102860c.clone();
            c46602oz2.f102861d = (Object[]) this.f102861d.clone();
            return c46602oz2;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public boolean m20198f(long j) {
        return m20194k(j) >= 0;
    }

    /* renamed from: g */
    public final void m20197g() {
        int i = this.f102862e;
        long[] jArr = this.f102860c;
        Object[] objArr = this.f102861d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f102858f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f102859b = false;
        this.f102862e = i2;
    }

    /* renamed from: h */
    public E m20196h(long j) {
        return m20195j(j, null);
    }

    /* renamed from: j */
    public E m20195j(long j, E e) {
        E e2;
        int m6014b = C51342wz0.m6014b(this.f102860c, this.f102862e, j);
        if (m6014b >= 0 && (e2 = (E) this.f102861d[m6014b]) != f102858f) {
            return e2;
        }
        return e;
    }

    /* renamed from: k */
    public int m20194k(long j) {
        if (this.f102859b) {
            m20197g();
        }
        return C51342wz0.m6014b(this.f102860c, this.f102862e, j);
    }

    /* renamed from: l */
    public boolean m20193l() {
        return size() == 0;
    }

    /* renamed from: m */
    public long m20192m(int i) {
        if (this.f102859b) {
            m20197g();
        }
        return this.f102860c[i];
    }

    /* renamed from: n */
    public void m20191n(long j, E e) {
        int m6014b = C51342wz0.m6014b(this.f102860c, this.f102862e, j);
        if (m6014b >= 0) {
            this.f102861d[m6014b] = e;
            return;
        }
        int i = ~m6014b;
        int i2 = this.f102862e;
        if (i < i2) {
            Object[] objArr = this.f102861d;
            if (objArr[i] == f102858f) {
                this.f102860c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f102859b && i2 >= this.f102860c.length) {
            m20197g();
            i = ~C51342wz0.m6014b(this.f102860c, this.f102862e, j);
        }
        int i3 = this.f102862e;
        if (i3 >= this.f102860c.length) {
            int m6010f = C51342wz0.m6010f(i3 + 1);
            long[] jArr = new long[m6010f];
            Object[] objArr2 = new Object[m6010f];
            long[] jArr2 = this.f102860c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f102861d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f102860c = jArr;
            this.f102861d = objArr2;
        }
        int i4 = this.f102862e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f102860c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f102861d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f102862e - i);
        }
        this.f102860c[i] = j;
        this.f102861d[i] = e;
        this.f102862e++;
    }

    /* renamed from: o */
    public void m20190o(long j) {
        int m6014b = C51342wz0.m6014b(this.f102860c, this.f102862e, j);
        if (m6014b >= 0) {
            Object[] objArr = this.f102861d;
            Object obj = objArr[m6014b];
            Object obj2 = f102858f;
            if (obj != obj2) {
                objArr[m6014b] = obj2;
                this.f102859b = true;
            }
        }
    }

    /* renamed from: p */
    public void m20189p(int i) {
        Object[] objArr = this.f102861d;
        Object obj = objArr[i];
        Object obj2 = f102858f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f102859b = true;
        }
    }

    /* renamed from: q */
    public E m20188q(int i) {
        if (this.f102859b) {
            m20197g();
        }
        return (E) this.f102861d[i];
    }

    public int size() {
        if (this.f102859b) {
            m20197g();
        }
        return this.f102862e;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f102862e * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i = 0; i < this.f102862e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m20192m(i));
            sb.append('=');
            E m20188q = m20188q(i);
            if (m20188q != this) {
                sb.append(m20188q);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public C46602oz2(int i) {
        this.f102859b = false;
        if (i == 0) {
            this.f102860c = C51342wz0.f116940b;
            this.f102861d = C51342wz0.f116941c;
            return;
        }
        int m6010f = C51342wz0.m6010f(i);
        this.f102860c = new long[m6010f];
        this.f102861d = new Object[m6010f];
    }
}
