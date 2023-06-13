package p000;
/* renamed from: ow6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46576ow6 {

    /* renamed from: a */
    public final byte[][] f102792a;

    public C46576ow6(C45983nw6 c45983nw6, byte[][] bArr) {
        if (c45983nw6 == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (WH6.m78611k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != c45983nw6.m22162a()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != c45983nw6.m22160c()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f102792a = WH6.m78618d(bArr);
    }

    /* renamed from: a */
    public byte[][] m20253a() {
        return WH6.m78618d(this.f102792a);
    }
}
