package p000;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.bird.android.widget.progress.HorizontalRoundedProgressBar;
/* renamed from: ar6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38207ar6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f56430a;

    /* renamed from: b */
    public final Button f56431b;

    /* renamed from: c */
    public final Button f56432c;

    /* renamed from: d */
    public final LinearLayout f56433d;

    /* renamed from: e */
    public final RelativeLayout f56434e;

    /* renamed from: f */
    public final TextView f56435f;

    /* renamed from: g */
    public final HorizontalRoundedProgressBar f56436g;

    public C38207ar6(RelativeLayout relativeLayout, Button button, Button button2, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView, HorizontalRoundedProgressBar horizontalRoundedProgressBar) {
        this.f56430a = relativeLayout;
        this.f56431b = button;
        this.f56432c = button2;
        this.f56433d = linearLayout;
        this.f56434e = relativeLayout2;
        this.f56435f = textView;
        this.f56436g = horizontalRoundedProgressBar;
    }

    /* renamed from: a */
    public static C38207ar6 m65377a(View view) {
        int i = C34722Nh4.cancelUpdate;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C34722Nh4.continueUpdate;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C34722Nh4.firmwareUpdateContainer;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = C34722Nh4.firmwareUpdatingTitle;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C34722Nh4.progressBar;
                        HorizontalRoundedProgressBar horizontalRoundedProgressBar = (HorizontalRoundedProgressBar) C34328Lp6.m96312a(view, i);
                        if (horizontalRoundedProgressBar != null) {
                            return new C38207ar6(relativeLayout, button, button2, linearLayout, relativeLayout, textView, horizontalRoundedProgressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f56430a;
    }
}
