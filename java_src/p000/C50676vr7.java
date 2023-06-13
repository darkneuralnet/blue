package p000;

import java.util.List;
import java.util.ListIterator;
/* renamed from: vr7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50676vr7 extends C34095Kp7 implements ListIterator {

    /* renamed from: e */
    public final /* synthetic */ C44165ks7 f114802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50676vr7(C44165ks7 c44165ks7) {
        super(c44165ks7);
        this.f114802e = c44165ks7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f114802e.isEmpty();
        m98260a();
        ((ListIterator) this.f20264b).add(obj);
        AbstractC38821bt7.m62193f(this.f114802e.f95147g);
        if (isEmpty) {
            this.f114802e.m108328a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m98260a();
        return ((ListIterator) this.f20264b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m98260a();
        return ((ListIterator) this.f20264b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m98260a();
        return ((ListIterator) this.f20264b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m98260a();
        return ((ListIterator) this.f20264b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m98260a();
        ((ListIterator) this.f20264b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50676vr7(C44165ks7 c44165ks7, int i) {
        super(c44165ks7, ((List) c44165ks7.f8186c).listIterator(i));
        this.f114802e = c44165ks7;
    }
}
