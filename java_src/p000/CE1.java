package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: CE1 */
/* loaded from: classes8.dex */
public class CE1 extends AbstractC33820Jl2 {

    /* renamed from: c */
    public final int f3634c;

    /* renamed from: d */
    public final boolean f3635d;

    /* renamed from: e */
    public List<C34054Kl2> f3636e;

    /* renamed from: f */
    public List<C34522Ml2> f3637f;

    /* renamed from: g */
    public final long f3638g;

    /* renamed from: h */
    public long f3639h;

    /* renamed from: i */
    public DE1 f3640i;

    public CE1(int i, List<C34054Kl2> list, List<C34522Ml2> list2, long j, long j2, boolean z) {
        super(true);
        this.f3639h = 0L;
        this.f3634c = i;
        this.f3636e = Collections.unmodifiableList(list);
        this.f3637f = Collections.unmodifiableList(list2);
        this.f3639h = j;
        this.f3638g = j2;
        this.f3635d = z;
    }

    /* renamed from: a */
    public static CE1 m112603a(Object obj) throws IOException {
        if (obj instanceof CE1) {
            return (CE1) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() == 0) {
                int readInt = dataInputStream.readInt();
                long readLong = dataInputStream.readLong();
                long readLong2 = dataInputStream.readLong();
                boolean readBoolean = dataInputStream.readBoolean();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < readInt; i++) {
                    arrayList.add(C34054Kl2.m98313e(obj));
                }
                for (int i2 = 0; i2 < readInt - 1; i2++) {
                    arrayList2.add(C34522Ml2.m94918a(obj));
                }
                return new CE1(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            throw new IllegalStateException("unknown version for hss private key");
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m112603a(LR5.m96939b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    CE1 m112603a = m112603a(dataInputStream3);
                    dataInputStream3.close();
                    return m112603a;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: b */
    public static CE1 m112602b(byte[] bArr, byte[] bArr2) throws IOException {
        CE1 m112603a = m112603a(bArr);
        m112603a.f3640i = DE1.m110664a(bArr2);
        return m112603a;
    }

    /* renamed from: f */
    public static CE1 m112598f(CE1 ce1) {
        try {
            return m112603a(ce1.getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public int m112601c() {
        return this.f3634c;
    }

    public Object clone() throws CloneNotSupportedException {
        return m112598f(this);
    }

    /* renamed from: d */
    public synchronized DE1 m112600d() {
        return new DE1(this.f3634c, m112599e().m98309i());
    }

    /* renamed from: e */
    public C34054Kl2 m112599e() {
        return this.f3636e.get(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CE1 ce1 = (CE1) obj;
        if (this.f3634c == ce1.f3634c && this.f3635d == ce1.f3635d && this.f3638g == ce1.f3638g && this.f3639h == ce1.f3639h && this.f3636e.equals(ce1.f3636e)) {
            return this.f3637f.equals(ce1.f3637f);
        }
        return false;
    }

    @Override // p000.AbstractC33820Jl2, p000.InterfaceC39228cb1
    public synchronized byte[] getEncoded() throws IOException {
        C33188Gt0 m104625a;
        m104625a = C33188Gt0.m104620f().m104617i(0).m104617i(this.f3634c).m104616j(this.f3639h).m104616j(this.f3638g).m104625a(this.f3635d);
        for (C34054Kl2 c34054Kl2 : this.f3636e) {
            m104625a.m104623c(c34054Kl2);
        }
        for (C34522Ml2 c34522Ml2 : this.f3637f) {
            m104625a.m104623c(c34522Ml2);
        }
        return m104625a.m104624b();
    }

    public int hashCode() {
        long j = this.f3638g;
        long j2 = this.f3639h;
        return (((((((((this.f3634c * 31) + (this.f3635d ? 1 : 0)) * 31) + this.f3636e.hashCode()) * 31) + this.f3637f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
