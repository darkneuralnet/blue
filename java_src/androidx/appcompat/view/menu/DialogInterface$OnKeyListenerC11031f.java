package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC10997b;
import androidx.appcompat.view.menu.InterfaceC11037i;
import com.google.android.gms.location.places.Place;
import net.danlew.android.joda.DateUtils;
/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class DialogInterface$OnKeyListenerC11031f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC11037i.InterfaceC11038a {

    /* renamed from: b */
    public C11028e f51897b;

    /* renamed from: c */
    public DialogInterfaceC10997b f51898c;

    /* renamed from: d */
    public C11025c f51899d;

    /* renamed from: e */
    public InterfaceC11037i.InterfaceC11038a f51900e;

    public DialogInterface$OnKeyListenerC11031f(C11028e c11028e) {
        this.f51897b = c11028e;
    }

    /* renamed from: a */
    public void m70122a() {
        DialogInterfaceC10997b dialogInterfaceC10997b = this.f51898c;
        if (dialogInterfaceC10997b != null) {
            dialogInterfaceC10997b.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
    /* renamed from: b */
    public void mo69982b(C11028e c11028e, boolean z) {
        if (z || c11028e == this.f51897b) {
            m70122a();
        }
        InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51900e;
        if (interfaceC11038a != null) {
            interfaceC11038a.mo69982b(c11028e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
    /* renamed from: c */
    public boolean mo69981c(C11028e c11028e) {
        InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51900e;
        if (interfaceC11038a != null) {
            return interfaceC11038a.mo69981c(c11028e);
        }
        return false;
    }

    /* renamed from: d */
    public void m70121d(IBinder iBinder) {
        C11028e c11028e = this.f51897b;
        DialogInterfaceC10997b.C10998a c10998a = new DialogInterfaceC10997b.C10998a(c11028e.m70126w());
        C11025c c11025c = new C11025c(c10998a.m70300b(), C32643Ek4.abc_list_menu_item_layout);
        this.f51899d = c11025c;
        c11025c.mo70079j(this);
        this.f51897b.m70150b(this.f51899d);
        c10998a.mo70299c(this.f51899d.m70183a(), this);
        View m70173A = c11028e.m70173A();
        if (m70173A != null) {
            c10998a.mo70297e(m70173A);
        } else {
            c10998a.mo70296f(c11028e.m70124y()).mo70285q(c11028e.m70123z());
        }
        c10998a.mo70290l(this);
        DialogInterfaceC10997b mo70301a = c10998a.mo70301a();
        this.f51898c = mo70301a;
        mo70301a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f51898c.getWindow().getAttributes();
        attributes.type = Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= DateUtils.FORMAT_NUMERIC_DATE;
        this.f51898c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f51897b.m70164N((C11032g) this.f51899d.m70183a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f51899d.mo49325b(this.f51897b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f51898c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f51898c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f51897b.m70144e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f51897b.performShortcut(i, keyEvent, 0);
    }
}
