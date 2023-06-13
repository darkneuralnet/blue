package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import java.util.List;
/* renamed from: Ay */
/* loaded from: classes6.dex */
public final class C0363Ay extends V78<C0363Ay, C43222jH8> implements InterfaceC48227rj8 {
    private static final C0363Ay zza;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC47544qa8 zze = V78.m80342p();
    private String zzg = "";
    private AbstractC41604gZ7 zzh = AbstractC41604gZ7.f82424c;

    static {
        C0363Ay c0363Ay = new C0363Ay();
        zza = c0363Ay;
        V78.m80336w(C0363Ay.class, c0363Ay);
    }

    private C0363Ay() {
    }

    /* renamed from: I */
    public static C0363Ay m114823I(byte[] bArr, J28 j28) throws zzeo {
        return (C0363Ay) V78.m80346k(zza, bArr, j28);
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
                            this.zzi = b;
                            return null;
                        }
                        return zza;
                    }
                    return new C43222jH8(null);
                }
                return new C0363Ay();
            }
            return V78.m80339t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᔌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", C49824uQ7.class, "zzf", C41733gm7.f84229a, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }

    /* renamed from: J */
    public final List m114822J() {
        return this.zze;
    }
}
