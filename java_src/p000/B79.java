package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
@Deprecated
/* renamed from: B79 */
/* loaded from: classes5.dex */
public final class B79 extends AbstractList implements RandomAccess, InterfaceC48702sX8 {

    /* renamed from: b */
    public final InterfaceC48702sX8 f1899b;

    public B79(InterfaceC48702sX8 interfaceC48702sX8) {
        this.f1899b = interfaceC48702sX8;
    }

    @Override // p000.InterfaceC48702sX8
    /* renamed from: I0 */
    public final void mo14059I0(AbstractC40913fO8 abstractC40913fO8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C42773iX8) this.f1899b).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C49652u79(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C44909m79(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1899b.size();
    }

    @Override // p000.InterfaceC48702sX8
    public final InterfaceC48702sX8 zze() {
        return this;
    }

    @Override // p000.InterfaceC48702sX8
    public final Object zzf(int i) {
        return this.f1899b.zzf(i);
    }

    @Override // p000.InterfaceC48702sX8
    public final List zzh() {
        return this.f1899b.zzh();
    }
}
