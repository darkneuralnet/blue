package co.bird.android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b5\u00107B#\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\b5\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0016¨\u0006;"}, m28432d2 = {"Lco/bird/android/widget/BatteryView;", "Landroid/view/View;", "Landroid/util/AttributeSet;", "attrs", "", "b", "", "percent", "setPercent", "color", "setColor", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", DateTokenConverter.CONVERTER_KEY, "", "c", "", C17296a.f69688o, "F", "dpToPx", "strokeWidth", "width", "e", "height", "f", "borderRadius", "g", "fillRadius", "Landroid/graphics/RectF;", "h", "Landroid/graphics/RectF;", "fillRect", "i", "eraseRect", "j", "borderRect", "Landroid/graphics/Paint;", "k", "Landroid/graphics/Paint;", "paint", "l", "Z", "isRtl", "m", "I", "n", "percentage", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BatteryView extends View {

    /* renamed from: o */
    public static final C16458a f67135o = new C16458a(null);

    /* renamed from: p */
    public static final PorterDuffXfermode f67136p = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: b */
    public final float f67137b;

    /* renamed from: c */
    public final float f67138c;

    /* renamed from: d */
    public float f67139d;

    /* renamed from: e */
    public float f67140e;

    /* renamed from: f */
    public final float f67141f;

    /* renamed from: g */
    public final float f67142g;

    /* renamed from: h */
    public final RectF f67143h;

    /* renamed from: i */
    public final RectF f67144i;

    /* renamed from: j */
    public final RectF f67145j;

    /* renamed from: k */
    public final Paint f67146k;

    /* renamed from: l */
    public boolean f67147l;

    /* renamed from: m */
    public int f67148m;

    /* renamed from: n */
    public float f67149n;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m28432d2 = {"Lco/bird/android/widget/BatteryView$a;", "", "", "DEFAULT_WIDTH_DP", "F", "HEIGHT_TO_WIDTH_RADIO", "Landroid/graphics/PorterDuffXfermode;", "PORTER_DUFF_CLEAR_MODE", "Landroid/graphics/PorterDuffXfermode;", "STROKE_WIDTH_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.BatteryView$a */
    /* loaded from: classes4.dex */
    public static final class C16458a {
        public /* synthetic */ C16458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16458a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float applyDimension = TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        this.f67137b = applyDimension;
        float f = 1.0f * applyDimension;
        this.f67138c = f;
        this.f67139d = applyDimension * 24.0f;
        this.f67140e = m54773a();
        this.f67141f = 3.0f * f;
        this.f67142g = f * 2.0f;
        this.f67143h = new RectF();
        this.f67144i = new RectF();
        this.f67145j = new RectF();
        this.f67146k = new Paint();
        this.f67148m = NA0.m94301c(getContext(), C32364Df4.birdNewRoad);
        this.f67149n = 0.3f;
        m54772b(null);
    }

    /* renamed from: a */
    public final float m54773a() {
        return this.f67139d * 0.5f;
    }

    /* renamed from: b */
    public final void m54772b(AttributeSet attributeSet) {
        setLayerType(1, null);
        this.f67146k.setAntiAlias(true);
        this.f67146k.setStrokeWidth(this.f67138c);
    }

    /* renamed from: c */
    public final boolean m54771c() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: d */
    public final void m54770d(Canvas canvas) {
        canvas.translate(getPaddingLeft() + ((((getWidth() - this.f67139d) - getPaddingLeft()) - getPaddingRight()) / 2.0f), getPaddingTop() + ((((getHeight() - this.f67140e) - getPaddingTop()) - getPaddingBottom()) / 2.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int save = canvas.save();
        this.f67147l = m54771c();
        m54770d(canvas);
        this.f67146k.setXfermode(null);
        this.f67146k.setStyle(Paint.Style.FILL);
        this.f67146k.setColor(this.f67148m);
        RectF rectF = this.f67143h;
        float f = this.f67138c;
        rectF.set(f * 2.0f, f * 2.0f, (f * 2.0f) + (this.f67149n * (this.f67139d - (4.0f * f))), this.f67140e - (f * 2.0f));
        if (this.f67147l) {
            RectF rectF2 = this.f67143h;
            float f2 = this.f67139d;
            rectF2.left = f2 - rectF2.left;
            rectF2.right = f2 - rectF2.right;
        }
        canvas.drawRect(this.f67143h, this.f67146k);
        this.f67146k.setXfermode(f67136p);
        this.f67146k.setStyle(Paint.Style.STROKE);
        RectF rectF3 = this.f67144i;
        float f3 = this.f67142g;
        canvas.drawRoundRect(rectF3, f3, f3, this.f67146k);
        this.f67146k.setXfermode(null);
        this.f67146k.setColor(this.f67148m);
        RectF rectF4 = this.f67145j;
        float f4 = this.f67141f;
        canvas.drawRoundRect(rectF4, f4, f4, this.f67146k);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int roundToInt;
        int roundToInt2;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    this.f67139d = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                }
            } else {
                this.f67139d = this.f67137b * 24.0f;
            }
        } else {
            this.f67139d = Math.min(this.f67137b * 24.0f, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight());
        }
        float m54773a = m54773a();
        this.f67140e = m54773a;
        RectF rectF = this.f67144i;
        float f = this.f67138c;
        rectF.set(f * 1.5f, f * 1.5f, this.f67139d - (f * 1.5f), m54773a - (f * 1.5f));
        RectF rectF2 = this.f67145j;
        float f2 = this.f67138c;
        rectF2.set(f2 * 0.5f, f2 * 0.5f, this.f67139d - (f2 * 0.5f), this.f67140e - (f2 * 0.5f));
        roundToInt = MathKt__MathJVMKt.roundToInt(Math.ceil(this.f67139d + getPaddingLeft() + getPaddingRight()));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(Math.ceil(this.f67140e + getPaddingTop() + getPaddingBottom()));
        setMeasuredDimension(roundToInt, roundToInt2);
    }

    public final void setColor(int i) {
        this.f67148m = i;
        invalidate();
    }

    public final void setPercent(int i) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i, (ClosedRange<Integer>) new IntRange(0, 100));
        this.f67149n = coerceIn / 100.0f;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        float applyDimension = TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        this.f67137b = applyDimension;
        float f = 1.0f * applyDimension;
        this.f67138c = f;
        this.f67139d = applyDimension * 24.0f;
        this.f67140e = m54773a();
        this.f67141f = 3.0f * f;
        this.f67142g = f * 2.0f;
        this.f67143h = new RectF();
        this.f67144i = new RectF();
        this.f67145j = new RectF();
        this.f67146k = new Paint();
        this.f67148m = NA0.m94301c(getContext(), C32364Df4.birdNewRoad);
        this.f67149n = 0.3f;
        m54772b(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float applyDimension = TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        this.f67137b = applyDimension;
        float f = 1.0f * applyDimension;
        this.f67138c = f;
        this.f67139d = applyDimension * 24.0f;
        this.f67140e = m54773a();
        this.f67141f = 3.0f * f;
        this.f67142g = f * 2.0f;
        this.f67143h = new RectF();
        this.f67144i = new RectF();
        this.f67145j = new RectF();
        this.f67146k = new Paint();
        this.f67148m = NA0.m94301c(getContext(), C32364Df4.birdNewRoad);
        this.f67149n = 0.3f;
        m54772b(attributeSet);
    }
}
