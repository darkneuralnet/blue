package p000;

import java.util.List;
/* renamed from: aK7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37894aK7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C37894aK7 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C37894aK7 c37894aK7 = new C37894aK7();
        zzb = c37894aK7;
        AbstractC40627eu7.m42395x(C37894aK7.class, c37894aK7);
    }

    private C37894aK7() {
    }

    /* renamed from: D */
    public static ZJ7 m71655D() {
        return (ZJ7) zzb.m42408f();
    }

    /* renamed from: G */
    public static /* synthetic */ void m71652G(C37894aK7 c37894aK7, XJ7 xj7) {
        xj7.getClass();
        InterfaceC45964nu7 interfaceC45964nu7 = c37894aK7.zze;
        if (!interfaceC45964nu7.zzc()) {
            c37894aK7.zze = AbstractC40627eu7.m42398t(interfaceC45964nu7);
        }
        c37894aK7.zze.add(xj7);
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
                    return new ZJ7(null);
                }
                return new C37894aK7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", XJ7.class});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final List m71653F() {
        return this.zze;
    }
}
