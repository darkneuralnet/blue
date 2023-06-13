package p000;

import android.animation.TypeEvaluator;
/* renamed from: lu1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44772lu1 implements TypeEvaluator<float[]> {

    /* renamed from: a */
    public float[] f96876a;

    public C44772lu1(float[] fArr) {
        this.f96876a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f96876a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
