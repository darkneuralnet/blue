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
/* renamed from: Vo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36660Vo7 implements InterfaceC35153Pd3 {

    /* renamed from: f */
    public static final Charset f39781f = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: g */
    public static final C35916Sk1 f39782g;

    /* renamed from: h */
    public static final C35916Sk1 f39783h;

    /* renamed from: i */
    public static final InterfaceC34919Od3 f39784i;

    /* renamed from: a */
    public OutputStream f39785a;

    /* renamed from: b */
    public final Map f39786b;

    /* renamed from: c */
    public final Map f39787c;

    /* renamed from: d */
    public final InterfaceC34919Od3 f39788d;

    /* renamed from: e */
    public final C43572js7 f39789e = new C43572js7(this);

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("key");
        C52375yj7 c52375yj7 = new C52375yj7();
        c52375yj7.m2754a(1);
        f39782g = m84930a.m84925b(c52375yj7.m2753b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("value");
        C52375yj7 c52375yj72 = new C52375yj7();
        c52375yj72.m2754a(2);
        f39783h = m84930a2.m84925b(c52375yj72.m2753b()).m84926a();
        f39784i = C37587Zn7.f49266a;
    }

    public C36660Vo7(OutputStream outputStream, Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f39785a = outputStream;
        this.f39786b = map;
        this.f39787c = map2;
        this.f39788d = interfaceC34919Od3;
    }

    /* renamed from: k */
    public static /* synthetic */ void m79403k(Map.Entry entry, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f39782g, entry.getKey());
        interfaceC35153Pd3.mo23527f(f39783h, entry.getValue());
    }

    /* renamed from: l */
    public static int m79402l(C35916Sk1 c35916Sk1) {
        InterfaceC42929in7 interfaceC42929in7 = (InterfaceC42929in7) c35916Sk1.m84928c(InterfaceC42929in7.class);
        if (interfaceC42929in7 != null) {
            return interfaceC42929in7.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: n */
    public static InterfaceC42929in7 m79400n(C35916Sk1 c35916Sk1) {
        InterfaceC42929in7 interfaceC42929in7 = (InterfaceC42929in7) c35916Sk1.m84928c(InterfaceC42929in7.class);
        if (interfaceC42929in7 != null) {
            return interfaceC42929in7;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static ByteBuffer m79397q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final InterfaceC35153Pd3 m79409a(C35916Sk1 c35916Sk1, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m79396r((m79402l(c35916Sk1) << 3) | 1);
        this.f39785a.write(m79397q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: b */
    public final InterfaceC35153Pd3 m79408b(C35916Sk1 c35916Sk1, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m79396r((m79402l(c35916Sk1) << 3) | 5);
        this.f39785a.write(m79397q(4).putFloat(f).array());
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: c */
    public final /* synthetic */ InterfaceC35153Pd3 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        m79406h(c35916Sk1, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: d */
    public final /* synthetic */ InterfaceC35153Pd3 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        m79406h(c35916Sk1, i, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: e */
    public final /* synthetic */ InterfaceC35153Pd3 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        m79405i(c35916Sk1, j, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public final InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        m79407g(c35916Sk1, obj, true);
        return this;
    }

    /* renamed from: g */
    public final InterfaceC35153Pd3 m79407g(C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m79396r((m79402l(c35916Sk1) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f39781f);
            m79396r(bytes.length);
            this.f39785a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m79407g(c35916Sk1, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m79399o(f39784i, c35916Sk1, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m79409a(c35916Sk1, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m79408b(c35916Sk1, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m79405i(c35916Sk1, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m79406h(c35916Sk1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m79396r((m79402l(c35916Sk1) << 3) | 2);
            m79396r(bArr.length);
            this.f39785a.write(bArr);
            return this;
        } else {
            InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f39786b.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                m79399o(interfaceC34919Od3, c35916Sk1, obj, z);
                return this;
            }
            InterfaceC33338Hj6 interfaceC33338Hj6 = (InterfaceC33338Hj6) this.f39787c.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                m79398p(interfaceC33338Hj6, c35916Sk1, obj, z);
                return this;
            } else if (obj instanceof InterfaceC48246rl7) {
                m79406h(c35916Sk1, ((InterfaceC48246rl7) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m79406h(c35916Sk1, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m79399o(this.f39788d, c35916Sk1, obj, z);
                return this;
            }
        }
    }

    /* renamed from: h */
    public final C36660Vo7 m79406h(C35916Sk1 c35916Sk1, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        InterfaceC42929in7 m79400n = m79400n(c35916Sk1);
        EnumC46477om7 enumC46477om7 = EnumC46477om7.DEFAULT;
        int ordinal = m79400n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m79396r((m79400n.zza() << 3) | 5);
                    this.f39785a.write(m79397q(4).putInt(i).array());
                }
            } else {
                m79396r(m79400n.zza() << 3);
                m79396r((i + i) ^ (i >> 31));
            }
        } else {
            m79396r(m79400n.zza() << 3);
            m79396r(i);
        }
        return this;
    }

    /* renamed from: i */
    public final C36660Vo7 m79405i(C35916Sk1 c35916Sk1, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        InterfaceC42929in7 m79400n = m79400n(c35916Sk1);
        EnumC46477om7 enumC46477om7 = EnumC46477om7.DEFAULT;
        int ordinal = m79400n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m79396r((m79400n.zza() << 3) | 1);
                    this.f39785a.write(m79397q(8).putLong(j).array());
                }
            } else {
                m79396r(m79400n.zza() << 3);
                m79395s((j >> 63) ^ (j + j));
            }
        } else {
            m79396r(m79400n.zza() << 3);
            m79395s(j);
        }
        return this;
    }

    /* renamed from: j */
    public final C36660Vo7 m79404j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f39786b.get(obj.getClass());
        if (interfaceC34919Od3 != null) {
            interfaceC34919Od3.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: m */
    public final long m79401m(InterfaceC34919Od3 interfaceC34919Od3, Object obj) throws IOException {
        C51199wk7 c51199wk7 = new C51199wk7();
        try {
            OutputStream outputStream = this.f39785a;
            this.f39785a = c51199wk7;
            interfaceC34919Od3.encode(obj, this);
            this.f39785a = outputStream;
            long m6410a = c51199wk7.m6410a();
            c51199wk7.close();
            return m6410a;
        } catch (Throwable th) {
            try {
                c51199wk7.close();
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
    public final C36660Vo7 m79399o(InterfaceC34919Od3 interfaceC34919Od3, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        long m79401m = m79401m(interfaceC34919Od3, obj);
        if (z && m79401m == 0) {
            return this;
        }
        m79396r((m79402l(c35916Sk1) << 3) | 2);
        m79395s(m79401m);
        interfaceC34919Od3.encode(obj, this);
        return this;
    }

    /* renamed from: p */
    public final C36660Vo7 m79398p(InterfaceC33338Hj6 interfaceC33338Hj6, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        this.f39789e.m29796c(c35916Sk1, z);
        interfaceC33338Hj6.encode(obj, this.f39789e);
        return this;
    }

    /* renamed from: r */
    public final void m79396r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f39785a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f39785a.write(i & 127);
    }

    /* renamed from: s */
    public final void m79395s(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f39785a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f39785a.write(((int) j) & 127);
    }
}
