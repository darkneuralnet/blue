package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.bird.android.widget.CameraxView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: O5 */
/* loaded from: classes2.dex */
public final class C5821O5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f25612a;

    /* renamed from: b */
    public final CameraxView f25613b;

    /* renamed from: c */
    public final TextView f25614c;

    /* renamed from: d */
    public final LinearProgressIndicator f25615d;

    /* renamed from: e */
    public final Button f25616e;

    public C5821O5(RelativeLayout relativeLayout, CameraxView cameraxView, TextView textView, LinearProgressIndicator linearProgressIndicator, Button button) {
        this.f25612a = relativeLayout;
        this.f25613b = cameraxView;
        this.f25614c = textView;
        this.f25615d = linearProgressIndicator;
        this.f25616e = button;
    }

    /* renamed from: a */
    public static C5821O5 m92950a(View view) {
        int i = C36585Vg4.camera;
        CameraxView cameraxView = (CameraxView) C34328Lp6.m96312a(view, i);
        if (cameraxView != null) {
            i = C36585Vg4.infoText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C36585Vg4.takePhotoButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        return new C5821O5((RelativeLayout) view, cameraxView, textView, linearProgressIndicator, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C5821O5 m92948c(LayoutInflater layoutInflater) {
        return m92947d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5821O5 m92947d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_ride_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92950a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f25612a;
    }
}
