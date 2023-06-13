package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.stripe.android.networking.FraudDetectionData;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* renamed from: uW2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49873uW2 implements Closeable {

    /* renamed from: b */
    public final File f112540b;

    /* renamed from: c */
    public final long f112541c;

    /* renamed from: d */
    public final File f112542d;

    /* renamed from: e */
    public final RandomAccessFile f112543e;

    /* renamed from: f */
    public final FileChannel f112544f;

    /* renamed from: g */
    public final FileLock f112545g;

    /* renamed from: uW2$a */
    /* loaded from: classes.dex */
    public class C29231a implements FileFilter {
        public C29231a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: uW2$b */
    /* loaded from: classes.dex */
    public static class C29232b extends File {

        /* renamed from: b */
        public long f112547b;

        public C29232b(File file, String str) {
            super(file, str);
            this.f112547b = -1L;
        }
    }

    public C49873uW2(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f112540b = file;
        this.f112542d = file2;
        this.f112541c = m10147g(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f112543e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f112544f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f112545g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m10151b(this.f112544f);
                throw e;
            } catch (Error e2) {
                e = e2;
                m10151b(this.f112544f);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                m10151b(this.f112544f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m10151b(this.f112543e);
            throw e4;
        }
    }

    /* renamed from: b */
    public static void m10151b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: c */
    public static void m10150c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } finally {
            m10151b(inputStream);
            createTempFile.delete();
        }
    }

    /* renamed from: d */
    public static SharedPreferences m10149d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* renamed from: f */
    public static long m10148f(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: g */
    public static long m10147g(File file) throws IOException {
        long m12518c = C49158tI6.m12518c(file);
        return m12518c == -1 ? m12518c - 1 : m12518c;
    }

    /* renamed from: i */
    public static boolean m10146i(Context context, File file, long j, String str) {
        SharedPreferences m10149d = m10149d(context);
        if (m10149d.getLong(str + FraudDetectionData.KEY_TIMESTAMP, -1L) == m10148f(file)) {
            if (m10149d.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static void m10142n(Context context, String str, long j, long j2, List<C29232b> list) {
        SharedPreferences.Editor edit = m10149d(context).edit();
        edit.putLong(str + FraudDetectionData.KEY_TIMESTAMP, j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C29232b c29232b : list) {
            edit.putLong(str + "dex.crc." + i, c29232b.f112547b);
            edit.putLong(str + "dex.time." + i, c29232b.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    public final void m10152a() {
        File[] listFiles = this.f112542d.listFiles(new C29231a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f112542d.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f112545g.release();
        this.f112544f.close();
        this.f112543e.close();
    }

    /* renamed from: k */
    public List<? extends File> m10145k(Context context, String str, boolean z) throws IOException {
        List<C29232b> m10143m;
        List<C29232b> list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f112540b.getPath() + ", " + z + ", " + str + ")");
        if (this.f112545g.isValid()) {
            if (!z && !m10146i(context, this.f112540b, this.f112541c, str)) {
                try {
                    list = m10144l(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    m10143m = m10143m();
                    m10142n(context, str, m10148f(this.f112540b), this.f112541c, m10143m);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            if (z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            m10143m = m10143m();
            m10142n(context, str, m10148f(this.f112540b), this.f112541c, m10143m);
            list = m10143m;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: l */
    public final List<C29232b> m10144l(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f112540b.getName() + ".classes";
        SharedPreferences m10149d = m10149d(context);
        int i = m10149d.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            C29232b c29232b = new C29232b(this.f112542d, str2 + i2 + ".zip");
            if (c29232b.isFile()) {
                c29232b.f112547b = m10147g(c29232b);
                long j = m10149d.getLong(str + "dex.crc." + i2, -1L);
                long j2 = m10149d.getLong(str + "dex.time." + i2, -1L);
                long lastModified = c29232b.lastModified();
                if (j2 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = m10149d;
                    if (j == c29232b.f112547b) {
                        arrayList.add(c29232b);
                        i2++;
                        m10149d = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException("Invalid extracted dex: " + c29232b + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + c29232b.f112547b);
            }
            throw new IOException("Missing extracted secondary dex file '" + c29232b.getPath() + "'");
        }
        return arrayList;
    }

    /* renamed from: m */
    public final List<C29232b> m10143m() throws IOException {
        boolean z;
        String str;
        String str2 = this.f112540b.getName() + ".classes";
        m10152a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f112540b);
        try {
            int i = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                C29232b c29232b = new C29232b(this.f112542d, str2 + i + ".zip");
                arrayList.add(c29232b);
                Log.i("MultiDex", "Extraction is needed for file " + c29232b);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    m10150c(zipFile, entry, c29232b, str2);
                    try {
                        c29232b.f112547b = m10147g(c29232b);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + c29232b.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    if (z) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" '");
                    sb.append(c29232b.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(c29232b.length());
                    sb.append(" - crc: ");
                    sb.append(c29232b.f112547b);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        c29232b.delete();
                        if (c29232b.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + c29232b.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i3;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + c29232b.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th;
        }
    }
}
