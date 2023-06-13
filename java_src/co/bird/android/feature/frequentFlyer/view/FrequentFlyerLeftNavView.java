package co.bird.android.feature.frequentFlyer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireFrequentFlyerProgress;
import co.bird.android.model.wire.WireFrequentFlyerView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerLeftNavView;", "Landroid/widget/LinearLayout;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "LKr6;", "b", "LKr6;", "binding", "c", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "current", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FrequentFlyerLeftNavView extends LinearLayout {

    /* renamed from: b */
    public final C34112Kr6 f64043b;

    /* renamed from: c */
    public WireFrequentFlyerView f64044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerLeftNavView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C34112Kr6 m98226b = C34112Kr6.m98226b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m98226b, "inflate(context.layoutInflater, this)");
        this.f64043b = m98226b;
    }

    /* renamed from: a */
    public final void m58104a(WireFrequentFlyerView data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(this.f64044c, data)) {
            return;
        }
        this.f64043b.f20288d.setText(data.getNavigationStatus());
        ProgressBar progressBar = this.f64043b.f20286b;
        WireFrequentFlyerProgress progress = data.getProgress();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        progressBar.setProgressDrawable(C44931mA1.m26205a(progress, context));
        this.f64043b.f20287c.setText(data.getCurrentLevelStatus());
        this.f64044c = data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerLeftNavView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C34112Kr6 m98226b = C34112Kr6.m98226b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m98226b, "inflate(context.layoutInflater, this)");
        this.f64043b = m98226b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerLeftNavView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C34112Kr6 m98226b = C34112Kr6.m98226b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m98226b, "inflate(context.layoutInflater, this)");
        this.f64043b = m98226b;
    }
}
