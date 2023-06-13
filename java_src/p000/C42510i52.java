package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: i52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42510i52 extends OutputStream {

    /* renamed from: b */
    public final OutputStream f86716b;

    /* renamed from: c */
    public final Timer f86717c;

    /* renamed from: d */
    public M73 f86718d;

    /* renamed from: e */
    public long f86719e = -1;

    public C42510i52(OutputStream outputStream, M73 m73, Timer timer) {
        this.f86716b = outputStream;
        this.f86718d = m73;
        this.f86717c = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j = this.f86719e;
        if (j != -1) {
            this.f86718d.m95779n(j);
        }
        this.f86718d.m95775r(this.f86717c.m47036c());
        try {
            this.f86716b.close();
        } catch (IOException e) {
            this.f86718d.m95774s(this.f86717c.m47036c());
            N73.m94350d(this.f86718d);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f86716b.flush();
        } catch (IOException e) {
            this.f86718d.m95774s(this.f86717c.m47036c());
            N73.m94350d(this.f86718d);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.f86716b.write(i);
            long j = this.f86719e + 1;
            this.f86719e = j;
            this.f86718d.m95779n(j);
        } catch (IOException e) {
            this.f86718d.m95774s(this.f86717c.m47036c());
            N73.m94350d(this.f86718d);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f86716b.write(bArr);
            long length = this.f86719e + bArr.length;
            this.f86719e = length;
            this.f86718d.m95779n(length);
        } catch (IOException e) {
            this.f86718d.m95774s(this.f86717c.m47036c());
            N73.m94350d(this.f86718d);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f86716b.write(bArr, i, i2);
            long j = this.f86719e + i2;
            this.f86719e = j;
            this.f86718d.m95779n(j);
        } catch (IOException e) {
            this.f86718d.m95774s(this.f86717c.m47036c());
            N73.m94350d(this.f86718d);
            throw e;
        }
    }
}
