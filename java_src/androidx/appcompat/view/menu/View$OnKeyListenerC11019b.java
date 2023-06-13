package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC11019b extends AbstractC49226tQ2 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C */
    public static final int f51815C = C32643Ek4.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public PopupWindow.OnDismissListener f51816A;

    /* renamed from: B */
    public boolean f51817B;

    /* renamed from: c */
    public final Context f51818c;

    /* renamed from: d */
    public final int f51819d;

    /* renamed from: e */
    public final int f51820e;

    /* renamed from: f */
    public final int f51821f;

    /* renamed from: g */
    public final boolean f51822g;

    /* renamed from: h */
    public final Handler f51823h;

    /* renamed from: p */
    public View f51831p;

    /* renamed from: q */
    public View f51832q;

    /* renamed from: s */
    public boolean f51834s;

    /* renamed from: t */
    public boolean f51835t;

    /* renamed from: u */
    public int f51836u;

    /* renamed from: v */
    public int f51837v;

    /* renamed from: x */
    public boolean f51839x;

    /* renamed from: y */
    public InterfaceC11037i.InterfaceC11038a f51840y;

    /* renamed from: z */
    public ViewTreeObserver f51841z;

    /* renamed from: i */
    public final List<C11028e> f51824i = new ArrayList();

    /* renamed from: j */
    public final List<C11024d> f51825j = new ArrayList();

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f51826k = new ViewTreeObserver$OnGlobalLayoutListenerC11020a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f51827l = new View$OnAttachStateChangeListenerC11021b();

    /* renamed from: m */
    public final InterfaceC46262oQ2 f51828m = new C11022c();

    /* renamed from: n */
    public int f51829n = 0;

    /* renamed from: o */
    public int f51830o = 0;

    /* renamed from: w */
    public boolean f51838w = false;

    /* renamed from: r */
    public int f51833r = m70187F();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC11020a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC11020a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC11019b.this.mo1721c() && View$OnKeyListenerC11019b.this.f51825j.size() > 0 && !View$OnKeyListenerC11019b.this.f51825j.get(0).f51849a.m69905B()) {
                View view = View$OnKeyListenerC11019b.this.f51832q;
                if (view != null && view.isShown()) {
                    for (C11024d c11024d : View$OnKeyListenerC11019b.this.f51825j) {
                        c11024d.f51849a.mo1722a();
                    }
                    return;
                }
                View$OnKeyListenerC11019b.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC11021b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC11021b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC11019b.this.f51841z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC11019b.this.f51841z = view.getViewTreeObserver();
                }
                View$OnKeyListenerC11019b view$OnKeyListenerC11019b = View$OnKeyListenerC11019b.this;
                view$OnKeyListenerC11019b.f51841z.removeGlobalOnLayoutListener(view$OnKeyListenerC11019b.f51826k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: classes.dex */
    public class C11022c implements InterfaceC46262oQ2 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: classes.dex */
        public class RunnableC11023a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C11024d f51845b;

            /* renamed from: c */
            public final /* synthetic */ MenuItem f51846c;

            /* renamed from: d */
            public final /* synthetic */ C11028e f51847d;

            public RunnableC11023a(C11024d c11024d, MenuItem menuItem, C11028e c11028e) {
                this.f51845b = c11024d;
                this.f51846c = menuItem;
                this.f51847d = c11028e;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11024d c11024d = this.f51845b;
                if (c11024d != null) {
                    View$OnKeyListenerC11019b.this.f51817B = true;
                    c11024d.f51850b.m70144e(false);
                    View$OnKeyListenerC11019b.this.f51817B = false;
                }
                if (this.f51846c.isEnabled() && this.f51846c.hasSubMenu()) {
                    this.f51847d.m70164N(this.f51846c, 4);
                }
            }
        }

        public C11022c() {
        }

        @Override // p000.InterfaceC46262oQ2
        /* renamed from: d */
        public void mo21093d(C11028e c11028e, MenuItem menuItem) {
            C11024d c11024d = null;
            View$OnKeyListenerC11019b.this.f51823h.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC11019b.this.f51825j.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (c11028e == View$OnKeyListenerC11019b.this.f51825j.get(i).f51850b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < View$OnKeyListenerC11019b.this.f51825j.size()) {
                c11024d = View$OnKeyListenerC11019b.this.f51825j.get(i2);
            }
            View$OnKeyListenerC11019b.this.f51823h.postAtTime(new RunnableC11023a(c11024d, menuItem, c11028e), c11028e, SystemClock.uptimeMillis() + 200);
        }

        @Override // p000.InterfaceC46262oQ2
        /* renamed from: j */
        public void mo21092j(C11028e c11028e, MenuItem menuItem) {
            View$OnKeyListenerC11019b.this.f51823h.removeCallbacksAndMessages(c11028e);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: classes.dex */
    public static class C11024d {

        /* renamed from: a */
        public final MenuPopupWindow f51849a;

        /* renamed from: b */
        public final C11028e f51850b;

        /* renamed from: c */
        public final int f51851c;

        public C11024d(MenuPopupWindow menuPopupWindow, C11028e c11028e, int i) {
            this.f51849a = menuPopupWindow;
            this.f51850b = c11028e;
            this.f51851c = i;
        }

        /* renamed from: a */
        public ListView m70184a() {
            return this.f51849a.mo1720k();
        }
    }

    public View$OnKeyListenerC11019b(Context context, View view, int i, int i2, boolean z) {
        this.f51818c = context;
        this.f51831p = view;
        this.f51820e = i;
        this.f51821f = i2;
        this.f51822g = z;
        Resources resources = context.getResources();
        this.f51819d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C39281cg4.abc_config_prefDialogWidth));
        this.f51823h = new Handler();
    }

    /* renamed from: B */
    public final MenuPopupWindow m70191B() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f51818c, null, this.f51820e, this.f51821f);
        menuPopupWindow.m69867U(this.f51828m);
        menuPopupWindow.m69895L(this);
        menuPopupWindow.m69896K(this);
        menuPopupWindow.m69903D(this.f51831p);
        menuPopupWindow.m69900G(this.f51830o);
        menuPopupWindow.m69897J(true);
        menuPopupWindow.m69898I(2);
        return menuPopupWindow;
    }

    /* renamed from: C */
    public final int m70190C(C11028e c11028e) {
        int size = this.f51825j.size();
        for (int i = 0; i < size; i++) {
            if (c11028e == this.f51825j.get(i).f51850b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public final MenuItem m70189D(C11028e c11028e, C11028e c11028e2) {
        int size = c11028e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c11028e.getItem(i);
            if (item.hasSubMenu() && c11028e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: E */
    public final View m70188E(C11024d c11024d, C11028e c11028e) {
        C11027d c11027d;
        int i;
        int firstVisiblePosition;
        MenuItem m70189D = m70189D(c11024d.f51850b, c11028e);
        if (m70189D == null) {
            return null;
        }
        ListView m70184a = c11024d.m70184a();
        ListAdapter adapter = m70184a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c11027d = (C11027d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c11027d = (C11027d) adapter;
            i = 0;
        }
        int count = c11027d.getCount();
        while (true) {
            if (i2 < count) {
                if (m70189D == c11027d.getItem(i2)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - m70184a.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= m70184a.getChildCount()) {
            return null;
        }
        return m70184a.getChildAt(firstVisiblePosition);
    }

    /* renamed from: F */
    public final int m70187F() {
        return C38790bq6.m62548D(this.f51831p) == 1 ? 0 : 1;
    }

    /* renamed from: G */
    public final int m70186G(int i) {
        List<C11024d> list = this.f51825j;
        ListView m70184a = list.get(list.size() - 1).m70184a();
        int[] iArr = new int[2];
        m70184a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f51832q.getWindowVisibleDisplayFrame(rect);
        if (this.f51833r == 1) {
            if (iArr[0] + m70184a.getWidth() + i <= rect.right) {
                return 1;
            }
            return 0;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: H */
    public final void m70185H(C11028e c11028e) {
        C11024d c11024d;
        View view;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f51818c);
        C11027d c11027d = new C11027d(c11028e, from, this.f51822g, f51815C);
        if (!mo1721c() && this.f51838w) {
            c11027d.m70174d(true);
        } else if (mo1721c()) {
            c11027d.m70174d(AbstractC49226tQ2.m12384z(c11028e));
        }
        int m12393q = AbstractC49226tQ2.m12393q(c11027d, null, this.f51818c, this.f51819d);
        MenuPopupWindow m70191B = m70191B();
        m70191B.mo69882p(c11027d);
        m70191B.m69901F(m12393q);
        m70191B.m69900G(this.f51830o);
        if (this.f51825j.size() > 0) {
            List<C11024d> list = this.f51825j;
            c11024d = list.get(list.size() - 1);
            view = m70188E(c11024d, c11028e);
        } else {
            c11024d = null;
            view = null;
        }
        if (view != null) {
            m70191B.m69866V(false);
            m70191B.m69869S(null);
            int m70186G = m70186G(m12393q);
            if (m70186G == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f51833r = m70186G;
            if (Build.VERSION.SDK_INT >= 26) {
                m70191B.m69903D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f51831p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f51830o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f51831p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f51830o & 5) == 5) {
                if (!z) {
                    m12393q = view.getWidth();
                    i3 = i - m12393q;
                }
                i3 = i + m12393q;
            } else {
                if (z) {
                    m12393q = view.getWidth();
                    i3 = i + m12393q;
                }
                i3 = i - m12393q;
            }
            m70191B.m69883m(i3);
            m70191B.m69893N(true);
            m70191B.m69886f(i2);
        } else {
            if (this.f51834s) {
                m70191B.m69883m(this.f51836u);
            }
            if (this.f51835t) {
                m70191B.m69886f(this.f51837v);
            }
            m70191B.m69899H(m12394p());
        }
        this.f51825j.add(new C11024d(m70191B, c11028e, this.f51833r));
        m70191B.mo1722a();
        ListView mo1720k = m70191B.mo1720k();
        mo1720k.setOnKeyListener(this);
        if (c11024d == null && this.f51839x && c11028e.m70123z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C32643Ek4.abc_popup_menu_header_item_layout, (ViewGroup) mo1720k, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c11028e.m70123z());
            mo1720k.addHeaderView(frameLayout, null, false);
            m70191B.mo1722a();
        }
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: a */
    public void mo1722a() {
        boolean z;
        if (mo1721c()) {
            return;
        }
        for (C11028e c11028e : this.f51824i) {
            m70185H(c11028e);
        }
        this.f51824i.clear();
        View view = this.f51831p;
        this.f51832q = view;
        if (view != null) {
            if (this.f51841z == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f51841z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f51826k);
            }
            this.f51832q.addOnAttachStateChangeListener(this.f51827l);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: b */
    public void mo49325b(C11028e c11028e, boolean z) {
        int m70190C = m70190C(c11028e);
        if (m70190C < 0) {
            return;
        }
        int i = m70190C + 1;
        if (i < this.f51825j.size()) {
            this.f51825j.get(i).f51850b.m70144e(false);
        }
        C11024d remove = this.f51825j.remove(m70190C);
        remove.f51850b.m70161Q(this);
        if (this.f51817B) {
            remove.f51849a.m69868T(null);
            remove.f51849a.m69902E(0);
        }
        remove.f51849a.dismiss();
        int size = this.f51825j.size();
        if (size > 0) {
            this.f51833r = this.f51825j.get(size - 1).f51851c;
        } else {
            this.f51833r = m70187F();
        }
        if (size == 0) {
            dismiss();
            InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51840y;
            if (interfaceC11038a != null) {
                interfaceC11038a.mo69982b(c11028e, true);
            }
            ViewTreeObserver viewTreeObserver = this.f51841z;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f51841z.removeGlobalOnLayoutListener(this.f51826k);
                }
                this.f51841z = null;
            }
            this.f51832q.removeOnAttachStateChangeListener(this.f51827l);
            this.f51816A.onDismiss();
        } else if (z) {
            this.f51825j.get(0).f51850b.m70144e(false);
        }
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: c */
    public boolean mo1721c() {
        return this.f51825j.size() > 0 && this.f51825j.get(0).f51849a.mo1721c();
    }

    @Override // p000.InterfaceC52642zA5
    public void dismiss() {
        int size = this.f51825j.size();
        if (size > 0) {
            C11024d[] c11024dArr = (C11024d[]) this.f51825j.toArray(new C11024d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C11024d c11024d = c11024dArr[i];
                if (c11024d.f51849a.mo1721c()) {
                    c11024d.f51849a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: e */
    public Parcelable mo49323e() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: f */
    public void mo49322f(boolean z) {
        for (C11024d c11024d : this.f51825j) {
            AbstractC49226tQ2.m12400A(c11024d.m70184a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: g */
    public boolean mo49321g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: j */
    public void mo70079j(InterfaceC11037i.InterfaceC11038a interfaceC11038a) {
        this.f51840y = interfaceC11038a;
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: k */
    public ListView mo1720k() {
        if (this.f51825j.isEmpty()) {
            return null;
        }
        List<C11024d> list = this.f51825j;
        return list.get(list.size() - 1).m70184a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: l */
    public void mo49319l(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: m */
    public boolean mo49318m(SubMenuC11044l subMenuC11044l) {
        for (C11024d c11024d : this.f51825j) {
            if (subMenuC11044l == c11024d.f51850b) {
                c11024d.m70184a().requestFocus();
                return true;
            }
        }
        if (subMenuC11044l.hasVisibleItems()) {
            mo12396n(subMenuC11044l);
            InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51840y;
            if (interfaceC11038a != null) {
                interfaceC11038a.mo69981c(subMenuC11044l);
            }
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: n */
    public void mo12396n(C11028e c11028e) {
        c11028e.m70148c(this, this.f51818c);
        if (mo1721c()) {
            m70185H(c11028e);
        } else {
            this.f51824i.add(c11028e);
        }
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: o */
    public boolean mo12395o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C11024d c11024d;
        int size = this.f51825j.size();
        int i = 0;
        while (true) {
            if (i < size) {
                c11024d = this.f51825j.get(i);
                if (!c11024d.f51849a.mo1721c()) {
                    break;
                }
                i++;
            } else {
                c11024d = null;
                break;
            }
        }
        if (c11024d != null) {
            c11024d.f51850b.m70144e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: r */
    public void mo12392r(View view) {
        if (this.f51831p != view) {
            this.f51831p = view;
            this.f51830o = YD1.m75415b(this.f51829n, C38790bq6.m62548D(view));
        }
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: t */
    public void mo12390t(boolean z) {
        this.f51838w = z;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: u */
    public void mo12389u(int i) {
        if (this.f51829n != i) {
            this.f51829n = i;
            this.f51830o = YD1.m75415b(i, C38790bq6.m62548D(this.f51831p));
        }
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: v */
    public void mo12388v(int i) {
        this.f51834s = true;
        this.f51836u = i;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: w */
    public void mo12387w(PopupWindow.OnDismissListener onDismissListener) {
        this.f51816A = onDismissListener;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: x */
    public void mo12386x(boolean z) {
        this.f51839x = z;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: y */
    public void mo12385y(int i) {
        this.f51835t = true;
        this.f51837v = i;
    }
}
