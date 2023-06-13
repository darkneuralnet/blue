package p000;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.AbstractC26779o0;
import p000.C49060t80;
/* renamed from: t80  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49060t80 {

    /* renamed from: a */
    public static final Logger f109902a = Logger.getLogger(C49060t80.class.getName());

    /* renamed from: b */
    public static final MathContext f109903b;

    /* renamed from: c */
    public static MathContext f109904c;

    /* renamed from: d */
    public static InterfaceC48754sd3 f109905d;

    /* renamed from: e */
    public static final Map<Integer, BigDecimal> f109906e;

    /* renamed from: f */
    public static final Map<Class<? extends AbstractC26779o0>, Integer> f109907f;

    /* renamed from: t80$a */
    /* loaded from: classes8.dex */
    public static final class C28533a {

        /* renamed from: a */
        public static final BigDecimal f109908a = new BigDecimal("2");

        /* renamed from: b */
        public static final BigDecimal f109909b = new BigDecimal("3");

        /* renamed from: c */
        public static final BigDecimal f109910c = new BigDecimal("4");

        /* renamed from: d */
        public static final BigDecimal f109911d = new BigDecimal("5");

        /* renamed from: e */
        public static final BigDecimal f109912e = new BigDecimal("239");

        private C28533a() {
        }

        /* renamed from: c */
        public static BigDecimal m13019c(final BigDecimal bigDecimal, int i) {
            BigDecimal divide = BigDecimal.ONE.setScale(i, RoundingMode.DOWN).divide(bigDecimal, RoundingMode.DOWN);
            BigDecimal bigDecimal2 = new BigDecimal(divide.toString());
            final BigDecimal scaleByPowerOfTen = BigDecimal.ONE.scaleByPowerOfTen(-i);
            C49060t80.f109902a.log(Level.FINER, new Supplier() { // from class: s80
                @Override // java.util.function.Supplier
                public final Object get() {
                    String m13018d;
                    m13018d = C49060t80.C28533a.m13018d(bigDecimal, scaleByPowerOfTen);
                    return m13018d;
                }
            });
            BigDecimal bigDecimal3 = f109909b;
            BigDecimal bigDecimal4 = null;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if ((bigDecimal4 == null || !bigDecimal4.equals(BigDecimal.ZERO)) && (bigDecimal4 == null || bigDecimal4.compareTo(scaleByPowerOfTen) >= 0)) {
                    bigDecimal2 = bigDecimal2.divide(bigDecimal.pow(2), RoundingMode.DOWN);
                    bigDecimal4 = bigDecimal2.divide(bigDecimal3, RoundingMode.DOWN);
                    if (z) {
                        divide = divide.add(bigDecimal4);
                    } else {
                        divide = divide.subtract(bigDecimal4);
                    }
                    z = !z;
                    Logger logger = C49060t80.f109902a;
                    Level level = Level.FINEST;
                    if (logger.isLoggable(level)) {
                        C49060t80.f109902a.log(level, "arccot: term=" + bigDecimal4);
                    }
                    i2++;
                    bigDecimal3 = bigDecimal3.add(f109908a);
                }
            }
            if (C49060t80.f109902a.isLoggable(Level.FINEST)) {
                C49060t80.f109902a.log(Level.FINER, "arccot: done. nTerms=" + i2);
            }
            return divide;
        }

        /* renamed from: d */
        public static /* synthetic */ String m13018d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return "arccot: ARGUMENT=" + bigDecimal + " (nearZero=" + bigDecimal2 + ")";
        }

        /* renamed from: e */
        public static /* synthetic */ BigDecimal m13017e(int i, Integer num) {
            int i2 = i + 10;
            BigDecimal bigDecimal = f109910c;
            return bigDecimal.multiply(bigDecimal.multiply(m13019c(f109911d, i2)).subtract(m13019c(f109912e, i2))).setScale(i, RoundingMode.DOWN);
        }

        /* renamed from: f */
        public static BigDecimal m13016f(final int i) {
            if (i > 0) {
                return (BigDecimal) C49060t80.f109906e.computeIfAbsent(Integer.valueOf(i), new Function() { // from class: r80
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        BigDecimal m13017e;
                        m13017e = C49060t80.C28533a.m13017e(i, (Integer) obj);
                        return m13017e;
                    }
                });
            }
            throw new IllegalArgumentException("numDigits is required to be greater than zero");
        }
    }

    static {
        MathContext mathContext = MathContext.DECIMAL128;
        f109903b = mathContext;
        f109904c = mathContext;
        f109906e = new HashMap();
        f109907f = new HashMap(9);
    }

    /* renamed from: c */
    public static InterfaceC48754sd3 m13024c() {
        if (f109905d == null) {
            f109905d = m13022e("tech.units.indriya.function.DefaultNumberSystem");
        }
        return f109905d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static Map<Class<? extends AbstractC26779o0>, Integer> m13023d() {
        Map<Class<? extends AbstractC26779o0>, Integer> map = f109907f;
        synchronized (map) {
            if (map.isEmpty()) {
                map.put(AbstractC26779o0.f101189c.getClass(), 0);
                map.put(UY3.class, 1);
                map.put(C47077pn4.class, 2);
                map.put(VY3.class, 3);
                map.put(Y51.class, 4);
                map.put(C26407n7.class, 5);
                map.put(C44803lx2.class, 6);
                map.put(C42873ii1.class, 7);
                map.put(AbstractC26779o0.C26782c.class, 99);
            }
        }
        return Collections.unmodifiableMap(map);
    }

    /* renamed from: e */
    public static InterfaceC48754sd3 m13022e(String str) {
        Iterator it = ServiceLoader.load(InterfaceC48754sd3.class).iterator();
        while (it.hasNext()) {
            InterfaceC48754sd3 interfaceC48754sd3 = (InterfaceC48754sd3) it.next();
            if (str.equals(interfaceC48754sd3.getClass().getName())) {
                return interfaceC48754sd3;
            }
        }
        throw new IllegalArgumentException("NumberSystem " + str + " not found");
    }
}
