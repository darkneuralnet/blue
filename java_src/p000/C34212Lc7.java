package p000;

import com.stripe.android.model.PaymentMethod;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import libcore.io.Memory;
import sun.misc.Unsafe;
/* renamed from: Lc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34212Lc7 {

    /* renamed from: a */
    public static final Unsafe f21765a;

    /* renamed from: b */
    public static final Class f21766b;

    /* renamed from: c */
    public static final boolean f21767c;

    /* renamed from: d */
    public static final AbstractC33978Kc7 f21768d;

    /* renamed from: e */
    public static final boolean f21769e;

    /* renamed from: f */
    public static final boolean f21770f;

    /* renamed from: g */
    public static final long f21771g;

    /* renamed from: h */
    public static final boolean f21772h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    static {
        boolean z;
        AbstractC33978Kc7 abstractC33978Kc7;
        boolean z2;
        Field m96576b;
        AbstractC33978Kc7 abstractC33978Kc72;
        Unsafe m96566l = m96566l();
        f21765a = m96566l;
        int i = C42206ha7.f85494a;
        f21766b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean m96582A = m96582A(cls);
        f21767c = m96582A;
        boolean m96582A2 = m96582A(Integer.TYPE);
        AbstractC33978Kc7 abstractC33978Kc73 = null;
        if (m96566l != null) {
            if (m96582A) {
                abstractC33978Kc73 = new C33744Jc7(m96566l);
            } else if (m96582A2) {
                abstractC33978Kc73 = new C33510Ic7(m96566l);
            }
        }
        f21768d = abstractC33978Kc73;
        boolean z3 = true;
        if (abstractC33978Kc73 != null) {
            try {
                Class<?> cls2 = abstractC33978Kc73.f19944a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m96565m(th);
            }
            if (m96576b() != null) {
                z = true;
                f21769e = z;
                abstractC33978Kc7 = f21768d;
                if (abstractC33978Kc7 != null) {
                    try {
                        Class<?> cls3 = abstractC33978Kc7.f19944a.getClass();
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
                        m96565m(th2);
                    }
                    f21770f = z2;
                    f21771g = m96578E(byte[].class);
                    m96578E(boolean[].class);
                    m96577a(boolean[].class);
                    m96578E(int[].class);
                    m96577a(int[].class);
                    m96578E(long[].class);
                    m96577a(long[].class);
                    m96578E(float[].class);
                    m96577a(float[].class);
                    m96578E(double[].class);
                    m96577a(double[].class);
                    m96578E(Object[].class);
                    m96577a(Object[].class);
                    m96576b = m96576b();
                    if (m96576b != null && (abstractC33978Kc72 = f21768d) != null) {
                        abstractC33978Kc72.f19944a.objectFieldOffset(m96576b);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    f21772h = z3;
                }
                z2 = false;
                f21770f = z2;
                f21771g = m96578E(byte[].class);
                m96578E(boolean[].class);
                m96577a(boolean[].class);
                m96578E(int[].class);
                m96577a(int[].class);
                m96578E(long[].class);
                m96577a(long[].class);
                m96578E(float[].class);
                m96577a(float[].class);
                m96578E(double[].class);
                m96577a(double[].class);
                m96578E(Object[].class);
                m96577a(Object[].class);
                m96576b = m96576b();
                if (m96576b != null) {
                    abstractC33978Kc72.f19944a.objectFieldOffset(m96576b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f21772h = z3;
            }
        }
        z = false;
        f21769e = z;
        abstractC33978Kc7 = f21768d;
        if (abstractC33978Kc7 != null) {
        }
        z2 = false;
        f21770f = z2;
        f21771g = m96578E(byte[].class);
        m96578E(boolean[].class);
        m96577a(boolean[].class);
        m96578E(int[].class);
        m96577a(int[].class);
        m96578E(long[].class);
        m96577a(long[].class);
        m96578E(float[].class);
        m96577a(float[].class);
        m96578E(double[].class);
        m96577a(double[].class);
        m96578E(Object[].class);
        m96577a(Object[].class);
        m96576b = m96576b();
        if (m96576b != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f21772h = z3;
    }

    private C34212Lc7() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m96582A(Class cls) {
        int i = C42206ha7.f85494a;
        try {
            Class cls2 = f21766b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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
    public static boolean m96581B(Object obj, long j) {
        return f21768d.mo98653g(obj, j);
    }

    /* renamed from: C */
    public static boolean m96580C() {
        return f21770f;
    }

    /* renamed from: D */
    public static boolean m96579D() {
        return f21769e;
    }

    /* renamed from: E */
    public static int m96578E(Class cls) {
        if (f21770f) {
            return f21768d.f19944a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m96577a(Class cls) {
        if (f21770f) {
            return f21768d.f19944a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m96576b() {
        int i = C42206ha7.f85494a;
        Field m96575c = m96575c(Buffer.class, "effectiveDirectAddress");
        if (m96575c == null) {
            Field m96575c2 = m96575c(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (m96575c2 != null && m96575c2.getType() == Long.TYPE) {
                return m96575c2;
            }
            return null;
        }
        return m96575c;
    }

    /* renamed from: c */
    public static Field m96575c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m96574d(Object obj, long j, byte b) {
        AbstractC33978Kc7 abstractC33978Kc7 = f21768d;
        long j2 = (-4) & j;
        int i = abstractC33978Kc7.f19944a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        abstractC33978Kc7.f19944a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    /* renamed from: e */
    public static void m96573e(Object obj, long j, byte b) {
        AbstractC33978Kc7 abstractC33978Kc7 = f21768d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abstractC33978Kc7.f19944a.putInt(obj, j2, ((255 & b) << i) | (abstractC33978Kc7.f19944a.getInt(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: f */
    public static double m96572f(Object obj, long j) {
        return f21768d.mo98659a(obj, j);
    }

    /* renamed from: g */
    public static float m96571g(Object obj, long j) {
        return f21768d.mo98658b(obj, j);
    }

    /* renamed from: h */
    public static int m96570h(Object obj, long j) {
        return f21768d.f19944a.getInt(obj, j);
    }

    /* renamed from: i */
    public static long m96569i(Object obj, long j) {
        return f21768d.f19944a.getLong(obj, j);
    }

    /* renamed from: j */
    public static Object m96568j(Class cls) {
        try {
            return f21765a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m96567k(Object obj, long j) {
        return f21768d.f19944a.getObject(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m96566l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C33276Hc7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m96565m(Throwable th) {
        Logger.getLogger(C34212Lc7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: r */
    public static void m96560r(Object obj, long j, boolean z) {
        f21768d.mo98657c(obj, j, z);
    }

    /* renamed from: s */
    public static void m96559s(byte[] bArr, long j, byte b) {
        f21768d.mo98656d(bArr, f21771g + j, b);
    }

    /* renamed from: t */
    public static void m96558t(Object obj, long j, double d) {
        f21768d.mo98655e(obj, j, d);
    }

    /* renamed from: u */
    public static void m96557u(Object obj, long j, float f) {
        f21768d.mo98654f(obj, j, f);
    }

    /* renamed from: v */
    public static void m96556v(Object obj, long j, int i) {
        f21768d.f19944a.putInt(obj, j, i);
    }

    /* renamed from: w */
    public static void m96555w(Object obj, long j, long j2) {
        f21768d.f19944a.putLong(obj, j, j2);
    }

    /* renamed from: x */
    public static void m96554x(Object obj, long j, Object obj2) {
        f21768d.f19944a.putObject(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m96553y(Object obj, long j) {
        return ((byte) ((f21768d.f19944a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m96552z(Object obj, long j) {
        return ((byte) ((f21768d.f19944a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }
}
