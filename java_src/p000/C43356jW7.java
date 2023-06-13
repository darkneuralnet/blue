package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: jW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43356jW7 extends AbstractC51027wS7 {

    /* renamed from: d */
    public final transient AbstractC42727iS7 f92894d;

    /* renamed from: e */
    public final transient Object[] f92895e;

    /* renamed from: f */
    public final transient int f92896f;

    public C43356jW7(AbstractC42727iS7 abstractC42727iS7, Object[] objArr, int i, int i2) {
        this.f92894d = abstractC42727iS7;
        this.f92895e = objArr;
        this.f92896f = i2;
    }

    @Override // p000.VO7
    /* renamed from: a */
    public final int mo6713a(Object[] objArr, int i) {
        return m6793h().mo6713a(objArr, i);
    }

    @Override // p000.VO7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f92894d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC51027wS7, p000.VO7
    /* renamed from: e */
    public final AbstractC41011fZ7 mo6712e() {
        return m6793h().listIterator(0);
    }

    @Override // p000.AbstractC51027wS7, p000.VO7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return m6793h().listIterator(0);
    }

    @Override // p000.AbstractC51027wS7
    /* renamed from: j */
    public final DR7 mo6792j() {
        return new VV7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f92896f;
    }
}
