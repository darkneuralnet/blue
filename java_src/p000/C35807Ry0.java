package p000;
/* renamed from: Ry0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35807Ry0 {
    private C35807Ry0() {
    }

    /* renamed from: a */
    public static boolean m86160a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        if (i != 0) {
            return false;
        }
        return true;
    }
}
