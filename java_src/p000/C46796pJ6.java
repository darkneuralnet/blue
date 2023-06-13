package p000;

import android.view.View;
/* renamed from: pJ6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C46796pJ6 extends AbstractC29457vE {
    @Override // p000.AbstractC29457vE
    /* renamed from: f */
    public void mo9001f(View view, float f) {
        if (f >= -1.0f || f <= 1.0f) {
            float height = view.getHeight();
            float width = view.getWidth();
            float max = Math.max(0.85f, 1.0f - Math.abs(f));
            float f2 = 1.0f - max;
            float f3 = (height * f2) / 2.0f;
            float f4 = (f2 * width) / 2.0f;
            view.setPivotY(height * 0.5f);
            view.setPivotX(width * 0.5f);
            if (f < 0.0f) {
                view.setTranslationX(f4 - (f3 / 2.0f));
            } else {
                view.setTranslationX((-f4) + (f3 / 2.0f));
            }
            view.setScaleX(max);
            view.setScaleY(max);
            view.setAlpha((((max - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
        }
    }
}
