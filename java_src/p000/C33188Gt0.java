package p000;

import java.io.ByteArrayOutputStream;
import okhttp3.internal.http2.Settings;
/* renamed from: Gt0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33188Gt0 {

    /* renamed from: a */
    public final ByteArrayOutputStream f12582a = new ByteArrayOutputStream();

    private C33188Gt0() {
    }

    /* renamed from: f */
    public static C33188Gt0 m104620f() {
        return new C33188Gt0();
    }

    /* renamed from: a */
    public C33188Gt0 m104625a(boolean z) {
        this.f12582a.write(z ? 1 : 0);
        return this;
    }

    /* renamed from: b */
    public byte[] m104624b() {
        return this.f12582a.toByteArray();
    }

    /* renamed from: c */
    public C33188Gt0 m104623c(InterfaceC39228cb1 interfaceC39228cb1) {
        try {
            this.f12582a.write(interfaceC39228cb1.getEncoded());
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public C33188Gt0 m104622d(byte[] bArr) {
        try {
            this.f12582a.write(bArr);
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: e */
    public C33188Gt0 m104621e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.f12582a.write(bArr2);
            }
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: g */
    public C33188Gt0 m104619g(int i, int i2) {
        while (this.f12582a.size() < i2) {
            this.f12582a.write(i);
        }
        return this;
    }

    /* renamed from: h */
    public C33188Gt0 m104618h(int i) {
        int i2 = i & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f12582a.write((byte) (i2 >>> 8));
        this.f12582a.write((byte) i2);
        return this;
    }

    /* renamed from: i */
    public C33188Gt0 m104617i(int i) {
        this.f12582a.write((byte) (i >>> 24));
        this.f12582a.write((byte) (i >>> 16));
        this.f12582a.write((byte) (i >>> 8));
        this.f12582a.write((byte) i);
        return this;
    }

    /* renamed from: j */
    public C33188Gt0 m104616j(long j) {
        m104617i((int) (j >>> 32));
        m104617i((int) j);
        return this;
    }
}
