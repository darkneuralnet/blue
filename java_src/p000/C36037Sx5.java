package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* renamed from: Sx5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36037Sx5 {

    /* renamed from: i */
    public static final int[] f34543i = new int[3];

    /* renamed from: j */
    public static final float[] f34544j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f34545k = new int[4];

    /* renamed from: l */
    public static final float[] f34546l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f34547a;

    /* renamed from: b */
    public final Paint f34548b;

    /* renamed from: c */
    public final Paint f34549c;

    /* renamed from: d */
    public int f34550d;

    /* renamed from: e */
    public int f34551e;

    /* renamed from: f */
    public int f34552f;

    /* renamed from: g */
    public final Path f34553g;

    /* renamed from: h */
    public final Paint f34554h;

    public C36037Sx5() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m84573a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f34553g;
        if (z) {
            int[] iArr = f34545k;
            iArr[0] = 0;
            iArr[1] = this.f34552f;
            iArr[2] = this.f34551e;
            iArr[3] = this.f34550d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f34545k;
            iArr2[0] = 0;
            iArr2[1] = this.f34550d;
            iArr2[2] = this.f34551e;
            iArr2[3] = this.f34552f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = f34546l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.f34548b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f34545k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f34554h);
        }
        canvas.drawArc(rectF, f, f2, true, this.f34548b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m84572b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f34543i;
        iArr[0] = this.f34552f;
        iArr[1] = this.f34551e;
        iArr[2] = this.f34550d;
        Paint paint = this.f34549c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f34544j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f34549c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m84571c() {
        return this.f34547a;
    }

    /* renamed from: d */
    public void m84570d(int i) {
        this.f34550d = C33827Jm0.m99845p(i, 68);
        this.f34551e = C33827Jm0.m99845p(i, 20);
        this.f34552f = C33827Jm0.m99845p(i, 0);
        this.f34547a.setColor(this.f34550d);
    }

    public C36037Sx5(int i) {
        this.f34553g = new Path();
        Paint paint = new Paint();
        this.f34554h = paint;
        this.f34547a = new Paint();
        m84570d(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f34548b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f34549c = new Paint(paint2);
    }
}
