package zendesk.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Locale;
/* loaded from: classes8.dex */
public class PicassoTransformations {

    /* loaded from: classes8.dex */
    public static class BlurTransformation implements InterfaceC47298q96 {

        /* renamed from: rs */
        private final RenderScript f121951rs;

        public BlurTransformation(Context context) {
            this.f121951rs = RenderScript.create(context);
        }

        @Override // p000.InterfaceC47298q96
        public String key() {
            return "blur";
        }

        @Override // p000.InterfaceC47298q96
        public Bitmap transform(Bitmap bitmap) {
            Allocation allocation;
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            RenderScript renderScript = this.f121951rs;
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            Allocation allocation2 = null;
            try {
                Allocation createFromBitmap = Allocation.createFromBitmap(this.f121951rs, copy, Allocation.MipmapControl.MIPMAP_FULL, 128);
                try {
                    allocation2 = Allocation.createTyped(this.f121951rs, createFromBitmap.getType());
                    create.setInput(createFromBitmap);
                    create.setRadius(25.0f);
                    create.forEach(allocation2);
                    allocation2.copyTo(copy);
                    bitmap.recycle();
                    this.f121951rs.destroy();
                    create.destroy();
                    createFromBitmap.destroy();
                    allocation2.destroy();
                    return copy;
                } catch (Throwable th) {
                    th = th;
                    allocation = allocation2;
                    allocation2 = createFromBitmap;
                    bitmap.recycle();
                    this.f121951rs.destroy();
                    create.destroy();
                    if (allocation2 != null) {
                        allocation2.destroy();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                allocation = null;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class RoundedTransformation implements InterfaceC47298q96 {
        private final int radius;
        private final int strokeColor;
        private final int strokeWidth;

        public RoundedTransformation(int i) {
            this(i, 0, -1);
        }

        private RectF getMask(int i, int i2, int i3) {
            float f = i3;
            return new RectF(f, f, i - i3, i2 - i3);
        }

        private Paint shapePaint(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            return paint;
        }

        private Paint strokePaint() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.strokeColor);
            return paint;
        }

        @Override // p000.InterfaceC47298q96
        public String key() {
            return String.format(Locale.US, "rounded-%s-%s-%s", Integer.valueOf(this.radius), Integer.valueOf(this.strokeColor), Integer.valueOf(this.strokeWidth));
        }

        @Override // p000.InterfaceC47298q96
        public Bitmap transform(Bitmap bitmap) {
            if (this.strokeWidth > 0) {
                if (!bitmap.isMutable()) {
                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    if (copy != bitmap) {
                        bitmap.recycle();
                    }
                    bitmap = copy;
                }
                Canvas canvas = new Canvas(bitmap);
                Paint strokePaint = strokePaint();
                Path path = new Path();
                path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                RectF mask = getMask(bitmap.getWidth(), bitmap.getHeight(), this.strokeWidth);
                int i = this.radius;
                path.addRoundRect(mask, i, i, Path.Direction.CW);
                canvas.drawPath(path, strokePaint);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Paint shapePaint = shapePaint(bitmap);
            RectF mask2 = getMask(bitmap.getWidth(), bitmap.getHeight(), 0);
            int i2 = this.radius;
            canvas2.drawRoundRect(mask2, i2, i2, shapePaint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        public RoundedTransformation(int i, int i2, int i3) {
            this.radius = i;
            this.strokeColor = i2;
            this.strokeWidth = i3;
        }
    }

    private PicassoTransformations() {
    }

    public static InterfaceC47298q96 getBlurTransformation(Context context) {
        return new BlurTransformation(context);
    }

    public static InterfaceC47298q96 getRoundWithBorderTransformation(int i, int i2, int i3) {
        return new RoundedTransformation(i, i2, i3);
    }

    public static InterfaceC47298q96 getRoundedTransformation(int i) {
        return new RoundedTransformation(i);
    }
}
