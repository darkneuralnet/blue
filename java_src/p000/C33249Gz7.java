package p000;
/* renamed from: Gz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33249Gz7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C33249Gz7 zzb;
    private int zze;
    private int zzg;
    private long zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        C33249Gz7 c33249Gz7 = new C33249Gz7();
        zzb = c33249Gz7;
        AbstractC40627eu7.m42395x(C33249Gz7.class, c33249Gz7);
    }

    private C33249Gz7() {
    }

    @Override // p000.AbstractC40627eu7
    /* renamed from: B */
    public final Object mo5B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C33015Fz7(null);
                }
                return new C33249Gz7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final long m104522D() {
        return this.zzi;
    }

    /* renamed from: F */
    public final String m104520F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final String m104519G() {
        return this.zzh;
    }
}
