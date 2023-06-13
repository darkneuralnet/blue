package p000;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0012\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0002R*\u0010$\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u0010/\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00106\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00102R\u0016\u00108\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\u001fR\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010:R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010:R$\u0010H\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\b.\u0010GR$\u0010I\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010F\"\u0004\b1\u0010GR$\u0010K\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b4\u0010#¨\u0006Q"}, m28432d2 = {"LQ12;", "Landroid/graphics/drawable/Drawable;", "", "left", "top", "right", "bottom", "", "setBounds", "Landroid/graphics/Rect;", "padding", "", "getPadding", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/Outline;", "outline", "getOutline", "Landroid/graphics/Canvas;", "canvas", "draw", "alpha", "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", DateTokenConverter.CONVERTER_KEY, "e", "", C17296a.f69688o, "F", "c", "()F", "i", "(F)V", "interiorPadding", "b", "dpToPx", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "shadowPath", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "leftOval", "f", "rightOval", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "borderPaint", "h", "fillPaint", "shadowPaint", "j", "diameterOfCenterStroke", "k", "I", "width", "l", "height", "m", "horizontalPadding", "n", "topPadding", "o", "bottomPadding", "color", "getBackgroundColor", "()I", "(I)V", "backgroundColor", "borderColor", "widthInDp", "borderStrokeWidth", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "p", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q12 */
/* loaded from: classes4.dex */
public final class Q12 extends Drawable {

    /* renamed from: p */
    public static final C6645a f29687p = new C6645a(null);

    /* renamed from: a */
    public float f29688a;

    /* renamed from: b */
    public final float f29689b;

    /* renamed from: c */
    public final Path f29690c;

    /* renamed from: d */
    public final Path f29691d;

    /* renamed from: e */
    public final RectF f29692e;

    /* renamed from: f */
    public final RectF f29693f;

    /* renamed from: g */
    public final Paint f29694g;

    /* renamed from: h */
    public final Paint f29695h;

    /* renamed from: i */
    public final Paint f29696i;

    /* renamed from: j */
    public float f29697j;

    /* renamed from: k */
    public int f29698k;

    /* renamed from: l */
    public int f29699l;

    /* renamed from: m */
    public int f29700m;

    /* renamed from: n */
    public int f29701n;

    /* renamed from: o */
    public int f29702o;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, m28432d2 = {"LQ12$a;", "", "", "CARROT_HEIGHT", "F", "CARROT_WIDTH", "", "DEFAULT_FILL_COLOR", "I", "DEFAULT_INTERIOR_PADDING_DP", "HALF_CARROT_WIDTH", "HALF_STROKE", "SHADOW_BLUR_RADIUS", "STROKE_WIDTH_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Q12$a */
    /* loaded from: classes4.dex */
    public static final class C6645a {
        public /* synthetic */ C6645a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6645a() {
        }
    }

    public Q12(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float m12002a = C49347td3.m12002a(Float.valueOf(1.0f), context);
        this.f29689b = m12002a;
        this.f29690c = new Path();
        this.f29691d = new Path();
        this.f29692e = new RectF();
        this.f29693f = new RectF();
        Paint paint = new Paint();
        this.f29694g = paint;
        Paint paint2 = new Paint();
        this.f29695h = paint2;
        Paint paint3 = new Paint();
        this.f29696i = paint3;
        paint.setStrokeWidth(1.0f * m12002a);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(-16777216);
        paint3.setAlpha(90);
        paint3.setMaskFilter(new BlurMaskFilter(8.0f * m12002a, BlurMaskFilter.Blur.NORMAL));
        m89115i(m12002a * 2.0f);
        m89120d();
    }

    /* renamed from: a */
    public final int m89123a() {
        return this.f29694g.getColor();
    }

    /* renamed from: b */
    public final float m89122b() {
        return this.f29694g.getStrokeWidth();
    }

    /* renamed from: c */
    public final float m89121c() {
        return this.f29688a;
    }

    /* renamed from: d */
    public final void m89120d() {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        roundToInt = MathKt__MathJVMKt.roundToInt(Math.ceil((this.f29689b * 5.0f) + this.f29688a));
        this.f29700m = roundToInt;
        roundToInt2 = MathKt__MathJVMKt.roundToInt(Math.ceil((this.f29689b * 1.0f) + this.f29688a));
        this.f29701n = roundToInt2;
        roundToInt3 = MathKt__MathJVMKt.roundToInt(Math.ceil(roundToInt2 + (this.f29689b * 8.0f)));
        this.f29702o = roundToInt3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        m89119e();
        if (Build.VERSION.SDK_INT < 29) {
            canvas.drawPath(this.f29691d, this.f29696i);
        }
        canvas.drawPath(this.f29690c, this.f29695h);
        canvas.drawPath(this.f29690c, this.f29694g);
    }

    /* renamed from: e */
    public final void m89119e() {
        this.f29690c.reset();
        this.f29690c.moveTo(this.f29692e.centerX(), this.f29692e.bottom);
        this.f29690c.arcTo(this.f29692e, 90.0f, 180.0f);
        this.f29690c.lineTo(this.f29693f.centerX(), this.f29693f.top);
        this.f29690c.arcTo(this.f29693f, 270.0f, 180.0f);
        this.f29690c.lineTo((this.f29698k * 0.5f) + (this.f29689b * 4.0f), this.f29693f.bottom);
        this.f29690c.lineTo(this.f29698k * 0.5f, this.f29693f.bottom + (this.f29689b * 8.0f));
        this.f29690c.lineTo((this.f29698k * 0.5f) - (this.f29689b * 4.0f), this.f29693f.bottom);
        this.f29690c.close();
        this.f29691d.reset();
        this.f29691d.moveTo(this.f29692e.centerX(), this.f29692e.bottom);
        this.f29691d.arcTo(this.f29692e, 90.0f, 90.0f);
        Path path = this.f29691d;
        RectF rectF = this.f29693f;
        path.lineTo(rectF.right, rectF.centerY());
        this.f29691d.arcTo(this.f29693f, 0.0f, 90.0f);
        this.f29691d.lineTo((this.f29698k * 0.5f) + (this.f29689b * 4.0f), this.f29693f.bottom);
        this.f29691d.lineTo(this.f29698k * 0.5f, this.f29693f.bottom + (this.f29689b * 8.0f));
        this.f29691d.lineTo((this.f29698k * 0.5f) - (this.f29689b * 4.0f), this.f29693f.bottom);
        this.f29691d.close();
    }

    /* renamed from: f */
    public final void m89118f(int i) {
        this.f29695h.setColor(i);
        invalidateSelf();
    }

    /* renamed from: g */
    public final void m89117g(int i) {
        this.f29694g.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f29700m + this.f29702o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.f29700m;
        return i + i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (Build.VERSION.SDK_INT >= 29) {
            outline.setConvexPath(this.f29690c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        int i = this.f29700m;
        padding.set(i, this.f29701n, i, this.f29702o);
        return true;
    }

    /* renamed from: h */
    public final void m89116h(float f) {
        this.f29694g.setStrokeWidth(f * this.f29689b);
        invalidateSelf();
    }

    /* renamed from: i */
    public final void m89115i(float f) {
        this.f29688a = f;
        m89120d();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f29694g.setAlpha(i);
        this.f29695h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f29698k = i3 - i;
        int i5 = i4 - i2;
        this.f29699l = i5;
        int i6 = this.f29701n;
        float f = this.f29688a;
        float f2 = ((i5 - i6) - this.f29702o) + (2 * f);
        float f3 = this.f29689b;
        float f4 = f2 + (1.0f * f3);
        this.f29697j = f4;
        RectF rectF = this.f29692e;
        float f5 = ((i + this.f29700m) - f) - (f3 * 0.5f);
        rectF.left = f5;
        float f6 = ((i2 + i6) - f) - (f3 * 0.5f);
        rectF.top = f6;
        rectF.right = f5 + f4;
        float f7 = f4 + f6;
        rectF.bottom = f7;
        C41318g46.m40151m("@@@ height: " + (f7 - f6), new Object[0]);
        RectF rectF2 = this.f29693f;
        float f8 = ((float) (i3 - this.f29700m)) + this.f29688a + (this.f29689b * 0.5f);
        rectF2.right = f8;
        rectF2.left = f8 - this.f29697j;
        RectF rectF3 = this.f29692e;
        rectF2.top = rectF3.top;
        rectF2.bottom = rectF3.bottom;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29694g.setColorFilter(colorFilter);
        this.f29695h.setColorFilter(colorFilter);
    }
}
