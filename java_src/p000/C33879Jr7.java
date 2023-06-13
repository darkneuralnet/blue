package p000;
/* renamed from: Jr7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33879Jr7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C33879Jr7 zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private C34347Lr7 zzk;
    private C38208ar7 zzm;
    private C37146Xq7 zzn;
    private byte zzp = 2;
    private AbstractC44175kt7 zzf = AbstractC44175kt7.f95165c;
    private String zzi = "";
    private InterfaceC45964nu7 zzj = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzl = AbstractC40627eu7.m42399s();
    private InterfaceC45964nu7 zzo = AbstractC40627eu7.m42399s();

    static {
        C33879Jr7 c33879Jr7 = new C33879Jr7();
        zzb = c33879Jr7;
        AbstractC40627eu7.m42395x(C33879Jr7.class, c33879Jr7);
    }

    private C33879Jr7() {
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
                    return new C33645Ir7(null);
                }
                return new C33879Jr7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0004\u0001ᔊ\u0000\u0002ဈ\u0003\u0003Л\u0004ဉ\u0004\u0005Л\u0006ဉ\u0005\u0007ဉ\u0006\bЛ\tင\u0001\nင\u0002", new Object[]{"zze", "zzf", "zzi", "zzj", C36210Tq7.class, "zzk", "zzl", C33411Hr7.class, "zzm", "zzn", "zzo", C32943Fr7.class, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzp);
    }
}
