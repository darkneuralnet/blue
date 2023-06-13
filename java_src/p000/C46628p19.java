package p000;

import java.io.File;
import java.io.IOException;
/* renamed from: p19  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46628p19 {

    /* renamed from: a */
    public static final InterfaceC52232yU8<File> f102967a = new C40698f19();

    /* renamed from: a */
    public static void m20140a(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Unable to create parent directories of ");
        sb.append(valueOf);
        throw new IOException(sb.toString());
    }
}
