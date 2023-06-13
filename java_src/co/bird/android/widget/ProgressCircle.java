package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 92\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105B\u0019\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b4\u00106B!\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b4\u00108J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0014\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010+\u001a\u0004\u0018\u00010$2\b\u0010\u001c\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00101\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006:"}, m28432d2 = {"Lco/bird/android/widget/ProgressCircle;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/util/AttributeSet;", "attrs", "b", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "backgroundPaint", "c", "progressPaint", DateTokenConverter.CONVERTER_KEY, "pointerPaint", "Landroid/graphics/RectF;", "e", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "clipRect", "value", "g", "I", "getProgress", "()I", "setProgress", "(I)V", "progress", "Landroid/graphics/drawable/Drawable;", "h", "Landroid/graphics/drawable/Drawable;", "getPointer", "()Landroid/graphics/drawable/Drawable;", "setPointer", "(Landroid/graphics/drawable/Drawable;)V", "pointer", "", C17296a.f69688o, "()F", "setProgressWidth", "(F)V", "progressWidth", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "i", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProgressCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressCircle.kt\nco/bird/android/widget/ProgressCircle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* loaded from: classes4.dex */
public final class ProgressCircle extends View {

    /* renamed from: i */
    public static final C16561a f67518i = new C16561a(null);

    /* renamed from: b */
    public Paint f67519b;

    /* renamed from: c */
    public Paint f67520c;

    /* renamed from: d */
    public final Paint f67521d;

    /* renamed from: e */
    public RectF f67522e;

    /* renamed from: f */
    public final Rect f67523f;

    /* renamed from: g */
    public int f67524g;

    /* renamed from: h */
    public Drawable f67525h;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/widget/ProgressCircle$a;", "", "", "DEFAULT_BACKGROUND_COLOR_HEX", "Ljava/lang/String;", "", "DEFAULT_PROGRESS_WIDTH_DP", "I", "DEFAULT_SHADOW_COLOR", "", "POINTER_DRAWABLE_RATIO", "F", "POINTER_SHADOW_DY_DP", "POINTER_SHADOW_RADIUS_DP", "POINTER_SIZE_RATIO", "PROGRESS_START_ANGLE_DEGREES", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ProgressCircle$a */
    /* loaded from: classes4.dex */
    public static final class C16561a {
        public /* synthetic */ C16561a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16561a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressCircle(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.birdWhite));
        this.f67521d = paint;
        this.f67522e = new RectF();
        this.f67523f = new Rect();
        m54465c(this, null, 1, null);
    }

    /* renamed from: c */
    public static /* synthetic */ void m54465c(ProgressCircle progressCircle, AttributeSet attributeSet, int i, Object obj) {
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        progressCircle.m54466b(attributeSet);
    }

    /* renamed from: a */
    public final float m54467a() {
        Paint paint = this.f67519b;
        if (paint != null) {
            return paint.getStrokeWidth();
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void m54466b(AttributeSet attributeSet) {
        TypedArray typedArray;
        int parseColor;
        int m94301c;
        int m12002a;
        int parseColor2;
        Drawable drawable = null;
        if (attributeSet != null) {
            typedArray = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.ProgressCircle);
        } else {
            typedArray = null;
        }
        if (typedArray != null) {
            parseColor = typedArray.getColor(C34290Ll4.ProgressCircle_backgroundColor, Color.parseColor("#EDEDED"));
        } else {
            parseColor = Color.parseColor("#EDEDED");
        }
        if (typedArray != null) {
            m94301c = typedArray.getColor(C34290Ll4.ProgressCircle_progressColor, NA0.m94301c(getContext(), C32364Df4.birdNewRoad));
        } else {
            m94301c = NA0.m94301c(getContext(), C32364Df4.birdNewRoad);
        }
        if (typedArray != null) {
            int i = C34290Ll4.ProgressCircle_progressWidth;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            m12002a = typedArray.getDimensionPixelSize(i, (int) C49347td3.m12002a(16, context));
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            m12002a = (int) C49347td3.m12002a(16, context2);
        }
        if (typedArray != null) {
            parseColor2 = typedArray.getColor(C34290Ll4.ProgressCircle_shadowColor, Color.parseColor("#40000000"));
        } else {
            parseColor2 = Color.parseColor("#40000000");
        }
        Paint paint = new Paint(1);
        paint.setColor(parseColor);
        float f = m12002a;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        this.f67519b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(m94301c);
        paint2.setStrokeWidth(f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        float m12002a2 = C49347td3.m12002a(3, context3);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        paint2.setShadowLayer(m12002a2, 0.0f, C49347td3.m12002a(2, context4), parseColor2);
        this.f67520c = paint2;
        Paint paint3 = this.f67521d;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        float m12002a3 = C49347td3.m12002a(6, context5);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        paint3.setShadowLayer(m12002a3, 0.0f, C49347td3.m12002a(4, context6), parseColor2);
        int i2 = 0;
        if (typedArray != null) {
            i2 = typedArray.getInt(C34290Ll4.ProgressCircle_progress, 0);
        }
        setProgress(i2);
        if (typedArray != null) {
            drawable = typedArray.getDrawable(C34290Ll4.ProgressCircle_pointerDrawable);
        }
        setPointer(drawable);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        float f = (this.f67524g / 100.0f) * 360;
        Paint paint = this.f67519b;
        if (paint != null && canvas != null) {
            canvas.drawArc(this.f67522e, 0.0f, 360.0f, false, paint);
        }
        Paint paint2 = this.f67520c;
        if (paint2 != null && canvas != null) {
            canvas.drawArc(this.f67522e, 270.0f, f, false, paint2);
        }
        if (this.f67525h != null) {
            float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2;
            float f2 = 2;
            float m54467a = min - (m54467a() / f2);
            double radians = Math.toRadians((f + 270.0f) % 360.0d);
            float m54467a2 = (m54467a() * 1.1f) / f2;
            float cos = (((float) Math.cos(radians)) * m54467a) + min;
            float sin = min + (m54467a * ((float) Math.sin(radians)));
            if (canvas != null) {
                canvas.drawCircle(cos, sin, m54467a2, this.f67521d);
            }
            float f3 = m54467a2 * f2 * 0.6f;
            float f4 = f3 / f2;
            float f5 = cos - f4;
            float f6 = sin - f4;
            float f7 = f5 + f3;
            float f8 = f3 + f6;
            Drawable drawable2 = this.f67525h;
            if (drawable2 != null) {
                drawable2.setBounds((int) f5, (int) f6, (int) f7, (int) f8);
            }
            if (canvas != null && (drawable = this.f67525h) != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        super.onMeasure(i, i2);
        float m54467a = m54467a() / 2;
        float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) - m54467a;
        this.f67522e.set(m54467a, m54467a, min, min);
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

    public final void setPointer(Drawable drawable) {
        this.f67525h = drawable;
        invalidate();
    }

    public final void setProgress(int i) {
        this.f67524g = i;
        invalidate();
    }

    public final void setProgressWidth(float f) {
        Paint paint = this.f67519b;
        if (paint != null) {
            paint.setStrokeWidth(f);
        }
        Paint paint2 = this.f67520c;
        if (paint2 != null) {
            paint2.setStrokeWidth(f);
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint(1);
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.birdWhite));
        this.f67521d = paint;
        this.f67522e = new RectF();
        this.f67523f = new Rect();
        m54466b(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressCircle(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint(1);
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.birdWhite));
        this.f67521d = paint;
        this.f67522e = new RectF();
        this.f67523f = new Rect();
        m54466b(attrs);
    }
}
