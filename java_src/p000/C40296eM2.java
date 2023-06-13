package p000;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: eM2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40296eM2 extends InputStream {

    /* renamed from: b */
    public final InputStream f78257b;

    /* renamed from: c */
    public long f78258c;

    /* renamed from: d */
    public long f78259d;

    /* renamed from: e */
    public long f78260e;

    /* renamed from: f */
    public long f78261f;

    /* renamed from: g */
    public boolean f78262g;

    /* renamed from: h */
    public int f78263h;

    public C40296eM2(InputStream inputStream) {
        this(inputStream, 4096);
    }

    /* renamed from: a */
    public void m43003a(boolean z) {
        this.f78262g = z;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f78257b.available();
    }

    /* renamed from: b */
    public void m43002b(long j) throws IOException {
        if (this.f78258c <= this.f78260e && j >= this.f78259d) {
            this.f78257b.reset();
            m42999f(this.f78259d, j);
            this.f78258c = j;
            return;
        }
        throw new IOException("Cannot reset");
    }

    /* renamed from: c */
    public long m43001c(int i) {
        long j = this.f78258c + i;
        if (this.f78260e < j) {
            m43000d(j);
        }
        return this.f78258c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f78257b.close();
    }

    /* renamed from: d */
    public final void m43000d(long j) {
        try {
            long j2 = this.f78259d;
            long j3 = this.f78258c;
            if (j2 < j3 && j3 <= this.f78260e) {
                this.f78257b.reset();
                this.f78257b.mark((int) (j - this.f78259d));
                m42999f(this.f78259d, this.f78258c);
            } else {
                this.f78259d = j3;
                this.f78257b.mark((int) (j - j3));
            }
            this.f78260e = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    /* renamed from: f */
    public final void m42999f(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f78257b.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f78261f = m43001c(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f78257b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f78262g) {
            long j = this.f78260e;
            if (this.f78258c + 1 > j) {
                m43000d(j + this.f78263h);
            }
        }
        int read = this.f78257b.read();
        if (read != -1) {
            this.f78258c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        m43002b(this.f78261f);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (!this.f78262g) {
            long j2 = this.f78258c;
            if (j2 + j > this.f78260e) {
                m43000d(j2 + j + this.f78263h);
            }
        }
        long skip = this.f78257b.skip(j);
        this.f78258c += skip;
        return skip;
    }

    public C40296eM2(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    public C40296eM2(InputStream inputStream, int i, int i2) {
        this.f78261f = -1L;
        this.f78262g = true;
        this.f78263h = -1;
        this.f78257b = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i);
        this.f78263h = i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.f78262g) {
            long j = this.f78258c;
            if (bArr.length + j > this.f78260e) {
                m43000d(j + bArr.length + this.f78263h);
            }
        }
        int read = this.f78257b.read(bArr);
        if (read != -1) {
            this.f78258c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f78262g) {
            long j = this.f78258c;
            long j2 = i2;
            if (j + j2 > this.f78260e) {
                m43000d(j + j2 + this.f78263h);
            }
        }
        int read = this.f78257b.read(bArr, i, i2);
        if (read != -1) {
            this.f78258c += read;
        }
        return read;
    }
}
