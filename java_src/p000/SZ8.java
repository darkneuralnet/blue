package p000;

import com.stripe.android.model.PaymentMethod;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: SZ8 */
/* loaded from: classes6.dex */
public final class SZ8 {

    /* renamed from: a */
    public static final Unsafe f33895a;

    /* renamed from: b */
    public static final Class<?> f33896b;

    /* renamed from: c */
    public static final boolean f33897c;

    /* renamed from: d */
    public static final boolean f33898d;

    /* renamed from: e */
    public static final AbstractC7480d f33899e;

    /* renamed from: f */
    public static final boolean f33900f;

    /* renamed from: g */
    public static final boolean f33901g;

    /* renamed from: h */
    public static final long f33902h;

    /* renamed from: i */
    public static final long f33903i;

    /* renamed from: j */
    public static final long f33904j;

    /* renamed from: k */
    public static final long f33905k;

    /* renamed from: l */
    public static final long f33906l;

    /* renamed from: m */
    public static final long f33907m;

    /* renamed from: n */
    public static final long f33908n;

    /* renamed from: o */
    public static final long f33909o;

    /* renamed from: p */
    public static final long f33910p;

    /* renamed from: q */
    public static final long f33911q;

    /* renamed from: r */
    public static final long f33912r;

    /* renamed from: s */
    public static final long f33913s;

    /* renamed from: t */
    public static final long f33914t;

    /* renamed from: u */
    public static final long f33915u;

    /* renamed from: v */
    public static final int f33916v;

    /* renamed from: w */
    public static final boolean f33917w;

