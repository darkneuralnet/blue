package bo.app;

import com.amazonaws.services.p026s3.internal.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: bo.app.r6 */
/* loaded from: classes.dex */
final class C13090r6 {

    /* renamed from: a */
    static final Charset f59231a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f59232b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: a */
    public static void m63019a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m63019a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* renamed from: a */
    public static void m63020a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
