package p000;

import java.util.AbstractMap;
/* renamed from: VV7 */
/* loaded from: classes5.dex */
public final class VV7 extends DR7 {

    /* renamed from: d */
    public final /* synthetic */ C43356jW7 f39173d;

    public VV7(C43356jW7 c43356jW7) {
        this.f39173d = c43356jW7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f39173d.f92896f;
        C34833Nt7.m93213a(i, i2, "index");
        C43356jW7 c43356jW7 = this.f39173d;
        objArr = c43356jW7.f92895e;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = c43356jW7.f92895e;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f39173d.f92896f;
        return i;
    }
}
