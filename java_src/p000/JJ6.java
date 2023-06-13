package p000;

import android.os.Environment;
import com.amazonaws.services.p026s3.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/* renamed from: JJ6 */
/* loaded from: classes8.dex */
public class JJ6 {

    /* renamed from: a */
    public boolean f17349a = false;

    /* renamed from: b */
    public boolean f17350b = false;

    /* renamed from: c */
    public File f17351c;

    public JJ6() {
        m100708a();
        this.f17351c = Environment.getExternalStorageDirectory();
    }

    /* renamed from: a */
    public final void m100708a() {
        String externalStorageState = Environment.getExternalStorageState();
        externalStorageState.hashCode();
        if (externalStorageState.equals("mounted")) {
            this.f17350b = true;
            this.f17349a = true;
        } else if (externalStorageState.equals("mounted_ro")) {
            this.f17349a = true;
            this.f17350b = false;
        } else {
            this.f17350b = false;
            this.f17349a = false;
        }
    }

    /* renamed from: b */
    public void m100707b(String str) {
        this.f17351c = new File(str);
    }

    /* renamed from: c */
    public void m100706c(String str, byte[] bArr) throws IOException {
        if (!this.f17349a || !this.f17350b) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (this.f17351c.mkdirs() || this.f17351c.isDirectory()) {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.f17351c, str));
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    fileOutputStream = fileOutputStream2;
                    th = th;
                    C52760zN6.m1466j(getClass(), fileOutputStream);
                    throw th;
                }
            }
            C52760zN6.m1466j(getClass(), fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: d */
    public String m100705d(String str) throws IOException {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[1024];
        String str2 = null;
        FileInputStream fileInputStream2 = null;
        if (this.f17350b) {
            try {
                fileInputStream = new FileInputStream(new File(this.f17351c, str));
            } catch (Throwable th) {
                th = th;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int read = fileInputStream.read(bArr, 0, 1024); read != -1; read = fileInputStream.read(bArr, 0, 1024)) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                str2 = new String(byteArrayOutputStream.toByteArray(), Constants.DEFAULT_ENCODING);
                C52760zN6.m1466j(getClass(), fileInputStream);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                C52760zN6.m1466j(getClass(), fileInputStream2);
                throw th;
            }
        }
        return str2;
    }
}
