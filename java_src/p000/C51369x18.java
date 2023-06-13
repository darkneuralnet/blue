package p000;

import java.io.Serializable;
import java.util.Arrays;
/* renamed from: x18  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51369x18<T> implements Serializable, G08 {

    /* renamed from: b */
    public final T f117011b;

    public C51369x18(T t) {
        this.f117011b = t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C51369x18)) {
            return false;
        }
        T t = this.f117011b;
        T t2 = ((C51369x18) obj).f117011b;
        if (t != t2 && !t.equals(t2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f117011b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f117011b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // p000.G08
    public final T zza() {
        return this.f117011b;
    }
}
