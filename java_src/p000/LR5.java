package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: LR5 */
/* loaded from: classes8.dex */
public final class LR5 {

    /* renamed from: a */
    public static int f21410a = 4096;

    /* renamed from: a */
    public static void m96940a(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i = f21410a;
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr, 0, i);
            if (read < 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    public static byte[] m96939b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m96940a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public static int m96938c(InputStream inputStream, byte[] bArr) throws IOException {
        return m96937d(inputStream, bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static int m96937d(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        return i3;
    }
}
