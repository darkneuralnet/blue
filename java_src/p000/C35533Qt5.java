package p000;

import java.util.UUID;
/* renamed from: Qt5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35533Qt5 extends C20674g {
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    public final UUID f31139e;

    public C35533Qt5() {
        this(1, 22, null);
    }

    /* renamed from: d */
    public final UUID m87654d(int i, byte[] bArr) {
        if (i != 22) {
            if (i != 32) {
                if (i != 33) {
                    return null;
                }
                return C46979pd6.m19043a(bArr);
            }
            return C46979pd6.m19037g(bArr);
        }
        return C46979pd6.m19040d(bArr);
    }

    @Override // p000.C20674g
    public String toString() {
        return String.format("ServiceData(ServiceUUID=%s)", this.f31139e);
    }

    public C35533Qt5(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
        this.f31139e = m87654d(i2, bArr);
    }
}
