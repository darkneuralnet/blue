package p000;

import java.io.OutputStream;
/* renamed from: xV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51647xV7 extends OutputStream {

    /* renamed from: b */
    public long f117736b = 0;

    /* renamed from: a */
    public final long m5108a() {
        return this.f117736b;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f117736b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f117736b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f117736b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
