package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* renamed from: jL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43256jL6 extends FilterInputStream {

    /* renamed from: b */
    public final DM6 f92579b;

    /* renamed from: c */
    public byte[] f92580c;

    /* renamed from: d */
    public long f92581d;

    /* renamed from: e */
    public boolean f92582e;

    /* renamed from: f */
    public boolean f92583f;

    public C43256jL6(InputStream inputStream) {
        super(inputStream);
        this.f92579b = new DM6();
        this.f92580c = new byte[4096];
        this.f92582e = false;
        this.f92583f = false;
    }

    /* renamed from: a */
    public final C40309eN6 m30765a() throws IOException {
        byte[] bArr;
        if (this.f92581d <= 0) {
            if (this.f92582e) {
            }
            return new C40309eN6(null, -1L, -1, false, false, null);
        }
        do {
            bArr = this.f92580c;
        } while (read(bArr, 0, bArr.length) != -1);
        if (!this.f92582e || this.f92583f) {
            return new C40309eN6(null, -1L, -1, false, false, null);
        }
        if (!m30761f(30)) {
            this.f92582e = true;
            return this.f92579b.m110560b();
        }
        C40309eN6 m110560b = this.f92579b.m110560b();
        if (m110560b.m42947h()) {
            this.f92583f = true;
            return m110560b;
        } else if (m110560b.m42950e() != 4294967295L) {
            int m110559c = this.f92579b.m110559c() - 30;
            long j = m110559c;
            int length = this.f92580c.length;
            if (j > length) {
                do {
                    length += length;
                } while (length < j);
                this.f92580c = Arrays.copyOf(this.f92580c, length);
            }
            if (!m30761f(m110559c)) {
                this.f92582e = true;
                return this.f92579b.m110560b();
            }
            C40309eN6 m110560b2 = this.f92579b.m110560b();
            this.f92581d = m110560b2.m42950e();
            return m110560b2;
        } else {
            throw new C49185tL6("Files bigger than 4GiB are not supported.");
        }
    }

    /* renamed from: b */
    public final boolean m30764b() {
        return this.f92582e;
    }

    /* renamed from: c */
    public final boolean m30763c() {
        return this.f92583f;
    }

    /* renamed from: d */
    public final long m30762d() {
        return this.f92581d;
    }

    /* renamed from: f */
    public final boolean m30761f(int i) throws IOException {
        int m30760g = m30760g(this.f92580c, 0, i);
        if (m30760g != i) {
            int i2 = i - m30760g;
            if (m30760g(this.f92580c, m30760g, i2) != i2) {
                this.f92579b.m110561a(this.f92580c, 0, m30760g);
                return false;
            }
        }
        this.f92579b.m110561a(this.f92580c, 0, i);
        return true;
    }

    /* renamed from: g */
    public final int m30760g(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f92581d;
        if (j <= 0 || this.f92582e) {
            return -1;
        }
        int m30760g = m30760g(bArr, i, (int) Math.min(j, i2));
        this.f92581d -= m30760g;
        if (m30760g == 0) {
            this.f92582e = true;
            return 0;
        }
        return m30760g;
    }
}
