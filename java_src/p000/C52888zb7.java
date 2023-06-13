package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: zb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52888zb7 extends AbstractC41613ga7 implements RandomAccess, InterfaceC31629Ab7 {

    /* renamed from: d */
    public static final C52888zb7 f121595d;
    @Deprecated

    /* renamed from: e */
    public static final InterfaceC31629Ab7 f121596e;

    /* renamed from: c */
    public final List f121597c;

    static {
        C52888zb7 c52888zb7 = new C52888zb7(false);
        f121595d = c52888zb7;
        f121596e = c52888zb7;
    }

    public C52888zb7() {
        this(10);
    }

    /* renamed from: c */
    public static String m1045c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC32088Ca7) {
            return ((AbstractC32088Ca7) obj).m112095w(C46960pb7.f103840b);
        }
        return C46960pb7.m19078d((byte[]) obj);
    }

    @Override // p000.InterfaceC31629Ab7
    /* renamed from: B */
    public final InterfaceC31629Ab7 mo1048B() {
        return zbc() ? new C33042Gc7(this) : this;
    }

    @Override // p000.InterfaceC31629Ab7
    /* renamed from: R0 */
    public final List mo1047R0() {
        return Collections.unmodifiableList(this.f121597c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m39112a();
        this.f121597c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m39112a();
        if (collection instanceof InterfaceC31629Ab7) {
            collection = ((InterfaceC31629Ab7) collection).mo1047R0();
        }
        boolean addAll = this.f121597c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.f121597c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC32088Ca7) {
            AbstractC32088Ca7 abstractC32088Ca7 = (AbstractC32088Ca7) obj;
            String m112095w = abstractC32088Ca7.m112095w(C46960pb7.f103840b);
            if (abstractC32088Ca7.mo1067o()) {
                this.f121597c.set(i, m112095w);
            }
            return m112095w;
        }
        byte[] bArr = (byte[]) obj;
        String m19078d = C46960pb7.m19078d(bArr);
        if (C35382Qc7.m88315d(bArr)) {
            this.f121597c.set(i, m19078d);
        }
        return m19078d;
    }

    @Override // p000.InterfaceC31629Ab7
    /* renamed from: c1 */
    public final Object mo1044c1(int i) {
        return this.f121597c.get(i);
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m39112a();
        this.f121597c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC46367ob7
    /* renamed from: r0 */
    public final /* bridge */ /* synthetic */ InterfaceC46367ob7 mo1043r0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f121597c);
            return new C52888zb7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m39112a();
        Object remove = this.f121597c.remove(i);
        ((AbstractList) this).modCount++;
        return m1045c(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m39112a();
        return m1045c(this.f121597c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f121597c.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52888zb7(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.f121597c = arrayList;
    }

    public C52888zb7(ArrayList arrayList) {
        super(true);
        this.f121597c = arrayList;
    }

    public C52888zb7(boolean z) {
        super(false);
        this.f121597c = Collections.emptyList();
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
