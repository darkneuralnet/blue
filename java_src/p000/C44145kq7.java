package p000;
/* renamed from: kq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44145kq7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C44145kq7 zzb;
    private int zze;
    private float zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C44145kq7 c44145kq7 = new C44145kq7();
        zzb = c44145kq7;
        AbstractC40627eu7.m42395x(C44145kq7.class, c44145kq7);
    }

    private C44145kq7() {
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
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C43552jq7(null);
                }
                return new C44145kq7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔁ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
