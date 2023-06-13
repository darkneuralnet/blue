package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.y */
/* loaded from: classes6.dex */
public class C18253y extends AbstractC18191c<String> implements InterfaceC35251Po2, RandomAccess {

    /* renamed from: d */
    public static final C18253y f74231d;

    /* renamed from: e */
    public static final InterfaceC35251Po2 f74232e;

    /* renamed from: c */
    public final List<Object> f74233c;

    static {
        C18253y c18253y = new C18253y();
        f74231d = c18253y;
        c18253y.mo47412r();
        f74232e = c18253y;
    }

    public C18253y() {
        this(10);
    }

    /* renamed from: c */
    public static String m47402c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC18199g) {
            return ((AbstractC18199g) obj).m47706H();
        }
        return C18238v.m47414j((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, String str) {
        m47785a();
        this.f74233c.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m47785a();
        this.f74233c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public String get(int i) {
        Object obj = this.f74233c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC18199g) {
            AbstractC18199g abstractC18199g = (AbstractC18199g) obj;
            String m47706H = abstractC18199g.m47706H();
            if (abstractC18199g.mo47681u()) {
                this.f74233c.set(i, m47706H);
            }
            return m47706H;
        }
        byte[] bArr = (byte[]) obj;
        String m47414j = C18238v.m47414j(bArr);
        if (C18238v.m47417g(bArr)) {
            this.f74233c.set(i, m47414j);
        }
        return m47414j;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18247i
    /* renamed from: f */
    public C18253y mo47397k(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f74233c);
            return new C18253y(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.InterfaceC35251Po2
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f74233c);
    }

    @Override // p000.InterfaceC35251Po2
    public InterfaceC35251Po2 getUnmodifiableView() {
        if (mo47396t()) {
            return new C49360te6(this);
        }
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public String remove(int i) {
        m47785a();
        Object remove = this.f74233c.remove(i);
        ((AbstractList) this).modCount++;
        return m47402c(remove);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: j */
    public String set(int i, String str) {
        m47785a();
        return m47402c(this.f74233c.set(i, str));
    }

    @Override // p000.InterfaceC35251Po2
    /* renamed from: l */
    public Object mo11974l(int i) {
        return this.f74233c.get(i);
    }

    @Override // p000.InterfaceC35251Po2
    /* renamed from: q1 */
    public void mo11973q1(AbstractC18199g abstractC18199g) {
        m47785a();
        this.f74233c.add(abstractC18199g);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74233c.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18247i
    /* renamed from: t */
    public /* bridge */ /* synthetic */ boolean mo47396t() {
        return super.mo47396t();
    }

    public C18253y(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        m47785a();
        if (collection instanceof InterfaceC35251Po2) {
            collection = ((InterfaceC35251Po2) collection).getUnderlyingElements();
        }
        boolean addAll = this.f74233c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C18253y(ArrayList<Object> arrayList) {
        this.f74233c = arrayList;
    }
}
