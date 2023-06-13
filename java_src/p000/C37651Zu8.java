package p000;
/* renamed from: Zu8 */
/* loaded from: classes5.dex */
public final class C37651Zu8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C37651Zu8 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C37651Zu8 c37651Zu8 = new C37651Zu8();
        zzb = c37651Zu8;
        AbstractC40627eu7.m42395x(C37651Zu8.class, c37651Zu8);
    }

    private C37651Zu8() {
    }

    /* renamed from: D */
    public static C34609Mu8 m72307D() {
        return (C34609Mu8) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m72305F(C37651Zu8 c37651Zu8, C45372mu8 c45372mu8) {
        c45372mu8.getClass();
        InterfaceC45964nu7 interfaceC45964nu7 = c37651Zu8.zze;
        if (!interfaceC45964nu7.zzc()) {
            c37651Zu8.zze = AbstractC40627eu7.m42398t(interfaceC45964nu7);
        }
        c37651Zu8.zze.add(c45372mu8);
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
                    return new C34609Mu8(null);
                }
                return new C37651Zu8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C45372mu8.class});
        }
        return (byte) 1;
    }
}
