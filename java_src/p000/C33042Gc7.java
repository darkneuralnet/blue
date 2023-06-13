package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
@Deprecated
/* renamed from: Gc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33042Gc7 extends AbstractList implements RandomAccess, InterfaceC31629Ab7 {

    /* renamed from: b */
    public final InterfaceC31629Ab7 f12165b;

    public C33042Gc7(InterfaceC31629Ab7 interfaceC31629Ab7) {
        this.f12165b = interfaceC31629Ab7;
    }

    @Override // p000.InterfaceC31629Ab7
    /* renamed from: B */
    public final InterfaceC31629Ab7 mo1048B() {
        return this;
    }

    @Override // p000.InterfaceC31629Ab7
    /* renamed from: R0 */
    public final List mo1047R0() {
        return this.f12165b.mo1047R0();
    }

    @Override // p000.InterfaceC31629Ab7
    /* renamed from: c1 */
    public final Object mo1044c1(int i) {
        return this.f12165b.mo1044c1(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C52888zb7) this.f12165b).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C32808Fc7(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C32574Ec7(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12165b.size();
    }
}
