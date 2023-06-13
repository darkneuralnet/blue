package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
/* renamed from: ai1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38112ai1 extends FilterInputStream {

    /* renamed from: d */
    public static final byte[] f50976d;

    /* renamed from: e */
    public static final int f50977e;

    /* renamed from: f */
    public static final int f50978f;

    /* renamed from: b */
    public final byte f50979b;

    /* renamed from: c */
    public int f50980c;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f50976d = bArr;
        int length = bArr.length;
        f50977e = length;
        f50978f = length + 2;
    }

    public C38112ai1(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f50979b = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i;
        int i2 = this.f50980c;
        if (i2 < 2 || i2 > (i = f50978f)) {
            read = super.read();
        } else if (i2 == i) {
            read = this.f50979b;
        } else {
            read = f50976d[i2 - 2] & UByte.MAX_VALUE;
        }
        if (read != -1) {
            this.f50980c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f50980c = (int) (this.f50980c + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f50980c;
        int i5 = f50978f;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f50979b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f50976d, this.f50980c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f50980c += i3;
        }
        return i3;
    }
}
