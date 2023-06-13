package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: wA0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50858wA0 extends FilterInputStream {

    /* renamed from: b */
    public final long f115431b;

    /* renamed from: c */
    public int f115432c;

    public C50858wA0(InputStream inputStream, long j) {
        super(inputStream);
        this.f115431b = j;
    }

    /* renamed from: b */
    public static InputStream m7341b(InputStream inputStream, long j) {
        return new C50858wA0(inputStream, j);
    }

    /* renamed from: a */
    public final int m7342a(int i) throws IOException {
        if (i >= 0) {
            this.f115432c += i;
        } else if (this.f115431b - this.f115432c > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f115431b + ", but read: " + this.f115432c);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f115431b - this.f115432c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m7342a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m7342a(super.read(bArr, i, i2));
    }
}
