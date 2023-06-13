package p000;
/* renamed from: Nu9 */
/* loaded from: classes5.dex */
public final class Nu9 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final InterfaceC44778lu7 zzb = new Fu9();
    private static final InterfaceC44778lu7 zze = new Hu9();
    private static final InterfaceC44778lu7 zzf = new Ju9();
    private static final Nu9 zzg;
    private int zzh;
    private long zzi;
    private InterfaceC44185ku7 zzj = AbstractC40627eu7.m42401q();
    private InterfaceC44185ku7 zzk = AbstractC40627eu7.m42401q();
    private InterfaceC44185ku7 zzl = AbstractC40627eu7.m42401q();
    private int zzm;

    static {
        Nu9 nu9 = new Nu9();
        zzg = nu9;
        AbstractC40627eu7.m42395x(Nu9.class, nu9);
    }

    private Nu9() {
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                InterfaceC42999iu7 interfaceC42999iu7 = Lu9.f22235a;
                return AbstractC40627eu7.m42396v(zzg, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဃ\u0000\u0002\u001e\u0003\u001e\u0004\u001e\u0005င\u0001", new Object[]{"zzh", "zzi", "zzj", interfaceC42999iu7, "zzk", interfaceC42999iu7, "zzl", interfaceC42999iu7, "zzm"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzg;
                }
                return new Ku9(null);
            } else {
                return new Nu9();
            }
        }
        return (byte) 1;
    }
}
