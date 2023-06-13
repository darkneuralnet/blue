package p000;

import java.util.List;
import java.util.ListIterator;
/* renamed from: Bq9 */
/* loaded from: classes5.dex */
public final class Bq9 extends C48840sl9 implements ListIterator {

    /* renamed from: e */
    public final /* synthetic */ C41795gs9 f2963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bq9(C41795gs9 c41795gs9) {
        super(c41795gs9);
        this.f2963e = c41795gs9;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f2963e.isEmpty();
        m13703a();
        ((ListIterator) this.f109224b).add(obj);
        Jt9.m99588f(this.f2963e.f84400g);
        if (isEmpty) {
            this.f2963e.m109899a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m13703a();
        return ((ListIterator) this.f109224b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m13703a();
        return ((ListIterator) this.f109224b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m13703a();
        return ((ListIterator) this.f109224b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m13703a();
        return ((ListIterator) this.f109224b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m13703a();
        ((ListIterator) this.f109224b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bq9(C41795gs9 c41795gs9, int i) {
        super(c41795gs9, ((List) c41795gs9.f6378c).listIterator(i));
        this.f2963e = c41795gs9;
    }
}
