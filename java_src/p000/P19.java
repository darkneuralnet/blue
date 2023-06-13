package p000;

import java.io.OutputStream;
/* renamed from: P19 */
/* loaded from: classes5.dex */
public final class P19 extends OutputStream {

    /* renamed from: b */
    public long f27764b = 0;

    /* renamed from: a */
    public final long m91048a() {
        return this.f27764b;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f27764b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f27764b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f27764b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
