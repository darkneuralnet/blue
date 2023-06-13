package p000;

import java.util.List;
/* renamed from: NE8 */
/* loaded from: classes5.dex */
public final class NE8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final NE8 zzb;
    private int zze;
    private InterfaceC45964nu7 zzf = AbstractC40627eu7.m42399s();
    private int zzg;

    static {
        NE8 ne8 = new NE8();
        zzb = ne8;
        AbstractC40627eu7.m42395x(NE8.class, ne8);
    }

    private NE8() {
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
                    return new CE8(null);
                }
                return new NE8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zze", "zzf", C33889Js8.class, "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: E */
    public final List m94164E() {
        return this.zzf;
    }
}
