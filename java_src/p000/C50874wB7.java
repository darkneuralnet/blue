package p000;
/* renamed from: wB7 */
/* loaded from: classes5.dex */
public final class C50874wB7 extends AbstractC38831bu7 {
    private static final C50874wB7 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private C41388gB7 zzi;
    private int zzk;
    private int zzl;
    private C43760kB7 zzn;
    private long zzq;
    private byte zzr = 2;
    private String zzj = "";
    private InterfaceC45964nu7 zzm = AbstractC40627eu7.m42399s();
    private String zzo = "";
    private InterfaceC45964nu7 zzp = AbstractC40627eu7.m42399s();

    static {
        C50874wB7 c50874wB7 = new C50874wB7();
        zze = c50874wB7;
        AbstractC40627eu7.m42395x(C50874wB7.class, c50874wB7);
    }

    private C50874wB7() {
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
                        return zze;
                    }
                    return new C50281vB7(null);
                }
                return new C50874wB7();
            }
            return AbstractC40627eu7.m42396v(zze, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0003\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007Л\bᐉ\u0006\tဈ\u0007\n\u001a\u000bဂ\b", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C49689uB7.class, "zzn", "zzo", "zzp", "zzq"});
        }
        return Byte.valueOf(this.zzr);
    }
}
