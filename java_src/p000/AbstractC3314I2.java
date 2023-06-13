package p000;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: I2 */
/* loaded from: classes.dex */
public abstract class AbstractC3314I2 {

    /* renamed from: a */
    public final Context f14363a;

    /* renamed from: b */
    public InterfaceC3315a f14364b;

    /* renamed from: c */
    public InterfaceC3316b f14365c;

    /* renamed from: I2$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3315a {
        /* renamed from: a */
        void mo70016a(boolean z);
    }

    /* renamed from: I2$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3316b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC3314I2(Context context) {
        this.f14363a = context;
    }

    /* renamed from: a */
    public boolean mo17526a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo17522b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo17525c();

    /* renamed from: d */
    public View mo17521d(MenuItem menuItem) {
        return mo17525c();
    }

    /* renamed from: e */
    public boolean mo17524e() {
        return false;
    }

    /* renamed from: f */
    public void mo17523f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo17520g() {
        return false;
    }

    /* renamed from: h */
    public void m103049h() {
        this.f14365c = null;
        this.f14364b = null;
    }

    /* renamed from: i */
    public void m103048i(InterfaceC3315a interfaceC3315a) {
        this.f14364b = interfaceC3315a;
    }

    /* renamed from: j */
    public void mo17519j(InterfaceC3316b interfaceC3316b) {
        if (this.f14365c != null && interfaceC3316b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f14365c = interfaceC3316b;
    }

    /* renamed from: k */
    public void m103047k(boolean z) {
        InterfaceC3315a interfaceC3315a = this.f14364b;
        if (interfaceC3315a != null) {
            interfaceC3315a.mo70016a(z);
        }
    }
}
