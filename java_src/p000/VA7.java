package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: VA7 */
/* loaded from: classes5.dex */
public final class VA7 extends AbstractC34869Nx7 {

    /* renamed from: d */
    public final transient AbstractC37434Yw7 f38710d;

    /* renamed from: e */
    public final transient Object[] f38711e;

    /* renamed from: f */
    public final transient int f38712f;

    public VA7(AbstractC37434Yw7 abstractC37434Yw7, Object[] objArr, int i, int i2) {
        this.f38710d = abstractC37434Yw7;
        this.f38711e = objArr;
        this.f38712f = i2;
    }

    @Override // p000.AbstractC48306rr7
    /* renamed from: a */
    public final int mo14906a(Object[] objArr, int i) {
        return m93164h().mo14906a(objArr, 0);
    }

    @Override // p000.AbstractC48306rr7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f38710d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC34869Nx7, p000.AbstractC48306rr7
    /* renamed from: e */
    public final AbstractC42026hG7 mo15154e() {
        return m93164h().listIterator(0);
    }

    @Override // p000.AbstractC34869Nx7, p000.AbstractC48306rr7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return m93164h().listIterator(0);
    }

    @Override // p000.AbstractC34869Nx7
    /* renamed from: j */
    public final AbstractC32268Cu7 mo80262j() {
        return new C42565iA7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f38712f;
    }
}
