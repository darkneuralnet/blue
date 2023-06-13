package p000;

import java.io.OutputStream;
/* renamed from: SW7 */
/* loaded from: classes5.dex */
public final class SW7 extends OutputStream {

    /* renamed from: b */
    public long f33838b = 0;

    /* renamed from: a */
    public final long m85314a() {
        return this.f33838b;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f33838b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f33838b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f33838b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
