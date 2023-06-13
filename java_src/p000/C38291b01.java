package p000;

import android.view.View;
import android.widget.EditText;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0012"}, m28432d2 = {"Lb01;", "LxE;", "", PaymentMethod.BillingDetails.PARAM_PHONE, "", "Ql", "Lio/reactivex/Observable;", "Pl", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "phoneNumberEditText", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/view/View;", "rootView", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: b01  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38291b01 extends AbstractC30071xE {

    /* renamed from: b */
    public final EditText f56773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38291b01(BaseActivity activity, View rootView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f56773b = (EditText) C49520tu6.m11243h(rootView, C36585Vg4.phoneNumber);
    }

    /* renamed from: Pl */
    public final Observable<String> m65136Pl() {
        return C44626lf5.textChanges$default(this.f56773b, 0, false, 2, null);
    }

    /* renamed from: Ql */
    public final void m65135Ql(String str) {
        this.f56773b.setText(str);
    }
}
