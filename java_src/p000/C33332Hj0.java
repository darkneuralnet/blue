package p000;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;
/* renamed from: Hj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33332Hj0 extends AbstractC32267Cu6 {

    /* renamed from: b */
    public float f13795b = 3.0f;

    /* renamed from: h */
    public static float m103496h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // p000.L96
    /* renamed from: c */
    public long mo97641c(ViewGroup viewGroup, Transition transition, N96 n96, N96 n962) {
        int i;
        int[] iArr;
        int round;
        int i2;
        if (n96 == null && n962 == null) {
            return 0L;
        }
        if (n962 != null && m111364e(n96) != 0) {
            n96 = n962;
            i = 1;
        } else {
            i = -1;
        }
        int m111363f = m111363f(n96);
        int m111362g = m111362g(n96);
        Rect m65908A = transition.m65908A();
        if (m65908A != null) {
            i2 = m65908A.centerX();
            round = m65908A.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i2 = round2;
        }
        float m103496h = m103496h(m111363f, m111362g, i2, round) / m103496h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long m65873z = transition.m65873z();
        if (m65873z < 0) {
            m65873z = 300;
        }
        return Math.round((((float) (m65873z * i)) / this.f13795b) * m103496h);
    }
}
