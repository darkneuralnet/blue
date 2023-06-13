package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: lZ0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44562lZ0 extends AbstractC39999dr2 {

    /* renamed from: f */
    public static final byte[] f96315f = new byte[0];

    /* renamed from: d */
    public final int f96316d;

    /* renamed from: e */
    public int f96317e;

    public C44562lZ0(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f96316d = i;
        this.f96317e = i;
        if (i == 0) {
            m43633b(true);
        }
    }

    /* renamed from: c */
    public int m27156c() {
        return this.f96317e;
    }

    /* renamed from: d */
    public void m27155d(byte[] bArr) throws IOException {
        int i = this.f96317e;
        if (i != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return;
        }
        int m43634a = m43634a();
        int i2 = this.f96317e;
        if (i2 >= m43634a) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f96317e + " >= " + m43634a);
        }
        int m96938c = i2 - LR5.m96938c(this.f77308b, bArr);
        this.f96317e = m96938c;
        if (m96938c == 0) {
            m43633b(true);
            return;
        }
        throw new EOFException("DEF length " + this.f96316d + " object truncated by " + this.f96317e);
    }

    /* renamed from: f */
    public byte[] m27154f() throws IOException {
        if (this.f96317e == 0) {
            return f96315f;
        }
        int m43634a = m43634a();
        int i = this.f96317e;
        if (i >= m43634a) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f96317e + " >= " + m43634a);
        }
        byte[] bArr = new byte[i];
        int m96938c = i - LR5.m96938c(this.f77308b, bArr);
        this.f96317e = m96938c;
        if (m96938c == 0) {
            m43633b(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f96316d + " object truncated by " + this.f96317e);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f96317e == 0) {
            return -1;
        }
        int read = this.f77308b.read();
        if (read >= 0) {
            int i = this.f96317e - 1;
            this.f96317e = i;
            if (i == 0) {
                m43633b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f96316d + " object truncated by " + this.f96317e);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f96317e;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f77308b.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f96317e - read;
            this.f96317e = i4;
            if (i4 == 0) {
                m43633b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f96316d + " object truncated by " + this.f96317e);
    }
}
