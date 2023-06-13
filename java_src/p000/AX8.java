package p000;
/* renamed from: AX8 */
/* loaded from: classes6.dex */
public enum AX8 implements KX8 {
    INSTANCE;

    @Override // p000.KX8
    /* renamed from: a */
    public final /* synthetic */ long mo42796a(byte[] bArr, int i) {
        if (ordinal() == 0) {
            return (bArr[i] & 255) | ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
        }
        throw null;
    }
}
