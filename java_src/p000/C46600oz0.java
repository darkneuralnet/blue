package p000;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: oz0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46600oz0 extends InputStream {

    /* renamed from: b */
    public final C9585Y f102854b;

    /* renamed from: c */
    public boolean f102855c = true;

    /* renamed from: d */
    public InputStream f102856d;

    public C46600oz0(C9585Y c9585y) {
        this.f102854b = c9585y;
    }

    /* renamed from: a */
    public final InterfaceC6215P m20201a() throws IOException {
        InterfaceC1693E m75888b = this.f102854b.m75888b();
        if (m75888b == null) {
            return null;
        }
        if (m75888b instanceof InterfaceC6215P) {
            return (InterfaceC6215P) m75888b;
        }
        throw new IOException("unknown object encountered: " + m75888b.getClass());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InterfaceC6215P m20201a;
        if (this.f102856d == null) {
            if (!this.f102855c || (m20201a = m20201a()) == null) {
                return -1;
            }
            this.f102855c = false;
            this.f102856d = m20201a.mo78678b();
        }
        while (true) {
            int read = this.f102856d.read();
            if (read >= 0) {
                return read;
            }
            InterfaceC6215P m20201a2 = m20201a();
            if (m20201a2 == null) {
                this.f102856d = null;
                return -1;
            }
            this.f102856d = m20201a2.mo78678b();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC6215P m20201a;
        int i3 = 0;
        if (this.f102856d == null) {
            if (!this.f102855c || (m20201a = m20201a()) == null) {
                return -1;
            }
            this.f102855c = false;
            this.f102856d = m20201a.mo78678b();
        }
        while (true) {
            int read = this.f102856d.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                InterfaceC6215P m20201a2 = m20201a();
                if (m20201a2 == null) {
                    this.f102856d = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f102856d = m20201a2.mo78678b();
            }
        }
    }
}
