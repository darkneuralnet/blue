package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* renamed from: Ns6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34823Ns6 {

    /* renamed from: a */
    public final WeakReference<View> f25325a;

    /* renamed from: b */
    public Runnable f25326b = null;

    /* renamed from: c */
    public Runnable f25327c = null;

    /* renamed from: d */
    public int f25328d = -1;

    /* renamed from: Ns6$a */
    /* loaded from: classes.dex */
    public class C5730a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC35291Ps6 f25329a;

        /* renamed from: b */
        public final /* synthetic */ View f25330b;

        public C5730a(InterfaceC35291Ps6 interfaceC35291Ps6, View view) {
            this.f25329a = interfaceC35291Ps6;
            this.f25330b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25329a.mo4255a(this.f25330b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25329a.mo4254b(this.f25330b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f25329a.mo4253c(this.f25330b);
        }
    }

    /* renamed from: Ns6$b */
    /* loaded from: classes.dex */
    public static class C5731b {
        private C5731b() {
        }

        /* renamed from: a */
        public static ViewPropertyAnimator m93235a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public C34823Ns6(View view) {
        this.f25325a = new WeakReference<>(view);
    }

    /* renamed from: b */
    public C34823Ns6 m93248b(float f) {
        View view = this.f25325a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void m93247c() {
        View view = this.f25325a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m93246d() {
        View view = this.f25325a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public C34823Ns6 m93244f(long j) {
        View view = this.f25325a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public C34823Ns6 m93243g(Interpolator interpolator) {
        View view = this.f25325a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C34823Ns6 m93242h(InterfaceC35291Ps6 interfaceC35291Ps6) {
        View view = this.f25325a.get();
        if (view != null) {
            m93241i(view, interfaceC35291Ps6);
        }
        return this;
    }

    /* renamed from: i */
    public final void m93241i(View view, InterfaceC35291Ps6 interfaceC35291Ps6) {
        if (interfaceC35291Ps6 != null) {
            view.animate().setListener(new C5730a(interfaceC35291Ps6, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: j */
    public C34823Ns6 m93240j(long j) {
        View view = this.f25325a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public C34823Ns6 m93239k(final InterfaceC35759Rs6 interfaceC35759Rs6) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = this.f25325a.get();
        if (view != null) {
            if (interfaceC35759Rs6 != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: Ms6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        InterfaceC35759Rs6.this.mo70207a(view);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            C5731b.m93235a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    /* renamed from: l */
    public void m93238l() {
        View view = this.f25325a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C34823Ns6 m93237m(float f) {
        View view = this.f25325a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    /* renamed from: n */
    public C34823Ns6 m93236n(float f) {
        View view = this.f25325a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
