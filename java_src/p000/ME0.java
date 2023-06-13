package p000;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import co.bird.android.widget.cropper.CropOverlayView;
/* renamed from: ME0 */
/* loaded from: classes4.dex */
public final class ME0 extends Animation implements Animation.AnimationListener {

    /* renamed from: b */
    public final ImageView f22898b;

    /* renamed from: c */
    public final CropOverlayView f22899c;

    /* renamed from: d */
    public final float[] f22900d = new float[8];

    /* renamed from: e */
    public final float[] f22901e = new float[8];

    /* renamed from: f */
    public final RectF f22902f = new RectF();

    /* renamed from: g */
    public final RectF f22903g = new RectF();

    /* renamed from: h */
    public final float[] f22904h = new float[9];

    /* renamed from: i */
    public final float[] f22905i = new float[9];

    /* renamed from: j */
    public final RectF f22906j = new RectF();

    /* renamed from: k */
    public final float[] f22907k = new float[8];

    /* renamed from: l */
    public final float[] f22908l = new float[9];

    public ME0(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f22898b = imageView;
        this.f22899c = cropOverlayView;
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f22906j;
        RectF rectF2 = this.f22902f;
        float f2 = rectF2.left;
        RectF rectF3 = this.f22903g;
        rectF.left = f2 + ((rectF3.left - f2) * f);
        float f3 = rectF2.top;
        rectF.top = f3 + ((rectF3.top - f3) * f);
        float f4 = rectF2.right;
        rectF.right = f4 + ((rectF3.right - f4) * f);
        float f5 = rectF2.bottom;
        rectF.bottom = f5 + ((rectF3.bottom - f5) * f);
        this.f22899c.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f22907k;
            if (i2 >= fArr.length) {
                break;
            }
            float f6 = this.f22900d[i2];
            fArr[i2] = f6 + ((this.f22901e[i2] - f6) * f);
            i2++;
        }
        this.f22899c.setBounds(fArr, this.f22898b.getWidth(), this.f22898b.getHeight());
        while (true) {
            float[] fArr2 = this.f22908l;
            if (i < fArr2.length) {
                float f7 = this.f22904h[i];
                fArr2[i] = f7 + ((this.f22905i[i] - f7) * f);
                i++;
            } else {
                Matrix imageMatrix = this.f22898b.getImageMatrix();
                imageMatrix.setValues(this.f22908l);
                this.f22898b.setImageMatrix(imageMatrix);
                this.f22898b.invalidate();
                this.f22899c.invalidate();
                return;
            }
        }
    }

    /* renamed from: d */
    public void m95483d(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.f22901e, 0, 8);
        this.f22903g.set(this.f22899c.m54139m());
        matrix.getValues(this.f22905i);
    }

    /* renamed from: e */
    public void m95482e(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.f22900d, 0, 8);
        this.f22902f.set(this.f22899c.m54139m());
        matrix.getValues(this.f22904h);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f22898b.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
