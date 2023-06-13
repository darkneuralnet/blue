package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: Nr8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34816Nr8 extends AbstractList<String> implements RandomAccess, InterfaceC45222mf8 {

    /* renamed from: b */
    public final InterfaceC45222mf8 f25308b;

    public C34816Nr8(InterfaceC45222mf8 interfaceC45222mf8) {
        this.f25308b = interfaceC45222mf8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C41061fe8) this.f25308b).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C32008Br8(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C47121pr8(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25308b.size();
    }

    @Override // p000.InterfaceC45222mf8
    public final InterfaceC45222mf8 zze() {
        return this;
    }

    @Override // p000.InterfaceC45222mf8
    public final List<?> zzg() {
        return this.f25308b.zzg();
    }
}
