package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* renamed from: OR5 */
/* loaded from: classes6.dex */
public class OR5 implements Closeable {

    /* renamed from: b */
    public final InputStream f26583b;

    /* renamed from: c */
    public final Charset f26584c;

    /* renamed from: d */
    public byte[] f26585d;

    /* renamed from: e */
    public int f26586e;

    /* renamed from: f */
    public int f26587f;

    /* renamed from: OR5$a */
    /* loaded from: classes6.dex */
    public class C5999a extends ByteArrayOutputStream {
        public C5999a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, OR5.this.f26584c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public OR5(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public final void m92282b() throws IOException {
        InputStream inputStream = this.f26583b;
        byte[] bArr = this.f26585d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f26586e = 0;
            this.f26587f = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public String m92281c() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f26583b) {
            if (this.f26585d != null) {
                if (this.f26586e >= this.f26587f) {
                    m92282b();
                }
                for (int i3 = this.f26586e; i3 != this.f26587f; i3++) {
                    byte[] bArr2 = this.f26585d;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f26586e;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f26584c.name());
                                this.f26586e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f26584c.name());
                        this.f26586e = i3 + 1;
                        return str2;
                    }
                }
                C5999a c5999a = new C5999a((this.f26587f - this.f26586e) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f26585d;
                    int i5 = this.f26586e;
                    c5999a.write(bArr3, i5, this.f26587f - i5);
                    this.f26587f = -1;
                    m92282b();
                    i = this.f26586e;
                    while (i != this.f26587f) {
                        bArr = this.f26585d;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f26586e;
                if (i != i6) {
                    c5999a.write(bArr, i6, i - i6);
                }
                this.f26586e = i + 1;
                return c5999a.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f26583b) {
            if (this.f26585d != null) {
                this.f26585d = null;
                this.f26583b.close();
            }
        }
    }

    public OR5(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(C49400ti6.f110928a)) {
                this.f26583b = inputStream;
                this.f26584c = charset;
                this.f26585d = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
