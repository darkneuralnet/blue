package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: P */
    public static final String[] f55843P = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    /* loaded from: classes.dex */
    public class C12017a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f55844a;

        public C12017a(View view) {
            this.f55844a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C38790bq6.m62547D0(this.f55844a, null);
        }
    }

    public ChangeClipBounds() {
    }

    /* renamed from: A0 */
    public final void m65948A0(N96 n96) {
        View view = n96.f24200b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect m62451w = C38790bq6.m62451w(view);
        n96.f24199a.put("android:clipBounds:clip", m62451w);
        if (m62451w == null) {
            n96.f24199a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: S */
    public String[] mo65829S() {
        return f55843P;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        m65948A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        m65948A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: r */
    public Animator mo65825r(ViewGroup viewGroup, N96 n96, N96 n962) {
        boolean z;
        ObjectAnimator objectAnimator = null;
        if (n96 != null && n962 != null && n96.f24199a.containsKey("android:clipBounds:clip") && n962.f24199a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) n96.f24199a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) n962.f24199a.get("android:clipBounds:clip");
            if (rect2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) n96.f24199a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) n962.f24199a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            C38790bq6.m62547D0(n962.f24200b, rect);
            objectAnimator = ObjectAnimator.ofObject(n962.f24200b, (Property<View, V>) C37172Xt6.f44159c, (TypeEvaluator) new C35523Qs4(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                objectAnimator.addListener(new C12017a(n962.f24200b));
            }
        }
        return objectAnimator;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
