package p000;

import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"Lll1;", "", "Ljava/io/File;", "directory", C17296a.f69688o, "", "fileName", "b", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "uniqueIdGenerator", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ll1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44682ll1 {

    /* renamed from: a */
    public static final C44682ll1 f96658a = new C44682ll1();

    /* renamed from: b */
    public static final AtomicLong f96659b = new AtomicLong();

    private C44682ll1() {
    }

    /* renamed from: a */
    public final File m26882a(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        long andIncrement = f96659b.getAndIncrement();
        return m26881b(directory, "chucker-" + andIncrement);
    }

    /* renamed from: b */
    public final File m26881b(File directory, String fileName) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            File file = new File(directory, fileName);
            if (file.exists() && !file.delete()) {
                throw new IOException("Failed to delete file " + file);
            }
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (!file.createNewFile()) {
                throw new IOException("File " + file + " already exists");
            }
            return file;
        } catch (IOException e) {
            InterfaceC32758Ex2.f8338a.error("An error occurred while creating a file", e);
            return null;
        }
    }
}
