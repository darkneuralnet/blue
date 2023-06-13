package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C27125p2;
import p000.C38790bq6;
import p000.C47317qB6;
import p000.C5148M1;
import p000.DB6;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: bq6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38790bq6 {

    /* renamed from: c */
    public static Field f59605c;

    /* renamed from: a */
    public static final AtomicInteger f59603a = new AtomicInteger(1);

    /* renamed from: b */
    public static WeakHashMap<View, C34823Ns6> f59604b = null;

    /* renamed from: d */
    public static boolean f59606d = false;

    /* renamed from: e */
    public static final int[] f59607e = {C34020Kh4.accessibility_custom_action_0, C34020Kh4.accessibility_custom_action_1, C34020Kh4.accessibility_custom_action_2, C34020Kh4.accessibility_custom_action_3, C34020Kh4.accessibility_custom_action_4, C34020Kh4.accessibility_custom_action_5, C34020Kh4.accessibility_custom_action_6, C34020Kh4.accessibility_custom_action_7, C34020Kh4.accessibility_custom_action_8, C34020Kh4.accessibility_custom_action_9, C34020Kh4.accessibility_custom_action_10, C34020Kh4.accessibility_custom_action_11, C34020Kh4.accessibility_custom_action_12, C34020Kh4.accessibility_custom_action_13, C34020Kh4.accessibility_custom_action_14, C34020Kh4.accessibility_custom_action_15, C34020Kh4.accessibility_custom_action_16, C34020Kh4.accessibility_custom_action_17, C34020Kh4.accessibility_custom_action_18, C34020Kh4.accessibility_custom_action_19, C34020Kh4.accessibility_custom_action_20, C34020Kh4.accessibility_custom_action_21, C34020Kh4.accessibility_custom_action_22, C34020Kh4.accessibility_custom_action_23, C34020Kh4.accessibility_custom_action_24, C34020Kh4.accessibility_custom_action_25, C34020Kh4.accessibility_custom_action_26, C34020Kh4.accessibility_custom_action_27, C34020Kh4.accessibility_custom_action_28, C34020Kh4.accessibility_custom_action_29, C34020Kh4.accessibility_custom_action_30, C34020Kh4.accessibility_custom_action_31};

    /* renamed from: f */
    public static final InterfaceC41086fh3 f59608f = new InterfaceC41086fh3() { // from class: aq6
        @Override // p000.InterfaceC41086fh3
        public final C44930mA0 onReceiveContent(C44930mA0 c44930mA0) {
            C44930mA0 m62492d0;
            m62492d0 = C38790bq6.m62492d0(c44930mA0);
            return m62492d0;
        }
    };

    /* renamed from: g */
    public static final ViewTreeObserver$OnGlobalLayoutListenerC13294e f59609g = new ViewTreeObserver$OnGlobalLayoutListenerC13294e();

    /* renamed from: bq6$a */
    /* loaded from: classes.dex */
    public class C13290a extends AbstractC13295f<Boolean> {
        public C13290a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: i */
        public Boolean mo62423d(View view) {
            return Boolean.valueOf(C13307q.m62320d(view));
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: j */
        public void mo62422e(View view, Boolean bool) {
            C13307q.m62315i(view, bool.booleanValue());
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: k */
        public boolean mo62419h(Boolean bool, Boolean bool2) {
            return !m62426a(bool, bool2);
        }
    }

    /* renamed from: bq6$b */
    /* loaded from: classes.dex */
    public class C13291b extends AbstractC13295f<CharSequence> {
        public C13291b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: i */
        public CharSequence mo62423d(View view) {
            return C13307q.m62322b(view);
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: j */
        public void mo62422e(View view, CharSequence charSequence) {
            C13307q.m62316h(view, charSequence);
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: k */
        public boolean mo62419h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: bq6$c */
    /* loaded from: classes.dex */
    public class C13292c extends AbstractC13295f<CharSequence> {
        public C13292c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: i */
        public CharSequence mo62423d(View view) {
            return C13309s.m62310a(view);
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: j */
        public void mo62422e(View view, CharSequence charSequence) {
            C13309s.m62308c(view, charSequence);
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: k */
        public boolean mo62419h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: bq6$d */
    /* loaded from: classes.dex */
    public class C13293d extends AbstractC13295f<Boolean> {
        public C13293d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: i */
        public Boolean mo62423d(View view) {
            return Boolean.valueOf(C13307q.m62321c(view));
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: j */
        public void mo62422e(View view, Boolean bool) {
            C13307q.m62317g(view, bool.booleanValue());
        }

        @Override // p000.C38790bq6.AbstractC13295f
        /* renamed from: k */
        public boolean mo62419h(Boolean bool, Boolean bool2) {
            return !m62426a(bool, bool2);
        }
    }

    /* renamed from: bq6$e */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC13294e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final WeakHashMap<View, Boolean> f59610b = new WeakHashMap<>();

        /* renamed from: a */
        public void m62431a(View view) {
            boolean z;
            WeakHashMap<View, Boolean> weakHashMap = this.f59610b;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (C13300k.m62383b(view)) {
                m62429c(view);
            }
        }

        /* renamed from: b */
        public final void m62430b(View view, boolean z) {
            boolean z2;
            int i;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (z2) {
                    i = 16;
                } else {
                    i = 32;
                }
                C38790bq6.m62489e0(view, i);
                this.f59610b.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        public final void m62429c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: d */
        public void m62428d(View view) {
            this.f59610b.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m62427e(view);
        }

        /* renamed from: e */
        public final void m62427e(View view) {
            C13297h.m62403o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f59610b.entrySet()) {
                    m62430b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m62429c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: bq6$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC13295f<T> {

        /* renamed from: a */
        public final int f59611a;

        /* renamed from: b */
        public final Class<T> f59612b;

        /* renamed from: c */
        public final int f59613c;

        /* renamed from: d */
        public final int f59614d;

        public AbstractC13295f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        public boolean m62426a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m62425b() {
            return true;
        }

        /* renamed from: c */
        public final boolean m62424c() {
            return Build.VERSION.SDK_INT >= this.f59613c;
        }

        /* renamed from: d */
        public abstract T mo62423d(View view);

        /* renamed from: e */
        public abstract void mo62422e(View view, T t);

        /* renamed from: f */
        public T m62421f(View view) {
            if (m62424c()) {
                return mo62423d(view);
            }
            if (m62425b()) {
                T t = (T) view.getTag(this.f59611a);
                if (this.f59612b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        /* renamed from: g */
        public void m62420g(View view, T t) {
            if (m62424c()) {
                mo62422e(view, t);
            } else if (m62425b() && mo62419h(m62421f(view), t)) {
                C38790bq6.m62475k(view);
                view.setTag(this.f59611a, t);
                C38790bq6.m62489e0(view, this.f59614d);
            }
        }

        /* renamed from: h */
        public abstract boolean mo62419h(T t, T t2);

        public AbstractC13295f(int i, Class<T> cls, int i2, int i3) {
            this.f59611a = i;
            this.f59612b = cls;
            this.f59614d = i2;
            this.f59613c = i3;
        }
    }

    /* renamed from: bq6$g */
    /* loaded from: classes.dex */
    public static class C13296g {
        private C13296g() {
        }

        /* renamed from: a */
        public static boolean m62418a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: bq6$h */
    /* loaded from: classes.dex */
    public static class C13297h {
        private C13297h() {
        }

        /* renamed from: a */
        public static AccessibilityNodeProvider m62417a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        public static boolean m62416b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        public static int m62415c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        public static int m62414d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        public static int m62413e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public static ViewParent m62412f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        public static int m62411g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        public static boolean m62410h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        public static boolean m62409i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        public static boolean m62408j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        public static void m62407k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        public static void m62406l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        public static void m62405m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        public static void m62404n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        public static void m62403o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        public static void m62402p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        public static void m62401q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        public static void m62400r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        public static void m62399s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: bq6$i */
    /* loaded from: classes.dex */
    public static class C13298i {
        private C13298i() {
        }

        /* renamed from: a */
        public static int m62398a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        public static Display m62397b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        public static int m62396c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        public static int m62395d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        public static int m62394e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        public static int m62393f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        public static boolean m62392g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        public static void m62391h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        public static void m62390i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public static void m62389j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        public static void m62388k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: bq6$j */
    /* loaded from: classes.dex */
    public static class C13299j {
        private C13299j() {
        }

        /* renamed from: a */
        public static Rect m62387a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public static boolean m62386b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        public static void m62385c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: bq6$k */
    /* loaded from: classes.dex */
    public static class C13300k {
        private C13300k() {
        }

        /* renamed from: a */
        public static int m62384a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        public static boolean m62383b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        public static boolean m62382c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        public static boolean m62381d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        public static void m62380e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        public static void m62379f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        public static void m62378g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: bq6$l */
    /* loaded from: classes.dex */
    public static class C13301l {
        private C13301l() {
        }

        /* renamed from: a */
        public static WindowInsets m62377a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m62376b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m62375c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: bq6$m */
    /* loaded from: classes.dex */
    public static class C13302m {

        /* renamed from: bq6$m$a */
        /* loaded from: classes.dex */
        public class View$OnApplyWindowInsetsListenerC13303a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public DB6 f59615a = null;

            /* renamed from: b */
            public final /* synthetic */ View f59616b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC36332Ue3 f59617c;

            public View$OnApplyWindowInsetsListenerC13303a(View view, InterfaceC36332Ue3 interfaceC36332Ue3) {
                this.f59616b = view;
                this.f59617c = interfaceC36332Ue3;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                DB6 m110764z = DB6.m110764z(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C13302m.m62374a(windowInsets, this.f59616b);
                    if (m110764z.equals(this.f59615a)) {
                        return this.f59617c.mo7930a(view, m110764z).m110766x();
                    }
                }
                this.f59615a = m110764z;
                DB6 mo7930a = this.f59617c.mo7930a(view, m110764z);
                if (i >= 30) {
                    return mo7930a.m110766x();
                }
                C38790bq6.m62458s0(view);
                return mo7930a.m110766x();
            }
        }

        private C13302m() {
        }

        /* renamed from: a */
        public static void m62374a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C34020Kh4.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static DB6 m62373b(View view, DB6 db6, Rect rect) {
            WindowInsets m110766x = db6.m110766x();
            if (m110766x != null) {
                return DB6.m110764z(view.computeSystemWindowInsets(m110766x, rect), view);
            }
            rect.setEmpty();
            return db6;
        }

        /* renamed from: c */
        public static boolean m62372c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        public static boolean m62371d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        public static boolean m62370e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m62369f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m62368g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m62367h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m62366i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static DB6 m62365j(View view) {
            return DB6.C1416a.m110763a(view);
        }

        /* renamed from: k */
        public static String m62364k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m62363l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m62362m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m62361n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m62360o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m62359p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m62358q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m62357r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m62356s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        public static void m62355t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        public static void m62354u(View view, InterfaceC36332Ue3 interfaceC36332Ue3) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C34020Kh4.tag_on_apply_window_listener, interfaceC36332Ue3);
            }
            if (interfaceC36332Ue3 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C34020Kh4.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC13303a(view, interfaceC36332Ue3));
            }
        }

        /* renamed from: v */
        public static void m62353v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m62352w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        public static void m62351x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        public static boolean m62350y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        public static void m62349z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: bq6$n */
    /* loaded from: classes.dex */
    public static class C13304n {
        private C13304n() {
        }

        /* renamed from: a */
        public static DB6 m62348a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            DB6 m110765y = DB6.m110765y(rootWindowInsets);
            m110765y.m110768v(m110765y);
            m110765y.m110786d(view.getRootView());
            return m110765y;
        }

        /* renamed from: b */
        public static int m62347b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        public static void m62346c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        public static void m62345d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: bq6$o */
    /* loaded from: classes.dex */
    public static class C13305o {
        private C13305o() {
        }

        /* renamed from: a */
        public static void m62344a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        public static void m62343b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        public static void m62342c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        public static void m62341d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        public static boolean m62340e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        /* renamed from: f */
        public static void m62339f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: bq6$p */
    /* loaded from: classes.dex */
    public static class C13306p {
        private C13306p() {
        }

        /* renamed from: a */
        public static void m62338a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        public static int m62337b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        /* renamed from: c */
        public static int m62336c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        /* renamed from: d */
        public static boolean m62335d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        /* renamed from: e */
        public static boolean m62334e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        /* renamed from: f */
        public static boolean m62333f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        /* renamed from: g */
        public static boolean m62332g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        /* renamed from: h */
        public static View m62331h(View view, View view2, int i) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i);
            return keyboardNavigationClusterSearch;
        }

        /* renamed from: i */
        public static boolean m62330i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        /* renamed from: j */
        public static void m62329j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        public static void m62328k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        public static void m62327l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        public static void m62326m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        public static void m62325n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        public static void m62324o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: bq6$q */
    /* loaded from: classes.dex */
    public static class C13307q {
        private C13307q() {
        }

        /* renamed from: a */
        public static void m62323a(View view, final InterfaceC13312v interfaceC13312v) {
            int i = C34020Kh4.tag_unhandled_key_listeners;
            NA5 na5 = (NA5) view.getTag(i);
            if (na5 == null) {
                na5 = new NA5();
                view.setTag(i, na5);
            }
            Objects.requireNonNull(interfaceC13312v);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: zq6
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C38790bq6.InterfaceC13312v.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            na5.put(interfaceC13312v, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: b */
        public static CharSequence m62322b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        /* renamed from: c */
        public static boolean m62321c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        /* renamed from: d */
        public static boolean m62320d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        /* renamed from: e */
        public static void m62319e(View view, InterfaceC13312v interfaceC13312v) {
            View.OnUnhandledKeyEventListener m7929a;
            NA5 na5 = (NA5) view.getTag(C34020Kh4.tag_unhandled_key_listeners);
            if (na5 != null && (m7929a = C50665vq6.m7929a(na5.get(interfaceC13312v))) != null) {
                view.removeOnUnhandledKeyEventListener(m7929a);
            }
        }

        /* renamed from: f */
        public static <T> T m62318f(View view, int i) {
            View requireViewById;
            requireViewById = view.requireViewById(i);
            return (T) requireViewById;
        }

        /* renamed from: g */
        public static void m62317g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        public static void m62316h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m62315i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: bq6$r */
    /* loaded from: classes.dex */
    public static class C13308r {
        private C13308r() {
        }

        /* renamed from: a */
        public static View.AccessibilityDelegate m62314a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        /* renamed from: b */
        public static List<Rect> m62313b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        /* renamed from: c */
        public static void m62312c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        public static void m62311d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: bq6$s */
    /* loaded from: classes.dex */
    public static class C13309s {
        private C13309s() {
        }

        /* renamed from: a */
        public static CharSequence m62310a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        /* renamed from: b */
        public static C41989hC6 m62309b(View view) {
            WindowInsetsController windowInsetsController;
            windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return C41989hC6.m36619f(windowInsetsController);
            }
            return null;
        }

        /* renamed from: c */
        public static void m62308c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: bq6$t */
    /* loaded from: classes.dex */
    public static final class C13310t {
        private C13310t() {
        }

        /* renamed from: a */
        public static String[] m62307a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        /* renamed from: b */
        public static C44930mA0 m62306b(View view, C44930mA0 c44930mA0) {
            ContentInfo performReceiveContent;
            ContentInfo m26216f = c44930mA0.m26216f();
            performReceiveContent = view.performReceiveContent(m26216f);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == m26216f) {
                return c44930mA0;
            }
            return C44930mA0.m26215g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m62305c(View view, String[] strArr, InterfaceC40493eh3 interfaceC40493eh3) {
            if (interfaceC40493eh3 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC13311u(interfaceC40493eh3));
            }
        }
    }

    /* renamed from: bq6$u */
    /* loaded from: classes.dex */
    public static final class OnReceiveContentListenerC13311u implements OnReceiveContentListener {

        /* renamed from: a */
        public final InterfaceC40493eh3 f59618a;

        public OnReceiveContentListenerC13311u(InterfaceC40493eh3 interfaceC40493eh3) {
            this.f59618a = interfaceC40493eh3;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C44930mA0 m26215g = C44930mA0.m26215g(contentInfo);
            C44930mA0 mo42621a = this.f59618a.mo42621a(view, m26215g);
            if (mo42621a == null) {
                return null;
            }
            if (mo42621a == m26215g) {
                return contentInfo;
            }
            return mo42621a.m26216f();
        }
    }

    /* renamed from: bq6$v */
    /* loaded from: classes.dex */
    public interface InterfaceC13312v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: bq6$w */
    /* loaded from: classes.dex */
    public static class C13313w {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f59619d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f59620a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f59621b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f59622c = null;

        /* renamed from: a */
        public static C13313w m62304a(View view) {
            int i = C34020Kh4.tag_unhandled_key_event_manager;
            C13313w c13313w = (C13313w) view.getTag(i);
            if (c13313w == null) {
                C13313w c13313w2 = new C13313w();
                view.setTag(i, c13313w2);
                return c13313w2;
            }
            return c13313w;
        }

        /* renamed from: b */
        public boolean m62303b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m62298g();
            }
            View m62302c = m62302c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m62302c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m62301d().put(keyCode, new WeakReference<>(m62302c));
                }
            }
            if (m62302c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final View m62302c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f59620a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m62302c = m62302c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m62302c != null) {
                            return m62302c;
                        }
                    }
                }
                if (m62300e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray<WeakReference<View>> m62301d() {
            if (this.f59621b == null) {
                this.f59621b = new SparseArray<>();
            }
            return this.f59621b;
        }

        /* renamed from: e */
        public final boolean m62300e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C34020Kh4.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((InterfaceC13312v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: f */
        public boolean m62299f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f59622c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f59622c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> m62301d = m62301d();
            if (keyEvent.getAction() == 1 && (indexOfKey = m62301d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = m62301d.valueAt(indexOfKey);
                m62301d.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = m62301d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && C38790bq6.m62506Y(view)) {
                m62300e(view, keyEvent);
            }
            return true;
        }

        /* renamed from: g */
        public final void m62298g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f59620a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f59619d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f59620a == null) {
                    this.f59620a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f59619d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f59620a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f59620a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public static boolean m62554A(View view) {
        return C13297h.m62416b(view);
    }

    /* renamed from: A0 */
    public static void m62553A0(View view, Drawable drawable) {
        C13297h.m62401q(view, drawable);
    }

    /* renamed from: B */
    public static int m62552B(View view) {
        return C13297h.m62415c(view);
    }

    /* renamed from: B0 */
    public static void m62551B0(View view, ColorStateList colorStateList) {
        C13302m.m62358q(view, colorStateList);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: C */
    public static int m62550C(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C13306p.m62337b(view);
        }
        return 0;
    }

    /* renamed from: C0 */
    public static void m62549C0(View view, PorterDuff.Mode mode) {
        C13302m.m62357r(view, mode);
    }

    /* renamed from: D */
    public static int m62548D(View view) {
        return C13298i.m62395d(view);
    }

    /* renamed from: D0 */
    public static void m62547D0(View view, Rect rect) {
        C13299j.m62385c(view, rect);
    }

    /* renamed from: E */
    public static int m62546E(View view) {
        return C13297h.m62414d(view);
    }

    /* renamed from: E0 */
    public static void m62545E0(View view, float f) {
        C13302m.m62356s(view, f);
    }

    /* renamed from: F */
    public static int m62544F(View view) {
        return C13297h.m62413e(view);
    }

    @Deprecated
    /* renamed from: F0 */
    public static void m62543F0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: G */
    public static String[] m62542G(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C13310t.m62307a(view);
        }
        return (String[]) view.getTag(C34020Kh4.tag_on_receive_content_mime_types);
    }

    /* renamed from: G0 */
    public static void m62541G0(View view, boolean z) {
        C13297h.m62400r(view, z);
    }

    /* renamed from: H */
    public static int m62540H(View view) {
        return C13298i.m62394e(view);
    }

    /* renamed from: H0 */
    public static void m62539H0(View view, int i) {
        C13297h.m62399s(view, i);
    }

    /* renamed from: I */
    public static int m62538I(View view) {
        return C13298i.m62393f(view);
    }

    /* renamed from: I0 */
    public static void m62537I0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C13306p.m62327l(view, i);
        }
    }

    /* renamed from: J */
    public static ViewParent m62536J(View view) {
        return C13297h.m62412f(view);
    }

    /* renamed from: J0 */
    public static void m62535J0(View view, int i) {
        C13298i.m62391h(view, i);
    }

    /* renamed from: K */
    public static DB6 m62534K(View view) {
        return C13304n.m62348a(view);
    }

    /* renamed from: K0 */
    public static void m62533K0(View view, Paint paint) {
        C13298i.m62390i(view, paint);
    }

    /* renamed from: L */
    public static CharSequence m62532L(View view) {
        return m62485f1().m62421f(view);
    }

    /* renamed from: L0 */
    public static void m62531L0(View view, InterfaceC36332Ue3 interfaceC36332Ue3) {
        C13302m.m62354u(view, interfaceC36332Ue3);
    }

    /* renamed from: M */
    public static String m62530M(View view) {
        return C13302m.m62364k(view);
    }

    /* renamed from: M0 */
    public static void m62529M0(View view, int i, int i2, int i3, int i4) {
        C13298i.m62388k(view, i, i2, i3, i4);
    }

    @Deprecated
    /* renamed from: N */
    public static float m62528N(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    /* renamed from: N0 */
    public static void m62527N0(View view, float f) {
        view.setPivotX(f);
    }

    @Deprecated
    /* renamed from: O */
    public static float m62526O(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    /* renamed from: O0 */
    public static void m62525O0(View view, float f) {
        view.setPivotY(f);
    }

    /* renamed from: P */
    public static float m62524P(View view) {
        return C13302m.m62363l(view);
    }

    /* renamed from: P0 */
    public static void m62523P0(View view, C40396eX3 c40396eX3) {
        Object obj;
        if (c40396eX3 != null) {
            obj = c40396eX3.m42807a();
        } else {
            obj = null;
        }
        C13305o.m62341d(view, (PointerIcon) obj);
    }

    @Deprecated
    /* renamed from: Q */
    public static C41989hC6 m62522Q(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C13309s.m62309b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return C43166jB6.m31027a(window, view);
            }
        }
        return null;
    }

    @Deprecated
    /* renamed from: Q0 */
    public static void m62521Q0(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    /* renamed from: R */
    public static int m62520R(View view) {
        return C13297h.m62411g(view);
    }

    @Deprecated
    /* renamed from: R0 */
    public static void m62519R0(View view, float f) {
        view.setRotationX(f);
    }

    /* renamed from: S */
    public static float m62518S(View view) {
        return C13302m.m62362m(view);
    }

    @Deprecated
    /* renamed from: S0 */
    public static void m62517S0(View view, float f) {
        view.setRotationY(f);
    }

    /* renamed from: T */
    public static boolean m62516T(View view) {
        return m62469n(view) != null;
    }

    @Deprecated
    /* renamed from: T0 */
    public static void m62515T0(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: U */
    public static boolean m62514U(View view) {
        return C13296g.m62418a(view);
    }

    @Deprecated
    /* renamed from: U0 */
    public static void m62513U0(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: V */
    public static boolean m62512V(View view) {
        return C13297h.m62410h(view);
    }

    /* renamed from: V0 */
    public static void m62511V0(View view, boolean z) {
        m62454u0().m62420g(view, Boolean.valueOf(z));
    }

    /* renamed from: W */
    public static boolean m62510W(View view) {
        return C13297h.m62409i(view);
    }

    /* renamed from: W0 */
    public static void m62509W0(View view, int i, int i2) {
        C13304n.m62345d(view, i, i2);
    }

    /* renamed from: X */
    public static boolean m62508X(View view) {
        Boolean m62421f = m62499b().m62421f(view);
        if (m62421f != null && m62421f.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: X0 */
    public static void m62507X0(View view, CharSequence charSequence) {
        m62485f1().m62420g(view, charSequence);
    }

    /* renamed from: Y */
    public static boolean m62506Y(View view) {
        return C13300k.m62383b(view);
    }

    /* renamed from: Y0 */
    public static void m62505Y0(View view, String str) {
        C13302m.m62353v(view, str);
    }

    /* renamed from: Z */
    public static boolean m62504Z(View view) {
        return C13300k.m62382c(view);
    }

    @Deprecated
    /* renamed from: Z0 */
    public static void m62503Z0(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: a0 */
    public static boolean m62501a0(View view) {
        return C13302m.m62359p(view);
    }

    @Deprecated
    /* renamed from: a1 */
    public static void m62500a1(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: b */
    public static AbstractC13295f<Boolean> m62499b() {
        return new C13293d(C34020Kh4.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static boolean m62498b0(View view) {
        return C13298i.m62392g(view);
    }

    /* renamed from: b1 */
    public static void m62497b1(View view, float f) {
        C13302m.m62352w(view, f);
    }

    /* renamed from: c */
    public static int m62496c(View view, CharSequence charSequence, InterfaceC28996u2 interfaceC28996u2) {
        int m62457t = m62457t(view, charSequence);
        if (m62457t != -1) {
            m62493d(view, new C27125p2.C27126a(m62457t, charSequence, interfaceC28996u2));
        }
        return m62457t;
    }

    /* renamed from: c0 */
    public static boolean m62495c0(View view) {
        Boolean m62421f = m62454u0().m62421f(view);
        if (m62421f != null && m62421f.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: c1 */
    public static void m62494c1(View view) {
        if (m62552B(view) == 0) {
            m62539H0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m62552B((View) parent) == 4) {
                m62539H0(view, 2);
                return;
            }
        }
    }

    /* renamed from: d */
    public static void m62493d(View view, C27125p2.C27126a c27126a) {
        m62475k(view);
        m62462q0(c27126a.m20038b(), view);
        m62461r(view).add(c27126a);
        m62489e0(view, 0);
    }

    /* renamed from: d0 */
    public static /* synthetic */ C44930mA0 m62492d0(C44930mA0 c44930mA0) {
        return c44930mA0;
    }

    /* renamed from: d1 */
    public static void m62491d1(View view, C47317qB6.AbstractC27528b abstractC27528b) {
        C47317qB6.m17948c(view, abstractC27528b);
    }

    /* renamed from: e */
    public static C34823Ns6 m62490e(View view) {
        if (f59604b == null) {
            f59604b = new WeakHashMap<>();
        }
        C34823Ns6 c34823Ns6 = f59604b.get(view);
        if (c34823Ns6 == null) {
            C34823Ns6 c34823Ns62 = new C34823Ns6(view);
            f59604b.put(view, c34823Ns62);
            return c34823Ns62;
        }
        return c34823Ns6;
    }

    /* renamed from: e0 */
    public static void m62489e0(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (m62463q(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (m62465p(view) == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                C13300k.m62378g(obtain, i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(m62463q(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    C13300k.m62380e(view.getParent(), view, view, i);
                    return;
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = 2048;
        }
        obtain2.setEventType(i2);
        C13300k.m62378g(obtain2, i);
        if (z) {
            obtain2.getText().add(m62463q(view));
            m62494c1(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    /* renamed from: e1 */
    public static void m62488e1(View view, float f) {
        C13302m.m62351x(view, f);
    }

    /* renamed from: f */
    public static DB6 m62487f(View view, DB6 db6, Rect rect) {
        return C13302m.m62373b(view, db6, rect);
    }

    /* renamed from: f0 */
    public static void m62486f0(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: f1 */
    public static AbstractC13295f<CharSequence> m62485f1() {
        return new C13292c(C34020Kh4.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: g */
    public static DB6 m62484g(View view, DB6 db6) {
        WindowInsets m110766x = db6.m110766x();
        if (m110766x != null) {
            WindowInsets m62377a = C13301l.m62377a(view, m110766x);
            if (!m62377a.equals(m110766x)) {
                return DB6.m110764z(m62377a, view);
            }
        }
        return db6;
    }

    /* renamed from: g0 */
    public static void m62483g0(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: g1 */
    public static void m62482g1(View view) {
        C13302m.m62349z(view);
    }

    /* renamed from: h */
    public static boolean m62481h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C13313w.m62304a(view).m62303b(view, keyEvent);
    }

    /* renamed from: h0 */
    public static DB6 m62480h0(View view, DB6 db6) {
        WindowInsets m110766x = db6.m110766x();
        if (m110766x != null) {
            WindowInsets m62376b = C13301l.m62376b(view, m110766x);
            if (!m62376b.equals(m110766x)) {
                return DB6.m110764z(m62376b, view);
            }
        }
        return db6;
    }

    /* renamed from: i */
    public static boolean m62479i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C13313w.m62304a(view).m62299f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m62478i0(View view, C27125p2 c27125p2) {
        view.onInitializeAccessibilityNodeInfo(c27125p2.m20098U0());
    }

    /* renamed from: j */
    public static void m62477j(View view) {
        m62475k(view);
    }

    /* renamed from: j0 */
    public static AbstractC13295f<CharSequence> m62476j0() {
        return new C13291b(C34020Kh4.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: k */
    public static void m62475k(View view) {
        C5148M1 m62471m = m62471m(view);
        if (m62471m == null) {
            m62471m = new C5148M1();
        }
        m62452v0(view, m62471m);
    }

    /* renamed from: k0 */
    public static boolean m62474k0(View view, int i, Bundle bundle) {
        return C13297h.m62408j(view, i, bundle);
    }

    /* renamed from: l */
    public static int m62473l() {
        return C13298i.m62398a();
    }

    /* renamed from: l0 */
    public static C44930mA0 m62472l0(View view, C44930mA0 c44930mA0) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c44930mA0 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C13310t.m62306b(view, c44930mA0);
        }
        InterfaceC40493eh3 interfaceC40493eh3 = (InterfaceC40493eh3) view.getTag(C34020Kh4.tag_on_receive_content_listener);
        if (interfaceC40493eh3 != null) {
            C44930mA0 mo42621a = interfaceC40493eh3.mo42621a(view, c44930mA0);
            if (mo42621a == null) {
                return null;
            }
            return m62445z(view).onReceiveContent(mo42621a);
        }
        return m62445z(view).onReceiveContent(c44930mA0);
    }

    /* renamed from: m */
    public static C5148M1 m62471m(View view) {
        View.AccessibilityDelegate m62469n = m62469n(view);
        if (m62469n == null) {
            return null;
        }
        if (m62469n instanceof C5148M1.C5149a) {
            return ((C5148M1.C5149a) m62469n).f22440a;
        }
        return new C5148M1(m62469n);
    }

    /* renamed from: m0 */
    public static void m62470m0(View view) {
        C13297h.m62407k(view);
    }

    /* renamed from: n */
    public static View.AccessibilityDelegate m62469n(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C13308r.m62314a(view);
        }
        return m62467o(view);
    }

    /* renamed from: n0 */
    public static void m62468n0(View view, Runnable runnable) {
        C13297h.m62405m(view, runnable);
    }

    /* renamed from: o */
    public static View.AccessibilityDelegate m62467o(View view) {
        if (f59606d) {
            return null;
        }
        if (f59605c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f59605c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f59606d = true;
                return null;
            }
        }
        try {
            Object obj = f59605c.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f59606d = true;
            return null;
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: o0 */
    public static void m62466o0(View view, Runnable runnable, long j) {
        C13297h.m62404n(view, runnable, j);
    }

    /* renamed from: p */
    public static int m62465p(View view) {
        return C13300k.m62384a(view);
    }

    /* renamed from: p0 */
    public static void m62464p0(View view, int i) {
        m62462q0(i, view);
        m62489e0(view, 0);
    }

    /* renamed from: q */
    public static CharSequence m62463q(View view) {
        return m62476j0().m62421f(view);
    }

    /* renamed from: q0 */
    public static void m62462q0(int i, View view) {
        List<C27125p2.C27126a> m62461r = m62461r(view);
        for (int i2 = 0; i2 < m62461r.size(); i2++) {
            if (m62461r.get(i2).m20038b() == i) {
                m62461r.remove(i2);
                return;
            }
        }
    }

    /* renamed from: r */
    public static List<C27125p2.C27126a> m62461r(View view) {
        int i = C34020Kh4.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: r0 */
    public static void m62460r0(View view, C27125p2.C27126a c27126a, CharSequence charSequence, InterfaceC28996u2 interfaceC28996u2) {
        if (interfaceC28996u2 == null && charSequence == null) {
            m62464p0(view, c27126a.m20038b());
        } else {
            m62493d(view, c27126a.m20039a(charSequence, interfaceC28996u2));
        }
    }

    @Deprecated
    /* renamed from: s */
    public static float m62459s(View view) {
        return view.getAlpha();
    }

    /* renamed from: s0 */
    public static void m62458s0(View view) {
        C13301l.m62375c(view);
    }

    /* renamed from: t */
    public static int m62457t(View view, CharSequence charSequence) {
        boolean z;
        List<C27125p2.C27126a> m62461r = m62461r(view);
        for (int i = 0; i < m62461r.size(); i++) {
            if (TextUtils.equals(charSequence, m62461r.get(i).m20037c())) {
                return m62461r.get(i).m20038b();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f59607e;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z2 = true;
            for (int i5 = 0; i5 < m62461r.size(); i5++) {
                if (m62461r.get(i5).m20038b() != i4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: t0 */
    public static void m62456t0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C13308r.m62312c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: u */
    public static ColorStateList m62455u(View view) {
        return C13302m.m62368g(view);
    }

    /* renamed from: u0 */
    public static AbstractC13295f<Boolean> m62454u0() {
        return new C13290a(C34020Kh4.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: v */
    public static PorterDuff.Mode m62453v(View view) {
        return C13302m.m62367h(view);
    }

    /* renamed from: v0 */
    public static void m62452v0(View view, C5148M1 c5148m1) {
        View.AccessibilityDelegate bridge;
        if (c5148m1 == null && (m62469n(view) instanceof C5148M1.C5149a)) {
            c5148m1 = new C5148M1();
        }
        if (c5148m1 == null) {
            bridge = null;
        } else {
            bridge = c5148m1.getBridge();
        }
        view.setAccessibilityDelegate(bridge);
    }

    /* renamed from: w */
    public static Rect m62451w(View view) {
        return C13299j.m62387a(view);
    }

    /* renamed from: w0 */
    public static void m62450w0(View view, boolean z) {
        m62499b().m62420g(view, Boolean.valueOf(z));
    }

    /* renamed from: x */
    public static Display m62449x(View view) {
        return C13298i.m62397b(view);
    }

    /* renamed from: x0 */
    public static void m62448x0(View view, int i) {
        C13300k.m62379f(view, i);
    }

    /* renamed from: y */
    public static float m62447y(View view) {
        return C13302m.m62366i(view);
    }

    /* renamed from: y0 */
    public static void m62446y0(View view, CharSequence charSequence) {
        m62476j0().m62420g(view, charSequence);
        if (charSequence != null) {
            f59609g.m62431a(view);
        } else {
            f59609g.m62428d(view);
        }
    }

    /* renamed from: z */
    public static InterfaceC41086fh3 m62445z(View view) {
        if (view instanceof InterfaceC41086fh3) {
            return (InterfaceC41086fh3) view;
        }
        return f59608f;
    }

    @Deprecated
    /* renamed from: z0 */
    public static void m62444z0(View view, float f) {
        view.setAlpha(f);
    }
}
