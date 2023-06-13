package p000;

import android.widget.Button;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LE51;", "LxE;", "LH31;", "", Entry.TYPE_TEXT, "", "t", "Ql", "Lio/reactivex/Observable;", "Pl", "r0", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Rl", "Lx3;", "b", "Lx3;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lx3;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: E51 */
/* loaded from: classes3.dex */
public final class E51 extends AbstractC30071xE {

    /* renamed from: b */
    public final C30028x3 f6954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E51(BaseActivity activity, C30028x3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f6954b = binding;
    }

    /* renamed from: Pl */
    public final Observable<Unit> m109412Pl() {
        Button button = this.f6954b.f117039b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.claimCreditButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final void m109411Ql(String str) {
        boolean z;
        this.f6954b.f117041d.setText(str);
        TextView textView = this.f6954b.f117041d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.descriptionText");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    /* renamed from: Rl */
    public final AbstractC23442F<DialogResponse> m109410Rl() {
        return birdDialog(C33284Hd6.f13675d, false, false);
    }

    /* renamed from: r0 */
    public final Observable<Unit> m109409r0() {
        Button button = this.f6954b.f117042e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helpButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: t */
    public final void m109408t(String str) {
        boolean z;
        this.f6954b.f117045h.setText(str);
        TextView textView = this.f6954b.f117045h;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.titleText");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }
}
