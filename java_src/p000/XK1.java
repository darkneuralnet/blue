package p000;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0005J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010!\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006*"}, m28432d2 = {"LXK1;", "LxE;", "LH31;", "", "url", "", "Vl", "", "res", "Wl", "Yl", "Lio/reactivex/Observable;", "z5", "r0", "", "show", "Ul", "errorMessageResId", "Xl", "(Ljava/lang/Integer;)V", "LN3;", "b", "LN3;", "binding", "Landroid/widget/CheckBox;", "Pl", "()Landroid/widget/CheckBox;", "checkbox1", "Ql", "checkbox2", "Rl", "checkbox3", "Sl", "checkbox4", "Landroid/widget/TextView;", "Tl", "()Landroid/widget/TextView;", "titleText", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LN3;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeaseUnlockTutorialUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseUnlockTutorialUi.kt\nco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* renamed from: XK1 */
/* loaded from: classes3.dex */
public final class XK1 extends AbstractC30071xE {

    /* renamed from: b */
    public final C5470N3 f42981b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XK1(BaseActivity activity, C5470N3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f42981b = binding;
    }

    /* renamed from: Pl */
    public final CheckBox m77123Pl() {
        CheckBox checkBox = this.f42981b.f24054d;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox1");
        return checkBox;
    }

    /* renamed from: Ql */
    public final CheckBox m77122Ql() {
        CheckBox checkBox = this.f42981b.f24055e;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox2");
        return checkBox;
    }

    /* renamed from: Rl */
    public final CheckBox m77121Rl() {
        CheckBox checkBox = this.f42981b.f24056f;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox3");
        return checkBox;
    }

    /* renamed from: Sl */
    public final CheckBox m77120Sl() {
        CheckBox checkBox = this.f42981b.f24057g;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox4");
        return checkBox;
    }

    /* renamed from: Tl */
    public final TextView m77119Tl() {
        TextView textView = this.f42981b.f24063m;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.titleText");
        return textView;
    }

    /* renamed from: Ul */
    public final void m77118Ul(boolean z) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70245B(z);
        }
        if (supportActionBar != null) {
            supportActionBar.mo70212v(z);
        }
    }

    /* renamed from: Vl */
    public final void m77117Vl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f42981b.f24061k.setAnimationFromUrl(url);
    }

    /* renamed from: Wl */
    public final void m77116Wl(int i) {
        ConstraintLayout.LayoutParams layoutParams;
        this.f42981b.f24061k.setImageResource(i);
        ViewGroup.LayoutParams layoutParams2 = this.f42981b.f24061k.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
            layoutParams.f53974b0 = true;
            layoutParams.f53953I = "375:281";
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        }
    }

    /* renamed from: Xl */
    public final void m77115Xl(Integer num) {
        boolean z;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        if (num != null) {
            TextView textView = this.f42981b.f24052b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.bluetoothUnavailableMessageText");
            textView.setText(num.intValue());
        }
        TextView textView2 = this.f42981b.f24053c;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.bluetoothUnavailableTitleText");
        C49520tu6.show$default(textView2, z, 0, 2, null);
        TextView textView3 = this.f42981b.f24052b;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.bluetoothUnavailableMessageText");
        C49520tu6.show$default(textView3, z, 0, 2, null);
    }

    /* renamed from: Yl */
    public final void m77114Yl() {
        Button button = this.f42981b.f24058h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueButton");
        C49520tu6.m11233r(button);
    }

    /* renamed from: r0 */
    public final Observable<Unit> m77113r0() {
        Button button = this.f42981b.f24060j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helpButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: z5 */
    public final Observable<Unit> m77112z5() {
        Button button = this.f42981b.f24058h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.continueButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
