package co.bird.android.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdLabelKt;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00107\u001a\u000206\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006J0\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u0014\u0010\u000e\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000f\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0012R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0017\u0010,\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/\"\u0004\b\f\u00100R$\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006>"}, m28432d2 = {"Lco/bird/android/widget/BirdActionView;", "Landroidx/cardview/widget/CardView;", "Landroid/location/Location;", "location", "Lco/bird/android/model/wire/WireBird;", "bird", "", "isHourly", "batteryPercentOnly", "", "t", "showCode", "setBird", "", "r", "s", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "distance", "Landroid/view/View;", "l", "Landroid/view/View;", "batteryInfoContainer", "m", "batteryLevel", "Lco/bird/android/widget/BatteryView;", "n", "Lco/bird/android/widget/BatteryView;", "batteryPercent", "o", PaymentMethodOptionsParams.Blik.PARAM_CODE, "p", "status", "Landroid/widget/RelativeLayout;", "q", "Landroid/widget/RelativeLayout;", "locationView", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "chevron", "Landroidx/cardview/widget/CardView;", "getCard", "()Landroidx/cardview/widget/CardView;", "card", "Lco/bird/android/model/wire/WireBird;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "(Lco/bird/android/model/wire/WireBird;)V", "value", "isBatteryVisible", "()Z", "setBatteryVisible", "(Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdActionView extends CardView {

    /* renamed from: k */
    public final TextView f67170k;

    /* renamed from: l */
    public final View f67171l;

    /* renamed from: m */
    public final TextView f67172m;

    /* renamed from: n */
    public final BatteryView f67173n;

    /* renamed from: o */
    public final TextView f67174o;

    /* renamed from: p */
    public final TextView f67175p;

    /* renamed from: q */
    public final RelativeLayout f67176q;

    /* renamed from: r */
    public final ImageView f67177r;

    /* renamed from: s */
    public final CardView f67178s;

    /* renamed from: t */
    public WireBird f67179t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setBird$default(BirdActionView birdActionView, Location location, WireBird wireBird, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            location = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        birdActionView.setBird(location, wireBird, z, z2);
    }

    public static /* synthetic */ void updateBird$default(BirdActionView birdActionView, Location location, WireBird wireBird, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        birdActionView.m54753t(location, wireBird, z, z2);
    }

    /* renamed from: r */
    public final String m54755r(WireBird wireBird, Location location) {
        float[] fArr = new float[1];
        Location.distanceBetween(wireBird.getLocation().getLatitude(), wireBird.getLocation().getLongitude(), location.getLatitude(), location.getLongitude(), fArr);
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return C51916xx1.distance$default(c51916xx1, context, fArr[0], 0.0d, false, 12, null);
    }

    /* renamed from: s */
    public final String m54754s(WireBird wireBird, boolean z) {
        long j;
        if (wireBird.getBountyPrice() != null && !z) {
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            Integer bountyPrice = wireBird.getBountyPrice();
            if (bountyPrice != null) {
                j = bountyPrice.intValue();
            } else {
                j = 0;
            }
            return C51916xx1.currency$default(c51916xx1, j, C45097mS5.m25591o(wireBird.getBountyCurrency()), null, 4, null);
        }
        return wireBird.getLabel().getName();
    }

    public final void setBatteryVisible(boolean z) {
        C49520tu6.show$default(this.f67171l, z, 0, 2, null);
    }

    public final void setBird(WireBird wireBird) {
        this.f67179t = wireBird;
    }

    /* renamed from: t */
    public final void m54753t(Location location, WireBird bird, boolean z, boolean z2) {
        Unit unit;
        Intrinsics.checkNotNullParameter(bird, "bird");
        TextView textView = this.f67172m;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setText(c51916xx1.m4411a(context, bird.getBatteryLevel(), z2));
        this.f67173n.setPercent(bird.getBatteryLevel());
        if (location != null) {
            this.f67170k.setText(m54755r(bird, location));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C49520tu6.m11239l(this.f67176q);
        }
        this.f67175p.setText(m54754s(bird, z));
        this.f67175p.setBackgroundColor(WireBirdLabelKt.colorCode(bird.getLabel()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @SuppressLint({"SetTextI18n"})
    public final void setBird(Location location, WireBird bird, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f67179t = bird;
        if (z) {
            this.f67174o.setText(bird.getCode());
        } else {
            TextView textView = this.f67174o;
            String substring = bird.getCode().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            textView.setText(substring + "••");
        }
        m54753t(location, bird, z2, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(C45268mk4.view_bird_action, this);
        this.f67174o = (TextView) C49520tu6.m11243h(this, C52955zi4.code);
        this.f67170k = (TextView) C49520tu6.m11243h(this, C52955zi4.distance);
        this.f67171l = C49520tu6.m11243h(this, C52955zi4.batteryInfoContainer);
        this.f67172m = (TextView) C49520tu6.m11243h(this, C52955zi4.batteryLevel);
        this.f67173n = (BatteryView) C49520tu6.m11243h(this, C52955zi4.batteryPercent);
        this.f67175p = (TextView) C49520tu6.m11243h(this, C52955zi4.status);
        this.f67178s = (CardView) C49520tu6.m11243h(this, C52955zi4.card);
        this.f67176q = (RelativeLayout) C49520tu6.m11243h(this, C52955zi4.location);
        this.f67177r = (ImageView) C49520tu6.m11243h(this, C52955zi4.chevron);
    }

    public /* synthetic */ BirdActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
