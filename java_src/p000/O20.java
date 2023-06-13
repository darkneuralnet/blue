package p000;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
/* renamed from: O20 */
/* loaded from: classes8.dex */
public class O20 extends InputStream {

    /* renamed from: b */
    public byte[] f25554b;

    /* renamed from: c */
    public int f25555c;

    /* renamed from: d */
    public int f25556d;

    /* renamed from: e */
    public final C48035rP5 f25557e;

    public O20(InputStream inputStream) throws IOException {
        this(inputStream, 16384, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C48035rP5.m15992a(this.f25557e);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f25556d >= this.f25555c) {
            byte[] bArr = this.f25554b;
            int read = read(bArr, 0, bArr.length);
            this.f25555c = read;
            this.f25556d = 0;
            if (read == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.f25554b;
        int i = this.f25556d;
        this.f25556d = i + 1;
        return bArr2[i] & UByte.MAX_VALUE;
    }

    public O20(InputStream inputStream, int i, byte[] bArr) throws IOException {
        C48035rP5 c48035rP5 = new C48035rP5();
        this.f25557e = c48035rP5;
        if (i <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i);
        } else if (inputStream != null) {
            this.f25554b = new byte[i];
            this.f25555c = 0;
            this.f25556d = 0;
            try {
                C48035rP5.m15990c(c48035rP5, inputStream);
                if (bArr != null) {
                    C45119mV0.m25504s(c48035rP5, bArr);
                }
            } catch (P20 e) {
                throw new IOException("Brotli decoder initialization failed", e);
            }
        } else {
            throw new IllegalArgumentException("source is null");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Bad offset: " + i);
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
            } else if (i2 == 0) {
                return 0;
            } else {
                int max = Math.max(this.f25555c - this.f25556d, 0);
                if (max != 0) {
                    max = Math.min(max, i2);
                    System.arraycopy(this.f25554b, this.f25556d, bArr, i, max);
                    this.f25556d += max;
                    i += max;
                    i2 -= max;
                    if (i2 == 0) {
                        return max;
                    }
                }
                try {
                    C48035rP5 c48035rP5 = this.f25557e;
                    c48035rP5.f106992Z = bArr;
                    c48035rP5.f106987U = i;
                    c48035rP5.f106988V = i2;
                    c48035rP5.f106989W = 0;
                    C45119mV0.m25514i(c48035rP5);
                    int i4 = this.f25557e.f106989W;
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4 + max;
                } catch (P20 e) {
                    throw new IOException("Brotli stream decoding failed", e);
                }
            }
        } else {
            throw new IllegalArgumentException("Bad length: " + i2);
        }
    }
}
