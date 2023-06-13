package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
/* loaded from: classes.dex */
public abstract class Visibility extends Transition {

    /* renamed from: Q */
    public static final String[] f55953Q = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: P */
    public int f55954P;

    /* renamed from: androidx.transition.Visibility$a */
    /* loaded from: classes.dex */
    public class C12046a extends C12054b {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f55955a;

        /* renamed from: b */
        public final /* synthetic */ View f55956b;

        /* renamed from: c */
        public final /* synthetic */ View f55957c;

        public C12046a(ViewGroup viewGroup, View view, View view2) {
            this.f55955a = viewGroup;
            this.f55956b = view;
            this.f55957c = view2;
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            this.f55957c.setTag(C36351Ug4.save_overlay_view, null);
            C44747lr6.m26736b(this.f55955a).mo31748d(this.f55956b);
            transition.mo65854h0(this);
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionPause(Transition transition) {
            C44747lr6.m26736b(this.f55955a).mo31748d(this.f55956b);
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionResume(Transition transition) {
            if (this.f55956b.getParent() == null) {
                C44747lr6.m26736b(this.f55955a).mo31749c(this.f55956b);
            } else {
                Visibility.this.cancel();
            }
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    /* loaded from: classes.dex */
    public static class C12047b extends AnimatorListenerAdapter implements Transition.InterfaceC12043f {

        /* renamed from: a */
        public final View f55959a;

        /* renamed from: b */
        public final int f55960b;

        /* renamed from: c */
        public final ViewGroup f55961c;

        /* renamed from: d */
        public final boolean f55962d;

        /* renamed from: e */
        public boolean f55963e;

        /* renamed from: f */
        public boolean f55964f = false;

        public C12047b(View view, int i, boolean z) {
            this.f55959a = view;
            this.f55960b = i;
            this.f55961c = (ViewGroup) view.getParent();
            this.f55962d = z;
            m65823b(true);
        }

        /* renamed from: a */
        public final void m65824a() {
            if (!this.f55964f) {
                C37172Xt6.m76163i(this.f55959a, this.f55960b);
                ViewGroup viewGroup = this.f55961c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m65823b(false);
        }

        /* renamed from: b */
        public final void m65823b(boolean z) {
            ViewGroup viewGroup;
            if (this.f55962d && this.f55963e != z && (viewGroup = this.f55961c) != null) {
                this.f55963e = z;
                C44747lr6.m26734d(viewGroup, z);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f55964f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m65824a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f55964f) {
                C37172Xt6.m76163i(this.f55959a, this.f55960b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f55964f) {
                C37172Xt6.m76163i(this.f55959a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            m65824a();
            transition.mo65854h0(this);
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionPause(Transition transition) {
            m65823b(false);
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionResume(Transition transition) {
            m65823b(true);
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.Visibility$c */
    /* loaded from: classes.dex */
    public static class C12048c {

        /* renamed from: a */
        public boolean f55965a;

        /* renamed from: b */
        public boolean f55966b;

        /* renamed from: c */
        public int f55967c;

        /* renamed from: d */
        public int f55968d;

        /* renamed from: e */
        public ViewGroup f55969e;

        /* renamed from: f */
        public ViewGroup f55970f;
    }

    public Visibility() {
        this.f55954P = 3;
    }

    /* renamed from: A0 */
    public final void m65837A0(N96 n96) {
        n96.f24199a.put("android:visibility:visibility", Integer.valueOf(n96.f24200b.getVisibility()));
        n96.f24199a.put("android:visibility:parent", n96.f24200b.getParent());
        int[] iArr = new int[2];
        n96.f24200b.getLocationOnScreen(iArr);
        n96.f24199a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: B0 */
    public int m65836B0() {
        return this.f55954P;
    }

    /* renamed from: C0 */
    public final C12048c m65835C0(N96 n96, N96 n962) {
        C12048c c12048c = new C12048c();
        c12048c.f55965a = false;
        c12048c.f55966b = false;
        if (n96 != null && n96.f24199a.containsKey("android:visibility:visibility")) {
            c12048c.f55967c = ((Integer) n96.f24199a.get("android:visibility:visibility")).intValue();
            c12048c.f55969e = (ViewGroup) n96.f24199a.get("android:visibility:parent");
        } else {
            c12048c.f55967c = -1;
            c12048c.f55969e = null;
        }
        if (n962 != null && n962.f24199a.containsKey("android:visibility:visibility")) {
            c12048c.f55968d = ((Integer) n962.f24199a.get("android:visibility:visibility")).intValue();
            c12048c.f55970f = (ViewGroup) n962.f24199a.get("android:visibility:parent");
        } else {
            c12048c.f55968d = -1;
            c12048c.f55970f = null;
        }
        if (n96 != null && n962 != null) {
            int i = c12048c.f55967c;
            int i2 = c12048c.f55968d;
            if (i == i2 && c12048c.f55969e == c12048c.f55970f) {
                return c12048c;
            }
            if (i != i2) {
                if (i == 0) {
                    c12048c.f55966b = false;
                    c12048c.f55965a = true;
                } else if (i2 == 0) {
                    c12048c.f55966b = true;
                    c12048c.f55965a = true;
                }
            } else if (c12048c.f55970f == null) {
                c12048c.f55966b = false;
                c12048c.f55965a = true;
            } else if (c12048c.f55969e == null) {
                c12048c.f55966b = true;
                c12048c.f55965a = true;
            }
        } else if (n96 == null && c12048c.f55968d == 0) {
            c12048c.f55966b = true;
            c12048c.f55965a = true;
        } else if (n962 == null && c12048c.f55967c == 0) {
            c12048c.f55966b = false;
            c12048c.f55965a = true;
        }
        return c12048c;
    }

    /* renamed from: F0 */
    public Animator m65834F0(ViewGroup viewGroup, N96 n96, int i, N96 n962, int i2) {
        if ((this.f55954P & 1) != 1 || n962 == null) {
            return null;
        }
        if (n96 == null) {
            View view = (View) n962.f24200b.getParent();
            if (m65835C0(m65905D(view, false), m65895U(view, false)).f55965a) {
                return null;
            }
        }
        return mo65833G0(viewGroup, n962.f24200b, n96, n962);
    }

    /* renamed from: G0 */
    public Animator mo65833G0(ViewGroup viewGroup, View view, N96 n96, N96 n962) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.f55934x != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator m65832H0(ViewGroup viewGroup, N96 n96, int i, N96 n962, int i2) {
        View view;
        View view2;
        boolean z;
        boolean z2;
        View view3;
        if ((this.f55954P & 2) != 2 || n96 == null) {
            return null;
        }
        View view4 = n96.f24200b;
        if (n962 != null) {
            view = n962.f24200b;
        } else {
            view = null;
        }
        int i3 = C36351Ug4.save_overlay_view;
        View view5 = (View) view4.getTag(i3);
        if (view5 != null) {
            view3 = null;
            z2 = true;
        } else if (view != null && view.getParent() != null) {
            if (i2 == 4 || view4 == view) {
                view2 = view;
                z = false;
                view = null;
                if (z) {
                }
                z2 = false;
                View view6 = view2;
                view5 = view;
                view3 = view6;
            }
            view = null;
            view2 = null;
            z = true;
            if (z) {
            }
            z2 = false;
            View view62 = view2;
            view5 = view;
            view3 = view62;
        } else {
            if (view != null) {
                view2 = null;
                z = false;
                if (z) {
                    if (view4.getParent() != null) {
                        if (view4.getParent() instanceof View) {
                            View view7 = (View) view4.getParent();
                            if (!m65835C0(m65895U(view7, true), m65905D(view7, true)).f55965a) {
                                view = C12058d.m65796a(viewGroup, view4, view7);
                            } else {
                                int id = view7.getId();
                                if (view7.getParent() == null) {
                                    if (id != -1) {
                                        if (viewGroup.findViewById(id) != null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    view3 = view2;
                    z2 = false;
                    view5 = view4;
                }
                z2 = false;
                View view622 = view2;
                view5 = view;
                view3 = view622;
            }
            view = null;
            view2 = null;
            z = true;
            if (z) {
            }
            z2 = false;
            View view6222 = view2;
            view5 = view;
            view3 = view6222;
        }
        if (view5 != null) {
            if (!z2) {
                int[] iArr = (int[]) n96.f24199a.get("android:visibility:screenLocation");
                int i4 = iArr[0];
                int i5 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view5.offsetLeftAndRight((i4 - iArr2[0]) - view5.getLeft());
                view5.offsetTopAndBottom((i5 - iArr2[1]) - view5.getTop());
                C44747lr6.m26736b(viewGroup).mo31749c(view5);
            }
            Animator mo65831I0 = mo65831I0(viewGroup, view5, n96, n962);
            if (!z2) {
                if (mo65831I0 == null) {
                    C44747lr6.m26736b(viewGroup).mo31748d(view5);
                } else {
                    view4.setTag(i3, view5);
                    mo65857d(new C12046a(viewGroup, view5, view4));
                }
            }
            return mo65831I0;
        } else if (view3 == null) {
            return null;
        } else {
            int visibility = view3.getVisibility();
            C37172Xt6.m76163i(view3, 0);
            Animator mo65831I02 = mo65831I0(viewGroup, view3, n96, n962);
            if (mo65831I02 != null) {
                C12047b c12047b = new C12047b(view3, i2, true);
                mo65831I02.addListener(c12047b);
                C1112Cf.m111928a(mo65831I02, c12047b);
                mo65857d(c12047b);
            } else {
                C37172Xt6.m76163i(view3, visibility);
            }
            return mo65831I02;
        }
    }

    /* renamed from: I0 */
    public Animator mo65831I0(ViewGroup viewGroup, View view, N96 n96, N96 n962) {
        return null;
    }

    /* renamed from: J0 */
    public void m65830J0(int i) {
        if ((i & (-4)) == 0) {
            this.f55954P = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // androidx.transition.Transition
    /* renamed from: S */
    public String[] mo65829S() {
        return f55953Q;
    }

    @Override // androidx.transition.Transition
    /* renamed from: V */
    public boolean mo65828V(N96 n96, N96 n962) {
        if (n96 == null && n962 == null) {
            return false;
        }
        if (n96 != null && n962 != null && n962.f24199a.containsKey("android:visibility:visibility") != n96.f24199a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C12048c m65835C0 = m65835C0(n96, n962);
        if (!m65835C0.f55965a) {
            return false;
        }
        if (m65835C0.f55967c != 0 && m65835C0.f55968d != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        m65837A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        m65837A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: r */
    public Animator mo65825r(ViewGroup viewGroup, N96 n96, N96 n962) {
        C12048c m65835C0 = m65835C0(n96, n962);
        if (m65835C0.f55965a) {
            if (m65835C0.f55969e != null || m65835C0.f55970f != null) {
                if (m65835C0.f55966b) {
                    return m65834F0(viewGroup, n96, m65835C0.f55967c, n962, m65835C0.f55968d);
                }
                return m65832H0(viewGroup, n96, m65835C0.f55967c, n962, m65835C0.f55968d);
            }
            return null;
        }
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55954P = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33751e);
        int m103669g = C33266Hb6.m103669g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (m103669g != 0) {
            m65830J0(m103669g);
        }
    }
}
