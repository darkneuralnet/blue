package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: vb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50511vb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f114365a;

    /* renamed from: b */
    public final TextView f114366b;

    /* renamed from: c */
    public final TextView f114367c;

    /* renamed from: d */
    public final TextView f114368d;

    /* renamed from: e */
    public final TextView f114369e;

    /* renamed from: f */
    public final TextView f114370f;

    public C50511vb2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f114365a = constraintLayout;
        this.f114366b = textView;
        this.f114367c = textView2;
        this.f114368d = textView3;
        this.f114369e = textView4;
        this.f114370f = textView5;
    }

    /* renamed from: a */
    public static C50511vb2 m8399a(View view) {
        int i = C37053Xg4.date;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C37053Xg4.repairType;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C37053Xg4.repairerEmail;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    i = C37053Xg4.repairerRole;
                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView4 != null) {
                        i = C37053Xg4.subtype;
                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView5 != null) {
                            return new C50511vb2((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114365a;
    }
}
