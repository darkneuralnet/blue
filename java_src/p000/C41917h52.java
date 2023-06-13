package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: h52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41917h52 extends InputStream {

    /* renamed from: b */
    public final InputStream f84689b;

    /* renamed from: c */
    public final M73 f84690c;

    /* renamed from: d */
    public final Timer f84691d;

    /* renamed from: f */
    public long f84693f;

    /* renamed from: e */
    public long f84692e = -1;

    /* renamed from: g */
    public long f84694g = -1;

    public C41917h52(InputStream inputStream, M73 m73, Timer timer) {
        this.f84691d = timer;
        this.f84689b = inputStream;
        this.f84690c = m73;
        this.f84693f = m73.m95787e();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f84689b.available();
        } catch (IOException e) {
            this.f84690c.m95774s(this.f84691d.m47036c());
            N73.m94350d(this.f84690c);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long m47036c = this.f84691d.m47036c();
        if (this.f84694g == -1) {
            this.f84694g = m47036c;
        }
        try {
            this.f84689b.close();
            long j = this.f84692e;
            if (j != -1) {
                this.f84690c.m95776q(j);
            }
            long j2 = this.f84693f;
            if (j2 != -1) {
                this.f84690c.m95773t(j2);
            }
            this.f84690c.m95774s(this.f84694g);
            this.f84690c.m95790b();
        } catch (IOException e) {
            this.f84690c.m95774s(this.f84691d.m47036c());
            N73.m94350d(this.f84690c);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f84689b.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f84689b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f84689b.read();
            long m47036c = this.f84691d.m47036c();
            if (this.f84693f == -1) {
                this.f84693f = m47036c;
            }
            if (read == -1 && this.f84694g == -1) {
                this.f84694g = m47036c;
                this.f84690c.m95774s(m47036c);
                this.f84690c.m95790b();
            } else {
                long j = this.f84692e + 1;
                this.f84692e = j;
                this.f84690c.m95776q(j);
            }
            return read;
        } catch (IOException e) {
            this.f84690c.m95774s(this.f84691d.m47036c());
            N73.m94350d(this.f84690c);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f84689b.reset();
        } catch (IOException e) {
            this.f84690c.m95774s(this.f84691d.m47036c());
            N73.m94350d(this.f84690c);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            long skip = this.f84689b.skip(j);
            long m47036c = this.f84691d.m47036c();
            if (this.f84693f == -1) {
                this.f84693f = m47036c;
            }
            if (skip == -1 && this.f84694g == -1) {
                this.f84694g = m47036c;
                this.f84690c.m95774s(m47036c);
            } else {
                long j2 = this.f84692e + skip;
                this.f84692e = j2;
                this.f84690c.m95776q(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f84690c.m95774s(this.f84691d.m47036c());
            N73.m94350d(this.f84690c);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f84689b.read(bArr, i, i2);
            long m47036c = this.f84691d.m47036c();
            if (this.f84693f == -1) {
                this.f84693f = m47036c;
            }
            if (read == -1 && this.f84694g == -1) {
                this.f84694g = m47036c;
                this.f84690c.m95774s(m47036c);
                this.f84690c.m95790b();
            } else {
                long j = this.f84692e + read;
                this.f84692e = j;
                this.f84690c.m95776q(j);
            }
            return read;
        } catch (IOException e) {
            this.f84690c.m95774s(this.f84691d.m47036c());
            N73.m94350d(this.f84690c);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f84689b.read(bArr);
            long m47036c = this.f84691d.m47036c();
            if (this.f84693f == -1) {
                this.f84693f = m47036c;
            }
            if (read == -1 && this.f84694g == -1) {
                this.f84694g = m47036c;
                this.f84690c.m95774s(m47036c);
                this.f84690c.m95790b();
            } else {
                long j = this.f84692e + read;
                this.f84692e = j;
                this.f84690c.m95776q(j);
            }
            return read;
        } catch (IOException e) {
            this.f84690c.m95774s(this.f84691d.m47036c());
            N73.m94350d(this.f84690c);
            throw e;
        }
    }
}
