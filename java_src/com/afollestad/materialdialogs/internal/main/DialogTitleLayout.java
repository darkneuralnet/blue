package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014J0\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0014J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0014J\u0006\u0010(\u001a\u00020 R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006)"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "Lcom/afollestad/materialdialogs/internal/main/BaseSubLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "frameMarginHorizontal", "", "frameMarginVertical", "iconMargin", "iconSize", "iconView", "Landroid/widget/ImageView;", "getIconView$core", "()Landroid/widget/ImageView;", "setIconView$core", "(Landroid/widget/ImageView;)V", "titleMarginBottom", "titleView", "Landroid/widget/TextView;", "getTitleView$core", "()Landroid/widget/TextView;", "setTitleView$core", "(Landroid/widget/TextView;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onFinishInflate", "onLayout", "changed", "", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "shouldNotBeVisible", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogTitleLayout extends BaseSubLayout {
    private final int frameMarginHorizontal;
    private final int frameMarginVertical;
    private final int iconMargin;
    private final int iconSize;
    public ImageView iconView;
    private final int titleMarginBottom;
    public TextView titleView;

    public /* synthetic */ DialogTitleLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final ImageView getIconView$core() {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        return imageView;
    }

    public final TextView getTitleView$core() {
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        return textView;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, getMeasuredHeight() - getDividerHeight(), getMeasuredWidth(), getMeasuredHeight(), dividerPaint());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C16848R.C16850id.md_icon_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.md_icon_title)");
        this.iconView = (ImageView) findViewById;
        View findViewById2 = findViewById(C16848R.C16850id.md_text_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.md_text_title)");
        this.titleView = (TextView) findViewById2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        int i6;
        int i7;
        if (shouldNotBeVisible()) {
            return;
        }
        int i8 = this.frameMarginVertical;
        int measuredHeight = getMeasuredHeight() - this.titleMarginBottom;
        int i9 = measuredHeight - ((measuredHeight - i8) / 2);
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        int measuredHeight2 = textView.getMeasuredHeight() / 2;
        int i10 = i9 - measuredHeight2;
        int i11 = measuredHeight2 + i9;
        MDUtil mDUtil = MDUtil.INSTANCE;
        TextView textView2 = this.titleView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        int additionalPaddingForFont = i11 + mDUtil.additionalPaddingForFont(textView2);
        if (ViewsKt.isRtl(this)) {
            measuredWidth = getMeasuredWidth() - this.frameMarginHorizontal;
            TextView textView3 = this.titleView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            i5 = measuredWidth - textView3.getMeasuredWidth();
        } else {
            i5 = this.frameMarginHorizontal;
            TextView textView4 = this.titleView;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            measuredWidth = textView4.getMeasuredWidth() + i5;
        }
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (ViewsKt.isVisible(imageView)) {
            ImageView imageView2 = this.iconView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            int measuredHeight3 = imageView2.getMeasuredHeight() / 2;
            int i12 = i9 - measuredHeight3;
            int i13 = i9 + measuredHeight3;
            if (ViewsKt.isRtl(this)) {
                ImageView imageView3 = this.iconView;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iconView");
                }
                i5 = measuredWidth - imageView3.getMeasuredWidth();
                i7 = i5 - this.iconMargin;
                TextView textView5 = this.titleView;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                i6 = i7 - textView5.getMeasuredWidth();
            } else {
                ImageView imageView4 = this.iconView;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iconView");
                }
                measuredWidth = imageView4.getMeasuredWidth() + i5;
                int i14 = this.iconMargin + measuredWidth;
                TextView textView6 = this.titleView;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                int measuredWidth2 = textView6.getMeasuredWidth() + i14;
                i6 = i14;
                i7 = measuredWidth2;
            }
            ImageView imageView5 = this.iconView;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            imageView5.layout(i5, i12, measuredWidth, i13);
            measuredWidth = i7;
            i5 = i6;
        }
        TextView textView7 = this.titleView;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView7.layout(i5, i10, measuredWidth, additionalPaddingForFont);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int coerceAtLeast;
        int i3 = 0;
        if (shouldNotBeVisible()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = size - (this.frameMarginHorizontal * 2);
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (ViewsKt.isVisible(imageView)) {
            ImageView imageView2 = this.iconView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(this.iconSize, 1073741824), View.MeasureSpec.makeMeasureSpec(this.iconSize, 1073741824));
            ImageView imageView3 = this.iconView;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            i4 -= imageView3.getMeasuredWidth() + this.iconMargin;
        }
        TextView textView = this.titleView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        ImageView imageView4 = this.iconView;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (ViewsKt.isVisible(imageView4)) {
            ImageView imageView5 = this.iconView;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconView");
            }
            i3 = imageView5.getMeasuredHeight();
        }
        TextView textView2 = this.titleView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i3, textView2.getMeasuredHeight());
        setMeasuredDimension(size, coerceAtLeast + this.frameMarginVertical + this.titleMarginBottom);
    }

    public final void setIconView$core(ImageView imageView) {
        this.iconView = imageView;
    }

    public final void setTitleView$core(TextView textView) {
        this.titleView = textView;
    }

    public final boolean shouldNotBeVisible() {
        ImageView imageView = this.iconView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        if (ViewsKt.isNotVisible(imageView)) {
            TextView textView = this.titleView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            if (ViewsKt.isNotVisible(textView)) {
                return true;
            }
        }
        return false;
    }

    public DialogTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MDUtil mDUtil = MDUtil.INSTANCE;
        this.frameMarginVertical = mDUtil.dimenPx(this, C16848R.dimen.md_dialog_frame_margin_vertical);
        this.titleMarginBottom = mDUtil.dimenPx(this, C16848R.dimen.md_dialog_title_layout_margin_bottom);
        this.frameMarginHorizontal = mDUtil.dimenPx(this, C16848R.dimen.md_dialog_frame_margin_horizontal);
        this.iconMargin = mDUtil.dimenPx(this, C16848R.dimen.md_icon_margin);
        this.iconSize = mDUtil.dimenPx(this, C16848R.dimen.md_icon_size);
    }
}
