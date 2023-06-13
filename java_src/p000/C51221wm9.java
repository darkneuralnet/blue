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
/* renamed from: wm9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51221wm9 {

    /* renamed from: a */
    public static final Unsafe f116503a;

    /* renamed from: b */
    public static final Class f116504b;

    /* renamed from: c */
    public static final boolean f116505c;

    /* renamed from: d */
    public static final AbstractC47665qm9 f116506d;

    /* renamed from: e */
    public static final boolean f116507e;

    /* renamed from: f */
    public static final boolean f116508f;

    /* renamed from: g */
    public static final long f116509g;

    /* renamed from: h */
    public static final boolean f116510h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    static {
        boolean z;
        AbstractC47665qm9 abstractC47665qm9;
        boolean z2;
        Field m6365b;
        AbstractC47665qm9 abstractC47665qm92;
        Unsafe m6355l = m6355l();
        f116503a = m6355l;
        f116504b = C38339b49.m65002a();
        Class<?> cls = Long.TYPE;
        boolean m6371A = m6371A(cls);
        f116505c = m6371A;
        boolean m6371A2 = m6371A(Integer.TYPE);
        AbstractC47665qm9 abstractC47665qm93 = null;
        if (m6355l != null) {
            if (m6371A) {
                abstractC47665qm93 = new C44107km9(m6355l);
            } else if (m6371A2) {
                abstractC47665qm93 = new C40549em9(m6355l);
            }
        }
        f116506d = abstractC47665qm93;
        boolean z3 = true;
        if (abstractC47665qm93 != null) {
            try {
                Class<?> cls2 = abstractC47665qm93.f105784a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m6354m(th);
            }
            if (m6365b() != null) {
                z = true;
                f116507e = z;
                abstractC47665qm9 = f116506d;
                if (abstractC47665qm9 != null) {
                    try {
                        Class<?> cls3 = abstractC47665qm9.f105784a.getClass();
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
                        m6354m(th2);
                    }
                    f116508f = z2;
                    f116509g = m6367E(byte[].class);
                    m6367E(boolean[].class);
                    m6366a(boolean[].class);
                    m6367E(int[].class);
                    m6366a(int[].class);
                    m6367E(long[].class);
                    m6366a(long[].class);
                    m6367E(float[].class);
                    m6366a(float[].class);
                    m6367E(double[].class);
                    m6366a(double[].class);
                    m6367E(Object[].class);
                    m6366a(Object[].class);
                    m6365b = m6365b();
                    if (m6365b != null && (abstractC47665qm92 = f116506d) != null) {
                        abstractC47665qm92.m17083l(m6365b);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    f116510h = z3;
                }
                z2 = false;
                f116508f = z2;
                f116509g = m6367E(byte[].class);
                m6367E(boolean[].class);
                m6366a(boolean[].class);
                m6367E(int[].class);
                m6366a(int[].class);
                m6367E(long[].class);
                m6366a(long[].class);
                m6367E(float[].class);
                m6366a(float[].class);
                m6367E(double[].class);
                m6366a(double[].class);
                m6367E(Object[].class);
                m6366a(Object[].class);
                m6365b = m6365b();
                if (m6365b != null) {
                    abstractC47665qm92.m17083l(m6365b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f116510h = z3;
            }
        }
        z = false;
        f116507e = z;
        abstractC47665qm9 = f116506d;
        if (abstractC47665qm9 != null) {
        }
        z2 = false;
        f116508f = z2;
        f116509g = m6367E(byte[].class);
        m6367E(boolean[].class);
        m6366a(boolean[].class);
        m6367E(int[].class);
        m6366a(int[].class);
        m6367E(long[].class);
        m6366a(long[].class);
        m6367E(float[].class);
        m6366a(float[].class);
        m6367E(double[].class);
        m6366a(double[].class);
        m6367E(Object[].class);
        m6366a(Object[].class);
        m6365b = m6365b();
        if (m6365b != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f116510h = z3;
    }

    private C51221wm9() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m6371A(Class cls) {
        int i = C38339b49.f56884a;
        try {
            Class cls2 = f116504b;
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
    public static boolean m6370B(Object obj, long j) {
        return f116506d.mo17088g(obj, j);
    }

    /* renamed from: C */
    public static boolean m6369C() {
        return f116508f;
    }

    /* renamed from: D */
    public static boolean m6368D() {
        return f116507e;
    }

    /* renamed from: E */
    public static int m6367E(Class cls) {
        if (f116508f) {
            return f116506d.m17087h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m6366a(Class cls) {
        if (f116508f) {
            return f116506d.m17086i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m6365b() {
        int i = C38339b49.f56884a;
        Field m6364c = m6364c(Buffer.class, "effectiveDirectAddress");
        if (m6364c == null) {
            Field m6364c2 = m6364c(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (m6364c2 != null && m6364c2.getType() == Long.TYPE) {
                return m6364c2;
            }
            return null;
        }
        return m6364c;
    }

    /* renamed from: c */
    public static Field m6364c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m6363d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC47665qm9 abstractC47665qm9 = f116506d;
        int m17085j = abstractC47665qm9.m17085j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        abstractC47665qm9.m17081n(obj, j2, ((255 & b) << i) | (m17085j & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: e */
    public static void m6362e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC47665qm9 abstractC47665qm9 = f116506d;
        int i = (((int) j) & 3) << 3;
        abstractC47665qm9.m17081n(obj, j2, ((255 & b) << i) | (abstractC47665qm9.m17085j(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: f */
    public static double m6361f(Object obj, long j) {
        return f116506d.mo17094a(obj, j);
    }

    /* renamed from: g */
    public static float m6360g(Object obj, long j) {
        return f116506d.mo17093b(obj, j);
    }

    /* renamed from: h */
    public static int m6359h(Object obj, long j) {
        return f116506d.m17085j(obj, j);
    }

    /* renamed from: i */
    public static long m6358i(Object obj, long j) {
        return f116506d.m17084k(obj, j);
    }

    /* renamed from: j */
    public static Object m6357j(Class cls) {
        try {
            return f116503a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m6356k(Object obj, long j) {
        return f116506d.m17082m(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m6355l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Yl9());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m6354m(Throwable th) {
        Logger.getLogger(C51221wm9.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: r */
    public static void m6349r(Object obj, long j, boolean z) {
        f116506d.mo17092c(obj, j, z);
    }

    /* renamed from: s */
    public static void m6348s(byte[] bArr, long j, byte b) {
        f116506d.mo17091d(bArr, f116509g + j, b);
    }

    /* renamed from: t */
    public static void m6347t(Object obj, long j, double d) {
        f116506d.mo17090e(obj, j, d);
    }

    /* renamed from: u */
    public static void m6346u(Object obj, long j, float f) {
        f116506d.mo17089f(obj, j, f);
    }

    /* renamed from: v */
    public static void m6345v(Object obj, long j, int i) {
        f116506d.m17081n(obj, j, i);
    }

    /* renamed from: w */
    public static void m6344w(Object obj, long j, long j2) {
        f116506d.m17080o(obj, j, j2);
    }

    /* renamed from: x */
    public static void m6343x(Object obj, long j, Object obj2) {
        f116506d.m17079p(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m6342y(Object obj, long j) {
        return ((byte) ((f116506d.m17085j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m6341z(Object obj, long j) {
        return ((byte) ((f116506d.m17085j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }
}
