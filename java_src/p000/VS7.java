package p000;

import java.util.AbstractMap;
/* renamed from: VS7 */
/* loaded from: classes5.dex */
public final class VS7 extends AbstractC51557xL7 {

    /* renamed from: d */
    public final /* synthetic */ C43922kT7 f39115d;

    public VS7(C43922kT7 c43922kT7) {
        this.f39115d = c43922kT7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f39115d.f94426f;
        C31899Bf7.m113729a(i, i2, "index");
        C43922kT7 c43922kT7 = this.f39115d;
        objArr = c43922kT7.f94425e;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = c43922kT7.f94425e;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f39115d.f94426f;
        return i;
    }
}
