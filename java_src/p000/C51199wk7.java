package p000;

import java.io.OutputStream;
/* renamed from: wk7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51199wk7 extends OutputStream {

    /* renamed from: b */
    public long f116435b = 0;

    /* renamed from: a */
    public final long m6410a() {
        return this.f116435b;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f116435b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f116435b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f116435b += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
