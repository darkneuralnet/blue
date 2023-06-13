package io.reactivex.internal.util;
/* renamed from: io.reactivex.internal.util.p */
/* loaded from: classes8.dex */
public final class C24484p<T> {

    /* renamed from: a */
    public final float f91085a;

    /* renamed from: b */
    public int f91086b;

    /* renamed from: c */
    public int f91087c;

    /* renamed from: d */
    public int f91088d;

    /* renamed from: e */
    public T[] f91089e;

    public C24484p() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    public static int m32228c(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean m32230a(T t) {
        T t2;
        T[] tArr = this.f91089e;
        int i = this.f91086b;
        int m32228c = m32228c(t.hashCode()) & i;
        T t3 = tArr[m32228c];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                m32228c = (m32228c + 1) & i;
                t2 = tArr[m32228c];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[m32228c] = t;
        int i2 = this.f91087c + 1;
        this.f91087c = i2;
        if (i2 >= this.f91088d) {
            m32227d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] m32229b() {
        return this.f91089e;
    }

    /* renamed from: d */
    public void m32227d() {
        T t;
        T[] tArr = this.f91089e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.f91087c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    t = tArr[length];
                } while (t == null);
                int m32228c = m32228c(t.hashCode()) & i2;
                if (tArr2[m32228c] != null) {
                    do {
                        m32228c = (m32228c + 1) & i2;
                    } while (tArr2[m32228c] != null);
                }
                tArr2[m32228c] = tArr[length];
                i3 = i4;
            } else {
                this.f91086b = i2;
                this.f91088d = (int) (i * this.f91085a);
                this.f91089e = tArr2;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean m32226e(T t) {
        T t2;
        T[] tArr = this.f91089e;
        int i = this.f91086b;
        int m32228c = m32228c(t.hashCode()) & i;
        T t3 = tArr[m32228c];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m32225f(m32228c, tArr, i);
        }
        do {
            m32228c = (m32228c + 1) & i;
            t2 = tArr[m32228c];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m32225f(m32228c, tArr, i);
    }

    /* renamed from: f */
    public boolean m32225f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f91087c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int m32228c = m32228c(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i < m32228c && m32228c <= i3) {
                        i4 = i3 + 1;
                    }
                } else {
                    if (i >= m32228c && m32228c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* renamed from: g */
    public int m32224g() {
        return this.f91087c;
    }

    public C24484p(int i, float f) {
        this.f91085a = f;
        int m32223a = C24485q.m32223a(i);
        this.f91086b = m32223a - 1;
        this.f91088d = (int) (f * m32223a);
        this.f91089e = (T[]) new Object[m32223a];
    }
}
