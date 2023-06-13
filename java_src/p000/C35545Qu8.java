package p000;

import android.net.Uri;
import android.system.Os;
import android.system.StructStat;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
/* renamed from: Qu8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35545Qu8 {
    /* renamed from: a */
    public static IOException m87582a(P78 p78, Uri uri, IOException iOException) {
        try {
            C36112Tf8 m83221b = C36112Tf8.m83221b();
            m83221b.m83220c();
            File file = (File) p78.m90726a(uri, m83221b);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.canWrite()) {
                            return m87580c(file, iOException);
                        }
                        return m87580c(file, iOException);
                    } else if (file.canWrite()) {
                        return m87580c(file, iOException);
                    } else {
                        return m87580c(file, iOException);
                    }
                } else if (file.canRead()) {
                    if (file.canWrite()) {
                        return m87580c(file, iOException);
                    }
                    return m87580c(file, iOException);
                } else if (file.canWrite()) {
                    return m87580c(file, iOException);
                } else {
                    return m87580c(file, iOException);
                }
            }
            return m87580c(file, iOException);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    /* renamed from: b */
    public static IOException m87581b(File file, IOException iOException) {
        String concat;
        try {
            Locale locale = Locale.US;
            String valueOf = String.valueOf(String.format(locale, " canonical[%s] freeSpace[%d]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace())));
            if (valueOf.length() != 0) {
                concat = "Inoperable file:".concat(valueOf);
            } else {
                concat = new String("Inoperable file:");
            }
            try {
                StructStat stat = Os.stat(file.getCanonicalPath());
                String valueOf2 = String.valueOf(concat);
                String valueOf3 = String.valueOf(String.format(locale, " mode[%d]", Integer.valueOf(stat.st_mode)));
                if (valueOf3.length() != 0) {
                    concat = valueOf2.concat(valueOf3);
                } else {
                    concat = new String(valueOf2);
                }
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = String.valueOf("Inoperable file:").concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    /* renamed from: c */
    public static IOException m87580c(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return m87581b(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return m87581b(file, iOException);
                    }
                    return m87581b(file, iOException);
                } else if (parentFile.canWrite()) {
                    return m87581b(file, iOException);
                } else {
                    return m87581b(file, iOException);
                }
            } else if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return m87581b(file, iOException);
                }
                return m87581b(file, iOException);
            } else if (parentFile.canWrite()) {
                return m87581b(file, iOException);
            } else {
                return m87581b(file, iOException);
            }
        }
        return m87581b(file, iOException);
    }
}
