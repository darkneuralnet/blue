package p000;

import kotlin.UByte;
/* renamed from: k91  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43735k91 implements InterfaceC22527h {
    @Override // p000.InterfaceC22527h
    /* renamed from: a */
    public C20674g mo1049a(int i, int i2, byte[] bArr) {
        if (bArr == null || bArr.length < 3 || (bArr[0] & UByte.MAX_VALUE) != 170 || (bArr[1] & UByte.MAX_VALUE) != 254) {
            return null;
        }
        int i3 = bArr[2] & 240;
        if (i3 != 0) {
            if (i3 != 16) {
                if (i3 != 32) {
                    if (i3 != 48) {
                        return null;
                    }
                    return new C44328l91(i, i2, bArr);
                }
                return new C44921m91(i, i2, bArr);
            }
            return new C46107o91(i, i2, bArr);
        }
        return new C45514n91(i, i2, bArr);
    }
}
