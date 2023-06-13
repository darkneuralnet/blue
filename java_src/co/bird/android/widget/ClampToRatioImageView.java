package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/widget/ClampToRatioImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/util/AttributeSet;", "attrs", "defStyle", "c", "", "b", "D", "ratio", "Landroid/widget/ImageView$ScaleType;", "Landroid/widget/ImageView$ScaleType;", "previousScaleType", DateTokenConverter.CONVERTER_KEY, "I", "smallerMeasuredWidth", "e", "smallerMeasuredHeight", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ClampToRatioImageView extends AppCompatImageView {

    /* renamed from: b */
    public double f67265b;

    /* renamed from: c */
    public ImageView.ScaleType f67266c;

    /* renamed from: d */
    public int f67267d;

    /* renamed from: e */
    public int f67268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClampToRatioImageView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67265b = 1.0d;
        m54639c(null, 0);
    }

    /* renamed from: c */
    public final void m54639c(AttributeSet attributeSet, int i) {
        List split$default;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.ClampToRatioImageView, i, 0);
            try {
                String string = obtainStyledAttributes.getString(C34290Ll4.ClampToRatioImageView_clampRatio);
                if (string == null) {
                    string = "1:1";
                }
                String str = string;
                Intrinsics.checkNotNullExpressionValue(str, "getString(R.styleable.Cl…View_clampRatio) ?: \"1:1\"");
                split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
                this.f67265b = Double.parseDouble((String) split$default.get(0)) / Double.parseDouble((String) split$default.get(1));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setScaleType(getScaleType());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        ImageView.ScaleType scaleType = getScaleType();
        Intrinsics.checkNotNullExpressionValue(scaleType, "scaleType");
        this.f67266c = scaleType;
        setAdjustViewBounds(true);
        super.onMeasure(i, i2);
        this.f67267d = getMeasuredWidth();
        this.f67268e = getMeasuredHeight();
        setAdjustViewBounds(false);
        ImageView.ScaleType scaleType2 = this.f67266c;
        if (scaleType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousScaleType");
            scaleType2 = null;
        }
        setScaleType(scaleType2);
        super.onMeasure(i, i2);
        this.f67267d = Math.min(this.f67267d, getMeasuredWidth());
        this.f67268e = Math.min(this.f67268e, getMeasuredHeight());
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            setMeasuredDimension(Math.min(this.f67267d, (int) (this.f67268e * this.f67265b)), this.f67268e);
            return;
        }
        int i3 = this.f67267d;
        setMeasuredDimension(i3, Math.min(this.f67268e, (int) (i3 / this.f67265b)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClampToRatioImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67265b = 1.0d;
        m54639c(attrs, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClampToRatioImageView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67265b = 1.0d;
        m54639c(attrs, i);
    }
}
