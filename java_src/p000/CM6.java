package p000;

import android.support.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
/* renamed from: CM6 */
/* loaded from: classes6.dex */
public final class CM6 extends InputStream {

    /* renamed from: b */
    public final Enumeration<File> f4001b;
    @Nullable

    /* renamed from: c */
    public InputStream f4002c;

    public CM6(Enumeration<File> enumeration) throws IOException {
        this.f4001b = enumeration;
        m112291a();
    }

    /* renamed from: a */
    public final void m112291a() throws IOException {
        InputStream inputStream = this.f4002c;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f4002c = this.f4001b.hasMoreElements() ? new FileInputStream(this.f4001b.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f4002c;
        if (inputStream != null) {
            inputStream.close();
            this.f4002c = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f4002c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m112291a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f4002c == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 != 0) {
            do {
                int read = this.f4002c.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                m112291a();
            } while (this.f4002c != null);
            return -1;
        }
        return 0;
    }
}
