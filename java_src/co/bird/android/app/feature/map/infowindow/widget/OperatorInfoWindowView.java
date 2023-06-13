package co.bird.android.app.feature.map.infowindow.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BatteryView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;", "Landroid/widget/LinearLayout;", "", "configureLightMode", "Lco/bird/android/model/wire/WireBird;", "bird", "setBird", "Lco/bird/android/model/persistence/BirdMapMarker;", "birdMarker", "setBirdMarker", "LOp6;", "binding", "LOp6;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class OperatorInfoWindowView extends LinearLayout {
    public static final Companion Companion = new Companion(null);
    private static final int PADDING_DP = 8;
    private final C35030Op6 binding;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView$Companion;", "", "()V", "PADDING_DP", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OperatorInfoWindowView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void configureLightMode() {
        this.binding.getRoot().setBackground(NA0.m94299e(getContext(), C48193rg4.ic_pin_selected_android_light_bg));
        BatteryView batteryView = this.binding.f27411b;
        Context context = getContext();
        int i = C32364Df4.colorPrimary;
        batteryView.setColor(NA0.m94301c(context, i));
        this.binding.f27412c.setTextColor(NA0.m94301c(getContext(), i));
        this.binding.f27413d.setTextColor(NA0.m94301c(getContext(), i));
        this.binding.f27414e.setImageDrawable(NA0.m94299e(getContext(), C48193rg4.ic_icon_id_dark));
    }

    public final void setBird(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.binding.f27411b.setPercent(bird.getBatteryLevel());
        TextView textView = this.binding.f27412c;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setText(c51916xx1.m4411a(context, bird.getBatteryLevel(), true));
        this.binding.f27413d.setText(bird.getCode());
    }

    public final void setBirdMarker(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        this.binding.f27411b.setPercent(birdMarker.getBatteryLevel());
        TextView textView = this.binding.f27412c;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setText(c51916xx1.m4411a(context, birdMarker.getBatteryLevel(), true));
        this.binding.f27413d.setText(birdMarker.getCode());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OperatorInfoWindowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OperatorInfoWindowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OperatorInfoWindowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C35030Op6 m91311b = C35030Op6.m91311b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m91311b, "inflate(context.layoutInflater, this)");
        this.binding = m91311b;
        setOrientation(1);
        setPaddingRelative((int) C49347td3.m12001b(8), (int) C49347td3.m12001b(8), (int) C49347td3.m12001b(8), (int) C49347td3.m12001b(8));
        configureLightMode();
    }
}
