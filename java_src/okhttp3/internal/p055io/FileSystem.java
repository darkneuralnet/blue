package okhttp3.internal.p055io;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0015"}, m28432d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Ljava/io/File;", "file", "LAN5;", Stripe3ds2AuthParams.FIELD_SOURCE, "LwB5;", "sink", "appendingSink", "", "delete", "", "exists", "", "size", "from", "to", "rename", "directory", "deleteContents", "Companion", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: okhttp3.internal.io.FileSystem */
/* loaded from: classes8.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    @JvmField
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m28432d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: okhttp3.internal.io.FileSystem$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, m28432d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "LAN5;", Stripe3ds2AuthParams.FIELD_SOURCE, "LwB5;", "sink", "appendingSink", "", "delete", "", "exists", "", "size", "from", "to", "rename", "directory", "deleteContents", "", "toString", "<init>", "()V", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: okhttp3.internal.io.FileSystem$Companion$SystemFileSystem */
        /* loaded from: classes8.dex */
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.p055io.FileSystem
            public InterfaceC50872wB5 appendingSink(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return C34928Oe3.m91762a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C34928Oe3.m91762a(file);
                }
            }

            @Override // okhttp3.internal.p055io.FileSystem
            public void delete(File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
                }
            }

            @Override // okhttp3.internal.p055io.FileSystem
            public void deleteContents(File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file = listFiles[i];
                        i++;
                        if (file.isDirectory()) {
                            Intrinsics.checkNotNullExpressionValue(file, "file");
                            deleteContents(file);
                        }
                        if (!file.delete()) {
                            throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
                        }
                    }
                    return;
                }
                throw new IOException(Intrinsics.stringPlus("not a readable directory: ", directory));
            }

            @Override // okhttp3.internal.p055io.FileSystem
            public boolean exists(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.p055io.FileSystem
            public void rename(File from, File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.p055io.FileSystem
            public InterfaceC50872wB5 sink(File file) throws FileNotFoundException {
                InterfaceC50872wB5 m88279h;
                InterfaceC50872wB5 m88279h2;
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    m88279h2 = C35396Qe3.m88279h(file, false, 1, null);
                    return m88279h2;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    m88279h = C35396Qe3.m88279h(file, false, 1, null);
                    return m88279h;
                }
            }

            @Override // okhttp3.internal.p055io.FileSystem
            public long size(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.p055io.FileSystem
            public AN5 source(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                return C34928Oe3.m91752k(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    InterfaceC50872wB5 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    InterfaceC50872wB5 sink(File file) throws FileNotFoundException;

    long size(File file);

    AN5 source(File file) throws FileNotFoundException;
}
