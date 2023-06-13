package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p000.C35916Sk1;
/* renamed from: nZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45755nZ7 implements InterfaceC35153Pd3 {

    /* renamed from: f */
    public static final Charset f100120f = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: g */
    public static final C35916Sk1 f100121g;

    /* renamed from: h */
    public static final C35916Sk1 f100122h;

    /* renamed from: i */
    public static final InterfaceC34919Od3 f100123i;

    /* renamed from: a */
    public OutputStream f100124a;

    /* renamed from: b */
    public final Map f100125b;

    /* renamed from: c */
    public final Map f100126c;

    /* renamed from: d */
    public final InterfaceC34919Od3 f100127d;

    /* renamed from: e */
    public final C48395s08 f100128e = new C48395s08(this);

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("key");
        QW7 qw7 = new QW7();
        qw7.m88440a(1);
        f100121g = m84930a.m84925b(qw7.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("value");
        QW7 qw72 = new QW7();
        qw72.m88440a(2);
        f100122h = m84930a2.m84925b(qw72.m88439b()).m84926a();
        f100123i = YY7.f46015a;
    }

    public C45755nZ7(OutputStream outputStream, Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f100124a = outputStream;
        this.f100125b = map;
        this.f100126c = map2;
        this.f100127d = interfaceC34919Od3;
    }

    /* renamed from: k */
    public static /* synthetic */ void m23522k(Map.Entry entry, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f100121g, entry.getKey());
        interfaceC35153Pd3.mo23527f(f100122h, entry.getValue());
    }

    /* renamed from: l */
    public static int m23521l(C35916Sk1 c35916Sk1) {
        KY7 ky7 = (KY7) c35916Sk1.m84928c(KY7.class);
        if (ky7 != null) {
            return ky7.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: n */
    public static KY7 m23519n(C35916Sk1 c35916Sk1) {
        KY7 ky7 = (KY7) c35916Sk1.m84928c(KY7.class);
        if (ky7 != null) {
            return ky7;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static ByteBuffer m23516q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final InterfaceC35153Pd3 m23532a(C35916Sk1 c35916Sk1, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m23515r((m23521l(c35916Sk1) << 3) | 1);
        this.f100124a.write(m23516q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: b */
    public final InterfaceC35153Pd3 m23531b(C35916Sk1 c35916Sk1, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m23515r((m23521l(c35916Sk1) << 3) | 5);
        this.f100124a.write(m23516q(4).putFloat(f).array());
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: c */
    public final /* synthetic */ InterfaceC35153Pd3 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        m23525h(c35916Sk1, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: d */
    public final /* synthetic */ InterfaceC35153Pd3 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        m23525h(c35916Sk1, i, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: e */
    public final /* synthetic */ InterfaceC35153Pd3 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        m23524i(c35916Sk1, j, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public final InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        m23526g(c35916Sk1, obj, true);
        return this;
    }

    /* renamed from: g */
    public final InterfaceC35153Pd3 m23526g(C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m23515r((m23521l(c35916Sk1) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f100120f);
            m23515r(bytes.length);
            this.f100124a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m23526g(c35916Sk1, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m23518o(f100123i, c35916Sk1, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m23532a(c35916Sk1, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m23531b(c35916Sk1, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m23524i(c35916Sk1, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m23525h(c35916Sk1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m23515r((m23521l(c35916Sk1) << 3) | 2);
            m23515r(bArr.length);
            this.f100124a.write(bArr);
            return this;
        } else {
            InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f100125b.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                m23518o(interfaceC34919Od3, c35916Sk1, obj, z);
                return this;
            }
            InterfaceC33338Hj6 interfaceC33338Hj6 = (InterfaceC33338Hj6) this.f100126c.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                m23517p(interfaceC33338Hj6, c35916Sk1, obj, z);
                return this;
            } else if (obj instanceof InterfaceC41586gX7) {
                m23525h(c35916Sk1, ((InterfaceC41586gX7) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m23525h(c35916Sk1, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m23518o(this.f100127d, c35916Sk1, obj, z);
                return this;
            }
        }
    }

    /* renamed from: h */
    public final C45755nZ7 m23525h(C35916Sk1 c35916Sk1, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        KY7 m23519n = m23519n(c35916Sk1);
        EnumC50479vX7 enumC50479vX7 = EnumC50479vX7.DEFAULT;
        int ordinal = m23519n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m23515r((m23519n.zza() << 3) | 5);
                    this.f100124a.write(m23516q(4).putInt(i).array());
                }
            } else {
                m23515r(m23519n.zza() << 3);
                m23515r((i + i) ^ (i >> 31));
            }
        } else {
            m23515r(m23519n.zza() << 3);
            m23515r(i);
        }
        return this;
    }

    /* renamed from: i */
    public final C45755nZ7 m23524i(C35916Sk1 c35916Sk1, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        KY7 m23519n = m23519n(c35916Sk1);
        EnumC50479vX7 enumC50479vX7 = EnumC50479vX7.DEFAULT;
        int ordinal = m23519n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m23515r((m23519n.zza() << 3) | 1);
                    this.f100124a.write(m23516q(8).putLong(j).array());
                }
            } else {
                m23515r(m23519n.zza() << 3);
                m23514s((j >> 63) ^ (j + j));
            }
        } else {
            m23515r(m23519n.zza() << 3);
            m23514s(j);
        }
        return this;
    }

    /* renamed from: j */
    public final C45755nZ7 m23523j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f100125b.get(obj.getClass());
        if (interfaceC34919Od3 != null) {
            interfaceC34919Od3.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: m */
    public final long m23520m(InterfaceC34919Od3 interfaceC34919Od3, Object obj) throws IOException {
        SW7 sw7 = new SW7();
        try {
            OutputStream outputStream = this.f100124a;
            this.f100124a = sw7;
            interfaceC34919Od3.encode(obj, this);
            this.f100124a = outputStream;
            long m85314a = sw7.m85314a();
            sw7.close();
            return m85314a;
        } catch (Throwable th) {
            try {
                sw7.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    /* renamed from: o */
    public final C45755nZ7 m23518o(InterfaceC34919Od3 interfaceC34919Od3, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        long m23520m = m23520m(interfaceC34919Od3, obj);
        if (z && m23520m == 0) {
            return this;
        }
        m23515r((m23521l(c35916Sk1) << 3) | 2);
        m23514s(m23520m);
        interfaceC34919Od3.encode(obj, this);
        return this;
    }

    /* renamed from: p */
    public final C45755nZ7 m23517p(InterfaceC33338Hj6 interfaceC33338Hj6, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        this.f100128e.m14891c(c35916Sk1, z);
        interfaceC33338Hj6.encode(obj, this.f100128e);
        return this;
    }

    /* renamed from: r */
    public final void m23515r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f100124a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f100124a.write(i & 127);
    }

    /* renamed from: s */
    public final void m23514s(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f100124a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f100124a.write(((int) j) & 127);
    }
}
