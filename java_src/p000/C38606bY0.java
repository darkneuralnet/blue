package p000;
/* renamed from: bY0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C38606bY0 implements InterfaceC37968aT0 {
    @Override // p000.InterfaceC37968aT0
    /* renamed from: a */
    public byte[] mo64381a(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int min = Math.min(i2, bArr.length - i3);
        if (min <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[min];
        System.arraycopy(bArr, i3, bArr2, 0, min);
        return bArr2;
    }
}
