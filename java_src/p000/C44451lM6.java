package p000;

import android.support.annotation.Nullable;
import com.amazonaws.services.p026s3.internal.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
/* renamed from: lM6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44451lM6 {
    private C44451lM6() {
    }

    /* renamed from: a */
    public static String m27390a(File file) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, Constants.DEFAULT_ENCODING);
            C52760zN6.m1466j(C44451lM6.class, randomAccessFile);
            return str;
        } catch (Exception e2) {
            e = e2;
            randomAccessFile2 = randomAccessFile;
            KJ6.m99011b(C44451lM6.class, 3, e);
            C52760zN6.m1466j(C44451lM6.class, randomAccessFile2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            C52760zN6.m1466j(C44451lM6.class, randomAccessFile2);
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m27389b(File file, String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(str.getBytes(Constants.DEFAULT_ENCODING));
            C52760zN6.m1466j(C44451lM6.class, fileOutputStream);
            return true;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            KJ6.m99011b(C44451lM6.class, 3, e);
            C52760zN6.m1466j(C44451lM6.class, fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            C52760zN6.m1466j(C44451lM6.class, fileOutputStream2);
            throw th;
        }
    }

    /* renamed from: c */
    public static boolean m27388c(String[] strArr, String str) {
        if (strArr != null && str != null) {
            boolean z = !str.isEmpty();
            for (String str2 : strArr) {
                if ((z ? new File(str2, str) : new File(str2)).exists()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003f: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:22:0x003f */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Nullable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m27387d(File file) {
        BufferedReader bufferedReader;
        Closeable closeable;
        StringBuilder sb = new StringBuilder();
        Closeable closeable2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (IOException e) {
                        e = e;
                        sb.append(-403);
                        KJ6.m99011b(C44451lM6.class, 3, e);
                        C52760zN6.m1466j(C44451lM6.class, bufferedReader);
                        if (sb.toString().isEmpty()) {
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                C52760zN6.m1466j(C44451lM6.class, closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            C52760zN6.m1466j(C44451lM6.class, closeable2);
            throw th;
        }
        C52760zN6.m1466j(C44451lM6.class, bufferedReader);
        if (sb.toString().isEmpty()) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m27386e(File file) {
        try {
            if (file.exists()) {
                KJ6.m99012a(C44451lM6.class, 0, "deleting CachedConfigDataFromDisk");
                return file.delete();
            }
        } catch (Exception e) {
            KJ6.m99011b(C44451lM6.class, 3, e);
        }
        return false;
    }
}
