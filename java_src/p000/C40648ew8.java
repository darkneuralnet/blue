package p000;

import com.google.android.gms.internal.auth.zzew;
import java.util.List;
/* renamed from: ew8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40648ew8 extends AbstractC35140Pb8<C40648ew8, C35554Qv8> implements InterfaceC37318Yj8 {
    private static final C40648ew8 zzb;
    private InterfaceC35383Qc8<String> zzd = AbstractC35140Pb8.m90066d();

    static {
        C40648ew8 c40648ew8 = new C40648ew8();
        zzb = c40648ew8;
        AbstractC35140Pb8.m90063g(C40648ew8.class, c40648ew8);
    }

    private C40648ew8() {
    }

    /* renamed from: j */
    public static C40648ew8 m42373j(byte[] bArr) throws zzew {
        return (C40648ew8) AbstractC35140Pb8.m90068b(zzb, bArr);
    }

    @Override // p000.AbstractC35140Pb8
    /* renamed from: h */
    public final Object mo42375h(int i, Object obj, Object obj2) {
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
                    return new C35554Qv8(null);
                }
                return new C40648ew8();
            }
            return AbstractC35140Pb8.m90064f(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    /* renamed from: k */
    public final List<String> m42372k() {
        return this.zzd;
    }
}
