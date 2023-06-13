package p000;

import java.util.UUID;
/* renamed from: sd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48757sd6 implements InterfaceC22527h {
    @Override // p000.InterfaceC22527h
    /* renamed from: a */
    public C20674g mo1049a(int i, int i2, byte[] bArr) {
        UUID[] m13920c;
        if (i2 != 20) {
            if (i2 != 21) {
                if (i2 != 31) {
                    switch (i2) {
                        case 2:
                        case 3:
                            break;
                        case 4:
                        case 5:
                            break;
                        case 6:
                        case 7:
                            break;
                        default:
                            return null;
                    }
                    return new C48165rd6(i, i2, bArr, m13920c);
                }
                m13920c = m13919d(bArr);
                return new C48165rd6(i, i2, bArr, m13920c);
            }
            m13920c = m13921b(bArr);
            return new C48165rd6(i, i2, bArr, m13920c);
        }
        m13920c = m13920c(bArr);
        return new C48165rd6(i, i2, bArr, m13920c);
    }

    /* renamed from: b */
    public final UUID[] m13921b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length / 16;
        UUID[] uuidArr = new UUID[length];
        for (int i = 0; i < length; i++) {
            uuidArr[i] = C46979pd6.m19042b(bArr, i * 16);
        }
        return uuidArr;
    }

    /* renamed from: c */
    public final UUID[] m13920c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length / 2;
        UUID[] uuidArr = new UUID[length];
        for (int i = 0; i < length; i++) {
            uuidArr[i] = C46979pd6.m19039e(bArr, i * 2);
        }
        return uuidArr;
    }

    /* renamed from: d */
    public final UUID[] m13919d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length / 4;
        UUID[] uuidArr = new UUID[length];
        for (int i = 0; i < length; i++) {
            uuidArr[i] = C46979pd6.m19036h(bArr, i * 4);
        }
        return uuidArr;
    }
}
