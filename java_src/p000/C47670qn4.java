package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
/* renamed from: qn4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47670qn4 extends Number {

    /* renamed from: k */
    public static char f105798k = 247;

    /* renamed from: l */
    public static final C47670qn4 f105799l = m17058o(BigInteger.ZERO);

    /* renamed from: m */
    public static final C47670qn4 f105800m = m17058o(BigInteger.ONE);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final Object f105801b = new Object[0];

    /* renamed from: c */
    public final Object f105802c = new Object[0];

    /* renamed from: d */
    public final int f105803d;

    /* renamed from: e */
    public final BigInteger f105804e;

    /* renamed from: f */
    public final BigInteger f105805f;

    /* renamed from: g */
    public final int f105806g;

    /* renamed from: h */
    public final boolean f105807h;

    /* renamed from: i */
    public transient BigDecimal f105808i;

    /* renamed from: j */
    public transient Long f105809j;

    public C47670qn4(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f105803d = i;
        this.f105804e = bigInteger;
        this.f105805f = bigInteger2;
        this.f105806g = Objects.hash(Integer.valueOf(i), bigInteger, bigInteger2);
        this.f105807h = BigInteger.ONE.equals(bigInteger2);
    }

    /* renamed from: j */
    public static C47670qn4 m17063j(double d) {
        return m17061l(BigDecimal.valueOf(d));
    }

    /* renamed from: k */
    public static C47670qn4 m17062k(long j, long j2) {
        return m17060m(BigInteger.valueOf(j), BigInteger.valueOf(j2));
    }

    /* renamed from: l */
    public static C47670qn4 m17061l(BigDecimal bigDecimal) {
        Objects.requireNonNull(bigDecimal);
        int scale = bigDecimal.scale();
        if (scale <= 0) {
            return m17058o(bigDecimal.toBigIntegerExact());
        }
        return m17060m(bigDecimal.unscaledValue(), BigInteger.TEN.pow(scale));
    }

    /* renamed from: m */
    public static C47670qn4 m17060m(BigInteger bigInteger, BigInteger bigInteger2) {
        Objects.requireNonNull(bigInteger);
        Objects.requireNonNull(bigInteger2);
        if (BigInteger.ONE.equals(bigInteger2)) {
            return m17058o(bigInteger);
        }
        if (!BigInteger.ZERO.equals(bigInteger2)) {
            int signum = bigInteger.signum() * bigInteger2.signum();
            if (signum == 0) {
                return f105799l;
            }
            BigInteger abs = bigInteger.abs();
            BigInteger abs2 = bigInteger2.abs();
            BigInteger gcd = abs.gcd(abs2);
            return new C47670qn4(signum, abs.divide(gcd), abs2.divide(gcd));
        }
        throw new IllegalArgumentException("cannot initalize a rational number with divisor equal to ZERO");
    }

    /* renamed from: n */
    public static C47670qn4 m17059n(long j) {
        return m17058o(BigInteger.valueOf(j));
    }

    /* renamed from: o */
    public static C47670qn4 m17058o(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger);
        return new C47670qn4(bigInteger.signum(), bigInteger.abs(), BigInteger.ONE);
    }

    /* renamed from: a */
    public C47670qn4 m17072a() {
        return this.f105803d < 0 ? new C47670qn4(1, this.f105804e, this.f105805f) : this;
    }

    /* renamed from: b */
    public C47670qn4 m17071b(C47670qn4 c47670qn4) {
        BigInteger bigInteger = this.f105804e;
        BigInteger bigInteger2 = this.f105805f;
        BigInteger bigInteger3 = c47670qn4.f105804e;
        BigInteger bigInteger4 = c47670qn4.f105805f;
        if (this.f105803d < 0) {
            bigInteger = bigInteger.negate();
        }
        if (c47670qn4.f105803d < 0) {
            bigInteger3 = bigInteger3.negate();
        }
        return m17060m(bigInteger.multiply(bigInteger4).add(bigInteger2.multiply(bigInteger3)), bigInteger2.multiply(bigInteger4));
    }

    /* renamed from: c */
    public BigDecimal m17070c() {
        synchronized (this.f105801b) {
            if (this.f105808i == null) {
                BigDecimal divide = new BigDecimal(this.f105804e).divide(new BigDecimal(this.f105805f), C49060t80.f109904c);
                this.f105808i = divide;
                if (this.f105803d < 0) {
                    this.f105808i = divide.negate();
                }
            }
        }
        return this.f105808i;
    }

    /* renamed from: d */
    public int m17069d(C47670qn4 c47670qn4) {
        int compare = Integer.compare(this.f105803d, c47670qn4.f105803d);
        if (compare != 0) {
            return compare;
        }
        if (compare == 0 && this.f105803d == 0) {
            return 0;
        }
        int compareTo = this.f105804e.multiply(c47670qn4.f105805f).compareTo(this.f105805f.multiply(c47670qn4.f105804e));
        if (this.f105803d <= 0) {
            return -compareTo;
        }
        return compareTo;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return m17070c().doubleValue();
    }

    /* renamed from: e */
    public BigInteger m17068e() {
        return this.f105803d < 0 ? this.f105804e.negate() : this.f105804e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C47670qn4)) {
            return false;
        }
        return Objects.equals(m17070c(), ((C47670qn4) obj).m17070c());
    }

    /* renamed from: f */
    public BigInteger m17067f() {
        return this.f105805f;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    /* renamed from: g */
    public boolean m17066g() {
        return this.f105807h;
    }

    /* renamed from: h */
    public final String m17065h(boolean z, char c) {
        if (this.f105803d == 0) {
            return "0";
        }
        if (this.f105807h) {
            return m17068e().toString();
        }
        if (z) {
            return m17068e().toString() + c + this.f105805f;
        }
        return String.valueOf(m17070c());
    }

    public int hashCode() {
        return this.f105806g;
    }

    /* renamed from: i */
    public C47670qn4 m17064i() {
        return new C47670qn4(-this.f105803d, this.f105804e, this.f105805f);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) longValue();
    }

    @Override // java.lang.Number
    public long longValue() {
        long longValue;
        synchronized (this.f105802c) {
            if (this.f105809j == null) {
                if (m17055r() < 0) {
                    longValue = this.f105804e.negate().divide(this.f105805f).longValue();
                } else {
                    longValue = this.f105804e.divide(this.f105805f).longValue();
                }
                this.f105809j = Long.valueOf(longValue);
            }
        }
        return this.f105809j.longValue();
    }

    /* renamed from: p */
    public C47670qn4 m17057p(int i) {
        boolean z;
        if (i == 0) {
            if (this.f105803d != 0) {
                return f105800m;
            }
            throw new ArithmeticException("0^0 is not defined");
        }
        int i2 = this.f105803d;
        if (i2 == 0) {
            return f105799l;
        }
        int i3 = 1;
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 < 0 && !z) {
            i3 = -1;
        }
        if (i > 0) {
            return new C47670qn4(i3, this.f105804e.pow(i), this.f105805f.pow(i));
        }
        return new C47670qn4(i3, this.f105805f.pow(i), this.f105804e.pow(i));
    }

    /* renamed from: q */
    public C47670qn4 m17056q() {
        return new C47670qn4(this.f105803d, this.f105805f, this.f105804e);
    }

    /* renamed from: r */
    public int m17055r() {
        return this.f105803d;
    }

    /* renamed from: s */
    public String m17054s(char c) {
        return m17065h(true, c);
    }

    public String toString() {
        return m17065h(false, f105798k);
    }
}
