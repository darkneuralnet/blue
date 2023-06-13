package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* renamed from: lN2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44456lN2 implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f95952a = new float[9];

    /* renamed from: b */
    public final float[] f95953b = new float[9];

    /* renamed from: c */
    public final Matrix f95954c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f95952a);
        matrix2.getValues(this.f95953b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f95953b;
            float f2 = fArr[i];
            float f3 = this.f95952a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f95954c.setValues(this.f95953b);
        return this.f95954c;
    }
}
