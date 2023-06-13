package p000;

import co.bird.android.persistence.area.impl.AreaDatabase;
/* renamed from: wj */
/* loaded from: classes4.dex */
public final class C29945wj implements InterfaceC48812sj1<AbstractC9490Xm> {

    /* renamed from: a */
    public final C22711hj f116391a;

    /* renamed from: b */
    public final Y94<AreaDatabase> f116392b;

    public C29945wj(C22711hj c22711hj, Y94<AreaDatabase> y94) {
        this.f116391a = c22711hj;
        this.f116392b = y94;
    }

    /* renamed from: a */
    public static C29945wj m6448a(C22711hj c22711hj, Y94<AreaDatabase> y94) {
        return new C29945wj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC9490Xm m6446c(C22711hj c22711hj, AreaDatabase areaDatabase) {
        return (AbstractC9490Xm) C51679xZ3.m5002e(c22711hj.m35979o(areaDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC9490Xm get() {
        return m6446c(this.f116391a, this.f116392b.get());
    }
}
