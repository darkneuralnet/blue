package p000;

import java.io.Serializable;
import java.util.Comparator;
/* renamed from: Sp0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35960Sp0<T> extends AbstractC53114zy3<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final Comparator<T> f34288b;

    public C35960Sp0(Comparator<T> comparator) {
        this.f34288b = (Comparator) EZ3.m108801n(comparator);
    }

    @Override // p000.AbstractC53114zy3, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f34288b.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35960Sp0) {
            return this.f34288b.equals(((C35960Sp0) obj).f34288b);
        }
        return false;
    }

    public int hashCode() {
        return this.f34288b.hashCode();
    }

    public String toString() {
        return this.f34288b.toString();
    }
}
