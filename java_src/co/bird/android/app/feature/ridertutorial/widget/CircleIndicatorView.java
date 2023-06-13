package co.bird.android.app.feature.ridertutorial.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b+\u0010-B#\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b+\u0010/J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002R*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#¨\u00060"}, m28432d2 = {"Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/util/AttributeSet;", "attrs", "defStyle", "b", "value", "I", C17296a.f69688o, "()I", "setNumCircles", "(I)V", "numCircles", "c", "getSelectedIndex", "setSelectedIndex", "selectedIndex", "Landroid/graphics/Paint;", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Paint;", "pagePaint", "e", "fillPaint", "f", "strokePaint", "", "g", "F", "radius", "h", "spacing", "i", "indicatorWidth", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CircleIndicatorView extends View {

    /* renamed from: b */
    public int f62718b;

    /* renamed from: c */
    public int f62719c;

    /* renamed from: d */
    public final Paint f62720d;

    /* renamed from: e */
    public final Paint f62721e;

    /* renamed from: f */
    public final Paint f62722f;

    /* renamed from: g */
    public float f62723g;

    /* renamed from: h */
    public float f62724h;

    /* renamed from: i */
    public float f62725i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleIndicatorView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f62720d = paint;
        Paint paint2 = new Paint();
        this.f62721e = paint2;
        Paint paint3 = new Paint();
        this.f62722f = paint3;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        paint.setColor(C40788fB0.m41776f(context2, C32364Df4.CircleIndicatorView_pageColor));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint2.setColor(C40788fB0.m41776f(context3, C32364Df4.CircleIndicatorView_fillColor));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        paint3.setColor(C40788fB0.m41776f(context4, C32364Df4.CircleIndicatorView_strokeColor));
        paint3.setStrokeWidth(getResources().getDimension(C37044Xf4.CircleIndicatorView_strokeWidth));
        this.f62723g = getResources().getDimension(C37044Xf4.CircleIndicatorView_radius);
        this.f62724h = getResources().getDimension(C37044Xf4.CircleIndicatorView_spacing);
    }

    /* renamed from: a */
    public final int m59414a() {
        return this.f62718b;
    }

    /* renamed from: b */
    public final void m59413b(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34056Kl4.CircleIndicatorView, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…dicatorView, defStyle, 0)");
            Paint paint = this.f62720d;
            paint.setColor(obtainStyledAttributes.getColor(C34056Kl4.CircleIndicatorView_pageColor, paint.getColor()));
            Paint paint2 = this.f62721e;
            paint2.setColor(obtainStyledAttributes.getColor(C34056Kl4.CircleIndicatorView_fillColor, paint2.getColor()));
            Paint paint3 = this.f62722f;
            paint3.setColor(obtainStyledAttributes.getColor(C34056Kl4.CircleIndicatorView_strokeColor, paint3.getColor()));
            Paint paint4 = this.f62722f;
            paint4.setStrokeWidth(obtainStyledAttributes.getDimension(C34056Kl4.CircleIndicatorView_strokeWidth, paint4.getStrokeWidth()));
            this.f62723g = obtainStyledAttributes.getDimension(C34056Kl4.CircleIndicatorView_radius, this.f62723g);
            this.f62724h = obtainStyledAttributes.getDimension(C34056Kl4.CircleIndicatorView_spacing, this.f62724h);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f62718b <= 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        if (getLayoutDirection() == 1) {
            i = (this.f62718b - this.f62719c) - 1;
        } else {
            i = this.f62719c;
        }
        canvas.translate(getPaddingLeft() + (((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.f62725i) + this.f62722f.getStrokeWidth()) / 2.0f), getPaddingTop());
        int i2 = this.f62718b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i) {
                float f = this.f62723g;
                canvas.drawCircle(f, f, f, this.f62721e);
            } else {
                float f2 = this.f62723g;
                canvas.drawCircle(f2, f2, f2, this.f62720d);
            }
            if (Color.alpha(this.f62722f.getColor()) > 0) {
                float f3 = this.f62723g;
                canvas.drawCircle(f3, f3, f3, this.f62722f);
            }
            canvas.translate((2 * this.f62723g) + this.f62724h, 0.0f);
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        int i3 = this.f62718b;
        if (i3 > 0) {
            f = (i3 * 2 * this.f62723g) + ((i3 - 1) * this.f62724h) + this.f62722f.getStrokeWidth();
        } else {
            f = 0.0f;
        }
        this.f62725i = f;
        setMeasuredDimension(View.resolveSize(((int) Math.ceil(f)) + getPaddingLeft() + getPaddingRight(), i), View.resolveSize(((int) Math.ceil((2 * this.f62723g) + this.f62722f.getStrokeWidth())) + getPaddingTop() + getPaddingBottom(), i2));
    }

    public final void setNumCircles(int i) {
        this.f62718b = i;
        requestLayout();
    }

    public final void setSelectedIndex(int i) {
        this.f62719c = i;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f62720d = paint;
        Paint paint2 = new Paint();
        this.f62721e = paint2;
        Paint paint3 = new Paint();
        this.f62722f = paint3;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        paint.setColor(C40788fB0.m41776f(context2, C32364Df4.CircleIndicatorView_pageColor));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint2.setColor(C40788fB0.m41776f(context3, C32364Df4.CircleIndicatorView_fillColor));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        paint3.setColor(C40788fB0.m41776f(context4, C32364Df4.CircleIndicatorView_strokeColor));
        paint3.setStrokeWidth(getResources().getDimension(C37044Xf4.CircleIndicatorView_strokeWidth));
        this.f62723g = getResources().getDimension(C37044Xf4.CircleIndicatorView_radius);
        this.f62724h = getResources().getDimension(C37044Xf4.CircleIndicatorView_spacing);
        m59413b(attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f62720d = paint;
        Paint paint2 = new Paint();
        this.f62721e = paint2;
        Paint paint3 = new Paint();
        this.f62722f = paint3;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        paint.setColor(C40788fB0.m41776f(context2, C32364Df4.CircleIndicatorView_pageColor));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint2.setColor(C40788fB0.m41776f(context3, C32364Df4.CircleIndicatorView_fillColor));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        paint3.setColor(C40788fB0.m41776f(context4, C32364Df4.CircleIndicatorView_strokeColor));
        paint3.setStrokeWidth(getResources().getDimension(C37044Xf4.CircleIndicatorView_strokeWidth));
        this.f62723g = getResources().getDimension(C37044Xf4.CircleIndicatorView_radius);
        this.f62724h = getResources().getDimension(C37044Xf4.CircleIndicatorView_spacing);
        m59413b(attributeSet, i);
    }
}
