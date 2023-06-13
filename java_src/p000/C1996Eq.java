package p000;
/* renamed from: Eq */
/* loaded from: classes6.dex */
public final class C1996Eq {

    /* renamed from: a */
    public final byte[] f8177a;

    /* renamed from: b */
    public final byte[] f8178b;

    public C1996Eq(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            this.f8177a = bArr;
            if (bArr2 != null) {
                this.f8178b = bArr2;
                return;
            }
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    /* renamed from: a */
    public byte[] m108334a() {
        return this.f8178b;
    }

    /* renamed from: b */
    public byte[] m108333b() {
        return this.f8177a;
    }
}
