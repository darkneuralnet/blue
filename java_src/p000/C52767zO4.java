package p000;

import java.io.Serializable;
/* renamed from: zO4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52767zO4<T> extends AbstractC53114zy3<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final AbstractC53114zy3<? super T> f121287b;

    public C52767zO4(AbstractC53114zy3<? super T> abstractC53114zy3) {
        this.f121287b = (AbstractC53114zy3) EZ3.m108801n(abstractC53114zy3);
    }

    @Override // p000.AbstractC53114zy3, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f121287b.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C52767zO4) {
            return this.f121287b.equals(((C52767zO4) obj).f121287b);
        }
        return false;
    }

    @Override // p000.AbstractC53114zy3
    /* renamed from: f */
    public <S extends T> AbstractC53114zy3<S> mo55f() {
        return (AbstractC53114zy3<? super T>) this.f121287b;
    }

    public int hashCode() {
        return -this.f121287b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f121287b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
