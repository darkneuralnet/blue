package co.bird.android.feature.birdplus.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusView;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlusView", "", "e", "LNp6;", "b", "LNp6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class BirdPlusBannerView extends ConstraintLayout {

    /* renamed from: b */
    public final C34796Np6 f63373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdPlusBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C34796Np6 m93343b = C34796Np6.m93343b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m93343b, "inflate(context.layoutInflater, this)");
        this.f63373b = m93343b;
    }

    /* renamed from: e */
    public final void m58679e(BirdPlusView birdPlusView) {
        String str;
        String str2;
        AssetMedia assetMedia;
        BirdPlusDisplayView display;
        LegacyAsset bannerIcon;
        BirdPlusDisplayView display2;
        BirdPlusDisplayView display3;
        Intrinsics.checkNotNullParameter(birdPlusView, "birdPlusView");
        TextView textView = this.f63373b.f25233e;
        BirdPlusSubscriptionPlanView subscriptionPlan = birdPlusView.getSubscriptionPlan();
        if (subscriptionPlan != null && (display3 = subscriptionPlan.getDisplay()) != null) {
            str = display3.getBannerTitle();
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = this.f63373b.f25232d;
        BirdPlusSubscriptionPlanView subscriptionPlan2 = birdPlusView.getSubscriptionPlan();
        if (subscriptionPlan2 != null && (display2 = subscriptionPlan2.getDisplay()) != null) {
            str2 = display2.getBannerMessage();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        LottieAnimationView lottieAnimationView = this.f63373b.f25230b;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "binding.icon");
        BirdPlusSubscriptionPlanView subscriptionPlan3 = birdPlusView.getSubscriptionPlan();
        if (subscriptionPlan3 != null && (display = subscriptionPlan3.getDisplay()) != null && (bannerIcon = display.getBannerIcon()) != null) {
            assetMedia = bannerIcon.getMedia();
        } else {
            assetMedia = null;
        }
        C47331qD2.setMedia$default(lottieAnimationView, assetMedia, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdPlusBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C34796Np6 m93343b = C34796Np6.m93343b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m93343b, "inflate(context.layoutInflater, this)");
        this.f63373b = m93343b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdPlusBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C34796Np6 m93343b = C34796Np6.m93343b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m93343b, "inflate(context.layoutInflater, this)");
        this.f63373b = m93343b;
    }
}
