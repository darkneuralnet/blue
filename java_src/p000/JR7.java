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
/* renamed from: JR7 */
/* loaded from: classes5.dex */
public final class JR7 implements InterfaceC35153Pd3 {

    /* renamed from: f */
    public static final Charset f17548f = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: g */
    public static final C35916Sk1 f17549g;

    /* renamed from: h */
    public static final C35916Sk1 f17550h;

    /* renamed from: i */
    public static final InterfaceC34919Od3 f17551i;

    /* renamed from: a */
    public OutputStream f17552a;

    /* renamed from: b */
    public final Map f17553b;

    /* renamed from: c */
    public final Map f17554c;

    /* renamed from: d */
    public final InterfaceC34919Od3 f17555d;

    /* renamed from: e */
    public final TS7 f17556e = new TS7(this);

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("key");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f17549g = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("value");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f17550h = m84930a2.m84925b(mo72.m95318b()).m84926a();
        f17551i = C49833uR7.f112381a;
    }

    public JR7(OutputStream outputStream, Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f17552a = outputStream;
        this.f17553b = map;
        this.f17554c = map2;
        this.f17555d = interfaceC34919Od3;
    }

    /* renamed from: k */
    public static /* synthetic */ void m100451k(Map.Entry entry, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f17549g, entry.getKey());
        interfaceC35153Pd3.mo23527f(f17550h, entry.getValue());
    }

    /* renamed from: l */
    public static int m100450l(C35916Sk1 c35916Sk1) {
        InterfaceC40939fR7 interfaceC40939fR7 = (InterfaceC40939fR7) c35916Sk1.m84928c(InterfaceC40939fR7.class);
        if (interfaceC40939fR7 != null) {
            return interfaceC40939fR7.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: n */
    public static InterfaceC40939fR7 m100448n(C35916Sk1 c35916Sk1) {
        InterfaceC40939fR7 interfaceC40939fR7 = (InterfaceC40939fR7) c35916Sk1.m84928c(InterfaceC40939fR7.class);
        if (interfaceC40939fR7 != null) {
            return interfaceC40939fR7;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static ByteBuffer m100445q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final InterfaceC35153Pd3 m100457a(C35916Sk1 c35916Sk1, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m100444r((m100450l(c35916Sk1) << 3) | 1);
        this.f17552a.write(m100445q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: b */
    public final InterfaceC35153Pd3 m100456b(C35916Sk1 c35916Sk1, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m100444r((m100450l(c35916Sk1) << 3) | 5);
        this.f17552a.write(m100445q(4).putFloat(f).array());
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: c */
    public final /* synthetic */ InterfaceC35153Pd3 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        m100454h(c35916Sk1, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: d */
    public final /* synthetic */ InterfaceC35153Pd3 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        m100454h(c35916Sk1, i, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: e */
    public final /* synthetic */ InterfaceC35153Pd3 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        m100453i(c35916Sk1, j, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public final InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        m100455g(c35916Sk1, obj, true);
        return this;
    }

    /* renamed from: g */
    public final InterfaceC35153Pd3 m100455g(C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m100444r((m100450l(c35916Sk1) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f17548f);
            m100444r(bytes.length);
            this.f17552a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m100455g(c35916Sk1, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m100447o(f17551i, c35916Sk1, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m100457a(c35916Sk1, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m100456b(c35916Sk1, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m100453i(c35916Sk1, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m100454h(c35916Sk1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m100444r((m100450l(c35916Sk1) << 3) | 2);
            m100444r(bArr.length);
            this.f17552a.write(bArr);
            return this;
        } else {
            InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f17553b.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                m100447o(interfaceC34919Od3, c35916Sk1, obj, z);
                return this;
            }
            InterfaceC33338Hj6 interfaceC33338Hj6 = (InterfaceC33338Hj6) this.f17554c.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                m100446p(interfaceC33338Hj6, c35916Sk1, obj, z);
                return this;
            } else if (obj instanceof InterfaceC47444qP7) {
                m100454h(c35916Sk1, ((InterfaceC47444qP7) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m100454h(c35916Sk1, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m100447o(this.f17555d, c35916Sk1, obj, z);
                return this;
            }
        }
    }

    /* renamed from: h */
    public final JR7 m100454h(C35916Sk1 c35916Sk1, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        InterfaceC40939fR7 m100448n = m100448n(c35916Sk1);
        PQ7 pq7 = PQ7.DEFAULT;
        int ordinal = m100448n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m100444r((m100448n.zza() << 3) | 5);
                    this.f17552a.write(m100445q(4).putInt(i).array());
                }
            } else {
                m100444r(m100448n.zza() << 3);
                m100444r((i + i) ^ (i >> 31));
            }
        } else {
            m100444r(m100448n.zza() << 3);
            m100444r(i);
        }
        return this;
    }

    /* renamed from: i */
    public final JR7 m100453i(C35916Sk1 c35916Sk1, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        InterfaceC40939fR7 m100448n = m100448n(c35916Sk1);
        PQ7 pq7 = PQ7.DEFAULT;
        int ordinal = m100448n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m100444r((m100448n.zza() << 3) | 1);
                    this.f17552a.write(m100445q(8).putLong(j).array());
                }
            } else {
                m100444r(m100448n.zza() << 3);
                m100443s((j >> 63) ^ (j + j));
            }
        } else {
            m100444r(m100448n.zza() << 3);
            m100443s(j);
        }
        return this;
    }

    /* renamed from: j */
    public final JR7 m100452j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f17553b.get(obj.getClass());
        if (interfaceC34919Od3 != null) {
            interfaceC34919Od3.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: m */
    public final long m100449m(InterfaceC34919Od3 interfaceC34919Od3, Object obj) throws IOException {
        C38532bP7 c38532bP7 = new C38532bP7();
        try {
            OutputStream outputStream = this.f17552a;
            this.f17552a = c38532bP7;
            interfaceC34919Od3.encode(obj, this);
            this.f17552a = outputStream;
            long m64556a = c38532bP7.m64556a();
            c38532bP7.close();
            return m64556a;
        } catch (Throwable th) {
            try {
                c38532bP7.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: o */
    public final JR7 m100447o(InterfaceC34919Od3 interfaceC34919Od3, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        long m100449m = m100449m(interfaceC34919Od3, obj);
        if (z && m100449m == 0) {
            return this;
        }
        m100444r((m100450l(c35916Sk1) << 3) | 2);
        m100443s(m100449m);
        interfaceC34919Od3.encode(obj, this);
        return this;
    }

    /* renamed from: p */
    public final JR7 m100446p(InterfaceC33338Hj6 interfaceC33338Hj6, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        this.f17556e.m83586c(c35916Sk1, z);
        interfaceC33338Hj6.encode(obj, this.f17556e);
        return this;
    }

    /* renamed from: r */
    public final void m100444r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f17552a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f17552a.write(i & 127);
    }

    /* renamed from: s */
    public final void m100443s(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f17552a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f17552a.write(((int) j) & 127);
    }
}
