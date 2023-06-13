package p000;
/* renamed from: pg5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47008pg5 extends C36610Vj2 {
    public C47008pg5() {
        this(256);
    }

    /* renamed from: s */
    public static int m18996s(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHA-3");
    }

    @Override // p000.C36610Vj2, p000.P31
    /* renamed from: a */
    public int mo15581a(byte[] bArr, int i) {
        m79527l(2, 2);
        return super.mo15581a(bArr, i);
    }

    @Override // p000.C36610Vj2, p000.P31
    /* renamed from: d */
    public String mo15579d() {
        return "SHA3-" + this.f39607e;
    }

    public C47008pg5(int i) {
        super(m18996s(i));
    }
}
