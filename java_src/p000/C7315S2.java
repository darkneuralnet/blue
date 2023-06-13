package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
/* renamed from: S2 */
/* loaded from: classes2.dex */
public final class C7315S2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ScrollView f33047a;

    /* renamed from: b */
    public final TextView f33048b;

    /* renamed from: c */
    public final TextView f33049c;

    /* renamed from: d */
    public final Button f33050d;

    /* renamed from: e */
    public final Button f33051e;

    /* renamed from: f */
    public final Button f33052f;

    /* renamed from: g */
    public final TextView f33053g;

    /* renamed from: h */
    public final TextView f33054h;

    /* renamed from: i */
    public final TextView f33055i;

    /* renamed from: j */
    public final TextView f33056j;

    public C7315S2(ScrollView scrollView, TextView textView, TextView textView2, Button button, Button button2, Button button3, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f33047a = scrollView;
        this.f33048b = textView;
        this.f33049c = textView2;
        this.f33050d = button;
        this.f33051e = button2;
        this.f33052f = button3;
        this.f33053g = textView3;
        this.f33054h = textView4;
        this.f33055i = textView5;
        this.f33056j = textView6;
    }

    /* renamed from: a */
    public static C7315S2 m86086a(View view) {
        int i = C36585Vg4.accessTokenBody;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.accessTokenRaw;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C36585Vg4.clearLegacyTokenButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C36585Vg4.clearTokensButton;
                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                    if (button2 != null) {
                        i = C36585Vg4.expireTokenButton;
                        Button button3 = (Button) C34328Lp6.m96312a(view, i);
                        if (button3 != null) {
                            i = C36585Vg4.legacyTokenBody;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C36585Vg4.legacyTokenRaw;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C36585Vg4.refreshTokenBody;
                                    TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView5 != null) {
                                        i = C36585Vg4.refreshTokenRaw;
                                        TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView6 != null) {
                                            return new C7315S2((ScrollView) view, textView, textView2, button, button2, button3, textView3, textView4, textView5, textView6);
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
    public static C7315S2 m86084c(LayoutInflater layoutInflater) {
        return m86083d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7315S2 m86083d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_auth_debugger, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86086a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f33047a;
    }
}
