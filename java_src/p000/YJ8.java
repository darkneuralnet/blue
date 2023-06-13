package p000;
/* renamed from: YJ8 */
/* loaded from: classes5.dex */
public final class YJ8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final YJ8 zzb;
    private int zze;
    private long zzf;
    private C39995dq8 zzg;
    private C37156Xr8 zzh;
    private InterfaceC45964nu7 zzi = AbstractC40627eu7.m42399s();

    static {
        YJ8 yj8 = new YJ8();
        zzb = yj8;
        AbstractC40627eu7.m42395x(YJ8.class, yj8);
    }

    private YJ8() {
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
                    return new MJ8(null);
                }
                return new YJ8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzi", C33889Js8.class, "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m75254D() {
        return this.zzi.size();
    }

    /* renamed from: E */
    public final long m75253E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final C39995dq8 m75252F() {
        C39995dq8 c39995dq8 = this.zzg;
        return c39995dq8 == null ? C39995dq8.m43638I() : c39995dq8;
    }

    /* renamed from: G */
    public final C33889Js8 m75251G(int i) {
        return (C33889Js8) this.zzi.get(i);
    }

    /* renamed from: I */
    public final boolean m75249I() {
        return (this.zze & 1) != 0;
    }
}
