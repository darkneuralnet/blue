package p000;

import android.widget.Button;
import android.widget.TextView;
import co.bird.android.app.feature.payment.PaypalSignOutActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LVP3;", "LxE;", "LSP3;", "Lio/reactivex/Observable;", "", "v3", "", "email", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/Button;", "signOutButton", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "emailTextView", "Lco/bird/android/app/feature/payment/PaypalSignOutActivity;", "activity", "<init>", "(Lco/bird/android/app/feature/payment/PaypalSignOutActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VP3 */
/* loaded from: classes2.dex */
public final class VP3 extends AbstractC30071xE implements SP3 {

    /* renamed from: b */
    public final Button f39064b;

    /* renamed from: c */
    public final TextView f39065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VP3(PaypalSignOutActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f39064b = (Button) activity.findViewById(C36585Vg4.signOutButton);
        this.f39065c = (TextView) activity.findViewById(C36585Vg4.emailField);
    }

    @Override // p000.SP3
    /* renamed from: C */
    public void mo79884C(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f39065c.setText(email);
    }

    @Override // p000.SP3
    /* renamed from: v3 */
    public Observable<Unit> mo79883v3() {
        Button signOutButton = this.f39064b;
        Intrinsics.checkNotNullExpressionValue(signOutButton, "signOutButton");
        return C44626lf5.clicksThrottle$default(signOutButton, 0L, 1, null);
    }
}
