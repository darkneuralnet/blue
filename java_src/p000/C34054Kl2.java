package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: Kl2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C34054Kl2 extends AbstractC33820Jl2 {

    /* renamed from: m */
    public static C4588a f20179m;

    /* renamed from: n */
    public static C4588a[] f20180n;

    /* renamed from: c */
    public final byte[] f20181c;

    /* renamed from: d */
    public final C34756Nl2 f20182d;

    /* renamed from: e */
    public final C33118Gl2 f20183e;

    /* renamed from: f */
    public final int f20184f;

    /* renamed from: g */
    public final byte[] f20185g;

    /* renamed from: h */
    public final Map<C4588a, byte[]> f20186h;

    /* renamed from: i */
    public final int f20187i;

    /* renamed from: j */
    public final P31 f20188j;

    /* renamed from: k */
    public int f20189k;

    /* renamed from: l */
    public C34288Ll2 f20190l;

    /* renamed from: Kl2$a */
    /* loaded from: classes8.dex */
    public static class C4588a {

        /* renamed from: a */
        public final int f20191a;

        public C4588a(int i) {
            this.f20191a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4588a) && ((C4588a) obj).f20191a == this.f20191a;
        }

        public int hashCode() {
            return this.f20191a;
        }
    }

    static {
        C4588a c4588a = new C4588a(1);
        f20179m = c4588a;
        C4588a[] c4588aArr = new C4588a[129];
        f20180n = c4588aArr;
        c4588aArr[1] = c4588a;
        int i = 2;
        while (true) {
            C4588a[] c4588aArr2 = f20180n;
            if (i >= c4588aArr2.length) {
                return;
            }
            c4588aArr2[i] = new C4588a(i);
            i++;
        }
    }

    public C34054Kl2(C34756Nl2 c34756Nl2, C33118Gl2 c33118Gl2, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f20182d = c34756Nl2;
        this.f20183e = c33118Gl2;
        this.f20189k = i;
        this.f20181c = C0210Ao.m115251d(bArr);
        this.f20184f = i2;
        this.f20185g = C0210Ao.m115251d(bArr2);
        this.f20187i = 1 << (c34756Nl2.m93479c() + 1);
        this.f20186h = new WeakHashMap();
        this.f20188j = T31.m84396a(c34756Nl2.m93480b());
    }

    /* renamed from: e */
    public static C34054Kl2 m98313e(Object obj) throws IOException {
        DataInputStream dataInputStream;
        if (obj instanceof C34054Kl2) {
            return (C34054Kl2) obj;
        }
        if (!(obj instanceof DataInputStream)) {
            if (!(obj instanceof byte[])) {
                if (obj instanceof InputStream) {
                    return m98313e(LR5.m96939b((InputStream) obj));
                }
                throw new IllegalArgumentException("cannot parse " + obj);
            }
            DataInputStream dataInputStream2 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C34054Kl2 m98313e = m98313e(dataInputStream);
                dataInputStream.close();
                return m98313e;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        }
        DataInputStream dataInputStream3 = (DataInputStream) obj;
        if (dataInputStream3.readInt() == 0) {
            C34756Nl2 m93477e = C34756Nl2.m93477e(dataInputStream3.readInt());
            C33118Gl2 m104784e = C33118Gl2.m104784e(dataInputStream3.readInt());
            byte[] bArr = new byte[16];
            dataInputStream3.readFully(bArr);
            int readInt = dataInputStream3.readInt();
            int readInt2 = dataInputStream3.readInt();
            int readInt3 = dataInputStream3.readInt();
            if (readInt3 >= 0) {
                if (readInt3 <= dataInputStream3.available()) {
                    byte[] bArr2 = new byte[readInt3];
                    dataInputStream3.readFully(bArr2);
                    return new C34054Kl2(m93477e, m104784e, readInt, bArr, readInt2, bArr2);
                }
                throw new IOException("secret length exceeded " + dataInputStream3.available());
            }
            throw new IllegalStateException("secret length less than zero");
        }
        throw new IllegalStateException("expected version 0 lms private key");
    }

    /* renamed from: f */
    public static C34054Kl2 m98312f(byte[] bArr, byte[] bArr2) throws IOException {
        C34054Kl2 m98313e = m98313e(bArr);
        m98313e.f20190l = C34288Ll2.m96377a(bArr2);
        return m98313e;
    }

    /* renamed from: a */
    public final byte[] m98317a(int i) {
        int m93479c = 1 << m98308j().m93479c();
        if (i >= m93479c) {
            C38223at2.m65328a(m98314d(), this.f20188j);
            C38223at2.m65326c(i, this.f20188j);
            C38223at2.m65327b((short) -32126, this.f20188j);
            C38223at2.m65328a(C34990Ol2.m91550a(m98310h(), m98314d(), i - m93479c, m98311g()), this.f20188j);
            byte[] bArr = new byte[this.f20188j.mo15578e()];
            this.f20188j.mo15581a(bArr, 0);
            return bArr;
        }
        int i2 = i * 2;
        byte[] m98316b = m98316b(i2);
        byte[] m98316b2 = m98316b(i2 + 1);
        C38223at2.m65328a(m98314d(), this.f20188j);
        C38223at2.m65326c(i, this.f20188j);
        C38223at2.m65327b((short) -31869, this.f20188j);
        C38223at2.m65328a(m98316b, this.f20188j);
        C38223at2.m65328a(m98316b2, this.f20188j);
        byte[] bArr2 = new byte[this.f20188j.mo15578e()];
        this.f20188j.mo15581a(bArr2, 0);
        return bArr2;
    }

    /* renamed from: b */
    public byte[] m98316b(int i) {
        if (i < this.f20187i) {
            C4588a[] c4588aArr = f20180n;
            return m98315c(i < c4588aArr.length ? c4588aArr[i] : new C4588a(i));
        }
        return m98317a(i);
    }

    /* renamed from: c */
    public final byte[] m98315c(C4588a c4588a) {
        synchronized (this.f20186h) {
            byte[] bArr = this.f20186h.get(c4588a);
            if (bArr != null) {
                return bArr;
            }
            byte[] m98317a = m98317a(c4588a.f20191a);
            this.f20186h.put(c4588a, m98317a);
            return m98317a;
        }
    }

    /* renamed from: d */
    public byte[] m98314d() {
        return C0210Ao.m115251d(this.f20181c);
    }

    public boolean equals(Object obj) {
        C34288Ll2 c34288Ll2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C34054Kl2 c34054Kl2 = (C34054Kl2) obj;
        if (this.f20189k == c34054Kl2.f20189k && this.f20184f == c34054Kl2.f20184f && C0210Ao.m115254a(this.f20181c, c34054Kl2.f20181c)) {
            C34756Nl2 c34756Nl2 = this.f20182d;
            if (c34756Nl2 == null ? c34054Kl2.f20182d == null : c34756Nl2.equals(c34054Kl2.f20182d)) {
                C33118Gl2 c33118Gl2 = this.f20183e;
                if (c33118Gl2 == null ? c34054Kl2.f20183e == null : c33118Gl2.equals(c34054Kl2.f20183e)) {
                    if (C0210Ao.m115254a(this.f20185g, c34054Kl2.f20185g)) {
                        C34288Ll2 c34288Ll22 = this.f20190l;
                        if (c34288Ll22 == null || (c34288Ll2 = c34054Kl2.f20190l) == null) {
                            return true;
                        }
                        return c34288Ll22.equals(c34288Ll2);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public byte[] m98311g() {
        return C0210Ao.m115251d(this.f20185g);
    }

    @Override // p000.AbstractC33820Jl2, p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        return C33188Gt0.m104620f().m104617i(0).m104617i(this.f20182d.m93476f()).m104617i(this.f20183e.m104783f()).m104622d(this.f20181c).m104617i(this.f20189k).m104617i(this.f20184f).m104617i(this.f20185g.length).m104622d(this.f20185g).m104624b();
    }

    /* renamed from: h */
    public C33118Gl2 m98310h() {
        return this.f20183e;
    }

    public int hashCode() {
        int m115244k = ((this.f20189k * 31) + C0210Ao.m115244k(this.f20181c)) * 31;
        C34756Nl2 c34756Nl2 = this.f20182d;
        int hashCode = (m115244k + (c34756Nl2 != null ? c34756Nl2.hashCode() : 0)) * 31;
        C33118Gl2 c33118Gl2 = this.f20183e;
        int hashCode2 = (((((hashCode + (c33118Gl2 != null ? c33118Gl2.hashCode() : 0)) * 31) + this.f20184f) * 31) + C0210Ao.m115244k(this.f20185g)) * 31;
        C34288Ll2 c34288Ll2 = this.f20190l;
        return hashCode2 + (c34288Ll2 != null ? c34288Ll2.hashCode() : 0);
    }

    /* renamed from: i */
    public C34288Ll2 m98309i() {
        C34288Ll2 c34288Ll2;
        synchronized (this) {
            if (this.f20190l == null) {
                this.f20190l = new C34288Ll2(this.f20182d, this.f20183e, m98315c(f20179m), this.f20181c);
            }
            c34288Ll2 = this.f20190l;
        }
        return c34288Ll2;
    }

    /* renamed from: j */
    public C34756Nl2 m98308j() {
        return this.f20182d;
    }
}
