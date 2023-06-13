package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.support.annotation.Nullable;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: EK6 */
/* loaded from: classes6.dex */
public final class EK6 implements InterfaceC50981wN6 {

    /* renamed from: a */
    public final Context f7289a;

    /* renamed from: b */
    public final C42672iM6 f7290b;

    /* renamed from: c */
    public final IK6 f7291c;

    /* renamed from: d */
    public final Executor f7292d;

    /* renamed from: e */
    public final RO6 f7293e;

    public EK6(Context context, Executor executor, IK6 ik6, C42672iM6 c42672iM6, RO6 ro6) {
        this.f7289a = context;
        this.f7290b = c42672iM6;
        this.f7291c = ik6;
        this.f7292d = executor;
        this.f7293e = ro6;
    }

    /* renamed from: c */
    public static /* synthetic */ void m109174c(EK6 ek6, UM6 um6) {
        try {
            if (C37928aO5.m71496a(RO6.m86776c(ek6.f7289a))) {
                Log.i("SplitCompat", "Splits installed.");
                um6.mo78494a();
                return;
            }
            Log.e("SplitCompat", "Emulating splits failed.");
            um6.mo78493a(-12);
        } catch (Exception e) {
            Log.e("SplitCompat", "Error emulating splits.", e);
            um6.mo78493a(-12);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m109173d(EK6 ek6, List list, UM6 um6) {
        Integer m109172e = ek6.m109172e(list);
        if (m109172e == null) {
            return;
        }
        if (m109172e.intValue() == 0) {
            um6.mo78492b();
        } else {
            um6.mo78493a(m109172e.intValue());
        }
    }

    @Override // p000.InterfaceC50981wN6
    /* renamed from: a */
    public final void mo6955a(List<Intent> list, UM6 um6) {
        if (!C37928aO5.m71495b()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f7292d.execute(new CK6(this, list, um6));
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0127 A[Catch: Exception -> 0x012b, TRY_LEAVE, TryCatch #5 {Exception -> 0x012b, blocks: (B:3:0x0004, B:80:0x0127, B:5:0x0016, B:11:0x0021, B:12:0x002a, B:14:0x0031, B:16:0x0059, B:21:0x006c, B:23:0x0078, B:32:0x0097, B:45:0x00ae, B:44:0x00ab, B:19:0x0066, B:46:0x00af, B:47:0x00b4, B:49:0x00c0, B:51:0x00c8, B:53:0x00d0, B:54:0x00de, B:56:0x00e2, B:58:0x00ee, B:71:0x0112, B:61:0x00f7, B:62:0x00fb, B:64:0x0102), top: B:85:0x0004 }] */
    @Nullable
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer m109172e(List<Intent> list) {
        FileLock fileLock;
        String str;
        int i;
        File[] listFiles;
        try {
            FileChannel channel = new RandomAccessFile(this.f7290b.m34116f(), "rw").getChannel();
            Integer num = null;
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                fileLock = null;
            }
            if (fileLock != null) {
                try {
                    Log.i("SplitCompat", "Copying splits.");
                    Iterator<Intent> it = list.iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Intent next = it.next();
                        String stringExtra = next.getStringExtra("split_id");
                        AssetFileDescriptor openAssetFileDescriptor = this.f7289a.getContentResolver().openAssetFileDescriptor(next.getData(), "r");
                        File m34120b = this.f7290b.m34120b(stringExtra);
                        if ((!m34120b.exists() || m34120b.length() == openAssetFileDescriptor.getLength()) && m34120b.exists()) {
                        }
                        if (this.f7290b.m34119c(stringExtra).exists()) {
                            continue;
                        } else {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(m34120b);
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.close();
                                bufferedInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable th2) {
                                    RL6.m86831a(th, th2);
                                }
                                throw th;
                            }
                        }
                    }
                    Log.i("SplitCompat", "Splits copied.");
                    try {
                        listFiles = this.f7290b.m34115g().listFiles();
                        try {
                        } catch (Exception e) {
                            Log.e("SplitCompat", "Error verifying splits.", e);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        str = "Cannot access directory for unverified splits.";
                    }
                } catch (Exception e3) {
                    e = e3;
                    str = "Error copying splits.";
                }
                if (this.f7291c.m102477a(listFiles)) {
                    if (this.f7291c.m102476b(listFiles)) {
                        try {
                            File[] listFiles2 = this.f7290b.m34115g().listFiles();
                            Arrays.sort(listFiles2);
                            int length = listFiles2.length;
                            while (true) {
                                length--;
                                if (length < 0) {
                                    break;
                                }
                                File file = listFiles2[length];
                                file.renameTo(this.f7290b.m34118d(file));
                            }
                            Log.i("SplitCompat", "Splits verified.");
                        } catch (IOException e4) {
                            e = e4;
                            str = "Cannot write verified split.";
                            Log.e("SplitCompat", str, e);
                            i = -13;
                            num = Integer.valueOf(i);
                            fileLock.release();
                            if (channel != null) {
                            }
                            return num;
                        }
                        num = Integer.valueOf(i);
                        fileLock.release();
                    }
                }
                Log.e("SplitCompat", "Split verification failed.");
                i = -11;
                num = Integer.valueOf(i);
                fileLock.release();
            }
            if (channel != null) {
                channel.close();
            }
            return num;
        } catch (Exception e5) {
            Log.e("SplitCompat", "Error locking files.", e5);
            return -13;
        }
    }
}
