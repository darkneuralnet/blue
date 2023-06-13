package p000;

import java.util.AbstractMap;
/* renamed from: CK7 */
/* loaded from: classes5.dex */
public final class CK7 extends AbstractC38851bw7 {

    /* renamed from: d */
    public final /* synthetic */ RK7 f3956d;

    public CK7(RK7 rk7) {
        this.f3956d = rk7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f3956d.f31906f;
        C41211ft8.m40589a(i, i2, "index");
        RK7 rk7 = this.f3956d;
        int i3 = i + i;
        objArr = rk7.f31905e;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = rk7.f31905e;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f3956d.f31906f;
        return i;
    }
}
