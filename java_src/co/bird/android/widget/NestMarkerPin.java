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
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u0001:\u0002\n\u000bB\u0011\b\u0016\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102B\u0019\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b1\u00103B!\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u00104\u001a\u00020\u0002¢\u0006\u0004\b1\u00105J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R*\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR$\u0010%\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010.\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00067"}, m28432d2 = {"Lco/bird/android/widget/NestMarkerPin;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", C17296a.f69688o, "b", "Landroid/util/AttributeSet;", "attrs", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "innerPaint", "c", "outlinePaint", "Lco/bird/android/widget/NestMarkerPin$b;", "value", "Lco/bird/android/widget/NestMarkerPin$b;", "()Lco/bird/android/widget/NestMarkerPin$b;", "setPinStyle", "(Lco/bird/android/widget/NestMarkerPin$b;)V", "pinStyle", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", "anchorPath", "f", "bubblePath", "getColor", "()I", "setColor", "(I)V", "color", "getOutlineColor", "setOutlineColor", "outlineColor", "", "getOutlineWidth", "()F", "setOutlineWidth", "(F)V", "outlineWidth", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NestMarkerPin extends View {

    /* renamed from: g */
    public static final C16541a f67409g = new C16541a(null);

    /* renamed from: b */
    public final Paint f67410b;

    /* renamed from: c */
    public final Paint f67411c;

    /* renamed from: d */
    public EnumC16542b f67412d;

    /* renamed from: e */
    public final Path f67413e;

    /* renamed from: f */
    public final Path f67414f;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/widget/NestMarkerPin$a;", "", "", "DEFAULT_HEIGHT_DP", "I", "DEFAULT_STROKE_WIDTH_DP", "DEFAULT_WIDTH_DP", "", "SHADOW_COLOR", "Ljava/lang/String;", "", "SHADOW_DY_DP", "F", "SHADOW_RADIUS_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.NestMarkerPin$a */
    /* loaded from: classes4.dex */
    public static final class C16541a {
        public /* synthetic */ C16541a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16541a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/widget/NestMarkerPin$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.NestMarkerPin$b */
    /* loaded from: classes4.dex */
    public enum EnumC16542b {
        STANDARD,
        SMALL
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.NestMarkerPin$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16543c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC16542b.values().length];
            try {
                iArr[EnumC16542b.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16542b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestMarkerPin(Context context) {
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
        this.f67410b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f67411c = paint2;
        this.f67412d = EnumC16542b.STANDARD;
        this.f67413e = new Path();
        this.f67414f = new Path();
    }

    /* renamed from: e */
    public static final int m54530e(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* renamed from: f */
    public static final int m54529f(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* renamed from: a */
    public final void m54534a(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        Path path = this.f67413e;
        path.reset();
        float f = 2;
        float strokeWidth = this.f67411c.getStrokeWidth() / f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() - strokeWidth;
        path.moveTo(measuredWidth, measuredHeight);
        float measuredHeight2 = getMeasuredHeight() * 0.15789473f;
        float f2 = measuredHeight - measuredHeight2;
        float f3 = 1.75f * measuredHeight2 * 0.5f;
        path.lineTo(measuredWidth + f3, f2);
        float measuredHeight3 = ((getMeasuredHeight() - measuredHeight2) - (f * strokeWidth)) / 2.0f;
        path.lineTo(getMeasuredWidth() - measuredHeight3, f2);
        path.arcTo(getMeasuredWidth() - (f * measuredHeight3), strokeWidth, getMeasuredWidth() - strokeWidth, f2, 90.0f, -180.0f, false);
        path.lineTo(measuredHeight3, strokeWidth);
        path.arcTo(strokeWidth, strokeWidth, measuredHeight3 * 2.0f, f2, -90.0f, -180.0f, false);
        path.lineTo(measuredWidth - f3, f2);
        path.lineTo(measuredWidth, measuredHeight);
        canvas.drawPath(this.f67413e, this.f67410b);
        canvas.drawPath(this.f67413e, this.f67411c);
    }

    /* renamed from: b */
    public final void m54533b(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float f = 2;
        float measuredWidth2 = (getMeasuredWidth() - measuredWidth) / f;
        float measuredHeight = (getMeasuredHeight() - measuredWidth) / f;
        float f2 = measuredWidth2 + measuredWidth;
        float f3 = measuredWidth + measuredHeight;
        canvas.drawOval(measuredWidth2, measuredHeight, f2, f3, this.f67410b);
        canvas.drawOval(measuredWidth2, measuredHeight, f2, f3, this.f67411c);
    }

    /* renamed from: c */
    public final EnumC16542b m54532c() {
        return this.f67412d;
    }

    /* renamed from: d */
    public final void m54531d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.NestMarkerPin);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.NestMarkerPin)");
        try {
            this.f67411c.setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(C34290Ll4.NestMarkerPin_outlineStrokeWidth, (int) C49347td3.m12001b(2)));
            this.f67411c.setColor(obtainStyledAttributes.getColor(C34290Ll4.NestMarkerPin_outlineColor, -1));
            this.f67410b.setColor(obtainStyledAttributes.getColor(C34290Ll4.NestMarkerPin_android_color, -1));
            setPinStyle(EnumC16542b.values()[obtainStyledAttributes.getInt(C34290Ll4.NestMarkerPin_nestPinStyle, 0)]);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i = C16543c.$EnumSwitchMapping$0[this.f67412d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m54533b(canvas);
                return;
            }
            return;
        }
        m54534a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        if (m54530e(i) == 1073741824 && m54530e(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else if (m54530e(i) == 0 && m54530e(i2) == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setMeasuredDimension((int) C49347td3.m12002a(42, context), (int) C49347td3.m12002a(38, context2));
        } else if (m54530e(i) == 1073741824) {
            setMeasuredDimension(m54529f(i), (int) (m54529f(i) * 0.9047619f));
        } else if (m54530e(i2) == 1073741824) {
            setMeasuredDimension((int) (m54529f(i2) * 1.1052631f), m54529f(i2));
        } else if (m54529f(i) < m54529f(i2)) {
            setMeasuredDimension(m54529f(i), (int) (m54529f(i) * 0.9047619f));
        } else {
            setMeasuredDimension((int) (m54529f(i2) * 1.1052631f), m54529f(i2));
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
        this.f67410b.setColor(i);
        invalidate();
    }

    public final void setOutlineColor(int i) {
        this.f67411c.setColor(i);
        invalidate();
    }

    public final void setOutlineWidth(float f) {
        this.f67411c.setStrokeWidth(f);
        invalidate();
    }

    public final void setPinStyle(EnumC16542b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67412d = value;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestMarkerPin(Context context, AttributeSet attrs) {
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
        this.f67410b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f67411c = paint2;
        this.f67412d = EnumC16542b.STANDARD;
        this.f67413e = new Path();
        this.f67414f = new Path();
        m54531d(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestMarkerPin(Context context, AttributeSet attrs, int i) {
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
        this.f67410b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f67411c = paint2;
        this.f67412d = EnumC16542b.STANDARD;
        this.f67413e = new Path();
        this.f67414f = new Path();
        m54531d(attrs);
    }
}
