package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001\nB\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+B\u0019\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b*\u0010,B!\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b*\u0010.J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010'\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00060"}, m28432d2 = {"Lco/bird/android/widget/FleetMarkerPillPin;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", C17296a.f69688o, "Landroid/util/AttributeSet;", "attrs", "b", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "innerPaint", "c", "outlinePaint", "Landroid/graphics/Path;", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Path;", "anchorPath", "e", "bubblePath", "value", "getColor", "()I", "setColor", "(I)V", "color", "getOutlineColor", "setOutlineColor", "outlineColor", "", "getOutlineWidth", "()F", "setOutlineWidth", "(F)V", "outlineWidth", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "f", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FleetMarkerPillPin extends View {

    /* renamed from: f */
    public static final C16506a f67341f = new C16506a(null);

    /* renamed from: b */
    public final Paint f67342b;

    /* renamed from: c */
    public final Paint f67343c;

    /* renamed from: d */
    public final Path f67344d;

    /* renamed from: e */
    public final Path f67345e;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/widget/FleetMarkerPillPin$a;", "", "", "DEFAULT_HEIGHT_DP", "I", "DEFAULT_STROKE_WIDTH_DP", "DEFAULT_WIDTH_DP", "", "SHADOW_COLOR", "Ljava/lang/String;", "", "SHADOW_DY_DP", "F", "SHADOW_RADIUS_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.FleetMarkerPillPin$a */
    /* loaded from: classes4.dex */
    public static final class C16506a {
        public /* synthetic */ C16506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16506a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetMarkerPillPin(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setFlags(1);
        Float valueOf = Float.valueOf(2.5f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        float m12002a = C49347td3.m12002a(valueOf, context2);
        Float valueOf2 = Float.valueOf(1.5f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint.setShadowLayer(m12002a, 0.0f, C49347td3.m12002a(valueOf2, context3), Color.parseColor("#80000000"));
        this.f67342b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f67343c = paint2;
        this.f67344d = new Path();
        this.f67345e = new Path();
    }

    /* renamed from: c */
    public static final int m54580c(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* renamed from: d */
    public static final int m54579d(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* renamed from: a */
    public final void m54582a(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        Path path = this.f67344d;
        path.reset();
        float f = 2;
        float strokeWidth = this.f67343c.getStrokeWidth() / f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() - strokeWidth;
        path.moveTo(measuredWidth, measuredHeight);
        float measuredHeight2 = getMeasuredHeight() * 0.1837931f;
        float f2 = measuredHeight - measuredHeight2;
        float f3 = 1.282364f * measuredHeight2 * 0.5f;
        path.lineTo(measuredWidth + f3, f2);
        float measuredHeight3 = ((getMeasuredHeight() - measuredHeight2) - (f * strokeWidth)) / 2.0f;
        path.lineTo(getMeasuredWidth() - measuredHeight3, f2);
        path.arcTo(getMeasuredWidth() - (f * measuredHeight3), strokeWidth, getMeasuredWidth() - strokeWidth, f2, 90.0f, -180.0f, false);
        path.lineTo(measuredHeight3, strokeWidth);
        path.arcTo(strokeWidth, strokeWidth, measuredHeight3 * 2.0f, f2, -90.0f, -180.0f, false);
        path.lineTo(measuredWidth - f3, f2);
        path.lineTo(measuredWidth, measuredHeight);
        canvas.drawPath(this.f67344d, this.f67342b);
        canvas.drawPath(this.f67344d, this.f67343c);
    }

    /* renamed from: b */
    public final void m54581b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.FleetMarkerPillPin);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…eable.FleetMarkerPillPin)");
        try {
            this.f67343c.setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(C34290Ll4.FleetMarkerPillPin_outlineStrokeWidth, (int) C49347td3.m12001b(2)));
            this.f67343c.setColor(obtainStyledAttributes.getColor(C34290Ll4.FleetMarkerPillPin_outlineColor, -1));
            this.f67342b.setColor(obtainStyledAttributes.getColor(C34290Ll4.FleetMarkerPillPin_android_color, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m54582a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        if (m54580c(i) == 1073741824 && m54580c(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else if (m54580c(i) == 0 && m54580c(i2) == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setMeasuredDimension((int) C49347td3.m12002a(42, context), (int) C49347td3.m12002a(38, context2));
        } else if (m54580c(i) == 1073741824) {
            setMeasuredDimension(m54579d(i), (int) (m54579d(i) * 0.9047619f));
        } else if (m54580c(i2) == 1073741824) {
            setMeasuredDimension((int) (m54579d(i2) * 1.1052631f), m54579d(i2));
        } else if (m54579d(i) < m54579d(i2)) {
            setMeasuredDimension(m54579d(i), (int) (m54579d(i) * 0.9047619f));
        } else {
            setMeasuredDimension((int) (m54579d(i2) * 1.1052631f), m54579d(i2));
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
    }

    public final void setColor(int i) {
        this.f67342b.setColor(i);
        invalidate();
    }

    public final void setOutlineColor(int i) {
        this.f67343c.setColor(i);
        invalidate();
    }

    public final void setOutlineWidth(float f) {
        this.f67343c.setStrokeWidth(f);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetMarkerPillPin(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setFlags(1);
        Float valueOf = Float.valueOf(2.5f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        float m12002a = C49347td3.m12002a(valueOf, context2);
        Float valueOf2 = Float.valueOf(1.5f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint.setShadowLayer(m12002a, 0.0f, C49347td3.m12002a(valueOf2, context3), Color.parseColor("#80000000"));
        this.f67342b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f67343c = paint2;
        this.f67344d = new Path();
        this.f67345e = new Path();
        m54581b(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetMarkerPillPin(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setFlags(1);
        Float valueOf = Float.valueOf(2.5f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        float m12002a = C49347td3.m12002a(valueOf, context2);
        Float valueOf2 = Float.valueOf(1.5f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint.setShadowLayer(m12002a, 0.0f, C49347td3.m12002a(valueOf2, context3), Color.parseColor("#80000000"));
        this.f67342b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f67343c = paint2;
        this.f67344d = new Path();
        this.f67345e = new Path();
        m54581b(attrs);
    }
}
