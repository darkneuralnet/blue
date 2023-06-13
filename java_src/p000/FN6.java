package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* renamed from: FN6 */
/* loaded from: classes6.dex */
public final class FN6 implements ZN6 {

    /* renamed from: a */
    public final /* synthetic */ Set f9270a;

    /* renamed from: b */
    public final /* synthetic */ VO6 f9271b;

    /* renamed from: c */
    public final /* synthetic */ ZipFile f9272c;

    public FN6(Set set, VO6 vo6, ZipFile zipFile) {
        this.f9270a = set;
        this.f9271b = vo6;
        this.f9272c = zipFile;
    }

    @Override // p000.ZN6
    /* renamed from: a */
    public final void mo73221a(C43283jO6 c43283jO6, File file, boolean z) throws IOException {
        this.f9270a.add(file);
        if (z) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f9271b.m79886b(), c43283jO6.f92643a, this.f9271b.m79887a().getAbsolutePath(), c43283jO6.f92644b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f9272c;
        ZipEntry zipEntry = c43283jO6.f92644b;
        Pattern pattern = C45062mO6.f97946b;
        byte[] bArr = new byte[4096];
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    fileOutputStream.close();
                    inputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    RL6.m86831a(th, th2);
                }
            }
            throw th;
        }
    }
}
