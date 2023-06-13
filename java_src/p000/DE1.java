package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: DE1 */
/* loaded from: classes8.dex */
public class DE1 extends AbstractC33820Jl2 {

    /* renamed from: c */
    public final int f5405c;

    /* renamed from: d */
    public final C34288Ll2 f5406d;

    public DE1(int i, C34288Ll2 c34288Ll2) {
        super(false);
        this.f5405c = i;
        this.f5406d = c34288Ll2;
    }

    /* renamed from: a */
    public static DE1 m110664a(Object obj) throws IOException {
        if (obj instanceof DE1) {
            return (DE1) obj;
        }
        if (obj instanceof DataInputStream) {
            return new DE1(((DataInputStream) obj).readInt(), C34288Ll2.m96377a(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m110664a(LR5.m96939b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                DE1 m110664a = m110664a(dataInputStream2);
                dataInputStream2.close();
                return m110664a;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    public int m110663b() {
        return this.f5405c;
    }

    /* renamed from: c */
    public C34288Ll2 m110662c() {
        return this.f5406d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DE1 de1 = (DE1) obj;
        if (this.f5405c != de1.f5405c) {
            return false;
        }
        return this.f5406d.equals(de1.f5406d);
    }

    @Override // p000.AbstractC33820Jl2, p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        return C33188Gt0.m104620f().m104617i(this.f5405c).m104622d(this.f5406d.getEncoded()).m104624b();
    }

    public int hashCode() {
        return (this.f5405c * 31) + this.f5406d.hashCode();
    }
}
