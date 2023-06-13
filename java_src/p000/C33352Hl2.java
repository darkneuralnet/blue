package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* renamed from: Hl2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33352Hl2 implements InterfaceC39228cb1 {

    /* renamed from: b */
    public final C33118Gl2 f13846b;

    /* renamed from: c */
    public final byte[] f13847c;

    /* renamed from: d */
    public final byte[] f13848d;

    public C33352Hl2(C33118Gl2 c33118Gl2, byte[] bArr, byte[] bArr2) {
        this.f13846b = c33118Gl2;
        this.f13847c = bArr;
        this.f13848d = bArr2;
    }

    /* renamed from: a */
    public static C33352Hl2 m103475a(Object obj) throws IOException {
        if (obj instanceof C33352Hl2) {
            return (C33352Hl2) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C33118Gl2 m104784e = C33118Gl2.m104784e(dataInputStream.readInt());
            byte[] bArr = new byte[m104784e.m104786c()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[m104784e.m104785d() * m104784e.m104786c()];
            dataInputStream.readFully(bArr2);
            return new C33352Hl2(m104784e, bArr, bArr2);
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m103475a(LR5.m96939b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C33352Hl2 m103475a = m103475a(dataInputStream3);
                    dataInputStream3.close();
                    return m103475a;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C33352Hl2 c33352Hl2 = (C33352Hl2) obj;
        C33118Gl2 c33118Gl2 = this.f13846b;
        if (c33118Gl2 == null ? c33352Hl2.f13846b == null : c33118Gl2.equals(c33352Hl2.f13846b)) {
            if (Arrays.equals(this.f13847c, c33352Hl2.f13847c)) {
                return Arrays.equals(this.f13848d, c33352Hl2.f13848d);
            }
            return false;
        }
        return false;
    }

    @Override // p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        return C33188Gt0.m104620f().m104617i(this.f13846b.m104783f()).m104622d(this.f13847c).m104622d(this.f13848d).m104624b();
    }

    public int hashCode() {
        C33118Gl2 c33118Gl2 = this.f13846b;
        return ((((c33118Gl2 != null ? c33118Gl2.hashCode() : 0) * 31) + Arrays.hashCode(this.f13847c)) * 31) + Arrays.hashCode(this.f13848d);
    }
}
