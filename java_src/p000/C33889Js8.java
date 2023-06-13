package p000;
/* renamed from: Js8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33889Js8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C33889Js8 zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        C33889Js8 c33889Js8 = new C33889Js8();
        zzb = c33889Js8;
        AbstractC40627eu7.m42395x(C33889Js8.class, c33889Js8);
    }

    private C33889Js8() {
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
                    return new C49502ts8(null);
                }
                return new C33889Js8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final float m99609D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final int m99608E() {
        return this.zzf;
    }

    /* renamed from: G */
    public final String m99606G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final String m99605H() {
        return this.zzh;
    }
}
