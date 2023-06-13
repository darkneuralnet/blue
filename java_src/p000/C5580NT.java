package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
/* renamed from: NT */
/* loaded from: classes5.dex */
public class C5580NT extends AbstractC32963Fu0 {

    /* renamed from: P */
    public final Bitmap f24617P;

    /* renamed from: Q */
    public final float f24618Q;

    /* renamed from: R */
    public final float f24619R;

    public C5580NT(Bitmap bitmap) {
        this.f24617P = bitmap;
        this.f24618Q = bitmap.getWidth() / 2.0f;
        this.f24619R = bitmap.getHeight() / 2.0f;
    }

    @Override // p000.AbstractC32963Fu0
    /* renamed from: i */
    public void mo93875i(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3, float f4) {
        matrix.preTranslate(f, f2);
        matrix.preRotate(f3, this.f24618Q, this.f24619R);
        canvas.drawBitmap(this.f24617P, matrix, paint);
    }

    @Override // p000.AbstractC32963Fu0
    /* renamed from: j */
    public int mo93874j() {
        return this.f24617P.getHeight();
    }

    @Override // p000.AbstractC32963Fu0
    /* renamed from: k */
    public int mo93873k() {
        return this.f24617P.getWidth();
    }
}
