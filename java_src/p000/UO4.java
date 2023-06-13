package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J&\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010$\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0016\u0010)\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010+\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00065"}, m28432d2 = {"LUO4;", "Landroid/graphics/drawable/Drawable;", "", "color", "", "b", "left", "top", "right", "bottom", "c", "start", "end", DateTokenConverter.CONVERTER_KEY, "setBounds", "Landroid/graphics/Rect;", "padding", "", "getPadding", "Landroid/graphics/Canvas;", "canvas", "draw", "alpha", "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", C17296a.f69688o, "", "F", "dpToPx", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Rect;", "interiorPadding", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "e", "ribbonWingletWidth", "f", "height", "Landroid/graphics/RectF;", "g", "Landroid/graphics/RectF;", "bounds", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "h", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UO4 */
/* loaded from: classes4.dex */
public final class UO4 extends Drawable {

    /* renamed from: h */
    public static final C8274a f37321h = new C8274a(null);

    /* renamed from: a */
    public final float f37322a;

    /* renamed from: b */
    public final Path f37323b;

    /* renamed from: c */
    public final Rect f37324c;

    /* renamed from: d */
    public final Paint f37325d;

    /* renamed from: e */
    public float f37326e;

    /* renamed from: f */
    public float f37327f;

    /* renamed from: g */
    public RectF f37328g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LUO4$a;", "", "", "RIBBON_WINGLET_WIDTH_DP", "F", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: UO4$a */
    /* loaded from: classes4.dex */
    public static final class C8274a {
        public /* synthetic */ C8274a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8274a() {
        }
    }

    public UO4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float applyDimension = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.f37322a = applyDimension;
        this.f37323b = new Path();
        this.f37324c = new Rect();
        Paint paint = new Paint();
        this.f37325d = paint;
        this.f37326e = applyDimension * 5.0f;
        this.f37328g = new RectF();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(NA0.m94301c(context, C32364Df4.birdESBlue));
    }

    /* renamed from: a */
    public final boolean m81567a() {
        return P26.m91040a(Locale.getDefault()) == 1;
    }

    /* renamed from: b */
    public final void m81566b(int i) {
        this.f37325d.setColor(i);
        invalidateSelf();
    }

    /* renamed from: c */
    public final void m81565c(int i, int i2, int i3, int i4) {
        this.f37324c.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: d */
    public final void m81564d(int i, int i2, int i3, int i4) {
        if (m81567a()) {
            m81565c(i3, i2, i, i4);
        } else {
            m81565c(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f37323b, this.f37325d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        if (m81567a()) {
            Rect rect = this.f37324c;
            padding.set(rect.left + ((int) this.f37326e), rect.top, rect.right, rect.bottom);
            return true;
        }
        Rect rect2 = this.f37324c;
        padding.set(rect2.left, rect2.top, rect2.right + ((int) this.f37326e), rect2.bottom);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f37325d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f37328g.set(i, i2, i3, i4);
        this.f37327f = this.f37328g.height();
        boolean m81567a = m81567a();
        this.f37323b.reset();
        Path path = this.f37323b;
        RectF rectF = this.f37328g;
        path.moveTo(rectF.left, rectF.top);
        Path path2 = this.f37323b;
        RectF rectF2 = this.f37328g;
        path2.lineTo(rectF2.right, rectF2.top);
        if (!m81567a) {
            Path path3 = this.f37323b;
            RectF rectF3 = this.f37328g;
            path3.lineTo(rectF3.right - this.f37326e, rectF3.top + (this.f37327f / 2.0f));
        }
        Path path4 = this.f37323b;
        RectF rectF4 = this.f37328g;
        path4.lineTo(rectF4.right, rectF4.top + this.f37327f);
        Path path5 = this.f37323b;
        RectF rectF5 = this.f37328g;
        path5.lineTo(rectF5.left, rectF5.top + this.f37327f);
        if (m81567a) {
            Path path6 = this.f37323b;
            RectF rectF6 = this.f37328g;
            path6.lineTo(rectF6.left + this.f37326e, rectF6.top + (this.f37327f / 2.0f));
        }
        this.f37323b.close();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37325d.setColorFilter(colorFilter);
    }
}
