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
/* renamed from: M29 */
/* loaded from: classes5.dex */
public final class M29 implements InterfaceC35153Pd3 {

    /* renamed from: f */
    public static final Charset f22484f = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: g */
    public static final C35916Sk1 f22485g;

    /* renamed from: h */
    public static final C35916Sk1 f22486h;

    /* renamed from: i */
    public static final InterfaceC34919Od3 f22487i;

    /* renamed from: a */
    public OutputStream f22488a;

    /* renamed from: b */
    public final Map f22489b;

    /* renamed from: c */
    public final Map f22490c;

    /* renamed from: d */
    public final InterfaceC34919Od3 f22491d;

    /* renamed from: e */
    public final K39 f22492e = new K39(this);

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("key");
        F19 f19 = new F19();
        f19.m108098a(1);
        f22485g = m84930a.m84925b(f19.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("value");
        F19 f192 = new F19();
        f192.m108098a(2);
        f22486h = m84930a2.m84925b(f192.m108097b()).m84926a();
        f22487i = D29.f5112a;
    }

    public M29(OutputStream outputStream, Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f22488a = outputStream;
        this.f22489b = map;
        this.f22490c = map2;
        this.f22491d = interfaceC34919Od3;
    }

    /* renamed from: k */
    public static /* synthetic */ void m95960k(Map.Entry entry, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f22485g, entry.getKey());
        interfaceC35153Pd3.mo23527f(f22486h, entry.getValue());
    }

    /* renamed from: l */
    public static int m95959l(C35916Sk1 c35916Sk1) {
        InterfaceC49009t29 interfaceC49009t29 = (InterfaceC49009t29) c35916Sk1.m84928c(InterfaceC49009t29.class);
        if (interfaceC49009t29 != null) {
            return interfaceC49009t29.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: n */
    public static InterfaceC49009t29 m95957n(C35916Sk1 c35916Sk1) {
        InterfaceC49009t29 interfaceC49009t29 = (InterfaceC49009t29) c35916Sk1.m84928c(InterfaceC49009t29.class);
        if (interfaceC49009t29 != null) {
            return interfaceC49009t29;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static ByteBuffer m95954q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final InterfaceC35153Pd3 m95966a(C35916Sk1 c35916Sk1, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m95953r((m95959l(c35916Sk1) << 3) | 1);
        this.f22488a.write(m95954q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: b */
    public final InterfaceC35153Pd3 m95965b(C35916Sk1 c35916Sk1, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m95953r((m95959l(c35916Sk1) << 3) | 5);
        this.f22488a.write(m95954q(4).putFloat(f).array());
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: c */
    public final /* synthetic */ InterfaceC35153Pd3 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        m95963h(c35916Sk1, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: d */
    public final /* synthetic */ InterfaceC35153Pd3 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        m95963h(c35916Sk1, i, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: e */
    public final /* synthetic */ InterfaceC35153Pd3 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        m95962i(c35916Sk1, j, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public final InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        m95964g(c35916Sk1, obj, true);
        return this;
    }

    /* renamed from: g */
    public final InterfaceC35153Pd3 m95964g(C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m95953r((m95959l(c35916Sk1) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f22484f);
            m95953r(bytes.length);
            this.f22488a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m95964g(c35916Sk1, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m95956o(f22487i, c35916Sk1, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m95966a(c35916Sk1, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m95965b(c35916Sk1, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m95962i(c35916Sk1, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m95963h(c35916Sk1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m95953r((m95959l(c35916Sk1) << 3) | 2);
            m95953r(bArr.length);
            this.f22488a.write(bArr);
            return this;
        } else {
            InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f22489b.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                m95956o(interfaceC34919Od3, c35916Sk1, obj, z);
                return this;
            }
            InterfaceC33338Hj6 interfaceC33338Hj6 = (InterfaceC33338Hj6) this.f22490c.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                m95955p(interfaceC33338Hj6, c35916Sk1, obj, z);
                return this;
            } else if (obj instanceof Z19) {
                m95963h(c35916Sk1, ((Z19) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m95963h(c35916Sk1, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m95956o(this.f22491d, c35916Sk1, obj, z);
                return this;
            }
        }
    }

    /* renamed from: h */
    public final M29 m95963h(C35916Sk1 c35916Sk1, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        InterfaceC49009t29 m95957n = m95957n(c35916Sk1);
        EnumC43080j29 enumC43080j29 = EnumC43080j29.DEFAULT;
        int ordinal = m95957n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m95953r((m95957n.zza() << 3) | 5);
                    this.f22488a.write(m95954q(4).putInt(i).array());
                }
            } else {
                m95953r(m95957n.zza() << 3);
                m95953r((i + i) ^ (i >> 31));
            }
        } else {
            m95953r(m95957n.zza() << 3);
            m95953r(i);
        }
        return this;
    }

    /* renamed from: i */
    public final M29 m95962i(C35916Sk1 c35916Sk1, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        InterfaceC49009t29 m95957n = m95957n(c35916Sk1);
        EnumC43080j29 enumC43080j29 = EnumC43080j29.DEFAULT;
        int ordinal = m95957n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m95953r((m95957n.zza() << 3) | 1);
                    this.f22488a.write(m95954q(8).putLong(j).array());
                }
            } else {
                m95953r(m95957n.zza() << 3);
                m95952s((j >> 63) ^ (j + j));
            }
        } else {
            m95953r(m95957n.zza() << 3);
            m95952s(j);
        }
        return this;
    }

    /* renamed from: j */
    public final M29 m95961j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f22489b.get(obj.getClass());
        if (interfaceC34919Od3 != null) {
            interfaceC34919Od3.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: m */
    public final long m95958m(InterfaceC34919Od3 interfaceC34919Od3, Object obj) throws IOException {
        P19 p19 = new P19();
        try {
            OutputStream outputStream = this.f22488a;
            this.f22488a = p19;
            interfaceC34919Od3.encode(obj, this);
            this.f22488a = outputStream;
            long m91048a = p19.m91048a();
            p19.close();
            return m91048a;
        } catch (Throwable th) {
            try {
                p19.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: o */
    public final M29 m95956o(InterfaceC34919Od3 interfaceC34919Od3, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        long m95958m = m95958m(interfaceC34919Od3, obj);
        if (z && m95958m == 0) {
            return this;
        }
        m95953r((m95959l(c35916Sk1) << 3) | 2);
        m95952s(m95958m);
        interfaceC34919Od3.encode(obj, this);
        return this;
    }

    /* renamed from: p */
    public final M29 m95955p(InterfaceC33338Hj6 interfaceC33338Hj6, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        this.f22492e.m99277c(c35916Sk1, z);
        interfaceC33338Hj6.encode(obj, this.f22492e);
        return this;
    }

    /* renamed from: r */
    public final void m95953r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f22488a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f22488a.write(i & 127);
    }

    /* renamed from: s */
    public final void m95952s(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f22488a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f22488a.write(((int) j) & 127);
    }
}
