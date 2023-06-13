package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.util.List;
/* renamed from: nY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45746nY7 extends AbstractC40627eu7 implements InterfaceC41823gv7 {
    private static final C45746nY7 zzb;
    private byte zzf = 2;
    private InterfaceC45964nu7 zze = AbstractC40627eu7.m42399s();

    static {
        C45746nY7 c45746nY7 = new C45746nY7();
        zzb = c45746nY7;
        AbstractC40627eu7.m42395x(C45746nY7.class, c45746nY7);
    }

    private C45746nY7() {
    }

    /* renamed from: F */
    public static C45746nY7 m23545F() {
        return zzb;
    }

    /* renamed from: G */
    public static C45746nY7 m23544G(byte[] bArr, C53068zt7 c53068zt7) throws zzaqw {
        return (C45746nY7) AbstractC40627eu7.m42404m(zzb, bArr, c53068zt7);
    }

    /* renamed from: I */
    public static /* synthetic */ void m23542I(C45746nY7 c45746nY7, Iterable iterable) {
        InterfaceC45964nu7 interfaceC45964nu7 = c45746nY7.zze;
        if (!interfaceC45964nu7.zzc()) {
            c45746nY7.zze = AbstractC40627eu7.m42398t(interfaceC45964nu7);
        }
        AbstractC52465ys7.m2343c(iterable, c45746nY7.zze);
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
                            this.zzf = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new C40930fQ7(null);
                }
                return new C45746nY7();
            }
            return AbstractC40627eu7.m42396v(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", C53128zz7.class});
        }
        return Byte.valueOf(this.zzf);
    }

    /* renamed from: D */
    public final int m23547D() {
        return this.zze.size();
    }

    /* renamed from: H */
    public final List m23543H() {
        return this.zze;
    }
}
