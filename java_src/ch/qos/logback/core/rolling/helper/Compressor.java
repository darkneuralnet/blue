package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.WarnStatus;
import ch.qos.logback.core.util.FileUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/* loaded from: classes.dex */
public class Compressor extends ContextAwareBase {
    static final int BUFFER_SIZE = 8192;
    final CompressionMode compressionMode;

    /* renamed from: ch.qos.logback.core.rolling.helper.Compressor$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C136301 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode;

        static {
            int[] iArr = new int[CompressionMode.values().length];
            $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode = iArr;
            try {
                iArr[CompressionMode.GZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class CompressionRunnable implements Runnable {
        final String innerEntryName;
        final String nameOfCompressedFile;
        final String nameOfFile2Compress;

        public CompressionRunnable(String str, String str2, String str3) {
            this.nameOfFile2Compress = str;
            this.nameOfCompressedFile = str2;
            this.innerEntryName = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            Compressor.this.compress(this.nameOfFile2Compress, this.nameOfCompressedFile, this.innerEntryName);
        }
    }

    public Compressor(CompressionMode compressionMode) {
        this.compressionMode = compressionMode;
    }

    public static String computeFileNameStrWithoutCompSuffix(String str, CompressionMode compressionMode) {
        int i;
        int length = str.length();
        int i2 = C136301.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[compressionMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return str;
                }
                throw new IllegalStateException("Execution should not reach this point");
            } else if (!str.endsWith(".zip")) {
                return str;
            } else {
                i = length - 4;
            }
        } else if (!str.endsWith(".gz")) {
            return str;
        } else {
            i = length - 3;
        }
        return str.substring(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
        if (r7 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void gzCompress(String str, String str2) {
        GZIPOutputStream gZIPOutputStream;
        BufferedInputStream bufferedInputStream;
        File file = new File(str);
        if (!file.exists()) {
            addStatus(new WarnStatus("The file to compress named [" + str + "] does not exist.", this));
            return;
        }
        if (!str2.endsWith(".gz")) {
            str2 = str2 + ".gz";
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            addWarn("The target compressed file named [" + str2 + "] exist already. Aborting file compression.");
            return;
        }
        addInfo("GZ compressing [" + file + "] as [" + file2 + "]");
        createMissingTargetDirsIfNecessary(file2);
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(str2));
            } catch (Exception e) {
                e = e;
                gZIPOutputStream = null;
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
            gZIPOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                gZIPOutputStream.write(bArr, 0, read);
            }
            addInfo("Done ZIP compressing [" + file + "] as [" + file2 + "]");
            try {
                bufferedInputStream.close();
            } catch (IOException unused) {
            }
        } catch (Exception e3) {
            e = e3;
            bufferedInputStream2 = bufferedInputStream;
            try {
                addStatus(new ErrorStatus("Error occurred while compressing [" + str + "] into [" + str2 + "].", this, e));
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
            }
            if (gZIPOutputStream != null) {
            }
            throw th;
        }
        try {
            gZIPOutputStream.close();
        } catch (IOException unused5) {
            if (file.delete()) {
                return;
            }
            addStatus(new WarnStatus("Could not delete [" + str + "].", this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0128, code lost:
        if (r7 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zipCompress(String str, String str2, String str3) {
        ZipOutputStream zipOutputStream;
        File file = new File(str);
        if (!file.exists()) {
            addStatus(new WarnStatus("The file to compress named [" + str + "] does not exist.", this));
        } else if (str3 == null) {
            addStatus(new WarnStatus("The innerEntryName parameter cannot be null", this));
        } else {
            if (!str2.endsWith(".zip")) {
                str2 = str2 + ".zip";
            }
            File file2 = new File(str2);
            if (file2.exists()) {
                addStatus(new WarnStatus("The target compressed file named [" + str2 + "] exist already.", this));
                return;
            }
            addInfo("ZIP compressing [" + file + "] as [" + file2 + "]");
            createMissingTargetDirsIfNecessary(file2);
            BufferedInputStream bufferedInputStream = null;
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
                try {
                    zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
                    try {
                        zipOutputStream.putNextEntry(computeZipEntry(str3));
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = bufferedInputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                        addInfo("Done ZIP compressing [" + file + "] as [" + file2 + "]");
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            addStatus(new ErrorStatus("Error occurred while compressing [" + str + "] into [" + str2 + "].", this, e));
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (zipOutputStream != null) {
                                try {
                                    zipOutputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                        }
                        if (zipOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    zipOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    zipOutputStream = null;
                }
            } catch (Exception e3) {
                e = e3;
                zipOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                zipOutputStream = null;
            }
            try {
                zipOutputStream.close();
            } catch (IOException unused5) {
                if (file.delete()) {
                    return;
                }
                addStatus(new WarnStatus("Could not delete [" + str + "].", this));
            }
        }
    }

    public Future<?> asyncCompress(String str, String str2, String str3) throws RolloverFailure {
        return this.context.getScheduledExecutorService().submit(new CompressionRunnable(str, str2, str3));
    }

    public void compress(String str, String str2, String str3) {
        int i = C136301.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[this.compressionMode.ordinal()];
        if (i == 1) {
            gzCompress(str, str2);
        } else if (i == 2) {
            zipCompress(str, str2, str3);
        } else if (i == 3) {
            throw new UnsupportedOperationException("compress method called in NONE compression mode");
        }
    }

    public ZipEntry computeZipEntry(File file) {
        return computeZipEntry(file.getName());
    }

    public void createMissingTargetDirsIfNecessary(File file) {
        if (FileUtil.createMissingParentDirectories(file)) {
            return;
        }
        addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
    }

    public String toString() {
        return getClass().getName();
    }

    public ZipEntry computeZipEntry(String str) {
        return new ZipEntry(computeFileNameStrWithoutCompSuffix(str, this.compressionMode));
    }
}
