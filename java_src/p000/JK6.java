package p000;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: JK6 */
/* loaded from: classes6.dex */
public final class JK6 extends InputStream {

    /* renamed from: b */
    public final InputStream f17358b;

    /* renamed from: c */
    public long f17359c;

    public JK6(InputStream inputStream, long j) {
        this.f17358b = inputStream;
        this.f17359c = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f17358b.close();
        this.f17359c = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.f17359c;
        if (j <= 0) {
            return -1;
        }
        this.f17359c = j - 1;
        return this.f17358b.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f17359c;
        if (j <= 0) {
            return -1;
        }
        int read = this.f17358b.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f17359c -= read;
        }
        return read;
    }
}
