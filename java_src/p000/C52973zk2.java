package p000;
/* renamed from: zk2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C52973zk2 implements InterfaceC51182wj0 {

    /* renamed from: b */
    public byte[] f122153b;

    public C52973zk2(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public byte[] m456a() {
        return this.f122153b;
    }

    public C52973zk2(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f122153b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
