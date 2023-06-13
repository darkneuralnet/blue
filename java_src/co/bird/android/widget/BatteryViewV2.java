package co.bird.android.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 U2\u00020\u0001:\u0002\u000b\nB\u0011\b\u0016\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QB\u0019\b\u0016\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bP\u0010RB!\b\u0016\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010S\u001a\u00020\u0002¢\u0006\u0004\bP\u0010TJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002R*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R.\u0010#\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010*\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R#\u0010/\u001a\n ,*\u0004\u0018\u00010+0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b\u0018\u0010.R\u001b\u00102\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b\u001d\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010=\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00105R\u0014\u0010?\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0011\u0010F\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\b0\u0010ER$\u0010H\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0014\"\u0004\bG\u0010\u0016R$\u0010M\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006V"}, m28432d2 = {"Lco/bird/android/widget/BatteryViewV2;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "b", C17296a.f69688o, "e", "Landroid/util/AttributeSet;", "attrs", "i", "", "value", "F", "getBatteryPadding", "()F", "setBatteryPadding", "(F)V", "batteryPadding", "c", "f", "setBatteryLevel", "batteryLevel", "Landroid/content/res/ColorStateList;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/res/ColorStateList;", "getBatteryColorStateList", "()Landroid/content/res/ColorStateList;", "setBatteryColorStateList", "(Landroid/content/res/ColorStateList;)V", "batteryColorStateList", "", "Z", "getUseGradient", "()Z", "setUseGradient", "(Z)V", "useGradient", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "()Landroid/graphics/Bitmap;", "batteryBitmap", "g", "()Landroid/graphics/Canvas;", "batteryCanvas", "Landroid/graphics/Path;", "h", "Landroid/graphics/Path;", "batteryPath", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "batteryPaint", "j", "erasePaint", "k", "outlinePath", "l", "outlinePaint", "Landroid/animation/ArgbEvaluator;", "m", "Landroid/animation/ArgbEvaluator;", "colorEvaluator", "Lco/bird/android/widget/BatteryViewV2$a;", "()Lco/bird/android/widget/BatteryViewV2$a;", "batteryState", "setOutlineStrokeWidth", "outlineStrokeWidth", "getOutlineStrokeColor", "()I", "setOutlineStrokeColor", "(I)V", "outlineStrokeColor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "n", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BatteryViewV2 extends View {

    /* renamed from: n */
    public static final C16460b f67150n = new C16460b(null);

    /* renamed from: o */
    public static final ColorStateList f67151o = new ColorStateList(new int[][]{new int[]{C48775sf4.state_low_battery}, new int[]{C48775sf4.state_medium_battery}, new int[]{C48775sf4.state_high_battery}}, new int[]{Color.parseColor("#FA5050"), Color.parseColor("#F4B02B"), Color.parseColor("#30AA46")});

    /* renamed from: b */
    public float f67152b;

    /* renamed from: c */
    public float f67153c;

    /* renamed from: d */
    public ColorStateList f67154d;

    /* renamed from: e */
    public boolean f67155e;

    /* renamed from: f */
    public final Lazy f67156f;

    /* renamed from: g */
    public final Lazy f67157g;

    /* renamed from: h */
    public final Path f67158h;

    /* renamed from: i */
    public final Paint f67159i;

    /* renamed from: j */
    public final Paint f67160j;

    /* renamed from: k */
    public final Path f67161k;

    /* renamed from: l */
    public final Paint f67162l;

    /* renamed from: m */
    public final ArgbEvaluator f67163m;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/BatteryViewV2$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.BatteryViewV2$a */
    /* loaded from: classes4.dex */
    public enum EnumC16459a {
        LOW,
        MEDIUM,
        HIGH
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/widget/BatteryViewV2$b;", "", "", "DEFAULT_BATTERY_PADDING_DP", "I", "Landroid/content/res/ColorStateList;", "DEFAULT_COLOR_STATE_LIST", "Landroid/content/res/ColorStateList;", "DEFAULT_HEIGHT_DP", "", "DEFAULT_OUTLINE_STROKE_WIDTH_DP", "F", "DEFAULT_WIDTH_DP", "LOW_BATTERY_LEVEL", "MEDIUM_BATTERY_LEVEL", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.BatteryViewV2$b */
    /* loaded from: classes4.dex */
    public static final class C16460b {
        public /* synthetic */ C16460b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16460b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "b", "()Landroid/graphics/Bitmap;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.BatteryViewV2$c */
    /* loaded from: classes4.dex */
    public static final class C16461c extends Lambda implements Function0<Bitmap> {
        public C16461c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Bitmap invoke() {
            return Bitmap.createBitmap(BatteryViewV2.this.getMeasuredWidth(), BatteryViewV2.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/graphics/Canvas;", "b", "()Landroid/graphics/Canvas;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.BatteryViewV2$d */
    /* loaded from: classes4.dex */
    public static final class C16462d extends Lambda implements Function0<Canvas> {
        public C16462d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Canvas invoke() {
            return new Canvas(BatteryViewV2.this.m54767c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryViewV2(Context context) {
        super(context);
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f67152b = C49347td3.m12002a(2, context2);
        this.f67154d = f67151o;
        lazy = LazyKt__LazyJVMKt.lazy(new C16461c());
        this.f67156f = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16462d());
        this.f67157g = lazy2;
        this.f67158h = new Path();
        Paint paint = new Paint(1);
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.birdGreen));
        paint.setStyle(Paint.Style.FILL);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint.setStrokeWidth(C49347td3.m12002a(2, context3));
        this.f67159i = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        paint2.setStrokeWidth(2 * C49347td3.m12002a(2, context4));
        this.f67160j = paint2;
        this.f67161k = new Path();
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.STROKE);
        Float valueOf = Float.valueOf(0.5f);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        paint3.setStrokeWidth(C49347td3.m12002a(valueOf, context5));
        this.f67162l = paint3;
        this.f67163m = new ArgbEvaluator();
    }

    /* renamed from: j */
    public static final int m54760j(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* renamed from: k */
    public static final int m54759k(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* renamed from: a */
    public final void m54769a(Canvas canvas) {
        boolean z = false;
        m54767c().eraseColor(0);
        this.f67158h.reset();
        if (this.f67153c == 0.0f) {
            z = true;
        }
        if (z) {
            return;
        }
        this.f67159i.setColor(m54765e());
        float m54762h = this.f67152b + m54762h();
        float m54762h2 = this.f67152b + m54762h();
        float measuredHeight = getMeasuredHeight() - (this.f67152b + m54762h());
        float measuredWidth = getMeasuredWidth() - (this.f67152b + m54762h());
        float f = measuredHeight - m54762h2;
        this.f67158h.moveTo(m54762h, m54762h2);
        float sin = (float) (f * Math.sin(Math.toRadians(10.0d)));
        float f2 = ((measuredWidth - m54762h) * this.f67153c) + m54762h + (0.5f * sin);
        float f3 = 0.0625f * f;
        float f4 = f2 - f3;
        this.f67158h.lineTo(f4, m54762h2);
        this.f67158h.cubicTo((0.05f * f) + f4, m54762h2 + (0.016f * f), f2, m54762h2 + f3, f2 - (0.004f * f), m54762h2 + (0.08f * f));
        float f5 = f2 - sin;
        this.f67158h.lineTo(f2 - (sin * 0.9f), (0.9f * f) + m54762h2);
        this.f67158h.cubicTo((0.03f * sin) + f5, (0.95f * f) + m54762h2, (0.01f * sin) + f5, m54762h2 + (f * 0.999f), f5 - (sin * 0.25f), measuredHeight);
        this.f67158h.lineTo(m54762h, measuredHeight);
        this.f67158h.lineTo(m54762h, m54762h2);
        m54766d().drawPath(this.f67158h, this.f67159i);
        m54766d().clipPath(this.f67161k);
        m54766d().drawPath(this.f67161k, this.f67160j);
        if (canvas != null) {
            canvas.drawBitmap(m54767c(), 0.0f, 0.0f, (Paint) null);
        }
    }

    /* renamed from: b */
    public final void m54768b(Canvas canvas) {
        if (this.f67161k.isEmpty()) {
            float f = 2;
            float m54762h = m54762h() / f;
            float measuredWidth = getMeasuredWidth() - m54762h;
            float measuredHeight = getMeasuredHeight() - m54762h;
            float f2 = measuredHeight - m54762h;
            float f3 = f2 / f;
            this.f67161k.addArc(m54762h, m54762h, m54762h + f2, measuredHeight, 90.0f, 180.0f);
            this.f67161k.lineTo(measuredWidth - f3, m54762h);
            this.f67161k.addArc(measuredWidth - f2, m54762h, measuredWidth, measuredHeight, 270.0f, 180.0f);
            this.f67161k.lineTo(m54762h + f3, measuredHeight);
        }
        if (canvas != null) {
            canvas.drawPath(this.f67161k, this.f67162l);
        }
    }

    /* renamed from: c */
    public final Bitmap m54767c() {
        return (Bitmap) this.f67156f.getValue();
    }

    /* renamed from: d */
    public final Canvas m54766d() {
        return (Canvas) this.f67157g.getValue();
    }

    /* renamed from: e */
    public final int m54765e() {
        int m54241a;
        boolean z;
        int m54241a2;
        int m54241a3;
        int m54241a4;
        int m54241a5;
        int m54241a6;
        int m54241a7;
        ColorStateList colorStateList = this.f67154d;
        if (colorStateList == null) {
            colorStateList = f67151o;
        }
        if (this.f67155e) {
            float f = this.f67153c;
            if (f <= 0.2f) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                m54241a7 = C16631b.m54241a(colorStateList, context, EnumC16459a.LOW);
                return m54241a7;
            }
            boolean z2 = true;
            if (0.2f <= f && f <= 0.6f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                float f2 = 0.40000004f / 2;
                float f3 = f2 + 0.2f;
                if (0.2f > f || f > f3) {
                    z2 = false;
                }
                if (z2) {
                    ArgbEvaluator argbEvaluator = this.f67163m;
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "context");
                    m54241a5 = C16631b.m54241a(colorStateList, context2, EnumC16459a.LOW);
                    Integer valueOf = Integer.valueOf(m54241a5);
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    m54241a6 = C16631b.m54241a(colorStateList, context3, EnumC16459a.MEDIUM);
                    Object evaluate = argbEvaluator.evaluate((f - 0.2f) / f2, valueOf, Integer.valueOf(m54241a6));
                    Intrinsics.checkNotNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) evaluate).intValue();
                }
                ArgbEvaluator argbEvaluator2 = this.f67163m;
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "context");
                m54241a3 = C16631b.m54241a(colorStateList, context4, EnumC16459a.MEDIUM);
                Integer valueOf2 = Integer.valueOf(m54241a3);
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "context");
                m54241a4 = C16631b.m54241a(colorStateList, context5, EnumC16459a.HIGH);
                Object evaluate2 = argbEvaluator2.evaluate((f - f3) / f2, valueOf2, Integer.valueOf(m54241a4));
                Intrinsics.checkNotNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) evaluate2).intValue();
            }
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "context");
            m54241a2 = C16631b.m54241a(colorStateList, context6, EnumC16459a.HIGH);
            return m54241a2;
        }
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "context");
        m54241a = C16631b.m54241a(colorStateList, context7, m54763g());
        return m54241a;
    }

    /* renamed from: f */
    public final float m54764f() {
        return this.f67153c;
    }

    /* renamed from: g */
    public final EnumC16459a m54763g() {
        float f = this.f67153c;
        if (f <= 0.2f) {
            return EnumC16459a.LOW;
        }
        boolean z = false;
        if (0.2f <= f && f <= 0.6f) {
            z = true;
        }
        if (z) {
            return EnumC16459a.MEDIUM;
        }
        return EnumC16459a.HIGH;
    }

    /* renamed from: h */
    public final float m54762h() {
        return this.f67162l.getStrokeWidth();
    }

    /* renamed from: i */
    public final void m54761i(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.BatteryViewV2);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.BatteryViewV2)");
        try {
            setBatteryLevel(obtainStyledAttributes.getFloat(C34290Ll4.BatteryViewV2_battery_level, 0.0f));
            int i = C34290Ll4.BatteryViewV2_batteryPadding;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            setBatteryPadding(obtainStyledAttributes.getDimensionPixelSize(i, (int) C49347td3.m12002a(2, context)));
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C34290Ll4.BatteryViewV2_batteryColorStateList);
            if (colorStateList == null) {
                colorStateList = f67151o;
            }
            setBatteryColorStateList(colorStateList);
            setUseGradient(obtainStyledAttributes.getBoolean(C34290Ll4.BatteryViewV2_useGradient, true));
            int i2 = C34290Ll4.BatteryViewV2_outlineStrokeWidth;
            Float valueOf = Float.valueOf(0.5f);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setOutlineStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(i2, (int) C49347td3.m12002a(valueOf, context2)));
            setOutlineStrokeColor(obtainStyledAttributes.getColor(C34290Ll4.BatteryViewV2_outlineStrokeColor, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m54768b(canvas);
        m54769a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (m54760j(i) == 1073741824 && m54760j(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else if (m54760j(i) == 0 && m54760j(i2) == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setMeasuredDimension((int) C49347td3.m12002a(40, context), (int) C49347td3.m12002a(16, context2));
        } else if (m54760j(i) == 1073741824) {
            setMeasuredDimension(m54759k(i), (m54759k(i) * 16) / 40);
        } else if (m54760j(i2) == 1073741824) {
            setMeasuredDimension((m54759k(i2) * 40) / 16, m54759k(i2));
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            setMeasuredDimension((int) C49347td3.m12002a(40, context3), (int) C49347td3.m12002a(16, context4));
        }
        this.f67161k.reset();
    }

    public final void setBatteryColorStateList(ColorStateList colorStateList) {
        this.f67154d = colorStateList;
        invalidate();
    }

    public final void setBatteryLevel(float f) {
        float coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
        this.f67153c = coerceIn;
        invalidate();
    }

    public final void setBatteryPadding(float f) {
        this.f67152b = f;
        this.f67160j.setStrokeWidth((2 * f) + m54762h());
        invalidate();
    }

    public final void setOutlineStrokeColor(int i) {
        this.f67162l.setColor(i);
        invalidate();
    }

    public final void setOutlineStrokeWidth(float f) {
        this.f67162l.setStrokeWidth(f);
        this.f67160j.setStrokeWidth(f + (2 * this.f67152b));
        invalidate();
    }

    public final void setUseGradient(boolean z) {
        this.f67155e = z;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryViewV2(Context context, AttributeSet attrs) {
        super(context, attrs);
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f67152b = C49347td3.m12002a(2, context2);
        this.f67154d = f67151o;
        lazy = LazyKt__LazyJVMKt.lazy(new C16461c());
        this.f67156f = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16462d());
        this.f67157g = lazy2;
        this.f67158h = new Path();
        Paint paint = new Paint(1);
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.birdGreen));
        paint.setStyle(Paint.Style.FILL);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint.setStrokeWidth(C49347td3.m12002a(2, context3));
        this.f67159i = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        paint2.setStrokeWidth(2 * C49347td3.m12002a(2, context4));
        this.f67160j = paint2;
        this.f67161k = new Path();
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.STROKE);
        Float valueOf = Float.valueOf(0.5f);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        paint3.setStrokeWidth(C49347td3.m12002a(valueOf, context5));
        this.f67162l = paint3;
        this.f67163m = new ArgbEvaluator();
        m54761i(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryViewV2(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f67152b = C49347td3.m12002a(2, context2);
        this.f67154d = f67151o;
        lazy = LazyKt__LazyJVMKt.lazy(new C16461c());
        this.f67156f = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16462d());
        this.f67157g = lazy2;
        this.f67158h = new Path();
        Paint paint = new Paint(1);
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.birdGreen));
        paint.setStyle(Paint.Style.FILL);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        paint.setStrokeWidth(C49347td3.m12002a(2, context3));
        this.f67159i = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        paint2.setStrokeWidth(2 * C49347td3.m12002a(2, context4));
        this.f67160j = paint2;
        this.f67161k = new Path();
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.STROKE);
        Float valueOf = Float.valueOf(0.5f);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        paint3.setStrokeWidth(C49347td3.m12002a(valueOf, context5));
        this.f67162l = paint3;
        this.f67163m = new ArgbEvaluator();
        m54761i(attrs);
    }
}
