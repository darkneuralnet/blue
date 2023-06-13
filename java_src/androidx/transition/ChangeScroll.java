package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class ChangeScroll extends Transition {

    /* renamed from: P */
    public static final String[] f55850P = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    /* renamed from: A0 */
    public final void m65938A0(N96 n96) {
        n96.f24199a.put("android:changeScroll:x", Integer.valueOf(n96.f24200b.getScrollX()));
        n96.f24199a.put("android:changeScroll:y", Integer.valueOf(n96.f24200b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    /* renamed from: S */
    public String[] mo65829S() {
        return f55850P;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        m65938A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        m65938A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: r */
    public Animator mo65825r(ViewGroup viewGroup, N96 n96, N96 n962) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (n96 == null || n962 == null) {
            return null;
        }
        View view = n962.f24200b;
        int intValue = ((Integer) n96.f24199a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) n962.f24199a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) n96.f24199a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) n962.f24199a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return C12058d.m65794c(objectAnimator, objectAnimator2);
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
