package co.bird.android.widget;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/widget/RideDetailsView;", "Landroid/widget/LinearLayout;", "", "battery", "", "setBattery", "", "distanceMeters", "setDistance", "estimatedRange", "setRange", "seconds", "", "countDown", "setTimer", "Lrt6;", "b", "Lrt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RideDetailsView extends LinearLayout {

    /* renamed from: b */
    public final C48325rt6 f67631b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RideDetailsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setTimer$default(RideDetailsView rideDetailsView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        rideDetailsView.setTimer(i, z);
    }

    public final void setBattery(int i) {
        LinearLayout linearLayout = this.f67631b.f107850i;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.rangeView");
        C49520tu6.m11239l(linearLayout);
        LinearLayout linearLayout2 = this.f67631b.f107845d;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.batteryView");
        C49520tu6.m11233r(linearLayout2);
        TextView textView = this.f67631b.f107843b;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setText(c51916xx1.m4411a(context, i, true));
        this.f67631b.f107844c.setPercent(i);
    }

    public final void setDistance(double d) {
        TextView textView = this.f67631b.f107848g;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setText(C51916xx1.distance$default(c51916xx1, context, d, 0.0d, false, 12, null));
    }

    public final void setRange(int i) {
        LinearLayout linearLayout = this.f67631b.f107850i;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.rangeView");
        C49520tu6.m11233r(linearLayout);
        LinearLayout linearLayout2 = this.f67631b.f107845d;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.batteryView");
        C49520tu6.m11239l(linearLayout2);
        TextView textView = this.f67631b.f107849h;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setText(C51916xx1.distance$default(c51916xx1, context, i, 0.0d, true, 4, null));
    }

    public final void setTimer(int i, boolean z) {
        if (z) {
            TextView textView = this.f67631b.f107846e;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.clock");
            C49520tu6.m11239l(textView);
            CountdownView countdownView = this.f67631b.f107847f;
            Intrinsics.checkNotNullExpressionValue(countdownView, "binding.countDownClock");
            C49520tu6.m11233r(countdownView);
            CountdownView countdownView2 = this.f67631b.f107847f;
            Intrinsics.checkNotNullExpressionValue(countdownView2, "binding.countDownClock");
            CountdownView.init$default(countdownView2, i, null, null, null, null, null, new ForegroundColorSpan(-16777216), Float.valueOf(18.0f), 62, null);
            return;
        }
        CountdownView countdownView3 = this.f67631b.f107847f;
        Intrinsics.checkNotNullExpressionValue(countdownView3, "binding.countDownClock");
        C49520tu6.m11239l(countdownView3);
        TextView textView2 = this.f67631b.f107846e;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.clock");
        C49520tu6.m11233r(textView2);
        this.f67631b.f107846e.setText(C51916xx1.f118396a.m4402j(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RideDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RideDetailsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RideDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C48325rt6 m15114b = C48325rt6.m15114b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m15114b, "inflate(context.layoutInflater, this)");
        this.f67631b = m15114b;
        setOrientation(1);
    }
}
