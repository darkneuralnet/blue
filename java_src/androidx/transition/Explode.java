package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes.dex */
public class Explode extends Visibility {

    /* renamed from: S */
    public static final TimeInterpolator f55881S = new DecelerateInterpolator();

    /* renamed from: T */
    public static final TimeInterpolator f55882T = new AccelerateInterpolator();

    /* renamed from: R */
    public int[] f55883R;

    public Explode() {
        this.f55883R = new int[2];
        mo65842v0(new C33332Hj0());
    }

    /* renamed from: A0 */
    private void m65920A0(N96 n96) {
        View view = n96.f24200b;
        view.getLocationOnScreen(this.f55883R);
        int[] iArr = this.f55883R;
        int i = iArr[0];
        int i2 = iArr[1];
        n96.f24199a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: K0 */
    public static float m65919K0(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* renamed from: L0 */
    public static float m65918L0(View view, int i, int i2) {
        return m65919K0(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    @Override // androidx.transition.Visibility
    /* renamed from: G0 */
    public Animator mo65833G0(ViewGroup viewGroup, View view, N96 n96, N96 n962) {
        if (n962 == null) {
            return null;
        }
        Rect rect = (Rect) n962.f24199a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m65917M0(viewGroup, rect, this.f55883R);
        int[] iArr = this.f55883R;
        return C12060e.m65792a(view, n962, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f55881S, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: I0 */
    public Animator mo65831I0(ViewGroup viewGroup, View view, N96 n96, N96 n962) {
        float f;
        float f2;
        if (n96 == null) {
            return null;
        }
        Rect rect = (Rect) n96.f24199a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) n96.f24200b.getTag(C36351Ug4.transition_position);
        if (iArr != null) {
            int i3 = iArr[0];
            f = (i3 - rect.left) + translationX;
            int i4 = iArr[1];
            f2 = (i4 - rect.top) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f = translationX;
            f2 = translationY;
        }
        m65917M0(viewGroup, rect, this.f55883R);
        int[] iArr2 = this.f55883R;
        return C12060e.m65792a(view, n96, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], f55882T, this);
    }

    /* renamed from: M0 */
    public final void m65917M0(View view, Rect rect, int[] iArr) {
        int centerY;
        int i;
        view.getLocationOnScreen(this.f55883R);
        int[] iArr2 = this.f55883R;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        Rect m65908A = m65908A();
        if (m65908A == null) {
            i = (view.getWidth() / 2) + i2 + Math.round(view.getTranslationX());
            centerY = (view.getHeight() / 2) + i3 + Math.round(view.getTranslationY());
        } else {
            int centerX = m65908A.centerX();
            centerY = m65908A.centerY();
            i = centerX;
        }
        float centerX2 = rect.centerX() - i;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float m65919K0 = m65919K0(centerX2, centerY2);
        float m65918L0 = m65918L0(view, i - i2, centerY - i3);
        iArr[0] = Math.round((centerX2 / m65919K0) * m65918L0);
        iArr[1] = Math.round(m65918L0 * (centerY2 / m65919K0));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        super.mo65827k(n96);
        m65920A0(n96);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        super.mo65826n(n96);
        m65920A0(n96);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55883R = new int[2];
        mo65842v0(new C33332Hj0());
    }
}
