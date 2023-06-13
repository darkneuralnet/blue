package p000;

import android.text.style.StyleSpan;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.CountdownView;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"LJD0;", "LID0;", "LxE;", "", "currency", "", "uc", "", "remainingSeconds", "Gj", "ii", "Lio/reactivex/Observable;", "Q", "couponTitle", "Ze", "LPq6;", "b", "LPq6;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LPq6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: JD0 */
/* loaded from: classes2.dex */
public final class JD0 extends AbstractC30071xE implements ID0 {

    /* renamed from: b */
    public final C35273Pq6 f17053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JD0(BaseActivity activity, C35273Pq6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f17053b = binding;
    }

    @Override // p000.ID0
    /* renamed from: Gj */
    public void mo100954Gj(int i) {
        CountdownView countdownView = this.f17053b.f29152c;
        Intrinsics.checkNotNullExpressionValue(countdownView, "binding.expirationCountDown");
        C49520tu6.m11233r(countdownView);
        this.f17053b.f29152c.m54602x();
        CountdownView countdownView2 = this.f17053b.f29152c;
        Intrinsics.checkNotNullExpressionValue(countdownView2, "binding.expirationCountDown");
        CountdownView.init$default(countdownView2, i, null, null, null, Integer.valueOf(C45871nl4.free_reserve_banner_offer_ends_in), new StyleSpan(1), null, Float.valueOf(16.0f), 78, null);
    }

    @Override // p000.ID0
    /* renamed from: Q */
    public Observable<Unit> mo100953Q() {
        ConstraintLayout root = this.f17053b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return C44626lf5.clicksThrottle$default(root, 0L, 1, null);
    }

    @Override // p000.ID0
    /* renamed from: Ze */
    public void mo100952Ze(String couponTitle) {
        Intrinsics.checkNotNullParameter(couponTitle, "couponTitle");
        this.f17053b.f29151b.setText(couponTitle);
    }

    @Override // p000.ID0
    /* renamed from: ii */
    public void mo100951ii() {
        this.f17053b.f29152c.m54602x();
        CountdownView countdownView = this.f17053b.f29152c;
        Intrinsics.checkNotNullExpressionValue(countdownView, "binding.expirationCountDown");
        C49520tu6.m11239l(countdownView);
    }

    @Override // p000.ID0
    /* renamed from: uc */
    public void mo100950uc(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f17053b.f29153d.setImageDrawable(C29611vi.m8248b(getActivity(), WE0.m78689b(currency)));
    }
}
