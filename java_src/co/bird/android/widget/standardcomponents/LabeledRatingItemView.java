package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-B\u0019\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b,\u0010.B!\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010/\u001a\u00020\u0002¢\u0006\u0004\b,\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010)\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001f¨\u00061"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "", "setLabelTextColor", "Landroid/util/AttributeSet;", "attrs", "e", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "labelView", "Landroid/widget/RatingBar;", "c", "Landroid/widget/RatingBar;", "ratingBar", DateTokenConverter.CONVERTER_KEY, "ratingValue", "", "value", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "Landroid/content/res/ColorStateList;", "getLabelTextColors", "()Landroid/content/res/ColorStateList;", "setLabelTextColors", "(Landroid/content/res/ColorStateList;)V", "labelTextColors", "", "getRating", "()F", "setRating", "(F)V", "rating", "getRatingTextColors", "setRatingTextColors", "ratingTextColors", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LabeledRatingItemView extends ConstraintLayout {

    /* renamed from: b */
    public final TextView f68146b;

    /* renamed from: c */
    public final RatingBar f68147c;

    /* renamed from: d */
    public final TextView f68148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledRatingItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_labeled_ride_rating, this, true);
        this.f68146b = (TextView) findViewById(C52955zi4.label);
        this.f68147c = (RatingBar) findViewById(C52955zi4.ratingBar);
        this.f68148d = (TextView) findViewById(C52955zi4.rating);
    }

    /* renamed from: e */
    public final void m53950e(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.LabeledRatingItemView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.LabeledRatingItemView)");
        setLabel(obtainStyledAttributes.getString(C34290Ll4.LabeledRatingItemView_ratingLabel));
        setRating(obtainStyledAttributes.getFloat(C34290Ll4.LabeledRatingItemView_rating, 0.0f));
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C34290Ll4.LabeledRatingItemView_ratingLabelTextColor);
        if (colorStateList != null) {
            setLabelTextColors(colorStateList);
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(C34290Ll4.LabeledRatingItemView_ratingColor);
        if (colorStateList2 != null) {
            setRatingTextColors(colorStateList2);
        }
        obtainStyledAttributes.recycle();
        this.f68147c.setNumStars(5);
        this.f68147c.setStepSize(1.0f);
        this.f68147c.setIsIndicator(true);
    }

    public final void setLabel(CharSequence charSequence) {
        this.f68146b.setText(charSequence);
    }

    public final void setLabelTextColor(int i) {
        this.f68146b.setTextColor(i);
    }

    public final void setLabelTextColors(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f68146b.setTextColor(value);
    }

    public final void setRating(float f) {
        this.f68147c.setRating(f);
        this.f68148d.setText(String.valueOf(f));
    }

    public final void setRatingTextColors(ColorStateList colorStateList) {
        this.f68147c.setForegroundTintList(colorStateList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledRatingItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_labeled_ride_rating, this, true);
        this.f68146b = (TextView) findViewById(C52955zi4.label);
        this.f68147c = (RatingBar) findViewById(C52955zi4.ratingBar);
        this.f68148d = (TextView) findViewById(C52955zi4.rating);
        m53950e(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledRatingItemView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_labeled_ride_rating, this, true);
        this.f68146b = (TextView) findViewById(C52955zi4.label);
        this.f68147c = (RatingBar) findViewById(C52955zi4.ratingBar);
        this.f68148d = (TextView) findViewById(C52955zi4.rating);
        m53950e(attrs);
    }
}
