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
import p000.K94;
/* renamed from: O94 */
/* loaded from: classes6.dex */
public final class O94 implements InterfaceC35153Pd3 {

    /* renamed from: f */
    public static final Charset f26069f = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: g */
    public static final C35916Sk1 f26070g = C35916Sk1.m84930a("key").m84925b(C26720np.m22341b().m22340c(1).m22342a()).m84926a();

    /* renamed from: h */
    public static final C35916Sk1 f26071h = C35916Sk1.m84930a("value").m84925b(C26720np.m22341b().m22340c(2).m22342a()).m84926a();

    /* renamed from: i */
    public static final InterfaceC34919Od3<Map.Entry<Object, Object>> f26072i = new InterfaceC34919Od3() { // from class: N94
        @Override // p000.InterfaceC45768nb1
        public final void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) {
            O94.m92691v((Map.Entry) obj, interfaceC35153Pd3);
        }
    };

    /* renamed from: a */
    public OutputStream f26073a;

    /* renamed from: b */
    public final Map<Class<?>, InterfaceC34919Od3<?>> f26074b;

    /* renamed from: c */
    public final Map<Class<?>, InterfaceC33338Hj6<?>> f26075c;

    /* renamed from: d */
    public final InterfaceC34919Od3<Object> f26076d;

    /* renamed from: e */
    public final R94 f26077e = new R94(this);

    /* renamed from: O94$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5910a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26078a;

        static {
            int[] iArr = new int[K94.EnumC4366a.values().length];
            f26078a = iArr;
            try {
                iArr[K94.EnumC4366a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26078a[K94.EnumC4366a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26078a[K94.EnumC4366a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public O94(OutputStream outputStream, Map<Class<?>, InterfaceC34919Od3<?>> map, Map<Class<?>, InterfaceC33338Hj6<?>> map2, InterfaceC34919Od3<Object> interfaceC34919Od3) {
        this.f26073a = outputStream;
        this.f26074b = map;
        this.f26075c = map2;
        this.f26076d = interfaceC34919Od3;
    }

    /* renamed from: o */
    public static ByteBuffer m92698o(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: t */
    public static K94 m92693t(C35916Sk1 c35916Sk1) {
        K94 k94 = (K94) c35916Sk1.m84928c(K94.class);
        if (k94 != null) {
            return k94;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: u */
    public static int m92692u(C35916Sk1 c35916Sk1) {
        K94 k94 = (K94) c35916Sk1.m84928c(K94.class);
        if (k94 != null) {
            return k94.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: v */
    public static /* synthetic */ void m92691v(Map.Entry entry, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f26070g, entry.getKey());
        interfaceC35153Pd3.mo23527f(f26071h, entry.getValue());
    }

    /* renamed from: b */
    public InterfaceC35153Pd3 m92707b(C35916Sk1 c35916Sk1, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m92690w((m92692u(c35916Sk1) << 3) | 1);
        this.f26073a.write(m92698o(8).putDouble(d).array());
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        return m92705h(c35916Sk1, obj, true);
    }

    /* renamed from: g */
    public InterfaceC35153Pd3 m92706g(C35916Sk1 c35916Sk1, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m92690w((m92692u(c35916Sk1) << 3) | 5);
        this.f26073a.write(m92698o(4).putFloat(f).array());
        return this;
    }

    /* renamed from: h */
    public InterfaceC35153Pd3 m92705h(C35916Sk1 c35916Sk1, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m92690w((m92692u(c35916Sk1) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f26069f);
            m92690w(bytes.length);
            this.f26073a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m92705h(c35916Sk1, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m92696q(f26072i, c35916Sk1, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return m92707b(c35916Sk1, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return m92706g(c35916Sk1, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return m92701l(c35916Sk1, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return m92699n(c35916Sk1, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m92690w((m92692u(c35916Sk1) << 3) | 2);
                m92690w(bArr.length);
                this.f26073a.write(bArr);
                return this;
            }
            InterfaceC34919Od3<?> interfaceC34919Od3 = this.f26074b.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                return m92696q(interfaceC34919Od3, c35916Sk1, obj, z);
            }
            InterfaceC33338Hj6<?> interfaceC33338Hj6 = this.f26075c.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                return m92695r(interfaceC33338Hj6, c35916Sk1, obj, z);
            }
            if (obj instanceof F94) {
                return mo23529d(c35916Sk1, ((F94) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return mo23529d(c35916Sk1, ((Enum) obj).ordinal());
            }
            return m92696q(this.f26076d, c35916Sk1, obj, z);
        }
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: i */
    public O94 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        return m92703j(c35916Sk1, i, true);
    }

    /* renamed from: j */
    public O94 m92703j(C35916Sk1 c35916Sk1, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        K94 m92693t = m92693t(c35916Sk1);
        int i2 = C5910a.f26078a[m92693t.intEncoding().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    m92690w((m92693t.tag() << 3) | 5);
                    this.f26073a.write(m92698o(4).putInt(i).array());
                }
            } else {
                m92690w(m92693t.tag() << 3);
                m92690w((i << 1) ^ (i >> 31));
            }
        } else {
            m92690w(m92693t.tag() << 3);
            m92690w(i);
        }
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: k */
    public O94 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        return m92701l(c35916Sk1, j, true);
    }

    /* renamed from: l */
    public O94 m92701l(C35916Sk1 c35916Sk1, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        K94 m92693t = m92693t(c35916Sk1);
        int i = C5910a.f26078a[m92693t.intEncoding().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m92690w((m92693t.tag() << 3) | 1);
                    this.f26073a.write(m92698o(8).putLong(j).array());
                }
            } else {
                m92690w(m92693t.tag() << 3);
                m92689x((j >> 63) ^ (j << 1));
            }
        } else {
            m92690w(m92693t.tag() << 3);
            m92689x(j);
        }
        return this;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: m */
    public O94 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        return m92699n(c35916Sk1, z, true);
    }

    /* renamed from: n */
    public O94 m92699n(C35916Sk1 c35916Sk1, boolean z, boolean z2) throws IOException {
        return m92703j(c35916Sk1, z ? 1 : 0, z2);
    }

    /* renamed from: p */
    public final <T> long m92697p(InterfaceC34919Od3<T> interfaceC34919Od3, T t) throws IOException {
        C44140kq2 c44140kq2 = new C44140kq2();
        try {
            OutputStream outputStream = this.f26073a;
            this.f26073a = c44140kq2;
            interfaceC34919Od3.encode(t, this);
            this.f26073a = outputStream;
            long m28374a = c44140kq2.m28374a();
            c44140kq2.close();
            return m28374a;
        } catch (Throwable th) {
            try {
                c44140kq2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: q */
    public final <T> O94 m92696q(InterfaceC34919Od3<T> interfaceC34919Od3, C35916Sk1 c35916Sk1, T t, boolean z) throws IOException {
        long m92697p = m92697p(interfaceC34919Od3, t);
        if (z && m92697p == 0) {
            return this;
        }
        m92690w((m92692u(c35916Sk1) << 3) | 2);
        m92689x(m92697p);
        interfaceC34919Od3.encode(t, this);
        return this;
    }

    /* renamed from: r */
    public final <T> O94 m92695r(InterfaceC33338Hj6<T> interfaceC33338Hj6, C35916Sk1 c35916Sk1, T t, boolean z) throws IOException {
        this.f26077e.m87231d(c35916Sk1, z);
        interfaceC33338Hj6.encode(t, this.f26077e);
        return this;
    }

    /* renamed from: s */
    public O94 m92694s(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC34919Od3<?> interfaceC34919Od3 = this.f26074b.get(obj.getClass());
        if (interfaceC34919Od3 != null) {
            interfaceC34919Od3.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    /* renamed from: w */
    public final void m92690w(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f26073a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f26073a.write(i & 127);
    }

    /* renamed from: x */
    public final void m92689x(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f26073a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f26073a.write(((int) j) & 127);
    }
}
