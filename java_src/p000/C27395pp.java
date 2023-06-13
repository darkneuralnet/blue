package p000;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* renamed from: pp */
/* loaded from: classes.dex */
public class C27395pp {

    /* renamed from: a */
    public final File f104120a;

    /* renamed from: b */
    public final File f104121b;

    /* renamed from: c */
    public final File f104122c;

    public C27395pp(File file) {
        this.f104120a = file;
        this.f104121b = new File(file.getPath() + ".new");
        this.f104122c = new File(file.getPath() + ".bak");
    }

    /* renamed from: e */
    public static void m18662e(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    /* renamed from: g */
    public static boolean m18660g(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void m18666a(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m18660g(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        if (!this.f104121b.delete()) {
            Log.e("AtomicFile", "Failed to delete new file " + this.f104121b);
        }
    }

    /* renamed from: b */
    public void m18665b(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m18660g(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        m18662e(this.f104121b, this.f104120a);
    }

    /* renamed from: c */
    public FileInputStream m18664c() throws FileNotFoundException {
        if (this.f104122c.exists()) {
            m18662e(this.f104122c, this.f104120a);
        }
        if (this.f104121b.exists() && this.f104120a.exists() && !this.f104121b.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + this.f104121b);
        }
        return new FileInputStream(this.f104120a);
    }

    /* renamed from: d */
    public byte[] m18663d() throws IOException {
        FileInputStream m18664c = m18664c();
        try {
            byte[] bArr = new byte[m18664c.available()];
            int i = 0;
            while (true) {
                int read = m18664c.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = m18664c.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            m18664c.close();
        }
    }

    /* renamed from: f */
    public FileOutputStream m18661f() throws IOException {
        if (this.f104122c.exists()) {
            m18662e(this.f104122c, this.f104120a);
        }
        try {
            return new FileOutputStream(this.f104121b);
        } catch (FileNotFoundException unused) {
            if (this.f104121b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f104121b);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.f104121b, e);
                }
            }
            throw new IOException("Failed to create directory for " + this.f104121b);
        }
    }
}
