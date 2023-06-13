package p000;
/* renamed from: fE7 */
/* loaded from: classes5.dex */
public final class C40822fE7 extends AbstractC38831bu7 {
    private static final C40822fE7 zze;
    private int zzf;
    private XD7 zzg;
    private float zzi;
    private float zzj;
    private XD7 zzm;
    private C52671zD7 zzn;
    private byte zzp = 2;
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzk = AbstractC40627eu7.m42399s();
    private AbstractC44175kt7 zzl = AbstractC44175kt7.f95165c;
    private InterfaceC45964nu7 zzo = AbstractC40627eu7.m42399s();

    static {
        C40822fE7 c40822fE7 = new C40822fE7();
        zze = c40822fE7;
        AbstractC40627eu7.m42395x(C40822fE7.class, c40822fE7);
    }

    private C40822fE7() {
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzp = b;
                            return null;
                        }
                        return zze;
                    }
                    return new YD7(null);
                }
                return new C40822fE7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004\u001b\u0005ᐉ\u0005\u0006\u001b\u0007ည\u0003\bဉ\u0004\tခ\u0002", new Object[]{"zzf", "zzg", "zzh", C40229eE7.class, "zzi", "zzk", C37840aE7.class, "zzn", "zzo", VD7.class, "zzl", "zzm", "zzj"});
        }
        return Byte.valueOf(this.zzp);
    }
}
