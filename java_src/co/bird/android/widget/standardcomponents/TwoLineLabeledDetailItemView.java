package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'B\u0019\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b&\u0010(B!\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b&\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR(\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010 \u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R$\u0010#\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006+"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/TwoLineLabeledDetailItemView;", "Landroid/widget/LinearLayout;", "", "color", "", "setLabelTextColor", "setDetailTextColor", "Landroid/util/AttributeSet;", "attrs", C17296a.f69688o, "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "labelView", "c", "detailView", "", "value", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "Landroid/content/res/ColorStateList;", "getLabelTextColors", "()Landroid/content/res/ColorStateList;", "setLabelTextColors", "(Landroid/content/res/ColorStateList;)V", "labelTextColors", "getDetail", "setDetail", "detail", "getDetailTextColors", "setDetailTextColors", "detailTextColors", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TwoLineLabeledDetailItemView extends LinearLayout {

    /* renamed from: b */
    public final TextView f68150b;

    /* renamed from: c */
    public final TextView f68151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoLineLabeledDetailItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_two_line_labeled_detail, this, true);
        this.f68150b = (TextView) findViewById(C52955zi4.label);
        this.f68151c = (TextView) findViewById(C52955zi4.detail);
    }

    /* renamed from: a */
    public final void m53949a(AttributeSet attributeSet) {
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
        this.f68151c.setText(charSequence);
    }

    public final void setDetailTextColor(int i) {
        this.f68151c.setTextColor(i);
    }

    public final void setDetailTextColors(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f68151c.setTextColor(value);
    }

    public final void setLabel(CharSequence charSequence) {
        this.f68150b.setText(charSequence);
    }

    public final void setLabelTextColor(int i) {
        this.f68150b.setTextColor(i);
    }

    public final void setLabelTextColors(ColorStateList value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f68150b.setTextColor(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoLineLabeledDetailItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_two_line_labeled_detail, this, true);
        this.f68150b = (TextView) findViewById(C52955zi4.label);
        this.f68151c = (TextView) findViewById(C52955zi4.detail);
        m53949a(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoLineLabeledDetailItemView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_two_line_labeled_detail, this, true);
        this.f68150b = (TextView) findViewById(C52955zi4.label);
        this.f68151c = (TextView) findViewById(C52955zi4.detail);
        m53949a(attrs);
    }
}
