package co.bird.android.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010-\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR*\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0016¨\u00060"}, m28432d2 = {"Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;", "Landroid/widget/FrameLayout;", "", "progress", "", "setProgress", C17296a.f69688o, "Landroid/view/View;", "b", "Landroid/view/View;", "outlineView", "c", "progressView", "", DateTokenConverter.CONVERTER_KEY, "I", "defaultOutlineColor", "e", "defaultProgressColor", "f", "outlineWidth", "g", "F", "radius", "value", "h", "getOutlineColor", "()I", "setOutlineColor", "(I)V", "outlineColor", "i", "getProgressColor", "setProgressColor", "progressColor", "j", "getProgressMargin", "setProgressMargin", "progressMargin", "k", "_progress", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHorizontalRoundedProgressBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HorizontalRoundedProgressBar.kt\nco/bird/android/widget/progress/HorizontalRoundedProgressBar\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,109:1\n52#2,9:110\n329#3,4:119\n315#3:123\n329#3,4:124\n316#3:128\n*S KotlinDebug\n*F\n+ 1 HorizontalRoundedProgressBar.kt\nco/bird/android/widget/progress/HorizontalRoundedProgressBar\n*L\n50#1:110,9\n92#1:119,4\n103#1:123\n103#1:124,4\n103#1:128\n*E\n"})
/* loaded from: classes4.dex */
public final class HorizontalRoundedProgressBar extends FrameLayout {

    /* renamed from: b */
    public final View f68027b;

    /* renamed from: c */
    public final View f68028c;

    /* renamed from: d */
    public final int f68029d;

    /* renamed from: e */
    public final int f68030e;

    /* renamed from: f */
    public final int f68031f;

    /* renamed from: g */
    public final float f68032g;

    /* renamed from: h */
    public int f68033h;

    /* renamed from: i */
    public int f68034i;

    /* renamed from: j */
    public int f68035j;

    /* renamed from: k */
    public float f68036k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HorizontalRoundedProgressBar(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m54036a() {
        View view = this.f68028c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = this.f68031f + this.f68035j;
            marginLayoutParams.setMargins(i, i, i, i);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setOutlineColor(int i) {
        this.f68033h = i;
        Drawable background = this.f68027b.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setStroke(this.f68031f, i);
    }

    public final void setProgress(float f) {
        this.f68036k = f;
        View view = this.f68028c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) ((getWidth() - (this.f68035j * 2)) * f);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void setProgressColor(int i) {
        this.f68034i = i;
        Drawable background = this.f68028c.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(i);
    }

    public final void setProgressMargin(int i) {
        this.f68035j = i;
        m54036a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HorizontalRoundedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HorizontalRoundedProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HorizontalRoundedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int m11241j = C49520tu6.m11241j(this, C32364Df4.bird_action_button_outline);
        this.f68029d = m11241j;
        int m11241j2 = C49520tu6.m11241j(this, C32364Df4.birdMint);
        this.f68030e = m11241j2;
        int m11247d = C49520tu6.m11247d(this, 1);
        this.f68031f = m11247d;
        float m11247d2 = C49520tu6.m11247d(this, 100);
        this.f68032g = m11247d2;
        View.inflate(context, C45268mk4.view_horizontal_rounded_progress_bar, this);
        View findViewById = findViewById(C52955zi4.progressBackground);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.progressBackground)");
        this.f68027b = findViewById;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m11247d2);
        gradientDrawable.setStroke(m11247d, this.f68033h);
        findViewById.setBackground(gradientDrawable);
        View findViewById2 = findViewById(C52955zi4.progressView);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.progressView)");
        this.f68028c = findViewById2;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(this.f68034i);
        gradientDrawable2.setCornerRadius(m11247d2 - (this.f68035j / 2));
        findViewById2.setBackground(gradientDrawable2);
        int[] HorizontalRoundedProgressBar = C34290Ll4.HorizontalRoundedProgressBar;
        Intrinsics.checkNotNullExpressionValue(HorizontalRoundedProgressBar, "HorizontalRoundedProgressBar");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, HorizontalRoundedProgressBar, i, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setOutlineColor(obtainStyledAttributes.getColor(C34290Ll4.HorizontalRoundedProgressBar_outlineColor, m11241j));
        setProgressColor(obtainStyledAttributes.getColor(C34290Ll4.HorizontalRoundedProgressBar_progressColor, m11241j2));
        setProgressMargin((int) obtainStyledAttributes.getDimension(C34290Ll4.HorizontalRoundedProgressBar_progressMargin, 1.0f));
        obtainStyledAttributes.recycle();
        setProgress(0.0f);
        this.f68033h = m11241j;
        this.f68034i = m11241j2;
        this.f68035j = C49520tu6.m11247d(this, 1);
    }
}
