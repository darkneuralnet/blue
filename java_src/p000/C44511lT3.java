package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Locale;
/* renamed from: lT3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44511lT3 {

    /* renamed from: lT3$a */
    /* loaded from: classes8.dex */
    public static class C25707a implements InterfaceC47298q96 {

        /* renamed from: a */
        public final int f96234a;

        /* renamed from: b */
        public final int f96235b;

        /* renamed from: c */
        public final int f96236c;

        public C25707a(int i, int i2, int i3) {
            this.f96234a = i;
            this.f96236c = i2;
            this.f96235b = i3;
        }

        /* renamed from: a */
        public final RectF m27257a(int i, int i2, int i3) {
            float f = i3;
            return new RectF(f, f, i - i3, i2 - i3);
        }

        /* renamed from: b */
        public final Paint m27256b(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            return paint;
        }

        /* renamed from: c */
        public final Paint m27255c() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f96236c);
            return paint;
        }

        @Override // p000.InterfaceC47298q96
        public String key() {
            return String.format(Locale.US, "rounded-%s-%s-%s", Integer.valueOf(this.f96234a), Integer.valueOf(this.f96236c), Integer.valueOf(this.f96235b));
        }

        @Override // p000.InterfaceC47298q96
        public Bitmap transform(Bitmap bitmap) {
            if (this.f96235b > 0) {
                Canvas canvas = new Canvas(bitmap);
                Paint m27255c = m27255c();
                Path path = new Path();
                path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                RectF m27257a = m27257a(bitmap.getWidth(), bitmap.getHeight(), this.f96235b);
                int i = this.f96234a;
                path.addRoundRect(m27257a, i, i, Path.Direction.CW);
                canvas.drawPath(path, m27255c);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Paint m27256b = m27256b(bitmap);
            RectF m27257a2 = m27257a(bitmap.getWidth(), bitmap.getHeight(), 0);
            int i2 = this.f96234a;
            canvas2.drawRoundRect(m27257a2, i2, i2, m27256b);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
    }

    private C44511lT3() {
    }

    /* renamed from: a */
    public static InterfaceC47298q96 m27258a(int i, int i2, int i3) {
        return new C25707a(i, i2, i3);
    }
}
