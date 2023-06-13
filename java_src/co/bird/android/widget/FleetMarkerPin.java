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
import co.bird.android.model.persistence.nestedstructures.FleetMarkerPinShape;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002\u000f\u0011B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<B\u0019\b\u0016\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b;\u0010=B!\b\u0016\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010>\u001a\u00020\u0002¢\u0006\u0004\b;\u0010?J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R*\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010#\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R$\u0010/\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00102\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00108\u001a\u0002032\u0006\u0010\u0016\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006@"}, m28432d2 = {"Lco/bird/android/widget/FleetMarkerPin;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", DateTokenConverter.CONVERTER_KEY, "c", "e", C17296a.f69688o, "f", "b", "Landroid/util/AttributeSet;", "attrs", "h", "Lco/bird/android/widget/FleetMarkerPin$b;", "value", "Lco/bird/android/widget/FleetMarkerPin$b;", "getPinStyle", "()Lco/bird/android/widget/FleetMarkerPin$b;", "setPinStyle", "(Lco/bird/android/widget/FleetMarkerPin$b;)V", "pinStyle", "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;", "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;", "getPinShape", "()Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;", "setPinShape", "(Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;)V", "pinShape", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "outlinePaint", "innerPaint", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "g", "()I", "setColor", "(I)V", "color", "getOutlineColor", "setOutlineColor", "outlineColor", "", "getOutlineWidth", "()F", "setOutlineWidth", "(F)V", "outlineWidth", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetMarkerPin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetMarkerPin.kt\nco/bird/android/widget/FleetMarkerPin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* loaded from: classes4.dex */
public final class FleetMarkerPin extends View {

    /* renamed from: g */
    public static final C16507a f67346g = new C16507a(null);

    /* renamed from: b */
    public EnumC16508b f67347b;

    /* renamed from: c */
    public FleetMarkerPinShape f67348c;

    /* renamed from: d */
    public final Paint f67349d;

    /* renamed from: e */
    public final Paint f67350e;

