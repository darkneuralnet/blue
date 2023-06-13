package p000;

import java.util.AbstractMap;
/* renamed from: iA7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42565iA7 extends AbstractC32268Cu7 {

    /* renamed from: d */
    public final /* synthetic */ VA7 f86831d;

    public C42565iA7(VA7 va7) {
        this.f86831d = va7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f86831d.f38712f;
        C49421tk7.m11818a(i, i2, "index");
        VA7 va7 = this.f86831d;
        objArr = va7.f38711e;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = va7.f38711e;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f86831d.f38712f;
        return i;
    }
}
