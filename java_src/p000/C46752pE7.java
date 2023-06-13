package p000;
/* renamed from: pE7 */
/* loaded from: classes5.dex */
public final class C46752pE7 extends AbstractC38831bu7 {
    private static final C46752pE7 zze;
    private int zzf;
    private Object zzh;
    private Object zzj;
    private C34860Nw7 zzm;
    private int zzn;
    private int zzg = 0;
    private int zzi = 0;
    private byte zzq = 2;
    private String zzk = "FaceAttributesClientBrainEmbedder";
    private String zzl = "";
    private boolean zzo = true;
    private int zzp = 1;

    static {
        C46752pE7 c46752pE7 = new C46752pE7();
        zze = c46752pE7;
        AbstractC40627eu7.m42395x(C46752pE7.class, c46752pE7);
    }

    private C46752pE7() {
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
                            this.zzq = b;
                            return null;
                        }
                        return zze;
                    }
                    return new C46159oE7(null);
                }
                return new C46752pE7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\n\u0002\u0001\u0002\r\n\u0000\u0000\u0001\u0002ြ\u0000\u0003ျ\u0000\u0004ဇ\b\u0005ဌ\t\u0007ᐼ\u0001\bျ\u0001\tဈ\u0000\nဈ\u0001\fင\u0003\rဉ\u0002", new Object[]{"zzh", "zzg", "zzj", "zzi", "zzf", C40813fD7.class, "zzo", "zzp", C45566nE7.f99671a, C48530sE7.class, "zzk", "zzl", "zzn", "zzm"});
        }
        return Byte.valueOf(this.zzq);
    }
}
