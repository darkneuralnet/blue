package p000;
/* renamed from: dq8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39995dq8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C39995dq8 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        C39995dq8 c39995dq8 = new C39995dq8();
        zzb = c39995dq8;
        AbstractC40627eu7.m42395x(C39995dq8.class, c39995dq8);
    }

    private C39995dq8() {
    }

    /* renamed from: I */
    public static C39995dq8 m43638I() {
        return zzb;
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
                    return new C35500Qp8(null);
                }
                return new C39995dq8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m43643D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final int m43642E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final int m43641F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final int m43640G() {
        return this.zzh;
    }
}
