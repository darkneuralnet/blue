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
/* renamed from: ze6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52917ze6 {

    /* renamed from: a */
    public static final Unsafe f121692a = m931D();

    /* renamed from: b */
    public static final Class<?> f121693b = C23288ib.m33780b();

    /* renamed from: c */
    public static final boolean f121694c = m900o(Long.TYPE);

    /* renamed from: d */
    public static final boolean f121695d = m900o(Integer.TYPE);

    /* renamed from: e */
    public static final AbstractC31072e f121696e = m933B();

    /* renamed from: f */
    public static final boolean f121697f = m915T();

    /* renamed from: g */
    public static final boolean f121698g = m916S();

    /* renamed from: h */
    public static final long f121699h;

    /* renamed from: i */
    public static final long f121700i;

    /* renamed from: j */
    public static final long f121701j;

    /* renamed from: k */
    public static final long f121702k;

    /* renamed from: l */
    public static final long f121703l;

    /* renamed from: m */
    public static final long f121704m;

    /* renamed from: n */
    public static final long f121705n;

    /* renamed from: o */
    public static final long f121706o;

    /* renamed from: p */
    public static final long f121707p;

    /* renamed from: q */
    public static final long f121708q;

    /* renamed from: r */
    public static final long f121709r;

    /* renamed from: s */
    public static final long f121710s;

    /* renamed from: t */
    public static final long f121711t;

    /* renamed from: u */
    public static final long f121712u;

    /* renamed from: v */
    public static final int f121713v;

    /* renamed from: w */
    public static final boolean f121714w;

    /* renamed from: ze6$a */
    /* loaded from: classes6.dex */
    public class C31068a implements PrivilegedExceptionAction<Unsafe> {
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

    /* renamed from: ze6$b */
    /* loaded from: classes6.dex */
    public static final class C31069b extends AbstractC31072e {
        public C31069b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: c */
        public boolean mo885c(Object obj, long j) {
            if (C52917ze6.f121714w) {
                return C52917ze6.m896s(obj, j);
            }
            return C52917ze6.m895t(obj, j);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: d */
        public byte mo884d(Object obj, long j) {
            if (C52917ze6.f121714w) {
                return C52917ze6.m893v(obj, j);
            }
            return C52917ze6.m892w(obj, j);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: e */
        public double mo883e(Object obj, long j) {
            return Double.longBitsToDouble(m880h(obj, j));
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: f */
        public float mo882f(Object obj, long j) {
            return Float.intBitsToFloat(m881g(obj, j));
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: k */
        public void mo877k(Object obj, long j, boolean z) {
            if (C52917ze6.f121714w) {
                C52917ze6.m926I(obj, j, z);
            } else {
                C52917ze6.m925J(obj, j, z);
            }
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: l */
        public void mo876l(Object obj, long j, byte b) {
            if (C52917ze6.f121714w) {
                C52917ze6.m923L(obj, j, b);
            } else {
                C52917ze6.m922M(obj, j, b);
            }
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: m */
        public void mo875m(Object obj, long j, double d) {
            m872p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: n */
        public void mo874n(Object obj, long j, float f) {
            m873o(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: s */
        public boolean mo869s() {
            return false;
        }
    }

    /* renamed from: ze6$c */
    /* loaded from: classes6.dex */
    public static final class C31070c extends AbstractC31072e {
        public C31070c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: c */
        public boolean mo885c(Object obj, long j) {
            if (C52917ze6.f121714w) {
                return C52917ze6.m896s(obj, j);
            }
            return C52917ze6.m895t(obj, j);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: d */
        public byte mo884d(Object obj, long j) {
            if (C52917ze6.f121714w) {
                return C52917ze6.m893v(obj, j);
            }
            return C52917ze6.m892w(obj, j);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: e */
        public double mo883e(Object obj, long j) {
            return Double.longBitsToDouble(m880h(obj, j));
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: f */
        public float mo882f(Object obj, long j) {
            return Float.intBitsToFloat(m881g(obj, j));
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: k */
        public void mo877k(Object obj, long j, boolean z) {
            if (C52917ze6.f121714w) {
                C52917ze6.m926I(obj, j, z);
            } else {
                C52917ze6.m925J(obj, j, z);
            }
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: l */
        public void mo876l(Object obj, long j, byte b) {
            if (C52917ze6.f121714w) {
                C52917ze6.m923L(obj, j, b);
            } else {
                C52917ze6.m922M(obj, j, b);
            }
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: m */
        public void mo875m(Object obj, long j, double d) {
            m872p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: n */
        public void mo874n(Object obj, long j, float f) {
            m873o(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: s */
        public boolean mo869s() {
            return false;
        }
    }

    /* renamed from: ze6$d */
    /* loaded from: classes6.dex */
    public static final class C31071d extends AbstractC31072e {
        public C31071d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: c */
        public boolean mo885c(Object obj, long j) {
            return this.f121715a.getBoolean(obj, j);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: d */
        public byte mo884d(Object obj, long j) {
            return this.f121715a.getByte(obj, j);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: e */
        public double mo883e(Object obj, long j) {
            return this.f121715a.getDouble(obj, j);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: f */
        public float mo882f(Object obj, long j) {
            return this.f121715a.getFloat(obj, j);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: k */
        public void mo877k(Object obj, long j, boolean z) {
            this.f121715a.putBoolean(obj, j, z);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: l */
        public void mo876l(Object obj, long j, byte b) {
            this.f121715a.putByte(obj, j, b);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: m */
        public void mo875m(Object obj, long j, double d) {
            this.f121715a.putDouble(obj, j, d);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: n */
        public void mo874n(Object obj, long j, float f) {
            this.f121715a.putFloat(obj, j, f);
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: r */
        public boolean mo870r() {
            if (!super.mo870r()) {
                return false;
            }
            try {
                Class<?> cls = this.f121715a.getClass();
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
                C52917ze6.m928G(th);
                return false;
            }
        }

        @Override // p000.C52917ze6.AbstractC31072e
        /* renamed from: s */
        public boolean mo869s() {
            if (!super.mo869s()) {
                return false;
            }
            try {
                Class<?> cls = this.f121715a.getClass();
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
                C52917ze6.m928G(th);
                return false;
            }
        }
    }

    /* renamed from: ze6$e */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC31072e {

        /* renamed from: a */
        public Unsafe f121715a;

        public AbstractC31072e(Unsafe unsafe) {
            this.f121715a = unsafe;
        }

        /* renamed from: a */
        public final int m887a(Class<?> cls) {
            return this.f121715a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m886b(Class<?> cls) {
            return this.f121715a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo885c(Object obj, long j);

        /* renamed from: d */
        public abstract byte mo884d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo883e(Object obj, long j);

        /* renamed from: f */
        public abstract float mo882f(Object obj, long j);

        /* renamed from: g */
        public final int m881g(Object obj, long j) {
            return this.f121715a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long m880h(Object obj, long j) {
            return this.f121715a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object m879i(Object obj, long j) {
            return this.f121715a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long m878j(Field field) {
            return this.f121715a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo877k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo876l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo875m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo874n(Object obj, long j, float f);

        /* renamed from: o */
        public final void m873o(Object obj, long j, int i) {
            this.f121715a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void m872p(Object obj, long j, long j2) {
            this.f121715a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void m871q(Object obj, long j, Object obj2) {
            this.f121715a.putObject(obj, j, obj2);
        }

        /* renamed from: r */
        public boolean mo870r() {
            Unsafe unsafe = this.f121715a;
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
                C52917ze6.m928G(th);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo869s() {
            Unsafe unsafe = this.f121715a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (C52917ze6.m901n() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C52917ze6.m928G(th);
                return false;
            }
        }
    }

    static {
        boolean z;
        long m903l = m903l(byte[].class);
        f121699h = m903l;
        f121700i = m903l(boolean[].class);
        f121701j = m902m(boolean[].class);
        f121702k = m903l(int[].class);
        f121703l = m902m(int[].class);
        f121704m = m903l(long[].class);
        f121705n = m902m(long[].class);
        f121706o = m903l(float[].class);
        f121707p = m902m(float[].class);
        f121708q = m903l(double[].class);
        f121709r = m902m(double[].class);
        f121710s = m903l(Object[].class);
        f121711t = m902m(Object[].class);
        f121712u = m898q(m901n());
        f121713v = (int) (m903l & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f121714w = z;
    }

    private C52917ze6() {
    }

    /* renamed from: A */
    public static long m934A(Object obj, long j) {
        return f121696e.m880h(obj, j);
    }

    /* renamed from: B */
    public static AbstractC31072e m933B() {
        Unsafe unsafe = f121692a;
        if (unsafe == null) {
            return null;
        }
        if (C23288ib.m33779c()) {
            if (f121694c) {
                return new C31070c(unsafe);
            }
            if (!f121695d) {
                return null;
            }
            return new C31069b(unsafe);
        }
        return new C31071d(unsafe);
    }

    /* renamed from: C */
    public static Object m932C(Object obj, long j) {
        return f121696e.m879i(obj, j);
    }

    /* renamed from: D */
    public static Unsafe m931D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C31068a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static boolean m930E() {
        return f121698g;
    }

    /* renamed from: F */
    public static boolean m929F() {
        return f121697f;
    }

    /* renamed from: G */
    public static void m928G(Throwable th) {
        Logger logger = Logger.getLogger(C52917ze6.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: H */
    public static void m927H(Object obj, long j, boolean z) {
        f121696e.mo877k(obj, j, z);
    }

    /* renamed from: I */
    public static void m926I(Object obj, long j, boolean z) {
        m923L(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: J */
    public static void m925J(Object obj, long j, boolean z) {
        m922M(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: K */
    public static void m924K(byte[] bArr, long j, byte b) {
        f121696e.mo876l(bArr, f121699h + j, b);
    }

    /* renamed from: L */
    public static void m923L(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m889z = m889z(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m919P(obj, j2, ((255 & b) << i) | (m889z & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: M */
    public static void m922M(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m919P(obj, j2, ((255 & b) << i) | (m889z(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: N */
    public static void m921N(Object obj, long j, double d) {
        f121696e.mo875m(obj, j, d);
    }

    /* renamed from: O */
    public static void m920O(Object obj, long j, float f) {
        f121696e.mo874n(obj, j, f);
    }

    /* renamed from: P */
    public static void m919P(Object obj, long j, int i) {
        f121696e.m873o(obj, j, i);
    }

    /* renamed from: Q */
    public static void m918Q(Object obj, long j, long j2) {
        f121696e.m872p(obj, j, j2);
    }

    /* renamed from: R */
    public static void m917R(Object obj, long j, Object obj2) {
        f121696e.m871q(obj, j, obj2);
    }

    /* renamed from: S */
    public static boolean m916S() {
        AbstractC31072e abstractC31072e = f121696e;
        if (abstractC31072e == null) {
            return false;
        }
        return abstractC31072e.mo870r();
    }

    /* renamed from: T */
    public static boolean m915T() {
        AbstractC31072e abstractC31072e = f121696e;
        if (abstractC31072e == null) {
            return false;
        }
        return abstractC31072e.mo869s();
    }

    /* renamed from: k */
    public static <T> T m904k(Class<T> cls) {
        try {
            return (T) f121692a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l */
    public static int m903l(Class<?> cls) {
        if (f121698g) {
            return f121696e.m887a(cls);
        }
        return -1;
    }

    /* renamed from: m */
    public static int m902m(Class<?> cls) {
        if (f121698g) {
            return f121696e.m886b(cls);
        }
        return -1;
    }

    /* renamed from: n */
    public static Field m901n() {
        Field m899p;
        if (C23288ib.m33779c() && (m899p = m899p(Buffer.class, "effectiveDirectAddress")) != null) {
            return m899p;
        }
        Field m899p2 = m899p(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        if (m899p2 == null || m899p2.getType() != Long.TYPE) {
            return null;
        }
        return m899p2;
    }

    /* renamed from: o */
    public static boolean m900o(Class<?> cls) {
        if (!C23288ib.m33779c()) {
            return false;
        }
        try {
            Class<?> cls2 = f121693b;
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
    public static Field m899p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static long m898q(Field field) {
        AbstractC31072e abstractC31072e;
        if (field == null || (abstractC31072e = f121696e) == null) {
            return -1L;
        }
        return abstractC31072e.m878j(field);
    }

    /* renamed from: r */
    public static boolean m897r(Object obj, long j) {
        return f121696e.mo885c(obj, j);
    }

    /* renamed from: s */
    public static boolean m896s(Object obj, long j) {
        return m893v(obj, j) != 0;
    }

    /* renamed from: t */
    public static boolean m895t(Object obj, long j) {
        return m892w(obj, j) != 0;
    }

    /* renamed from: u */
    public static byte m894u(byte[] bArr, long j) {
        return f121696e.mo884d(bArr, f121699h + j);
    }

    /* renamed from: v */
    public static byte m893v(Object obj, long j) {
        return (byte) ((m889z(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: w */
    public static byte m892w(Object obj, long j) {
        return (byte) ((m889z(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: x */
    public static double m891x(Object obj, long j) {
        return f121696e.mo883e(obj, j);
    }

    /* renamed from: y */
    public static float m890y(Object obj, long j) {
        return f121696e.mo882f(obj, j);
    }

    /* renamed from: z */
    public static int m889z(Object obj, long j) {
        return f121696e.m881g(obj, j);
    }
}
