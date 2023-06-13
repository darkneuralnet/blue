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
/* renamed from: at8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38229at8 {

    /* renamed from: a */
    public static final Unsafe f56493a;

    /* renamed from: b */
    public static final Class<?> f56494b;

    /* renamed from: c */
    public static final boolean f56495c;

    /* renamed from: d */
    public static final boolean f56496d;

    /* renamed from: e */
    public static final AbstractC34357Ls8 f56497e;

    /* renamed from: f */
    public static final boolean f56498f;

    /* renamed from: g */
    public static final boolean f56499g;

    /* renamed from: h */
    public static final boolean f56500h;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0133  */
    static {
        Unsafe unsafe;
        boolean z;
        AbstractC34357Ls8 abstractC34357Ls8;
        Unsafe unsafe2;
        boolean z2;
        Field m65297y;
        AbstractC34357Ls8 abstractC34357Ls82;
        Unsafe m65315g = m65315g();
        f56493a = m65315g;
        f56494b = Q28.m89027a();
        Class<?> cls = Long.TYPE;
        boolean m65303s = m65303s(cls);
        f56495c = m65303s;
        boolean m65303s2 = m65303s(Integer.TYPE);
        f56496d = m65303s2;
        AbstractC34357Ls8 abstractC34357Ls83 = null;
        if (m65315g != null) {
            if (m65303s) {
                abstractC34357Ls83 = new C51873xs8(m65315g);
            } else if (m65303s2) {
                abstractC34357Ls83 = new C45352ms8(m65315g);
            }
        }
        f56497e = abstractC34357Ls83;
        boolean z3 = true;
        if (abstractC34357Ls83 != null && (unsafe = abstractC34357Ls83.f22181a) != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m65314h(th);
            }
            if (m65297y() != null) {
                z = true;
                f56498f = z;
                abstractC34357Ls8 = f56497e;
                if (abstractC34357Ls8 != null && (unsafe2 = abstractC34357Ls8.f22181a) != null) {
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
                        m65314h(th2);
                    }
                    f56499g = z2;
                    m65299w(byte[].class);
                    m65299w(boolean[].class);
                    m65298x(boolean[].class);
                    m65299w(int[].class);
                    m65298x(int[].class);
                    m65299w(long[].class);
                    m65298x(long[].class);
                    m65299w(float[].class);
                    m65298x(float[].class);
                    m65299w(double[].class);
                    m65298x(double[].class);
                    m65299w(Object[].class);
                    m65298x(Object[].class);
                    m65297y = m65297y();
                    if (m65297y != null && (abstractC34357Ls82 = f56497e) != null) {
                        abstractC34357Ls82.m96250k(m65297y);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    f56500h = z3;
                }
                z2 = false;
                f56499g = z2;
                m65299w(byte[].class);
                m65299w(boolean[].class);
                m65298x(boolean[].class);
                m65299w(int[].class);
                m65298x(int[].class);
                m65299w(long[].class);
                m65298x(long[].class);
                m65299w(float[].class);
                m65298x(float[].class);
                m65299w(double[].class);
                m65298x(double[].class);
                m65299w(Object[].class);
                m65298x(Object[].class);
                m65297y = m65297y();
                if (m65297y != null) {
                    abstractC34357Ls82.m96250k(m65297y);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f56500h = z3;
            }
        }
        z = false;
        f56498f = z;
        abstractC34357Ls8 = f56497e;
        if (abstractC34357Ls8 != null) {
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
            f56499g = z2;
            m65299w(byte[].class);
            m65299w(boolean[].class);
            m65298x(boolean[].class);
            m65299w(int[].class);
            m65298x(int[].class);
            m65299w(long[].class);
            m65298x(long[].class);
            m65299w(float[].class);
            m65298x(float[].class);
            m65299w(double[].class);
            m65298x(double[].class);
            m65299w(Object[].class);
            m65298x(Object[].class);
            m65297y = m65297y();
            if (m65297y != null) {
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            }
            f56500h = z3;
        }
        z2 = false;
        f56499g = z2;
        m65299w(byte[].class);
        m65299w(boolean[].class);
        m65298x(boolean[].class);
        m65299w(int[].class);
        m65298x(int[].class);
        m65299w(long[].class);
        m65298x(long[].class);
        m65299w(float[].class);
        m65298x(float[].class);
        m65299w(double[].class);
        m65298x(double[].class);
        m65299w(Object[].class);
        m65298x(Object[].class);
        m65297y = m65297y();
        if (m65297y != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f56500h = z3;
    }

    private C38229at8() {
    }

    /* renamed from: a */
    public static double m65321a(Object obj, long j) {
        return f56497e.mo4527a(obj, j);
    }

    /* renamed from: b */
    public static float m65320b(Object obj, long j) {
        return f56497e.mo4526b(obj, j);
    }

    /* renamed from: c */
    public static int m65319c(Object obj, long j) {
        return f56497e.m96252i(obj, j);
    }

    /* renamed from: d */
    public static long m65318d(Object obj, long j) {
        return f56497e.m96251j(obj, j);
    }

    /* renamed from: e */
    public static <T> T m65317e(Class<T> cls) {
        try {
            return (T) f56493a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    public static Object m65316f(Object obj, long j) {
        return f56497e.m96249l(obj, j);
    }

    /* renamed from: g */
    public static Unsafe m65315g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C38219as8());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m65314h(Throwable th) {
        Logger logger = Logger.getLogger(C38229at8.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* renamed from: i */
    public static /* synthetic */ void m65313i(Object obj, long j, boolean z) {
        long j2 = (-4) & j;
        AbstractC34357Ls8 abstractC34357Ls8 = f56497e;
        int m96252i = abstractC34357Ls8.m96252i(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        abstractC34357Ls8.m96248m(obj, j2, ((z ? 1 : 0) << i) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i)) & m96252i));
    }

    /* renamed from: j */
    public static /* synthetic */ void m65312j(Object obj, long j, boolean z) {
        long j2 = (-4) & j;
        AbstractC34357Ls8 abstractC34357Ls8 = f56497e;
        int m96252i = abstractC34357Ls8.m96252i(obj, j2);
        int i = (((int) j) & 3) << 3;
        abstractC34357Ls8.m96248m(obj, j2, ((z ? 1 : 0) << i) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i)) & m96252i));
    }

    /* renamed from: k */
    public static void m65311k(Object obj, long j, boolean z) {
        f56497e.mo4525c(obj, j, z);
    }

    /* renamed from: l */
    public static void m65310l(Object obj, long j, double d) {
        f56497e.mo4524d(obj, j, d);
    }

    /* renamed from: m */
    public static void m65309m(Object obj, long j, float f) {
        f56497e.mo4523e(obj, j, f);
    }

    /* renamed from: n */
    public static void m65308n(Object obj, long j, int i) {
        f56497e.m96248m(obj, j, i);
    }

    /* renamed from: o */
    public static void m65307o(Object obj, long j, long j2) {
        f56497e.m96247n(obj, j, j2);
    }

    /* renamed from: p */
    public static void m65306p(Object obj, long j, Object obj2) {
        f56497e.m96246o(obj, j, obj2);
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m65305q(Object obj, long j) {
        if (((byte) ((f56497e.m96252i(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static /* synthetic */ boolean m65304r(Object obj, long j) {
        if (((byte) ((f56497e.m96252i(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m65303s(Class<?> cls) {
        int i = Q28.f29740a;
        try {
            Class<?> cls2 = f56494b;
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

    /* renamed from: t */
    public static boolean m65302t(Object obj, long j) {
        return f56497e.mo4522f(obj, j);
    }

    /* renamed from: u */
    public static boolean m65301u() {
        return f56499g;
    }

    /* renamed from: v */
    public static boolean m65300v() {
        return f56498f;
    }

    /* renamed from: w */
    public static int m65299w(Class<?> cls) {
        if (f56499g) {
            return f56497e.m96254g(cls);
        }
        return -1;
    }

    /* renamed from: x */
    public static int m65298x(Class<?> cls) {
        if (f56499g) {
            return f56497e.m96253h(cls);
        }
        return -1;
    }

    /* renamed from: y */
    public static Field m65297y() {
        int i = Q28.f29740a;
        Field m65296z = m65296z(Buffer.class, "effectiveDirectAddress");
        if (m65296z == null) {
            Field m65296z2 = m65296z(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (m65296z2 != null && m65296z2.getType() == Long.TYPE) {
                return m65296z2;
            }
            return null;
        }
        return m65296z;
    }

    /* renamed from: z */
    public static Field m65296z(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
