package co.bird.android.app.feature.ridedetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideTransaction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010Z\u001a\u00020Y\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010[\u0012\b\b\u0002\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010&\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\"R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001cR\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010>\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010B\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000f\u0010CR\u0011\u0010F\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bE\u0010\u001cR\u0011\u0010H\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bG\u0010\u001cR\u0011\u0010J\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bI\u0010\"R\u0011\u0010L\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bK\u0010CR\u0011\u0010N\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bM\u0010-R\u0011\u0010P\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bO\u0010=R\u0011\u0010R\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bQ\u0010=R\u0011\u0010V\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bW\u0010\"¨\u0006a"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;", "Landroid/widget/LinearLayout;", "", "rideDistance", "", "setDistance", "Lco/bird/android/model/wire/WireRide;", "_ride", "", "useBilledMinutes", "hideTime", "setDuration", "Lco/bird/android/model/wire/WireRideTransaction;", "transaction", "setSinglePrice", "b", "Lco/bird/android/model/wire/WireRide;", "getRide", "()Lco/bird/android/model/wire/WireRide;", "setRide", "(Lco/bird/android/model/wire/WireRide;)V", "ride", "Lwt6;", "c", "Lwt6;", "binding", "Landroid/widget/RelativeLayout;", "v", "()Landroid/widget/RelativeLayout;", "rideReportSection", "j", "durationSection", "Landroid/widget/TextView;", "i", "()Landroid/widget/TextView;", "duration", "h", "distance", "cost", "Landroid/view/View;", "q", "()Landroid/view/View;", "partnerSection", "Landroid/widget/ImageView;", "o", "()Landroid/widget/ImageView;", "partnerIcon", "p", "partnerName", "Landroid/widget/RatingBar;", "r", "()Landroid/widget/RatingBar;", "rating", "s", "ratingSection", "Lco/bird/android/app/feature/ridedetail/widget/ReceiptLayout;", "t", "()Lco/bird/android/app/feature/ridedetail/widget/ReceiptLayout;", "receiptSection", "Landroid/widget/Button;", "k", "()Landroid/widget/Button;", "getHelp", "Lco/bird/android/app/feature/ridedetail/widget/ContactLayout;", C17296a.f69688o, "()Lco/bird/android/app/feature/ridedetail/widget/ContactLayout;", "contacts", "()Landroid/widget/LinearLayout;", "contactsSection", DateTokenConverter.CONVERTER_KEY, "costSection", "m", "parkingPhotoSection", "n", "parkingPhotoStatus", "u", "reviewResultContainer", "w", "thumbImage", "e", "disputeButton", "l", "invoiceButton", "Landroidx/cardview/widget/CardView;", "g", "()Landroidx/cardview/widget/CardView;", "disputeStatusContainer", "f", "disputeStatus", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RideSummaryWithReceiptView extends LinearLayout {

    /* renamed from: b */
    public WireRide f62703b;

    /* renamed from: c */
    public final C51288wt6 f62704c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RideSummaryWithReceiptView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final ContactLayout m59449a() {
        ContactLayout contactLayout = this.f62704c.f116761c;
        Intrinsics.checkNotNullExpressionValue(contactLayout, "binding.contacts");
        return contactLayout;
    }

    /* renamed from: b */
    public final LinearLayout m59448b() {
        LinearLayout linearLayout = this.f62704c.f116762d;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.contactsSection");
        return linearLayout;
    }

    /* renamed from: c */
    public final TextView m59447c() {
        TextView textView = this.f62704c.f116763e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.cost");
        return textView;
    }

    /* renamed from: d */
    public final RelativeLayout m59446d() {
        RelativeLayout relativeLayout = this.f62704c.f116765g;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.costSection");
        return relativeLayout;
    }

    /* renamed from: e */
    public final Button m59445e() {
        Button button = this.f62704c.f116766h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.disputeButton");
        return button;
    }

    /* renamed from: f */
    public final TextView m59444f() {
        TextView textView = this.f62704c.f116767i;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.disputeStatus");
        return textView;
    }

    /* renamed from: g */
    public final CardView m59443g() {
        CardView cardView = this.f62704c.f116768j;
        Intrinsics.checkNotNullExpressionValue(cardView, "binding.disputeStatusContainer");
        return cardView;
    }

    /* renamed from: h */
    public final TextView m59442h() {
        TextView textView = this.f62704c.f116769k;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.distance");
        return textView;
    }

    /* renamed from: i */
    public final TextView m59441i() {
        TextView textView = this.f62704c.f116773o;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.duration");
        return textView;
    }

    /* renamed from: j */
    public final RelativeLayout m59440j() {
        RelativeLayout relativeLayout = this.f62704c.f116775q;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.durationSection");
        return relativeLayout;
    }

    /* renamed from: k */
    public final Button m59439k() {
        Button button = this.f62704c.f116776r;
        Intrinsics.checkNotNullExpressionValue(button, "binding.getHelp");
        return button;
    }

    /* renamed from: l */
    public final Button m59438l() {
        Button button = this.f62704c.f116756G;
        Intrinsics.checkNotNullExpressionValue(button, "binding.sendInvoiceButton");
        return button;
    }

    /* renamed from: m */
    public final RelativeLayout m59437m() {
        RelativeLayout relativeLayout = this.f62704c.f116778t;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.parkingPhotoSection");
        return relativeLayout;
    }

    /* renamed from: n */
    public final TextView m59436n() {
        TextView textView = this.f62704c.f116779u;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.parkingPhotoStatus");
        return textView;
    }

    /* renamed from: o */
    public final ImageView m59435o() {
        ImageView imageView = this.f62704c.f116780v;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.partnerIcon");
        return imageView;
    }

    /* renamed from: p */
    public final TextView m59434p() {
        TextView textView = this.f62704c.f116781w;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.partnerName");
        return textView;
    }

    /* renamed from: q */
    public final View m59433q() {
        RelativeLayout relativeLayout = this.f62704c.f116782x;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.partnerSection");
        return relativeLayout;
    }

    /* renamed from: r */
    public final RatingBar m59432r() {
        RatingBar ratingBar = this.f62704c.f116783y;
        Intrinsics.checkNotNullExpressionValue(ratingBar, "binding.rating");
        return ratingBar;
    }

    /* renamed from: s */
    public final RelativeLayout m59431s() {
        RelativeLayout relativeLayout = this.f62704c.f116750A;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.ratingSection");
        return relativeLayout;
    }

    public final void setDistance(double d) {
        TextView m59442h = m59442h();
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        m59442h.setText(C51916xx1.distance$default(c51916xx1, context, d, 0.0d, false, 12, null));
    }

    public final void setDuration(WireRide _ride, boolean z, boolean z2) {
        Unit unit;
        Intrinsics.checkNotNullParameter(_ride, "_ride");
        this.f62703b = _ride;
        if (z2) {
            C49520tu6.m11239l(m59440j());
        } else if (z) {
            Integer billedMinutes = _ride.getBilledMinutes();
            if (billedMinutes != null) {
                int intValue = billedMinutes.intValue();
                TextView m59441i = m59441i();
                C51916xx1 c51916xx1 = C51916xx1.f118396a;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                m59441i.setText(C51916xx1.durationMinute$default(c51916xx1, context, intValue, false, 4, null));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                m59441i().setText(C51916xx1.f118396a.m4402j(_ride.durationSeconds()));
            }
        } else {
            m59441i().setText(C51916xx1.f118396a.m4402j(_ride.durationSeconds()));
        }
    }

    public final void setRide(WireRide wireRide) {
        this.f62703b = wireRide;
    }

    public final void setSinglePrice(WireRideTransaction wireRideTransaction) {
        if (wireRideTransaction != null) {
            m59447c().setText(C51916xx1.currency$default(C51916xx1.f118396a, wireRideTransaction.getAmount() * (-1), C45097mS5.m25591o(wireRideTransaction.getCurrency()), null, 4, null));
            return;
        }
        WireRide wireRide = this.f62703b;
        if (wireRide != null) {
            m59447c().setText(C51916xx1.currency$default(C51916xx1.f118396a, 0L, C45097mS5.m25591o(wireRide.getCurrency()), null, 4, null));
        }
    }

    /* renamed from: t */
    public final ReceiptLayout m59430t() {
        ReceiptLayout receiptLayout = this.f62704c.f116751B;
        Intrinsics.checkNotNullExpressionValue(receiptLayout, "binding.receiptSection");
        return receiptLayout;
    }

    /* renamed from: u */
    public final LinearLayout m59429u() {
        LinearLayout linearLayout = this.f62704c.f116752C;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.reviewResultContainer");
        return linearLayout;
    }

    /* renamed from: v */
    public final RelativeLayout m59428v() {
        RelativeLayout relativeLayout = this.f62704c.f116755F;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.rideReportSection");
        return relativeLayout;
    }

    /* renamed from: w */
    public final ImageView m59427w() {
        ImageView imageView = this.f62704c.f116758I;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.thumbImage");
        return imageView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RideSummaryWithReceiptView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RideSummaryWithReceiptView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RideSummaryWithReceiptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C51288wt6 m6156b = C51288wt6.m6156b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m6156b, "inflate(context.layoutInflater, this)");
        this.f62704c = m6156b;
        setOrientation(1);
        setBackgroundColor(NA0.m94301c(context, C32364Df4.birdWhite));
    }
}
