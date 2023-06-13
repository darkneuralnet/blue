package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: vi6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50585vi6 {

    /* renamed from: a */
    public static final Charset f114535a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f114536b = Charset.forName(Constants.DEFAULT_ENCODING);

    private C50585vi6() {
    }

    /* renamed from: a */
    public static void m8244a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m8243b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m8243b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
