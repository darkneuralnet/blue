package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: kT7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43922kT7 extends AbstractC49195tM7 {

    /* renamed from: d */
    public final transient AbstractC39709dM7 f94424d;

    /* renamed from: e */
    public final transient Object[] f94425e;

    /* renamed from: f */
    public final transient int f94426f;

    public C43922kT7(AbstractC39709dM7 abstractC39709dM7, Object[] objArr, int i, int i2) {
        this.f94424d = abstractC39709dM7;
        this.f94425e = objArr;
        this.f94426f = i2;
    }

    @Override // p000.AbstractC47983rJ7
    /* renamed from: a */
    public final int mo5429a(Object[] objArr, int i) {
        return m12491h().mo5429a(objArr, 0);
    }

    @Override // p000.AbstractC47983rJ7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f94424d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC49195tM7, p000.AbstractC47983rJ7
    /* renamed from: e */
    public final AbstractC46312oV7 mo5428e() {
        return m12491h().listIterator(0);
    }

    @Override // p000.AbstractC49195tM7, p000.AbstractC47983rJ7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m12491h().listIterator(0);
    }

    @Override // p000.AbstractC49195tM7
    /* renamed from: j */
    public final AbstractC51557xL7 mo12490j() {
        return new VS7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f94426f;
    }
}
