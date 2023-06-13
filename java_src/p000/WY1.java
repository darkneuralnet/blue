package p000;

import java.io.Serializable;
import java.util.Arrays;
import okhttp3.HttpUrl;
/* renamed from: WY1 */
/* loaded from: classes6.dex */
public final class WY1 implements Serializable {

    /* renamed from: e */
    public static final WY1 f41264e = new WY1(new long[0]);

    /* renamed from: b */
    public final long[] f41265b;

    /* renamed from: c */
    public final transient int f41266c;

    /* renamed from: d */
    public final int f41267d;

    /* renamed from: WY1$b */
    /* loaded from: classes6.dex */
    public static final class C9083b {

        /* renamed from: a */
        public long[] f41268a;

        /* renamed from: b */
        public int f41269b = 0;

        public C9083b(int i) {
            this.f41268a = new long[i];
        }

        /* renamed from: d */
        public static int m78229d(int i, int i2) {
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
        public C9083b m78232a(long j) {
            m78230c(1);
            long[] jArr = this.f41268a;
            int i = this.f41269b;
            jArr[i] = j;
            this.f41269b = i + 1;
            return this;
        }

        /* renamed from: b */
        public WY1 m78231b() {
            return this.f41269b == 0 ? WY1.f41264e : new WY1(this.f41268a, 0, this.f41269b);
        }

        /* renamed from: c */
        public final void m78230c(int i) {
            int i2 = this.f41269b + i;
            long[] jArr = this.f41268a;
            if (i2 > jArr.length) {
                this.f41268a = Arrays.copyOf(jArr, m78229d(jArr.length, i2));
            }
        }
    }

    /* renamed from: b */
    public static C9083b m78239b() {
        return new C9083b(10);
    }

    /* renamed from: c */
    public long m78238c(int i) {
        EZ3.m108803l(i, m78235f());
        return this.f41265b[this.f41266c + i];
    }

    /* renamed from: d */
    public boolean m78237d() {
        return this.f41267d == this.f41266c;
    }

    /* renamed from: e */
    public final boolean m78236e() {
        return this.f41266c > 0 || this.f41267d < this.f41265b.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WY1)) {
            return false;
        }
        WY1 wy1 = (WY1) obj;
        if (m78235f() != wy1.m78235f()) {
            return false;
        }
        for (int i = 0; i < m78235f(); i++) {
            if (m78238c(i) != wy1.m78238c(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public int m78235f() {
        return this.f41267d - this.f41266c;
    }

    /* renamed from: g */
    public long[] m78234g() {
        return Arrays.copyOfRange(this.f41265b, this.f41266c, this.f41267d);
    }

    /* renamed from: h */
    public WY1 m78233h() {
        return m78236e() ? new WY1(m78234g()) : this;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.f41266c; i2 < this.f41267d; i2++) {
            i = (i * 31) + HC2.m104178b(this.f41265b[i2]);
        }
        return i;
    }

    public Object readResolve() {
        return m78237d() ? f41264e : this;
    }

    public String toString() {
        if (m78237d()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(m78235f() * 5);
        sb.append('[');
        sb.append(this.f41265b[this.f41266c]);
        int i = this.f41266c;
        while (true) {
            i++;
            if (i < this.f41267d) {
                sb.append(", ");
                sb.append(this.f41265b[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public Object writeReplace() {
        return m78233h();
    }

    public WY1(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public WY1(long[] jArr, int i, int i2) {
        this.f41265b = jArr;
        this.f41266c = i;
        this.f41267d = i2;
    }
}
