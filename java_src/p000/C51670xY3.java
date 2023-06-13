package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11034h;
/* renamed from: xY3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51670xY3 {

    /* renamed from: a */
    public final Context f117792a;

    /* renamed from: b */
    public final C11028e f117793b;

    /* renamed from: c */
    public final View f117794c;

    /* renamed from: d */
    public final C11034h f117795d;

    /* renamed from: e */
    public InterfaceC30233c f117796e;

    /* renamed from: xY3$a */
    /* loaded from: classes.dex */
    public class C30231a implements C11028e.InterfaceC11029a {
        public C30231a() {
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: a */
        public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
            InterfaceC30233c interfaceC30233c = C51670xY3.this.f117796e;
            if (interfaceC30233c != null) {
                return interfaceC30233c.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: b */
        public void mo5019b(C11028e c11028e) {
        }
    }

    /* renamed from: xY3$b */
    /* loaded from: classes.dex */
    public class C30232b implements PopupWindow.OnDismissListener {
        public C30232b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C51670xY3.this.getClass();
        }
    }

    /* renamed from: xY3$c */
    /* loaded from: classes.dex */
    public interface InterfaceC30233c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C51670xY3(Context context, View view) {
        this(context, view, 0);
    }

    /* renamed from: a */
    public Menu m5026a() {
        return this.f117793b;
    }

    /* renamed from: b */
    public MenuInflater m5025b() {
        return new C39177cV5(this.f117792a);
    }

    /* renamed from: c */
    public void m5024c(int i) {
        m5025b().inflate(i, this.f117793b);
    }

    /* renamed from: d */
    public void m5023d(int i) {
        this.f117795d.m70088h(i);
    }

    /* renamed from: e */
    public void m5022e(InterfaceC30233c interfaceC30233c) {
        this.f117796e = interfaceC30233c;
    }

    /* renamed from: f */
    public void m5021f() {
        this.f117795d.m70085k();
    }

    public C51670xY3(Context context, View view, int i) {
        this(context, view, i, C50553vf4.popupMenuStyle, 0);
    }

    public C51670xY3(Context context, View view, int i, int i2, int i3) {
        this.f117792a = context;
        this.f117794c = view;
        C11028e c11028e = new C11028e(context);
        this.f117793b = c11028e;
        c11028e.mo70074V(new C30231a());
        C11034h c11034h = new C11034h(context, c11028e, view, false, i2, i3);
        this.f117795d = c11034h;
        c11034h.m70088h(i);
        c11034h.m70087i(new C30232b());
    }
}
