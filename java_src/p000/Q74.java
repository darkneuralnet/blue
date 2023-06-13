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
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\f\u0010\u0012\u001a\u00020\u0011*\u00020\rH\u0002J\f\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0002R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LQ74;", "Landroid/graphics/drawable/Drawable;", "", "alpha", "", "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "Landroid/graphics/Canvas;", "canvas", "draw", "Landroid/graphics/Rect;", "bound", "b", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "c", "I", "totalLevel", "currentLevel", "highlightColor", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "paint", "<init>", "(IIILandroid/content/Context;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q74 */
/* loaded from: classes4.dex */
public final class Q74 extends Drawable {

    /* renamed from: a */
    public final int f29853a;

    /* renamed from: b */
    public final int f29854b;

    /* renamed from: c */
    public final int f29855c;

    /* renamed from: d */
    public final Context f29856d;

    /* renamed from: e */
    public final Paint f29857e;

    public Q74(int i, int i2, int i3, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29853a = i;
        this.f29854b = i2;
        this.f29855c = i3;
        this.f29856d = context;
        this.f29857e = new Paint();
    }

    /* renamed from: a */
    public final void m88901a(Canvas canvas, Rect rect) {
        this.f29857e.setColor(m88899c(this.f29853a - 1));
        int width = rect.width();
        int i = this.f29853a;
        float f = (width * (i - 1)) / i;
        float f2 = 2;
        float width2 = (((rect.width() / this.f29853a) - 1) + f) - (getBounds().height() / f2);
        canvas.drawRect(f, rect.top, width2, rect.bottom, this.f29857e);
        canvas.drawCircle(width2, m88898d(rect), getBounds().height() / f2, this.f29857e);
    }

    /* renamed from: b */
    public final void m88900b(Canvas canvas, Rect rect) {
        this.f29857e.setColor(m88899c(0));
        float height = getBounds().height() / 2;
        canvas.drawCircle(height, m88898d(rect), height, this.f29857e);
        canvas.drawRect(height, rect.top, (rect.width() * 0.9f) / this.f29853a, rect.bottom, this.f29857e);
    }

    /* renamed from: c */
    public final int m88899c(int i) {
        if (i < this.f29854b) {
            return this.f29855c;
        }
        return NA0.m94301c(this.f29856d, C32364Df4.birdGray);
    }

    /* renamed from: d */
    public final float m88898d(Rect rect) {
        int i = rect.top;
        return i - ((i - rect.bottom) / 2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        int width = bounds.width();
        m88900b(canvas, bounds);
        int i = this.f29853a - 1;
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = this.f29853a;
            float f = (width * i2) / i3;
            this.f29857e.setColor(m88899c(i2));
            canvas.drawRect(f, bounds.top, f + ((width * 0.9f) / i3), bounds.bottom, this.f29857e);
        }
        m88901a(canvas, bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f29857e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29857e.setColorFilter(colorFilter);
    }
}
