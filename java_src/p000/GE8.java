package p000;

import java.io.Serializable;
import java.util.Arrays;
/* renamed from: GE8 */
/* loaded from: classes5.dex */
public final class GE8 implements Serializable, LD8 {

    /* renamed from: b */
    public final Object f11189b;

    public GE8(Object obj) {
        this.f11189b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GE8) {
            return FC8.m107436a(this.f11189b, ((GE8) obj).f11189b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11189b});
    }

    public final String toString() {
        String obj = this.f11189b.toString();
        return "Suppliers.ofInstance(" + obj + ")";
    }

    @Override // p000.LD8
    public final Object zza() {
        return this.f11189b;
    }
}
