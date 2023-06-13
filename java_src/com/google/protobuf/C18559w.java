package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.w */
/* loaded from: classes6.dex */
public class C18559w extends AbstractC18502c<String> implements InterfaceC35017Oo2, RandomAccess {

    /* renamed from: d */
    public static final C18559w f74886d;

    /* renamed from: e */
    public static final InterfaceC35017Oo2 f74887e;

    /* renamed from: c */
    public final List<Object> f74888c;

    static {
        C18559w c18559w = new C18559w();
        f74886d = c18559w;
        c18559w.mo45989r();
        f74887e = c18559w;
    }

    public C18559w() {
        this(10);
    }

    /* renamed from: c */
    public static String m45979c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC18504e) {
            return ((AbstractC18504e) obj).m46305F();
        }
        return C18544t.m45991j((byte[]) obj);
    }

    @Override // p000.InterfaceC35017Oo2
    /* renamed from: P */
    public void mo13910P(AbstractC18504e abstractC18504e) {
        m46321a();
        this.f74888c.add(abstractC18504e);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, String str) {
        m46321a();
        this.f74888c.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m46321a();
        this.f74888c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public String get(int i) {
        Object obj = this.f74888c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC18504e) {
            AbstractC18504e abstractC18504e = (AbstractC18504e) obj;
            String m46305F = abstractC18504e.m46305F();
            if (abstractC18504e.mo46282s()) {
                this.f74888c.set(i, m46305F);
            }
            return m46305F;
        }
        byte[] bArr = (byte[]) obj;
        String m45991j = C18544t.m45991j(bArr);
        if (C18544t.m45994g(bArr)) {
            this.f74888c.set(i, m45991j);
        }
        return m45991j;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18553i
    /* renamed from: f */
    public C18559w mo45959k(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f74888c);
            return new C18559w(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.InterfaceC35017Oo2
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f74888c);
    }

    @Override // p000.InterfaceC35017Oo2
    public InterfaceC35017Oo2 getUnmodifiableView() {
        if (mo45974t()) {
            return new C48767se6(this);
        }
        return this;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public String remove(int i) {
        m46321a();
        Object remove = this.f74888c.remove(i);
        ((AbstractList) this).modCount++;
        return m45979c(remove);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: j */
    public String set(int i, String str) {
        m46321a();
        return m45979c(this.f74888c.set(i, str));
    }

    @Override // p000.InterfaceC35017Oo2
    /* renamed from: l */
    public Object mo13907l(int i) {
        return this.f74888c.get(i);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74888c.size();
    }

    @Override // com.google.protobuf.AbstractC18502c, com.google.protobuf.C18544t.InterfaceC18553i
    /* renamed from: t */
    public /* bridge */ /* synthetic */ boolean mo45974t() {
        return super.mo45974t();
    }

    public C18559w(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        m46321a();
        if (collection instanceof InterfaceC35017Oo2) {
            collection = ((InterfaceC35017Oo2) collection).getUnderlyingElements();
        }
        boolean addAll = this.f74888c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C18559w(ArrayList<Object> arrayList) {
        this.f74888c = arrayList;
    }
}
