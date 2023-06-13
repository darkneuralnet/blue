package p000;

import java.util.Iterator;
import java.util.List;
/* renamed from: sk7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48828sk7 implements InterfaceC37164Xs7 {

    /* renamed from: b */
    public final boolean f109186b;

    public C48828sk7(Boolean bool) {
        this.f109186b = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C48828sk7) && this.f109186b == ((C48828sk7) obj).f109186b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f109186b).hashCode();
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: j */
    public final Iterator mo381j() {
        return null;
    }

    @Override // p000.InterfaceC37164Xs7
    /* renamed from: o */
    public final InterfaceC37164Xs7 mo380o(String str, C38159am8 c38159am8, List list) {
        if ("toString".equals(str)) {
            return new C43019iw7(Boolean.toString(this.f109186b));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f109186b), str));
    }

    public final String toString() {
        return String.valueOf(this.f109186b);
    }

    @Override // p000.InterfaceC37164Xs7
    public final InterfaceC37164Xs7 zzd() {
        return new C48828sk7(Boolean.valueOf(this.f109186b));
    }

    @Override // p000.InterfaceC37164Xs7
    public final Boolean zzg() {
        return Boolean.valueOf(this.f109186b);
    }

    @Override // p000.InterfaceC37164Xs7
    public final Double zzh() {
        return Double.valueOf(true != this.f109186b ? 0.0d : 1.0d);
    }

    @Override // p000.InterfaceC37164Xs7
    public final String zzi() {
        return Boolean.toString(this.f109186b);
    }
}
