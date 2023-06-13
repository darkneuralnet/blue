package p000;

import com.stripe.android.model.PaymentMethod;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import libcore.io.Memory;
import sun.misc.Unsafe;
/* renamed from: Qf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35410Qf8 {

    /* renamed from: a */
    public static final Logger f30714a = Logger.getLogger(C35410Qf8.class.getName());

    /* renamed from: b */
    public static final Unsafe f30715b;

    /* renamed from: c */
    public static final Class<?> f30716c;

    /* renamed from: d */
    public static final boolean f30717d;

    /* renamed from: e */
    public static final boolean f30718e;

    /* renamed from: f */
    public static final AbstractC6839d f30719f;

    /* renamed from: g */
    public static final boolean f30720g;

    /* renamed from: h */
    public static final boolean f30721h;

    /* renamed from: i */
    public static final long f30722i;

    /* renamed from: j */
    public static final long f30723j;

    /* renamed from: k */
    public static final long f30724k;

    /* renamed from: l */
    public static final long f30725l;

    /* renamed from: m */
    public static final long f30726m;

    /* renamed from: n */
    public static final long f30727n;

    /* renamed from: o */
    public static final long f30728o;

    /* renamed from: p */
    public static final long f30729p;

    /* renamed from: q */
    public static final long f30730q;

    /* renamed from: r */
    public static final long f30731r;

    /* renamed from: s */
    public static final long f30732s;

    /* renamed from: t */
    public static final long f30733t;

    /* renamed from: u */
    public static final long f30734u;

    /* renamed from: v */
    public static final long f30735v;

    /* renamed from: w */
    public static final long f30736w;

    /* renamed from: x */
    public static final boolean f30737x;

    /* renamed from: Qf8$a */
    /* loaded from: classes5.dex */
    public static final class C6836a extends AbstractC6839d {
        public C6836a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: b */
        public final void mo88218b(long j, byte b) {
            Memory.pokeByte((int) (j & (-1)), b);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: c */
        public final void mo88217c(Object obj, long j, double d) {
            m88214f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: d */
        public final void mo88216d(Object obj, long j, float f) {
            m88215e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: g */
        public final void mo88213g(Object obj, long j, boolean z) {
            if (C35410Qf8.f30737x) {
                C35410Qf8.m88228r(obj, j, z);
            } else {
                C35410Qf8.m88226t(obj, j, z);
            }
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: h */
        public final void mo88212h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & (-1)), bArr, (int) j, (int) j3);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: i */
        public final void mo88211i(Object obj, long j, byte b) {
            if (C35410Qf8.f30737x) {
                C35410Qf8.m88242d(obj, j, b);
            } else {
                C35410Qf8.m88229q(obj, j, b);
            }
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: l */
        public final boolean mo88208l(Object obj, long j) {
            return C35410Qf8.f30737x ? C35410Qf8.m88251P(obj, j) : C35410Qf8.m88250Q(obj, j);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: m */
        public final float mo88207m(Object obj, long j) {
            return Float.intBitsToFloat(m88210j(obj, j));
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: n */
        public final double mo88206n(Object obj, long j) {
            return Double.longBitsToDouble(m88209k(obj, j));
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: o */
        public final byte mo88205o(Object obj, long j) {
            return C35410Qf8.f30737x ? C35410Qf8.m88253N(obj, j) : C35410Qf8.m88252O(obj, j);
        }
    }

    /* renamed from: Qf8$b */
    /* loaded from: classes5.dex */
    public static final class C6837b extends AbstractC6839d {
        public C6837b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: b */
        public final void mo88218b(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: c */
        public final void mo88217c(Object obj, long j, double d) {
            m88214f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: d */
        public final void mo88216d(Object obj, long j, float f) {
            m88215e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: g */
        public final void mo88213g(Object obj, long j, boolean z) {
            if (C35410Qf8.f30737x) {
                C35410Qf8.m88228r(obj, j, z);
            } else {
                C35410Qf8.m88226t(obj, j, z);
            }
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: h */
        public final void mo88212h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: i */
        public final void mo88211i(Object obj, long j, byte b) {
            if (C35410Qf8.f30737x) {
                C35410Qf8.m88242d(obj, j, b);
            } else {
                C35410Qf8.m88229q(obj, j, b);
            }
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: l */
        public final boolean mo88208l(Object obj, long j) {
            return C35410Qf8.f30737x ? C35410Qf8.m88251P(obj, j) : C35410Qf8.m88250Q(obj, j);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: m */
        public final float mo88207m(Object obj, long j) {
            return Float.intBitsToFloat(m88210j(obj, j));
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: n */
        public final double mo88206n(Object obj, long j) {
            return Double.longBitsToDouble(m88209k(obj, j));
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: o */
        public final byte mo88205o(Object obj, long j) {
            return C35410Qf8.f30737x ? C35410Qf8.m88253N(obj, j) : C35410Qf8.m88252O(obj, j);
        }
    }

    /* renamed from: Qf8$c */
    /* loaded from: classes5.dex */
    public static final class C6838c extends AbstractC6839d {
        public C6838c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: b */
        public final void mo88218b(long j, byte b) {
            this.f30738a.putByte(j, b);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: c */
        public final void mo88217c(Object obj, long j, double d) {
            this.f30738a.putDouble(obj, j, d);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: d */
        public final void mo88216d(Object obj, long j, float f) {
            this.f30738a.putFloat(obj, j, f);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: g */
        public final void mo88213g(Object obj, long j, boolean z) {
            this.f30738a.putBoolean(obj, j, z);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: h */
        public final void mo88212h(byte[] bArr, long j, long j2, long j3) {
            this.f30738a.copyMemory(bArr, C35410Qf8.f30722i + j, (Object) null, j2, j3);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: i */
        public final void mo88211i(Object obj, long j, byte b) {
            this.f30738a.putByte(obj, j, b);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: l */
        public final boolean mo88208l(Object obj, long j) {
            return this.f30738a.getBoolean(obj, j);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: m */
        public final float mo88207m(Object obj, long j) {
            return this.f30738a.getFloat(obj, j);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: n */
        public final double mo88206n(Object obj, long j) {
            return this.f30738a.getDouble(obj, j);
        }

        @Override // p000.C35410Qf8.AbstractC6839d
        /* renamed from: o */
        public final byte mo88205o(Object obj, long j) {
            return this.f30738a.getByte(obj, j);
        }
    }

    /* renamed from: Qf8$d */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC6839d {

        /* renamed from: a */
        public Unsafe f30738a;

        public AbstractC6839d(Unsafe unsafe) {
            this.f30738a = unsafe;
        }

        /* renamed from: a */
        public final long m88219a(Field field) {
            return this.f30738a.objectFieldOffset(field);
        }

        /* renamed from: b */
        public abstract void mo88218b(long j, byte b);

        /* renamed from: c */
        public abstract void mo88217c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo88216d(Object obj, long j, float f);

        /* renamed from: e */
        public final void m88215e(Object obj, long j, int i) {
            this.f30738a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void m88214f(Object obj, long j, long j2) {
            this.f30738a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo88213g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract void mo88212h(byte[] bArr, long j, long j2, long j3);

        /* renamed from: i */
        public abstract void mo88211i(Object obj, long j, byte b);

        /* renamed from: j */
        public final int m88210j(Object obj, long j) {
            return this.f30738a.getInt(obj, j);
        }

        /* renamed from: k */
        public final long m88209k(Object obj, long j) {
            return this.f30738a.getLong(obj, j);
        }

        /* renamed from: l */
        public abstract boolean mo88208l(Object obj, long j);

        /* renamed from: m */
        public abstract float mo88207m(Object obj, long j);

        /* renamed from: n */
        public abstract double mo88206n(Object obj, long j);

        /* renamed from: o */
        public abstract byte mo88205o(Object obj, long j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    static {
        AbstractC6839d c6838c;
        Field m88230p;
        Unsafe m88220z = m88220z();
        f30715b = m88220z;
        f30716c = C31836Ay7.m114804c();
        boolean m88260G = m88260G(Long.TYPE);
        f30717d = m88260G;
        boolean m88260G2 = m88260G(Integer.TYPE);
        f30718e = m88260G2;
        Field field = null;
        if (m88220z != null) {
            if (!C31836Ay7.m114805b()) {
                c6838c = new C6838c(m88220z);
            } else if (m88260G) {
                c6838c = new C6837b(m88220z);
            } else if (m88260G2) {
                c6838c = new C6836a(m88220z);
            }
            f30719f = c6838c;
            f30720g = m88265B();
            f30721h = m88266A();
            f30722i = m88262E(byte[].class);
            f30723j = m88262E(boolean[].class);
            f30724k = m88261F(boolean[].class);
            f30725l = m88262E(int[].class);
            f30726m = m88261F(int[].class);
            f30727n = m88262E(long[].class);
            f30728o = m88261F(long[].class);
            f30729p = m88262E(float[].class);
            f30730q = m88261F(float[].class);
            f30731r = m88262E(double[].class);
            f30732s = m88261F(double[].class);
            f30733t = m88262E(Object[].class);
            f30734u = m88261F(Object[].class);
            f30735v = m88232n(m88264C());
            m88230p = m88230p(String.class, "value");
            if (m88230p != null && m88230p.getType() == char[].class) {
                field = m88230p;
            }
            f30736w = m88232n(field);
            f30737x = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
        }
        c6838c = null;
        f30719f = c6838c;
        f30720g = m88265B();
        f30721h = m88266A();
        f30722i = m88262E(byte[].class);
        f30723j = m88262E(boolean[].class);
        f30724k = m88261F(boolean[].class);
        f30725l = m88262E(int[].class);
        f30726m = m88261F(int[].class);
        f30727n = m88262E(long[].class);
        f30728o = m88261F(long[].class);
        f30729p = m88262E(float[].class);
        f30730q = m88261F(float[].class);
        f30731r = m88262E(double[].class);
        f30732s = m88261F(double[].class);
        f30733t = m88262E(Object[].class);
        f30734u = m88261F(Object[].class);
        f30735v = m88232n(m88264C());
        m88230p = m88230p(String.class, "value");
        if (m88230p != null) {
            field = m88230p;
        }
        f30736w = m88232n(field);
        f30737x = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
    }

    private C35410Qf8() {
    }

    /* renamed from: A */
    public static boolean m88266A() {
        Unsafe unsafe = f30715b;
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
            if (C31836Ay7.m114805b()) {
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
            Logger logger = f30714a;
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
    public static boolean m88265B() {
        Unsafe unsafe = f30715b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m88264C() == null) {
                return false;
            }
            if (C31836Ay7.m114805b()) {
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
            Logger logger = f30714a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: C */
    public static Field m88264C() {
        Field m88230p;
        if (!C31836Ay7.m114805b() || (m88230p = m88230p(Buffer.class, "effectiveDirectAddress")) == null) {
            Field m88230p2 = m88230p(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (m88230p2 == null || m88230p2.getType() != Long.TYPE) {
                return null;
            }
            return m88230p2;
        }
        return m88230p;
    }

    /* renamed from: E */
    public static int m88262E(Class<?> cls) {
        if (f30721h) {
            return f30719f.f30738a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: F */
    public static int m88261F(Class<?> cls) {
        if (f30721h) {
            return f30719f.f30738a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: G */
    public static boolean m88260G(Class<?> cls) {
        if (C31836Ay7.m114805b()) {
            try {
                Class<?> cls2 = f30716c;
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
        return false;
    }

    /* renamed from: H */
    public static int m88259H(Object obj, long j) {
        return f30719f.m88210j(obj, j);
    }

    /* renamed from: I */
    public static long m88258I(Object obj, long j) {
        return f30719f.m88209k(obj, j);
    }

    /* renamed from: J */
    public static boolean m88257J(Object obj, long j) {
        return f30719f.mo88208l(obj, j);
    }

    /* renamed from: K */
    public static float m88256K(Object obj, long j) {
        return f30719f.mo88207m(obj, j);
    }

    /* renamed from: L */
    public static double m88255L(Object obj, long j) {
        return f30719f.mo88206n(obj, j);
    }

    /* renamed from: M */
    public static Object m88254M(Object obj, long j) {
        return f30719f.f30738a.getObject(obj, j);
    }

    /* renamed from: N */
    public static byte m88253N(Object obj, long j) {
        return (byte) (m88259H(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: O */
    public static byte m88252O(Object obj, long j) {
        return (byte) (m88259H(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: P */
    public static boolean m88251P(Object obj, long j) {
        return m88253N(obj, j) != 0;
    }

    /* renamed from: Q */
    public static boolean m88250Q(Object obj, long j) {
        return m88252O(obj, j) != 0;
    }

    /* renamed from: a */
    public static byte m88245a(byte[] bArr, long j) {
        return f30719f.mo88205o(bArr, f30722i + j);
    }

    /* renamed from: b */
    public static long m88244b(Field field) {
        return f30719f.m88219a(field);
    }

    /* renamed from: c */
    public static void m88243c(long j, byte b) {
        f30719f.mo88218b(j, b);
    }

    /* renamed from: d */
    public static void m88242d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m88259H = m88259H(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m88239g(obj, j2, ((255 & b) << i) | (m88259H & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: e */
    public static void m88241e(Object obj, long j, double d) {
        f30719f.mo88217c(obj, j, d);
    }

    /* renamed from: f */
    public static void m88240f(Object obj, long j, float f) {
        f30719f.mo88216d(obj, j, f);
    }

    /* renamed from: g */
    public static void m88239g(Object obj, long j, int i) {
        f30719f.m88215e(obj, j, i);
    }

    /* renamed from: h */
    public static void m88238h(Object obj, long j, long j2) {
        f30719f.m88214f(obj, j, j2);
    }

    /* renamed from: i */
    public static void m88237i(Object obj, long j, Object obj2) {
        f30719f.f30738a.putObject(obj, j, obj2);
    }

    /* renamed from: j */
    public static void m88236j(Object obj, long j, boolean z) {
        f30719f.mo88213g(obj, j, z);
    }

    /* renamed from: k */
    public static void m88235k(byte[] bArr, long j, byte b) {
        f30719f.mo88211i(bArr, f30722i + j, b);
    }

    /* renamed from: l */
    public static void m88234l(byte[] bArr, long j, long j2, long j3) {
        f30719f.mo88212h(bArr, j, j2, j3);
    }

    /* renamed from: n */
    public static long m88232n(Field field) {
        AbstractC6839d abstractC6839d;
        if (field == null || (abstractC6839d = f30719f) == null) {
            return -1L;
        }
        return abstractC6839d.m88219a(field);
    }

    /* renamed from: o */
    public static long m88231o(ByteBuffer byteBuffer) {
        return f30719f.m88209k(byteBuffer, f30735v);
    }

    /* renamed from: p */
    public static Field m88230p(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m88229q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m88239g(obj, j2, ((255 & b) << i) | (m88259H(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* renamed from: r */
    public static void m88228r(Object obj, long j, boolean z) {
        m88242d(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: t */
    public static void m88226t(Object obj, long j, boolean z) {
        m88229q(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: x */
    public static boolean m88222x() {
        return f30721h;
    }

    /* renamed from: y */
    public static boolean m88221y() {
        return f30720g;
    }

    /* renamed from: z */
    public static Unsafe m88220z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C44639lg8());
        } catch (Throwable unused) {
            return null;
        }
    }
}
