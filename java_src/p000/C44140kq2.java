package p000;

import java.io.OutputStream;
/* renamed from: kq2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44140kq2 extends OutputStream {

    /* renamed from: b */
    public long f95051b = 0;

    /* renamed from: a */
    public long m28374a() {
        return this.f95051b;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f95051b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f95051b += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f95051b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
