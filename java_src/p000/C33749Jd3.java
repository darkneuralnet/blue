package p000;

import java.util.Arrays;
import p000.C46325oX2;
import p000.InterfaceC45139mX2;
/* renamed from: Jd3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C33749Jd3<K> {

    /* renamed from: a */
    public transient Object[] f17917a;

    /* renamed from: b */
    public transient int[] f17918b;

    /* renamed from: c */
    public transient int f17919c;

    /* renamed from: d */
    public transient int f17920d;

    /* renamed from: e */
    public transient int[] f17921e;

    /* renamed from: f */
    public transient long[] f17922f;

    /* renamed from: g */
    public transient float f17923g;

    /* renamed from: h */
    public transient int f17924h;

    /* renamed from: Jd3$a */
    /* loaded from: classes6.dex */
    public class C4170a extends C46325oX2.AbstractC26997a<K> {

        /* renamed from: b */
        public final K f17925b;

        /* renamed from: c */
        public int f17926c;

        public C4170a(int i) {
            this.f17925b = (K) C33749Jd3.this.f17917a[i];
            this.f17926c = i;
        }

        /* renamed from: a */
        public void m100071a() {
            int i = this.f17926c;
            if (i == -1 || i >= C33749Jd3.this.m100072z() || !C37025Xd3.m76748a(this.f17925b, C33749Jd3.this.f17917a[this.f17926c])) {
                this.f17926c = C33749Jd3.this.m100088j(this.f17925b);
            }
        }

        @Override // p000.InterfaceC45139mX2.InterfaceC26111a
        public int getCount() {
            m100071a();
            int i = this.f17926c;
            if (i == -1) {
                return 0;
            }
            return C33749Jd3.this.f17918b[i];
        }

        @Override // p000.InterfaceC45139mX2.InterfaceC26111a
        public K getElement() {
            return this.f17925b;
        }
    }

    public C33749Jd3() {
        m100087k(3, 1.0f);
    }

    /* renamed from: A */
    public static long m100098A(long j, int i) {
        return (j & (-4294967296L)) | (4294967295L & i);
    }

    /* renamed from: e */
    public static int m100093e(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: g */
    public static int m100091g(long j) {
        return (int) j;
    }

    /* renamed from: n */
    public static long[] m100084n(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* renamed from: o */
    public static int[] m100083o(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: a */
    public void m100097a() {
        this.f17920d++;
        Arrays.fill(this.f17917a, 0, this.f17919c, (Object) null);
        Arrays.fill(this.f17918b, 0, this.f17919c, 0);
        Arrays.fill(this.f17921e, -1);
        Arrays.fill(this.f17922f, -1L);
        this.f17919c = 0;
    }

    /* renamed from: b */
    public int m100096b() {
        return this.f17919c == 0 ? -1 : 0;
    }

    /* renamed from: c */
    public int m100095c(Object obj) {
        int m100088j = m100088j(obj);
        if (m100088j == -1) {
            return 0;
        }
        return this.f17918b[m100088j];
    }

    /* renamed from: d */
    public InterfaceC45139mX2.InterfaceC26111a<K> m100094d(int i) {
        EZ3.m108803l(i, this.f17919c);
        return new C4170a(i);
    }

    /* renamed from: f */
    public K m100092f(int i) {
        EZ3.m108803l(i, this.f17919c);
        return (K) this.f17917a[i];
    }

    /* renamed from: h */
    public int m100090h(int i) {
        EZ3.m108803l(i, this.f17919c);
        return this.f17918b[i];
    }

    /* renamed from: i */
    public final int m100089i() {
        return this.f17921e.length - 1;
    }

    /* renamed from: j */
    public int m100088j(Object obj) {
        int m7051c = C50922wH1.m7051c(obj);
        int i = this.f17921e[m100089i() & m7051c];
        while (i != -1) {
            long j = this.f17922f[i];
            if (m100093e(j) == m7051c && C37025Xd3.m76748a(obj, this.f17917a[i])) {
                return i;
            }
            i = m100091g(j);
        }
        return -1;
    }

    /* renamed from: k */
    public void m100087k(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108810e(z, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        EZ3.m108810e(z2, "Illegal load factor");
        int m7053a = C50922wH1.m7053a(i, f);
        this.f17921e = m100083o(m7053a);
        this.f17923g = f;
        this.f17917a = new Object[i];
        this.f17918b = new int[i];
        this.f17922f = m100084n(i);
        this.f17924h = Math.max(1, (int) (m7053a * f));
    }

    /* renamed from: l */
    public void m100086l(int i, K k, int i2, int i3) {
        this.f17922f[i] = (i3 << 32) | 4294967295L;
        this.f17917a[i] = k;
        this.f17918b[i] = i2;
    }

    /* renamed from: m */
    public void m100085m(int i) {
        int m100072z = m100072z() - 1;
        if (i < m100072z) {
            Object[] objArr = this.f17917a;
            objArr[i] = objArr[m100072z];
            int[] iArr = this.f17918b;
            iArr[i] = iArr[m100072z];
            objArr[m100072z] = null;
            iArr[m100072z] = 0;
            long[] jArr = this.f17922f;
            long j = jArr[m100072z];
            jArr[i] = j;
            jArr[m100072z] = -1;
            int m100093e = m100093e(j) & m100089i();
            int[] iArr2 = this.f17921e;
            int i2 = iArr2[m100093e];
            if (i2 == m100072z) {
                iArr2[m100093e] = i;
                return;
            }
            while (true) {
                long j2 = this.f17922f[i2];
                int m100091g = m100091g(j2);
                if (m100091g == m100072z) {
                    this.f17922f[i2] = m100098A(j2, i);
                    return;
                }
                i2 = m100091g;
            }
        } else {
            this.f17917a[i] = null;
            this.f17918b[i] = 0;
            this.f17922f[i] = -1;
        }
    }

    /* renamed from: p */
    public int m100082p(int i) {
        int i2 = i + 1;
        if (i2 < this.f17919c) {
            return i2;
        }
        return -1;
    }

    /* renamed from: q */
    public int m100081q(int i, int i2) {
        return i - 1;
    }

    /* renamed from: r */
    public int m100080r(K k, int i) {
        C39948dm0.m43732c(i, "count");
        long[] jArr = this.f17922f;
        Object[] objArr = this.f17917a;
        int[] iArr = this.f17918b;
        int m7051c = C50922wH1.m7051c(k);
        int m100089i = m100089i() & m7051c;
        int i2 = this.f17919c;
        int[] iArr2 = this.f17921e;
        int i3 = iArr2[m100089i];
        if (i3 == -1) {
            iArr2[m100089i] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m100093e(j) == m7051c && C37025Xd3.m76748a(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int m100091g = m100091g(j);
                if (m100091g == -1) {
                    jArr[i3] = m100098A(j, i2);
                    break;
                }
                i3 = m100091g;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            m100075w(i5);
            m100086l(i2, k, i, m7051c);
            this.f17919c = i5;
            if (i2 >= this.f17924h) {
                m100074x(this.f17921e.length * 2);
            }
            this.f17920d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: s */
    public int m100079s(Object obj) {
        return m100078t(obj, C50922wH1.m7051c(obj));
    }

    /* renamed from: t */
    public final int m100078t(Object obj, int i) {
        int m100089i = m100089i() & i;
        int i2 = this.f17921e[m100089i];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m100093e(this.f17922f[i2]) == i && C37025Xd3.m76748a(obj, this.f17917a[i2])) {
                int i4 = this.f17918b[i2];
                if (i3 == -1) {
                    this.f17921e[m100089i] = m100091g(this.f17922f[i2]);
                } else {
                    long[] jArr = this.f17922f;
                    jArr[i3] = m100098A(jArr[i3], m100091g(jArr[i2]));
                }
                m100085m(i2);
                this.f17919c--;
                this.f17920d++;
                return i4;
            }
            int m100091g = m100091g(this.f17922f[i2]);
            if (m100091g == -1) {
                return 0;
            }
            i3 = i2;
            i2 = m100091g;
        }
    }

    /* renamed from: u */
    public int m100077u(int i) {
        return m100078t(this.f17917a[i], m100093e(this.f17922f[i]));
    }

    /* renamed from: v */
    public void m100076v(int i) {
        this.f17917a = Arrays.copyOf(this.f17917a, i);
        this.f17918b = Arrays.copyOf(this.f17918b, i);
        long[] jArr = this.f17922f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f17922f = copyOf;
    }

    /* renamed from: w */
    public final void m100075w(int i) {
        int length = this.f17922f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                m100076v(max);
            }
        }
    }

    /* renamed from: x */
    public final void m100074x(int i) {
        if (this.f17921e.length >= 1073741824) {
            this.f17924h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f17923g)) + 1;
        int[] m100083o = m100083o(i);
        long[] jArr = this.f17922f;
        int length = m100083o.length - 1;
        for (int i3 = 0; i3 < this.f17919c; i3++) {
            int m100093e = m100093e(jArr[i3]);
            int i4 = m100093e & length;
            int i5 = m100083o[i4];
            m100083o[i4] = i3;
            jArr[i3] = (m100093e << 32) | (i5 & 4294967295L);
        }
        this.f17924h = i2;
        this.f17921e = m100083o;
    }

    /* renamed from: y */
    public void m100073y(int i, int i2) {
        EZ3.m108803l(i, this.f17919c);
        this.f17918b[i] = i2;
    }

    /* renamed from: z */
    public int m100072z() {
        return this.f17919c;
    }
}
