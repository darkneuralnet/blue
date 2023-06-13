package p000;

import java.util.AbstractMap;
/* renamed from: bW8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38596bW8 extends AbstractC50453vU8 {

    /* renamed from: d */
    public final /* synthetic */ C44543lW8 f57613d;

    public C38596bW8(C44543lW8 c44543lW8) {
        this.f57613d = c44543lW8;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f57613d.f96287f;
        DQ8.m110470a(i, i2, "index");
        C44543lW8 c44543lW8 = this.f57613d;
        int i3 = i + i;
        objArr = c44543lW8.f96286e;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = c44543lW8.f96286e;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f57613d.f96287f;
        return i;
    }
}
