package p000;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Md2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34450Md2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f23306a;

    /* renamed from: b */
    public final Button f23307b;

    /* renamed from: c */
    public final FrameLayout f23308c;

    /* renamed from: d */
    public final LinearLayout f23309d;

    /* renamed from: e */
    public final View f23310e;

    /* renamed from: f */
    public final TextView f23311f;

    /* renamed from: g */
    public final TextView f23312g;

    public C34450Md2(LinearLayout linearLayout, Button button, FrameLayout frameLayout, LinearLayout linearLayout2, View view, TextView textView, TextView textView2) {
        this.f23306a = linearLayout;
        this.f23307b = button;
        this.f23308c = frameLayout;
        this.f23309d = linearLayout2;
        this.f23310e = view;
        this.f23311f = textView;
        this.f23312g = textView2;
    }

    /* renamed from: a */
    public static C34450Md2 m95105a(View view) {
        int i = C36360Uh4.action_button;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36360Uh4.action_button_container;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = C36360Uh4.location_bottom_divider;
                View m96312a = C34328Lp6.m96312a(view, i);
                if (m96312a != null) {
                    i = C36360Uh4.subtitle;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C36360Uh4.title;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new C34450Md2(linearLayout, button, frameLayout, linearLayout, m96312a, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f23306a;
    }
}
