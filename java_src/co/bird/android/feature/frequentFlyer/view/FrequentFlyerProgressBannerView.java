package co.bird.android.feature.frequentFlyer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireFrequentFlyerProgress;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/frequentFlyer/view/FrequentFlyerProgressBannerView;", "Landroid/widget/LinearLayout;", "Lco/bird/android/model/wire/WireFrequentFlyerProgress;", "progress", "", C17296a.f69688o, "LJs6;", "b", "LJs6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FrequentFlyerProgressBannerView extends LinearLayout {

    /* renamed from: b */
    public final C33887Js6 f64045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerProgressBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33887Js6 m99610b = C33887Js6.m99610b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99610b, "inflate(context.layoutInflater, this)");
        this.f64045b = m99610b;
    }

    /* renamed from: a */
    public final void m58103a(WireFrequentFlyerProgress progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f64045b.f18393d.setText(progress.getTitle());
        ProgressBar progressBar = this.f64045b.f18391b;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        progressBar.setProgressDrawable(C44931mA1.m26205a(progress, context));
        this.f64045b.f18392c.setText(progress.getSubtitle());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerProgressBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33887Js6 m99610b = C33887Js6.m99610b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99610b, "inflate(context.layoutInflater, this)");
        this.f64045b = m99610b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentFlyerProgressBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C33887Js6 m99610b = C33887Js6.m99610b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m99610b, "inflate(context.layoutInflater, this)");
        this.f64045b = m99610b;
    }
}
