package p000;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: m30  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44860m30 extends OutputStream {

    /* renamed from: b */
    public final OutputStream f97219b;

    /* renamed from: c */
    public byte[] f97220c;

    /* renamed from: d */
    public InterfaceC28820to f97221d;

    /* renamed from: e */
    public int f97222e;

    public C44860m30(OutputStream outputStream, InterfaceC28820to interfaceC28820to) {
        this(outputStream, interfaceC28820to, 65536);
    }

    /* renamed from: a */
    public final void m26429a() throws IOException {
        int i = this.f97222e;
        if (i > 0) {
            this.f97219b.write(this.f97220c, 0, i);
            this.f97222e = 0;
        }
    }

    /* renamed from: b */
    public final void m26428b() throws IOException {
        if (this.f97222e == this.f97220c.length) {
            m26429a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f97219b.close();
            release();
        } catch (Throwable th) {
            this.f97219b.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m26429a();
        this.f97219b.flush();
    }

    public final void release() {
        byte[] bArr = this.f97220c;
        if (bArr != null) {
            this.f97221d.put(bArr);
            this.f97220c = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f97220c;
        int i2 = this.f97222e;
        this.f97222e = i2 + 1;
        bArr[i2] = (byte) i;
        m26428b();
    }

    public C44860m30(OutputStream outputStream, InterfaceC28820to interfaceC28820to, int i) {
        this.f97219b = outputStream;
        this.f97221d = interfaceC28820to;
        this.f97220c = (byte[]) interfaceC28820to.mo11761c(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f97222e;
            if (i6 == 0 && i4 >= this.f97220c.length) {
                this.f97219b.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.f97220c.length - i6);
            System.arraycopy(bArr, i5, this.f97220c, this.f97222e, min);
            this.f97222e += min;
            i3 += min;
            m26428b();
        } while (i3 < i2);
    }
}
