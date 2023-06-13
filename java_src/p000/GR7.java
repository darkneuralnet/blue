package p000;

import java.util.AbstractMap;
/* renamed from: GR7 */
/* loaded from: classes5.dex */
public final class GR7 extends HL7 {

    /* renamed from: d */
    public final /* synthetic */ WR7 f11936d;

    public GR7(WR7 wr7) {
        this.f11936d = wr7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f11936d.f41024f;
        C50566vg7.m8263a(i, i2, "index");
        WR7 wr7 = this.f11936d;
        int i3 = i + i;
        objArr = wr7.f41023e;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = wr7.f41023e;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f11936d.f41024f;
        return i;
    }
}
