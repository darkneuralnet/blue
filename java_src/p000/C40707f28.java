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
/* renamed from: f28  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40707f28 implements InterfaceC35153Pd3 {

    /* renamed from: f */
    public static final Charset f79328f = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: g */
    public static final C35916Sk1 f79329g;

    /* renamed from: h */
    public static final C35916Sk1 f79330h;

    /* renamed from: i */
    public static final InterfaceC34919Od3 f79331i;

    /* renamed from: a */
    public OutputStream f79332a;

    /* renamed from: b */
    public final Map f79333b;

    /* renamed from: c */
    public final Map f79334c;

    /* renamed from: d */
    public final InterfaceC34919Od3 f79335d;

    /* renamed from: e */
    public final C44868m38 f79336e = new C44868m38(this);

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("key");
        C52545z08 c52545z08 = new C52545z08();
        c52545z08.m2111a(1);
        f79329g = m84930a.m84925b(c52545z08.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("value");
        C52545z08 c52545z082 = new C52545z08();
        c52545z082.m2111a(2);
        f79330h = m84930a2.m84925b(c52545z082.m2110b()).m84926a();
        f79331i = R18.f31405a;
    }

    public C40707f28(OutputStream outputStream, Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f79332a = outputStream;
        this.f79333b = map;
        this.f79334c = map2;
        this.f79335d = interfaceC34919Od3;
    }

    /* renamed from: k */
    public static /* synthetic */ void m42251k(Map.Entry entry, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f79329g, entry.getKey());
        interfaceC35153Pd3.mo23527f(f79330h, entry.getValue());
    }

    /* renamed from: l */
    public static int m42250l(C35916Sk1 c35916Sk1) {
        D18 d18 = (D18) c35916Sk1.m84928c(D18.class);
        if (d18 != null) {
            return d18.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: n */
    public static D18 m42248n(C35916Sk1 c35916Sk1) {
        D18 d18 = (D18) c35916Sk1.m84928c(D18.class);
        if (d18 != null) {
            return d18;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static ByteBuffer m42245q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final InterfaceC35153Pd3 m42257a(C35916Sk1 c35916Sk1, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m42244r((m42250l(c35916Sk1) << 3) | 1);
        this.f79332a.write(m42245q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: b */
    public final InterfaceC35153Pd3 m42256b(C35916Sk1 c35916Sk1, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m42244r((m42250l(c35916Sk1) << 3) | 5);
        this.f79332a.write(m42245q(4).putFloat(f).array());
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: c */
    public final /* synthetic */ InterfaceC35153Pd3 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        m42254h(c35916Sk1, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: d */
    public final /* synthetic */ InterfaceC35153Pd3 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        m42254h(c35916Sk1, i, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: e */
    public final /* synthetic */ InterfaceC35153Pd3 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        m42253i(c35916Sk1, j, true);
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public final InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        m42255g(c35916Sk1, obj, true);
        return this;
    }

    /* renamed from: g */
    public final InterfaceC35153Pd3 m42255g(C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m42244r((m42250l(c35916Sk1) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f79328f);
            m42244r(bytes.length);
            this.f79332a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m42255g(c35916Sk1, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m42247o(f79331i, c35916Sk1, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m42257a(c35916Sk1, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m42256b(c35916Sk1, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m42253i(c35916Sk1, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m42254h(c35916Sk1, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m42244r((m42250l(c35916Sk1) << 3) | 2);
            m42244r(bArr.length);
            this.f79332a.write(bArr);
            return this;
        } else {
            InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f79333b.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                m42247o(interfaceC34919Od3, c35916Sk1, obj, z);
                return this;
            }
            InterfaceC33338Hj6 interfaceC33338Hj6 = (InterfaceC33338Hj6) this.f79334c.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                m42246p(interfaceC33338Hj6, c35916Sk1, obj, z);
                return this;
            } else if (obj instanceof InterfaceC38308b18) {
                m42254h(c35916Sk1, ((InterfaceC38308b18) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m42254h(c35916Sk1, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m42247o(this.f79335d, c35916Sk1, obj, z);
                return this;
            }
        }
    }

    /* renamed from: h */
    public final C40707f28 m42254h(C35916Sk1 c35916Sk1, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        D18 m42248n = m42248n(c35916Sk1);
        EnumC47220q18 enumC47220q18 = EnumC47220q18.DEFAULT;
        int ordinal = m42248n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m42244r((m42248n.zza() << 3) | 5);
                    this.f79332a.write(m42245q(4).putInt(i).array());
                }
            } else {
                m42244r(m42248n.zza() << 3);
                m42244r((i + i) ^ (i >> 31));
            }
        } else {
            m42244r(m42248n.zza() << 3);
            m42244r(i);
        }
        return this;
    }

    /* renamed from: i */
    public final C40707f28 m42253i(C35916Sk1 c35916Sk1, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        D18 m42248n = m42248n(c35916Sk1);
        EnumC47220q18 enumC47220q18 = EnumC47220q18.DEFAULT;
        int ordinal = m42248n.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m42244r((m42248n.zza() << 3) | 1);
                    this.f79332a.write(m42245q(8).putLong(j).array());
                }
            } else {
                m42244r(m42248n.zza() << 3);
                m42243s((j >> 63) ^ (j + j));
            }
        } else {
            m42244r(m42248n.zza() << 3);
            m42243s(j);
        }
        return this;
    }

    /* renamed from: j */
    public final C40707f28 m42252j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC34919Od3 interfaceC34919Od3 = (InterfaceC34919Od3) this.f79333b.get(obj.getClass());
        if (interfaceC34919Od3 != null) {
            interfaceC34919Od3.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: m */
    public final long m42249m(InterfaceC34919Od3 interfaceC34919Od3, Object obj) throws IOException {
        L08 l08 = new L08();
        try {
            OutputStream outputStream = this.f79332a;
            this.f79332a = l08;
            interfaceC34919Od3.encode(obj, this);
            this.f79332a = outputStream;
            long m97934a = l08.m97934a();
            l08.close();
            return m97934a;
        } catch (Throwable th) {
            try {
                l08.close();
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
    public final C40707f28 m42247o(InterfaceC34919Od3 interfaceC34919Od3, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        long m42249m = m42249m(interfaceC34919Od3, obj);
        if (z && m42249m == 0) {
            return this;
        }
        m42244r((m42250l(c35916Sk1) << 3) | 2);
        m42243s(m42249m);
        interfaceC34919Od3.encode(obj, this);
        return this;
    }

    /* renamed from: p */
    public final C40707f28 m42246p(InterfaceC33338Hj6 interfaceC33338Hj6, C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        this.f79336e.m26408c(c35916Sk1, z);
        interfaceC33338Hj6.encode(obj, this.f79336e);
        return this;
    }

    /* renamed from: r */
    public final void m42244r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f79332a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f79332a.write(i & 127);
    }

    /* renamed from: s */
    public final void m42243s(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f79332a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f79332a.write(((int) j) & 127);
    }
}
