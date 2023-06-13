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
/* renamed from: MW7 */
/* loaded from: classes5.dex */
public final class MW7 implements InterfaceC35153Pd3 {

    /* renamed from: f */
    public static final Charset f23191f = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: g */
    public static final C35916Sk1 f23192g;

    /* renamed from: h */
    public static final C35916Sk1 f23193h;

    /* renamed from: i */
    public static final InterfaceC34919Od3 f23194i;

    /* renamed from: a */
    public OutputStream f23195a;

    /* renamed from: b */
    public final Map f23196b;

    /* renamed from: c */
    public final Map f23197c;

    /* renamed from: d */
    public final InterfaceC34919Od3 f23198d;

    /* renamed from: e */
    public final TY7 f23199e = new TY7(this);

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("key");
        C43347jV7 c43347jV7 = new C43347jV7();
        c43347jV7.m30420a(1);
        f23192g = m84930a.m84925b(c43347jV7.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("value");
        C43347jV7 c43347jV72 = new C43347jV7();
        c43347jV72.m30420a(2);
        f23193h = m84930a2.m84925b(c43347jV72.m30419b()).m84926a();
        f23194i = C52842zW7.f121486a;
    }

    public MW7(OutputStream outputStream, Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f23195a = outputStream;
        this.f23196b = map;
        this.f23197c = map2;
        this.f23198d = interfaceC34919Od3;
    }

    /* renamed from: k */
    public static /* synthetic */ void m95227k(Map.Entry entry, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f23192g, entry.getKey());
        interfaceC35153Pd3.mo23527f(f23193h, entry.getValue());
    }

    /* renamed from: l */
    public static int m95226l(C35916Sk1 c35916Sk1) {
        InterfaceC45135mW7 interfaceC45135mW7 = (InterfaceC45135mW7) c35916Sk1.m84928c(InterfaceC45135mW7.class);
        if (interfaceC45135mW7 != null) {
            return interfaceC45135mW7.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: n */
    public static InterfaceC45135mW7 m95224n(C35916Sk1 c35916Sk1) {
        InterfaceC45135mW7 interfaceC45135mW7 = (InterfaceC45135mW7) c35916Sk1.m84928c(InterfaceC45135mW7.class);
        if (interfaceC45135mW7 != null) {
            return interfaceC45135mW7;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static ByteBuffer m95221q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final InterfaceC35153Pd3 m95233a(C35916Sk1 c35916Sk1, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m95220r((m95226l(c35916Sk1) << 3) | 1);
        this.f23195a.write(m95221q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: b */
    public final InterfaceC35153Pd3 m95232b(C35916Sk1 c35916Sk1, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m95220r((m95226l(c35916Sk1) << 3) | 5);
        this.f23195a.write(m95221q(4).putFloat(f).array());
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: c */
    public final /* synthetic */ InterfaceC35153Pd3 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        m95230h(c35916Sk1, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: d */
    public final /* synthetic */ InterfaceC35153Pd3 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        m95230h(c35916Sk1, i, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: e */
    public final /* synthetic */ InterfaceC35153Pd3 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        m95229i(c35916Sk1, j, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public final InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        m95231g(c35916Sk1, obj, true);
        return this;
    }

    /* renamed from: g */
    public final InterfaceC35153Pd3 m95231g(C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m95220r((m95226l(c35916Sk1) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f23191f);
            m95220r(bytes.length);
            this.f23195a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m95231g(c35916Sk1, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m95223o(f23194i, c35916Sk1, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m95233a(c35916Sk1, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m95232b(c35916Sk1, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m95229i(c35916Sk1, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m95230h(c35916Sk1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m95220r((m95226l(c35916Sk1) << 3) | 2);
            m95220r(bArr.length);
            this.f23195a.write(bArr);
            return this;
        } else {
            InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f23196b.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                m95223o(interfaceC34919Od3, c35916Sk1, obj, z);
                return this;
            }
            InterfaceC33338Hj6 interfaceC33338Hj6 = (InterfaceC33338Hj6) this.f23197c.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                m95222p(interfaceC33338Hj6, c35916Sk1, obj, z);
                return this;
            } else if (obj instanceof KV7) {
                m95230h(c35916Sk1, ((KV7) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m95230h(c35916Sk1, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m95223o(this.f23198d, c35916Sk1, obj, z);
                return this;
            }
        }
    }

    /* renamed from: h */
    public final MW7 m95230h(C35916Sk1 c35916Sk1, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        InterfaceC45135mW7 m95224n = m95224n(c35916Sk1);
        YV7 yv7 = YV7.DEFAULT;
        int ordinal = m95224n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m95220r((m95224n.zza() << 3) | 5);
                    this.f23195a.write(m95221q(4).putInt(i).array());
                }
            } else {
                m95220r(m95224n.zza() << 3);
                m95220r((i + i) ^ (i >> 31));
            }
        } else {
            m95220r(m95224n.zza() << 3);
            m95220r(i);
        }
        return this;
    }

    /* renamed from: i */
    public final MW7 m95229i(C35916Sk1 c35916Sk1, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        InterfaceC45135mW7 m95224n = m95224n(c35916Sk1);
        YV7 yv7 = YV7.DEFAULT;
        int ordinal = m95224n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m95220r((m95224n.zza() << 3) | 1);
                    this.f23195a.write(m95221q(8).putLong(j).array());
                }
            } else {
                m95220r(m95224n.zza() << 3);
                m95219s((j >> 63) ^ (j + j));
            }
        } else {
            m95220r(m95224n.zza() << 3);
            m95219s(j);
        }
        return this;
    }

    /* renamed from: j */
    public final MW7 m95228j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f23196b.get(obj.getClass());
        if (interfaceC34919Od3 != null) {
            interfaceC34919Od3.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: m */
    public final long m95225m(InterfaceC34919Od3 interfaceC34919Od3, Object obj) throws IOException {
        C51647xV7 c51647xV7 = new C51647xV7();
        try {
            OutputStream outputStream = this.f23195a;
            this.f23195a = c51647xV7;
            interfaceC34919Od3.encode(obj, this);
            this.f23195a = outputStream;
            long m5108a = c51647xV7.m5108a();
            c51647xV7.close();
            return m5108a;
        } catch (Throwable th) {
            try {
                c51647xV7.close();
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
    public final MW7 m95223o(InterfaceC34919Od3 interfaceC34919Od3, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        long m95225m = m95225m(interfaceC34919Od3, obj);
        if (z && m95225m == 0) {
            return this;
        }
        m95220r((m95226l(c35916Sk1) << 3) | 2);
        m95219s(m95225m);
        interfaceC34919Od3.encode(obj, this);
        return this;
    }

    /* renamed from: p */
    public final MW7 m95222p(InterfaceC33338Hj6 interfaceC33338Hj6, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        this.f23199e.m83398c(c35916Sk1, z);
        interfaceC33338Hj6.encode(obj, this.f23199e);
        return this;
    }

    /* renamed from: r */
    public final void m95220r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f23195a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f23195a.write(i & 127);
    }

    /* renamed from: s */
    public final void m95219s(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f23195a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f23195a.write(((int) j) & 127);
    }
}
