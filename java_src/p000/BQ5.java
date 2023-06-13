package p000;

import android.content.DialogInterface;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.adapter.ViewHolderSupplier;
/* renamed from: BQ5 */
/* loaded from: classes4.dex */
public final class BQ5 implements InterfaceC48812sj1<AQ5> {

    /* renamed from: a */
    public final Y94<BaseActivity> f2306a;

    /* renamed from: b */
    public final Y94<ViewHolderSupplier<AbstractC40357eT0>> f2307b;

    /* renamed from: c */
    public final Y94<G31> f2308c;

    /* renamed from: d */
    public final Y94<DialogInterface> f2309d;

    public BQ5(Y94<BaseActivity> y94, Y94<ViewHolderSupplier<AbstractC40357eT0>> y942, Y94<G31> y943, Y94<DialogInterface> y944) {
        this.f2306a = y94;
        this.f2307b = y942;
        this.f2308c = y943;
        this.f2309d = y944;
    }

    /* renamed from: a */
    public static BQ5 m114043a(Y94<BaseActivity> y94, Y94<ViewHolderSupplier<AbstractC40357eT0>> y942, Y94<G31> y943, Y94<DialogInterface> y944) {
        return new BQ5(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static AQ5 m114041c(BaseActivity baseActivity, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier, G31 g31, DialogInterface dialogInterface) {
        return new AQ5(baseActivity, viewHolderSupplier, g31, dialogInterface);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AQ5 get() {
        return m114041c(this.f2306a.get(), this.f2307b.get(), this.f2308c.get(), this.f2309d.get());
    }
}
