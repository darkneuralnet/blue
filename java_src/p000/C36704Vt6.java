package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import p000.DB6;
/* renamed from: Vt6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36704Vt6 {

    /* renamed from: Vt6$a */
    /* loaded from: classes6.dex */
    public class RunnableC8805a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f39885b;

        public RunnableC8805a(View view) {
            this.f39885b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f39885b.getContext().getSystemService("input_method")).showSoftInput(this.f39885b, 1);
        }
    }

    /* renamed from: Vt6$b */
    /* loaded from: classes6.dex */
    public class C8806b implements InterfaceC8809e {

        /* renamed from: a */
        public final /* synthetic */ boolean f39886a;

        /* renamed from: b */
        public final /* synthetic */ boolean f39887b;

        /* renamed from: c */
        public final /* synthetic */ boolean f39888c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC8809e f39889d;

        public C8806b(boolean z, boolean z2, boolean z3, InterfaceC8809e interfaceC8809e) {
            this.f39886a = z;
            this.f39887b = z2;
            this.f39888c = z3;
            this.f39889d = interfaceC8809e;
        }

        @Override // p000.C36704Vt6.InterfaceC8809e
        /* renamed from: a */
        public DB6 mo2412a(View view, DB6 db6, C8810f c8810f) {
            if (this.f39886a) {
                c8810f.f39895d += db6.m110780j();
            }
            boolean m79294n = C36704Vt6.m79294n(view);
            if (this.f39887b) {
                if (m79294n) {
                    c8810f.f39894c += db6.m110779k();
                } else {
                    c8810f.f39892a += db6.m110779k();
                }
            }
            if (this.f39888c) {
                if (m79294n) {
                    c8810f.f39892a += db6.m110778l();
                } else {
                    c8810f.f39894c += db6.m110778l();
                }
            }
            c8810f.m79289a(view);
            InterfaceC8809e interfaceC8809e = this.f39889d;
            if (interfaceC8809e != null) {
                return interfaceC8809e.mo2412a(view, db6, c8810f);
            }
            return db6;
        }
    }

    /* renamed from: Vt6$c */
    /* loaded from: classes6.dex */
    public class C8807c implements InterfaceC36332Ue3 {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8809e f39890b;

        /* renamed from: c */
        public final /* synthetic */ C8810f f39891c;

        public C8807c(InterfaceC8809e interfaceC8809e, C8810f c8810f) {
            this.f39890b = interfaceC8809e;
            this.f39891c = c8810f;
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            return this.f39890b.mo2412a(view, db6, new C8810f(this.f39891c));
        }
    }

    /* renamed from: Vt6$d */
    /* loaded from: classes6.dex */
    public class View$OnAttachStateChangeListenerC8808d implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C38790bq6.m62458s0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: Vt6$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC8809e {
        /* renamed from: a */
        DB6 mo2412a(View view, DB6 db6, C8810f c8810f);
    }

    private C36704Vt6() {
    }

    /* renamed from: a */
    public static Rect m79307a(View view) {
        return m79306b(view, 0);
    }

    /* renamed from: b */
    public static Rect m79306b(View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    /* renamed from: c */
    public static void m79305c(View view, InterfaceC8809e interfaceC8809e) {
        C38790bq6.m62531L0(view, new C8807c(interfaceC8809e, new C8810f(C38790bq6.m62538I(view), view.getPaddingTop(), C38790bq6.m62540H(view), view.getPaddingBottom())));
        m79292p(view);
    }

    /* renamed from: d */
    public static void m79304d(View view, AttributeSet attributeSet, int i, int i2, InterfaceC8809e interfaceC8809e) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C37098Xl4.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C37098Xl4.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C37098Xl4.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(C37098Xl4.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m79305c(view, new C8806b(z, z2, z3, interfaceC8809e));
    }

    /* renamed from: e */
    public static float m79303e(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: f */
    public static Integer m79302f(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    /* renamed from: g */
    public static ViewGroup m79301g(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: h */
    public static InterfaceC52464ys6 m79300h(View view) {
        return m79298j(m79301g(view));
    }

    /* renamed from: i */
    public static InputMethodManager m79299i(View view) {
        return (InputMethodManager) NA0.m94294j(view.getContext(), InputMethodManager.class);
    }

    /* renamed from: j */
    public static InterfaceC52464ys6 m79298j(View view) {
        if (view == null) {
            return null;
        }
        return new C51278ws6(view);
    }

    /* renamed from: k */
    public static float m79297k(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C38790bq6.m62447y((View) parent);
        }
        return f;
    }

    /* renamed from: l */
    public static void m79296l(View view) {
        m79295m(view, true);
    }

    /* renamed from: m */
    public static void m79295m(View view, boolean z) {
        C41989hC6 m62522Q;
        if (z && (m62522Q = C38790bq6.m62522Q(view)) != null) {
            m62522Q.m36624a(DB6.C1428m.m110720c());
            return;
        }
        InputMethodManager m79299i = m79299i(view);
        if (m79299i != null) {
            m79299i.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: n */
    public static boolean m79294n(View view) {
        return C38790bq6.m62548D(view) == 1;
    }

    /* renamed from: o */
    public static PorterDuff.Mode m79293o(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: p */
    public static void m79292p(View view) {
        if (C38790bq6.m62506Y(view)) {
            C38790bq6.m62458s0(view);
        } else {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC8808d());
        }
    }

    /* renamed from: q */
    public static void m79291q(View view) {
        view.requestFocus();
        view.post(new RunnableC8805a(view));
    }

    /* renamed from: r */
    public static void m79290r(View view, boolean z) {
        C41989hC6 m62522Q;
        if (z && (m62522Q = C38790bq6.m62522Q(view)) != null) {
            m62522Q.m36620e(DB6.C1428m.m110720c());
        } else {
            m79299i(view).showSoftInput(view, 1);
        }
    }

    /* renamed from: Vt6$f */
    /* loaded from: classes6.dex */
    public static class C8810f {

        /* renamed from: a */
        public int f39892a;

        /* renamed from: b */
        public int f39893b;

        /* renamed from: c */
        public int f39894c;

        /* renamed from: d */
        public int f39895d;

        public C8810f(int i, int i2, int i3, int i4) {
            this.f39892a = i;
            this.f39893b = i2;
            this.f39894c = i3;
            this.f39895d = i4;
        }

        /* renamed from: a */
        public void m79289a(View view) {
            C38790bq6.m62529M0(view, this.f39892a, this.f39893b, this.f39894c, this.f39895d);
        }

        public C8810f(C8810f c8810f) {
            this.f39892a = c8810f.f39892a;
            this.f39893b = c8810f.f39893b;
            this.f39894c = c8810f.f39894c;
            this.f39895d = c8810f.f39895d;
        }
    }
}
