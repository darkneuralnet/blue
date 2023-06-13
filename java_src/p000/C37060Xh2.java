package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.C11164h;
import androidx.camera.core.ImageCaptureException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;
/* renamed from: Xh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37060Xh2 implements InterfaceC37529Zh3<AbstractC9447a, C11164h.C11182o> {

    /* renamed from: Xh2$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9447a {
        /* renamed from: c */
        public static AbstractC9447a m76586c(MD3<byte[]> md3, C11164h.C11180n c11180n) {
            return new C4273Jt(md3, c11180n);
        }

        /* renamed from: a */
        public abstract C11164h.C11180n mo76588a();

        /* renamed from: b */
        public abstract MD3<byte[]> mo76587b();
    }

    /* renamed from: b */
    public static Uri m76601b(File file, File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* renamed from: c */
    public static Uri m76600c(File file, C11164h.C11180n c11180n) throws ImageCaptureException {
        ContentValues contentValues;
        Uri insert;
        ContentResolver m69489a = c11180n.m69489a();
        Objects.requireNonNull(m69489a);
        if (c11180n.m69488b() != null) {
            contentValues = new ContentValues(c11180n.m69488b());
        } else {
            contentValues = new ContentValues();
        }
        m76592k(contentValues, 1);
        Uri uri = null;
        try {
            try {
                insert = m69489a.insert(c11180n.m69484f(), contentValues);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (SecurityException e2) {
            e = e2;
        }
        try {
            if (insert != null) {
                m76597f(file, insert, m69489a);
                m76590m(insert, m69489a, 0);
                return insert;
            }
            throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
        } catch (IOException e3) {
            e = e3;
            uri = insert;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e4) {
            e = e4;
            uri = insert;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th2) {
            th = th2;
            uri = insert;
            if (uri != null) {
                m76590m(uri, m69489a, 0);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public static void m76599d(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: e */
    public static Uri m76598e(File file, C11164h.C11180n c11180n) throws ImageCaptureException {
        if (m76594i(c11180n)) {
            return m76600c(file, c11180n);
        }
        if (m76593j(c11180n)) {
            try {
                OutputStream m69485e = c11180n.m69485e();
                Objects.requireNonNull(m69485e);
                m76599d(file, m69485e);
                return null;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } else if (m76595h(c11180n)) {
            File m69487c = c11180n.m69487c();
            Objects.requireNonNull(m69487c);
            return m76601b(file, m69487c);
        } else {
            throw new ImageCaptureException(0, "Invalid OutputFileOptions", null);
        }
    }

    /* renamed from: f */
    public static void m76597f(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                m76599d(file, openOutputStream);
                openOutputStream.close();
                return;
            }
            throw new FileNotFoundException(uri + " cannot be resolved.");
        } catch (Throwable th) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: g */
    public static File m76596g(C11164h.C11180n c11180n) throws ImageCaptureException {
        try {
            File m69487c = c11180n.m69487c();
            if (m69487c != null) {
                String parent = m69487c.getParent();
                return new File(parent, "CameraX" + UUID.randomUUID().toString() + ".tmp");
            }
            return File.createTempFile("CameraX", ".tmp");
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e);
        }
    }

    /* renamed from: h */
    public static boolean m76595h(C11164h.C11180n c11180n) {
        return c11180n.m69487c() != null;
    }

    /* renamed from: i */
    public static boolean m76594i(C11164h.C11180n c11180n) {
        if (c11180n.m69484f() != null && c11180n.m69489a() != null && c11180n.m69488b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m76593j(C11164h.C11180n c11180n) {
        return c11180n.m69485e() != null;
    }

    /* renamed from: k */
    public static void m76592k(ContentValues contentValues, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i));
        }
    }

    /* renamed from: l */
    public static void m76591l(File file, C36357Uh1 c36357Uh1, C11164h.C11180n c11180n, int i) throws ImageCaptureException {
        try {
            C36357Uh1 m81171h = C36357Uh1.m81171h(file);
            c36357Uh1.m81172g(m81171h);
            if (m81171h.m81160s() == 0 && i != 0) {
                m81171h.m81153z(i);
            }
            C11164h.C11177k m69486d = c11180n.m69486d();
            if (m69486d.m69493b()) {
                m81171h.m81167l();
            }
            if (m69486d.m69491d()) {
                m81171h.m81166m();
            }
            if (m69486d.m69494a() != null) {
                m81171h.m81177b(m69486d.m69494a());
            }
            m81171h.m81179A();
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e);
        }
    }

    /* renamed from: m */
    public static void m76590m(Uri uri, ContentResolver contentResolver, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            m76592k(contentValues, i);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    /* renamed from: n */
    public static void m76589n(File file, byte[] bArr) throws ImageCaptureException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e);
        }
    }

    @Override // p000.InterfaceC37529Zh3
    /* renamed from: a */
    public C11164h.C11182o apply(AbstractC9447a abstractC9447a) throws ImageCaptureException {
        MD3<byte[]> mo76587b = abstractC9447a.mo76587b();
        C11164h.C11180n mo76588a = abstractC9447a.mo76588a();
        File m76596g = m76596g(mo76588a);
        m76589n(m76596g, mo76587b.mo80666c());
        C36357Uh1 mo80665d = mo76587b.mo80665d();
        Objects.requireNonNull(mo80665d);
        m76591l(m76596g, mo80665d, mo76588a, mo76587b.mo80663f());
        return new C11164h.C11182o(m76598e(m76596g, mo76588a));
    }
}
