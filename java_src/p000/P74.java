package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\f\u0010\u0012\u001a\u00020\u0011*\u00020\rH\u0002R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LP74;", "Landroid/graphics/drawable/Drawable;", "", "alpha", "", "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "Landroid/graphics/Canvas;", "canvas", "draw", "Landroid/graphics/Rect;", "bound", "b", C17296a.f69688o, "", "c", "I", "totalLevel", "currentLevel", "highlightColor", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "paint", "<init>", "(IIILandroid/content/Context;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: P74 */
/* loaded from: classes4.dex */
public final class P74 extends Drawable {

    /* renamed from: a */
    public final int f27940a;

    /* renamed from: b */
    public final int f27941b;

    /* renamed from: c */
    public final int f27942c;

    /* renamed from: d */
    public final Context f27943d;

    /* renamed from: e */
    public final Paint f27944e;

    public P74(int i, int i2, int i3, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27940a = i;
        this.f27941b = i2;
        this.f27942c = i3;
        this.f27943d = context;
        this.f27944e = new Paint();
    }

    /* renamed from: a */
    public final void m90729a(Canvas canvas, Rect rect) {
        int m94301c;
        Paint paint = this.f27944e;
        if (this.f27941b == this.f27940a) {
            m94301c = this.f27942c;
        } else {
            m94301c = NA0.m94301c(this.f27943d, C32364Df4.birdGray);
        }
        paint.setColor(m94301c);
        float f = 2;
        canvas.drawCircle(rect.width() - (rect.height() / f), m90727c(rect), getBounds().height() / f, this.f27944e);
    }

    /* renamed from: b */
    public final void m90728b(Canvas canvas, Rect rect) {
        int m94301c;
        Paint paint = this.f27944e;
        if (this.f27941b > 0) {
            m94301c = this.f27942c;
        } else {
            m94301c = NA0.m94301c(this.f27943d, C32364Df4.birdGray);
        }
        paint.setColor(m94301c);
        float height = getBounds().height() / 2;
        canvas.drawCircle(height, m90727c(rect), height, this.f27944e);
    }

    /* renamed from: c */
    public final float m90727c(Rect rect) {
        int i = rect.top;
        return i - ((i - rect.bottom) / 2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        int width = bounds.width();
        m90728b(canvas, bounds);
        float f = 2;
        float height = bounds.height() / f;
        float height2 = ((this.f27941b / this.f27940a) * (width - bounds.height())) + height;
        this.f27944e.setColor(this.f27942c);
        canvas.drawRect(height, bounds.top, height2, bounds.bottom, this.f27944e);
        this.f27944e.setColor(NA0.m94301c(this.f27943d, C32364Df4.birdGray));
        canvas.drawRect(height2, bounds.top, width - (getBounds().height() / f), bounds.bottom, this.f27944e);
        m90729a(canvas, bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f27944e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27944e.setColorFilter(colorFilter);
    }
}
