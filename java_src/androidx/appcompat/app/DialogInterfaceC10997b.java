package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import kotlin.KotlinVersion;
/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class DialogInterfaceC10997b extends DialogC26167mi implements DialogInterface {

    /* renamed from: b */
    public final AlertController f51703b;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    public static class C10998a {

        /* renamed from: a */
        public final AlertController.C10955b f51704a;

        /* renamed from: b */
        public final int f51705b;

        public C10998a(Context context) {
            this(context, DialogInterfaceC10997b.m70302c(context, 0));
        }

        /* renamed from: a */
        public DialogInterfaceC10997b mo70301a() {
            DialogInterfaceC10997b dialogInterfaceC10997b = new DialogInterfaceC10997b(this.f51704a.f51542a, this.f51705b);
            this.f51704a.m70427a(dialogInterfaceC10997b.f51703b);
            dialogInterfaceC10997b.setCancelable(this.f51704a.f51559r);
            if (this.f51704a.f51559r) {
                dialogInterfaceC10997b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC10997b.setOnCancelListener(this.f51704a.f51560s);
            dialogInterfaceC10997b.setOnDismissListener(this.f51704a.f51561t);
            DialogInterface.OnKeyListener onKeyListener = this.f51704a.f51562u;
            if (onKeyListener != null) {
                dialogInterfaceC10997b.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC10997b;
        }

        /* renamed from: b */
        public Context m70300b() {
            return this.f51704a.f51542a;
        }

        /* renamed from: c */
        public C10998a mo70299c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51564w = listAdapter;
            c10955b.f51565x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C10998a mo70298d(boolean z) {
            this.f51704a.f51559r = z;
            return this;
        }

        /* renamed from: e */
        public C10998a mo70297e(View view) {
            this.f51704a.f51548g = view;
            return this;
        }

        /* renamed from: f */
        public C10998a mo70296f(Drawable drawable) {
            this.f51704a.f51545d = drawable;
            return this;
        }

        /* renamed from: g */
        public C10998a mo70295g(int i) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51549h = c10955b.f51542a.getText(i);
            return this;
        }

        /* renamed from: h */
        public C10998a mo70294h(CharSequence charSequence) {
            this.f51704a.f51549h = charSequence;
            return this;
        }

        /* renamed from: i */
        public C10998a mo70293i(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51553l = c10955b.f51542a.getText(i);
            this.f51704a.f51555n = onClickListener;
            return this;
        }

        /* renamed from: j */
        public C10998a m70292j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51553l = charSequence;
            c10955b.f51555n = onClickListener;
            return this;
        }

        /* renamed from: k */
        public C10998a mo70291k(DialogInterface.OnCancelListener onCancelListener) {
            this.f51704a.f51560s = onCancelListener;
            return this;
        }

        /* renamed from: l */
        public C10998a mo70290l(DialogInterface.OnKeyListener onKeyListener) {
            this.f51704a.f51562u = onKeyListener;
            return this;
        }

        /* renamed from: m */
        public C10998a mo70289m(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51550i = c10955b.f51542a.getText(i);
            this.f51704a.f51552k = onClickListener;
            return this;
        }

        /* renamed from: n */
        public C10998a m70288n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51550i = charSequence;
            c10955b.f51552k = onClickListener;
            return this;
        }

        /* renamed from: o */
        public C10998a mo70287o(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51564w = listAdapter;
            c10955b.f51565x = onClickListener;
            c10955b.f51535I = i;
            c10955b.f51534H = true;
            return this;
        }

        /* renamed from: p */
        public C10998a mo70286p(int i) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51547f = c10955b.f51542a.getText(i);
            return this;
        }

        /* renamed from: q */
        public C10998a mo70285q(CharSequence charSequence) {
            this.f51704a.f51547f = charSequence;
            return this;
        }

        /* renamed from: r */
        public C10998a mo70284r(View view) {
            AlertController.C10955b c10955b = this.f51704a;
            c10955b.f51567z = view;
            c10955b.f51566y = 0;
            c10955b.f51531E = false;
            return this;
        }

        /* renamed from: s */
        public DialogInterfaceC10997b m70283s() {
            DialogInterfaceC10997b mo70301a = mo70301a();
            mo70301a.show();
            return mo70301a;
        }

        public C10998a(Context context, int i) {
            this.f51704a = new AlertController.C10955b(new ContextThemeWrapper(context, DialogInterfaceC10997b.m70302c(context, i)));
            this.f51705b = i;
        }
    }

    public DialogInterfaceC10997b(Context context, int i) {
        super(context, m70302c(context, i));
        this.f51703b = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: c */
    public static int m70302c(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C50553vf4.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public ListView m70303b() {
        return this.f51703b.m70449d();
    }

    @Override // p000.DialogC26167mi, p000.DialogC35519Qs0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51703b.m70448e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f51703b.m70447f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f51703b.m70446g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p000.DialogC26167mi, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f51703b.m70437p(charSequence);
    }
}
