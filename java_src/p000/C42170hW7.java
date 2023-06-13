package p000;
/* renamed from: hW7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42170hW7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C42170hW7 zzb;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C42170hW7 c42170hW7 = new C42170hW7();
        zzb = c42170hW7;
        AbstractC40627eu7.m42395x(C42170hW7.class, c42170hW7);
    }

    private C42170hW7() {
    }

    /* renamed from: D */
    public static C46896pU7 m36252D() {
        return (C46896pU7) zzb.m42408f();
    }

    /* renamed from: F */
    public static /* synthetic */ void m36250F(C42170hW7 c42170hW7, TV7 tv7) {
        tv7.getClass();
        InterfaceC45964nu7 interfaceC45964nu7 = c42170hW7.zze;
        if (!interfaceC45964nu7.zzc()) {
            c42170hW7.zze = AbstractC40627eu7.m42398t(interfaceC45964nu7);
        }
        c42170hW7.zze.add(tv7);
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
                    return new C46896pU7(null);
                }
                return new C42170hW7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", TV7.class});
        }
        return (byte) 1;
    }
}
