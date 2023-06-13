package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.util.List;
/* renamed from: ud8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49945ud8 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C49945ud8 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC45964nu7 zzh = AbstractC40627eu7.m42399s();

    static {
        C49945ud8 c49945ud8 = new C49945ud8();
        zzb = c49945ud8;
        AbstractC40627eu7.m42395x(C49945ud8.class, c49945ud8);
    }

    private C49945ud8() {
    }

    /* renamed from: F */
    public static C49945ud8 m9934F(byte[] bArr, C53068zt7 c53068zt7) throws zzaqw {
        return (C49945ud8) AbstractC40627eu7.m42404m(zzb, bArr, c53068zt7);
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
                    return new C41644gd8(null);
                }
                return new C49945ud8();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", C42909il7.class});
        }
        return (byte) 1;
    }

    /* renamed from: D */
    public final int m9936D() {
        return this.zzf;
    }

    /* renamed from: G */
    public final String m9933G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final List m9932H() {
        return this.zzh;
    }
}
