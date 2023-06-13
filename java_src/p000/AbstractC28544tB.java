package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: tB */
/* loaded from: classes2.dex */
public abstract class AbstractC28544tB extends ValueAnimator {

    /* renamed from: b */
    public final Set<ValueAnimator.AnimatorUpdateListener> f109988b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final Set<Animator.AnimatorListener> f109989c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public final Set<Animator.AnimatorPauseListener> f109990d = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f109989c.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f109990d.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f109988b.add(animatorUpdateListener);
    }

    /* renamed from: d */
    public void mo12929d() {
        for (Animator.AnimatorListener animatorListener : this.f109989c) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* renamed from: e */
    public void m12928e(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f109989c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: f */
    public void m12927f() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f109990d) {
            animatorPauseListener.onAnimationPause(this);
        }
    }

    /* renamed from: g */
    public void m12926g() {
        for (Animator.AnimatorListener animatorListener : this.f109989c) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* renamed from: h */
    public void m12925h() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f109990d) {
            animatorPauseListener.onAnimationResume(this);
        }
    }

    /* renamed from: j */
    public void m12924j(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f109989c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* renamed from: k */
    public void m12923k() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f109988b) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f109989c.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f109988b.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f109989c.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f109990d.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f109988b.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
