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
/* renamed from: Fs9 */
/* loaded from: classes6.dex */
public final class Fs9 {

    /* renamed from: a */
    public static final Unsafe f10394a;

    /* renamed from: b */
    public static final Class<?> f10395b;

    /* renamed from: c */
    public static final boolean f10396c;

    /* renamed from: d */
    public static final boolean f10397d;

    /* renamed from: e */
    public static final Ds9 f10398e;

    /* renamed from: f */
    public static final boolean f10399f;

    /* renamed from: g */
    public static final boolean f10400g;

    /* renamed from: h */
    public static final long f10401h;

    /* renamed from: i */
    public static final boolean f10402i;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    static {
        Unsafe unsafe;
        boolean z;
        Ds9 ds9;
        Unsafe unsafe2;
        boolean z2;
        Field m106354b;
        Ds9 ds92;
        Unsafe m106344l = m106344l();
        f10394a = m106344l;
        f10395b = C48780sf9.m13859a();
        Class<?> cls = Long.TYPE;
        boolean m106360A = m106360A(cls);
        f10396c = m106360A;
        boolean m106360A2 = m106360A(Integer.TYPE);
        f10397d = m106360A2;
        Ds9 ds93 = null;
        if (m106344l != null) {
            if (m106360A) {
                ds93 = new C40016ds9(m106344l);
            } else if (m106360A2) {
                ds93 = new C38813bs9(m106344l);
            }
        }
        f10398e = ds93;
        boolean z3 = true;
        if (ds93 != null && (unsafe = ds93.f6457a) != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m106343m(th);
            }
            if (m106354b() != null) {
                z = true;
                f10399f = z;
                ds9 = f10398e;
                if (ds9 != null && (unsafe2 = ds9.f6457a) != null) {
                    try {
                        Class<?> cls3 = unsafe2.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        Class<?> cls4 = Long.TYPE;
                        cls3.getMethod("getInt", Object.class, cls4);
                        cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                        cls3.getMethod("getLong", Object.class, cls4);
                        cls3.getMethod("putLong", Object.class, cls4, cls4);
                        cls3.getMethod("getObject", Object.class, cls4);
                        cls3.getMethod("putObject", Object.class, cls4, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        m106343m(th2);
                    }
                    f10400g = z2;
                    f10401h = m106356E(byte[].class);
                    m106356E(boolean[].class);
                    m106355a(boolean[].class);
                    m106356E(int[].class);
                    m106355a(int[].class);
                    m106356E(long[].class);
                    m106355a(long[].class);
                    m106356E(float[].class);
                    m106355a(float[].class);
                    m106356E(double[].class);
                    m106355a(double[].class);
                    m106356E(Object[].class);
                    m106355a(Object[].class);
                    m106354b = m106354b();
                    if (m106354b != null && (ds92 = f10398e) != null) {
                        ds92.m109813l(m106354b);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    f10402i = z3;
                }
                z2 = false;
                f10400g = z2;
                f10401h = m106356E(byte[].class);
                m106356E(boolean[].class);
                m106355a(boolean[].class);
                m106356E(int[].class);
                m106355a(int[].class);
                m106356E(long[].class);
                m106355a(long[].class);
                m106356E(float[].class);
                m106355a(float[].class);
                m106356E(double[].class);
                m106355a(double[].class);
                m106356E(Object[].class);
                m106355a(Object[].class);
                m106354b = m106354b();
                if (m106354b != null) {
                    ds92.m109813l(m106354b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f10402i = z3;
            }
        }
        z = false;
        f10399f = z;
        ds9 = f10398e;
        if (ds9 != null) {
            Class<?> cls32 = unsafe2.getClass();
            cls32.getMethod("objectFieldOffset", Field.class);
            cls32.getMethod("arrayBaseOffset", Class.class);
            cls32.getMethod("arrayIndexScale", Class.class);
            Class<?> cls42 = Long.TYPE;
            cls32.getMethod("getInt", Object.class, cls42);
            cls32.getMethod("putInt", Object.class, cls42, Integer.TYPE);
            cls32.getMethod("getLong", Object.class, cls42);
            cls32.getMethod("putLong", Object.class, cls42, cls42);
            cls32.getMethod("getObject", Object.class, cls42);
            cls32.getMethod("putObject", Object.class, cls42, Object.class);
            z2 = true;
            f10400g = z2;
            f10401h = m106356E(byte[].class);
            m106356E(boolean[].class);
            m106355a(boolean[].class);
            m106356E(int[].class);
            m106355a(int[].class);
            m106356E(long[].class);
            m106355a(long[].class);
            m106356E(float[].class);
            m106355a(float[].class);
            m106356E(double[].class);
            m106355a(double[].class);
            m106356E(Object[].class);
            m106355a(Object[].class);
            m106354b = m106354b();
            if (m106354b != null) {
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            }
            f10402i = z3;
        }
        z2 = false;
        f10400g = z2;
        f10401h = m106356E(byte[].class);
        m106356E(boolean[].class);
        m106355a(boolean[].class);
        m106356E(int[].class);
        m106355a(int[].class);
        m106356E(long[].class);
        m106355a(long[].class);
        m106356E(float[].class);
        m106355a(float[].class);
        m106356E(double[].class);
        m106355a(double[].class);
        m106356E(Object[].class);
        m106355a(Object[].class);
        m106354b = m106354b();
        if (m106354b != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f10402i = z3;
    }

    private Fs9() {
    }

    /* renamed from: A */
    public static boolean m106360A(Class<?> cls) {
        int i = C48780sf9.f109092a;
        try {
            Class<?> cls2 = f10395b;
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

    /* renamed from: B */
    public static boolean m106359B(Object obj, long j) {
        return f10398e.mo43551g(obj, j);
    }

    /* renamed from: C */
    public static boolean m106358C() {
        return f10400g;
    }

    /* renamed from: D */
    public static boolean m106357D() {
        return f10399f;
    }

    /* renamed from: E */
    public static int m106356E(Class<?> cls) {
        if (f10400g) {
            return f10398e.m109817h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m106355a(Class<?> cls) {
        if (f10400g) {
            return f10398e.m109816i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m106354b() {
        int i = C48780sf9.f109092a;
        Field m106353c = m106353c(Buffer.class, "effectiveDirectAddress");
        if (m106353c == null) {
            Field m106353c2 = m106353c(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (m106353c2 != null && m106353c2.getType() == Long.TYPE) {
                return m106353c2;
            }
            return null;
        }
        return m106353c;
    }

    /* renamed from: c */
    public static Field m106353c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m106352d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        Ds9 ds9 = f10398e;
        int m109815j = ds9.m109815j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        ds9.m109811n(obj, j2, ((255 & b) << i) | (m109815j & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: e */
    public static void m106351e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        Ds9 ds9 = f10398e;
        int i = (((int) j) & 3) << 3;
        ds9.m109811n(obj, j2, ((255 & b) << i) | (ds9.m109815j(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: f */
    public static double m106350f(Object obj, long j) {
        return f10398e.mo43557a(obj, j);
    }

    /* renamed from: g */
    public static float m106349g(Object obj, long j) {
        return f10398e.mo43556b(obj, j);
    }

    /* renamed from: h */
    public static int m106348h(Object obj, long j) {
        return f10398e.m109815j(obj, j);
    }

    /* renamed from: i */
    public static long m106347i(Object obj, long j) {
        return f10398e.m109814k(obj, j);
    }

    /* renamed from: j */
    public static <T> T m106346j(Class<T> cls) {
        try {
            return (T) f10394a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m106345k(Object obj, long j) {
        return f10398e.m109812m(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m106344l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Zr9());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m106343m(Throwable th) {
        Logger logger = Logger.getLogger(Fs9.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* renamed from: r */
    public static void m106338r(Object obj, long j, boolean z) {
        f10398e.mo43555c(obj, j, z);
    }

    /* renamed from: s */
    public static void m106337s(byte[] bArr, long j, byte b) {
        f10398e.mo43554d(bArr, f10401h + j, b);
    }

    /* renamed from: t */
    public static void m106336t(Object obj, long j, double d) {
        f10398e.mo43553e(obj, j, d);
    }

    /* renamed from: u */
    public static void m106335u(Object obj, long j, float f) {
        f10398e.mo43552f(obj, j, f);
    }

    /* renamed from: v */
    public static void m106334v(Object obj, long j, int i) {
        f10398e.m109811n(obj, j, i);
    }

    /* renamed from: w */
    public static void m106333w(Object obj, long j, long j2) {
        f10398e.m109810o(obj, j, j2);
    }

    /* renamed from: x */
    public static void m106332x(Object obj, long j, Object obj2) {
        f10398e.m109809p(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m106331y(Object obj, long j) {
        if (((byte) ((f10398e.m109815j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m106330z(Object obj, long j) {
        if (((byte) ((f10398e.m109815j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0) {
            return true;
        }
        return false;
    }
}
