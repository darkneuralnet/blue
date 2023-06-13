package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.C27125p2;
import p000.C35975Sq6;
import p000.InterfaceC28996u2;
/* loaded from: classes6.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public C35975Sq6 f72273a;

    /* renamed from: b */
    public InterfaceC17678c f72274b;

    /* renamed from: c */
    public boolean f72275c;

    /* renamed from: d */
    public boolean f72276d;

    /* renamed from: f */
    public boolean f72278f;

    /* renamed from: e */
    public float f72277e = 0.0f;

    /* renamed from: g */
    public int f72279g = 2;

    /* renamed from: h */
    public float f72280h = 0.5f;

    /* renamed from: i */
    public float f72281i = 0.0f;

    /* renamed from: j */
    public float f72282j = 0.5f;

    /* renamed from: k */
    public final C35975Sq6.AbstractC7553c f72283k = new C17676a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes6.dex */
    public class C17676a extends C35975Sq6.AbstractC7553c {

        /* renamed from: a */
        public int f72284a;

        /* renamed from: b */
        public int f72285b = -1;

        public C17676a() {
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: a */
        public int mo49043a(View view, int i, int i2) {
            boolean z;
            int width;
            int width2;
            int width3;
            if (C38790bq6.m62548D(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = SwipeDismissBehavior.this.f72279g;
            if (i3 == 0) {
                if (z) {
                    width = this.f72284a - view.getWidth();
                    width2 = this.f72284a;
                } else {
                    width = this.f72284a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                if (z) {
                    width = this.f72284a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f72284a - view.getWidth();
                    width2 = this.f72284a;
                }
            } else {
                width = this.f72284a - view.getWidth();
                width2 = view.getWidth() + this.f72284a;
            }
            return SwipeDismissBehavior.m50243d(width, i, width2);
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: b */
        public int mo49042b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: d */
        public int mo49041d(View view) {
            return view.getWidth();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: i */
        public void mo50235i(View view, int i) {
            this.f72285b = i;
            this.f72284a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f72276d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f72276d = false;
            }
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: j */
        public void mo49040j(int i) {
            InterfaceC17678c interfaceC17678c = SwipeDismissBehavior.this.f72274b;
            if (interfaceC17678c != null) {
                interfaceC17678c.mo48871b(i);
            }
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: k */
        public void mo49039k(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f72281i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f72282j;
            float abs = Math.abs(i - this.f72284a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m50244c(0.0f, 1.0f - SwipeDismissBehavior.m50241f(width, width2, abs), 1.0f));
            }
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: l */
        public void mo49038l(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC17678c interfaceC17678c;
            this.f72285b = -1;
            int width = view.getWidth();
            if (m50234n(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.f72284a;
                    if (left >= i2) {
                        i = i2 + width;
                        z = true;
                    }
                }
                i = this.f72284a - width;
                z = true;
            } else {
                i = this.f72284a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f72273a.m84776P(i, view.getTop())) {
                C38790bq6.m62468n0(view, new RunnableC17679d(view, z));
            } else if (z && (interfaceC17678c = SwipeDismissBehavior.this.f72274b) != null) {
                interfaceC17678c.mo48872a(view);
            }
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: m */
        public boolean mo49037m(View view, int i) {
            int i2 = this.f72285b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo48885b(view)) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public final boolean m50234n(View view, float f) {
            boolean z;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (C38790bq6.m62548D(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f72279g;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            }
            if (Math.abs(view.getLeft() - this.f72284a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.f72280h)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes6.dex */
    public class C17677b implements InterfaceC28996u2 {
        public C17677b() {
        }

        @Override // p000.InterfaceC28996u2
        /* renamed from: a */
        public boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
            boolean z;
            boolean z2 = false;
            if (!SwipeDismissBehavior.this.mo48885b(view)) {
                return false;
            }
            if (C38790bq6.m62548D(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = SwipeDismissBehavior.this.f72279g;
            if ((i == 0 && z) || (i == 1 && !z)) {
                z2 = true;
            }
            int width = view.getWidth();
            if (z2) {
                width = -width;
            }
            C38790bq6.m62486f0(view, width);
            view.setAlpha(0.0f);
            InterfaceC17678c interfaceC17678c = SwipeDismissBehavior.this.f72274b;
            if (interfaceC17678c != null) {
                interfaceC17678c.mo48872a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC17678c {
        /* renamed from: a */
        void mo48872a(View view);

        /* renamed from: b */
        void mo48871b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    /* loaded from: classes6.dex */
    public class RunnableC17679d implements Runnable {

        /* renamed from: b */
        public final View f72288b;

        /* renamed from: c */
        public final boolean f72289c;

        public RunnableC17679d(View view, boolean z) {
            this.f72288b = view;
            this.f72289c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC17678c interfaceC17678c;
            C35975Sq6 c35975Sq6 = SwipeDismissBehavior.this.f72273a;
            if (c35975Sq6 != null && c35975Sq6.m84759n(true)) {
                C38790bq6.m62468n0(this.f72288b, this);
            } else if (this.f72289c && (interfaceC17678c = SwipeDismissBehavior.this.f72274b) != null) {
                interfaceC17678c.mo48872a(this.f72288b);
            }
        }
    }

    /* renamed from: c */
    public static float m50244c(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: d */
    public static int m50243d(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: f */
    public static float m50241f(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: b */
    public boolean mo48885b(View view) {
        return true;
    }

    /* renamed from: e */
    public final void m50242e(ViewGroup viewGroup) {
        C35975Sq6 m84757p;
        if (this.f72273a == null) {
            if (this.f72278f) {
                m84757p = C35975Sq6.m84758o(viewGroup, this.f72277e, this.f72283k);
            } else {
                m84757p = C35975Sq6.m84757p(viewGroup, this.f72283k);
            }
            this.f72273a = m84757p;
        }
    }

    /* renamed from: g */
    public void m50240g(float f) {
        this.f72282j = m50244c(0.0f, f, 1.0f);
    }

    /* renamed from: h */
    public void m50239h(InterfaceC17678c interfaceC17678c) {
        this.f72274b = interfaceC17678c;
    }

    /* renamed from: i */
    public void m50238i(float f) {
        this.f72281i = m50244c(0.0f, f, 1.0f);
    }

    /* renamed from: j */
    public void m50237j(int i) {
        this.f72279g = i;
    }

    /* renamed from: k */
    public final void m50236k(View view) {
        C38790bq6.m62464p0(view, 1048576);
        if (mo48885b(view)) {
            C38790bq6.m62460r0(view, C27125p2.C27126a.f103013y, null, new C17677b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f72275c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f72275c = false;
            }
        } else {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f72275c = z;
        }
        if (!z) {
            return false;
        }
        m50242e(coordinatorLayout);
        if (!this.f72276d && this.f72273a.m84775Q(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (C38790bq6.m62552B(v) == 0) {
            C38790bq6.m62539H0(v, 1);
            m50236k(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f72273a != null) {
            if (!this.f72276d || motionEvent.getActionMasked() != 3) {
                this.f72273a.m84785G(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
