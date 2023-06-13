package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: ge4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41650ge4 implements InterfaceC48812sj1<C41057fe4> {

    /* renamed from: a */
    public final Y94<BaseActivity> f83973a;

    /* renamed from: b */
    public final Y94<InterfaceC42586iD1> f83974b;

    public C41650ge4(Y94<BaseActivity> y94, Y94<InterfaceC42586iD1> y942) {
        this.f83973a = y94;
        this.f83974b = y942;
    }

    /* renamed from: a */
    public static C41650ge4 m37940a(Y94<BaseActivity> y94, Y94<InterfaceC42586iD1> y942) {
        return new C41650ge4(y94, y942);
    }

    /* renamed from: c */
    public static C41057fe4 m37938c(BaseActivity baseActivity, InterfaceC42586iD1 interfaceC42586iD1) {
        return new C41057fe4(baseActivity, interfaceC42586iD1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41057fe4 get() {
        return m37938c(this.f83973a.get(), this.f83974b.get());
    }
}
