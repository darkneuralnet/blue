package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: JZ */
/* loaded from: classes3.dex */
public final class C4144JZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f17788a;

    /* renamed from: b */
    public final Button f17789b;

    /* renamed from: c */
    public final TextView f17790c;

    /* renamed from: d */
    public final Button f17791d;

    /* renamed from: e */
    public final Button f17792e;

    /* renamed from: f */
    public final TextView f17793f;

    /* renamed from: g */
    public final TextView f17794g;

    public C4144JZ(LinearLayout linearLayout, Button button, TextView textView, Button button2, Button button3, TextView textView2, TextView textView3) {
        this.f17788a = linearLayout;
        this.f17789b = button;
        this.f17790c = textView;
        this.f17791d = button2;
        this.f17792e = button3;
        this.f17793f = textView2;
        this.f17794g = textView3;
    }

    /* renamed from: a */
    public static C4144JZ m100223a(View view) {
        int i = C39912di4.accept;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.body;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C39912di4.cancel;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C39912di4.close_incomplete_reason;
                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                    if (button3 != null) {
                        i = C39912di4.reason_instructions;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C39912di4.title;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                return new C4144JZ((LinearLayout) view, button, textView, button2, button3, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C4144JZ m100221c(LayoutInflater layoutInflater) {
        return m100220d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C4144JZ m100220d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.bottom_sheet_close_incomplete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m100223a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f17788a;
    }
}
