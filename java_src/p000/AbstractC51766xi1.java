package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import p000.C37419Yv1;
/* renamed from: xi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51766xi1 extends C5148M1 {

    /* renamed from: k */
    public static final Rect f117992k = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: l */
    public static final C37419Yv1.InterfaceC10077a<C27125p2> f117993l = new C30270a();

    /* renamed from: m */
    public static final C37419Yv1.InterfaceC10078b<LN5<C27125p2>, C27125p2> f117994m = new C30271b();

    /* renamed from: e */
    public final AccessibilityManager f117999e;

    /* renamed from: f */
    public final View f118000f;

    /* renamed from: g */
    public C30272c f118001g;

    /* renamed from: a */
    public final Rect f117995a = new Rect();

    /* renamed from: b */
    public final Rect f117996b = new Rect();

    /* renamed from: c */
    public final Rect f117997c = new Rect();

    /* renamed from: d */
    public final int[] f117998d = new int[2];

    /* renamed from: h */
    public int f118002h = Integer.MIN_VALUE;

    /* renamed from: i */
    public int f118003i = Integer.MIN_VALUE;

    /* renamed from: j */
    public int f118004j = Integer.MIN_VALUE;

    /* renamed from: xi1$a */
    /* loaded from: classes.dex */
    public class C30270a implements C37419Yv1.InterfaceC10077a<C27125p2> {
        @Override // p000.C37419Yv1.InterfaceC10077a
        /* renamed from: b */
        public void mo4821a(C27125p2 c27125p2, Rect rect) {
            c27125p2.m20067m(rect);
        }
    }

    /* renamed from: xi1$b */
    /* loaded from: classes.dex */
    public class C30271b implements C37419Yv1.InterfaceC10078b<LN5<C27125p2>, C27125p2> {
        @Override // p000.C37419Yv1.InterfaceC10078b
        /* renamed from: c */
        public C27125p2 mo4819a(LN5<C27125p2> ln5, int i) {
            return ln5.m96975t(i);
        }

        @Override // p000.C37419Yv1.InterfaceC10078b
        /* renamed from: d */
        public int mo4818b(LN5<C27125p2> ln5) {
            return ln5.size();
        }
    }

    /* renamed from: xi1$c */
    /* loaded from: classes.dex */
    public class C30272c extends C28154s2 {
        public C30272c() {
        }

        @Override // p000.C28154s2
        /* renamed from: b */
        public C27125p2 mo4815b(int i) {
            return C27125p2.m20103S(AbstractC51766xi1.this.m4825w(i));
        }

        @Override // p000.C28154s2
        /* renamed from: d */
        public C27125p2 mo4814d(int i) {
            int i2;
            if (i == 2) {
                i2 = AbstractC51766xi1.this.f118002h;
            } else {
                i2 = AbstractC51766xi1.this.f118003i;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo4815b(i2);
        }

        @Override // p000.C28154s2
        /* renamed from: f */
        public boolean mo4813f(int i, int i2, Bundle bundle) {
            return AbstractC51766xi1.this.m4854E(i, i2, bundle);
        }
    }

    public AbstractC51766xi1(View view) {
        if (view != null) {
            this.f118000f = view;
            this.f117999e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C38790bq6.m62552B(view) == 0) {
                C38790bq6.m62539H0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: q */
    public static Rect m4831q(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    /* renamed from: u */
    public static int m4827u(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    /* renamed from: A */
    public void m4858A(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: B */
    public void mo4857B(C27125p2 c27125p2) {
    }

    /* renamed from: C */
    public abstract void mo4856C(int i, C27125p2 c27125p2);

    /* renamed from: D */
    public void mo4855D(int i, boolean z) {
    }

    /* renamed from: E */
    public boolean m4854E(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m4853F(i, i2, bundle);
        }
        return m4852G(i2, bundle);
    }

    /* renamed from: F */
    public final boolean m4853F(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return mo4823y(i, i2, bundle);
                    }
                    return m4847a(i);
                }
                return m4851H(i);
            }
            return m4846b(i);
        }
        return m4850I(i);
    }

    /* renamed from: G */
    public final boolean m4852G(int i, Bundle bundle) {
        return C38790bq6.m62474k0(this.f118000f, i, bundle);
    }

    /* renamed from: H */
    public final boolean m4851H(int i) {
        int i2;
        if (!this.f117999e.isEnabled() || !this.f117999e.isTouchExplorationEnabled() || (i2 = this.f118002h) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m4847a(i2);
        }
        this.f118002h = i;
        this.f118000f.invalidate();
        m4849J(i, DateUtils.FORMAT_ABBREV_WEEKDAY);
        return true;
    }

    /* renamed from: I */
    public final boolean m4850I(int i) {
        int i2;
        if ((!this.f118000f.isFocused() && !this.f118000f.requestFocus()) || (i2 = this.f118003i) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m4846b(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f118003i = i;
        mo4855D(i, true);
        m4849J(i, 8);
        return true;
    }

    /* renamed from: J */
    public final boolean m4849J(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f117999e.isEnabled() || (parent = this.f118000f.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f118000f, m4844d(i, i2));
    }

    /* renamed from: K */
    public final void m4848K(int i) {
        int i2 = this.f118004j;
        if (i2 == i) {
            return;
        }
        this.f118004j = i;
        m4849J(i, 128);
        m4849J(i2, 256);
    }

    /* renamed from: a */
    public final boolean m4847a(int i) {
        if (this.f118002h == i) {
            this.f118002h = Integer.MIN_VALUE;
            this.f118000f.invalidate();
            m4849J(i, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m4846b(int i) {
        if (this.f118003i != i) {
            return false;
        }
        this.f118003i = Integer.MIN_VALUE;
        mo4855D(i, false);
        m4849J(i, 8);
        return true;
    }

    /* renamed from: c */
    public final boolean m4845c() {
        int i = this.f118003i;
        return i != Integer.MIN_VALUE && mo4823y(i, 16, null);
    }

    /* renamed from: d */
    public final AccessibilityEvent m4844d(int i, int i2) {
        if (i != -1) {
            return m4843e(i, i2);
        }
        return m4842f(i2);
    }

    /* renamed from: e */
    public final AccessibilityEvent m4843e(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C27125p2 m4825w = m4825w(i);
        obtain.getText().add(m4825w.m20041z());
        obtain.setContentDescription(m4825w.m20057r());
        obtain.setScrollable(m4825w.m20113N());
        obtain.setPassword(m4825w.m20115M());
        obtain.setEnabled(m4825w.m20123I());
        obtain.setChecked(m4825w.m20127G());
        m4858A(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m4825w.m20061p());
        C28509t2.m13208c(obtain, this.f118000f, i);
        obtain.setPackageName(this.f118000f.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: f */
    public final AccessibilityEvent m4842f(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f118000f.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: g */
    public final C27125p2 m4841g(int i) {
        boolean z;
        C27125p2 m20105R = C27125p2.m20105R();
        m20105R.m20064n0(true);
        m20105R.m20060p0(true);
        m20105R.m20080f0("android.view.View");
        Rect rect = f117992k;
        m20105R.m20090a0(rect);
        m20105R.m20088b0(rect);
        m20105R.m20136B0(this.f118000f);
        mo4856C(i, m20105R);
        if (m20105R.m20041z() == null && m20105R.m20057r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m20105R.m20067m(this.f117996b);
        if (!this.f117996b.equals(rect)) {
            int m20071k = m20105R.m20071k();
            if ((m20071k & 64) == 0) {
                if ((m20071k & 128) == 0) {
                    m20105R.m20040z0(this.f118000f.getContext().getPackageName());
                    m20105R.m20116L0(this.f118000f, i);
                    if (this.f118002h == i) {
                        m20105R.m20093Y(true);
                        m20105R.m20091a(128);
                    } else {
                        m20105R.m20093Y(false);
                        m20105R.m20091a(64);
                    }
                    if (this.f118003i == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m20105R.m20091a(2);
                    } else if (m20105R.m20121J()) {
                        m20105R.m20091a(1);
                    }
                    m20105R.m20058q0(z);
                    this.f118000f.getLocationOnScreen(this.f117998d);
                    m20105R.m20065n(this.f117995a);
                    if (this.f117995a.equals(rect)) {
                        m20105R.m20067m(this.f117995a);
                        if (m20105R.f102970b != -1) {
                            C27125p2 m20105R2 = C27125p2.m20105R();
                            for (int i2 = m20105R.f102970b; i2 != -1; i2 = m20105R2.f102970b) {
                                m20105R2.m20134C0(this.f118000f, -1);
                                m20105R2.m20090a0(f117992k);
                                mo4856C(i2, m20105R2);
                                m20105R2.m20067m(this.f117996b);
                                Rect rect2 = this.f117995a;
                                Rect rect3 = this.f117996b;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            m20105R2.m20097V();
                        }
                        this.f117995a.offset(this.f117998d[0] - this.f118000f.getScrollX(), this.f117998d[1] - this.f118000f.getScrollY());
                    }
                    if (this.f118000f.getLocalVisibleRect(this.f117997c)) {
                        this.f117997c.offset(this.f117998d[0] - this.f118000f.getScrollX(), this.f117998d[1] - this.f118000f.getScrollY());
                        if (this.f117995a.intersect(this.f117997c)) {
                            m20105R.m20088b0(this.f117995a);
                            if (m4828t(this.f117995a)) {
                                m20105R.m20100T0(true);
                            }
                        }
                    }
                    return m20105R;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    @Override // p000.C5148M1
    public C28154s2 getAccessibilityNodeProvider(View view) {
        if (this.f118001g == null) {
            this.f118001g = new C30272c();
        }
        return this.f118001g;
    }

    /* renamed from: h */
    public final C27125p2 m4840h() {
        C27125p2 m20101T = C27125p2.m20101T(this.f118000f);
        C38790bq6.m62478i0(this.f118000f, m20101T);
        ArrayList arrayList = new ArrayList();
        mo4832p(arrayList);
        if (m20101T.m20063o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m20101T.m20085d(this.f118000f, ((Integer) arrayList.get(i)).intValue());
        }
        return m20101T;
    }

    /* renamed from: i */
    public final boolean m4839i(MotionEvent motionEvent) {
        if (!this.f117999e.isEnabled() || !this.f117999e.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.f118004j == Integer.MIN_VALUE) {
                return false;
            }
            m4848K(Integer.MIN_VALUE);
            return true;
        }
        int mo4833o = mo4833o(motionEvent.getX(), motionEvent.getY());
        m4848K(mo4833o);
        if (mo4833o == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m4838j(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int m4827u = m4827u(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m4826v(m4827u, null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m4845c();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m4826v(2, null);
        } else {
            if (!keyEvent.hasModifiers(1)) {
                return false;
            }
            return m4826v(1, null);
        }
    }

    /* renamed from: k */
    public final int m4837k() {
        return this.f118002h;
    }

    /* renamed from: l */
    public final LN5<C27125p2> m4836l() {
        ArrayList arrayList = new ArrayList();
        mo4832p(arrayList);
        LN5<C27125p2> ln5 = new LN5<>();
        for (int i = 0; i < arrayList.size(); i++) {
            ln5.m96978p(arrayList.get(i).intValue(), m4841g(arrayList.get(i).intValue()));
        }
        return ln5;
    }

    /* renamed from: m */
    public final void m4835m(int i, Rect rect) {
        m4825w(i).m20067m(rect);
    }

    /* renamed from: n */
    public final int m4834n() {
        return this.f118003i;
    }

    /* renamed from: o */
    public abstract int mo4833o(float f, float f2);

    @Override // p000.C5148M1
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        m4822z(accessibilityEvent);
    }

    @Override // p000.C5148M1
    public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
        super.onInitializeAccessibilityNodeInfo(view, c27125p2);
        mo4857B(c27125p2);
    }

    /* renamed from: p */
    public abstract void mo4832p(List<Integer> list);

    /* renamed from: r */
    public final void m4830r(int i) {
        m4829s(i, 0);
    }

    /* renamed from: s */
    public final void m4829s(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f117999e.isEnabled() && (parent = this.f118000f.getParent()) != null) {
            AccessibilityEvent m4844d = m4844d(i, 2048);
            C5459N1.m94457b(m4844d, i2);
            parent.requestSendAccessibilityEvent(this.f118000f, m4844d);
        }
    }

    /* renamed from: t */
    public final boolean m4828t(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f118000f.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f118000f.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m4826v(int i, Rect rect) {
        C27125p2 m96983k;
        boolean z;
        C27125p2 c27125p2;
        LN5<C27125p2> m4836l = m4836l();
        int i2 = this.f118003i;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            m96983k = null;
        } else {
            m96983k = m4836l.m96983k(i2);
        }
        C27125p2 c27125p22 = m96983k;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.f118003i;
            if (i4 != Integer.MIN_VALUE) {
                m4835m(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m4831q(this.f118000f, i, rect2);
            }
            c27125p2 = (C27125p2) C37419Yv1.m74006c(m4836l, f117994m, f117993l, c27125p22, rect2, i);
        } else {
            if (C38790bq6.m62548D(this.f118000f) == 1) {
                z = true;
            } else {
                z = false;
            }
            c27125p2 = (C27125p2) C37419Yv1.m74005d(m4836l, f117994m, f117993l, c27125p22, i, z, false);
        }
        if (c27125p2 != null) {
            i3 = m4836l.m96979o(m4836l.m96980n(c27125p2));
        }
        return m4850I(i3);
    }

    /* renamed from: w */
    public C27125p2 m4825w(int i) {
        if (i == -1) {
            return m4840h();
        }
        return m4841g(i);
    }

    /* renamed from: x */
    public final void m4824x(boolean z, int i, Rect rect) {
        int i2 = this.f118003i;
        if (i2 != Integer.MIN_VALUE) {
            m4846b(i2);
        }
        if (z) {
            m4826v(i, rect);
        }
    }

    /* renamed from: y */
    public abstract boolean mo4823y(int i, int i2, Bundle bundle);

    /* renamed from: z */
    public void m4822z(AccessibilityEvent accessibilityEvent) {
    }
}