    /* renamed from: f */
    public final Path f67351f;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/widget/FleetMarkerPin$a;", "", "", "DEFAULT_HEIGHT_CIRCLE_DP", "I", "DEFAULT_HEIGHT_CIRCLE_NO_ANCHOR_DP", "DEFAULT_HEIGHT_TEARDROP_DP", "DEFAULT_WIDTH_CIRCLE_DP", "DEFAULT_WIDTH_CIRCLE_NO_ANCHOR_DP", "DEFAULT_WIDTH_TEARDROP_DP", "", "SHADOW_COLOR", "Ljava/lang/String;", "", "SHADOW_DY_DP", "F", "SHADOW_RADIUS_DP", "STROKE_WIDTH_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.FleetMarkerPin$a */
    /* loaded from: classes4.dex */
    public static final class C16507a {
        public /* synthetic */ C16507a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16507a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/widget/FleetMarkerPin$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.FleetMarkerPin$b */
    /* loaded from: classes4.dex */
    public enum EnumC16508b {
        STANDARD,
        SMALL
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.FleetMarkerPin$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16509c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FleetMarkerPinShape.values().length];
            try {
                iArr[FleetMarkerPinShape.TEARDROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FleetMarkerPinShape.CIRCLE_NO_ANCHOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FleetMarkerPinShape.CIRCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FleetMarkerPinShape.SQUARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC16508b.values().length];
            try {
                iArr2[EnumC16508b.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC16508b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"co/bird/android/widget/FleetMarkerPin$d", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.FleetMarkerPin$d */
    /* loaded from: classes4.dex */
    public static final class C16510d extends ViewOutlineProvider {
        public C16510d() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                outline.setConvexPath(FleetMarkerPin.this.f67351f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetMarkerPin(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67347b = EnumC16508b.STANDARD;
        this.f67348c = FleetMarkerPinShape.CIRCLE;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setFlags(1);
        this.f67349d = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setFlags(1);
        Float valueOf = Float.valueOf(2.5f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        float m12002a = C49347td3.m12002a(valueOf, context2);
        Float valueOf2 = Float.valueOf(1.5f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint2.setShadowLayer(m12002a, 0.0f, C49347td3.m12002a(valueOf2, context3), Color.parseColor("#80000000"));
        this.f67350e = paint2;
        this.f67351f = new Path();
    }

    /* renamed from: i */
    public static final int m54570i(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* renamed from: j */
    public static final int m54569j(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* renamed from: a */
    public final void m54578a(Canvas canvas) {
        float strokeWidth = this.f67349d.getStrokeWidth() / 2;
        float measuredWidth = getMeasuredWidth() - strokeWidth;
        float measuredHeight = getMeasuredHeight() - strokeWidth;
        canvas.drawOval(strokeWidth, strokeWidth, measuredWidth, measuredHeight, this.f67350e);
        canvas.drawOval(strokeWidth, strokeWidth, measuredWidth, measuredHeight, this.f67349d);
    }

    /* renamed from: b */
    public final void m54577b(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float f = 2;
        float measuredWidth2 = (getMeasuredWidth() - measuredWidth) / f;
        float measuredHeight = (getMeasuredHeight() - measuredWidth) / f;
        float f2 = measuredWidth2 + measuredWidth;
        float f3 = measuredWidth + measuredHeight;
        canvas.drawOval(measuredWidth2, measuredHeight, f2, f3, this.f67350e);
        canvas.drawOval(measuredWidth2, measuredHeight, f2, f3, this.f67349d);
    }

    /* renamed from: c */
    public final void m54576c(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float f = 2;
        float measuredWidth2 = (getMeasuredWidth() - measuredWidth) / f;
        float measuredHeight = (getMeasuredHeight() - measuredWidth) / f;
        float f2 = measuredWidth2 + measuredWidth;
        float f3 = measuredWidth + measuredHeight;
        canvas.drawRect(measuredWidth2, measuredHeight, f2, f3, this.f67350e);
        canvas.drawRect(measuredWidth2, measuredHeight, f2, f3, this.f67349d);
    }

    /* renamed from: d */
    public final void m54575d(Canvas canvas) {
        Path path = this.f67351f;
        path.reset();
        float f = 2;
        float strokeWidth = this.f67349d.getStrokeWidth() / f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() - strokeWidth;
        path.moveTo(measuredWidth, measuredHeight);
        float measuredHeight2 = (getMeasuredHeight() - getMeasuredWidth()) / 2.0f;
        float f2 = measuredWidth + measuredHeight2;
        double d = 2;
        float measuredWidth2 = (getMeasuredWidth() / 2.0f) + ((float) Math.sqrt(((float) Math.pow(getMeasuredWidth() / 2.0f, d)) - ((float) Math.pow(measuredHeight2, d))));
        path.lineTo(f2, measuredWidth2);
        float f3 = measuredWidth2 + strokeWidth;
        path.lineTo(getMeasuredWidth() - strokeWidth, f3);
        path.lineTo(getMeasuredWidth() - strokeWidth, strokeWidth);
        path.lineTo(0.0f, strokeWidth);
        path.lineTo(0.0f, f3);
        path.lineTo(f2 - (measuredHeight2 * f), measuredWidth2);
        path.lineTo(measuredWidth, measuredHeight);
        canvas.drawPath(this.f67351f, this.f67350e);
        canvas.drawPath(this.f67351f, this.f67349d);
    }

    /* renamed from: e */
    public final void m54574e(Canvas canvas) {
        float measuredHeight;
        float sqrt;
        Path path = this.f67351f;
        path.reset();
        float f = 2;
        float strokeWidth = this.f67349d.getStrokeWidth() / f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight2 = getMeasuredHeight() - strokeWidth;
        path.moveTo(measuredWidth, measuredHeight2);
        double d = 2;
        path.lineTo(measuredWidth + ((getMeasuredHeight() - getMeasuredWidth()) / 2.0f), (getMeasuredWidth() / 2.0f) + ((float) Math.sqrt(((float) Math.pow(getMeasuredWidth() / 2.0f, d)) - ((float) Math.pow(measuredHeight, d)))));
        float degrees = (float) Math.toDegrees((float) Math.atan(measuredHeight / sqrt));
        path.arcTo(strokeWidth, strokeWidth, getMeasuredWidth() - strokeWidth, getMeasuredWidth() - strokeWidth, 90.0f - degrees, -(360.0f - (f * degrees)), false);
        path.lineTo(measuredWidth, measuredHeight2);
        canvas.drawPath(this.f67351f, this.f67350e);
        canvas.drawPath(this.f67351f, this.f67349d);
    }

    /* renamed from: f */
    public final void m54573f(Canvas canvas) {
        double m29880a;
        double m29880a2;
        Path path = this.f67351f;
        path.reset();
        float f = 2;
        float strokeWidth = this.f67349d.getStrokeWidth() / f;
        float measuredWidth = (getMeasuredWidth() - strokeWidth) / 2.0f;
        float measuredWidth2 = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() - strokeWidth;
        path.moveTo(measuredWidth2, measuredHeight);
        float measuredHeight2 = (getMeasuredHeight() * 7) / 9.0f;
        double d = measuredWidth;
        m29880a = C43536jp1.m29880a(15.0f);
        float cos = ((float) (Math.cos(m29880a) * d)) + measuredWidth;
        m29880a2 = C43536jp1.m29880a(15.0f);
        path.quadTo((getMeasuredWidth() * 7) / 8.0f, measuredHeight2, cos, measuredWidth + ((float) (d * Math.sin(m29880a2))));
        path.arcTo(strokeWidth, strokeWidth, getMeasuredWidth() - strokeWidth, getMeasuredWidth() - (f * strokeWidth), 15.0f, -((15.0f * f) + 180.0f), false);
        path.quadTo(getMeasuredWidth() / 8.0f, measuredHeight2, measuredWidth2, measuredHeight);
        canvas.drawPath(this.f67351f, this.f67350e);
        canvas.drawPath(this.f67351f, this.f67349d);
    }

    /* renamed from: g */
    public final int m54572g() {
        return this.f67350e.getColor();
    }

    @Override // android.view.View
    public ViewOutlineProvider getOutlineProvider() {
        return new C16510d();
    }

    /* renamed from: h */
    public final void m54571h(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.FleetMarkerPin);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…styleable.FleetMarkerPin)");
        try {
            Paint paint = this.f67349d;
            int i = C34290Ll4.FleetMarkerPin_outlineStrokeWidth;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            paint.setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(i, (int) C49347td3.m12002a(1, context)));
            this.f67349d.setColor(obtainStyledAttributes.getColor(C34290Ll4.FleetMarkerPin_outlineColor, -1));
            this.f67350e.setColor(obtainStyledAttributes.getColor(C34290Ll4.FleetMarkerPin_android_color, -1));
            setPinStyle(EnumC16508b.values()[obtainStyledAttributes.getInt(C34290Ll4.FleetMarkerPin_pinStyle, 0)]);
            setPinShape(FleetMarkerPinShape.values()[obtainStyledAttributes.getInt(C34290Ll4.FleetMarkerPin_pinShape, 0)]);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i = C16509c.$EnumSwitchMapping$1[this.f67347b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = C16509c.$EnumSwitchMapping$0[this.f67348c.ordinal()];
                if (i2 != 1) {
                    if (i2 != 3) {
                        if (i2 == 4 && canvas != null) {
                            m54576c(canvas);
                            return;
                        }
                        return;
                    } else if (canvas != null) {
                        m54577b(canvas);
                        return;
                    } else {
                        return;
                    }
                } else if (canvas != null) {
                    m54577b(canvas);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        int i3 = C16509c.$EnumSwitchMapping$0[this.f67348c.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4 && canvas != null) {
                        m54575d(canvas);
                    }
                } else if (canvas != null) {
                    m54574e(canvas);
                }
            } else if (canvas != null) {
                m54578a(canvas);
            }
        } else if (canvas != null) {
            m54573f(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        ViewGroup viewGroup;
        int i4 = C16509c.$EnumSwitchMapping$0[this.f67348c.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                i3 = 46;
            } else {
                i3 = 40;
            }
        } else {
            i3 = 49;
        }
        if (m54570i(i) == 1073741824 && m54570i(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else if (m54570i(i) == 0 && m54570i(i2) == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Integer valueOf = Integer.valueOf(i3);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setMeasuredDimension((int) C49347td3.m12002a(40, context), (int) C49347td3.m12002a(valueOf, context2));
        } else if (m54570i(i) == 1073741824) {
            setMeasuredDimension(m54569j(i), (int) (m54569j(i) * (i3 / 40)));
        } else if (m54570i(i2) == 1073741824) {
            setMeasuredDimension((int) (m54569j(i2) * (40 / i3)), m54569j(i2));
        } else if (m54569j(i) < m54569j(i2)) {
            setMeasuredDimension(m54569j(i), (int) (m54569j(i) * (i3 / 40)));
        } else {
            setMeasuredDimension((int) (m54569j(i2) * (40 / i3)), m54569j(i2));
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
        this.f67350e.setColor(i);
        invalidate();
    }

    public final void setOutlineColor(int i) {
        this.f67349d.setColor(i);
        invalidate();
    }

    public final void setOutlineWidth(float f) {
        this.f67349d.setStrokeWidth(f);
        invalidate();
    }

    public final void setPinShape(FleetMarkerPinShape value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67348c = value;
        requestLayout();
    }

    public final void setPinStyle(EnumC16508b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67347b = value;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetMarkerPin(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67347b = EnumC16508b.STANDARD;
        this.f67348c = FleetMarkerPinShape.CIRCLE;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setFlags(1);
        this.f67349d = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setFlags(1);
        Float valueOf = Float.valueOf(2.5f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        float m12002a = C49347td3.m12002a(valueOf, context2);
        Float valueOf2 = Float.valueOf(1.5f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint2.setShadowLayer(m12002a, 0.0f, C49347td3.m12002a(valueOf2, context3), Color.parseColor("#80000000"));
        this.f67350e = paint2;
        this.f67351f = new Path();
        m54571h(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetMarkerPin(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f67347b = EnumC16508b.STANDARD;
        this.f67348c = FleetMarkerPinShape.CIRCLE;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setFlags(1);
        this.f67349d = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setFlags(1);
        Float valueOf = Float.valueOf(2.5f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        float m12002a = C49347td3.m12002a(valueOf, context2);
        Float valueOf2 = Float.valueOf(1.5f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint2.setShadowLayer(m12002a, 0.0f, C49347td3.m12002a(valueOf2, context3), Color.parseColor("#80000000"));
        this.f67350e = paint2;
        this.f67351f = new Path();
        m54571h(attrs);
    }
}
