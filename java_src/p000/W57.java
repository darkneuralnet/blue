package p000;

import java.util.List;
/* renamed from: W57 */
/* loaded from: classes5.dex */
public final class W57 extends X57 {

    /* renamed from: d */
    public final transient int f40402d;

    /* renamed from: e */
    public final transient int f40403e;

    /* renamed from: f */
    public final /* synthetic */ X57 f40404f;

    public W57(X57 x57, int i, int i2) {
        this.f40404f = x57;
        this.f40402d = i;
        this.f40403e = i2;
    }

    @Override // p000.T57
    /* renamed from: b */
    public final int mo36845b() {
        return this.f40404f.mo36844c() + this.f40402d + this.f40403e;
    }

    @Override // p000.T57
    /* renamed from: c */
    public final int mo36844c() {
        return this.f40404f.mo36844c() + this.f40402d;
    }

    @Override // p000.T57
    /* renamed from: f */
    public final Object[] mo36843f() {
        return this.f40404f.mo36843f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        J57.m101169a(i, this.f40403e, "index");
        return this.f40404f.get(i + this.f40402d);
    }

    @Override // p000.X57
    /* renamed from: h */
    public final X57 mo77411h(int i, int i2) {
        J57.m101166d(i, i2, this.f40403e);
        X57 x57 = this.f40404f;
        int i3 = this.f40402d;
        return x57.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40403e;
    }

    @Override // p000.X57, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
