package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRideTransaction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006/"}, m28432d2 = {"Lco/bird/android/widget/EndRideSummaryView;", "Landroid/widget/LinearLayout;", "Lco/bird/android/model/wire/WireRideDetail;", "detail", "", "setSummary", "Lco/bird/android/model/wire/WireRide;", "ride", "", "useBilledMinutes", "setDuration", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getDuration", "()Landroid/widget/TextView;", "duration", "c", "getDistance", "distance", DateTokenConverter.CONVERTER_KEY, "getCost", "cost", "e", "getViewReceipt", "viewReceipt", "Landroid/widget/RatingBar;", "f", "Landroid/widget/RatingBar;", "getRatingBar", "()Landroid/widget/RatingBar;", "ratingBar", "g", "Lco/bird/android/model/wire/WireRideDetail;", "getRideDetail", "()Lco/bird/android/model/wire/WireRideDetail;", "setRideDetail", "(Lco/bird/android/model/wire/WireRideDetail;)V", "rideDetail", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EndRideSummaryView extends LinearLayout {

    /* renamed from: b */
    public final TextView f67335b;

    /* renamed from: c */
    public final TextView f67336c;

    /* renamed from: d */
    public final TextView f67337d;

    /* renamed from: e */
    public final TextView f67338e;

    /* renamed from: f */
    public final RatingBar f67339f;

    /* renamed from: g */
    public WireRideDetail f67340g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EndRideSummaryView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setDuration(WireRide ride, boolean z) {
        Unit unit;
        Intrinsics.checkNotNullParameter(ride, "ride");
        if (z) {
            Integer billedMinutes = ride.getBilledMinutes();
            if (billedMinutes != null) {
                int intValue = billedMinutes.intValue();
                TextView textView = this.f67335b;
                C51916xx1 c51916xx1 = C51916xx1.f118396a;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                textView.setText(C51916xx1.durationMinute$default(c51916xx1, context, intValue, false, 4, null));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f67335b.setText(C51916xx1.f118396a.m4402j(ride.durationSeconds()));
                return;
            }
            return;
        }
        this.f67335b.setText(C51916xx1.f118396a.m4402j(ride.durationSeconds()));
    }

    public final void setRideDetail(WireRideDetail wireRideDetail) {
        this.f67340g = wireRideDetail;
    }

    public final void setSummary(WireRideDetail detail) {
        float f;
        long j;
        String currency;
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.f67340g = detail;
        RatingBar ratingBar = this.f67339f;
        Float rating = detail.getRating();
        if (rating != null) {
            f = rating.floatValue();
        } else {
            f = 0.0f;
        }
        ratingBar.setRating(f);
        WireRideTransaction transaction = detail.getReceipt().getTransaction();
        if (transaction != null) {
            j = transaction.getAmount() * (-1);
        } else {
            j = 0;
        }
        long j2 = j;
        if (transaction == null || (currency = transaction.getCurrency()) == null) {
            currency = detail.getRide().getCurrency();
        }
        TextView textView = this.f67337d;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        textView.setText(C51916xx1.currency$default(c51916xx1, j2, C45097mS5.m25591o(currency), null, 4, null));
        TextView textView2 = this.f67336c;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView2.setText(C51916xx1.distance$default(c51916xx1, context, detail.getRide().getDistance(), 0.0d, false, 12, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EndRideSummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EndRideSummaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(C45268mk4.view_ride_summary, this);
        this.f67335b = (TextView) C49520tu6.m11243h(this, C52955zi4.duration);
        this.f67336c = (TextView) C49520tu6.m11243h(this, C52955zi4.distance);
        this.f67337d = (TextView) C49520tu6.m11243h(this, C52955zi4.cost);
        this.f67339f = (RatingBar) C49520tu6.m11243h(this, C52955zi4.ratingBar);
        this.f67338e = (TextView) C49520tu6.m11243h(this, C52955zi4.viewReceipt);
    }

    public /* synthetic */ EndRideSummaryView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
