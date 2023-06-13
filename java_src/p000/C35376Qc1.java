package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.UByte;
/* renamed from: Qc1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35376Qc1 {
    private C35376Qc1() {
    }

    /* renamed from: a */
    public static int m88359a(int i) {
        return (((i + 8) - 1) & (-8)) / 8;
    }

    /* renamed from: b */
    public static byte[] m88358b(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: c */
    public static RuntimeException m88357c(String str) {
        return new IllegalStateException(str);
    }

    /* renamed from: d */
    public static byte[] m88356d(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw m88357c("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        throw m88357c("Inflater did not finish");
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m88355e(InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i4 += inflater.inflate(bArr, i4, i2 - i4);
                        i3 += read;
                    } catch (DataFormatException e) {
                        throw m88357c(e.getMessage());
                    }
                } else {
                    throw m88357c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            throw m88357c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: f */
    public static String m88354f(InputStream inputStream, int i) throws IOException {
        return new String(m88356d(inputStream, i), StandardCharsets.UTF_8);
    }

    /* renamed from: g */
    public static long m88353g(InputStream inputStream, int i) throws IOException {
        byte[] m88356d = m88356d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (m88356d[i2] & UByte.MAX_VALUE) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: h */
    public static int m88352h(InputStream inputStream) throws IOException {
        return (int) m88353g(inputStream, 2);
    }

    /* renamed from: i */
    public static long m88351i(InputStream inputStream) throws IOException {
        return m88353g(inputStream, 4);
    }

    /* renamed from: j */
    public static int m88350j(InputStream inputStream) throws IOException {
        return (int) m88353g(inputStream, 1);
    }

    /* renamed from: k */
    public static int m88349k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* renamed from: l */
    public static void m88348l(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public static void m88347m(OutputStream outputStream, byte[] bArr) throws IOException {
        m88343q(outputStream, bArr.length);
        byte[] m88358b = m88358b(bArr);
        m88343q(outputStream, m88358b.length);
        outputStream.write(m88358b);
    }

    /* renamed from: n */
    public static void m88346n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: o */
    public static void m88345o(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* renamed from: p */
    public static void m88344p(OutputStream outputStream, int i) throws IOException {
        m88345o(outputStream, i, 2);
    }

    /* renamed from: q */
    public static void m88343q(OutputStream outputStream, long j) throws IOException {
        m88345o(outputStream, j, 4);
    }

    /* renamed from: r */
    public static void m88342r(OutputStream outputStream, int i) throws IOException {
        m88345o(outputStream, i, 1);
    }
}
