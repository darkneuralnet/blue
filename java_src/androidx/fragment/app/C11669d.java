package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class C11669d {
    private C11669d() {
    }

    /* renamed from: a */
    public static int m67219a(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* renamed from: b */
    public static C11670a m67218b(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int m67219a = m67219a(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = C41690gi4.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, m67219a);
        if (onCreateAnimation != null) {
            return new C11670a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, m67219a);
        if (onCreateAnimator != null) {
            return new C11670a(onCreateAnimator);
        }
        if (m67219a == 0 && nextTransition != 0) {
            m67219a = m67216d(context, nextTransition, z);
        }
        if (m67219a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m67219a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m67219a);
                    if (loadAnimation != null) {
                        return new C11670a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, m67219a);
                    if (loadAnimator != null) {
                        return new C11670a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m67219a);
                        if (loadAnimation2 != null) {
                            return new C11670a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m67217c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    public static int m67216d(Context context, int i, boolean z) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return -1;
                        }
                        if (z) {
                            return m67217c(context, 16842936);
                        }
                        return m67217c(context, 16842937);
                    } else if (z) {
                        return C42253hf4.fragment_fade_enter;
                    } else {
                        return C42253hf4.fragment_fade_exit;
                    }
                } else if (z) {
                    return m67217c(context, 16842938);
                } else {
                    return m67217c(context, 16842939);
                }
            } else if (z) {
                return C42253hf4.fragment_close_enter;
            } else {
                return C42253hf4.fragment_close_exit;
            }
        } else if (z) {
            return C42253hf4.fragment_open_enter;
        } else {
            return C42253hf4.fragment_open_exit;
        }
    }

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    public static class C11670a {

        /* renamed from: a */
        public final Animation f54702a;

        /* renamed from: b */
        public final Animator f54703b;

        public C11670a(Animation animation) {
            this.f54702a = animation;
            this.f54703b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C11670a(Animator animator) {
            this.f54702a = null;
            this.f54703b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: classes.dex */
    public static class RunnableC11671b extends AnimationSet implements Runnable {

        /* renamed from: b */
        public final ViewGroup f54704b;

        /* renamed from: c */
        public final View f54705c;

        /* renamed from: d */
        public boolean f54706d;

        /* renamed from: e */
        public boolean f54707e;

        /* renamed from: f */
        public boolean f54708f;

        public RunnableC11671b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f54708f = true;
            this.f54704b = viewGroup;
            this.f54705c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f54708f = true;
            if (this.f54706d) {
                return !this.f54707e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f54706d = true;
                ViewTreeObserver$OnPreDrawListenerC32615Eh3.m108576a(this.f54704b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f54706d && this.f54708f) {
                this.f54708f = false;
                this.f54704b.post(this);
                return;
            }
            this.f54704b.endViewTransition(this.f54705c);
            this.f54707e = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f54708f = true;
            if (this.f54706d) {
                return !this.f54707e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f54706d = true;
                ViewTreeObserver$OnPreDrawListenerC32615Eh3.m108576a(this.f54704b, this);
            }
            return true;
        }
    }
}
