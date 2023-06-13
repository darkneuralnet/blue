package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: l12  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44249l12 extends AbstractC39999dr2 {

    /* renamed from: d */
    public int f95358d;

    /* renamed from: e */
    public int f95359e;

    /* renamed from: f */
    public boolean f95360f;

    /* renamed from: g */
    public boolean f95361g;

    public C44249l12(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f95360f = false;
        this.f95361g = true;
        this.f95358d = inputStream.read();
        int read = inputStream.read();
        this.f95359e = read;
        if (read < 0) {
            throw new EOFException();
        }
        m28021c();
    }

    /* renamed from: c */
    public final boolean m28021c() {
        if (!this.f95360f && this.f95361g && this.f95358d == 0 && this.f95359e == 0) {
            this.f95360f = true;
            m43633b(true);
        }
        return this.f95360f;
    }

    /* renamed from: d */
    public void m28020d(boolean z) {
        this.f95361g = z;
        m28021c();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (m28021c()) {
            return -1;
        }
        int read = this.f77308b.read();
        if (read >= 0) {
            int i = this.f95358d;
            this.f95358d = this.f95359e;
            this.f95359e = read;
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f95361g || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f95360f) {
            return -1;
        }
        int read = this.f77308b.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.f95358d;
            bArr[i + 1] = (byte) this.f95359e;
            this.f95358d = this.f77308b.read();
            int read2 = this.f77308b.read();
            this.f95359e = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
