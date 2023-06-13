package p000;

import java.util.List;
/* renamed from: fn8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41151fn8 extends AbstractC46897pU8 implements A19 {
    private static final C41151fn8 zza;
    private NV8 zzd = AbstractC46897pU8.m19202q();

    static {
        C41151fn8 c41151fn8 = new C41151fn8();
        zza = c41151fn8;
        AbstractC46897pU8.m19196w(C41151fn8.class, c41151fn8);
    }

    private C41151fn8() {
    }

    /* renamed from: B */
    public static C35941Sm8 m40816B() {
        return (C35941Sm8) zza.m19209i();
    }

    /* renamed from: F */
    public static /* synthetic */ void m40812F(C41151fn8 c41151fn8, C32206Cn8 c32206Cn8) {
        c32206Cn8.getClass();
        NV8 nv8 = c41151fn8.zzd;
        if (!nv8.zzc()) {
            c41151fn8.zzd = AbstractC46897pU8.m19201r(nv8);
        }
        c41151fn8.zzd.add(c32206Cn8);
    }

    @Override // p000.AbstractC46897pU8
    /* renamed from: A */
    public final Object mo8350A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C35941Sm8(null);
                }
                return new C41151fn8();
            }
            return AbstractC46897pU8.m19199t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C32206Cn8.class});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final C32206Cn8 m40814D(int i) {
        return (C32206Cn8) this.zzd.get(0);
    }

    /* renamed from: E */
    public final List m40813E() {
        return this.zzd;
    }
}
