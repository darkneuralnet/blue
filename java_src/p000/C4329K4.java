package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: K4 */
/* loaded from: classes2.dex */
public final class C4329K4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f19014a;

    /* renamed from: b */
    public final Button f19015b;

    /* renamed from: c */
    public final Button f19016c;

    /* renamed from: d */
    public final LinearLayout f19017d;

    /* renamed from: e */
    public final Button f19018e;

    /* renamed from: f */
    public final LinearLayout f19019f;

    /* renamed from: g */
    public final TextView f19020g;

    /* renamed from: h */
    public final TextView f19021h;

    /* renamed from: i */
    public final LinearLayout f19022i;

    /* renamed from: j */
    public final TextView f19023j;

    public C4329K4(RelativeLayout relativeLayout, Button button, Button button2, LinearLayout linearLayout, Button button3, LinearLayout linearLayout2, TextView textView, TextView textView2, LinearLayout linearLayout3, TextView textView3) {
        this.f19014a = relativeLayout;
        this.f19015b = button;
        this.f19016c = button2;
        this.f19017d = linearLayout;
        this.f19018e = button3;
        this.f19019f = linearLayout2;
        this.f19020g = textView;
        this.f19021h = textView2;
        this.f19022i = linearLayout3;
        this.f19023j = textView3;
    }

    /* renamed from: a */
    public static C4329K4 m99275a(View view) {
        int i = C36585Vg4.birdAlreadyUnlocked;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.doneButton;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C36585Vg4.footer;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C36585Vg4.getHelpButton;
                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                    if (button3 != null) {
                        i = C36585Vg4.instructionsContainer;
                        LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                        if (linearLayout2 != null) {
                            i = C36585Vg4.physicalLockText;
                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView != null) {
                                i = C36585Vg4.physicalLockTextBlur;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    i = C36585Vg4.physicalLockTextContainer;
                                    LinearLayout linearLayout3 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                    if (linearLayout3 != null) {
                                        i = C36585Vg4.physicalLockUnlockRevealCode;
                                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView3 != null) {
                                            return new C4329K4((RelativeLayout) view, button, button2, linearLayout, button3, linearLayout2, textView, textView2, linearLayout3, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C4329K4 m99273c(LayoutInflater layoutInflater) {
        return m99272d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C4329K4 m99272d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_physical_lock_blur_unlock, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m99275a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f19014a;
    }
}
