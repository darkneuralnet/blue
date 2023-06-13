package p000;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import kotlin.UByte;
/* renamed from: BM6 */
/* loaded from: classes6.dex */
public final class BM6 {

    /* renamed from: a */
    public static NJ6 f2230a;

    /* renamed from: a */
    public static String m114072a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        RL6.m86831a(th, th2);
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    /* renamed from: b */
    public static long m114071b(byte[] bArr, int i) {
        return ((m114070c(bArr, i + 2) << 16) | m114070c(bArr, i)) & 4294967295L;
    }

    /* renamed from: c */
    public static int m114070c(byte[] bArr, int i) {
        return ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | (bArr[i] & UByte.MAX_VALUE);
    }

    /* renamed from: d */
    public static boolean m114069d(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: e */
    public static boolean m114068e(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: f */
    public static boolean m114067f(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: g */
    public static boolean m114066g(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i != 6 || i2 == 6 || i2 == 5) {
            if (i != 4 || i2 == 4) {
                if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
                    return true;
                }
                if (i == 2) {
                    return i2 == 1 || i2 == 8;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: h */
    public static synchronized NJ6 m114065h(Context context) {
        NJ6 nj6;
        synchronized (BM6.class) {
            if (f2230a == null) {
                C46221oL6 c46221oL6 = new C46221oL6(null);
                c46221oL6.m21305b(new C50990wO6(RO6.m86776c(context)));
                f2230a = c46221oL6.m21306a();
            }
            nj6 = f2230a;
        }
        return nj6;
    }
}
