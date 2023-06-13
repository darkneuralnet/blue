package p000;

import java.util.List;
/* renamed from: eE8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40230eE8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C40230eE8 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C40230eE8 c40230eE8 = new C40230eE8();
        zzb = c40230eE8;
        AbstractC40627eu7.m42395x(C40230eE8.class, c40230eE8);
    }

    private C40230eE8() {
    }

    /* renamed from: E */
    public static C40230eE8 m43082E() {
        return zzb;
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
                    return new TD8(null);
                }
                return new C40230eE8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", NE8.class});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final List m43081F() {
        return this.zze;
    }
}
