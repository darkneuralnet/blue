package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: bN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38514bN7 extends Bh9<String> implements KM7, RandomAccess {

    /* renamed from: d */
    public static final C38514bN7 f57366d;

    /* renamed from: e */
    public static final KM7 f57367e;

    /* renamed from: c */
    public final List<Object> f57368c;

    static {
        C38514bN7 c38514bN7 = new C38514bN7();
        f57366d = c38514bN7;
        c38514bN7.mo113666q();
        f57367e = c38514bN7;
    }

    public C38514bN7() {
        this(10);
    }

    /* renamed from: b */
    public static String m64610b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC43604jv9) {
            return ((AbstractC43604jv9) obj).m29753b();
        }
        return C44389lF7.m27612h((byte[]) obj);
    }

    @Override // p000.KM7
    /* renamed from: O1 */
    public final Object mo64612O1(int i) {
        return this.f57368c.get(i);
    }

    @Override // p000.KM7
    /* renamed from: W */
    public final List<?> mo64611W() {
        return Collections.unmodifiableList(this.f57368c);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m113667a();
        this.f57368c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m113667a();
        this.f57368c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f57368c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC43604jv9) {
            AbstractC43604jv9 abstractC43604jv9 = (AbstractC43604jv9) obj;
            String m29753b = abstractC43604jv9.m29753b();
            if (abstractC43604jv9.mo29752c()) {
                this.f57368c.set(i, m29753b);
            }
            return m29753b;
        }
        byte[] bArr = (byte[]) obj;
        String m27612h = C44389lF7.m27612h(bArr);
        if (C44389lF7.m27613g(bArr)) {
            this.f57368c.set(i, m27612h);
        }
        return m27612h;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.KM7
    /* renamed from: m */
    public final KM7 mo64609m() {
        if (mo64608v1()) {
            return new X38(this);
        }
        return this;
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        m113667a();
        return m64610b(this.f57368c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f57368c.size();
    }

    @Override // p000.Bh9, p000.BI7
    /* renamed from: v1 */
    public final /* bridge */ /* synthetic */ boolean mo64608v1() {
        return super.mo64608v1();
    }

    @Override // p000.BI7
    public final /* synthetic */ BI7 zzh(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f57368c);
            return new C38514bN7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public C38514bN7(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m113667a();
        if (collection instanceof KM7) {
            collection = ((KM7) collection).mo64611W();
        }
        boolean addAll = this.f57368c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m113667a();
        Object remove = this.f57368c.remove(i);
        ((AbstractList) this).modCount++;
        return m64610b(remove);
    }

    public C38514bN7(ArrayList<Object> arrayList) {
        this.f57368c = arrayList;
    }
}
