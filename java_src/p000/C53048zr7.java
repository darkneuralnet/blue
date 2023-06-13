package p000;
/* renamed from: zr7 */
/* loaded from: classes5.dex */
public final class C53048zr7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C53048zr7 zzb;
    private int zze;
    private int zzf;
    private C41773gq7 zzh;
    private C41773gq7 zzi;
    private float zzk;
    private C41773gq7 zzm;
    private C41773gq7 zzn;
    private C35274Pq7 zzo;
    private C32475Dr7 zzq;
    private byte zzr = 2;
    private InterfaceC44185ku7 zzg = AbstractC40627eu7.m42401q();
    private String zzj = "";
    private InterfaceC45964nu7 zzl = AbstractC40627eu7.m42399s();
    private boolean zzp = true;

    static {
        C53048zr7 c53048zr7 = new C53048zr7();
        zzb = c53048zr7;
        AbstractC40627eu7.m42395x(C53048zr7.class, c53048zr7);
    }

    private C53048zr7() {
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
                            this.zzr = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C52455yr7(null);
                }
                return new C53048zr7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\b\u0001ᔄ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ခ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\nᐉ\t\u000bЛ\f\u0016", new Object[]{"zze", "zzf", "zzh", "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzl", C44145kq7.class, "zzg"});
        }
        return Byte.valueOf(this.zzr);
    }
}
