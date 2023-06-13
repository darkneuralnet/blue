package p000;

import android.widget.Button;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\fR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"LIt4;", "LxE;", "LH31;", "Lh56;", "", Entry.TYPE_TEXT, "", "t", "Ql", "", "show", "Rl", "Lio/reactivex/Observable;", "Pl", "r0", "Lc5;", "b", "Lc5;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lc5;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: It4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33660It4 extends AbstractC30071xE {

    /* renamed from: b */
    public final C13387c5 f16384b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33660It4(BaseActivity activity, C13387c5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f16384b = binding;
    }

    /* renamed from: Pl */
    public final Observable<Unit> m101565Pl() {
        Button button = this.f16384b.f60044g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.requestRefundButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final void m101564Ql(String str) {
        boolean z;
        this.f16384b.f60040c.setText(str);
        TextView textView = this.f16384b.f60040c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.descriptionText");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    /* renamed from: Rl */
    public final void m101563Rl(boolean z) {
        Button button = this.f16384b.f60044g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.requestRefundButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: r0 */
    public final Observable<Unit> m101562r0() {
        Button button = this.f16384b.f60041d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helpButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: t */
    public final void m101561t(String str) {
        boolean z;
        this.f16384b.f60046i.setText(str);
        TextView textView = this.f16384b.f60046i;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.titleText");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }
}
