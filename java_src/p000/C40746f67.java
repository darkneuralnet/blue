package p000;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* renamed from: f67  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40746f67 extends AbstractSequentialList implements Serializable {

    /* renamed from: b */
    public final List f79479b;

    /* renamed from: c */
    public final F57 f79480c;

    public C40746f67(List list, F57 f57) {
        list.getClass();
        this.f79479b = list;
        f57.getClass();
        this.f79480c = f57;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C40153e67(this, ((X57) this.f79479b).listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f79479b.size();
    }
}
