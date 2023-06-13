package p000;

import java.util.Iterator;
import java.util.List;
/* renamed from: qr7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47713qr7 implements InterfaceC37164Xs7 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C47713qr7;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return null;
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        return InterfaceC37164Xs7.f44126i0;
    }

    @Override // p000.InterfaceC37164Xs7
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // p000.InterfaceC37164Xs7
    public final Double zzh() {
        return Double.valueOf(0.0d);
    }

    @Override // p000.InterfaceC37164Xs7
    public final String zzi() {
        return "null";
    }
}
