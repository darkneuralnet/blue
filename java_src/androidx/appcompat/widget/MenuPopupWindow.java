package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C11027d;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class MenuPopupWindow extends ListPopupWindow implements InterfaceC46262oQ2 {

    /* renamed from: K */
    public static Method f52216K;

    /* renamed from: J */
    public InterfaceC46262oQ2 f52217J;

    /* loaded from: classes.dex */
    public static class MenuDropDownListView extends R71 {

        /* renamed from: o */
        public final int f52218o;

        /* renamed from: p */
        public final int f52219p;

        /* renamed from: q */
        public InterfaceC46262oQ2 f52220q;

        /* renamed from: r */
        public MenuItem f52221r;

        /* renamed from: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView$a */
        /* loaded from: classes.dex */
        public static class C11097a {
            private C11097a() {
            }

            /* renamed from: a */
            public static int m69862a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == C11097a.m69862a(context.getResources().getConfiguration())) {
                this.f52218o = 21;
                this.f52219p = 22;
                return;
            }
            this.f52218o = 22;
            this.f52219p = 21;
        }

        @Override // p000.R71
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo69864d(int i, int i2, int i3, int i4, int i5) {
            return super.mo69864d(i, i2, i3, i4, i5);
        }

        @Override // p000.R71
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo69863e(MotionEvent motionEvent, int i) {
            return super.mo69863e(motionEvent, i);
        }

        @Override // p000.R71, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // p000.R71, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // p000.R71, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // p000.R71, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // p000.R71, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C11027d c11027d;
            int i;
            C11032g c11032g;
            int pointToPosition;
            int i2;
            if (this.f52220q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c11027d = (C11027d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c11027d = (C11027d) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c11027d.getCount()) {
                    c11032g = c11027d.getItem(i2);
                } else {
                    c11032g = null;
                }
                MenuItem menuItem = this.f52221r;
                if (menuItem != c11032g) {
                    C11028e m70176b = c11027d.m70176b();
                    if (menuItem != null) {
                        this.f52220q.mo21092j(m70176b, menuItem);
                    }
                    this.f52221r = c11032g;
                    if (c11032g != null) {
                        this.f52220q.mo21093d(m70176b, c11032g);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C11027d c11027d;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f52218o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.mo49372e().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.f52219p) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    c11027d = (C11027d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    c11027d = (C11027d) adapter;
                }
                c11027d.m70176b().m70144e(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        @Override // p000.R71, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC46262oQ2 interfaceC46262oQ2) {
            this.f52220q = interfaceC46262oQ2;
        }

        @Override // p000.R71, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$a */
    /* loaded from: classes.dex */
    public static class C11098a {
        private C11098a() {
        }

        /* renamed from: a */
        public static void m69861a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        public static void m69860b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$b */
    /* loaded from: classes.dex */
    public static class C11099b {
        private C11099b() {
        }

        /* renamed from: a */
        public static void m69859a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f52216K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: S */
    public void m69869S(Object obj) {
        C11098a.m69861a(this.f52183G, (Transition) obj);
    }

    /* renamed from: T */
    public void m69868T(Object obj) {
        C11098a.m69860b(this.f52183G, (Transition) obj);
    }

    /* renamed from: U */
    public void m69867U(InterfaceC46262oQ2 interfaceC46262oQ2) {
        this.f52217J = interfaceC46262oQ2;
    }

    /* renamed from: V */
    public void m69866V(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f52216K;
            if (method != null) {
                try {
                    method.invoke(this.f52183G, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        C11099b.m69859a(this.f52183G, z);
    }

    @Override // p000.InterfaceC46262oQ2
    /* renamed from: d */
    public void mo21093d(C11028e c11028e, MenuItem menuItem) {
        InterfaceC46262oQ2 interfaceC46262oQ2 = this.f52217J;
        if (interfaceC46262oQ2 != null) {
            interfaceC46262oQ2.mo21093d(c11028e, menuItem);
        }
    }

    @Override // p000.InterfaceC46262oQ2
    /* renamed from: j */
    public void mo21092j(C11028e c11028e, MenuItem menuItem) {
        InterfaceC46262oQ2 interfaceC46262oQ2 = this.f52217J;
        if (interfaceC46262oQ2 != null) {
            interfaceC46262oQ2.mo21092j(c11028e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    /* renamed from: s */
    public R71 mo69865s(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
