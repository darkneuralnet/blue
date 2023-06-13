package p000;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: Tp6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36200Tp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f36122a;

    /* renamed from: b */
    public final Button f36123b;

    /* renamed from: c */
    public final CardView f36124c;

    /* renamed from: d */
    public final LinearLayout f36125d;

    /* renamed from: e */
    public final TextView f36126e;

    /* renamed from: f */
    public final LinearLayout f36127f;

    /* renamed from: g */
    public final LinearProgressIndicator f36128g;

    /* renamed from: h */
    public final ScrollView f36129h;

    /* renamed from: i */
    public final Button f36130i;

    /* renamed from: j */
    public final Button f36131j;

    public C36200Tp6(LinearLayout linearLayout, Button button, CardView cardView, LinearLayout linearLayout2, TextView textView, LinearLayout linearLayout3, LinearProgressIndicator linearProgressIndicator, ScrollView scrollView, Button button2, Button button3) {
        this.f36122a = linearLayout;
        this.f36123b = button;
        this.f36124c = cardView;
        this.f36125d = linearLayout2;
        this.f36126e = textView;
        this.f36127f = linearLayout3;
        this.f36128g = linearProgressIndicator;
        this.f36129h = scrollView;
        this.f36130i = button2;
        this.f36131j = button3;
    }

    /* renamed from: a */
    public static C36200Tp6 m82949a(View view) {
        int i = C52955zi4.button;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C52955zi4.buttonContainer;
            CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
            if (cardView != null) {
                i = C52955zi4.buttonContainerLinearLayout;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C52955zi4.buttonsLabel;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C52955zi4.content;
                        LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                        if (linearLayout2 != null) {
                            i = C52955zi4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                i = C52955zi4.scrollView;
                                ScrollView scrollView = (ScrollView) C34328Lp6.m96312a(view, i);
                                if (scrollView != null) {
                                    i = C52955zi4.secondaryButton;
                                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button2 != null) {
                                        i = C52955zi4.tertiaryButton;
                                        Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                        if (button3 != null) {
                                            return new C36200Tp6((LinearLayout) view, button, cardView, linearLayout, textView, linearLayout2, linearProgressIndicator, scrollView, button2, button3);
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

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f36122a;
    }
}
