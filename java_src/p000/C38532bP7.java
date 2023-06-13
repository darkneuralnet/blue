package p000;

import java.io.OutputStream;
/* renamed from: bP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38532bP7 extends OutputStream {

    /* renamed from: b */
    public long f57459b = 0;

    /* renamed from: a */
    public final long m64556a() {
        return this.f57459b;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f57459b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f57459b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f57459b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
