package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import co.bird.android.app.feature.communitymode.widget.OptionsView;
import co.bird.android.app.feature.reportcomplaint.ReportView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: o5 */
/* loaded from: classes2.dex */
public final class C26812o5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f101323a;

    /* renamed from: b */
    public final OptionsView f101324b;

    /* renamed from: c */
    public final LinearProgressIndicator f101325c;

    /* renamed from: d */
    public final ReportView f101326d;

    /* renamed from: e */
    public final Button f101327e;

    public C26812o5(RelativeLayout relativeLayout, OptionsView optionsView, LinearProgressIndicator linearProgressIndicator, ReportView reportView, Button button) {
        this.f101323a = relativeLayout;
        this.f101324b = optionsView;
        this.f101325c = linearProgressIndicator;
        this.f101326d = reportView;
        this.f101327e = button;
    }

    /* renamed from: a */
    public static C26812o5 m21831a(View view) {
        int i = C36585Vg4.optionsView;
        OptionsView optionsView = (OptionsView) C34328Lp6.m96312a(view, i);
        if (optionsView != null) {
            i = C36585Vg4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C36585Vg4.reportView;
                ReportView reportView = (ReportView) C34328Lp6.m96312a(view, i);
                if (reportView != null) {
                    i = C36585Vg4.submitButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        return new C26812o5((RelativeLayout) view, optionsView, linearProgressIndicator, reportView, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C26812o5 m21829c(LayoutInflater layoutInflater) {
        return m21828d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C26812o5 m21828d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m21831a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f101323a;
    }
}
