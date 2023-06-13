package p000;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* renamed from: Bj2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31930Bj2 implements InterfaceC35153Pd3, InterfaceC33572Ij6 {

    /* renamed from: a */
    public C31930Bj2 f2732a = null;

    /* renamed from: b */
    public boolean f2733b = true;

    /* renamed from: c */
    public final JsonWriter f2734c;

    /* renamed from: d */
    public final Map<Class<?>, InterfaceC34919Od3<?>> f2735d;

    /* renamed from: e */
    public final Map<Class<?>, InterfaceC33338Hj6<?>> f2736e;

    /* renamed from: f */
    public final InterfaceC34919Od3<Object> f2737f;

    /* renamed from: g */
    public final boolean f2738g;

    public C31930Bj2(Writer writer, Map<Class<?>, InterfaceC34919Od3<?>> map, Map<Class<?>, InterfaceC33338Hj6<?>> map2, InterfaceC34919Od3<Object> interfaceC34919Od3, boolean z) {
        this.f2734c = new JsonWriter(writer);
        this.f2735d = map;
        this.f2736e = map2;
        this.f2737f = interfaceC34919Od3;
        this.f2738g = z;
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: c */
    public InterfaceC35153Pd3 mo23530c(C35916Sk1 c35916Sk1, boolean z) throws IOException {
        return m113636n(c35916Sk1.m84929b(), z);
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: d */
    public InterfaceC35153Pd3 mo23529d(C35916Sk1 c35916Sk1, int i) throws IOException {
        return m113639k(c35916Sk1.m84929b(), i);
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: e */
    public InterfaceC35153Pd3 mo23528e(C35916Sk1 c35916Sk1, long j) throws IOException {
        return m113638l(c35916Sk1.m84929b(), j);
    }

    @Override // p000.InterfaceC35153Pd3
    /* renamed from: f */
    public InterfaceC35153Pd3 mo23527f(C35916Sk1 c35916Sk1, Object obj) throws IOException {
        return m113637m(c35916Sk1.m84929b(), obj);
    }

    /* renamed from: g */
    public C31930Bj2 m113643g(int i) throws IOException {
        m113628v();
        this.f2734c.value(i);
        return this;
    }

    /* renamed from: h */
    public C31930Bj2 m113642h(long j) throws IOException {
        m113628v();
        this.f2734c.value(j);
        return this;
    }

    /* renamed from: i */
    public C31930Bj2 m113641i(Object obj, boolean z) throws IOException {
        int[] iArr;
        Class<?> cls;
        int i = 0;
        if (z && m113633q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f2734c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f2734c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return m113634p((byte[]) obj);
            }
            this.f2734c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f2734c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    m113642h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f2734c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f2734c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m113641i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m113641i(obj2, false);
                }
            }
            this.f2734c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f2734c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m113641i(obj3, false);
            }
            this.f2734c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f2734c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m113637m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f2734c.endObject();
            return this;
        } else {
            InterfaceC34919Od3<?> interfaceC34919Od3 = this.f2735d.get(obj.getClass());
            if (interfaceC34919Od3 != null) {
                return m113631s(interfaceC34919Od3, obj, z);
            }
            InterfaceC33338Hj6<?> interfaceC33338Hj6 = this.f2736e.get(obj.getClass());
            if (interfaceC33338Hj6 != null) {
                interfaceC33338Hj6.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                mo8615a(((Enum) obj).name());
                return this;
            } else {
                return m113631s(this.f2737f, obj, z);
            }
        }
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: j */
    public C31930Bj2 mo8615a(String str) throws IOException {
        m113628v();
        this.f2734c.value(str);
        return this;
    }

    /* renamed from: k */
    public C31930Bj2 m113639k(String str, int i) throws IOException {
        m113628v();
        this.f2734c.name(str);
        return m113643g(i);
    }

    /* renamed from: l */
    public C31930Bj2 m113638l(String str, long j) throws IOException {
        m113628v();
        this.f2734c.name(str);
        return m113642h(j);
    }

    /* renamed from: m */
    public C31930Bj2 m113637m(String str, Object obj) throws IOException {
        if (this.f2738g) {
            return m113629u(str, obj);
        }
        return m113630t(str, obj);
    }

    /* renamed from: n */
    public C31930Bj2 m113636n(String str, boolean z) throws IOException {
        m113628v();
        this.f2734c.name(str);
        return mo8614b(z);
    }

    @Override // p000.InterfaceC33572Ij6
    /* renamed from: o */
    public C31930Bj2 mo8614b(boolean z) throws IOException {
        m113628v();
        this.f2734c.value(z);
        return this;
    }

    /* renamed from: p */
    public C31930Bj2 m113634p(byte[] bArr) throws IOException {
        m113628v();
        if (bArr == null) {
            this.f2734c.nullValue();
        } else {
            this.f2734c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: q */
    public final boolean m113633q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: r */
    public void m113632r() throws IOException {
        m113628v();
        this.f2734c.flush();
    }

    /* renamed from: s */
    public C31930Bj2 m113631s(InterfaceC34919Od3<Object> interfaceC34919Od3, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f2734c.beginObject();
        }
        interfaceC34919Od3.encode(obj, this);
        if (!z) {
            this.f2734c.endObject();
        }
        return this;
    }

    /* renamed from: t */
    public final C31930Bj2 m113630t(String str, Object obj) throws IOException, EncodingException {
        m113628v();
        this.f2734c.name(str);
        if (obj == null) {
            this.f2734c.nullValue();
            return this;
        }
        return m113641i(obj, false);
    }

    /* renamed from: u */
    public final C31930Bj2 m113629u(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        m113628v();
        this.f2734c.name(str);
        return m113641i(obj, false);
    }

    /* renamed from: v */
    public final void m113628v() throws IOException {
        if (this.f2733b) {
            C31930Bj2 c31930Bj2 = this.f2732a;
            if (c31930Bj2 != null) {
                c31930Bj2.m113628v();
                this.f2732a.f2733b = false;
                this.f2732a = null;
                this.f2734c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
