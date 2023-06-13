package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;
/* renamed from: A26 */
/* loaded from: classes6.dex */
public class A26 extends Transition {

    /* renamed from: A26$a */
    /* loaded from: classes6.dex */
    public class C0010a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f50a;

        public C0010a(TextView textView) {
            this.f50a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f50a.setScaleX(floatValue);
            this.f50a.setScaleY(floatValue);
        }
    }

    /* renamed from: A0 */
    public final void m116172A0(N96 n96) {
        View view = n96.f24200b;
        if (view instanceof TextView) {
            n96.f24199a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        m116172A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        m116172A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: r */
    public Animator mo65825r(ViewGroup viewGroup, N96 n96, N96 n962) {
        float f;
        if (n96 == null || n962 == null || !(n96.f24200b instanceof TextView)) {
            return null;
        }
        View view = n962.f24200b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = n96.f24199a;
        Map<String, Object> map2 = n962.f24199a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new C0010a(textView));
        return ofFloat;
    }
}
