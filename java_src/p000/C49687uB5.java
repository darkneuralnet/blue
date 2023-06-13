package p000;
/* renamed from: uB5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49687uB5<E> extends AbstractC38616bZ1<E> {

    /* renamed from: d */
    public final transient E f111932d;

    public C49687uB5(E e) {
        this.f111932d = (E) EZ3.m108801n(e);
    }

    @Override // p000.AbstractC38616bZ1, p000.QY1
    /* renamed from: a */
    public VY1<E> mo10675a() {
        return VY1.m79780F(this.f111932d);
    }

    @Override // p000.QY1
    /* renamed from: b */
    public int mo9381b(Object[] objArr, int i) {
        objArr[i] = this.f111932d;
        return i + 1;
    }

    @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f111932d.equals(obj);
    }

    @Override // p000.QY1
    /* renamed from: h */
    public boolean mo9378h() {
        return false;
    }

    @Override // p000.AbstractC38616bZ1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f111932d.hashCode();
    }

    @Override // p000.AbstractC38616bZ1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC48175re6<E> iterator() {
        return C52933zg2.m580r(this.f111932d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f111932d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
