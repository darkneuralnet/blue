package co.bird.android.vehiclescanner.servicecenter.scan;

import co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity;
/* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.b */
/* loaded from: classes4.dex */
public final class C16457b implements InterfaceC48812sj1<InterfaceC45852nj5> {

    /* renamed from: a */
    public final ScanCodeActivity.C16444c f67126a;

    /* renamed from: b */
    public final Y94<C34039Kj5> f67127b;

    /* renamed from: c */
    public final Y94<C42622iH1> f67128c;

    public C16457b(ScanCodeActivity.C16444c c16444c, Y94<C34039Kj5> y94, Y94<C42622iH1> y942) {
        this.f67126a = c16444c;
        this.f67127b = y94;
        this.f67128c = y942;
    }

    /* renamed from: a */
    public static C16457b m54786a(ScanCodeActivity.C16444c c16444c, Y94<C34039Kj5> y94, Y94<C42622iH1> y942) {
        return new C16457b(c16444c, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC45852nj5 m54784c(ScanCodeActivity.C16444c c16444c, C34039Kj5 c34039Kj5, C42622iH1 c42622iH1) {
        return (InterfaceC45852nj5) C51679xZ3.m5002e(c16444c.m54799a(c34039Kj5, c42622iH1));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC45852nj5 get() {
        return m54784c(this.f67126a, this.f67127b.get(), this.f67128c.get());
    }
}
