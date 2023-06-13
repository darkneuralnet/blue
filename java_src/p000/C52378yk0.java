package p000;

import io.reactivex.Observable;
import p000.InterfaceC41706gk0;
/* renamed from: yk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52378yk0 implements InterfaceC49405tj1<Observable<Boolean>> {

    /* renamed from: a */
    public final Z94<Integer> f120084a;

    /* renamed from: b */
    public final Z94<C34153Kw2> f120085b;

    public C52378yk0(Z94<Integer> z94, Z94<C34153Kw2> z942) {
        this.f120084a = z94;
        this.f120085b = z942;
    }

    /* renamed from: a */
    public static C52378yk0 m2712a(Z94<Integer> z94, Z94<C34153Kw2> z942) {
        return new C52378yk0(z94, z942);
    }

    /* renamed from: c */
    public static Observable<Boolean> m2710c(int i, C34153Kw2 c34153Kw2) {
        return (Observable) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37843r(i, c34153Kw2));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public Observable<Boolean> get() {
        return m2710c(this.f120084a.get().intValue(), this.f120085b.get());
    }
}
