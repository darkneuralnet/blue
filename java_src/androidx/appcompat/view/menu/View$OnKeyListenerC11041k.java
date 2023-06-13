package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.widget.MenuPopupWindow;
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC11041k extends AbstractC49226tQ2 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: w */
    public static final int f51946w = C32643Ek4.abc_popup_menu_item_layout;

    /* renamed from: c */
    public final Context f51947c;

    /* renamed from: d */
    public final C11028e f51948d;

    /* renamed from: e */
    public final C11027d f51949e;

    /* renamed from: f */
    public final boolean f51950f;

    /* renamed from: g */
    public final int f51951g;

    /* renamed from: h */
    public final int f51952h;

    /* renamed from: i */
    public final int f51953i;

    /* renamed from: j */
    public final MenuPopupWindow f51954j;

    /* renamed from: m */
    public PopupWindow.OnDismissListener f51957m;

    /* renamed from: n */
    public View f51958n;

    /* renamed from: o */
    public View f51959o;

    /* renamed from: p */
    public InterfaceC11037i.InterfaceC11038a f51960p;

    /* renamed from: q */
    public ViewTreeObserver f51961q;

    /* renamed from: r */
    public boolean f51962r;

    /* renamed from: s */
    public boolean f51963s;

    /* renamed from: t */
    public int f51964t;

    /* renamed from: v */
    public boolean f51966v;

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f51955k = new ViewTreeObserver$OnGlobalLayoutListenerC11042a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f51956l = new View$OnAttachStateChangeListenerC11043b();

    /* renamed from: u */
    public int f51965u = 0;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC11042a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC11042a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC11041k.this.mo1721c() && !View$OnKeyListenerC11041k.this.f51954j.m69905B()) {
                View view = View$OnKeyListenerC11041k.this.f51959o;
                if (view != null && view.isShown()) {
                    View$OnKeyListenerC11041k.this.f51954j.mo1722a();
                } else {
                    View$OnKeyListenerC11041k.this.dismiss();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC11043b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC11043b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC11041k.this.f51961q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC11041k.this.f51961q = view.getViewTreeObserver();
                }
                View$OnKeyListenerC11041k view$OnKeyListenerC11041k = View$OnKeyListenerC11041k.this;
                view$OnKeyListenerC11041k.f51961q.removeGlobalOnLayoutListener(view$OnKeyListenerC11041k.f51955k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC11041k(Context context, C11028e c11028e, View view, int i, int i2, boolean z) {
        this.f51947c = context;
        this.f51948d = c11028e;
        this.f51950f = z;
        this.f51949e = new C11027d(c11028e, LayoutInflater.from(context), z, f51946w);
        this.f51952h = i;
        this.f51953i = i2;
        Resources resources = context.getResources();
        this.f51951g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C39281cg4.abc_config_prefDialogWidth));
        this.f51958n = view;
        this.f51954j = new MenuPopupWindow(context, null, i, i2);
        c11028e.m70148c(this, context);
    }

    /* renamed from: B */
    public final boolean m70080B() {
        View view;
        boolean z;
        if (mo1721c()) {
            return true;
        }
        if (this.f51962r || (view = this.f51958n) == null) {
            return false;
        }
        this.f51959o = view;
        this.f51954j.m69896K(this);
        this.f51954j.m69895L(this);
        this.f51954j.m69897J(true);
        View view2 = this.f51959o;
        if (this.f51961q == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f51961q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f51955k);
        }
        view2.addOnAttachStateChangeListener(this.f51956l);
        this.f51954j.m69903D(view2);
        this.f51954j.m69900G(this.f51965u);
        if (!this.f51963s) {
            this.f51964t = AbstractC49226tQ2.m12393q(this.f51949e, null, this.f51947c, this.f51951g);
            this.f51963s = true;
        }
        this.f51954j.m69901F(this.f51964t);
        this.f51954j.m69898I(2);
        this.f51954j.m69899H(m12394p());
        this.f51954j.mo1722a();
        ListView mo1720k = this.f51954j.mo1720k();
        mo1720k.setOnKeyListener(this);
        if (this.f51966v && this.f51948d.m70123z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f51947c).inflate(C32643Ek4.abc_popup_menu_header_item_layout, (ViewGroup) mo1720k, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f51948d.m70123z());
            }
            frameLayout.setEnabled(false);
            mo1720k.addHeaderView(frameLayout, null, false);
        }
        this.f51954j.mo69882p(this.f51949e);
        this.f51954j.mo1722a();
        return true;
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: a */
    public void mo1722a() {
        if (m70080B()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: b */
    public void mo49325b(C11028e c11028e, boolean z) {
        if (c11028e != this.f51948d) {
            return;
        }
        dismiss();
        InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51960p;
        if (interfaceC11038a != null) {
            interfaceC11038a.mo69982b(c11028e, z);
        }
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: c */
    public boolean mo1721c() {
        return !this.f51962r && this.f51954j.mo1721c();
    }

    @Override // p000.InterfaceC52642zA5
    public void dismiss() {
        if (mo1721c()) {
            this.f51954j.dismiss();
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
        this.f51963s = false;
        C11027d c11027d = this.f51949e;
        if (c11027d != null) {
            c11027d.notifyDataSetChanged();
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
        this.f51960p = interfaceC11038a;
    }

    @Override // p000.InterfaceC52642zA5
    /* renamed from: k */
    public ListView mo1720k() {
        return this.f51954j.mo1720k();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: l */
    public void mo49319l(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: m */
    public boolean mo49318m(SubMenuC11044l subMenuC11044l) {
        if (subMenuC11044l.hasVisibleItems()) {
            C11034h c11034h = new C11034h(this.f51947c, subMenuC11044l, this.f51959o, this.f51950f, this.f51952h, this.f51953i);
            c11034h.m70086j(this.f51960p);
            c11034h.m70089g(AbstractC49226tQ2.m12384z(subMenuC11044l));
            c11034h.m70087i(this.f51957m);
            this.f51957m = null;
            this.f51948d.m70144e(false);
            int m69884l = this.f51954j.m69884l();
            int m69885i = this.f51954j.m69885i();
            if ((Gravity.getAbsoluteGravity(this.f51965u, C38790bq6.m62548D(this.f51958n)) & 7) == 5) {
                m69884l += this.f51958n.getWidth();
            }
            if (c11034h.m70082n(m69884l, m69885i)) {
                InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51960p;
                if (interfaceC11038a != null) {
                    interfaceC11038a.mo69981c(subMenuC11044l);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: n */
    public void mo12396n(C11028e c11028e) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f51962r = true;
        this.f51948d.close();
        ViewTreeObserver viewTreeObserver = this.f51961q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f51961q = this.f51959o.getViewTreeObserver();
            }
            this.f51961q.removeGlobalOnLayoutListener(this.f51955k);
            this.f51961q = null;
        }
        this.f51959o.removeOnAttachStateChangeListener(this.f51956l);
        PopupWindow.OnDismissListener onDismissListener = this.f51957m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f51958n = view;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: t */
    public void mo12390t(boolean z) {
        this.f51949e.m70174d(z);
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: u */
    public void mo12389u(int i) {
        this.f51965u = i;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: v */
    public void mo12388v(int i) {
        this.f51954j.m69883m(i);
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: w */
    public void mo12387w(PopupWindow.OnDismissListener onDismissListener) {
        this.f51957m = onDismissListener;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: x */
    public void mo12386x(boolean z) {
        this.f51966v = z;
    }

    @Override // p000.AbstractC49226tQ2
    /* renamed from: y */
    public void mo12385y(int i) {
        this.f51954j.m69886f(i);
    }
}
