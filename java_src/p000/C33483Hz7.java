package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.util.List;
/* renamed from: Hz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33483Hz7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C33483Hz7 zzb;
    private int zze;
    private InterfaceC45964nu7 zzf = AbstractC40627eu7.m42399s();
    private String zzg = "";

    static {
        C33483Hz7 c33483Hz7 = new C33483Hz7();
        zzb = c33483Hz7;
        AbstractC40627eu7.m42395x(C33483Hz7.class, c33483Hz7);
    }

    private C33483Hz7() {
    }

    /* renamed from: E */
    public static C33483Hz7 m103092E(byte[] bArr, C53068zt7 c53068zt7) throws zzaqw {
        return (C33483Hz7) AbstractC40627eu7.m42404m(zzb, bArr, c53068zt7);
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
                    return new C32781Ez7(null);
                }
                return new C33483Hz7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzf", C33249Gz7.class, "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final List m103091F() {
        return this.zzf;
    }
}
