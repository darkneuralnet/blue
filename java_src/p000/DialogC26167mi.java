package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC10999c;
import androidx.appcompat.app.ActionBar;
import p000.AbstractC2614G2;
import p000.C43487jk2;
/* renamed from: mi */
/* loaded from: classes.dex */
public class DialogC26167mi extends DialogC35519Qs0 implements InterfaceC10819ai {
    private AbstractC10999c mDelegate;
    private final C43487jk2.InterfaceC24999a mKeyDispatcher;

    public DialogC26167mi(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C50553vf4.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // p000.DialogC35519Qs0, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo28598e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo28613C();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C43487jk2.m30009e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo28594m(i);
    }

    public AbstractC10999c getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC10999c.m70272k(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo28590v();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo28588x();
    }

    @Override // p000.DialogC35519Qs0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo28589w();
        super.onCreate(bundle);
        getDelegate().mo28614B(bundle);
    }

    @Override // p000.DialogC35519Qs0, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo28608H();
    }

    @Override // p000.InterfaceC10819ai
    public void onSupportActionModeFinished(AbstractC2614G2 abstractC2614G2) {
    }

    @Override // p000.InterfaceC10819ai
    public void onSupportActionModeStarted(AbstractC2614G2 abstractC2614G2) {
    }

    @Override // p000.InterfaceC10819ai
    public AbstractC2614G2 onWindowStartingSupportActionMode(AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
        return null;
    }

    @Override // p000.DialogC35519Qs0, android.app.Dialog
    public void setContentView(int i) {
        getDelegate().mo28606L(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo28601S(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo28607K(i);
    }

    public DialogC26167mi(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new C43487jk2.InterfaceC24999a() { // from class: li
            @Override // p000.C43487jk2.InterfaceC24999a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogC26167mi.this.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC10999c delegate = getDelegate();
        delegate.mo28602R(getThemeResId(context, i));
        delegate.mo28614B(null);
    }

    @Override // p000.DialogC35519Qs0, android.app.Dialog
    public void setContentView(View view) {
        getDelegate().mo28605M(view);
    }

    @Override // p000.DialogC35519Qs0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo28604N(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo28601S(getContext().getString(i));
    }

    public DialogC26167mi(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new C43487jk2.InterfaceC24999a() { // from class: li
            @Override // p000.C43487jk2.InterfaceC24999a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogC26167mi.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
