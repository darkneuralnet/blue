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
/* renamed from: mS7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45099mS7 implements InterfaceC35153Pd3 {

    /* renamed from: f */
    public static final Charset f98044f = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: g */
    public static final C35916Sk1 f98045g;

    /* renamed from: h */
    public static final C35916Sk1 f98046h;

    /* renamed from: i */
    public static final InterfaceC34919Od3 f98047i;

    /* renamed from: a */
    public OutputStream f98048a;

    /* renamed from: b */
    public final Map f98049b;

    /* renamed from: c */
    public final Map f98050c;

    /* renamed from: d */
    public final InterfaceC34919Od3 f98051d;

    /* renamed from: e */
    public final C50443vT7 f98052e = new C50443vT7(this);

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("key");
        C46258oP7 c46258oP7 = new C46258oP7();
        c46258oP7.m21095a(1);
        f98045g = m84930a.m84925b(c46258oP7.m21094b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("value");
        C46258oP7 c46258oP72 = new C46258oP7();
        c46258oP72.m21095a(2);
        f98046h = m84930a2.m84925b(c46258oP72.m21094b()).m84926a();
        f98047i = XR7.f43249a;
    }

    public C45099mS7(OutputStream outputStream, Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f98048a = outputStream;
        this.f98049b = map;
        this.f98050c = map2;
        this.f98051d = interfaceC34919Od3;
    }

    /* renamed from: k */
    public static /* synthetic */ void m25580k(Map.Entry entry, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f98045g, entry.getKey());
        interfaceC35153Pd3.mo23527f(f98046h, entry.getValue());
    }

    /* renamed from: l */
    public static int m25579l(C35916Sk1 c35916Sk1) {
        HR7 hr7 = (HR7) c35916Sk1.m84928c(HR7.class);
        if (hr7 != null) {
            return hr7.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: n */
    public static HR7 m25577n(C35916Sk1 c35916Sk1) {
        HR7 hr7 = (HR7) c35916Sk1.m84928c(HR7.class);
        if (hr7 != null) {
            return hr7;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static ByteBuffer m25574q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final InterfaceC35153Pd3 m25586a(C35916Sk1 c35916Sk1, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m25573r((m25579l(c35916Sk1) << 3) | 1);
        this.f98048a.write(m25574q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: b */
    public final InterfaceC35153Pd3 m25585b(C35916Sk1 c35916Sk1, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m25573r((m25579l(c35916Sk1) << 3) | 5);
        this.f98048a.write(m25574q(4).putFloat(f).array());
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: c */
    public final /* synthetic */ InterfaceC35153Pd3 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        m25583h(c35916Sk1, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: d */
    public final /* synthetic */ InterfaceC35153Pd3 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        m25583h(c35916Sk1, i, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: e */
    public final /* synthetic */ InterfaceC35153Pd3 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        m25582i(c35916Sk1, j, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public final InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        m25584g(c35916Sk1, obj, true);
        return this;
    }

    /* renamed from: g */
    public final InterfaceC35153Pd3 m25584g(C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m25573r((m25579l(c35916Sk1) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f98044f);
            m25573r(bytes.length);
            this.f98048a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m25584g(c35916Sk1, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m25576o(f98047i, c35916Sk1, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m25586a(c35916Sk1, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m25585b(c35916Sk1, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m25582i(c35916Sk1, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m25583h(c35916Sk1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m25573r((m25579l(c35916Sk1) << 3) | 2);
            m25573r(bArr.length);
            this.f98048a.write(bArr);
            return this;
        } else {
            InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f98049b.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                m25576o(interfaceC34919Od3, c35916Sk1, obj, z);
                return this;
            }
            InterfaceC33338Hj6 interfaceC33338Hj6 = (InterfaceC33338Hj6) this.f98050c.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                m25575p(interfaceC33338Hj6, c35916Sk1, obj, z);
                return this;
            } else if (obj instanceof InterfaceC39754dR7) {
                m25583h(c35916Sk1, ((InterfaceC39754dR7) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m25583h(c35916Sk1, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m25576o(this.f98051d, c35916Sk1, obj, z);
                return this;
            }
        }
    }

    /* renamed from: h */
    public final C45099mS7 m25583h(C35916Sk1 c35916Sk1, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        HR7 m25577n = m25577n(c35916Sk1);
        EnumC48647sR7 enumC48647sR7 = EnumC48647sR7.DEFAULT;
        int ordinal = m25577n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m25573r((m25577n.zza() << 3) | 5);
                    this.f98048a.write(m25574q(4).putInt(i).array());
                }
            } else {
                m25573r(m25577n.zza() << 3);
                m25573r((i + i) ^ (i >> 31));
            }
        } else {
            m25573r(m25577n.zza() << 3);
            m25573r(i);
        }
        return this;
    }

    /* renamed from: i */
    public final C45099mS7 m25582i(C35916Sk1 c35916Sk1, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        HR7 m25577n = m25577n(c35916Sk1);
        EnumC48647sR7 enumC48647sR7 = EnumC48647sR7.DEFAULT;
        int ordinal = m25577n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m25573r((m25577n.zza() << 3) | 1);
                    this.f98048a.write(m25574q(8).putLong(j).array());
                }
            } else {
                m25573r(m25577n.zza() << 3);
                m25572s((j >> 63) ^ (j + j));
            }
        } else {
            m25573r(m25577n.zza() << 3);
            m25572s(j);
        }
        return this;
    }

    /* renamed from: j */
    public final C45099mS7 m25581j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f98049b.get(obj.getClass());
        if (interfaceC34919Od3 != null) {
            interfaceC34919Od3.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: m */
    public final long m25578m(InterfaceC34919Od3 interfaceC34919Od3, Object obj) throws IOException {
        NQ7 nq7 = new NQ7();
        try {
            OutputStream outputStream = this.f98048a;
            this.f98048a = nq7;
            interfaceC34919Od3.encode(obj, this);
            this.f98048a = outputStream;
            long m93918a = nq7.m93918a();
            nq7.close();
            return m93918a;
        } catch (Throwable th) {
            try {
                nq7.close();
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
    public final C45099mS7 m25576o(InterfaceC34919Od3 interfaceC34919Od3, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        long m25578m = m25578m(interfaceC34919Od3, obj);
        if (z && m25578m == 0) {
            return this;
        }
        m25573r((m25579l(c35916Sk1) << 3) | 2);
        m25572s(m25578m);
        interfaceC34919Od3.encode(obj, this);
        return this;
    }

    /* renamed from: p */
    public final C45099mS7 m25575p(InterfaceC33338Hj6 interfaceC33338Hj6, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        this.f98052e.m8613c(c35916Sk1, z);
        interfaceC33338Hj6.encode(obj, this.f98052e);
        return this;
    }

    /* renamed from: r */
    public final void m25573r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f98048a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f98048a.write(i & 127);
    }

    /* renamed from: s */
    public final void m25572s(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f98048a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f98048a.write(((int) j) & 127);
    }
}
