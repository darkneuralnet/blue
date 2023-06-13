package p000;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* renamed from: xO7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51584xO7 extends AbstractSequentialList implements Serializable {

    /* renamed from: b */
    public final List f117549b;

    /* renamed from: c */
    public final InterfaceC42388hs9 f117550c;

    public C51584xO7(List list, InterfaceC42388hs9 interfaceC42388hs9) {
        list.getClass();
        this.f117549b = list;
        interfaceC42388hs9.getClass();
        this.f117550c = interfaceC42388hs9;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f117549b.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new VN7(this, this.f117549b.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f117549b.size();
    }
}
