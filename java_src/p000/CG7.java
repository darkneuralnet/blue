package p000;
/* renamed from: CG7 */
/* loaded from: classes5.dex */
public final class CG7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final CG7 zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private FG7 zzj;
    private float zzk;
    private YF7 zzl;
    private float zzm;
    private AbstractC44175kt7 zzn;
    private AbstractC44175kt7 zzo;
    private byte zzp = 2;

    static {
        CG7 cg7 = new CG7();
        zzb = cg7;
        AbstractC40627eu7.m42395x(CG7.class, cg7);
    }

    private CG7() {
        AbstractC44175kt7 abstractC44175kt7 = AbstractC44175kt7.f95165c;
        this.zzn = abstractC44175kt7;
        this.zzo = abstractC44175kt7;
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
                        return zzb;
                    }
                    return new BG7(null);
                }
                return new CG7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ခ\u0003\u0005ခ\u0007\u0006ည\b\u0007ခ\u0005\bဉ\u0006\tᐉ\u0004\nည\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzk", "zzl", "zzj", "zzo"});
        }
        return Byte.valueOf(this.zzp);
    }
}
