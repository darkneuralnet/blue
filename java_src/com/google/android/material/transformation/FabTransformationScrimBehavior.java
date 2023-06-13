package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes6.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final ZV2 f73693c;

    /* renamed from: d */
    public final ZV2 f73694d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes6.dex */
    public class C17958a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f73695a;

        /* renamed from: b */
        public final /* synthetic */ View f73696b;

        public C17958a(boolean z, View view) {
            this.f73695a = z;
            this.f73696b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f73695a) {
                this.f73696b.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f73695a) {
                this.f73696b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f73693c = new ZV2(75L, 150L);
        this.f73694d = new ZV2(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: f */
    public AnimatorSet mo48474f(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m48473g(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C0168Af.m115414a(animatorSet, arrayList);
        animatorSet.addListener(new C17958a(z, view2));
        return animatorSet;
    }

    /* renamed from: g */
    public final void m48473g(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ZV2 zv2;
        ObjectAnimator ofFloat;
        if (z) {
            zv2 = this.f73693c;
        } else {
            zv2 = this.f73694d;
        }
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        zv2.m73011a(ofFloat);
        list.add(ofFloat);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73693c = new ZV2(75L, 150L);
        this.f73694d = new ZV2(0L, 150L);
    }
}
