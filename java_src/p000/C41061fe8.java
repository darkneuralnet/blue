package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: fe8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41061fe8 extends C28<String> implements RandomAccess, InterfaceC45222mf8 {

    /* renamed from: d */
    public static final C41061fe8 f80400d;

    /* renamed from: e */
    public static final InterfaceC45222mf8 f80401e;

    /* renamed from: c */
    public final List<Object> f80402c;

    static {
        C41061fe8 c41061fe8 = new C41061fe8(10);
        f80400d = c41061fe8;
        c41061fe8.zzb();
        f80401e = c41061fe8;
    }

    public C41061fe8() {
        this(10);
    }

    /* renamed from: c */
    public static String m41069c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC50836w78) {
            return ((AbstractC50836w78) obj).m7375w(C41051fd8.f80380a);
        }
        return C41051fd8.m41087h((byte[]) obj);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m112947a();
        this.f80402c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m112947a();
        if (collection instanceof InterfaceC45222mf8) {
            collection = ((InterfaceC45222mf8) collection).zzg();
        }
        boolean addAll = this.f80402c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.f80402c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC50836w78) {
            AbstractC50836w78 abstractC50836w78 = (AbstractC50836w78) obj;
            String m7375w = abstractC50836w78.m7375w(C41051fd8.f80380a);
            if (abstractC50836w78.mo7380j()) {
                this.f80402c.set(i, m7375w);
            }
            return m7375w;
        }
        byte[] bArr = (byte[]) obj;
        String m41087h = C41051fd8.m41087h(bArr);
        if (C41051fd8.m41086i(bArr)) {
            this.f80402c.set(i, m41087h);
        }
        return m41087h;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m112947a();
        this.f80402c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC35383Qc8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC35383Qc8 mo41068d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f80402c);
            return new C41061fe8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m112947a();
        Object remove = this.f80402c.remove(i);
        ((AbstractList) this).modCount++;
        return m41069c(remove);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m112947a();
        return m41069c(this.f80402c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80402c.size();
    }

    @Override // p000.InterfaceC45222mf8
    public final InterfaceC45222mf8 zze() {
        if (zzc()) {
            return new C34816Nr8(this);
        }
        return this;
    }

    @Override // p000.InterfaceC45222mf8
    public final List<?> zzg() {
        return Collections.unmodifiableList(this.f80402c);
    }

    public C41061fe8(int i) {
        this.f80402c = new ArrayList(i);
    }

    public C41061fe8(ArrayList<Object> arrayList) {
        this.f80402c = arrayList;
    }

    @Override // p000.C28, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
