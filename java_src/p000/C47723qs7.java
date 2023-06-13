package p000;
/* renamed from: qs7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47723qs7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C47723qs7 zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private boolean zzm;
    private float zzn;
    private float zzo;
    private byte zzp = 2;
    private String zzi = "";
    private int zzj = -1;
    private float zzk = -1.0f;
    private float zzl = -1.0f;

    static {
        C47723qs7 c47723qs7 = new C47723qs7();
        zzb = c47723qs7;
        AbstractC40627eu7.m42395x(C47723qs7.class, c47723qs7);
    }

    private C47723qs7() {
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
                    return new C47130ps7(null);
                }
                return new C47723qs7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ᔁ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003\u0005င\u0004\u0007ခ\u0005\bခ\u0006\tဇ\u0007\nခ\b\u000bခ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        return Byte.valueOf(this.zzp);
    }
}
