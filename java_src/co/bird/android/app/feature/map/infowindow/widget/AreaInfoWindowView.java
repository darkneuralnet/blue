package co.bird.android.app.feature.map.infowindow.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.infowindow.tag.PolygonTag;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;", "tag", "", "show", "LCp6;", "binding", "LCp6;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AreaInfoWindowView extends ConstraintLayout {
    private final C32222Cp6 binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AreaInfoWindowView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void show(PolygonTag tag) {
        int m11241j;
        int m11241j2;
        int m11241j3;
        int m11241j4;
        Intrinsics.checkNotNullParameter(tag, "tag");
        TextView textView = this.binding.f4792h;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.titleText");
        C49520tu6.setTextAndVisibility$default(textView, tag.getTitle(), 0, 2, null);
        TextView textView2 = this.binding.f4791g;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.snippetText");
        C49520tu6.setTextAndVisibility$default(textView2, tag.getNotes(), 0, 2, null);
        LayeredBadgeView show$lambda$0 = this.binding.f4788d;
        if (tag.isNoRide()) {
            Integer noRideColor = tag.getNoRideColor();
            if (noRideColor != null) {
                m11241j4 = noRideColor.intValue();
            } else {
                Intrinsics.checkNotNullExpressionValue(show$lambda$0, "show$lambda$0");
                m11241j4 = C49520tu6.m11241j(show$lambda$0, C32364Df4.birdMatteBlack);
            }
            show$lambda$0.setColor(m11241j4);
            show$lambda$0.setIconRes(C48193rg4.ic_marker_bird_riding_badge_filled_dont_enter);
            Intrinsics.checkNotNullExpressionValue(show$lambda$0, "show$lambda$0");
            LayeredBadgeView.setShadowVisibility$default(show$lambda$0, true, null, 2, null);
        }
        Intrinsics.checkNotNullExpressionValue(show$lambda$0, "show$lambda$0");
        C49520tu6.show$default(show$lambda$0, tag.isNoRide(), 0, 2, null);
        LayeredBadgeView show$lambda$1 = this.binding.f4787c;
        if (tag.isNoPark()) {
            Integer noParkColor = tag.getNoParkColor();
            if (noParkColor != null) {
                m11241j3 = noParkColor.intValue();
            } else {
                Intrinsics.checkNotNullExpressionValue(show$lambda$1, "show$lambda$1");
                m11241j3 = C49520tu6.m11241j(show$lambda$1, C32364Df4.birdRed);
            }
            show$lambda$1.setColor(m11241j3);
            show$lambda$1.setIconRes(C48193rg4.ic_marker_bird_riding_badge_filled_no_parking);
            Intrinsics.checkNotNullExpressionValue(show$lambda$1, "show$lambda$1");
            LayeredBadgeView.setShadowVisibility$default(show$lambda$1, true, null, 2, null);
        }
        Intrinsics.checkNotNullExpressionValue(show$lambda$1, "show$lambda$1");
        C49520tu6.show$default(show$lambda$1, tag.isNoPark(), 0, 2, null);
        LayeredBadgeView show$lambda$2 = this.binding.f4790f;
        if (tag.isSlow()) {
            Integer slowColor = tag.getSlowColor();
            if (slowColor != null) {
                m11241j2 = slowColor.intValue();
            } else {
                Intrinsics.checkNotNullExpressionValue(show$lambda$2, "show$lambda$2");
                m11241j2 = C49520tu6.m11241j(show$lambda$2, C32364Df4.birdYellow);
            }
            show$lambda$2.setColor(m11241j2);
            show$lambda$2.setIconRes(C48193rg4.ic_marker_bird_riding_badge_filled_issue);
            Intrinsics.checkNotNullExpressionValue(show$lambda$2, "show$lambda$2");
            LayeredBadgeView.setShadowVisibility$default(show$lambda$2, true, null, 2, null);
        }
        Intrinsics.checkNotNullExpressionValue(show$lambda$2, "show$lambda$2");
        C49520tu6.show$default(show$lambda$2, tag.isSlow(), 0, 2, null);
        LayeredBadgeView show$lambda$3 = this.binding.f4789e;
        if (tag.isParkingSpot()) {
            Integer parkingColor = tag.getParkingColor();
            if (parkingColor != null) {
                m11241j = parkingColor.intValue();
            } else {
                Intrinsics.checkNotNullExpressionValue(show$lambda$3, "show$lambda$3");
                m11241j = C49520tu6.m11241j(show$lambda$3, C32364Df4.birdParkingBlue);
            }
            show$lambda$3.setColor(m11241j);
            show$lambda$3.setIconRes(C48193rg4.ic_marker_bird_riding_badge_filled_parking);
            Intrinsics.checkNotNullExpressionValue(show$lambda$3, "show$lambda$3");
            LayeredBadgeView.setShadowVisibility$default(show$lambda$3, true, null, 2, null);
        }
        Intrinsics.checkNotNullExpressionValue(show$lambda$3, "show$lambda$3");
        C49520tu6.show$default(show$lambda$3, tag.isParkingSpot(), 0, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AreaInfoWindowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AreaInfoWindowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AreaInfoWindowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C32222Cp6 m111433b = C32222Cp6.m111433b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m111433b, "inflate(context.layoutInflater, this)");
        this.binding = m111433b;
        setPadding(C49520tu6.m11247d(this, 10), C49520tu6.m11247d(this, 2), C49520tu6.m11247d(this, 10), C49520tu6.m11247d(this, 8));
    }
}
