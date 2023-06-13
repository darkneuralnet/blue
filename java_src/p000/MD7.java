package p000;
/* renamed from: MD7 */
/* loaded from: classes5.dex */
public final class MD7 extends AbstractC32268Cu7 {

    /* renamed from: d */
    public final transient Object[] f22887d;

    /* renamed from: e */
    public final transient int f22888e;

    /* renamed from: f */
    public final transient int f22889f;

    public MD7(Object[] objArr, int i, int i2) {
        this.f22887d = objArr;
        this.f22888e = i;
        this.f22889f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C49421tk7.m11818a(i, this.f22889f, "index");
        Object obj = this.f22887d[i + i + this.f22888e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22889f;
    }
}
