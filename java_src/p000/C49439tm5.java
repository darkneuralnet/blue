package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
/* renamed from: tm5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49439tm5 {
    private C49439tm5() {
    }

    /* renamed from: a */
    public static int m11794a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                i += read;
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return i;
            }
        }
    }

    /* renamed from: b */
    public static byte[] m11793b(Callable<InputStream> callable) throws Exception {
        InputStream call = callable.call();
        try {
            byte[] m11792c = m11792c(call);
            if (call != null) {
                call.close();
            }
            return m11792c;
        } catch (Throwable th) {
            if (call != null) {
                try {
                    call.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static byte[] m11792c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m11794a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
