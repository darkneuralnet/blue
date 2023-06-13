package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: Vk3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36620Vk3 implements InterfaceC48812sj1<C36386Uk3> {

    /* renamed from: a */
    public final Y94<InterfaceC36187To2> f39683a;

    /* renamed from: b */
    public final Y94<BaseActivity> f39684b;

    /* renamed from: c */
    public final Y94<C4176Jf> f39685c;

    /* renamed from: d */
    public final Y94<C12470bg> f39686d;

    /* renamed from: e */
    public final Y94<C32258Ct6> f39687e;

    public C36620Vk3(Y94<InterfaceC36187To2> y94, Y94<BaseActivity> y942, Y94<C4176Jf> y943, Y94<C12470bg> y944, Y94<C32258Ct6> y945) {
        this.f39683a = y94;
        this.f39684b = y942;
        this.f39685c = y943;
        this.f39686d = y944;
        this.f39687e = y945;
    }

    /* renamed from: a */
    public static C36620Vk3 m79485a(Y94<InterfaceC36187To2> y94, Y94<BaseActivity> y942, Y94<C4176Jf> y943, Y94<C12470bg> y944, Y94<C32258Ct6> y945) {
        return new C36620Vk3(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C36386Uk3 m79483c(InterfaceC36187To2 interfaceC36187To2, BaseActivity baseActivity, C4176Jf c4176Jf, C12470bg c12470bg, C32258Ct6 c32258Ct6) {
        return new C36386Uk3(interfaceC36187To2, baseActivity, c4176Jf, c12470bg, c32258Ct6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36386Uk3 get() {
        return m79483c(this.f39683a.get(), this.f39684b.get(), this.f39685c.get(), this.f39686d.get(), this.f39687e.get());
    }
}
