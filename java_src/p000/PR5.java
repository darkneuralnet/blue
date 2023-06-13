package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* renamed from: PR5 */
/* loaded from: classes5.dex */
public class PR5 implements Closeable {

    /* renamed from: b */
    public final InputStream f28494b;

    /* renamed from: c */
    public final Charset f28495c;

    /* renamed from: d */
    public byte[] f28496d;

    /* renamed from: e */
    public int f28497e;

    /* renamed from: f */
    public int f28498f;

    /* renamed from: PR5$a */
    /* loaded from: classes5.dex */
    public class C6365a extends ByteArrayOutputStream {
        public C6365a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, PR5.this.f28495c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public PR5(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public final void m90248b() throws IOException {
        InputStream inputStream = this.f28494b;
        byte[] bArr = this.f28496d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f28497e = 0;
            this.f28498f = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public boolean m90247c() {
        return this.f28498f == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f28494b) {
            if (this.f28496d != null) {
                this.f28496d = null;
                this.f28494b.close();
            }
        }
    }

    /* renamed from: d */
    public String m90246d() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f28494b) {
            if (this.f28496d != null) {
                if (this.f28497e >= this.f28498f) {
                    m90248b();
                }
                for (int i3 = this.f28497e; i3 != this.f28498f; i3++) {
                    byte[] bArr2 = this.f28496d;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f28497e;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f28495c.name());
                                this.f28497e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f28495c.name());
                        this.f28497e = i3 + 1;
                        return str2;
                    }
                }
                C6365a c6365a = new C6365a((this.f28498f - this.f28497e) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f28496d;
                    int i5 = this.f28497e;
                    c6365a.write(bArr3, i5, this.f28498f - i5);
                    this.f28498f = -1;
                    m90248b();
                    i = this.f28497e;
                    while (i != this.f28498f) {
                        bArr = this.f28496d;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f28497e;
                if (i != i6) {
                    c6365a.write(bArr, i6, i - i6);
                }
                this.f28497e = i + 1;
                return c6365a.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public PR5(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(C50585vi6.f114535a)) {
                this.f28494b = inputStream;
                this.f28495c = charset;
                this.f28496d = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
