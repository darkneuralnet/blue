package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001fB!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010!J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR$\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006#"}, m28432d2 = {"Lco/bird/android/widget/NestBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/util/AttributeSet;", "attrs", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "innerPaint", "c", "outlinePaint", "value", "()I", "setInnerColor", "(I)V", "innerColor", "getOutlineColor", "setOutlineColor", "outlineColor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NestBadgeView extends AppCompatImageView {

    /* renamed from: d */
    public static final C16540a f67406d = new C16540a(null);

    /* renamed from: b */
    public final Paint f67407b;

    /* renamed from: c */
    public final Paint f67408c;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/widget/NestBadgeView$a;", "", "", "DEFAULT_STROKE_WIDTH_DP", "I", "", "SHADOW_COLOR", "Ljava/lang/String;", "", "SHADOW_DY_DP", "F", "SHADOW_RADIUS_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.NestBadgeView$a */
    /* loaded from: classes4.dex */
    public static final class C16540a {
        public /* synthetic */ C16540a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16540a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestBadgeView(Context context) {
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
        this.f67407b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setStrokeWidth(C49347td3.m12001b(1));
        this.f67408c = paint2;
    }

    /* renamed from: c */
    public final int m54536c() {
        return this.f67407b.getColor();
    }

    /* renamed from: d */
    public final void m54535d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.NestBadgeView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.NestBadgeView)");
        try {
            this.f67408c.setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(C34290Ll4.NestBadgeView_outlineStrokeWidth, (int) C49347td3.m12001b(1)));
            this.f67408c.setColor(obtainStyledAttributes.getColor(C34290Ll4.NestBadgeView_outlineColor, -1));
            this.f67407b.setColor(obtainStyledAttributes.getColor(C34290Ll4.NestBadgeView_android_color, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float measuredWidth = (getMeasuredWidth() - this.f67408c.getStrokeWidth()) / 2.0f;
        if (canvas != null) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, this.f67407b);
        }
        if (canvas != null) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, this.f67408c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        super.onMeasure(i, i2);
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

    public final void setInnerColor(int i) {
        this.f67407b.setColor(i);
    }

    public final void setOutlineColor(int i) {
        this.f67408c.setColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestBadgeView(Context context, AttributeSet attrs) {
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
        this.f67407b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setStrokeWidth(C49347td3.m12001b(1));
        this.f67408c = paint2;
        m54535d(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestBadgeView(Context context, AttributeSet attrs, int i) {
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
        this.f67407b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setFlags(1);
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setStrokeWidth(C49347td3.m12001b(1));
        this.f67408c = paint2;
        m54535d(attrs);
    }
}
