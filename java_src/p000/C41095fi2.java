package p000;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: fi2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41095fi2 extends AbstractC52360yi2 implements Iterable<AbstractC52360yi2> {

    /* renamed from: b */
    public final ArrayList<AbstractC52360yi2> f80476b = new ArrayList<>();

    @Override // p000.AbstractC52360yi2
    /* renamed from: a */
    public boolean mo2888a() {
        return m41010z().mo2888a();
    }

    @Override // p000.AbstractC52360yi2
    /* renamed from: b */
    public double mo2887b() {
        return m41010z().mo2887b();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C41095fi2) && ((C41095fi2) obj).f80476b.equals(this.f80476b));
    }

    @Override // p000.AbstractC52360yi2
    /* renamed from: h */
    public long mo2883h() {
        return m41010z().mo2883h();
    }

    public int hashCode() {
        return this.f80476b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC52360yi2> iterator() {
        return this.f80476b.iterator();
    }

    @Override // p000.AbstractC52360yi2
    /* renamed from: j */
    public String mo2882j() {
        return m41010z().mo2882j();
    }

    public int size() {
        return this.f80476b.size();
    }

    /* renamed from: w */
    public void m41013w(AbstractC52360yi2 abstractC52360yi2) {
        if (abstractC52360yi2 == null) {
            abstractC52360yi2 = C35431Qi2.f30779b;
        }
        this.f80476b.add(abstractC52360yi2);
    }

    /* renamed from: x */
    public void m41012x(Number number) {
        this.f80476b.add(number == null ? C35431Qi2.f30779b : new C37537Zi2(number));
    }

    /* renamed from: y */
    public AbstractC52360yi2 m41011y(int i) {
        return this.f80476b.get(i);
    }

    /* renamed from: z */
    public final AbstractC52360yi2 m41010z() {
        int size = this.f80476b.size();
        if (size == 1) {
            return this.f80476b.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }
}
