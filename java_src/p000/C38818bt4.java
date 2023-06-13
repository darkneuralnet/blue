package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
/* renamed from: bt4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38818bt4 extends FilterInputStream {

    /* renamed from: b */
    public volatile byte[] f59714b;

    /* renamed from: c */
    public int f59715c;

    /* renamed from: d */
    public int f59716d;

    /* renamed from: e */
    public int f59717e;

    /* renamed from: f */
    public int f59718f;

    /* renamed from: g */
    public final InterfaceC28820to f59719g;

    /* renamed from: bt4$a */
    /* loaded from: classes5.dex */
    public static class C13323a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public C13323a(String str) {
            super(str);
        }
    }

    public C38818bt4(InputStream inputStream, InterfaceC28820to interfaceC28820to) {
        this(inputStream, interfaceC28820to, 65536);
    }

    /* renamed from: c */
    public static IOException m62198c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m62200a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f59717e;
        if (i != -1) {
            int i2 = this.f59718f - i;
            int i3 = this.f59716d;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f59715c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f59719g.mo11761c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f59714b = bArr2;
                    this.f59719g.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f59718f - this.f59717e;
                this.f59718f = i4;
                this.f59717e = 0;
                this.f59715c = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.f59718f;
                if (read > 0) {
                    i5 += read;
                }
                this.f59715c = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f59717e = -1;
            this.f59718f = 0;
            this.f59715c = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f59714b != null && inputStream != null) {
        } else {
            throw m62198c();
        }
        return (this.f59715c - this.f59718f) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void m62199b() {
        this.f59716d = this.f59714b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f59714b != null) {
            this.f59719g.put(this.f59714b);
            this.f59714b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f59716d = Math.max(this.f59716d, i);
        this.f59717e = this.f59718f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f59714b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f59718f < this.f59715c || m62200a(inputStream, bArr) != -1) {
                if (bArr != this.f59714b && (bArr = this.f59714b) == null) {
                    throw m62198c();
                }
                int i = this.f59715c;
                int i2 = this.f59718f;
                if (i - i2 > 0) {
                    this.f59718f = i2 + 1;
                    return bArr[i2] & UByte.MAX_VALUE;
                }
                return -1;
            }
            return -1;
        }
        throw m62198c();
    }

    public synchronized void release() {
        if (this.f59714b != null) {
            this.f59719g.put(this.f59714b);
            this.f59714b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f59714b != null) {
            int i = this.f59717e;
            if (-1 != i) {
                this.f59718f = i;
            } else {
                throw new C13323a("Mark has been invalidated, pos: " + this.f59718f + " markLimit: " + this.f59716d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f59714b;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i = this.f59715c;
                int i2 = this.f59718f;
                if (i - i2 >= j) {
                    this.f59718f = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.f59718f = i;
                if (this.f59717e != -1 && j <= this.f59716d) {
                    if (m62200a(inputStream, bArr) == -1) {
                        return j2;
                    }
                    int i3 = this.f59715c;
                    int i4 = this.f59718f;
                    if (i3 - i4 >= j - j2) {
                        this.f59718f = (int) ((i4 + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + i3) - i4;
                    this.f59718f = i3;
                    return j3;
                }
                long skip = inputStream.skip(j - j2);
                if (skip > 0) {
                    this.f59717e = -1;
                }
                return j2 + skip;
            }
            throw m62198c();
        }
        throw m62198c();
    }

    public C38818bt4(InputStream inputStream, InterfaceC28820to interfaceC28820to, int i) {
        super(inputStream);
        this.f59717e = -1;
        this.f59719g = interfaceC28820to;
        this.f59714b = (byte[]) interfaceC28820to.mo11761c(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f59714b;
        if (bArr2 == null) {
            throw m62198c();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f59718f;
            int i6 = this.f59715c;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f59718f += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f59717e == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else if (m62200a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (bArr2 != this.f59714b && (bArr2 = this.f59714b) == null) {
                        throw m62198c();
                    }
                    int i8 = this.f59715c;
                    int i9 = this.f59718f;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f59718f += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw m62198c();
        }
    }
}
