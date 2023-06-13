package p000;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: od2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46382od2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f102207a;

    /* renamed from: b */
    public final Button f102208b;

    /* renamed from: c */
    public final FrameLayout f102209c;

    /* renamed from: d */
    public final LinearLayout f102210d;

    /* renamed from: e */
    public final TextView f102211e;

    /* renamed from: f */
    public final TextView f102212f;

    /* renamed from: g */
    public final View f102213g;

    public C46382od2(LinearLayout linearLayout, Button button, FrameLayout frameLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, View view) {
        this.f102207a = linearLayout;
        this.f102208b = button;
        this.f102209c = frameLayout;
        this.f102210d = linearLayout2;
        this.f102211e = textView;
        this.f102212f = textView2;
        this.f102213g = view;
    }

    /* renamed from: a */
    public static C46382od2 m20772a(View view) {
        View m96312a;
        int i = C36360Uh4.actionButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36360Uh4.actionButtonContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = C36360Uh4.actionSubtitleText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36360Uh4.actionTitleText;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C36360Uh4.location_bottom_divider))) != null) {
                        return new C46382od2(linearLayout, button, frameLayout, linearLayout, textView, textView2, m96312a);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f102207a;
    }
}