    /* renamed from: SZ8$a */
    /* loaded from: classes6.dex */
    public static final class C7477a extends AbstractC7480d {
        public C7477a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: a */
        public final byte mo85237a(Object obj, long j) {
            if (SZ8.f33917w) {
                return SZ8.m85267L(obj, j);
            }
            return SZ8.m85266M(obj, j);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: b */
        public final void mo85236b(Object obj, long j, byte b) {
            if (SZ8.f33917w) {
                SZ8.m85243u(obj, j, b);
            } else {
                SZ8.m85239y(obj, j, b);
            }
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: c */
        public final void mo85235c(Object obj, long j, double d) {
            m85232f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: d */
        public final void mo85234d(Object obj, long j, float f) {
            m85233e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: g */
        public final void mo85231g(Object obj, long j, boolean z) {
            if (SZ8.f33917w) {
                SZ8.m85238z(obj, j, z);
            } else {
                SZ8.m85275D(obj, j, z);
            }
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: h */
        public final boolean mo85230h(Object obj, long j) {
            if (SZ8.f33917w) {
                return SZ8.m85265N(obj, j);
            }
            return SZ8.m85264O(obj, j);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: i */
        public final float mo85229i(Object obj, long j) {
            return Float.intBitsToFloat(m85227k(obj, j));
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: j */
        public final double mo85228j(Object obj, long j) {
            return Double.longBitsToDouble(m85226l(obj, j));
        }
    }

    /* renamed from: SZ8$b */
    /* loaded from: classes6.dex */
    public static final class C7478b extends AbstractC7480d {
        public C7478b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: a */
        public final byte mo85237a(Object obj, long j) {
            return this.f33918a.getByte(obj, j);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: b */
        public final void mo85236b(Object obj, long j, byte b) {
            this.f33918a.putByte(obj, j, b);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: c */
        public final void mo85235c(Object obj, long j, double d) {
            this.f33918a.putDouble(obj, j, d);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: d */
        public final void mo85234d(Object obj, long j, float f) {
            this.f33918a.putFloat(obj, j, f);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: g */
        public final void mo85231g(Object obj, long j, boolean z) {
            this.f33918a.putBoolean(obj, j, z);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: h */
        public final boolean mo85230h(Object obj, long j) {
            return this.f33918a.getBoolean(obj, j);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: i */
        public final float mo85229i(Object obj, long j) {
            return this.f33918a.getFloat(obj, j);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: j */
        public final double mo85228j(Object obj, long j) {
            return this.f33918a.getDouble(obj, j);
        }
    }

    /* renamed from: SZ8$c */
    /* loaded from: classes6.dex */
    public static final class C7479c extends AbstractC7480d {
        public C7479c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: a */
        public final byte mo85237a(Object obj, long j) {
            if (SZ8.f33917w) {
                return SZ8.m85267L(obj, j);
            }
            return SZ8.m85266M(obj, j);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: b */
        public final void mo85236b(Object obj, long j, byte b) {
            if (SZ8.f33917w) {
                SZ8.m85243u(obj, j, b);
            } else {
                SZ8.m85239y(obj, j, b);
            }
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: c */
        public final void mo85235c(Object obj, long j, double d) {
            m85232f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: d */
        public final void mo85234d(Object obj, long j, float f) {
            m85233e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: g */
        public final void mo85231g(Object obj, long j, boolean z) {
            if (SZ8.f33917w) {
                SZ8.m85238z(obj, j, z);
            } else {
                SZ8.m85275D(obj, j, z);
            }
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: h */
        public final boolean mo85230h(Object obj, long j) {
            if (SZ8.f33917w) {
                return SZ8.m85265N(obj, j);
            }
            return SZ8.m85264O(obj, j);
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: i */
        public final float mo85229i(Object obj, long j) {
            return Float.intBitsToFloat(m85227k(obj, j));
        }

        @Override // p000.SZ8.AbstractC7480d
        /* renamed from: j */
        public final double mo85228j(Object obj, long j) {
            return Double.longBitsToDouble(m85226l(obj, j));
        }
    }

    /* renamed from: SZ8$d */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC7480d {

        /* renamed from: a */
        public Unsafe f33918a;

        public AbstractC7480d(Unsafe unsafe) {
            this.f33918a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo85237a(Object obj, long j);

        /* renamed from: b */
        public abstract void mo85236b(Object obj, long j, byte b);

        /* renamed from: c */
        public abstract void mo85235c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo85234d(Object obj, long j, float f);

        /* renamed from: e */
        public final void m85233e(Object obj, long j, int i) {
            this.f33918a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void m85232f(Object obj, long j, long j2) {
            this.f33918a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo85231g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract boolean mo85230h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo85229i(Object obj, long j);

        /* renamed from: j */
        public abstract double mo85228j(Object obj, long j);

        /* renamed from: k */
        public final int m85227k(Object obj, long j) {
            return this.f33918a.getInt(obj, j);
        }

        /* renamed from: l */
        public final long m85226l(Object obj, long j) {
            return this.f33918a.getLong(obj, j);
        }
    }

    static {
        long j;
        boolean z;
        Unsafe m85244t = m85244t();
        f33895a = m85244t;
        f33896b = C36256Tv8.m82237c();
        boolean m85277B = m85277B(Long.TYPE);
        f33897c = m85277B;
        boolean m85277B2 = m85277B(Integer.TYPE);
        f33898d = m85277B2;
        AbstractC7480d abstractC7480d = null;
        if (m85244t != null) {
            if (C36256Tv8.m82238b()) {
                if (m85277B) {
                    abstractC7480d = new C7479c(m85244t);
                } else if (m85277B2) {
                    abstractC7480d = new C7477a(m85244t);
                }
            } else {
                abstractC7480d = new C7478b(m85244t);
            }
        }
        f33899e = abstractC7480d;
        f33900f = m85274E();
        f33901g = m85278A();
        long m85250n = m85250n(byte[].class);
        f33902h = m85250n;
        f33903i = m85250n(boolean[].class);
        f33904j = m85245s(boolean[].class);
        f33905k = m85250n(int[].class);
        f33906l = m85245s(int[].class);
        f33907m = m85250n(long[].class);
        f33908n = m85245s(long[].class);
        f33909o = m85250n(float[].class);
        f33910p = m85245s(float[].class);
        f33911q = m85250n(double[].class);
        f33912r = m85245s(double[].class);
        f33913s = m85250n(Object[].class);
        f33914t = m85245s(Object[].class);
        Field m85272G = m85272G();
        if (m85272G != null && abstractC7480d != null) {
            j = abstractC7480d.f33918a.objectFieldOffset(m85272G);
        } else {
            j = -1;
        }
        f33915u = j;
        f33916v = (int) (m85250n & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f33917w = z;
    }

    private SZ8() {
    }

    /* renamed from: A */
    public static boolean m85278A() {
        Unsafe unsafe = f33895a;
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
            if (C36256Tv8.m82238b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(SZ8.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: B */
    public static boolean m85277B(Class<?> cls) {
        if (!C36256Tv8.m82238b()) {
            return false;
        }
        try {
            Class<?> cls2 = f33896b;
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

    /* renamed from: C */
    public static double m85276C(Object obj, long j) {
        return f33899e.mo85228j(obj, j);
    }

    /* renamed from: D */
    public static void m85275D(Object obj, long j, boolean z) {
        m85239y(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: E */
    public static boolean m85274E() {
        Unsafe unsafe = f33895a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m85272G() == null) {
                return false;
            }
            if (C36256Tv8.m82238b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(SZ8.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: F */
    public static Object m85273F(Object obj, long j) {
        return f33899e.f33918a.getObject(obj, j);
    }

    /* renamed from: G */
    public static Field m85272G() {
        Field m85260d;
        if (C36256Tv8.m82238b() && (m85260d = m85260d(Buffer.class, "effectiveDirectAddress")) != null) {
            return m85260d;
        }
        Field m85260d2 = m85260d(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        if (m85260d2 != null && m85260d2.getType() == Long.TYPE) {
            return m85260d2;
        }
        return null;
    }

    /* renamed from: L */
    public static byte m85267L(Object obj, long j) {
        return (byte) (m85262b(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: M */
    public static byte m85266M(Object obj, long j) {
        return (byte) (m85262b(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: N */
    public static boolean m85265N(Object obj, long j) {
        return m85267L(obj, j) != 0;
    }

    /* renamed from: O */
    public static boolean m85264O(Object obj, long j) {
        return m85266M(obj, j) != 0;
    }

    /* renamed from: a */
    public static byte m85263a(byte[] bArr, long j) {
        return f33899e.mo85237a(bArr, f33902h + j);
    }

    /* renamed from: b */
    public static int m85262b(Object obj, long j) {
        return f33899e.m85227k(obj, j);
    }

    /* renamed from: c */
    public static <T> T m85261c(Class<T> cls) {
        try {
            return (T) f33895a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public static Field m85260d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m85258f(Object obj, long j, double d) {
        f33899e.mo85235c(obj, j, d);
    }

    /* renamed from: g */
    public static void m85257g(Object obj, long j, float f) {
        f33899e.mo85234d(obj, j, f);
    }

    /* renamed from: h */
    public static void m85256h(Object obj, long j, int i) {
        f33899e.m85233e(obj, j, i);
    }

    /* renamed from: i */
    public static void m85255i(Object obj, long j, long j2) {
        f33899e.m85232f(obj, j, j2);
    }

    /* renamed from: j */
    public static void m85254j(Object obj, long j, Object obj2) {
        f33899e.f33918a.putObject(obj, j, obj2);
    }

    /* renamed from: k */
    public static void m85253k(Object obj, long j, boolean z) {
        f33899e.mo85231g(obj, j, z);
    }

    /* renamed from: l */
    public static void m85252l(byte[] bArr, long j, byte b) {
        f33899e.mo85236b(bArr, f33902h + j, b);
    }

    /* renamed from: m */
    public static boolean m85251m() {
        return f33901g;
    }

    /* renamed from: n */
    public static int m85250n(Class<?> cls) {
        if (f33901g) {
            return f33899e.f33918a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static long m85249o(Object obj, long j) {
        return f33899e.m85226l(obj, j);
    }

    /* renamed from: r */
    public static boolean m85246r() {
        return f33900f;
    }

    /* renamed from: s */
    public static int m85245s(Class<?> cls) {
        if (f33901g) {
            return f33899e.f33918a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: t */
    public static Unsafe m85244t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C44246l09());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static void m85243u(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m85262b = m85262b(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m85256h(obj, j2, ((255 & b) << i) | (m85262b & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: w */
    public static boolean m85241w(Object obj, long j) {
        return f33899e.mo85230h(obj, j);
    }

    /* renamed from: x */
    public static float m85240x(Object obj, long j) {
        return f33899e.mo85229i(obj, j);
    }

    /* renamed from: y */
    public static void m85239y(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m85256h(obj, j2, ((255 & b) << i) | (m85262b(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: z */
    public static void m85238z(Object obj, long j, boolean z) {
        m85243u(obj, j, z ? (byte) 1 : (byte) 0);
    }
}
