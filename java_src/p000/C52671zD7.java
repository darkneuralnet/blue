package p000;
/* renamed from: zD7 */
/* loaded from: classes5.dex */
public final class C52671zD7 extends AbstractC38831bu7 {
    private static final C52671zD7 zze;
    private int zzf;
    private C47929rD7 zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private long zzp;
    private long zzq;
    private long zzr;
    private float zzs;
    private byte zzt = 2;
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzn = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzo = AbstractC40627eu7.m42399s();

    static {
        C52671zD7 c52671zD7 = new C52671zD7();
        zze = c52671zD7;
        AbstractC40627eu7.m42395x(C52671zD7.class, c52671zD7);
    }

    private C52671zD7() {
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
                            this.zzt = b;
                            return null;
                        }
                        return zze;
                    }
                    return new C48521sD7(null);
                }
                return new C52671zD7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005", new Object[]{"zzf", "zzg", "zzh", C52078yD7.class, "zzi", "zzj", "zzk", "zzl", "zzn", C49707uD7.class, "zzo", C46743pD7.class, "zzq", "zzs", "zzr", "zzp", "zzm"});
        }
        return Byte.valueOf(this.zzt);
    }
}
