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
/* renamed from: Xv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37192Xv8 {

    /* renamed from: a */
    public static final Unsafe f44245a;

    /* renamed from: b */
    public static final Class f44246b;

    /* renamed from: c */
    public static final boolean f44247c;

    /* renamed from: d */
    public static final AbstractC33916Jv8 f44248d;

    /* renamed from: e */
    public static final boolean f44249e;

    /* renamed from: f */
    public static final boolean f44250f;

    /* renamed from: g */
    public static final long f44251g;

    /* renamed from: h */
    public static final boolean f44252h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    static {
        boolean z;
        AbstractC33916Jv8 abstractC33916Jv8;
        boolean z2;
        Field m76077b;
        AbstractC33916Jv8 abstractC33916Jv82;
        Unsafe m76067l = m76067l();
        f44245a = m76067l;
        int i = C49267tU7.f110543a;
        f44246b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean m76083A = m76083A(cls);
        f44247c = m76083A;
        boolean m76083A2 = m76083A(Integer.TYPE);
        AbstractC33916Jv8 abstractC33916Jv83 = null;
        if (m76067l != null) {
            if (m76083A) {
                abstractC33916Jv83 = new C50717vv8(m76067l);
            } else if (m76083A2) {
                abstractC33916Jv83 = new C43010iv8(m76067l);
            }
        }
        f44248d = abstractC33916Jv83;
        boolean z3 = true;
        if (abstractC33916Jv83 != null) {
            try {
                Class<?> cls2 = abstractC33916Jv83.f18780a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                m76066m(th);
            }
            if (m76077b() != null) {
                z = true;
                f44249e = z;
                abstractC33916Jv8 = f44248d;
                if (abstractC33916Jv8 != null) {
                    try {
                        Class<?> cls3 = abstractC33916Jv8.f18780a.getClass();
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
                        m76066m(th2);
                    }
                    f44250f = z2;
                    f44251g = m76079E(byte[].class);
                    m76079E(boolean[].class);
                    m76078a(boolean[].class);
                    m76079E(int[].class);
                    m76078a(int[].class);
                    m76079E(long[].class);
                    m76078a(long[].class);
                    m76079E(float[].class);
                    m76078a(float[].class);
                    m76079E(double[].class);
                    m76078a(double[].class);
                    m76079E(Object[].class);
                    m76078a(Object[].class);
                    m76077b = m76077b();
                    if (m76077b != null && (abstractC33916Jv82 = f44248d) != null) {
                        abstractC33916Jv82.f18780a.objectFieldOffset(m76077b);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    f44252h = z3;
                }
                z2 = false;
                f44250f = z2;
                f44251g = m76079E(byte[].class);
                m76079E(boolean[].class);
                m76078a(boolean[].class);
                m76079E(int[].class);
                m76078a(int[].class);
                m76079E(long[].class);
                m76078a(long[].class);
                m76079E(float[].class);
                m76078a(float[].class);
                m76079E(double[].class);
                m76078a(double[].class);
                m76079E(Object[].class);
                m76078a(Object[].class);
                m76077b = m76077b();
                if (m76077b != null) {
                    abstractC33916Jv82.f18780a.objectFieldOffset(m76077b);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f44252h = z3;
            }
        }
        z = false;
        f44249e = z;
        abstractC33916Jv8 = f44248d;
        if (abstractC33916Jv8 != null) {
        }
        z2 = false;
        f44250f = z2;
        f44251g = m76079E(byte[].class);
        m76079E(boolean[].class);
        m76078a(boolean[].class);
        m76079E(int[].class);
        m76078a(int[].class);
        m76079E(long[].class);
        m76078a(long[].class);
        m76079E(float[].class);
        m76078a(float[].class);
        m76079E(double[].class);
        m76078a(double[].class);
        m76079E(Object[].class);
        m76078a(Object[].class);
        m76077b = m76077b();
        if (m76077b != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f44252h = z3;
    }

    private C37192Xv8() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m76083A(Class cls) {
        int i = C49267tU7.f110543a;
        try {
            Class cls2 = f44246b;
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
    public static boolean m76082B(Object obj, long j) {
        return f44248d.mo7736g(obj, j);
    }

    /* renamed from: C */
    public static boolean m76081C() {
        return f44250f;
    }

    /* renamed from: D */
    public static boolean m76080D() {
        return f44249e;
    }

    /* renamed from: E */
    public static int m76079E(Class cls) {
        if (f44250f) {
            return f44248d.f18780a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m76078a(Class cls) {
        if (f44250f) {
            return f44248d.f18780a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m76077b() {
        int i = C49267tU7.f110543a;
        Field m76076c = m76076c(Buffer.class, "effectiveDirectAddress");
        if (m76076c == null) {
            Field m76076c2 = m76076c(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (m76076c2 != null && m76076c2.getType() == Long.TYPE) {
                return m76076c2;
            }
            return null;
        }
        return m76076c;
    }

    /* renamed from: c */
    public static Field m76076c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m76075d(Object obj, long j, byte b) {
        AbstractC33916Jv8 abstractC33916Jv8 = f44248d;
        long j2 = (-4) & j;
        int i = abstractC33916Jv8.f18780a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        abstractC33916Jv8.f18780a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    /* renamed from: e */
    public static void m76074e(Object obj, long j, byte b) {
        AbstractC33916Jv8 abstractC33916Jv8 = f44248d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abstractC33916Jv8.f18780a.putInt(obj, j2, ((255 & b) << i) | (abstractC33916Jv8.f18780a.getInt(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: f */
    public static double m76073f(Object obj, long j) {
        return f44248d.mo7742a(obj, j);
    }

    /* renamed from: g */
    public static float m76072g(Object obj, long j) {
        return f44248d.mo7741b(obj, j);
    }

    /* renamed from: h */
    public static int m76071h(Object obj, long j) {
        return f44248d.f18780a.getInt(obj, j);
    }

    /* renamed from: i */
    public static long m76070i(Object obj, long j) {
        return f44248d.f18780a.getLong(obj, j);
    }

    /* renamed from: j */
    public static Object m76069j(Class cls) {
        try {
            return f44245a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m76068k(Object obj, long j) {
        return f44248d.f18780a.getObject(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m76067l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C36715Vu8());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m76066m(Throwable th) {
        Logger.getLogger(C37192Xv8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: r */
    public static void m76061r(Object obj, long j, boolean z) {
        f44248d.mo7740c(obj, j, z);
    }

    /* renamed from: s */
    public static void m76060s(byte[] bArr, long j, byte b) {
        f44248d.mo7739d(bArr, f44251g + j, b);
    }

    /* renamed from: t */
    public static void m76059t(Object obj, long j, double d) {
        f44248d.mo7738e(obj, j, d);
    }

    /* renamed from: u */
    public static void m76058u(Object obj, long j, float f) {
        f44248d.mo7737f(obj, j, f);
    }

    /* renamed from: v */
    public static void m76057v(Object obj, long j, int i) {
        f44248d.f18780a.putInt(obj, j, i);
    }

    /* renamed from: w */
    public static void m76056w(Object obj, long j, long j2) {
        f44248d.f18780a.putLong(obj, j, j2);
    }

    /* renamed from: x */
    public static void m76055x(Object obj, long j, Object obj2) {
        f44248d.f18780a.putObject(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m76054y(Object obj, long j) {
        return ((byte) ((f44248d.f18780a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m76053z(Object obj, long j) {
        return ((byte) ((f44248d.f18780a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }
}
