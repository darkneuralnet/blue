package p000;

import java.util.List;
/* renamed from: il7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42909il7 extends AbstractC40627eu7<C42909il7, C46457ok7> implements InterfaceC41823gv7 {
    private static final C42909il7 zzb;
    private int zze;
    private InterfaceC45964nu7 zzf = AbstractC40627eu7.m42399s();
    private String zzg = "";

    static {
        C42909il7 c42909il7 = new C42909il7();
        zzb = c42909il7;
        AbstractC40627eu7.m42395x(C42909il7.class, c42909il7);
    }

    private C42909il7() {
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
                    return new C46457ok7(null);
                }
                return new C42909il7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzf", C50666vq7.class, "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: E */
    public final List m33508E() {
        return this.zzf;
    }
}