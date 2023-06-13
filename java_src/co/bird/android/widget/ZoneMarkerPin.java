package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u0001\fB\u0011\b\u0016\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100B\u0019\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b/\u00101B!\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b/\u00103J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002R*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010)\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R$\u0010,\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016¨\u00065"}, m28432d2 = {"Lco/bird/android/widget/ZoneMarkerPin;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "draw", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", C17296a.f69688o, "Landroid/util/AttributeSet;", "attrs", "b", "", "value", "F", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "cornerRadius", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "outlinePaint", DateTokenConverter.CONVERTER_KEY, "innerPaint", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", "path", "getColor", "()I", "setColor", "(I)V", "color", "getOutlineColor", "setOutlineColor", "outlineColor", "getOutlineWidth", "setOutlineWidth", "outlineWidth", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "f", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneMarkerPin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneMarkerPin.kt\nco/bird/android/widget/ZoneMarkerPin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"})
/* loaded from: classes4.dex */
public final class ZoneMarkerPin extends View {

    /* renamed from: f */
    public static final C16595a f67701f = new C16595a(null);

    /* renamed from: b */
    public float f67702b;

    /* renamed from: c */
    public final Paint f67703c;

    /* renamed from: d */
    public final Paint f67704d;

    /* renamed from: e */
    public final Path f67705e;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/widget/ZoneMarkerPin$a;", "", "", "DEFAULT_CORNER_RADIUS_DP", "I", "DEFAULT_HEIGHT_DP", "DEFAULT_STROKE_WIDTH_DP", "DEFAULT_WIDTH_DP", "", "SHADOW_COLOR", "Ljava/lang/String;", "", "SHADOW_DY_DP", "F", "SHADOW_RADIUS_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ZoneMarkerPin$a */
    /* loaded from: classes4.dex */
    public static final class C16595a {
        public /* synthetic */ C16595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16595a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"co/bird/android/widget/ZoneMarkerPin$b", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ZoneMarkerPin$b */
    /* loaded from: classes4.dex */
    public static final class C16596b extends ViewOutlineProvider {
        public C16596b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                outline.setConvexPath(ZoneMarkerPin.this.f67705e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneMarkerPin(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67702b = C49347td3.m12001b(2);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setFlags(1);
        this.f67703c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setFlags(1);
        paint2.setShadowLayer(C49347td3.m12001b(Float.valueOf(2.5f)), 0.0f, C49347td3.m12001b(Float.valueOf(1.5f)), Color.parseColor("#80000000"));
        this.f67704d = paint2;
        this.f67705e = new Path();
    }

    /* renamed from: c */
    public static final int m54347c(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* renamed from: d */
    public static final int m54346d(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* renamed from: a */
    public final void m54349a(Canvas canvas) {
        Path path = this.f67705e;
        path.reset();
        float strokeWidth = this.f67703c.getStrokeWidth() / 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() - strokeWidth;
        path.moveTo(measuredWidth, measuredHeight);
        float measuredHeight2 = ((getMeasuredHeight() - this.f67703c.getStrokeWidth()) * 16) / 19.0f;
        float f = ((measuredHeight2 / 5) * 1.2777778f) / 2;
        path.lineTo(measuredWidth + f, measuredHeight2);
        float measuredWidth2 = (getMeasuredWidth() - strokeWidth) - this.f67702b;
        path.lineTo(measuredWidth2, measuredHeight2);
        float f2 = this.f67702b;
        float f3 = measuredHeight2 - f2;
        HJ3.m104035a(path, measuredWidth2 - f2, f3 - f2, measuredWidth2 + f2, f3 + f2, 90.0f, -90.0f, false);
        float f4 = strokeWidth + this.f67702b;
        path.lineTo(getMeasuredWidth() - strokeWidth, f4);
        float f5 = this.f67702b;
        HJ3.m104035a(path, measuredWidth2 - f5, f4 - f5, measuredWidth2 + f5, f4 + f5, 0.0f, -90.0f, false);
        float f6 = strokeWidth + this.f67702b;
        path.lineTo(f6, strokeWidth);
        float f7 = this.f67702b;
        HJ3.m104035a(path, f6 - f7, f4 - f7, f6 + f7, f4 + f7, 270.0f, -90.0f, false);
        path.lineTo(strokeWidth, f3);
        float f8 = this.f67702b;
        HJ3.m104035a(path, f6 - f8, f3 - f8, f6 + f8, f3 + f8, 180.0f, -90.0f, false);
        path.lineTo(measuredWidth - f, measuredHeight2);
        path.lineTo(measuredWidth, measuredHeight);
        canvas.drawPath(this.f67705e, this.f67704d);
        canvas.drawPath(this.f67705e, this.f67703c);
    }

    /* renamed from: b */
    public final void m54348b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.ZoneMarkerPin);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.ZoneMarkerPin)");
        try {
            this.f67703c.setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(C34290Ll4.ZoneMarkerPin_outlineStrokeWidth, (int) C49347td3.m12001b(1)));
            this.f67703c.setColor(obtainStyledAttributes.getColor(C34290Ll4.ZoneMarkerPin_outlineColor, -1));
            this.f67704d.setColor(obtainStyledAttributes.getColor(C34290Ll4.ZoneMarkerPin_android_color, -1));
            setCornerRadius(obtainStyledAttributes.getDimensionPixelSize(C34290Ll4.ZoneMarkerPin_cornerRadius, (int) C49347td3.m12001b(2)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            m54349a(canvas);
        }
    }

    @Override // android.view.View
    public ViewOutlineProvider getOutlineProvider() {
        return new C16596b();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        if (m54347c(i) == 1073741824 && m54347c(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else if (m54347c(i) == 0 && m54347c(i2) == 0) {
            setMeasuredDimension((int) C49347td3.m12001b(52), (int) C49347td3.m12001b(38));
        } else if (m54347c(i) == 1073741824) {
            setMeasuredDimension(m54346d(i), (int) (m54346d(i) * 0.7307692f));
        } else if (m54347c(i2) == 1073741824) {
            setMeasuredDimension((int) (m54346d(i2) * 1.3684211f), m54346d(i2));
        } else if (m54346d(i) < m54346d(i2)) {
            setMeasuredDimension(m54346d(i), (int) (m54346d(i) * 0.7307692f));
        } else {
            setMeasuredDimension((int) (m54346d(i2) * 1.3684211f), m54346d(i2));
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
        this.f67704d.setColor(i);
        invalidate();
    }

    public final void setCornerRadius(float f) {
        this.f67702b = f;
        invalidate();
    }

    public final void setOutlineColor(int i) {
        this.f67703c.setColor(i);
        invalidate();
    }

    public final void setOutlineWidth(float f) {
        this.f67703c.setStrokeWidth(f);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneMarkerPin(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67702b = C49347td3.m12001b(2);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setFlags(1);
        this.f67703c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setFlags(1);
        paint2.setShadowLayer(C49347td3.m12001b(Float.valueOf(2.5f)), 0.0f, C49347td3.m12001b(Float.valueOf(1.5f)), Color.parseColor("#80000000"));
        this.f67704d = paint2;
        this.f67705e = new Path();
        m54348b(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneMarkerPin(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67702b = C49347td3.m12001b(2);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setFlags(1);
        this.f67703c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setFlags(1);
        paint2.setShadowLayer(C49347td3.m12001b(Float.valueOf(2.5f)), 0.0f, C49347td3.m12001b(Float.valueOf(1.5f)), Color.parseColor("#80000000"));
        this.f67704d = paint2;
        this.f67705e = new Path();
        m54348b(attrs);
    }
}
