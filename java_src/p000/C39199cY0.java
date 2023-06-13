package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: cY0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39199cY0 implements InterfaceC48754sd3 {

    /* renamed from: cY0$a */
    /* loaded from: classes8.dex */
    public enum EnumC13591a {
        BYTE_BOXED(true, Byte.class, (byte) 1, (byte) 0),
        SHORT_BOXED(true, Short.class, (short) 1, (short) 0),
        INTEGER_BOXED(true, Integer.class, 1, 0),
        INTEGER_ATOMIC(true, AtomicInteger.class, 1, 0),
        LONG_BOXED(true, Long.class, 1L, 0L),
        LONG_ATOMIC(true, AtomicLong.class, 1L, 0),
        BIG_INTEGER(true, BigInteger.class, BigInteger.ONE, BigInteger.ZERO),
        RATIONAL(false, C47670qn4.class, C47670qn4.f105800m, C47670qn4.f105799l),
        FLOAT_BOXED(false, Float.class, Float.valueOf(1.0f), Float.valueOf(0.0f)),
        DOUBLE_BOXED(false, Double.class, Double.valueOf(1.0d), Double.valueOf(0.0d)),
        BIG_DECIMAL(false, BigDecimal.class, BigDecimal.ONE, BigDecimal.ZERO);
        

        /* renamed from: b */
        public final boolean f60854b;

        /* renamed from: c */
        public final Class<? extends Number> f60855c;

        /* renamed from: d */
        public final Number f60856d;

        /* renamed from: e */
        public final Number f60857e;

        EnumC13591a(boolean z, Class cls, Number number, Number number2) {
            this.f60854b = z;
            this.f60855c = cls;
            this.f60856d = number;
            this.f60857e = number2;
        }

        /* renamed from: d */
        public static EnumC13591a m61238d(Number number) {
            if (number instanceof Long) {
                return LONG_BOXED;
            }
            if (number instanceof AtomicLong) {
                return LONG_ATOMIC;
            }
            if (number instanceof Integer) {
                return INTEGER_BOXED;
            }
            if (number instanceof AtomicInteger) {
                return INTEGER_ATOMIC;
            }
            if (number instanceof Double) {
                return DOUBLE_BOXED;
            }
            if (number instanceof Short) {
                return SHORT_BOXED;
            }
            if (number instanceof Byte) {
                return BYTE_BOXED;
            }
            if (number instanceof Float) {
                return FLOAT_BOXED;
            }
            if (number instanceof BigDecimal) {
                return BIG_DECIMAL;
            }
            if (number instanceof BigInteger) {
                return BIG_INTEGER;
            }
            if (number instanceof C47670qn4) {
                return RATIONAL;
            }
            throw new IllegalArgumentException(String.format("Unsupported number type '%s'", number.getClass().getName()));
        }

        /* renamed from: c */
        public boolean m61239c() {
            return this.f60854b;
        }
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: a */
    public boolean mo13934a(Number number) {
        if (mo13933b(EnumC13591a.m61238d(number).f60856d, number) == 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: b */
    public int mo13933b(Number number, Number number2) {
        boolean z;
        EnumC13591a m61238d = EnumC13591a.m61238d(number);
        EnumC13591a m61238d2 = EnumC13591a.m61238d(number2);
        if (m61238d2.ordinal() > m61238d.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -m61249n(m61238d2, number2, m61238d, number);
        }
        return m61249n(m61238d, number, m61238d2, number2);
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: c */
    public boolean mo13932c(Number number) {
        return m61247p(EnumC13591a.m61238d(number), number);
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: d */
    public Number mo13931d(Number number) {
        if (!(number instanceof Integer) && !(number instanceof AtomicInteger) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (!(number instanceof Double) && !(number instanceof Float)) {
                if (m61246q(number)) {
                    int m61250m = m61250m(number);
                    if (m61250m < 31) {
                        return Integer.valueOf(number.intValue());
                    }
                    if (m61250m < 63) {
                        return Long.valueOf(number.longValue());
                    }
                    return number;
                } else if (number instanceof BigDecimal) {
                    try {
                        return mo13931d(((BigDecimal) number).toBigIntegerExact());
                    } catch (ArithmeticException unused) {
                        return number;
                    }
                } else if (number instanceof C47670qn4) {
                    C47670qn4 c47670qn4 = (C47670qn4) number;
                    if (c47670qn4.m17066g()) {
                        return mo13931d(c47670qn4.m17068e());
                    }
                    return number;
                } else {
                    return number;
                }
            }
            double doubleValue = number.doubleValue();
            if (Double.isFinite(doubleValue)) {
                if (doubleValue % 1.0d == 0.0d) {
                    return mo13931d(BigDecimal.valueOf(doubleValue));
                }
                return number;
            }
            throw m61242u(Double.valueOf(doubleValue));
        }
        return number;
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: e */
    public boolean mo13930e(Number number) {
        if (mo13933b(EnumC13591a.m61238d(number).f60857e, number) == 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: f */
    public Number mo13929f(Number number) {
        if (m61246q(number)) {
            return C47670qn4.m17060m(BigInteger.ONE, m61248o(number));
        }
        if (number instanceof BigDecimal) {
            return C47670qn4.m17061l((BigDecimal) number).m17056q();
        }
        if (number instanceof C47670qn4) {
            return ((C47670qn4) number).m17056q();
        }
        if (number instanceof Double) {
            return C47670qn4.m17063j(((Double) number).doubleValue()).m17056q();
        }
        if (number instanceof Float) {
            return C47670qn4.m17063j(number.doubleValue()).m17056q();
        }
        throw m61243t(number);
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: g */
    public Number mo13928g(Number number, Number number2) {
        boolean z;
        EnumC13591a m61238d = EnumC13591a.m61238d(number);
        EnumC13591a m61238d2 = EnumC13591a.m61238d(number2);
        if (m61238d2.ordinal() > m61238d.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m61251l(m61238d2, number2, m61238d, number);
        }
        return m61251l(m61238d, number, m61238d2, number2);
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: h */
    public Number mo13927h(Number number) {
        if (number instanceof BigInteger) {
            return ((BigInteger) number).abs();
        }
        if (number instanceof BigDecimal) {
            return ((BigDecimal) number).abs();
        }
        if (number instanceof C47670qn4) {
            return ((C47670qn4) number).m17072a();
        }
        if (number instanceof Double) {
            return Double.valueOf(Math.abs(((Double) number).doubleValue()));
        }
        if (number instanceof Float) {
            return Float.valueOf(Math.abs(((Float) number).floatValue()));
        }
        if (!(number instanceof Long) && !(number instanceof AtomicLong)) {
            if (!(number instanceof Integer) && !(number instanceof AtomicInteger)) {
                if ((number instanceof Short) || (number instanceof Byte)) {
                    Math.abs(number.intValue());
                }
                throw m61243t(number);
            }
            int intValue = number.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return Long.valueOf(Math.abs(number.longValue()));
            }
            return Integer.valueOf(Math.abs(intValue));
        }
        long longValue = number.longValue();
        if (longValue == Long.MIN_VALUE) {
            return BigInteger.valueOf(longValue).abs();
        }
        return Long.valueOf(Math.abs(longValue));
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: i */
    public int mo13926i(Number number) {
        if (number instanceof BigInteger) {
            return ((BigInteger) number).signum();
        }
        if (number instanceof BigDecimal) {
            return ((BigDecimal) number).signum();
        }
        if (number instanceof C47670qn4) {
            return ((C47670qn4) number).m17055r();
        }
        if (number instanceof Double) {
            return (int) Math.signum(((Double) number).doubleValue());
        }
        if (number instanceof Float) {
            return (int) Math.signum(((Float) number).floatValue());
        }
        if (!(number instanceof Long) && !(number instanceof AtomicLong)) {
            if (!(number instanceof Integer) && !(number instanceof AtomicInteger) && !(number instanceof Short) && !(number instanceof Byte)) {
                throw m61243t(number);
            }
            return Integer.signum(number.intValue());
        }
        return Long.signum(number.longValue());
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: j */
    public Number mo13925j(Number number) {
        if (number instanceof BigInteger) {
            return ((BigInteger) number).negate();
        }
        if (number instanceof BigDecimal) {
            return ((BigDecimal) number).negate();
        }
        if (number instanceof C47670qn4) {
            return ((C47670qn4) number).m17064i();
        }
        if (number instanceof Double) {
            return Double.valueOf(-((Double) number).doubleValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(-((Float) number).floatValue());
        }
        if (!(number instanceof Long) && !(number instanceof AtomicLong)) {
            if (!(number instanceof Integer) && !(number instanceof AtomicInteger)) {
                if (number instanceof Short) {
                    short shortValue = ((Short) number).shortValue();
                    if (shortValue == Short.MIN_VALUE) {
                        return Integer.valueOf(-number.intValue());
                    }
                    return Integer.valueOf(-shortValue);
                } else if (number instanceof Byte) {
                    short byteValue = ((Byte) number).byteValue();
                    if (byteValue == -128) {
                        return Integer.valueOf(-number.intValue());
                    }
                    return Integer.valueOf(-byteValue);
                } else {
                    throw m61243t(number);
                }
            }
            int intValue = number.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return Long.valueOf(-number.longValue());
            }
            return Integer.valueOf(-intValue);
        }
        long longValue = number.longValue();
        if (longValue == Long.MIN_VALUE) {
            return BigInteger.valueOf(longValue).negate();
        }
        return Long.valueOf(-longValue);
    }

    @Override // p000.InterfaceC48754sd3
    /* renamed from: k */
    public Number mo13924k(Number number, int i) {
        if (i == 0) {
            if (!mo13930e(number)) {
                return 1;
            }
            throw new ArithmeticException("0^0 is not defined");
        } else if (i == 1) {
            return number;
        } else {
            if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof AtomicLong) && !(number instanceof Integer) && !(number instanceof AtomicInteger) && !(number instanceof Short) && !(number instanceof Byte)) {
                if (number instanceof BigDecimal) {
                    return ((BigDecimal) number).pow(i, C49060t80.f109904c);
                }
                if (number instanceof C47670qn4) {
                    ((C47670qn4) number).m17057p(i);
                }
                if (!(number instanceof Double) && !(number instanceof Float)) {
                    throw m61243t(number);
                }
                return m61245r(number).pow(i, C49060t80.f109904c);
            }
            BigInteger m61248o = m61248o(number);
            if (i > 0) {
                return m61248o.pow(i);
            }
            return C47670qn4.m17058o(m61248o).m17057p(i);
        }
    }

    /* renamed from: l */
    public final Number m61251l(EnumC13591a enumC13591a, Number number, EnumC13591a enumC13591a2, Number number2) {
        if (enumC13591a.m61239c()) {
            if (number instanceof BigInteger) {
                return ((BigInteger) number).add(m61248o(number2));
            }
            if (Math.max(m61250m(number), m61250m(number2)) + 1 < 63) {
                return Long.valueOf(number.longValue() + number2.longValue());
            }
            return m61248o(number).add(m61248o(number2));
        } else if (number instanceof C47670qn4) {
            if (number2 instanceof C47670qn4) {
                return ((C47670qn4) number).m17071b((C47670qn4) number2);
            }
            return ((C47670qn4) number).m17071b(C47670qn4.m17058o(m61248o(number2)));
        } else if (number instanceof BigDecimal) {
            if (number2 instanceof BigDecimal) {
                return ((BigDecimal) number).add((BigDecimal) number2, C49060t80.f109904c);
            }
            if (!(number2 instanceof Double) && !(number2 instanceof Float)) {
                if (number2 instanceof C47670qn4) {
                    return ((BigDecimal) number).add(((C47670qn4) number2).m17070c());
                }
                return ((BigDecimal) number).add(BigDecimal.valueOf(number2.longValue()));
            }
            return ((BigDecimal) number).add(BigDecimal.valueOf(number2.doubleValue()), C49060t80.f109904c);
        } else if (!(number2 instanceof Double) && !(number2 instanceof Float)) {
            if (number2 instanceof C47670qn4) {
                return BigDecimal.valueOf(number.doubleValue()).add(((C47670qn4) number2).m17070c());
            }
            if (number2 instanceof BigInteger) {
                return BigDecimal.valueOf(number.doubleValue()).add(new BigDecimal((BigInteger) number2));
            }
            return BigDecimal.valueOf(number.doubleValue()).add(BigDecimal.valueOf(number2.longValue()));
        } else {
            return BigDecimal.valueOf(number.doubleValue()).add(BigDecimal.valueOf(number2.doubleValue()));
        }
    }

    /* renamed from: m */
    public final int m61250m(Number number) {
        if (number instanceof BigInteger) {
            return ((BigInteger) number).bitLength();
        }
        long longValue = number.longValue();
        if (longValue == Long.MIN_VALUE) {
            return 63;
        }
        return 64 - Long.numberOfLeadingZeros(Math.abs(longValue));
    }

    /* renamed from: n */
    public final int m61249n(EnumC13591a enumC13591a, Number number, EnumC13591a enumC13591a2, Number number2) {
        if (enumC13591a.m61239c()) {
            if (number instanceof BigInteger) {
                return ((BigInteger) number).compareTo(m61248o(number2));
            }
            return Long.compare(number.longValue(), number2.longValue());
        } else if (number instanceof C47670qn4) {
            if (number2 instanceof C47670qn4) {
                return ((C47670qn4) number).m17069d((C47670qn4) number2);
            }
            return ((C47670qn4) number).m17069d(C47670qn4.m17058o(m61248o(number2)));
        } else if (number instanceof BigDecimal) {
            if (number2 instanceof BigDecimal) {
                return ((BigDecimal) number).compareTo((BigDecimal) number2);
            }
            if (!(number2 instanceof Double) && !(number2 instanceof Float)) {
                if (number2 instanceof C47670qn4) {
                    return ((BigDecimal) number).compareTo(((C47670qn4) number2).m17070c());
                }
                return ((BigDecimal) number).compareTo(BigDecimal.valueOf(number2.longValue()));
            }
            return ((BigDecimal) number).compareTo(BigDecimal.valueOf(number2.doubleValue()));
        } else if (!(number2 instanceof Double) && !(number2 instanceof Float)) {
            if (number2 instanceof C47670qn4) {
                return BigDecimal.valueOf(number.doubleValue()).compareTo(((C47670qn4) number2).m17070c());
            }
            if (number2 instanceof BigInteger) {
                return BigDecimal.valueOf(number.doubleValue()).compareTo(new BigDecimal((BigInteger) number2));
            }
            return BigDecimal.valueOf(number.doubleValue()).compareTo(BigDecimal.valueOf(number2.longValue()));
        } else {
            return Double.compare(number.doubleValue(), number2.doubleValue());
        }
    }

    /* renamed from: o */
    public final BigInteger m61248o(Number number) {
        if (number instanceof BigInteger) {
            return (BigInteger) number;
        }
        return BigInteger.valueOf(number.longValue());
    }

    /* renamed from: p */
    public final boolean m61247p(EnumC13591a enumC13591a, Number number) {
        if (enumC13591a.m61239c()) {
            return true;
        }
        if (number instanceof C47670qn4) {
            return ((C47670qn4) number).m17066g();
        }
        if (number instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) number;
            if (bigDecimal.scale() <= 0) {
                return true;
            }
            try {
                bigDecimal.toBigIntegerExact();
                return true;
            } catch (ArithmeticException unused) {
                return false;
            }
        } else if (!(number instanceof Double) && !(number instanceof Float)) {
            throw m61243t(number);
        } else {
            if (number.doubleValue() % 1.0d == 0.0d) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m61246q(Number number) {
        return EnumC13591a.m61238d(number).m61239c();
    }

    /* renamed from: r */
    public final BigDecimal m61245r(Number number) {
        if (number instanceof BigDecimal) {
            return (BigDecimal) number;
        }
        if (number instanceof BigInteger) {
            return new BigDecimal((BigInteger) number);
        }
        if (!(number instanceof Long) && !(number instanceof AtomicLong) && !(number instanceof Integer) && !(number instanceof AtomicInteger) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (!(number instanceof Double) && !(number instanceof Float)) {
                if (number instanceof C47670qn4) {
                    throw m61244s();
                }
                throw m61243t(number);
            }
            return BigDecimal.valueOf(number.doubleValue());
        }
        return BigDecimal.valueOf(number.longValue());
    }

    /* renamed from: s */
    public final IllegalStateException m61244s() {
        return new IllegalStateException(String.format("Implementation Error: Code was reached that is expected unreachable", new Object[0]));
    }

    /* renamed from: t */
    public final IllegalArgumentException m61243t(Number number) {
        return new IllegalArgumentException(String.format("Unsupported number type '%s' in number system '%s'", number.getClass().getName(), getClass().getName()));
    }

    /* renamed from: u */
    public final IllegalArgumentException m61242u(Number number) {
        return new IllegalArgumentException(String.format("Unsupported number value '%s' of type '%s' in number system '%s'", "" + number, number.getClass(), getClass().getName()));
    }
}
