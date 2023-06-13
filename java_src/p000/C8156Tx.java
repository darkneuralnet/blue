package p000;
/* renamed from: Tx */
/* loaded from: classes6.dex */
public final class C8156Tx {

    /* renamed from: a */
    public final byte[] f36488a;

    /* renamed from: b */
    public int f36489b = 0;

    public C8156Tx(int i) {
        this.f36488a = new byte[i];
    }

    /* renamed from: a */
    public void m82226a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f36489b;
            this.f36489b = i3 + 1;
            m82224c(i3, z);
        }
    }

    /* renamed from: b */
    public byte[] m82225b(int i) {
        int length = this.f36488a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f36488a[i2 / i];
        }
        return bArr;
    }

    /* renamed from: c */
    public final void m82224c(int i, boolean z) {
        this.f36488a[i] = z ? (byte) 1 : (byte) 0;
    }
}
