package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class FileUtil extends ContextAwareBase {
    static final int BUF_SIZE = 32768;

    public FileUtil(Context context) {
        setContext(context);
    }

    public static boolean createMissingParentDirectories(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return true;
        }
        parentFile.mkdirs();
        return parentFile.exists();
    }

    public static String prefixRelativePath(String str, String str2) {
        if (str == null || OptionHelper.isEmpty(str.trim()) || new File(str2).isAbsolute()) {
            return str2;
        }
        return str + "/" + str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copy(String str, String str2) throws RolloverFailure {
        BufferedOutputStream bufferedOutputStream;
        IOException e;
        BufferedInputStream bufferedInputStream;
        IOException iOException;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    try {
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read == -1) {
                                bufferedInputStream.close();
                                try {
                                    bufferedOutputStream.close();
                                    return;
                                } catch (IOException e2) {
                                    iOException = e2;
                                    bufferedInputStream = null;
                                    e = iOException;
                                    String str3 = "Failed to copy [" + str + "] to [" + str2 + "]";
                                    addError(str3, e);
                                    throw new RolloverFailure(str3);
                                } catch (Throwable th) {
                                    th = th;
                                    if (bufferedInputStream2 != null) {
                                    }
                                    if (bufferedOutputStream != null) {
                                    }
                                    throw th;
                                }
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        String str32 = "Failed to copy [" + str + "] to [" + str2 + "]";
                        addError(str32, e);
                        throw new RolloverFailure(str32);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                iOException = e4;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                }
                if (bufferedOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException e5) {
            bufferedOutputStream = null;
            e = e5;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
