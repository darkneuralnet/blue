package p000;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;
/* renamed from: NL1 */
/* loaded from: classes8.dex */
public class NL1 {

    /* renamed from: a */
    public final byte[] f24460a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    public final byte[] f24461b = new byte[128];

    public NL1() {
        m94049c();
    }

    /* renamed from: a */
    public int m94051a(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[72];
        while (i2 > 0) {
            int min = Math.min(36, i2);
            outputStream.write(bArr2, 0, m94050b(bArr, i, min, bArr2, 0));
            i += min;
            i2 -= min;
        }
        return i2 * 2;
    }

    /* renamed from: b */
    public int m94050b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int i4 = i2 + i;
        int i5 = i3;
        while (i < i4) {
            int i6 = i + 1;
            int i7 = bArr[i] & UByte.MAX_VALUE;
            int i8 = i5 + 1;
            byte[] bArr3 = this.f24460a;
            bArr2[i5] = bArr3[i7 >>> 4];
            i5 = i8 + 1;
            bArr2[i8] = bArr3[i7 & 15];
            i = i6;
        }
        return i5 - i3;
    }

    /* renamed from: c */
    public void m94049c() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f24461b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f24460a;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.f24461b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f24461b[bArr2[i]] = (byte) i;
            i++;
        }
    }
}
