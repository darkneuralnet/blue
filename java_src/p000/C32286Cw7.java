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
/* renamed from: Cw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32286Cw7 {

    /* renamed from: a */
    public static final Unsafe f4945a;

    /* renamed from: b */
    public static final Class f4946b;

    /* renamed from: c */
    public static final boolean f4947c;

    /* renamed from: d */
    public static final AbstractC32052Bw7 f4948d;

    /* renamed from: e */
    public static final boolean f4949e;

    /* renamed from: f */
    public static final boolean f4950f;

    /* renamed from: g */
    public static final long f4951g;

    /* renamed from: h */
    public static final boolean f4952h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    static {
        boolean z;
        AbstractC32052Bw7 abstractC32052Bw7;
        boolean z2;
        Field m111251b;
        AbstractC32052Bw7 abstractC32052Bw72;
        Unsafe m111241l = m111241l();
        f4945a = m111241l;
        f4946b = C32016Bs7.m113420a();
        Class<?> cls = Long.TYPE;
        boolean m111257A = m111257A(cls);
        f4947c = m111257A;
        boolean m111257A2 = m111257A(Integer.TYPE);
        AbstractC32052Bw7 abstractC32052Bw73 = null;
        if (m111241l != null) {
            if (m111257A) {
                abstractC32052Bw73 = new C31818Aw7(m111241l);
            } else if (m111257A2) {
                abstractC32052Bw73 = new C53098zw7(m111241l);
            }
        }
        f4948d = abstractC32052Bw73;
        boolean z3 = true;
        if (abstractC32052Bw73 != null) {
            try {
                Class<?> cls2 = abstractC32052Bw73.f3070a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m111240m(th);
            }
            if (m111251b() != null) {
                z = true;
                f4949e = z;
                abstractC32052Bw7 = f4948d;
                if (abstractC32052Bw7 != null) {
                    try {
                        Class<?> cls3 = abstractC32052Bw7.f3070a.getClass();
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
                        m111240m(th2);
                    }
                    f4950f = z2;
                    f4951g = m111253E(byte[].class);
                    m111253E(boolean[].class);
                    m111252a(boolean[].class);
                    m111253E(int[].class);
                    m111252a(int[].class);
                    m111253E(long[].class);
                    m111252a(long[].class);
                    m111253E(float[].class);
                    m111252a(float[].class);
                    m111253E(double[].class);
                    m111252a(double[].class);
                    m111253E(Object[].class);
                    m111252a(Object[].class);
                    m111251b = m111251b();
                    if (m111251b != null && (abstractC32052Bw72 = f4948d) != null) {
                        abstractC32052Bw72.m113305l(m111251b);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    f4952h = z3;
                }
                z2 = false;
                f4950f = z2;
                f4951g = m111253E(byte[].class);
                m111253E(boolean[].class);
                m111252a(boolean[].class);
                m111253E(int[].class);
                m111252a(int[].class);
                m111253E(long[].class);
                m111252a(long[].class);
                m111253E(float[].class);
                m111252a(float[].class);
                m111253E(double[].class);
                m111252a(double[].class);
                m111253E(Object[].class);
                m111252a(Object[].class);
                m111251b = m111251b();
                if (m111251b != null) {
                    abstractC32052Bw72.m113305l(m111251b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f4952h = z3;
            }
        }
        z = false;
        f4949e = z;
        abstractC32052Bw7 = f4948d;
        if (abstractC32052Bw7 != null) {
        }
        z2 = false;
        f4950f = z2;
        f4951g = m111253E(byte[].class);
        m111253E(boolean[].class);
        m111252a(boolean[].class);
        m111253E(int[].class);
        m111252a(int[].class);
        m111253E(long[].class);
        m111252a(long[].class);
        m111253E(float[].class);
        m111252a(float[].class);
        m111253E(double[].class);
        m111252a(double[].class);
        m111253E(Object[].class);
        m111252a(Object[].class);
        m111251b = m111251b();
        if (m111251b != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f4952h = z3;
    }

    private C32286Cw7() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m111257A(Class cls) {
        int i = C32016Bs7.f2988a;
        try {
            Class cls2 = f4946b;
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
    public static boolean m111256B(Object obj, long j) {
        return f4948d.mo91g(obj, j);
    }

    /* renamed from: C */
    public static boolean m111255C() {
        return f4950f;
    }

    /* renamed from: D */
    public static boolean m111254D() {
        return f4949e;
    }

    /* renamed from: E */
    public static int m111253E(Class cls) {
        if (f4950f) {
            return f4948d.m113309h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m111252a(Class cls) {
        if (f4950f) {
            return f4948d.m113308i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m111251b() {
        int i = C32016Bs7.f2988a;
        Field m111250c = m111250c(Buffer.class, "effectiveDirectAddress");
        if (m111250c == null) {
            Field m111250c2 = m111250c(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (m111250c2 != null && m111250c2.getType() == Long.TYPE) {
                return m111250c2;
            }
            return null;
        }
        return m111250c;
    }

    /* renamed from: c */
    public static Field m111250c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m111249d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC32052Bw7 abstractC32052Bw7 = f4948d;
        int m113307j = abstractC32052Bw7.m113307j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        abstractC32052Bw7.m113303n(obj, j2, ((255 & b) << i) | (m113307j & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: e */
    public static void m111248e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC32052Bw7 abstractC32052Bw7 = f4948d;
        int i = (((int) j) & 3) << 3;
        abstractC32052Bw7.m113303n(obj, j2, ((255 & b) << i) | (abstractC32052Bw7.m113307j(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: f */
    public static double m111247f(Object obj, long j) {
        return f4948d.mo97a(obj, j);
    }

    /* renamed from: g */
    public static float m111246g(Object obj, long j) {
        return f4948d.mo96b(obj, j);
    }

    /* renamed from: h */
    public static int m111245h(Object obj, long j) {
        return f4948d.m113307j(obj, j);
    }

    /* renamed from: i */
    public static long m111244i(Object obj, long j) {
        return f4948d.m113306k(obj, j);
    }

    /* renamed from: j */
    public static Object m111243j(Class cls) {
        try {
            return f4945a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m111242k(Object obj, long j) {
        return f4948d.m113304m(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m111241l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C52505yw7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m111240m(Throwable th) {
        Logger.getLogger(C32286Cw7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: r */
    public static void m111235r(Object obj, long j, boolean z) {
        f4948d.mo95c(obj, j, z);
    }

    /* renamed from: s */
    public static void m111234s(byte[] bArr, long j, byte b) {
        f4948d.mo94d(bArr, f4951g + j, b);
    }

    /* renamed from: t */
    public static void m111233t(Object obj, long j, double d) {
        f4948d.mo93e(obj, j, d);
    }

    /* renamed from: u */
    public static void m111232u(Object obj, long j, float f) {
        f4948d.mo92f(obj, j, f);
    }

    /* renamed from: v */
    public static void m111231v(Object obj, long j, int i) {
        f4948d.m113303n(obj, j, i);
    }

    /* renamed from: w */
    public static void m111230w(Object obj, long j, long j2) {
        f4948d.m113302o(obj, j, j2);
    }

    /* renamed from: x */
    public static void m111229x(Object obj, long j, Object obj2) {
        f4948d.m113301p(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m111228y(Object obj, long j) {
        return ((byte) ((f4948d.m113307j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m111227z(Object obj, long j) {
        return ((byte) ((f4948d.m113307j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }
}
