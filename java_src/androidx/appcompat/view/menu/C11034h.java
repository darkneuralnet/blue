package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC11037i;
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public class C11034h {

    /* renamed from: a */
    public final Context f51933a;

    /* renamed from: b */
    public final C11028e f51934b;

    /* renamed from: c */
    public final boolean f51935c;

    /* renamed from: d */
    public final int f51936d;

    /* renamed from: e */
    public final int f51937e;

    /* renamed from: f */
    public View f51938f;

    /* renamed from: g */
    public int f51939g;

    /* renamed from: h */
    public boolean f51940h;

    /* renamed from: i */
    public InterfaceC11037i.InterfaceC11038a f51941i;

    /* renamed from: j */
    public AbstractC49226tQ2 f51942j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f51943k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f51944l;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    /* loaded from: classes.dex */
    public class C11035a implements PopupWindow.OnDismissListener {
        public C11035a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C11034h.this.mo70001e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    /* loaded from: classes.dex */
    public static class C11036b {
        private C11036b() {
        }

        /* renamed from: a */
        public static void m70081a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C11034h(Context context, C11028e c11028e, View view, boolean z, int i) {
        this(context, c11028e, view, z, i, 0);
    }

    /* renamed from: a */
    public final AbstractC49226tQ2 m70094a() {
        boolean z;
        AbstractC49226tQ2 view$OnKeyListenerC11041k;
        Display defaultDisplay = ((WindowManager) this.f51933a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        C11036b.m70081a(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.f51933a.getResources().getDimensionPixelSize(C39281cg4.abc_cascading_menus_min_smallest_width)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            view$OnKeyListenerC11041k = new View$OnKeyListenerC11019b(this.f51933a, this.f51938f, this.f51936d, this.f51937e, this.f51935c);
        } else {
            view$OnKeyListenerC11041k = new View$OnKeyListenerC11041k(this.f51933a, this.f51934b, this.f51938f, this.f51936d, this.f51937e, this.f51935c);
        }
        view$OnKeyListenerC11041k.mo12396n(this.f51934b);
        view$OnKeyListenerC11041k.mo12387w(this.f51944l);
        view$OnKeyListenerC11041k.mo12392r(this.f51938f);
        view$OnKeyListenerC11041k.mo70079j(this.f51941i);
        view$OnKeyListenerC11041k.mo12390t(this.f51940h);
        view$OnKeyListenerC11041k.mo12389u(this.f51939g);
        return view$OnKeyListenerC11041k;
    }

    /* renamed from: b */
    public void m70093b() {
        if (m70091d()) {
            this.f51942j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC49226tQ2 m70092c() {
        if (this.f51942j == null) {
            this.f51942j = m70094a();
        }
        return this.f51942j;
    }

    /* renamed from: d */
    public boolean m70091d() {
        AbstractC49226tQ2 abstractC49226tQ2 = this.f51942j;
        return abstractC49226tQ2 != null && abstractC49226tQ2.mo1721c();
    }

    /* renamed from: e */
    public void mo70001e() {
        this.f51942j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f51943k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m70090f(View view) {
        this.f51938f = view;
    }

    /* renamed from: g */
    public void m70089g(boolean z) {
        this.f51940h = z;
        AbstractC49226tQ2 abstractC49226tQ2 = this.f51942j;
        if (abstractC49226tQ2 != null) {
            abstractC49226tQ2.mo12390t(z);
        }
    }

    /* renamed from: h */
    public void m70088h(int i) {
        this.f51939g = i;
    }

    /* renamed from: i */
    public void m70087i(PopupWindow.OnDismissListener onDismissListener) {
        this.f51943k = onDismissListener;
    }

    /* renamed from: j */
    public void m70086j(InterfaceC11037i.InterfaceC11038a interfaceC11038a) {
        this.f51941i = interfaceC11038a;
        AbstractC49226tQ2 abstractC49226tQ2 = this.f51942j;
        if (abstractC49226tQ2 != null) {
            abstractC49226tQ2.mo70079j(interfaceC11038a);
        }
    }

    /* renamed from: k */
    public void m70085k() {
        if (m70083m()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    /* renamed from: l */
    public final void m70084l(int i, int i2, boolean z, boolean z2) {
        AbstractC49226tQ2 m70092c = m70092c();
        m70092c.mo12386x(z2);
        if (z) {
            if ((YD1.m75415b(this.f51939g, C38790bq6.m62548D(this.f51938f)) & 7) == 5) {
                i -= this.f51938f.getWidth();
            }
            m70092c.mo12388v(i);
            m70092c.mo12385y(i2);
            int i3 = (int) ((this.f51933a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m70092c.m12391s(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m70092c.mo1722a();
    }

    /* renamed from: m */
    public boolean m70083m() {
        if (m70091d()) {
            return true;
        }
        if (this.f51938f == null) {
            return false;
        }
        m70084l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m70082n(int i, int i2) {
        if (m70091d()) {
            return true;
        }
        if (this.f51938f == null) {
            return false;
        }
        m70084l(i, i2, true, true);
        return true;
    }

    public C11034h(Context context, C11028e c11028e, View view, boolean z, int i, int i2) {
        this.f51939g = 8388611;
        this.f51944l = new C11035a();
        this.f51933a = context;
        this.f51934b = c11028e;
        this.f51938f = view;
        this.f51935c = z;
        this.f51936d = i;
        this.f51937e = i2;
    }
}
