package p000;

import java.util.AbstractMap;
import java.util.Map;
/* renamed from: QR8 */
/* loaded from: classes6.dex */
public final class QR8 extends ZP8<Map.Entry> {

    /* renamed from: d */
    public final /* synthetic */ C38560bS8 f30378d;

    public QR8(C38560bS8 c38560bS8) {
        this.f30378d = c38560bS8;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f30378d.f57514f;
        C52142yK8.m3664a(i, i2, "index");
        objArr = this.f30378d.f57513e;
        int i3 = i + i;
        Object obj = objArr[i3];
        objArr2 = this.f30378d.f57513e;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }

    @Override // p000.XO8
    /* renamed from: h */
    public final boolean mo6791h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f30378d.f57514f;
        return i;
    }
}
