package p000;

import java.util.Iterator;
import java.util.Map;
/* renamed from: VM7 */
/* loaded from: classes5.dex */
public final class VM7 extends ZL7 {

    /* renamed from: d */
    public final transient IL7 f38909d;

    /* renamed from: e */
    public final transient Object[] f38910e;

    /* renamed from: f */
    public final transient int f38911f;

    public VM7(IL7 il7, Object[] objArr, int i, int i2) {
        this.f38909d = il7;
        this.f38910e = objArr;
        this.f38911f = i2;
    }

    @Override // p000.OI7
    /* renamed from: a */
    public final int mo19398a(Object[] objArr, int i) {
        return m73249h().mo19398a(objArr, 0);
    }

    @Override // p000.OI7, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f38909d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ZL7, p000.OI7
    /* renamed from: e */
    public final AbstractC49806uO7 mo23923e() {
        return m73249h().listIterator(0);
    }

    @Override // p000.ZL7, p000.OI7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return m73249h().listIterator(0);
    }

    @Override // p000.ZL7
    /* renamed from: j */
    public final AbstractC40292eL7 mo73248j() {
        return new GM7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f38911f;
    }
}
