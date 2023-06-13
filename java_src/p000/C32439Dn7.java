package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
/* renamed from: Dn7 */
/* loaded from: classes5.dex */
public final class C32439Dn7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C32439Dn7 zzb;
    private int zze;
    private C48356rw7 zzf;
    private C41250fx7 zzg;
    private String zzh = "";

    static {
        C32439Dn7 c32439Dn7 = new C32439Dn7();
        zzb = c32439Dn7;
        AbstractC40627eu7.m42395x(C32439Dn7.class, c32439Dn7);
    }

    private C32439Dn7() {
    }

    /* renamed from: D */
    public static C32205Cn7 m109933D() {
        return (C32205Cn7) zzb.m42408f();
    }

    /* renamed from: F */
    public static C32439Dn7 m109931F(byte[] bArr, C53068zt7 c53068zt7) throws zzaqw {
        return (C32439Dn7) AbstractC40627eu7.m42404m(zzb, bArr, c53068zt7);
    }

    /* renamed from: J */
    public static /* synthetic */ void m109927J(C32439Dn7 c32439Dn7, C48356rw7 c48356rw7) {
        c48356rw7.getClass();
        c32439Dn7.zzf = c48356rw7;
        c32439Dn7.zze |= 1;
    }

    /* renamed from: K */
    public static /* synthetic */ void m109926K(C32439Dn7 c32439Dn7, C41250fx7 c41250fx7) {
        c41250fx7.getClass();
        c32439Dn7.zzg = c41250fx7;
        c32439Dn7.zze |= 2;
    }

    /* renamed from: L */
    public static /* synthetic */ void m109925L(C32439Dn7 c32439Dn7, String str) {
        c32439Dn7.zze |= 4;
        c32439Dn7.zzh = str;
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
                    return new C32205Cn7(null);
                }
                return new C32439Dn7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: G */
    public final C48356rw7 m109930G() {
        C48356rw7 c48356rw7 = this.zzf;
        return c48356rw7 == null ? C48356rw7.m15006G() : c48356rw7;
    }

    /* renamed from: H */
    public final C41250fx7 m109929H() {
        C41250fx7 c41250fx7 = this.zzg;
        return c41250fx7 == null ? C41250fx7.m40413E() : c41250fx7;
    }

    /* renamed from: I */
    public final String m109928I() {
        return this.zzh;
    }

    /* renamed from: M */
    public final boolean m109924M() {
        return (this.zze & 1) != 0;
    }
}
