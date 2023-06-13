package p000;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: LJ7 */
/* loaded from: classes5.dex */
public final class LJ7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final LJ7 zzb;
    private C41250fx7 zze;

    static {
        LJ7 lj7 = new LJ7();
        zzb = lj7;
        AbstractC40627eu7.m42395x(LJ7.class, lj7);
    }

    private LJ7() {
    }

    /* renamed from: F */
    public static LJ7 m97333F(InputStream inputStream, C53068zt7 c53068zt7) throws IOException {
        return (LJ7) AbstractC40627eu7.m42405l(zzb, inputStream, c53068zt7);
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new KJ7(null);
                }
                return new LJ7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final C41250fx7 m97335D() {
        C41250fx7 c41250fx7 = this.zze;
        return c41250fx7 == null ? C41250fx7.m40413E() : c41250fx7;
    }
}
