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
/* renamed from: m89  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44919m89 {

    /* renamed from: a */
    public static final Unsafe f97409a;

    /* renamed from: b */
    public static final Class f97410b;

    /* renamed from: c */
    public static final boolean f97411c;

    /* renamed from: d */
    public static final AbstractC40175e89 f97412d;

    /* renamed from: e */
    public static final boolean f97413e;

    /* renamed from: f */
    public static final boolean f97414f;

    /* renamed from: g */
    public static final long f97415g;

    /* renamed from: h */
    public static final boolean f97416h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    static {
        boolean z;
        AbstractC40175e89 abstractC40175e89;
        boolean z2;
        Field m26277b;
        AbstractC40175e89 abstractC40175e892;
        Unsafe m26267l = m26267l();
        f97409a = m26267l;
        int i = C46214oK8.f101793a;
        f97410b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean m26283A = m26283A(cls);
        f97411c = m26283A;
        boolean m26283A2 = m26283A(Integer.TYPE);
        AbstractC40175e89 abstractC40175e893 = null;
        if (m26267l != null) {
            if (m26283A) {
                abstractC40175e893 = new X79(m26267l);
            } else if (m26283A2) {
                abstractC40175e893 = new P79(m26267l);
            }
        }
        f97412d = abstractC40175e893;
        boolean z3 = true;
        if (abstractC40175e893 != null) {
            try {
                Class<?> cls2 = abstractC40175e893.f78012a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m26266m(th);
            }
            if (m26277b() != null) {
                z = true;
                f97413e = z;
                abstractC40175e89 = f97412d;
                if (abstractC40175e89 != null) {
                    try {
                        Class<?> cls3 = abstractC40175e89.f78012a.getClass();
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
                        m26266m(th2);
                    }
                    f97414f = z2;
                    f97415g = m26279E(byte[].class);
                    m26279E(boolean[].class);
                    m26278a(boolean[].class);
                    m26279E(int[].class);
                    m26278a(int[].class);
                    m26279E(long[].class);
                    m26278a(long[].class);
                    m26279E(float[].class);
                    m26278a(float[].class);
                    m26279E(double[].class);
                    m26278a(double[].class);
                    m26279E(Object[].class);
                    m26278a(Object[].class);
                    m26277b = m26277b();
                    if (m26277b != null && (abstractC40175e892 = f97412d) != null) {
                        abstractC40175e892.f78012a.objectFieldOffset(m26277b);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    f97416h = z3;
                }
                z2 = false;
                f97414f = z2;
                f97415g = m26279E(byte[].class);
                m26279E(boolean[].class);
                m26278a(boolean[].class);
                m26279E(int[].class);
                m26278a(int[].class);
                m26279E(long[].class);
                m26278a(long[].class);
                m26279E(float[].class);
                m26278a(float[].class);
                m26279E(double[].class);
                m26278a(double[].class);
                m26279E(Object[].class);
                m26278a(Object[].class);
                m26277b = m26277b();
                if (m26277b != null) {
                    abstractC40175e892.f78012a.objectFieldOffset(m26277b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f97416h = z3;
            }
        }
        z = false;
        f97413e = z;
        abstractC40175e89 = f97412d;
        if (abstractC40175e89 != null) {
        }
        z2 = false;
        f97414f = z2;
        f97415g = m26279E(byte[].class);
        m26279E(boolean[].class);
        m26278a(boolean[].class);
        m26279E(int[].class);
        m26278a(int[].class);
        m26279E(long[].class);
        m26278a(long[].class);
        m26279E(float[].class);
        m26278a(float[].class);
        m26279E(double[].class);
        m26278a(double[].class);
        m26279E(Object[].class);
        m26278a(Object[].class);
        m26277b = m26277b();
        if (m26277b != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f97416h = z3;
    }

    private C44919m89() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m26283A(Class cls) {
        int i = C46214oK8.f101793a;
        try {
            Class cls2 = f97410b;
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
    public static boolean m26282B(Object obj, long j) {
        return f97412d.mo43180g(obj, j);
    }

    /* renamed from: C */
    public static boolean m26281C() {
        return f97414f;
    }

    /* renamed from: D */
    public static boolean m26280D() {
        return f97413e;
    }

    /* renamed from: E */
    public static int m26279E(Class cls) {
        if (f97414f) {
            return f97412d.f78012a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m26278a(Class cls) {
        if (f97414f) {
            return f97412d.f78012a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m26277b() {
        int i = C46214oK8.f101793a;
        Field m26276c = m26276c(Buffer.class, "effectiveDirectAddress");
        if (m26276c == null) {
            Field m26276c2 = m26276c(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (m26276c2 != null && m26276c2.getType() == Long.TYPE) {
                return m26276c2;
            }
            return null;
        }
        return m26276c;
    }

    /* renamed from: c */
    public static Field m26276c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m26275d(Object obj, long j, byte b) {
        AbstractC40175e89 abstractC40175e89 = f97412d;
        long j2 = (-4) & j;
        int i = abstractC40175e89.f78012a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        abstractC40175e89.f78012a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    /* renamed from: e */
    public static void m26274e(Object obj, long j, byte b) {
        AbstractC40175e89 abstractC40175e89 = f97412d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abstractC40175e89.f78012a.putInt(obj, j2, ((255 & b) << i) | (abstractC40175e89.f78012a.getInt(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: f */
    public static double m26273f(Object obj, long j) {
        return f97412d.mo43186a(obj, j);
    }

    /* renamed from: g */
    public static float m26272g(Object obj, long j) {
        return f97412d.mo43185b(obj, j);
    }

    /* renamed from: h */
    public static int m26271h(Object obj, long j) {
        return f97412d.f78012a.getInt(obj, j);
    }

    /* renamed from: i */
    public static long m26270i(Object obj, long j) {
        return f97412d.f78012a.getLong(obj, j);
    }

    /* renamed from: j */
    public static Object m26269j(Class cls) {
        try {
            return f97409a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m26268k(Object obj, long j) {
        return f97412d.f78012a.getObject(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m26267l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new J79());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m26266m(Throwable th) {
        Logger.getLogger(C44919m89.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: r */
    public static void m26261r(Object obj, long j, boolean z) {
        f97412d.mo43184c(obj, j, z);
    }

    /* renamed from: s */
    public static void m26260s(byte[] bArr, long j, byte b) {
        f97412d.mo43183d(bArr, f97415g + j, b);
    }

    /* renamed from: t */
    public static void m26259t(Object obj, long j, double d) {
        f97412d.mo43182e(obj, j, d);
    }

    /* renamed from: u */
    public static void m26258u(Object obj, long j, float f) {
        f97412d.mo43181f(obj, j, f);
    }

    /* renamed from: v */
    public static void m26257v(Object obj, long j, int i) {
        f97412d.f78012a.putInt(obj, j, i);
    }

    /* renamed from: w */
    public static void m26256w(Object obj, long j, long j2) {
        f97412d.f78012a.putLong(obj, j, j2);
    }

    /* renamed from: x */
    public static void m26255x(Object obj, long j, Object obj2) {
        f97412d.f78012a.putObject(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m26254y(Object obj, long j) {
        return ((byte) ((f97412d.f78012a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m26253z(Object obj, long j) {
        return ((byte) ((f97412d.f78012a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }
}
