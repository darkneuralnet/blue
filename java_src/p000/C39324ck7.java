package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
/* renamed from: ck7 */
/* loaded from: classes5.dex */
public final class C39324ck7 extends AbstractC49926ub9 implements InterfaceC51161wg9 {
    private static final C39324ck7 zzb;
    private int zze;
    private C50066up9 zzf;
    private byte zzg = 2;

    static {
        C39324ck7 c39324ck7 = new C39324ck7();
        zzb = c39324ck7;
        AbstractC49926ub9.m9987k(C39324ck7.class, c39324ck7);
    }

    private C39324ck7() {
    }

    /* renamed from: v */
    public static C39324ck7 m60971v(byte[] bArr, N89 n89) throws zzov {
        return (C39324ck7) AbstractC49926ub9.m9979t(zzb, bArr, n89);
    }

    @Override // p000.AbstractC49926ub9
    /* renamed from: n */
    public final Object mo9690n(int i, Object obj, Object obj2) {
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
                            this.zzg = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C31701Aj7(null);
                }
                return new C39324ck7();
            }
            return AbstractC49926ub9.m9988j(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    /* renamed from: w */
    public final C50066up9 m60970w() {
        C50066up9 c50066up9 = this.zzf;
        return c50066up9 == null ? C50066up9.m9688v() : c50066up9;
    }
}
