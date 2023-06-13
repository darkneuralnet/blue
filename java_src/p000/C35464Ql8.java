package p000;

import java.io.IOException;
/* renamed from: Ql8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35464Ql8 {

    /* renamed from: b */
    public volatile int f30878b = -1;

    /* renamed from: e */
    public static final void m88005e(C35464Ql8 c35464Ql8, byte[] bArr, int i, int i2) {
        try {
            C39325ck8 m60949t = C39325ck8.m60949t(bArr, 0, i2);
            c35464Ql8.mo40568d(m60949t);
            m60949t.m60953p();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: d */
    public void mo40568d(C39325ck8 c39325ck8) throws IOException {
    }

    /* renamed from: f */
    public final int m88004f() {
        int mo40567g = mo40567g();
        this.f30878b = mo40567g;
        return mo40567g;
    }

    /* renamed from: g */
    public int mo40567g() {
        return 0;
    }

    @Override // 
    /* renamed from: h */
    public C35464Ql8 clone() throws CloneNotSupportedException {
        return (C35464Ql8) super.clone();
    }

    public String toString() {
        return C35707Rm8.m86302a(this);
    }
}
