package p000;
/* renamed from: S70 */
/* loaded from: classes8.dex */
public final class S70 {
    /* renamed from: a */
    public static byte[] m85979a(byte[] bArr, int i, int i2) {
        if (bArr != null && i <= bArr.length) {
            int min = Math.min(bArr.length - i, i2);
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i, bArr2, 0, min);
            return bArr2;
        }
        return null;
    }
}
