package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'B!\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b#\u0010)J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bJ\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u0003\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/InspectionV2CardView;", "Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;", "", "campaignTitle", "", "campaignBannerColor", "", "canPassFailIssue", "", "setVehicleCampaign", "D", "campaignBannerColorInt", "F", "Lxr6;", "y", "Lxr6;", "binding", "Landroid/widget/TextView;", "z", "Landroid/widget/TextView;", "campaignView", "Landroid/widget/ImageView;", "A", "Landroid/widget/ImageView;", "E", "()Landroid/widget/ImageView;", Entry.TYPE_IMAGE, "", "value", "getCampaignTitle", "()Ljava/lang/CharSequence;", "setCampaignTitle", "(Ljava/lang/CharSequence;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class InspectionV2CardView extends BaseInspectionCardView {

    /* renamed from: A */
    public final ImageView f68137A;

    /* renamed from: y */
    public final C51861xr6 f68138y;

    /* renamed from: z */
    public final TextView f68139z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionV2CardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C51861xr6 m4553b = C51861xr6.m4553b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m4553b, "inflate(context.layoutInflater, this)");
        this.f68138y = m4553b;
        View findViewById = findViewById(C52955zi4.campaignBanner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.campaignBanner)");
        this.f68139z = (TextView) findViewById;
        ImageView imageView = m4553b.f118256f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
        this.f68137A = imageView;
    }

    /* renamed from: D */
    public final void m53959D() {
        this.f68139z.setVisibility(8);
        setBackgroundColor(NA0.m94301c(getContext(), 17170443));
        setEnabled(true);
    }

    /* renamed from: E */
    public final ImageView m53958E() {
        return this.f68137A;
    }

    /* renamed from: F */
    public final void m53957F(String str, int i) {
        this.f68139z.setVisibility(0);
        this.f68139z.setBackgroundColor(i);
        setCampaignTitle(str);
        Drawable m94299e = NA0.m94299e(getContext(), C33309Hg4.red_border);
        Intrinsics.checkNotNull(m94299e, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) m94299e;
        gradientDrawable.mutate();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        gradientDrawable.setStroke((int) C49347td3.m12002a(1, context), i);
        setBackground(gradientDrawable);
    }

    public final void setCampaignTitle(CharSequence charSequence) {
        this.f68139z.setText(charSequence);
    }

    public final void setVehicleCampaign(String campaignTitle, int i, boolean z) {
        Intrinsics.checkNotNullParameter(campaignTitle, "campaignTitle");
        m53957F(campaignTitle, i);
        if (!z) {
            setAccepted(Boolean.FALSE);
        }
        setEnabled(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionV2CardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C51861xr6 m4553b = C51861xr6.m4553b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m4553b, "inflate(context.layoutInflater, this)");
        this.f68138y = m4553b;
        View findViewById = findViewById(C52955zi4.campaignBanner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.campaignBanner)");
        this.f68139z = (TextView) findViewById;
        ImageView imageView = m4553b.f118256f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
        this.f68137A = imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionV2CardView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C51861xr6 m4553b = C51861xr6.m4553b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m4553b, "inflate(context.layoutInflater, this)");
        this.f68138y = m4553b;
        View findViewById = findViewById(C52955zi4.campaignBanner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.campaignBanner)");
        this.f68139z = (TextView) findViewById;
        ImageView imageView = m4553b.f118256f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
        this.f68137A = imageView;
    }
}
