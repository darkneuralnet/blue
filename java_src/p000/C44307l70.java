package p000;

import java.io.Serializable;
/* renamed from: l70  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44307l70<F, T> extends AbstractC53114zy3<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final InterfaceC50859wA1<F, ? extends T> f95508b;

    /* renamed from: c */
    public final AbstractC53114zy3<T> f95509c;

    public C44307l70(InterfaceC50859wA1<F, ? extends T> interfaceC50859wA1, AbstractC53114zy3<T> abstractC53114zy3) {
        this.f95508b = (InterfaceC50859wA1) EZ3.m108801n(interfaceC50859wA1);
        this.f95509c = (AbstractC53114zy3) EZ3.m108801n(abstractC53114zy3);
    }

    @Override // p000.AbstractC53114zy3, java.util.Comparator
    public int compare(F f, F f2) {
        return this.f95509c.compare(this.f95508b.apply(f), this.f95508b.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C44307l70)) {
            return false;
        }
        C44307l70 c44307l70 = (C44307l70) obj;
        if (this.f95508b.equals(c44307l70.f95508b) && this.f95509c.equals(c44307l70.f95509c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C37025Xd3.m76747b(this.f95508b, this.f95509c);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f95509c);
        String valueOf2 = String.valueOf(this.f95508b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
