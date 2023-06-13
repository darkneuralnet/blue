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
/* renamed from: t58  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49038t58 {

    /* renamed from: a */
    public static final Logger f109822a = Logger.getLogger(C49038t58.class.getName());

    /* renamed from: b */
    public static final Unsafe f109823b;

    /* renamed from: c */
    public static final Class<?> f109824c;

    /* renamed from: d */
    public static final boolean f109825d;

    /* renamed from: e */
    public static final boolean f109826e;

    /* renamed from: f */
    public static final AbstractC28521c f109827f;

    /* renamed from: g */
    public static final boolean f109828g;

    /* renamed from: h */
    public static final boolean f109829h;

    /* renamed from: i */
    public static final long f109830i;

    /* renamed from: j */
    public static final long f109831j;

    /* renamed from: k */
    public static final long f109832k;

    /* renamed from: l */
    public static final long f109833l;

    /* renamed from: m */
    public static final long f109834m;

    /* renamed from: n */
    public static final long f109835n;

    /* renamed from: o */
    public static final long f109836o;

    /* renamed from: p */
    public static final long f109837p;

    /* renamed from: q */
    public static final long f109838q;

    /* renamed from: r */
    public static final long f109839r;

    /* renamed from: s */
    public static final long f109840s;

    /* renamed from: t */
    public static final long f109841t;

    /* renamed from: u */
    public static final long f109842u;

    /* renamed from: v */
    public static final long f109843v;

    /* renamed from: w */
    public static final int f109844w;

    /* renamed from: x */
    public static final boolean f109845x;

    /* renamed from: t58$a */
    /* loaded from: classes5.dex */
    public static final class C28519a extends AbstractC28521c {
        public C28519a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: a */
        public final void mo13090a(Object obj, long j, double d) {
            m13093d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: b */
        public final void mo13089b(Object obj, long j, float f) {
            m13094c(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: e */
        public final void mo13088e(Object obj, long j, boolean z) {
            if (C49038t58.f109845x) {
                C49038t58.m13109l(obj, j, z);
            } else {
                C49038t58.m13107n(obj, j, z);
            }
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: f */
        public final void mo13087f(Object obj, long j, byte b) {
            if (C49038t58.f109845x) {
                C49038t58.m13119b(obj, j, b);
            } else {
                C49038t58.m13110k(obj, j, b);
            }
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: i */
        public final boolean mo13086i(Object obj, long j) {
            if (C49038t58.f109845x) {
                return C49038t58.m13126J(obj, j);
            }
            return C49038t58.m13125K(obj, j);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: j */
        public final float mo13085j(Object obj, long j) {
            return Float.intBitsToFloat(m13092g(obj, j));
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: k */
        public final double mo13084k(Object obj, long j) {
            return Double.longBitsToDouble(m13091h(obj, j));
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: l */
        public final byte mo13083l(Object obj, long j) {
            if (C49038t58.f109845x) {
                return C49038t58.m13128H(obj, j);
            }
            return C49038t58.m13127I(obj, j);
        }
    }

    /* renamed from: t58$b */
    /* loaded from: classes5.dex */
    public static final class C28520b extends AbstractC28521c {
        public C28520b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: a */
        public final void mo13090a(Object obj, long j, double d) {
            m13093d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: b */
        public final void mo13089b(Object obj, long j, float f) {
            m13094c(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: e */
        public final void mo13088e(Object obj, long j, boolean z) {
            if (C49038t58.f109845x) {
                C49038t58.m13109l(obj, j, z);
            } else {
                C49038t58.m13107n(obj, j, z);
            }
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: f */
        public final void mo13087f(Object obj, long j, byte b) {
            if (C49038t58.f109845x) {
                C49038t58.m13119b(obj, j, b);
            } else {
                C49038t58.m13110k(obj, j, b);
            }
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: i */
        public final boolean mo13086i(Object obj, long j) {
            if (C49038t58.f109845x) {
                return C49038t58.m13126J(obj, j);
            }
            return C49038t58.m13125K(obj, j);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: j */
        public final float mo13085j(Object obj, long j) {
            return Float.intBitsToFloat(m13092g(obj, j));
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: k */
        public final double mo13084k(Object obj, long j) {
            return Double.longBitsToDouble(m13091h(obj, j));
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: l */
        public final byte mo13083l(Object obj, long j) {
            if (C49038t58.f109845x) {
                return C49038t58.m13128H(obj, j);
            }
            return C49038t58.m13127I(obj, j);
        }
    }

    /* renamed from: t58$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC28521c {

        /* renamed from: a */
        public Unsafe f109846a;

        public AbstractC28521c(Unsafe unsafe) {
            this.f109846a = unsafe;
        }

        /* renamed from: a */
        public abstract void mo13090a(Object obj, long j, double d);

        /* renamed from: b */
        public abstract void mo13089b(Object obj, long j, float f);

        /* renamed from: c */
        public final void m13094c(Object obj, long j, int i) {
            this.f109846a.putInt(obj, j, i);
        }

        /* renamed from: d */
        public final void m13093d(Object obj, long j, long j2) {
            this.f109846a.putLong(obj, j, j2);
        }

        /* renamed from: e */
        public abstract void mo13088e(Object obj, long j, boolean z);

        /* renamed from: f */
        public abstract void mo13087f(Object obj, long j, byte b);

        /* renamed from: g */
        public final int m13092g(Object obj, long j) {
            return this.f109846a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long m13091h(Object obj, long j) {
            return this.f109846a.getLong(obj, j);
        }

        /* renamed from: i */
        public abstract boolean mo13086i(Object obj, long j);

        /* renamed from: j */
        public abstract float mo13085j(Object obj, long j);

        /* renamed from: k */
        public abstract double mo13084k(Object obj, long j);

        /* renamed from: l */
        public abstract byte mo13083l(Object obj, long j);
    }

    /* renamed from: t58$d */
    /* loaded from: classes5.dex */
    public static final class C28522d extends AbstractC28521c {
        public C28522d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: a */
        public final void mo13090a(Object obj, long j, double d) {
            this.f109846a.putDouble(obj, j, d);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: b */
        public final void mo13089b(Object obj, long j, float f) {
            this.f109846a.putFloat(obj, j, f);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: e */
        public final void mo13088e(Object obj, long j, boolean z) {
            this.f109846a.putBoolean(obj, j, z);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: f */
        public final void mo13087f(Object obj, long j, byte b) {
            this.f109846a.putByte(obj, j, b);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: i */
        public final boolean mo13086i(Object obj, long j) {
            return this.f109846a.getBoolean(obj, j);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: j */
        public final float mo13085j(Object obj, long j) {
            return this.f109846a.getFloat(obj, j);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: k */
        public final double mo13084k(Object obj, long j) {
            return this.f109846a.getDouble(obj, j);
        }

        @Override // p000.C49038t58.AbstractC28521c
        /* renamed from: l */
        public final byte mo13083l(Object obj, long j) {
            return this.f109846a.getByte(obj, j);
        }
    }

    static {
        long j;
        boolean z;
        Unsafe m13104q = m13104q();
        f109823b = m13104q;
        f109824c = C41645gd9.m37943c();
        boolean m13134B = m13134B(Long.TYPE);
        f109825d = m13134B;
        boolean m13134B2 = m13134B(Integer.TYPE);
        f109826e = m13134B2;
        AbstractC28521c abstractC28521c = null;
        if (m13104q != null) {
            if (C41645gd9.m37944b()) {
                if (m13134B) {
                    abstractC28521c = new C28519a(m13104q);
                } else if (m13134B2) {
                    abstractC28521c = new C28520b(m13104q);
                }
            } else {
                abstractC28521c = new C28522d(m13104q);
            }
        }
        f109827f = abstractC28521c;
        f109828g = m13102s();
        f109829h = m13103r();
        long m13096y = m13096y(byte[].class);
        f109830i = m13096y;
        f109831j = m13096y(boolean[].class);
        f109832k = m13095z(boolean[].class);
        f109833l = m13096y(int[].class);
        f109834m = m13095z(int[].class);
        f109835n = m13096y(long[].class);
        f109836o = m13095z(long[].class);
        f109837p = m13096y(float[].class);
        f109838q = m13095z(float[].class);
        f109839r = m13096y(double[].class);
        f109840s = m13095z(double[].class);
        f109841t = m13096y(Object[].class);
        f109842u = m13095z(Object[].class);
        Field m13101t = m13101t();
        if (m13101t != null && abstractC28521c != null) {
            j = abstractC28521c.f109846a.objectFieldOffset(m13101t);
        } else {
            j = -1;
        }
        f109843v = j;
        f109844w = (int) (m13096y & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f109845x = z;
    }

    private C49038t58() {
    }

    /* renamed from: A */
    public static int m13135A(Object obj, long j) {
        return f109827f.m13092g(obj, j);
    }

    /* renamed from: B */
    public static boolean m13134B(Class<?> cls) {
        if (!C41645gd9.m37944b()) {
            return false;
        }
        try {
            Class<?> cls2 = f109824c;
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
    public static long m13133C(Object obj, long j) {
        return f109827f.m13091h(obj, j);
    }

    /* renamed from: D */
    public static boolean m13132D(Object obj, long j) {
        return f109827f.mo13086i(obj, j);
    }

    /* renamed from: E */
    public static float m13131E(Object obj, long j) {
        return f109827f.mo13085j(obj, j);
    }

    /* renamed from: F */
    public static double m13130F(Object obj, long j) {
        return f109827f.mo13084k(obj, j);
    }

    /* renamed from: G */
    public static Object m13129G(Object obj, long j) {
        return f109827f.f109846a.getObject(obj, j);
    }

    /* renamed from: H */
    public static byte m13128H(Object obj, long j) {
        return (byte) (m13135A(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: I */
    public static byte m13127I(Object obj, long j) {
        return (byte) (m13135A(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: J */
    public static boolean m13126J(Object obj, long j) {
        return m13128H(obj, j) != 0;
    }

    /* renamed from: K */
    public static boolean m13125K(Object obj, long j) {
        return m13127I(obj, j) != 0;
    }

    /* renamed from: a */
    public static byte m13120a(byte[] bArr, long j) {
        return f109827f.mo13083l(bArr, f109830i + j);
    }

    /* renamed from: b */
    public static void m13119b(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m13135A = m13135A(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m13116e(obj, j2, ((255 & b) << i) | (m13135A & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: c */
    public static void m13118c(Object obj, long j, double d) {
        f109827f.mo13090a(obj, j, d);
    }

    /* renamed from: d */
    public static void m13117d(Object obj, long j, float f) {
        f109827f.mo13089b(obj, j, f);
    }

    /* renamed from: e */
    public static void m13116e(Object obj, long j, int i) {
        f109827f.m13094c(obj, j, i);
    }

    /* renamed from: f */
    public static void m13115f(Object obj, long j, long j2) {
        f109827f.m13093d(obj, j, j2);
    }

    /* renamed from: g */
    public static void m13114g(Object obj, long j, Object obj2) {
        f109827f.f109846a.putObject(obj, j, obj2);
    }

    /* renamed from: h */
    public static void m13113h(Object obj, long j, boolean z) {
        f109827f.mo13088e(obj, j, z);
    }

    /* renamed from: i */
    public static void m13112i(byte[] bArr, long j, byte b) {
        f109827f.mo13087f(bArr, f109830i + j, b);
    }

    /* renamed from: j */
    public static Field m13111j(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static void m13110k(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m13116e(obj, j2, ((255 & b) << i) | (m13135A(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: l */
    public static void m13109l(Object obj, long j, boolean z) {
        m13119b(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: n */
    public static void m13107n(Object obj, long j, boolean z) {
        m13110k(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: o */
    public static boolean m13106o() {
        return f109829h;
    }

    /* renamed from: p */
    public static boolean m13105p() {
        return f109828g;
    }

    /* renamed from: q */
    public static Unsafe m13104q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C40144e58());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static boolean m13103r() {
        Unsafe unsafe = f109823b;
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
            if (C41645gd9.m37944b()) {
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
            Logger logger = f109822a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: s */
    public static boolean m13102s() {
        Unsafe unsafe = f109823b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m13101t() == null) {
                return false;
            }
            if (C41645gd9.m37944b()) {
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
            Logger logger = f109822a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: t */
    public static Field m13101t() {
        Field m13111j;
        if (C41645gd9.m37944b() && (m13111j = m13111j(Buffer.class, "effectiveDirectAddress")) != null) {
            return m13111j;
        }
        Field m13111j2 = m13111j(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        if (m13111j2 != null && m13111j2.getType() == Long.TYPE) {
            return m13111j2;
        }
        return null;
    }

    /* renamed from: x */
    public static <T> T m13097x(Class<T> cls) {
        try {
            return (T) f109823b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: y */
    public static int m13096y(Class<?> cls) {
        if (f109829h) {
            return f109827f.f109846a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: z */
    public static int m13095z(Class<?> cls) {
        if (f109829h) {
            return f109827f.f109846a.arrayIndexScale(cls);
        }
        return -1;
    }
}
