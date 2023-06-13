package p000;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* renamed from: vE */
/* loaded from: classes4.dex */
public abstract class AbstractC29457vE implements ViewPager.InterfaceC12077j {
    @Override // androidx.viewpager.widget.ViewPager.InterfaceC12077j
    /* renamed from: a */
    public void mo9006a(View view, float f) {
        m9002e(view, f);
        mo9001f(view, f);
        m9003d(view, f);
    }

    /* renamed from: b */
    public boolean m9005b() {
        return true;
    }

    /* renamed from: c */
    public boolean m9004c() {
        return false;
    }

    /* renamed from: d */
    public void m9003d(View view, float f) {
    }

    /* renamed from: e */
    public void m9002e(View view, float f) {
        float f2;
        float width = view.getWidth();
        float f3 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        if (m9004c()) {
            f2 = 0.0f;
        } else {
            f2 = (-width) * f;
        }
        view.setTranslationX(f2);
        if (m9005b()) {
            if (f > -1.0f && f < 1.0f) {
                f3 = 1.0f;
            }
            view.setAlpha(f3);
            view.setEnabled(false);
            return;
        }
        view.setEnabled(true);
        view.setAlpha(1.0f);
    }

    /* renamed from: f */
    public abstract void mo9001f(View view, float f);
}
