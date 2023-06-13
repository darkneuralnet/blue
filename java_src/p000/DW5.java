package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
/* renamed from: DW5 */
/* loaded from: classes5.dex */
public class DW5 implements View.OnTouchListener {

    /* renamed from: b */
    public final int f5823b;

    /* renamed from: c */
    public final int f5824c;

    /* renamed from: d */
    public final int f5825d;

    /* renamed from: e */
    public final long f5826e;

    /* renamed from: f */
    public final View f5827f;

    /* renamed from: g */
    public final InterfaceC1509c f5828g;

    /* renamed from: h */
    public int f5829h = 1;

    /* renamed from: i */
    public float f5830i;

    /* renamed from: j */
    public float f5831j;

    /* renamed from: k */
    public boolean f5832k;

    /* renamed from: l */
    public int f5833l;

    /* renamed from: m */
    public final Object f5834m;

    /* renamed from: n */
    public VelocityTracker f5835n;

    /* renamed from: o */
    public float f5836o;

    /* renamed from: DW5$a */
    /* loaded from: classes5.dex */
    public class C1507a extends AnimatorListenerAdapter {
        public C1507a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DW5.this.m110301f();
        }
    }

    /* renamed from: DW5$b */
    /* loaded from: classes5.dex */
    public class C1508b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f5838a;

        /* renamed from: b */
        public final /* synthetic */ int f5839b;

        public C1508b(ViewGroup.LayoutParams layoutParams, int i) {
            this.f5838a = layoutParams;
            this.f5839b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DW5.this.f5828g.mo95186a(DW5.this.f5827f, DW5.this.f5834m);
            DW5.this.f5827f.setAlpha(1.0f);
            DW5.this.f5827f.setTranslationX(0.0f);
            this.f5838a.height = this.f5839b;
            DW5.this.f5827f.setLayoutParams(this.f5838a);
        }
    }

    /* renamed from: DW5$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC1509c {
        /* renamed from: a */
        void mo95186a(View view, Object obj);

        /* renamed from: b */
        boolean mo95185b(Object obj);
    }

    public DW5(View view, Object obj, InterfaceC1509c interfaceC1509c) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f5823b = viewConfiguration.getScaledTouchSlop();
        this.f5824c = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f5825d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5826e = view.getContext().getResources().getInteger(17694720);
        this.f5827f = view;
        this.f5834m = obj;
        this.f5828g = interfaceC1509c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m110302e(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f5827f.setLayoutParams(layoutParams);
    }

    @TargetApi(12)
    /* renamed from: f */
    public void m110301f() {
        final ViewGroup.LayoutParams layoutParams = this.f5827f.getLayoutParams();
        int height = this.f5827f.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.f5826e);
        duration.addListener(new C1508b(layoutParams, height));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: CW5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DW5.this.m110302e(layoutParams, valueAnimator);
            }
        });
        duration.start();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        motionEvent.offsetLocation(this.f5836o, 0.0f);
        if (this.f5829h < 2) {
            this.f5829h = this.f5827f.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z5 = true;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && this.f5835n != null) {
                        this.f5827f.animate().translationX(0.0f).alpha(1.0f).setDuration(this.f5826e).setListener(null);
                        this.f5835n.recycle();
                        this.f5835n = null;
                        this.f5836o = 0.0f;
                        this.f5830i = 0.0f;
                        this.f5831j = 0.0f;
                        this.f5832k = false;
                    }
                } else {
                    VelocityTracker velocityTracker = this.f5835n;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.f5830i;
                        float rawY = motionEvent.getRawY() - this.f5831j;
                        if (Math.abs(rawX) > this.f5823b && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.f5832k = true;
                            if (rawX > 0.0f) {
                                i2 = this.f5823b;
                            } else {
                                i2 = -this.f5823b;
                            }
                            this.f5833l = i2;
                            this.f5827f.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            this.f5827f.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.f5832k) {
                            this.f5836o = rawX;
                            this.f5827f.setTranslationX(rawX - this.f5833l);
                            return true;
                        }
                    }
                }
            } else if (this.f5835n != null) {
                float rawX2 = motionEvent.getRawX() - this.f5830i;
                this.f5835n.addMovement(motionEvent);
                this.f5835n.computeCurrentVelocity(1000);
                float xVelocity = this.f5835n.getXVelocity();
                float abs = Math.abs(xVelocity);
                float abs2 = Math.abs(this.f5835n.getYVelocity());
                if (Math.abs(rawX2) > this.f5829h / 2 && this.f5832k) {
                    if (rawX2 > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (this.f5824c <= abs && abs <= this.f5825d && abs2 < abs && this.f5832k) {
                    if (xVelocity < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rawX2 < 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 == z3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.f5835n.getXVelocity() <= 0.0f) {
                        z5 = false;
                    }
                    boolean z6 = z5;
                    z5 = z4;
                    z = z6;
                } else {
                    z = false;
                    z5 = false;
                }
                if (z5) {
                    ViewPropertyAnimator animate = this.f5827f.animate();
                    if (z) {
                        i = this.f5829h;
                    } else {
                        i = -this.f5829h;
                    }
                    animate.translationX(i).alpha(0.0f).setDuration(this.f5826e).setListener(new C1507a());
                } else if (this.f5832k) {
                    this.f5827f.animate().translationX(0.0f).alpha(1.0f).setDuration(this.f5826e).setListener(null);
                }
                this.f5835n.recycle();
                this.f5835n = null;
                this.f5836o = 0.0f;
                this.f5830i = 0.0f;
                this.f5831j = 0.0f;
                this.f5832k = false;
            }
            return false;
        }
        this.f5830i = motionEvent.getRawX();
        this.f5831j = motionEvent.getRawY();
        if (this.f5828g.mo95185b(this.f5834m)) {
            VelocityTracker obtain2 = VelocityTracker.obtain();
            this.f5835n = obtain2;
            obtain2.addMovement(motionEvent);
        }
        return false;
    }
}
