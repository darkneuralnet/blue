package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.util.List;
/* renamed from: g27  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41299g27 extends AbstractC41030fb7 implements InterfaceC36309Ub7 {
    private static final C41299g27 zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private InterfaceC46367ob7 zbg = AbstractC41030fb7.m41147C();

    static {
        C41299g27 c41299g27 = new C41299g27();
        zbb = c41299g27;
        AbstractC41030fb7.m41135l(C41299g27.class, c41299g27);
    }

    private C41299g27() {
    }

    /* renamed from: G */
    public static C41299g27 m40256G(byte[] bArr, C34896Oa7 c34896Oa7) throws zbuw {
        return (C41299g27) AbstractC41030fb7.m41124y(zbb, bArr, c34896Oa7);
    }

    /* renamed from: E */
    public final int m40258E() {
        return this.zbe;
    }

    /* renamed from: H */
    public final String m40255H() {
        return this.zbf;
    }

    /* renamed from: I */
    public final List m40254I() {
        return this.zbg;
    }

    @Override // p000.AbstractC41030fb7
    /* renamed from: p */
    public final Object mo1009p(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new C40113e27(null);
                }
                return new C41299g27();
            }
            return AbstractC41030fb7.m41144c(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", C42726iS6.class});
        }
        return (byte) 1;
    }
}
