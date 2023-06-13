package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0011\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0017J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/widget/SelectedBirdRidePriceBannerView;", "Landroidx/cardview/widget/CardView;", "LuS;", "", "priceString", "", "maxLines", "", "setPriceString", "Lio/reactivex/Observable;", "G1", "LAt6;", "k", "LAt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SelectedBirdRidePriceBannerView extends CardView implements InterfaceC29196uS {

    /* renamed from: k */
    public final C31790At6 f67656k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedBirdRidePriceBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C31790At6 m114982c = C31790At6.m114982c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m114982c, "inflate(context.layoutInflater, this, true)");
        this.f67656k = m114982c;
    }

    @Override // p000.InterfaceC29196uS
    /* renamed from: G1 */
    public Observable<Unit> mo10275G1() {
        TextView textView = this.f67656k.f1313b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.priceString");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC29196uS
    public void setPriceString(String str, int i) {
        this.f67656k.f1313b.setText(str);
        this.f67656k.f1313b.setMaxLines(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedBirdRidePriceBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        C31790At6 m114982c = C31790At6.m114982c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m114982c, "inflate(context.layoutInflater, this, true)");
        this.f67656k = m114982c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedBirdRidePriceBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C31790At6 m114982c = C31790At6.m114982c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m114982c, "inflate(context.layoutInflater, this, true)");
        this.f67656k = m114982c;
    }
}
