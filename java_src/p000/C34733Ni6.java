package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Ni6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C34733Ni6 {

    /* renamed from: a */
    public static final Paint f25019a;

    static {
        Paint paint = new Paint();
        f25019a = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public static Bitmap m93551a(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = f25019a;
        paint.setColor(i);
        float f = i2 / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        return createBitmap;
    }

    /* renamed from: b */
    public static Bitmap m93550b(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = f25019a;
        paint.setColor(i);
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        float f = i2;
        path.lineTo(f, 0.0f);
        path.lineTo(f, f);
        path.lineTo(0.0f, f);
        path.close();
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    /* renamed from: c */
    public static Bitmap m93549c(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = f25019a;
        paint.setColor(i);
        Path path = new Path();
        float f = i2;
        float tan = ((float) Math.tan(0.26179939560137916d)) * f;
        path.moveTo(0.0f, 0.0f);
        path.lineTo(f, tan);
        path.lineTo(tan, f);
        path.close();
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    /* renamed from: d */
    public static List<Bitmap> m93548d(int[] iArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            arrayList.add(m93551a(i2, i));
            arrayList.add(m93550b(i2, i));
            arrayList.add(m93549c(i2, i));
        }
        return arrayList;
    }
}
