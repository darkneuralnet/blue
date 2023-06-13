package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* renamed from: cY3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39202cY3 extends ByteArrayOutputStream {

    /* renamed from: b */
    public final C47272q70 f60872b;

    public C39202cY3(C47272q70 c47272q70, int i) {
        this.f60872b = c47272q70;
        ((ByteArrayOutputStream) this).buf = c47272q70.m18157a(Math.max(i, 256));
    }

    /* renamed from: a */
    public final void m61223a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] m18157a = this.f60872b.m18157a((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m18157a, 0, ((ByteArrayOutputStream) this).count);
        this.f60872b.m18156b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = m18157a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f60872b.m18156b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f60872b.m18156b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m61223a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m61223a(1);
        super.write(i);
    }
}
