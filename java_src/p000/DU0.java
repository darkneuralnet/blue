package p000;

import android.text.style.StyleSpan;
import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Deal;
import co.bird.android.model.DialogResponse;
import co.bird.android.widget.CountdownView;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\tH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LDU0;", "LxE;", "LCU0;", "Lco/bird/android/model/Deal;", "deal", "", "Dk", "Lio/reactivex/c;", "I4", "Lio/reactivex/Observable;", "Fc", "Ke", "", "last4", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "b6", "lj", "", "Ee", "Lt3;", "b", "Lt3;", "binding", "c", "Ljava/lang/String;", "message", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lt3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DU0 */
/* loaded from: classes2.dex */
public final class DU0 extends AbstractC30071xE implements CU0 {

    /* renamed from: b */
    public final C28512t3 f5760b;

    /* renamed from: c */
    public String f5761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU0(BaseActivity activity, C28512t3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f5760b = binding;
    }

    @Override // p000.CU0
    /* renamed from: Dk */
    public void mo110380Dk(Deal deal) {
        Intrinsics.checkNotNullParameter(deal, "deal");
        this.f5760b.f109769f.setText(deal.getTitle());
        this.f5760b.f109768e.setText(deal.getSubtitle());
        this.f5760b.f109766c.setText(deal.getAccept());
        this.f5760b.f109771h.setText(deal.getReject());
        this.f5761c = deal.getSubtitle();
        CountdownView countdownView = this.f5760b.f109767d;
        Intrinsics.checkNotNullExpressionValue(countdownView, "binding.countDown");
        CountdownView.init$default(countdownView, deal.getDuration(), null, null, null, null, new StyleSpan(1), null, Float.valueOf(20.0f), 94, null);
    }

    @Override // p000.CU0
    /* renamed from: Ee */
    public Observable<Integer> mo110379Ee() {
        return this.f5760b.f109767d.m54603w();
    }

    @Override // p000.CU0
    /* renamed from: Fc */
    public Observable<Unit> mo110378Fc() {
        Button button = this.f5760b.f109766c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.claim");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.CU0
    /* renamed from: I4 */
    public AbstractC23461c mo110377I4() {
        return this.f5760b.f109767d.m54610p();
    }

    @Override // p000.CU0
    /* renamed from: Ke */
    public Observable<Unit> mo110376Ke() {
        Button button = this.f5760b.f109771h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.reject");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.CU0
    /* renamed from: b6 */
    public AbstractC23442F<DialogResponse> mo110375b6(String last4) {
        Intrinsics.checkNotNullParameter(last4, "last4");
        int i = C39311cj4.dialog_deal_confirmation;
        int i2 = C36585Vg4.confirm;
        int i3 = C36585Vg4.cancel;
        return H31.C3014a.dialog$default(this, i, Integer.valueOf(i2), Integer.valueOf(i3), null, null, Integer.valueOf(C36585Vg4.mainText), getActivity().getString(C45871nl4.deal_dialog_positive, last4), null, null, null, this.f5761c, false, false, false, null, 17304, null);
    }

    @Override // p000.CU0
    /* renamed from: lj */
    public void mo110374lj() {
        this.f5760b.f109767d.m54602x();
    }
}
