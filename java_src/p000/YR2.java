package p000;

import android.widget.Button;
import androidx.appcompat.widget.SwitchCompat;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LYR2;", "LXR2;", "LxE;", "", "checked", "", "Fj", "Lio/reactivex/Observable;", "j8", "Bf", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "Yf", "open", "h9", "Lm4;", "b", "Lm4;", "binding", "c", "Lio/reactivex/Observable;", "r5", "()Lio/reactivex/Observable;", "autoLocationUpdateSwitches", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lm4;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YR2 */
/* loaded from: classes3.dex */
public final class YR2 extends AbstractC30071xE implements XR2 {

    /* renamed from: b */
    public final C25902m4 f45881b;

    /* renamed from: c */
    public final Observable<Boolean> f45882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YR2(BaseActivity activity, C25902m4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f45881b = binding;
        SwitchCompat switchCompat = binding.f97260c;
        Intrinsics.checkNotNullExpressionValue(switchCompat, "binding.autoUpdateLocationSwitch");
        this.f45882c = C34228Le5.m96513a(switchCompat).m11038c();
    }

    @Override // p000.XR2
    /* renamed from: Bf */
    public Observable<Boolean> mo75074Bf() {
        SwitchCompat switchCompat = this.f45881b.f97264g;
        Intrinsics.checkNotNullExpressionValue(switchCompat, "binding.merchantOpenSwitch");
        return C34228Le5.m96513a(switchCompat).m11038c();
    }

    @Override // p000.XR2
    /* renamed from: Fj */
    public void mo75073Fj(boolean z) {
        this.f45881b.f97260c.setChecked(z);
    }

    @Override // p000.XR2
    /* renamed from: Yf */
    public void mo75072Yf(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f45881b.f97262e.setText(address);
    }

    @Override // p000.XR2
    /* renamed from: h9 */
    public void mo75071h9(boolean z) {
        this.f45881b.f97264g.setChecked(z);
    }

    @Override // p000.XR2
    /* renamed from: j8 */
    public Observable<Unit> mo75070j8() {
        Button button = this.f45881b.f97263f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.merchantEditAddress");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.XR2
    /* renamed from: r5 */
    public Observable<Boolean> mo75069r5() {
        return this.f45882c;
    }
}
