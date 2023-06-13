package co.bird.android.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0016\u0010\u001aB#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J(\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/widget/RibbonTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "left", "top", "right", "bottom", "", "setPadding", "start", "end", "setPaddingRelative", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "setBackgroundDrawable", "LUO4;", "b", "LUO4;", "ribbonBackground", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RibbonTextView extends AppCompatTextView {

    /* renamed from: b */
    public final UO4 f67630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RibbonTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        UO4 uo4 = new UO4(context2);
        this.f67630b = uo4;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            uo4.m81566b(((ColorDrawable) background).getColor());
        }
        uo4.m81565c(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setBackground(uo4);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        UO4 uo4;
        if (drawable != null && (uo4 = this.f67630b) != null && (drawable instanceof ColorDrawable)) {
            uo4.m81566b(((ColorDrawable) drawable).getColor());
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        UO4 uo4 = this.f67630b;
        if (uo4 != null) {
            uo4.m81565c(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        UO4 uo4 = this.f67630b;
        if (uo4 != null) {
            uo4.m81564d(i, i2, i3, i4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RibbonTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        UO4 uo4 = new UO4(context2);
        this.f67630b = uo4;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            uo4.m81566b(((ColorDrawable) background).getColor());
        }
        uo4.m81565c(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setBackground(uo4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RibbonTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        UO4 uo4 = new UO4(context2);
        this.f67630b = uo4;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            uo4.m81566b(((ColorDrawable) background).getColor());
        }
        uo4.m81565c(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setBackground(uo4);
    }
}
