package co.bird.android.widget;

import android.content.Context;
import android.location.Location;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010\"B#\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b\u001e\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J*\u0010\n\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u0006 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\b0\bJ\b\u0010\u000b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006&"}, m28432d2 = {"Lco/bird/android/widget/QuickStartUnselectedBannerView;", "Landroidx/cardview/widget/CardView;", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "currentLocation", "", "setBird", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "r", "s", "Landroid/widget/ImageView;", "k", "Landroid/widget/ImageView;", "birdIconImageView", "Landroid/widget/TextView;", "l", "Landroid/widget/TextView;", "birdCodeTextView", "m", "distanceTextView", "n", "rangeTextView", "Landroid/widget/Button;", "o", "Landroid/widget/Button;", "quickStartButton", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class QuickStartUnselectedBannerView extends CardView {

    /* renamed from: k */
    public final ImageView f67528k;

    /* renamed from: l */
    public final TextView f67529l;

    /* renamed from: m */
    public final TextView f67530m;

    /* renamed from: n */
    public final TextView f67531n;

    /* renamed from: o */
    public final Button f67532o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickStartUnselectedBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_quick_start_unselected_banner, this);
        this.f67528k = (ImageView) C49520tu6.m11243h(this, C52955zi4.birdIcon);
        this.f67529l = (TextView) C49520tu6.m11243h(this, C52955zi4.birdCode);
        this.f67530m = (TextView) C49520tu6.m11243h(this, C52955zi4.distanceTextView);
        this.f67531n = (TextView) C49520tu6.m11243h(this, C52955zi4.rangeTextView);
        this.f67532o = (Button) C49520tu6.m11243h(this, C52955zi4.quickStartButton);
    }

    /* renamed from: r */
    public final Observable<Unit> m54461r() {
        return C44626lf5.clicksThrottle$default(this.f67532o, 0L, 1, null).share();
    }

    /* renamed from: s */
    public final void m54460s() {
        this.f67528k.setImageResource(C48193rg4.ic_scooter_flying);
        this.f67529l.setText("");
        this.f67530m.setText("");
        this.f67531n.setText("");
        this.f67532o.setEnabled(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setBird(WireBird wireBird, Location currentLocation) {
        int i;
        String m4411a;
        Intrinsics.checkNotNullParameter(currentLocation, "currentLocation");
        if (wireBird == null) {
            m54460s();
            return;
        }
        ImageView imageView = this.f67528k;
        if (WireBirdKt.isCruiserModel(wireBird)) {
            i = C48193rg4.ic_vehicle_moped;
        } else {
            i = C48193rg4.ic_scooter_flying;
        }
        imageView.setImageResource(i);
        this.f67529l.setText(wireBird.getCode());
        TextView textView = this.f67530m;
        float distanceTo = wireBird.getLocation().fromLocation().distanceTo(currentLocation);
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setText(C51916xx1.distance$default(c51916xx1, context, distanceTo, 0.0d, true, 4, null));
        TextView textView2 = this.f67531n;
        Integer estimatedRange = wireBird.getEstimatedRange();
        if (estimatedRange != null) {
            int intValue = estimatedRange.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            m4411a = C51916xx1.distance$default(c51916xx1, context2, intValue, 0.0d, true, 4, null);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        m4411a = c51916xx1.m4411a(context3, wireBird.getBatteryLevel(), true);
        textView2.setText(m4411a);
        this.f67532o.setEnabled(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickStartUnselectedBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_quick_start_unselected_banner, this);
        this.f67528k = (ImageView) C49520tu6.m11243h(this, C52955zi4.birdIcon);
        this.f67529l = (TextView) C49520tu6.m11243h(this, C52955zi4.birdCode);
        this.f67530m = (TextView) C49520tu6.m11243h(this, C52955zi4.distanceTextView);
        this.f67531n = (TextView) C49520tu6.m11243h(this, C52955zi4.rangeTextView);
        this.f67532o = (Button) C49520tu6.m11243h(this, C52955zi4.quickStartButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickStartUnselectedBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_quick_start_unselected_banner, this);
        this.f67528k = (ImageView) C49520tu6.m11243h(this, C52955zi4.birdIcon);
        this.f67529l = (TextView) C49520tu6.m11243h(this, C52955zi4.birdCode);
        this.f67530m = (TextView) C49520tu6.m11243h(this, C52955zi4.distanceTextView);
        this.f67531n = (TextView) C49520tu6.m11243h(this, C52955zi4.rangeTextView);
        this.f67532o = (Button) C49520tu6.m11243h(this, C52955zi4.quickStartButton);
    }
}
