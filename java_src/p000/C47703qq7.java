package p000;

import java.util.List;
import java.util.ListIterator;
/* renamed from: qq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47703qq7 extends C32916Fo7 implements ListIterator {

    /* renamed from: e */
    public final /* synthetic */ C43562jr7 f105913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47703qq7(C43562jr7 c43562jr7) {
        super(c43562jr7);
        this.f105913e = c43562jr7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.f105913e.isEmpty();
        m106440a();
        ((ListIterator) this.f10262b).add(obj);
        AbstractC37389Yr7 abstractC37389Yr7 = this.f105913e.f93463g;
        i = abstractC37389Yr7.f47501e;
        abstractC37389Yr7.f47501e = i + 1;
        if (isEmpty) {
            this.f105913e.m4585a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m106440a();
        return ((ListIterator) this.f10262b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m106440a();
        return ((ListIterator) this.f10262b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m106440a();
        return ((ListIterator) this.f10262b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m106440a();
        return ((ListIterator) this.f10262b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m106440a();
        ((ListIterator) this.f10262b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47703qq7(C43562jr7 c43562jr7, int i) {
        super(c43562jr7, ((List) c43562jr7.f118196c).listIterator(i));
        this.f105913e = c43562jr7;
    }
}
