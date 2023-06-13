package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: ti6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49400ti6 {

    /* renamed from: a */
    public static final Charset f110928a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f110929b = Charset.forName(Constants.DEFAULT_ENCODING);

    private C49400ti6() {
    }

    /* renamed from: a */
    public static void m11881a(Closeable closeable) {
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
    public static void m11880b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m11880b(file2);
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
