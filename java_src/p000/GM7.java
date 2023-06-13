package p000;

import java.util.AbstractMap;
/* renamed from: GM7 */
/* loaded from: classes5.dex */
public final class GM7 extends AbstractC40292eL7 {

    /* renamed from: d */
    public final /* synthetic */ VM7 f11804d;

    public GM7(VM7 vm7) {
        this.f11804d = vm7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f11804d.f38911f;
        C44937mA7.m26194a(i, i2, "index");
        VM7 vm7 = this.f11804d;
        int i3 = i + i;
        objArr = vm7.f38910e;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = vm7.f38910e;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f11804d.f38911f;
        return i;
    }
}
