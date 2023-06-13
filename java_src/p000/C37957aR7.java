package p000;

import java.util.List;
/* renamed from: aR7 */
/* loaded from: classes5.dex */
public final class C37957aR7 extends V78 implements InterfaceC48227rj8 {
    private static final C37957aR7 zza;
    private int zzd;
    private int zze;
    private C42840ie8 zzg;
    private byte zzh = 2;
    private InterfaceC47544qa8 zzf = V78.m80342p();

    static {
        C37957aR7 c37957aR7 = new C37957aR7();
        zza = c37957aR7;
        V78.m80336w(C37957aR7.class, c37957aR7);
    }

    private C37957aR7() {
    }

    @Override // p000.V78
    /* renamed from: G */
    public final Object mo3770G(int i, Object obj, Object obj2) {
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
                        return zza;
                    }
                    return new HO7(null);
                }
                return new C37957aR7();
            }
            return V78.m80339t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C44479lP7.f96163a, "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }

    /* renamed from: I */
    public final List m71359I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final int m71358J() {
        int m98890a = KQ7.m98890a(this.zze);
        if (m98890a == 0) {
            return 1;
        }
        return m98890a;
    }
}
