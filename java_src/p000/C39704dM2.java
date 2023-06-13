package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: dM2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39704dM2 extends FilterInputStream {

    /* renamed from: b */
    public int f76498b;

    public C39704dM2(InputStream inputStream) {
        super(inputStream);
        this.f76498b = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m44356a(long j) {
        int i = this.f76498b;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.f76498b;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    /* renamed from: b */
    public final void m44355b(long j) {
        int i = this.f76498b;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f76498b = (int) (i - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.f76498b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m44356a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m44355b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f76498b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long m44356a = m44356a(j);
        if (m44356a == -1) {
            return 0L;
        }
        long skip = super.skip(m44356a);
        m44355b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int m44356a = (int) m44356a(i2);
        if (m44356a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, m44356a);
        m44355b(read);
        return read;
    }
}
