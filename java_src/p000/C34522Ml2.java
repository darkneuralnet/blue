package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* renamed from: Ml2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C34522Ml2 implements InterfaceC39228cb1 {

    /* renamed from: b */
    public final int f23500b;

    /* renamed from: c */
    public final C33352Hl2 f23501c;

    /* renamed from: d */
    public final C34756Nl2 f23502d;

    /* renamed from: e */
    public final byte[][] f23503e;

    public C34522Ml2(int i, C33352Hl2 c33352Hl2, C34756Nl2 c34756Nl2, byte[][] bArr) {
        this.f23500b = i;
        this.f23501c = c33352Hl2;
        this.f23502d = c34756Nl2;
        this.f23503e = bArr;
    }

    /* renamed from: a */
    public static C34522Ml2 m94918a(Object obj) throws IOException {
        if (obj instanceof C34522Ml2) {
            return (C34522Ml2) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            C33352Hl2 m103475a = C33352Hl2.m103475a(obj);
            C34756Nl2 m93477e = C34756Nl2.m93477e(dataInputStream.readInt());
            int m93479c = m93477e.m93479c();
            byte[][] bArr = new byte[m93479c];
            for (int i = 0; i < m93479c; i++) {
                byte[] bArr2 = new byte[m93477e.m93478d()];
                bArr[i] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new C34522Ml2(readInt, m103475a, m93477e, bArr);
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m94918a(LR5.m96939b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C34522Ml2 m94918a = m94918a(dataInputStream3);
                    dataInputStream3.close();
                    return m94918a;
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
        C34522Ml2 c34522Ml2 = (C34522Ml2) obj;
        if (this.f23500b != c34522Ml2.f23500b) {
            return false;
        }
        C33352Hl2 c33352Hl2 = this.f23501c;
        if (c33352Hl2 == null ? c34522Ml2.f23501c == null : c33352Hl2.equals(c34522Ml2.f23501c)) {
            C34756Nl2 c34756Nl2 = this.f23502d;
            if (c34756Nl2 == null ? c34522Ml2.f23502d == null : c34756Nl2.equals(c34522Ml2.f23502d)) {
                return Arrays.deepEquals(this.f23503e, c34522Ml2.f23503e);
            }
            return false;
        }
        return false;
    }

    @Override // p000.InterfaceC39228cb1
    public byte[] getEncoded() throws IOException {
        return C33188Gt0.m104620f().m104617i(this.f23500b).m104622d(this.f23501c.getEncoded()).m104617i(this.f23502d.m93476f()).m104621e(this.f23503e).m104624b();
    }

    public int hashCode() {
        int i = this.f23500b * 31;
        C33352Hl2 c33352Hl2 = this.f23501c;
        int hashCode = (i + (c33352Hl2 != null ? c33352Hl2.hashCode() : 0)) * 31;
        C34756Nl2 c34756Nl2 = this.f23502d;
        return ((hashCode + (c34756Nl2 != null ? c34756Nl2.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.f23503e);
    }
}
