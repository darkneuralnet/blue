package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import net.danlew.android.joda.DateUtils;
import p000.C27125p2;
import p000.C35975Sq6;
import p000.InterfaceC28996u2;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: Q */
    public static final int[] f54340Q = {16843828};

    /* renamed from: R */
    public static final int[] f54341R = {16842931};

    /* renamed from: S */
    public static final boolean f54342S;

    /* renamed from: T */
    public static final boolean f54343T;

    /* renamed from: U */
    public static boolean f54344U;

    /* renamed from: A */
    public CharSequence f54345A;

    /* renamed from: B */
    public CharSequence f54346B;

    /* renamed from: C */
    public Object f54347C;

    /* renamed from: D */
    public boolean f54348D;

    /* renamed from: E */
    public Drawable f54349E;

    /* renamed from: F */
    public Drawable f54350F;

    /* renamed from: G */
    public Drawable f54351G;

    /* renamed from: H */
    public Drawable f54352H;

    /* renamed from: I */
    public final ArrayList<View> f54353I;

    /* renamed from: J */
    public Rect f54354J;

    /* renamed from: K */
    public Matrix f54355K;

    /* renamed from: P */
    public final InterfaceC28996u2 f54356P;

    /* renamed from: b */
    public final C11566d f54357b;

    /* renamed from: c */
    public float f54358c;

    /* renamed from: d */
    public int f54359d;

    /* renamed from: e */
    public int f54360e;

    /* renamed from: f */
    public float f54361f;

    /* renamed from: g */
    public Paint f54362g;

    /* renamed from: h */
    public final C35975Sq6 f54363h;

    /* renamed from: i */
    public final C35975Sq6 f54364i;

    /* renamed from: j */
    public final C11568f f54365j;

    /* renamed from: k */
    public final C11568f f54366k;

    /* renamed from: l */
    public int f54367l;

    /* renamed from: m */
    public boolean f54368m;

    /* renamed from: n */
    public boolean f54369n;

    /* renamed from: o */
    public int f54370o;

    /* renamed from: p */
    public int f54371p;

    /* renamed from: q */
    public int f54372q;

    /* renamed from: r */
    public int f54373r;

    /* renamed from: s */
    public boolean f54374s;

    /* renamed from: t */
    public InterfaceC11567e f54375t;

    /* renamed from: u */
    public List<InterfaceC11567e> f54376u;

    /* renamed from: v */
    public float f54377v;

    /* renamed from: w */
    public float f54378w;

    /* renamed from: x */
    public Drawable f54379x;

    /* renamed from: y */
    public Drawable f54380y;

    /* renamed from: z */
    public Drawable f54381z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    /* loaded from: classes.dex */
    public class C11563a implements InterfaceC28996u2 {
        public C11563a() {
        }

        @Override // p000.InterfaceC28996u2
        /* renamed from: a */
        public boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
            if (DrawerLayout.this.m67610D(view) && DrawerLayout.this.m67574r(view) != 2) {
                DrawerLayout.this.m67586f(view);
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    /* loaded from: classes.dex */
    public class View$OnApplyWindowInsetsListenerC11564b implements View.OnApplyWindowInsetsListener {
        public View$OnApplyWindowInsetsListenerC11564b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z = true;
            } else {
                z = false;
            }
            drawerLayout.setChildInsets(windowInsets, z);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    /* loaded from: classes.dex */
    public class C11565c extends C5148M1 {

        /* renamed from: a */
        public final Rect f54393a = new Rect();

        public C11565c() {
        }

        /* renamed from: a */
        public final void m67562a(C27125p2 c27125p2, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m67613A(childAt)) {
                    c27125p2.m20087c(childAt);
                }
            }
        }

        /* renamed from: b */
        public final void m67561b(C27125p2 c27125p2, C27125p2 c27125p22) {
            Rect rect = this.f54393a;
            c27125p22.m20065n(rect);
            c27125p2.m20088b0(rect);
            c27125p2.m20100T0(c27125p22.m20107Q());
            c27125p2.m20040z0(c27125p22.m20047w());
            c27125p2.m20080f0(c27125p22.m20061p());
            c27125p2.m20072j0(c27125p22.m20057r());
            c27125p2.m20064n0(c27125p22.m20123I());
            c27125p2.m20058q0(c27125p22.m20119K());
            c27125p2.m20093Y(c27125p22.m20131E());
            c27125p2.m20122I0(c27125p22.m20111O());
            c27125p2.m20091a(c27125p22.m20071k());
        }

        @Override // p000.C5148M1
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View m67576p = DrawerLayout.this.m67576p();
                if (m67576p != null) {
                    CharSequence m67573s = DrawerLayout.this.m67573s(DrawerLayout.this.m67572t(m67576p));
                    if (m67573s != null) {
                        text.add(m67573s);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            if (DrawerLayout.f54342S) {
                super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            } else {
                C27125p2 m20103S = C27125p2.m20103S(c27125p2);
                super.onInitializeAccessibilityNodeInfo(view, m20103S);
                c27125p2.m20118K0(view);
                ViewParent m62536J = C38790bq6.m62536J(view);
                if (m62536J instanceof View) {
                    c27125p2.m20136B0((View) m62536J);
                }
                m67561b(c27125p2, m20103S);
                m20103S.m20097V();
                m67562a(c27125p2, (ViewGroup) view);
            }
            c27125p2.m20080f0("androidx.drawerlayout.widget.DrawerLayout");
            c27125p2.m20060p0(false);
            c27125p2.m20058q0(false);
            c27125p2.m20095W(C27125p2.C27126a.f102993e);
            c27125p2.m20095W(C27125p2.C27126a.f102994f);
        }

        @Override // p000.C5148M1
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.f54342S && !DrawerLayout.m67613A(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    /* loaded from: classes.dex */
    public static final class C11566d extends C5148M1 {
        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            if (!DrawerLayout.m67613A(view)) {
                c27125p2.m20136B0(null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    /* loaded from: classes.dex */
    public interface InterfaceC11567e {
        /* renamed from: a */
        void mo67560a(View view);

        /* renamed from: b */
        void mo67559b(View view);

        /* renamed from: c */
        void mo67558c(int i);

        /* renamed from: d */
        void mo67557d(View view, float f);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    /* loaded from: classes.dex */
    public class C11568f extends C35975Sq6.AbstractC7553c {

        /* renamed from: a */
        public final int f54395a;

        /* renamed from: b */
        public C35975Sq6 f54396b;

        /* renamed from: c */
        public final Runnable f54397c = new RunnableC11569a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        /* loaded from: classes.dex */
        public class RunnableC11569a implements Runnable {
            public RunnableC11569a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C11568f.this.m67553o();
            }
        }

        public C11568f(int i) {
            this.f54395a = i;
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: a */
        public int mo49043a(View view, int i, int i2) {
            if (DrawerLayout.this.m67589c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: b */
        public int mo49042b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: d */
        public int mo49041d(View view) {
            if (DrawerLayout.this.m67609E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: f */
        public void mo66041f(int i, int i2) {
            View m67578n;
            if ((i & 1) == 1) {
                m67578n = DrawerLayout.this.m67578n(3);
            } else {
                m67578n = DrawerLayout.this.m67578n(5);
            }
            if (m67578n != null && DrawerLayout.this.m67574r(m67578n) == 0) {
                this.f54396b.m84770c(m67578n, i2);
            }
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: g */
        public boolean mo67556g(int i) {
            return false;
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: h */
        public void mo67555h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f54397c, 160L);
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: i */
        public void mo50235i(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f54384c = false;
            m67554n();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: j */
        public void mo49040j(int i) {
            DrawerLayout.this.m67592V(i, this.f54396b.m84750w());
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: k */
        public void mo49039k(View view, int i, int i2, int i3, int i4) {
            float width;
            int i5;
            int width2 = view.getWidth();
            if (DrawerLayout.this.m67589c(view, 3)) {
                width = i + width2;
            } else {
                width = DrawerLayout.this.getWidth() - i;
            }
            float f = width / width2;
            DrawerLayout.this.m67595S(view, f);
            if (f == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: l */
        public void mo49038l(View view, float f, float f2) {
            int i;
            float m67571u = DrawerLayout.this.m67571u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m67589c(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 <= 0 && (i2 != 0 || m67571u <= 0.5f)) {
                    i = -width;
                } else {
                    i = 0;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && m67571u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f54396b.m84776P(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p000.C35975Sq6.AbstractC7553c
        /* renamed from: m */
        public boolean mo49037m(View view, int i) {
            if (DrawerLayout.this.m67609E(view) && DrawerLayout.this.m67589c(view, this.f54395a) && DrawerLayout.this.m67574r(view) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public final void m67554n() {
            int i = 3;
            if (this.f54395a == 3) {
                i = 5;
            }
            View m67578n = DrawerLayout.this.m67578n(i);
            if (m67578n != null) {
                DrawerLayout.this.m67586f(m67578n);
            }
        }

        /* renamed from: o */
        public void m67553o() {
            boolean z;
            View m67578n;
            int width;
            int m84748y = this.f54396b.m84748y();
            int i = 0;
            if (this.f54395a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m67578n = DrawerLayout.this.m67578n(3);
                if (m67578n != null) {
                    i = -m67578n.getWidth();
                }
                width = i + m84748y;
            } else {
                m67578n = DrawerLayout.this.m67578n(5);
                width = DrawerLayout.this.getWidth() - m84748y;
            }
            if (m67578n != null) {
                if (((z && m67578n.getLeft() < width) || (!z && m67578n.getLeft() > width)) && DrawerLayout.this.m67574r(m67578n) == 0) {
                    this.f54396b.m84774R(m67578n, width, m67578n.getTop());
                    ((LayoutParams) m67578n.getLayoutParams()).f54384c = true;
                    DrawerLayout.this.invalidate();
                    m67554n();
                    DrawerLayout.this.m67590b();
                }
            }
        }

        /* renamed from: p */
        public void m67552p() {
            DrawerLayout.this.removeCallbacks(this.f54397c);
        }

        /* renamed from: q */
        public void m67551q(C35975Sq6 c35975Sq6) {
            this.f54396b = c35975Sq6;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        f54342S = true;
        f54343T = true;
        if (i < 29) {
            z = false;
        }
        f54344U = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public static boolean m67613A(View view) {
        if (C38790bq6.m62552B(view) != 4 && C38790bq6.m62552B(view) != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static String m67569w(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    /* renamed from: x */
    public static boolean m67568x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public boolean m67612B(View view) {
        return ((LayoutParams) view.getLayoutParams()).f54382a == 0;
    }

    /* renamed from: C */
    public boolean m67611C(int i) {
        View m67578n = m67578n(i);
        if (m67578n != null) {
            return m67610D(m67578n);
        }
        return false;
    }

    /* renamed from: D */
    public boolean m67610D(View view) {
        if (m67609E(view)) {
            if ((((LayoutParams) view.getLayoutParams()).f54385d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: E */
    public boolean m67609E(View view) {
        int m75415b = YD1.m75415b(((LayoutParams) view.getLayoutParams()).f54382a, C38790bq6.m62548D(view));
        if ((m75415b & 3) != 0 || (m75415b & 5) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean m67608F(int i) {
        View m67578n = m67578n(i);
        if (m67578n != null) {
            return m67607G(m67578n);
        }
        return false;
    }

    /* renamed from: G */
    public boolean m67607G(View view) {
        if (m67609E(view)) {
            if (((LayoutParams) view.getLayoutParams()).f54383b > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: H */
    public final boolean m67606H(float f, float f2, View view) {
        if (this.f54354J == null) {
            this.f54354J = new Rect();
        }
        view.getHitRect(this.f54354J);
        return this.f54354J.contains((int) f, (int) f2);
    }

    /* renamed from: I */
    public final void m67605I(Drawable drawable, int i) {
        if (drawable != null && P61.m90844h(drawable)) {
            P61.m90839m(drawable, i);
        }
    }

    /* renamed from: J */
    public void m67604J(View view, float f) {
        float m67571u = m67571u(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (m67571u * width));
        if (!m67589c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m67595S(view, f);
    }

    /* renamed from: K */
    public void m67603K(int i) {
        m67602L(i, true);
    }

    /* renamed from: L */
    public void m67602L(int i, boolean z) {
        View m67578n = m67578n(i);
        if (m67578n != null) {
            m67600N(m67578n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m67569w(i));
    }

    /* renamed from: M */
    public void m67601M(View view) {
        m67600N(view, true);
    }

    /* renamed from: N */
    public void m67600N(View view, boolean z) {
        if (m67609E(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f54369n) {
                layoutParams.f54383b = 1.0f;
                layoutParams.f54385d = 1;
                m67593U(view, true);
                m67594T(view);
            } else if (z) {
                layoutParams.f54385d |= 2;
                if (m67589c(view, 3)) {
                    this.f54363h.m84774R(view, 0, view.getTop());
                } else {
                    this.f54364i.m84774R(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m67604J(view, 1.0f);
                m67592V(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: O */
    public void m67599O(InterfaceC11567e interfaceC11567e) {
        List<InterfaceC11567e> list;
        if (interfaceC11567e == null || (list = this.f54376u) == null) {
            return;
        }
        list.remove(interfaceC11567e);
    }

    /* renamed from: P */
    public final Drawable m67598P() {
        int m62548D = C38790bq6.m62548D(this);
        if (m62548D == 0) {
            Drawable drawable = this.f54349E;
            if (drawable != null) {
                m67605I(drawable, m62548D);
                return this.f54349E;
            }
        } else {
            Drawable drawable2 = this.f54350F;
            if (drawable2 != null) {
                m67605I(drawable2, m62548D);
                return this.f54350F;
            }
        }
        return this.f54351G;
    }

    /* renamed from: Q */
    public final Drawable m67597Q() {
        int m62548D = C38790bq6.m62548D(this);
        if (m62548D == 0) {
            Drawable drawable = this.f54350F;
            if (drawable != null) {
                m67605I(drawable, m62548D);
                return this.f54350F;
            }
        } else {
            Drawable drawable2 = this.f54349E;
            if (drawable2 != null) {
                m67605I(drawable2, m62548D);
                return this.f54349E;
            }
        }
        return this.f54352H;
    }

    /* renamed from: R */
    public final void m67596R() {
        if (f54343T) {
            return;
        }
        this.f54380y = m67598P();
        this.f54381z = m67597Q();
    }

    /* renamed from: S */
    public void m67595S(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f54383b) {
            return;
        }
        layoutParams.f54383b = f;
        m67580l(view, f);
    }

    /* renamed from: T */
    public final void m67594T(View view) {
        C27125p2.C27126a c27126a = C27125p2.C27126a.f103013y;
        C38790bq6.m62464p0(view, c27126a.m20038b());
        if (m67610D(view) && m67574r(view) != 2) {
            C38790bq6.m62460r0(view, c27126a, null, this.f54356P);
        }
    }

    /* renamed from: U */
    public final void m67593U(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !m67609E(childAt)) || (z && childAt == view)) {
                C38790bq6.m62539H0(childAt, 1);
            } else {
                C38790bq6.m62539H0(childAt, 4);
            }
        }
    }

    /* renamed from: V */
    public void m67592V(int i, View view) {
        int i2;
        int m84790B = this.f54363h.m84790B();
        int m84790B2 = this.f54364i.m84790B();
        if (m84790B != 1 && m84790B2 != 1) {
            i2 = 2;
            if (m84790B != 2 && m84790B2 != 2) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f54383b;
            if (f == 0.0f) {
                m67582j(view);
            } else if (f == 1.0f) {
                m67581k(view);
            }
        }
        if (i2 != this.f54367l) {
            this.f54367l = i2;
            List<InterfaceC11567e> list = this.f54376u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f54376u.get(size).mo67558c(i2);
                }
            }
        }
    }

    /* renamed from: a */
    public void m67591a(InterfaceC11567e interfaceC11567e) {
        if (interfaceC11567e == null) {
            return;
        }
        if (this.f54376u == null) {
            this.f54376u = new ArrayList();
        }
        this.f54376u.add(interfaceC11567e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (m67609E(childAt)) {
                if (m67610D(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.f54353I.add(childAt);
            }
        }
        if (!z) {
            int size = this.f54353I.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f54353I.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f54353I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m67577o() == null && !m67609E(view)) {
            C38790bq6.m62539H0(view, 1);
        } else {
            C38790bq6.m62539H0(view, 4);
        }
        if (!f54342S) {
            C38790bq6.m62452v0(view, this.f54357b);
        }
    }

    /* renamed from: b */
    public void m67590b() {
        if (!this.f54374s) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f54374s = true;
        }
    }

    /* renamed from: c */
    public boolean m67589c(View view, int i) {
        return (m67572t(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f54383b);
        }
        this.f54361f = f;
        boolean m84759n = this.f54363h.m84759n(true);
        boolean m84759n2 = this.f54364i.m84759n(true);
        if (m84759n || m84759n2) {
            C38790bq6.m62470m0(this);
        }
    }

    /* renamed from: d */
    public void m67588d(int i) {
        m67587e(i, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f54361f > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; i >= 0; i--) {
                    View childAt = getChildAt(i);
                    if (m67606H(x, y, childAt) && !m67612B(childAt) && m67579m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean m67612B = m67612B(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (m67612B) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && m67568x(childAt) && m67609E(childAt) && childAt.getHeight() >= height) {
                    if (m67589c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f54361f;
        if (f > 0.0f && m67612B) {
            this.f54362g.setColor((this.f54360e & 16777215) | (((int) ((((-16777216) & i) >>> 24) * f)) << 24));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.f54362g);
        } else if (this.f54380y != null && m67589c(view, 3)) {
            int intrinsicWidth = this.f54380y.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f54363h.m84748y(), 1.0f));
            this.f54380y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f54380y.setAlpha((int) (max * 255.0f));
            this.f54380y.draw(canvas);
        } else if (this.f54381z != null && m67589c(view, 5)) {
            int intrinsicWidth2 = this.f54381z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f54364i.m84748y(), 1.0f));
            this.f54381z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f54381z.setAlpha((int) (max2 * 255.0f));
            this.f54381z.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void m67587e(int i, boolean z) {
        View m67578n = m67578n(i);
        if (m67578n != null) {
            m67585g(m67578n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m67569w(i));
    }

    /* renamed from: f */
    public void m67586f(View view) {
        m67585g(view, true);
    }

    /* renamed from: g */
    public void m67585g(View view, boolean z) {
        if (m67609E(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f54369n) {
                layoutParams.f54383b = 0.0f;
                layoutParams.f54385d = 0;
            } else if (z) {
                layoutParams.f54385d |= 4;
                if (m67589c(view, 3)) {
                    this.f54363h.m84774R(view, -view.getWidth(), view.getTop());
                } else {
                    this.f54364i.m84774R(view, getWidth(), view.getTop());
                }
            } else {
                m67604J(view, 0.0f);
                m67592V(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: h */
    public void m67584h() {
        m67583i(false);
    }

    /* renamed from: i */
    public void m67583i(boolean z) {
        boolean m84774R;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m67609E(childAt) && (!z || layoutParams.f54384c)) {
                int width = childAt.getWidth();
                if (m67589c(childAt, 3)) {
                    m84774R = this.f54363h.m84774R(childAt, -width, childAt.getTop());
                } else {
                    m84774R = this.f54364i.m84774R(childAt, getWidth(), childAt.getTop());
                }
                z2 |= m84774R;
                layoutParams.f54384c = false;
            }
        }
        this.f54365j.m67552p();
        this.f54366k.m67552p();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: j */
    public void m67582j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f54385d & 1) == 1) {
            layoutParams.f54385d = 0;
            List<InterfaceC11567e> list = this.f54376u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f54376u.get(size).mo67559b(view);
                }
            }
            m67593U(view, false);
            m67594T(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: k */
    public void m67581k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f54385d & 1) == 0) {
            layoutParams.f54385d = 1;
            List<InterfaceC11567e> list = this.f54376u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f54376u.get(size).mo67560a(view);
                }
            }
            m67593U(view, true);
            m67594T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: l */
    public void m67580l(View view, float f) {
        List<InterfaceC11567e> list = this.f54376u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f54376u.get(size).mo67557d(view, f);
            }
        }
    }

    /* renamed from: m */
    public final boolean m67579m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent m67570v = m67570v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(m67570v);
            m67570v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: n */
    public View m67578n(int i) {
        int m75415b = YD1.m75415b(i, C38790bq6.m62548D(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m67572t(childAt) & 7) == m75415b) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public View m67577o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f54385d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f54369n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54369n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f54348D && this.f54379x != null) {
            Object obj = this.f54347C;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f54379x.setBounds(0, 0, getWidth(), i);
                this.f54379x.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m84752u;
        int actionMasked = motionEvent.getActionMasked();
        boolean m84775Q = this.f54363h.m84775Q(motionEvent) | this.f54364i.m84775Q(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f54363h.m84768e(3)) {
                        this.f54365j.m67552p();
                        this.f54366k.m67552p();
                    }
                }
                z = false;
            }
            m67583i(true);
            this.f54374s = false;
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f54377v = x;
            this.f54378w = y;
            if (this.f54361f > 0.0f && (m84752u = this.f54363h.m84752u((int) x, (int) y)) != null && m67612B(m84752u)) {
                z = true;
            } else {
                z = false;
            }
            this.f54374s = false;
        }
        if (m84775Q || z || m67567y() || this.f54374s) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m67566z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m67576p = m67576p();
            if (m67576p != null && m67574r(m67576p) == 0) {
                m67584h();
            }
            if (m67576p != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        int i5;
        float f;
        int i6;
        boolean z2;
        int i7;
        boolean z3 = true;
        this.f54368m = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m67612B(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i10, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m67589c(childAt, 3)) {
                        float f2 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (layoutParams.f54383b * f2));
                        f = (measuredWidth + i6) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i8 - i5) / f3;
                        i6 = i8 - ((int) (layoutParams.f54383b * f3));
                    }
                    if (f != layoutParams.f54383b) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                    int i11 = layoutParams.f54382a & 112;
                    if (i11 != 16) {
                        if (i11 != 80) {
                            int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                        } else {
                            int i13 = i4 - i2;
                            childAt.layout(i6, (i13 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i13 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        }
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight;
                            int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i15, measuredWidth + i6, measuredHeight + i15);
                    }
                    if (z2) {
                        m67595S(childAt, f);
                    }
                    if (layoutParams.f54383b > 0.0f) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    if (childAt.getVisibility() != i7) {
                        childAt.setVisibility(i7);
                    }
                }
            }
            i9++;
            z3 = true;
        }
        if (f54344U && (rootWindowInsets = getRootWindowInsets()) != null) {
            D32 m110781i = DB6.m110765y(rootWindowInsets).m110781i();
            C35975Sq6 c35975Sq6 = this.f54363h;
            c35975Sq6.m84779M(Math.max(c35975Sq6.m84749x(), m110781i.f5126a));
            C35975Sq6 c35975Sq62 = this.f54364i;
            c35975Sq62.m84779M(Math.max(c35975Sq62.m84749x(), m110781i.f5128c));
        }
        this.f54368m = false;
        this.f54369n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        boolean z;
        int m67572t;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f54347C != null && C38790bq6.m62554A(this)) {
            z = true;
        } else {
            z = false;
        }
        int m62548D = C38790bq6.m62548D(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int m75415b = YD1.m75415b(layoutParams.f54382a, m62548D);
                    if (C38790bq6.m62554A(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f54347C;
                        if (m75415b == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (m75415b == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f54347C;
                        if (m75415b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (m75415b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m67612B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else if (m67609E(childAt)) {
                    if (f54343T) {
                        float m62447y = C38790bq6.m62447y(childAt);
                        float f = this.f54358c;
                        if (m62447y != f) {
                            C38790bq6.m62545E0(childAt, f);
                        }
                    }
                    if ((m67572t(childAt) & 7) == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((z2 && z3) || (!z2 && z4)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m67569w(m67572t) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z2) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f54359d + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View m67578n;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        int i = savedState.f54386d;
        if (i != 0 && (m67578n = m67578n(i)) != null) {
            m67601M(m67578n);
        }
        int i2 = savedState.f54387e;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.f54388f;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.f54389g;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = savedState.f54390h;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m67596R();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f54385d;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f54386d = layoutParams.f54382a;
                break;
            }
        }
        savedState.f54387e = this.f54370o;
        savedState.f54388f = this.f54371p;
        savedState.f54389g = this.f54372q;
        savedState.f54390h = this.f54373r;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (m67574r(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f54363h.m84785G(motionEvent);
        this.f54364i.m84785G(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    m67583i(true);
                    this.f54374s = false;
                }
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View m84752u = this.f54363h.m84752u((int) x, (int) y);
                if (m84752u != null && m67612B(m84752u)) {
                    float f = x - this.f54377v;
                    float f2 = y - this.f54378w;
                    int m84791A = this.f54363h.m84791A();
                    if ((f * f) + (f2 * f2) < m84791A * m84791A) {
                        View m67577o = m67577o();
                        if (m67577o != null) {
                        }
                    }
                }
                z = true;
                m67583i(z);
            }
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f54377v = x2;
            this.f54378w = y2;
            this.f54374s = false;
        }
        return true;
    }

    /* renamed from: p */
    public View m67576p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m67609E(childAt) && m67607G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public int m67575q(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int m62548D = C38790bq6.m62548D(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i == 8388613) {
                        int i6 = this.f54373r;
                        if (i6 != 3) {
                            return i6;
                        }
                        if (m62548D == 0) {
                            i5 = this.f54371p;
                        } else {
                            i5 = this.f54370o;
                        }
                        if (i5 != 3) {
                            return i5;
                        }
                        return 0;
                    }
                    return 0;
                }
                int i7 = this.f54372q;
                if (i7 != 3) {
                    return i7;
                }
                if (m62548D == 0) {
                    i4 = this.f54370o;
                } else {
                    i4 = this.f54371p;
                }
                if (i4 != 3) {
                    return i4;
                }
                return 0;
            }
            int i8 = this.f54371p;
            if (i8 != 3) {
                return i8;
            }
            if (m62548D == 0) {
                i3 = this.f54373r;
            } else {
                i3 = this.f54372q;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        int i9 = this.f54370o;
        if (i9 != 3) {
            return i9;
        }
        if (m62548D == 0) {
            i2 = this.f54372q;
        } else {
            i2 = this.f54373r;
        }
        if (i2 != 3) {
            return i2;
        }
        return 0;
    }

    /* renamed from: r */
    public int m67574r(View view) {
        if (m67609E(view)) {
            return m67575q(((LayoutParams) view.getLayoutParams()).f54382a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m67583i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f54368m) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public CharSequence m67573s(int i) {
        int m75415b = YD1.m75415b(i, C38790bq6.m62548D(this));
        if (m75415b == 3) {
            return this.f54345A;
        }
        if (m75415b == 5) {
            return this.f54346B;
        }
        return null;
    }

    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.f54347C = obj;
        this.f54348D = z;
        if (!z && getBackground() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f54358c = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m67609E(childAt)) {
                C38790bq6.m62545E0(childAt, this.f54358c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC11567e interfaceC11567e) {
        InterfaceC11567e interfaceC11567e2 = this.f54375t;
        if (interfaceC11567e2 != null) {
            m67599O(interfaceC11567e2);
        }
        if (interfaceC11567e != null) {
            m67591a(interfaceC11567e);
        }
        this.f54375t = interfaceC11567e;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (f54343T) {
            return;
        }
        if ((i & 8388611) == 8388611) {
            this.f54349E = drawable;
        } else if ((i & 8388613) == 8388613) {
            this.f54350F = drawable;
        } else if ((i & 3) == 3) {
            this.f54351G = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.f54352H = drawable;
        }
        m67596R();
        invalidate();
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int m75415b = YD1.m75415b(i, C38790bq6.m62548D(this));
        if (m75415b == 3) {
            this.f54345A = charSequence;
        } else if (m75415b == 5) {
            this.f54346B = charSequence;
        }
    }

    public void setScrimColor(int i) {
        this.f54360e = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f54379x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f54379x = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: t */
    public int m67572t(View view) {
        return YD1.m75415b(((LayoutParams) view.getLayoutParams()).f54382a, C38790bq6.m62548D(this));
    }

    /* renamed from: u */
    public float m67571u(View view) {
        return ((LayoutParams) view.getLayoutParams()).f54383b;
    }

    /* renamed from: v */
    public final MotionEvent m67570v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f54355K == null) {
                this.f54355K = new Matrix();
            }
            matrix.invert(this.f54355K);
            obtain.transform(this.f54355K);
        }
        return obtain;
    }

    /* renamed from: y */
    public final boolean m67567y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f54384c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m67566z() {
        return m67576p() != null;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C46997pf4.drawerLayoutStyle);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54357b = new C11566d();
        this.f54360e = -1728053248;
        this.f54362g = new Paint();
        this.f54369n = true;
        this.f54370o = 3;
        this.f54371p = 3;
        this.f54372q = 3;
        this.f54373r = 3;
        this.f54349E = null;
        this.f54350F = null;
        this.f54351G = null;
        this.f54352H = null;
        this.f54356P = new C11563a();
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        float f = getResources().getDisplayMetrics().density;
        this.f54359d = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C11568f c11568f = new C11568f(3);
        this.f54365j = c11568f;
        C11568f c11568f2 = new C11568f(5);
        this.f54366k = c11568f2;
        C35975Sq6 m84758o = C35975Sq6.m84758o(this, 1.0f, c11568f);
        this.f54363h = m84758o;
        m84758o.m84778N(1);
        m84758o.m84777O(f2);
        c11568f.m67551q(m84758o);
        C35975Sq6 m84758o2 = C35975Sq6.m84758o(this, 1.0f, c11568f2);
        this.f54364i = m84758o2;
        m84758o2.m84778N(2);
        m84758o2.m84777O(f2);
        c11568f2.m67551q(m84758o2);
        setFocusableInTouchMode(true);
        C38790bq6.m62539H0(this, 1);
        C38790bq6.m62452v0(this, new C11565c());
        setMotionEventSplittingEnabled(false);
        if (C38790bq6.m62554A(this)) {
            setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC11564b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f54340Q);
            try {
                this.f54379x = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C41137fm4.DrawerLayout, i, 0);
        try {
            int i2 = C41137fm4.DrawerLayout_elevation;
            if (obtainStyledAttributes2.hasValue(i2)) {
                this.f54358c = obtainStyledAttributes2.getDimension(i2, 0.0f);
            } else {
                this.f54358c = getResources().getDimension(C36576Vf4.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f54353I = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerLockMode(int i, int i2) {
        View m67578n;
        int m75415b = YD1.m75415b(i2, C38790bq6.m62548D(this));
        if (i2 == 3) {
            this.f54370o = i;
        } else if (i2 == 5) {
            this.f54371p = i;
        } else if (i2 == 8388611) {
            this.f54372q = i;
        } else if (i2 == 8388613) {
            this.f54373r = i;
        }
        if (i != 0) {
            (m75415b == 3 ? this.f54363h : this.f54364i).m84771b();
        }
        if (i != 1) {
            if (i == 2 && (m67578n = m67578n(m75415b)) != null) {
                m67601M(m67578n);
                return;
            }
            return;
        }
        View m67578n2 = m67578n(m75415b);
        if (m67578n2 != null) {
            m67586f(m67578n2);
        }
    }

    public void setStatusBarBackground(int i) {
        this.f54379x = i != 0 ? NA0.m94299e(getContext(), i) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f54382a;

        /* renamed from: b */
        public float f54383b;

        /* renamed from: c */
        public boolean f54384c;

        /* renamed from: d */
        public int f54385d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f54382a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f54341R);
            this.f54382a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f54382a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f54382a = 0;
            this.f54382a = layoutParams.f54382a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f54382a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f54382a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11562a();

        /* renamed from: d */
        public int f54386d;

        /* renamed from: e */
        public int f54387e;

        /* renamed from: f */
        public int f54388f;

        /* renamed from: g */
        public int f54389g;

        /* renamed from: h */
        public int f54390h;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        /* loaded from: classes.dex */
        public class C11562a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f54386d = 0;
            this.f54386d = parcel.readInt();
            this.f54387e = parcel.readInt();
            this.f54388f = parcel.readInt();
            this.f54389g = parcel.readInt();
            this.f54390h = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f54386d);
            parcel.writeInt(this.f54387e);
            parcel.writeInt(this.f54388f);
            parcel.writeInt(this.f54389g);
            parcel.writeInt(this.f54390h);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f54386d = 0;
        }
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(NA0.m94299e(getContext(), i), i2);
    }

    public void setDrawerLockMode(int i, View view) {
        if (m67609E(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).f54382a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }
}
