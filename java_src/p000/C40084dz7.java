package p000;
/* renamed from: dz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40084dz7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C40084dz7 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private C35346Py7 zzj;
    private C37686Zy7 zzk;
    private int zzl;
    private int zzn;
    private String zzh = "";
    private String zzi = "";
    private InterfaceC45964nu7 zzm = AbstractC40627eu7.m42399s();

    static {
        C40084dz7 c40084dz7 = new C40084dz7();
        zzb = c40084dz7;
        AbstractC40627eu7.m42395x(C40084dz7.class, c40084dz7);
    }

    private C40084dz7() {
    }

    /* renamed from: G */
    public static C40084dz7 m43425G() {
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
                    return new C36750Vy7(null);
                }
                return new C40084dz7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007င\u0006\b\u001b\tင\u0007", new Object[]{"zze", "zzf", C36282Ty7.f36570a, "zzg", C38881bz7.f59852a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C32079Bz7.class, "zzn"});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final C35346Py7 m43428D() {
        C35346Py7 c35346Py7 = this.zzj;
        return c35346Py7 == null ? C35346Py7.m89203E() : c35346Py7;
    }

    /* renamed from: E */
    public final C37686Zy7 m43427E() {
        C37686Zy7 c37686Zy7 = this.zzk;
        return c37686Zy7 == null ? C37686Zy7.m72161F() : c37686Zy7;
    }

    /* renamed from: H */
    public final int m43424H() {
        int m80522a = C36516Uy7.m80522a(this.zzf);
        if (m80522a == 0) {
            return 1;
        }
        return m80522a;
    }

    /* renamed from: I */
    public final int m43423I() {
        int m44758a = C39492cz7.m44758a(this.zzg);
        if (m44758a == 0) {
            return 1;
        }
        return m44758a;
    }
}
