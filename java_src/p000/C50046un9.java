package p000;

import java.util.AbstractList;
import java.util.List;
/* renamed from: un9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50046un9<F, T> extends AbstractList<T> {

    /* renamed from: b */
    public final List<F> f112999b;

    /* renamed from: c */
    public final InterfaceC46489on9<F, T> f113000c;

    public C50046un9(List<F> list, InterfaceC46489on9<F, T> interfaceC46489on9) {
        this.f112999b = list;
        this.f113000c = interfaceC46489on9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.f113000c.zza(this.f112999b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f112999b.size();
    }
}
