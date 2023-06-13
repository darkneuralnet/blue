package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import co.bird.android.app.feature.communitymode.widget.OptionsView;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.widget.CallToActionLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: r5 */
/* loaded from: classes2.dex */
public final class C27842r5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ScrollView f106435a;

    /* renamed from: b */
    public final CallToActionLayout f106436b;

    /* renamed from: c */
    public final ImageUploadBar f106437c;

    /* renamed from: d */
    public final EditText f106438d;

    /* renamed from: e */
    public final OptionsView f106439e;

    /* renamed from: f */
    public final LinearProgressIndicator f106440f;

    public C27842r5(ScrollView scrollView, CallToActionLayout callToActionLayout, ImageUploadBar imageUploadBar, EditText editText, OptionsView optionsView, LinearProgressIndicator linearProgressIndicator) {
        this.f106435a = scrollView;
        this.f106436b = callToActionLayout;
        this.f106437c = imageUploadBar;
        this.f106438d = editText;
        this.f106439e = optionsView;
        this.f106440f = linearProgressIndicator;
    }

    /* renamed from: a */
    public static C27842r5 m16515a(View view) {
        int i = C36585Vg4.callToAction;
        CallToActionLayout callToActionLayout = (CallToActionLayout) C34328Lp6.m96312a(view, i);
        if (callToActionLayout != null) {
            i = C36585Vg4.imageUploadBar;
            ImageUploadBar imageUploadBar = (ImageUploadBar) C34328Lp6.m96312a(view, i);
            if (imageUploadBar != null) {
                i = C36585Vg4.issueTextBox;
                EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                if (editText != null) {
                    i = C36585Vg4.optionsView;
                    OptionsView optionsView = (OptionsView) C34328Lp6.m96312a(view, i);
                    if (optionsView != null) {
                        i = C36585Vg4.progressBar;
                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                        if (linearProgressIndicator != null) {
                            return new C27842r5((ScrollView) view, callToActionLayout, imageUploadBar, editText, optionsView, linearProgressIndicator);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27842r5 m16513c(LayoutInflater layoutInflater) {
        return m16512d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27842r5 m16512d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_reservation_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m16515a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f106435a;
    }
}
