package p000;

import android.content.Context;
/* renamed from: oy2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46592oy2 implements InterfaceC48812sj1<C45406my2> {

    /* renamed from: a */
    public final Y94<Context> f102838a;

    /* renamed from: b */
    public final Y94<InterfaceC22767hq> f102839b;

    /* renamed from: c */
    public final Y94<InterfaceC47153pv0> f102840c;

    /* renamed from: d */
    public final Y94<InterfaceC44647lh6> f102841d;

    /* renamed from: e */
    public final Y94<InterfaceC35660Rh6> f102842e;

    public C46592oy2(Y94<Context> y94, Y94<InterfaceC22767hq> y942, Y94<InterfaceC47153pv0> y943, Y94<InterfaceC44647lh6> y944, Y94<InterfaceC35660Rh6> y945) {
        this.f102838a = y94;
        this.f102839b = y942;
        this.f102840c = y943;
        this.f102841d = y944;
        this.f102842e = y945;
    }

    /* renamed from: a */
    public static C46592oy2 m20210a(Y94<Context> y94, Y94<InterfaceC22767hq> y942, Y94<InterfaceC47153pv0> y943, Y94<InterfaceC44647lh6> y944, Y94<InterfaceC35660Rh6> y945) {
        return new C46592oy2(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C45406my2 m20208c(Context context, InterfaceC22767hq interfaceC22767hq, InterfaceC47153pv0 interfaceC47153pv0, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new C45406my2(context, interfaceC22767hq, interfaceC47153pv0, interfaceC44647lh6, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45406my2 get() {
        return m20208c(this.f102838a.get(), this.f102839b.get(), this.f102840c.get(), this.f102841d.get(), this.f102842e.get());
    }
}
