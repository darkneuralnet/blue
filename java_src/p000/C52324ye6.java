package p000;

import com.stripe.android.model.PaymentMethod;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: ye6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52324ye6 {

    /* renamed from: a */
    public static final Unsafe f119906a = m3104D();

    /* renamed from: b */
    public static final Class<?> f119907b = C22700hb.m36174b();

    /* renamed from: c */
    public static final boolean f119908c = m3073o(Long.TYPE);

    /* renamed from: d */
    public static final boolean f119909d = m3073o(Integer.TYPE);

    /* renamed from: e */
    public static final AbstractC30652e f119910e = m3106B();

    /* renamed from: f */
    public static final boolean f119911f = m3088T();

    /* renamed from: g */
    public static final boolean f119912g = m3089S();

    /* renamed from: h */
    public static final long f119913h;

    /* renamed from: i */
    public static final long f119914i;

    /* renamed from: j */
    public static final long f119915j;

    /* renamed from: k */
    public static final long f119916k;

    /* renamed from: l */
    public static final long f119917l;

    /* renamed from: m */
    public static final long f119918m;

    /* renamed from: n */
    public static final long f119919n;

    /* renamed from: o */
    public static final long f119920o;

    /* renamed from: p */
    public static final long f119921p;

    /* renamed from: q */
    public static final long f119922q;

    /* renamed from: r */
    public static final long f119923r;

    /* renamed from: s */
    public static final long f119924s;

    /* renamed from: t */
    public static final long f119925t;

    /* renamed from: u */
    public static final long f119926u;

    /* renamed from: v */
    public static final int f119927v;

    /* renamed from: w */
    public static final boolean f119928w;

    /* renamed from: ye6$a */
    /* loaded from: classes6.dex */
    public class C30648a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: ye6$b */
    /* loaded from: classes6.dex */
    public static final class C30649b extends AbstractC30652e {
        public C30649b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: c */
        public boolean mo3058c(Object obj, long j) {
            if (C52324ye6.f119928w) {
                return C52324ye6.m3069s(obj, j);
            }
            return C52324ye6.m3068t(obj, j);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: d */
        public byte mo3057d(Object obj, long j) {
            if (C52324ye6.f119928w) {
                return C52324ye6.m3066v(obj, j);
            }
            return C52324ye6.m3065w(obj, j);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: e */
        public double mo3056e(Object obj, long j) {
            return Double.longBitsToDouble(m3053h(obj, j));
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: f */
        public float mo3055f(Object obj, long j) {
            return Float.intBitsToFloat(m3054g(obj, j));
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: k */
        public void mo3050k(Object obj, long j, boolean z) {
            if (C52324ye6.f119928w) {
                C52324ye6.m3099I(obj, j, z);
            } else {
                C52324ye6.m3098J(obj, j, z);
            }
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: l */
        public void mo3049l(Object obj, long j, byte b) {
            if (C52324ye6.f119928w) {
                C52324ye6.m3096L(obj, j, b);
            } else {
                C52324ye6.m3095M(obj, j, b);
            }
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: m */
        public void mo3048m(Object obj, long j, double d) {
            m3045p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: n */
        public void mo3047n(Object obj, long j, float f) {
            m3046o(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: s */
        public boolean mo3042s() {
            return false;
        }
    }

    /* renamed from: ye6$c */
    /* loaded from: classes6.dex */
    public static final class C30650c extends AbstractC30652e {
        public C30650c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: c */
        public boolean mo3058c(Object obj, long j) {
            if (C52324ye6.f119928w) {
                return C52324ye6.m3069s(obj, j);
            }
            return C52324ye6.m3068t(obj, j);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: d */
        public byte mo3057d(Object obj, long j) {
            if (C52324ye6.f119928w) {
                return C52324ye6.m3066v(obj, j);
            }
            return C52324ye6.m3065w(obj, j);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: e */
        public double mo3056e(Object obj, long j) {
            return Double.longBitsToDouble(m3053h(obj, j));
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: f */
        public float mo3055f(Object obj, long j) {
            return Float.intBitsToFloat(m3054g(obj, j));
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: k */
        public void mo3050k(Object obj, long j, boolean z) {
            if (C52324ye6.f119928w) {
                C52324ye6.m3099I(obj, j, z);
            } else {
                C52324ye6.m3098J(obj, j, z);
            }
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: l */
        public void mo3049l(Object obj, long j, byte b) {
            if (C52324ye6.f119928w) {
                C52324ye6.m3096L(obj, j, b);
            } else {
                C52324ye6.m3095M(obj, j, b);
            }
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: m */
        public void mo3048m(Object obj, long j, double d) {
            m3045p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: n */
        public void mo3047n(Object obj, long j, float f) {
            m3046o(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: s */
        public boolean mo3042s() {
            return false;
        }
    }

    /* renamed from: ye6$d */
    /* loaded from: classes6.dex */
    public static final class C30651d extends AbstractC30652e {
        public C30651d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: c */
        public boolean mo3058c(Object obj, long j) {
            return this.f119929a.getBoolean(obj, j);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: d */
        public byte mo3057d(Object obj, long j) {
            return this.f119929a.getByte(obj, j);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: e */
        public double mo3056e(Object obj, long j) {
            return this.f119929a.getDouble(obj, j);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: f */
        public float mo3055f(Object obj, long j) {
            return this.f119929a.getFloat(obj, j);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: k */
        public void mo3050k(Object obj, long j, boolean z) {
            this.f119929a.putBoolean(obj, j, z);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: l */
        public void mo3049l(Object obj, long j, byte b) {
            this.f119929a.putByte(obj, j, b);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: m */
        public void mo3048m(Object obj, long j, double d) {
            this.f119929a.putDouble(obj, j, d);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: n */
        public void mo3047n(Object obj, long j, float f) {
            this.f119929a.putFloat(obj, j, f);
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: r */
        public boolean mo3043r() {
            if (!super.mo3043r()) {
                return false;
            }
            try {
                Class<?> cls = this.f119929a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                C52324ye6.m3101G(th);
                return false;
            }
        }

        @Override // p000.C52324ye6.AbstractC30652e
        /* renamed from: s */
        public boolean mo3042s() {
            if (!super.mo3042s()) {
                return false;
            }
            try {
                Class<?> cls = this.f119929a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                C52324ye6.m3101G(th);
                return false;
            }
        }
    }

    /* renamed from: ye6$e */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC30652e {

        /* renamed from: a */
        public Unsafe f119929a;

        public AbstractC30652e(Unsafe unsafe) {
            this.f119929a = unsafe;
        }

        /* renamed from: a */
        public final int m3060a(Class<?> cls) {
            return this.f119929a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m3059b(Class<?> cls) {
            return this.f119929a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo3058c(Object obj, long j);

        /* renamed from: d */
        public abstract byte mo3057d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo3056e(Object obj, long j);

        /* renamed from: f */
        public abstract float mo3055f(Object obj, long j);

        /* renamed from: g */
        public final int m3054g(Object obj, long j) {
            return this.f119929a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long m3053h(Object obj, long j) {
            return this.f119929a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object m3052i(Object obj, long j) {
            return this.f119929a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long m3051j(Field field) {
            return this.f119929a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo3050k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo3049l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo3048m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo3047n(Object obj, long j, float f);

        /* renamed from: o */
        public final void m3046o(Object obj, long j, int i) {
            this.f119929a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void m3045p(Object obj, long j, long j2) {
            this.f119929a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void m3044q(Object obj, long j, Object obj2) {
            this.f119929a.putObject(obj, j, obj2);
        }

        /* renamed from: r */
        public boolean mo3043r() {
            Unsafe unsafe = this.f119929a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                C52324ye6.m3101G(th);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo3042s() {
            Unsafe unsafe = this.f119929a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (C52324ye6.m3074n() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C52324ye6.m3101G(th);
                return false;
            }
        }
    }

    static {
        boolean z;
        long m3076l = m3076l(byte[].class);
        f119913h = m3076l;
        f119914i = m3076l(boolean[].class);
        f119915j = m3075m(boolean[].class);
        f119916k = m3076l(int[].class);
        f119917l = m3075m(int[].class);
        f119918m = m3076l(long[].class);
        f119919n = m3075m(long[].class);
        f119920o = m3076l(float[].class);
        f119921p = m3075m(float[].class);
        f119922q = m3076l(double[].class);
        f119923r = m3075m(double[].class);
        f119924s = m3076l(Object[].class);
        f119925t = m3075m(Object[].class);
        f119926u = m3071q(m3074n());
        f119927v = (int) (m3076l & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f119928w = z;
    }

    private C52324ye6() {
    }

    /* renamed from: A */
    public static long m3107A(Object obj, long j) {
        return f119910e.m3053h(obj, j);
    }

    /* renamed from: B */
    public static AbstractC30652e m3106B() {
        Unsafe unsafe = f119906a;
        if (unsafe == null) {
            return null;
        }
        if (C22700hb.m36173c()) {
            if (f119908c) {
                return new C30650c(unsafe);
            }
            if (!f119909d) {
                return null;
            }
            return new C30649b(unsafe);
        }
        return new C30651d(unsafe);
    }

    /* renamed from: C */
    public static Object m3105C(Object obj, long j) {
        return f119910e.m3052i(obj, j);
    }

    /* renamed from: D */
    public static Unsafe m3104D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C30648a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static boolean m3103E() {
        return f119912g;
    }

    /* renamed from: F */
    public static boolean m3102F() {
        return f119911f;
    }

    /* renamed from: G */
    public static void m3101G(Throwable th) {
        Logger logger = Logger.getLogger(C52324ye6.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: H */
    public static void m3100H(Object obj, long j, boolean z) {
        f119910e.mo3050k(obj, j, z);
    }

    /* renamed from: I */
    public static void m3099I(Object obj, long j, boolean z) {
        m3096L(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: J */
    public static void m3098J(Object obj, long j, boolean z) {
        m3095M(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: K */
    public static void m3097K(byte[] bArr, long j, byte b) {
        f119910e.mo3049l(bArr, f119913h + j, b);
    }

    /* renamed from: L */
    public static void m3096L(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m3062z = m3062z(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m3092P(obj, j2, ((255 & b) << i) | (m3062z & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: M */
    public static void m3095M(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m3092P(obj, j2, ((255 & b) << i) | (m3062z(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: N */
    public static void m3094N(Object obj, long j, double d) {
        f119910e.mo3048m(obj, j, d);
    }

    /* renamed from: O */
    public static void m3093O(Object obj, long j, float f) {
        f119910e.mo3047n(obj, j, f);
    }

    /* renamed from: P */
    public static void m3092P(Object obj, long j, int i) {
        f119910e.m3046o(obj, j, i);
    }

    /* renamed from: Q */
    public static void m3091Q(Object obj, long j, long j2) {
        f119910e.m3045p(obj, j, j2);
    }

    /* renamed from: R */
    public static void m3090R(Object obj, long j, Object obj2) {
        f119910e.m3044q(obj, j, obj2);
    }

    /* renamed from: S */
    public static boolean m3089S() {
        AbstractC30652e abstractC30652e = f119910e;
        if (abstractC30652e == null) {
            return false;
        }
        return abstractC30652e.mo3043r();
    }

    /* renamed from: T */
    public static boolean m3088T() {
        AbstractC30652e abstractC30652e = f119910e;
        if (abstractC30652e == null) {
            return false;
        }
        return abstractC30652e.mo3042s();
    }

    /* renamed from: k */
    public static <T> T m3077k(Class<T> cls) {
        try {
            return (T) f119906a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l */
    public static int m3076l(Class<?> cls) {
        if (f119912g) {
            return f119910e.m3060a(cls);
        }
        return -1;
    }

    /* renamed from: m */
    public static int m3075m(Class<?> cls) {
        if (f119912g) {
            return f119910e.m3059b(cls);
        }
        return -1;
    }

    /* renamed from: n */
    public static Field m3074n() {
        Field m3072p;
        if (C22700hb.m36173c() && (m3072p = m3072p(Buffer.class, "effectiveDirectAddress")) != null) {
            return m3072p;
        }
        Field m3072p2 = m3072p(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        if (m3072p2 == null || m3072p2.getType() != Long.TYPE) {
            return null;
        }
        return m3072p2;
    }

    /* renamed from: o */
    public static boolean m3073o(Class<?> cls) {
        if (!C22700hb.m36173c()) {
            return false;
        }
        try {
            Class<?> cls2 = f119907b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static Field m3072p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static long m3071q(Field field) {
        AbstractC30652e abstractC30652e;
        if (field == null || (abstractC30652e = f119910e) == null) {
            return -1L;
        }
        return abstractC30652e.m3051j(field);
    }

    /* renamed from: r */
    public static boolean m3070r(Object obj, long j) {
        return f119910e.mo3058c(obj, j);
    }

    /* renamed from: s */
    public static boolean m3069s(Object obj, long j) {
        return m3066v(obj, j) != 0;
    }

    /* renamed from: t */
    public static boolean m3068t(Object obj, long j) {
        return m3065w(obj, j) != 0;
    }

    /* renamed from: u */
    public static byte m3067u(byte[] bArr, long j) {
        return f119910e.mo3057d(bArr, f119913h + j);
    }

    /* renamed from: v */
    public static byte m3066v(Object obj, long j) {
        return (byte) ((m3062z(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: w */
    public static byte m3065w(Object obj, long j) {
        return (byte) ((m3062z(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: x */
    public static double m3064x(Object obj, long j) {
        return f119910e.mo3056e(obj, j);
    }

    /* renamed from: y */
    public static float m3063y(Object obj, long j) {
        return f119910e.mo3055f(obj, j);
    }

    /* renamed from: z */
    public static int m3062z(Object obj, long j) {
        return f119910e.m3054g(obj, j);
    }
}
