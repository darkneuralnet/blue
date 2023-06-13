package bo.app;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* renamed from: bo.app.n5 */
/* loaded from: classes.dex */
class C12924n5 implements Closeable {

    /* renamed from: b */
    private final InputStream f58946b;

    /* renamed from: c */
    private final Charset f58947c;

    /* renamed from: d */
    private byte[] f58948d;

    /* renamed from: e */
    private int f58949e;

    /* renamed from: f */
    private int f58950f;

    /* renamed from: bo.app.n5$a */
    /* loaded from: classes.dex */
    public class C12925a extends ByteArrayOutputStream {
        public C12925a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0) {
                int i2 = i - 1;
                if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C12924n5.this.f58947c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C12924n5(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public boolean m63291b() {
        return this.f58950f == -1;
    }

    /* renamed from: c */
    public String m63290c() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f58946b) {
            if (this.f58948d != null) {
                if (this.f58949e >= this.f58950f) {
                    m63293a();
                }
                for (int i3 = this.f58949e; i3 != this.f58950f; i3++) {
                    byte[] bArr2 = this.f58948d;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f58949e;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f58947c.name());
                                this.f58949e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f58947c.name());
                        this.f58949e = i3 + 1;
                        return str2;
                    }
                }
                C12925a c12925a = new C12925a((this.f58950f - this.f58949e) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f58948d;
                    int i5 = this.f58949e;
                    c12925a.write(bArr3, i5, this.f58950f - i5);
                    this.f58950f = -1;
                    m63293a();
                    i = this.f58949e;
                    while (i != this.f58950f) {
                        bArr = this.f58948d;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f58949e;
                if (i != i6) {
                    c12925a.write(bArr, i6, i - i6);
                }
                this.f58949e = i + 1;
                return c12925a.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f58946b) {
            if (this.f58948d != null) {
                this.f58948d = null;
                this.f58946b.close();
            }
        }
    }

    public C12924n5(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(C13090r6.f59231a)) {
                this.f58946b = inputStream;
                this.f58947c = charset;
                this.f58948d = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    /* renamed from: a */
    private void m63293a() {
        InputStream inputStream = this.f58946b;
        byte[] bArr = this.f58948d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f58949e = 0;
            this.f58950f = read;
            return;
        }
        throw new EOFException();
    }
}
