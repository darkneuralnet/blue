package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: IW7 */
/* loaded from: classes5.dex */
public final class IW7 extends AbstractC36507Ux7<String> implements WW7, RandomAccess {

    /* renamed from: d */
    public static final IW7 f15855d;

    /* renamed from: e */
    public static final WW7 f15856e;

    /* renamed from: c */
    public final List<Object> f15857c;

    static {
        IW7 iw7 = new IW7();
        f15855d = iw7;
        iw7.zzv();
        f15856e = iw7;
    }

    public IW7() {
        this(10);
    }

    /* renamed from: b */
    public static String m101947b(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof TD7 ? ((TD7) obj).m84178v() : C37975aT7.m71325h((byte[]) obj);
    }

    @Override // p000.WW7
    /* renamed from: N2 */
    public final List<?> mo43925N2() {
        return Collections.unmodifiableList(this.f15857c);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m80580a();
        this.f15857c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m80580a();
        if (collection instanceof WW7) {
            collection = ((WW7) collection).mo43925N2();
        }
        boolean addAll = this.f15857c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m80580a();
        this.f15857c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f15857c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof TD7) {
            TD7 td7 = (TD7) obj;
            String m84178v = td7.m84178v();
            if (td7.mo8900v1()) {
                this.f15857c.set(i, m84178v);
            }
            return m84178v;
        }
        byte[] bArr = (byte[]) obj;
        String m71325h = C37975aT7.m71325h(bArr);
        if (C37975aT7.m71326g(bArr)) {
            this.f15857c.set(i, m71325h);
        }
        return m71325h;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC36507Ux7, p000.InterfaceC47489qU7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ boolean mo17485i() {
        return super.mo17485i();
    }

    @Override // p000.WW7
    /* renamed from: l */
    public final Object mo43923l(int i) {
        return this.f15857c.get(i);
    }

    @Override // p000.InterfaceC47489qU7
    /* renamed from: n */
    public final /* synthetic */ InterfaceC47489qU7 mo1502n(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f15857c);
            return new IW7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m80580a();
        Object remove = this.f15857c.remove(i);
        ((AbstractList) this).modCount++;
        return m101947b(remove);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // p000.WW7
    /* renamed from: s3 */
    public final WW7 mo43922s3() {
        return mo17485i() ? new C39886df8(this) : this;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        m80580a();
        return m101947b(this.f15857c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15857c.size();
    }

    public IW7(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public IW7(ArrayList<Object> arrayList) {
        this.f15857c = arrayList;
    }
}
