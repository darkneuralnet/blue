package p000;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LYI1;", "LxE;", "LH31;", "", "show", "", "Xl", "", Entry.TYPE_TEXT, "Sl", "Yl", "url", "Ul", "", "resId", "Vl", "Tl", "Wl", "Lio/reactivex/Observable;", "Pl", "Ql", "Rl", "LK3;", "b", "LK3;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LK3;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YI1 */
/* loaded from: classes3.dex */
public final class YI1 extends AbstractC30071xE {

    /* renamed from: b */
    public final C4315K3 f44946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YI1(BaseActivity activity, C4315K3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f44946b = binding;
    }

    /* renamed from: Pl */
    public final Observable<Unit> m75278Pl() {
        Button button = this.f44946b.f18978d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.haveOwnHelmetButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final Observable<Unit> m75277Ql() {
        Button button = this.f44946b.f18981g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.rentButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Rl */
    public final Observable<Unit> m75276Rl() {
        Button button = this.f44946b.f18982h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.reportMissingButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Sl */
    public final void m75275Sl(String str) {
        boolean z;
        this.f44946b.f18977c.setText(str);
        TextView textView = this.f44946b.f18977c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.descriptionText");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    /* renamed from: Tl */
    public final void m75274Tl(int i) {
        this.f44946b.f18978d.setText(i);
    }

    /* renamed from: Ul */
    public final void m75273Ul(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f44946b.f18979e.setAnimationFromUrl(url);
    }

    /* renamed from: Vl */
    public final void m75272Vl(int i) {
        ConstraintLayout.LayoutParams layoutParams;
        this.f44946b.f18979e.setImageResource(i);
        ViewGroup.LayoutParams layoutParams2 = this.f44946b.f18979e.getLayoutParams();
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

    /* renamed from: Wl */
    public final void m75271Wl(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f44946b.f18981g.setText(text);
    }

    /* renamed from: Xl */
    public final void m75270Xl(boolean z) {
        Button button = this.f44946b.f18978d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.haveOwnHelmetButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: Yl */
    public final void m75269Yl(boolean z) {
        TextView textView = this.f44946b.f18980f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.mandatoryDescriptionText");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }
}
