package p000;
/* renamed from: Pq7 */
/* loaded from: classes5.dex */
public final class C35274Pq7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C35274Pq7 zzb;
    private int zze;
    private AbstractC44175kt7 zzf;
    private AbstractC44175kt7 zzg;
    private AbstractC44175kt7 zzh;
    private C41773gq7 zzi;
    private String zzj;
    private byte zzk = 2;

    static {
        C35274Pq7 c35274Pq7 = new C35274Pq7();
        zzb = c35274Pq7;
        AbstractC40627eu7.m42395x(C35274Pq7.class, c35274Pq7);
    }

    private C35274Pq7() {
        AbstractC44175kt7 abstractC44175kt7 = AbstractC44175kt7.f95165c;
        this.zzf = abstractC44175kt7;
        this.zzg = abstractC44175kt7;
        this.zzh = abstractC44175kt7;
        this.zzj = "";
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
                            this.zzk = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C35040Oq7(null);
                }
                return new C35274Pq7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
