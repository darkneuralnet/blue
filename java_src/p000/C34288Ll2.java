package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: Ll2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C34288Ll2 extends AbstractC33820Jl2 {

    /* renamed from: c */
    public final C34756Nl2 f22022c;

    /* renamed from: d */
    public final C33118Gl2 f22023d;

    /* renamed from: e */
    public final byte[] f22024e;

    /* renamed from: f */
    public final byte[] f22025f;

    public C34288Ll2(C34756Nl2 c34756Nl2, C33118Gl2 c33118Gl2, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f22022c = c34756Nl2;
        this.f22023d = c33118Gl2;
        this.f22024e = C0210Ao.m115251d(bArr2);
        this.f22025f = C0210Ao.m115251d(bArr);
    }

    /* renamed from: a */
    public static C34288Ll2 m96377a(Object obj) throws IOException {
        if (obj instanceof C34288Ll2) {
            return (C34288Ll2) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C34756Nl2 m93477e = C34756Nl2.m93477e(dataInputStream.readInt());
            C33118Gl2 m104784e = C33118Gl2.m104784e(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[m93477e.m93478d()];
            dataInputStream.readFully(bArr2);
            return new C34288Ll2(m93477e, m104784e, bArr2, bArr);
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m96377a(LR5.m96939b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C34288Ll2 m96377a = m96377a(dataInputStream3);
                    dataInputStream3.close();
                    return m96377a;
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
    public byte[] m96376b() {
        return C33188Gt0.m104620f().m104617i(this.f22022c.m93476f()).m104617i(this.f22023d.m104783f()).m104622d(this.f22024e).m104622d(this.f22025f).m104624b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C34288Ll2 c34288Ll2 = (C34288Ll2) obj;
        if (this.f22022c.equals(c34288Ll2.f22022c) && this.f22023d.equals(c34288Ll2.f22023d) && C0210Ao.m115254a(this.f22024e, c34288Ll2.f22024e)) {
            return C0210Ao.m115254a(this.f22025f, c34288Ll2.f22025f);
        }
        return false;
    }

    @Override // p000.AbstractC33820Jl2, p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        return m96376b();
    }

    public int hashCode() {
        return (((((this.f22022c.hashCode() * 31) + this.f22023d.hashCode()) * 31) + C0210Ao.m115244k(this.f22024e)) * 31) + C0210Ao.m115244k(this.f22025f);
    }
}
