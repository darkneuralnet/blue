package p000;

import java.util.List;
import java.util.ListIterator;
/* renamed from: BE7 */
/* loaded from: classes5.dex */
public final class BE7 extends YC7 implements ListIterator {

    /* renamed from: e */
    public final /* synthetic */ C49132tF7 f2117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BE7(C49132tF7 c49132tF7) {
        super(c49132tF7);
        this.f2117e = c49132tF7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.f2117e.isEmpty();
        m75417a();
        ((ListIterator) this.f44837b).add(obj);
        AbstractC42619iG7 abstractC42619iG7 = this.f2117e.f110230g;
        i = abstractC42619iG7.f87049e;
        abstractC42619iG7.f87049e = i + 1;
        if (isEmpty) {
            this.f2117e.m94171a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m75417a();
        return ((ListIterator) this.f44837b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m75417a();
        return ((ListIterator) this.f44837b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m75417a();
        return ((ListIterator) this.f44837b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m75417a();
        return ((ListIterator) this.f44837b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m75417a();
        ((ListIterator) this.f44837b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BE7(C49132tF7 c49132tF7, int i) {
        super(c49132tF7, ((List) c49132tF7.f24308c).listIterator(i));
        this.f2117e = c49132tF7;
    }
}
