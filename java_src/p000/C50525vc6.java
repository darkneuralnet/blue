package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import co.bird.android.model.Detail;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.C34386Lw1;
/* renamed from: vc6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50525vc6 {

    /* renamed from: vc6$a */
    /* loaded from: classes.dex */
    public static class C29598a {
        private C29598a() {
        }

        /* renamed from: a */
        public static ParcelFileDescriptor m8365a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    private C50525vc6() {
    }

    /* renamed from: a */
    public static void m8373a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m8372b(Context context, Resources resources, int i) {
        File m8369e = m8369e(context);
        if (m8369e == null) {
            return null;
        }
        try {
            if (!m8371c(m8369e, resources, i)) {
                return null;
            }
            return m8367g(m8369e);
        } finally {
            m8369e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m8371c(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean m8370d = m8370d(file, inputStream);
                m8373a(inputStream);
                return m8370d;
            } catch (Throwable th) {
                th = th;
                m8373a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: d */
    public static boolean m8370d(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    m8373a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m8373a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m8373a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: e */
    public static File m8369e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + Detail.EMPTY_CHAR + Process.myTid() + Detail.EMPTY_CHAR;
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m8368f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor m8365a = C29598a.m8365a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (m8365a == null) {
                if (m8365a != null) {
                    m8365a.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m8365a.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                m8365a.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static ByteBuffer m8367g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m8366h(Context context, C34386Lw1.C5132b[] c5132bArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C34386Lw1.C5132b c5132b : c5132bArr) {
            if (c5132b.m96110b() == 0) {
                Uri m96108d = c5132b.m96108d();
                if (!hashMap.containsKey(m96108d)) {
                    hashMap.put(m96108d, m8368f(context, cancellationSignal, m96108d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
