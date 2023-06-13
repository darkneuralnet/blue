package p000;
/* renamed from: Xy7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37218Xy7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C37218Xy7 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        C37218Xy7 c37218Xy7 = new C37218Xy7();
        zzb = c37218Xy7;
        AbstractC40627eu7.m42395x(C37218Xy7.class, c37218Xy7);
    }

    private C37218Xy7() {
    }

    /* renamed from: E */
    public static C37218Xy7 m75934E() {
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
                    return new C36984Wy7(null);
                }
                return new C37218Xy7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final boolean m75933F() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: G */
    public final boolean m75932G() {
        return (this.zze & 2) != 0;
    }
}
