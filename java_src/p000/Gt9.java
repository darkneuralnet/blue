package p000;

import java.util.AbstractMap;
/* renamed from: Gt9 */
/* loaded from: classes5.dex */
public final class Gt9 extends Ed9 {

    /* renamed from: d */
    public final /* synthetic */ C39454cv9 f12599d;

    public Gt9(C39454cv9 c39454cv9) {
        this.f12599d = c39454cv9;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f12599d.f75878f;
        C43433je8.m30137a(i, i2, "index");
        C39454cv9 c39454cv9 = this.f12599d;
        objArr = c39454cv9.f75877e;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = c39454cv9.f75877e;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f12599d.f75878f;
        return i;
    }
}
