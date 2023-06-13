package p000;

import co.bird.android.core.mvp.BaseActivity;
/* renamed from: np0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45907np0 implements InterfaceC48812sj1<C45314mp0> {

    /* renamed from: a */
    public final Y94<BaseActivity> f100880a;

    /* renamed from: b */
    public final Y94<C4490KZ> f100881b;

    public C45907np0(Y94<BaseActivity> y94, Y94<C4490KZ> y942) {
        this.f100880a = y94;
        this.f100881b = y942;
    }

    /* renamed from: a */
    public static C45907np0 m22339a(Y94<BaseActivity> y94, Y94<C4490KZ> y942) {
        return new C45907np0(y94, y942);
    }

    /* renamed from: c */
    public static C45314mp0 m22337c(BaseActivity baseActivity, C4490KZ c4490kz) {
        return new C45314mp0(baseActivity, c4490kz);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45314mp0 get() {
        return m22337c(this.f100880a.get(), this.f100881b.get());
    }
}
