package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b)\u0010+B!\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b)\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R(\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010&\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 ¨\u0006."}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/LabeledDetailItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "", "setLabelTextColor", "setDetailTextColor", "", "detail", "hiddenState", "setDetailAndVisibility", "Landroid/util/AttributeSet;", "attrs", "e", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "labelView", "c", "detailView", "", "value", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "Landroid/content/res/ColorStateList;", "getLabelTextColors", "()Landroid/content/res/ColorStateList;", "setLabelTextColors", "(Landroid/content/res/ColorStateList;)V", "labelTextColors", "getDetail", "setDetail", "getDetailTextColors", "setDetailTextColors", "detailTextColors", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LabeledDetailItemView extends ConstraintLayout {

    /* renamed from: b */
    public final TextView f68144b;

    /* renamed from: c */
    public final TextView f68145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledDetailItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_labeled_detail, this, true);
        this.f68144b = (TextView) findViewById(C52955zi4.label);
        this.f68145c = (TextView) findViewById(C52955zi4.detail);
    }

    public static /* synthetic */ void setDetailAndVisibility$default(LabeledDetailItemView labeledDetailItemView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        labeledDetailItemView.setDetailAndVisibility(str, i);
    }

    /* renamed from: e */
    public final void m53951e(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.LabeledDetailItemView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.LabeledDetailItemView)");
        setLabel(obtainStyledAttributes.getString(C34290Ll4.LabeledDetailItemView_label));
        setDetail(obtainStyledAttributes.getString(C34290Ll4.LabeledDetailItemView_detail));
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C34290Ll4.LabeledDetailItemView_labelTextColor);
        if (colorStateList != null) {
            setLabelTextColors(colorStateList);
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(C34290Ll4.LabeledDetailItemView_detailTextColor);
        if (colorStateList2 != null) {
            setDetailTextColors(colorStateList2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setDetail(CharSequence charSequence) {
        this.f68145c.setText(charSequence);
    }

    public final void setDetailAndVisibility(String str, int i) {
        TextView detailView = this.f68145c;
        Intrinsics.checkNotNullExpressionValue(detailView, "detailView");
        C49520tu6.m11235p(detailView, str, i);
    }

    public final void setDetailTextColor(int i) {
        this.f68145c.setTextColor(i);
    }

    public final void setDetailTextColors(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f68145c.setTextColor(value);
    }

    public final void setLabel(CharSequence charSequence) {
        this.f68144b.setText(charSequence);
    }

    public final void setLabelTextColor(int i) {
        this.f68144b.setTextColor(i);
    }

    public final void setLabelTextColors(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f68144b.setTextColor(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledDetailItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_labeled_detail, this, true);
        this.f68144b = (TextView) findViewById(C52955zi4.label);
        this.f68145c = (TextView) findViewById(C52955zi4.detail);
        m53951e(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledDetailItemView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_labeled_detail, this, true);
        this.f68144b = (TextView) findViewById(C52955zi4.label);
        this.f68145c = (TextView) findViewById(C52955zi4.detail);
        m53951e(attrs);
    }
}
