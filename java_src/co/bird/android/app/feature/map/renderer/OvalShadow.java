package co.bird.android.app.feature.map.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/OvalShadow;", "Landroid/graphics/drawable/shapes/OvalShape;", "width", "", "height", "shadowRadius", "", "shadowColor", "shadowPaint", "Landroid/graphics/Paint;", "(IIFILandroid/graphics/Paint;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "paint", "onResize", "updateRadialGradient", "diameter", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class OvalShadow extends OvalShape {
    private final int height;
    private final int shadowColor;
    private final Paint shadowPaint;
    private final float shadowRadius;
    private final int width;

    public /* synthetic */ OvalShadow(int i, int i2, float f, int i3, Paint paint, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, i3, (i4 & 16) != 0 ? new Paint() : paint);
    }

    private final void updateRadialGradient(int i) {
        float f = i / 2.0f;
        this.shadowPaint.setShader(new RadialGradient(f, f, this.shadowRadius, new int[]{this.shadowColor, 0}, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public void draw(Canvas canvas, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        float f = this.width / 2.0f;
        float f2 = this.height / 2.0f;
        canvas.drawCircle(f, f2, f, this.shadowPaint);
        canvas.drawCircle(f, f2, f - this.shadowRadius, paint);
    }

    @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public void onResize(float f, float f2) {
        super.onResize(f, f2);
        updateRadialGradient((int) f);
    }

    public OvalShadow(int i, int i2, float f, int i3, Paint shadowPaint) {
        Intrinsics.checkNotNullParameter(shadowPaint, "shadowPaint");
        this.width = i;
        this.height = i2;
        this.shadowRadius = f;
        this.shadowColor = i3;
        this.shadowPaint = shadowPaint;
        updateRadialGradient((int) rect().width());
    }
}
