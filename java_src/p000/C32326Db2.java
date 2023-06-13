package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: Db2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32326Db2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f6003a;

    /* renamed from: b */
    public final TextView f6004b;

    /* renamed from: c */
    public final ProgressBar f6005c;

    /* renamed from: d */
    public final Button f6006d;

    public C32326Db2(RelativeLayout relativeLayout, TextView textView, ProgressBar progressBar, Button button) {
        this.f6003a = relativeLayout;
        this.f6004b = textView;
        this.f6005c = progressBar;
        this.f6006d = button;
    }

    /* renamed from: a */
    public static C32326Db2 m110131a(View view) {
        int i = C52955zi4.message;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C52955zi4.progressBar;
            ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
            if (progressBar != null) {
                i = C52955zi4.retryButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    return new C32326Db2((RelativeLayout) view, textView, progressBar, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f6003a;
    }
}
