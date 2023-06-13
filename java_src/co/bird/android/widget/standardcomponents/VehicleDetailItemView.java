package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.BatteryView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+B\u0019\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b*\u0010,B!\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b*\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010$\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010'\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001e¨\u0006/"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;", "Landroid/widget/LinearLayout;", "", "drawableRes", "", "setTaskImageResource", "Landroid/util/AttributeSet;", "attrs", C17296a.f69688o, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "codeText", "Lco/bird/android/widget/BatteryView;", "c", "Lco/bird/android/widget/BatteryView;", "batteryView", DateTokenConverter.CONVERTER_KEY, "batteryText", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "taskImage", "f", "taskText", "", "value", "getCode", "()Ljava/lang/CharSequence;", "setCode", "(Ljava/lang/CharSequence;)V", PaymentMethodOptionsParams.Blik.PARAM_CODE, "getBatteryPercentLevel", "()I", "setBatteryPercentLevel", "(I)V", "batteryPercentLevel", "getTaskLabel", "setTaskLabel", "taskLabel", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class VehicleDetailItemView extends LinearLayout {

    /* renamed from: b */
    public final TextView f68152b;

    /* renamed from: c */
    public final BatteryView f68153c;

    /* renamed from: d */
    public final TextView f68154d;

    /* renamed from: e */
    public final ImageView f68155e;

    /* renamed from: f */
    public final TextView f68156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleDetailItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_vehicle_detail, this, true);
        this.f68152b = (TextView) C49520tu6.m11243h(this, C52955zi4.codeText);
        this.f68153c = (BatteryView) C49520tu6.m11243h(this, C52955zi4.batteryView);
        this.f68154d = (TextView) C49520tu6.m11243h(this, C52955zi4.battery);
        this.f68155e = (ImageView) C49520tu6.m11243h(this, C52955zi4.taskImage);
        this.f68156f = (TextView) C49520tu6.m11243h(this, C52955zi4.taskText);
    }

    /* renamed from: a */
    public final void m53948a(AttributeSet attributeSet) {
        int coerceIn;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.VehicleDetailItemView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.VehicleDetailItemView)");
        setCode(obtainStyledAttributes.getString(C34290Ll4.VehicleDetailItemView_code));
        coerceIn = RangesKt___RangesKt.coerceIn(obtainStyledAttributes.getInt(C34290Ll4.VehicleDetailItemView_batteryLevel, 0), (ClosedRange<Integer>) new IntRange(0, 100));
        setBatteryPercentLevel(coerceIn);
        setTaskLabel(obtainStyledAttributes.getString(C34290Ll4.VehicleDetailItemView_taskText));
        Drawable drawable = obtainStyledAttributes.getDrawable(C34290Ll4.VehicleDetailItemView_taskImage);
        if (drawable != null) {
            this.f68155e.setImageDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setBatteryPercentLevel(int i) {
        this.f68153c.setPercent(i);
        TextView textView = this.f68154d;
        textView.setText(i + "%");
    }

    public final void setCode(CharSequence charSequence) {
        this.f68152b.setText(charSequence);
    }

    public final void setTaskImageResource(int i) {
        this.f68155e.setImageResource(i);
    }

    public final void setTaskLabel(CharSequence charSequence) {
        this.f68156f.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleDetailItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_vehicle_detail, this, true);
        this.f68152b = (TextView) C49520tu6.m11243h(this, C52955zi4.codeText);
        this.f68153c = (BatteryView) C49520tu6.m11243h(this, C52955zi4.batteryView);
        this.f68154d = (TextView) C49520tu6.m11243h(this, C52955zi4.battery);
        this.f68155e = (ImageView) C49520tu6.m11243h(this, C52955zi4.taskImage);
        this.f68156f = (TextView) C49520tu6.m11243h(this, C52955zi4.taskText);
        m53948a(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleDetailItemView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_vehicle_detail, this, true);
        this.f68152b = (TextView) C49520tu6.m11243h(this, C52955zi4.codeText);
        this.f68153c = (BatteryView) C49520tu6.m11243h(this, C52955zi4.batteryView);
        this.f68154d = (TextView) C49520tu6.m11243h(this, C52955zi4.battery);
        this.f68155e = (ImageView) C49520tu6.m11243h(this, C52955zi4.taskImage);
        this.f68156f = (TextView) C49520tu6.m11243h(this, C52955zi4.taskText);
        m53948a(attrs);
    }
}
