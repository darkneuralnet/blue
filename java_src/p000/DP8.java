package p000;

import java.util.List;
/* renamed from: DP8 */
/* loaded from: classes6.dex */
public final class DP8<E> extends ZP8<E> {

    /* renamed from: d */
    public final transient ZP8<E> f5645d;

    public DP8(ZP8<E> zp8) {
        this.f5645d = zp8;
    }

    /* renamed from: D */
    public final int m110498D(int i) {
        return (this.f5645d.size() - 1) - i;
    }

    @Override // p000.ZP8, p000.XO8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5645d.contains(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        C52142yK8.m3664a(i, this.f5645d.size(), "index");
        return this.f5645d.get(m110498D(i));
    }

    @Override // p000.XO8
    /* renamed from: h */
    public final boolean mo6791h() {
        return this.f5645d.mo6791h();
    }

    @Override // p000.ZP8, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f5645d.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return m110498D(lastIndexOf);
        }
        return -1;
    }

    @Override // p000.ZP8, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f5645d.indexOf(obj);
        if (indexOf >= 0) {
            return m110498D(indexOf);
        }
        return -1;
    }

    @Override // p000.ZP8
    /* renamed from: o */
    public final ZP8<E> mo73204o() {
        return this.f5645d;
    }

    @Override // p000.ZP8
    /* renamed from: s */
    public final ZP8<E> mo73203s(int i, int i2) {
        C52142yK8.m3657h(i, i2, this.f5645d.size());
        ZP8<E> zp8 = this.f5645d;
        return zp8.subList(zp8.size() - i2, this.f5645d.size() - i).mo73204o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5645d.size();
    }

    @Override // p000.ZP8, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
