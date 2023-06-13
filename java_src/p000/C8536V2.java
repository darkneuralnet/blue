package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.bird.android.widget.ControlButton;
import com.google.android.gms.maps.MapView;
/* renamed from: V2 */
/* loaded from: classes2.dex */
public final class C8536V2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f38447a;

    /* renamed from: b */
    public final RelativeLayout f38448b;

    /* renamed from: c */
    public final RelativeLayout f38449c;

    /* renamed from: d */
    public final TextView f38450d;

    /* renamed from: e */
    public final MapView f38451e;

    /* renamed from: f */
    public final ImageButton f38452f;

    /* renamed from: g */
    public final ProgressBar f38453g;

    /* renamed from: h */
    public final ControlButton f38454h;

    /* renamed from: i */
    public final Button f38455i;

    public C8536V2(FrameLayout frameLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, MapView mapView, ImageButton imageButton, ProgressBar progressBar, ControlButton controlButton, Button button) {
        this.f38447a = frameLayout;
        this.f38448b = relativeLayout;
        this.f38449c = relativeLayout2;
        this.f38450d = textView;
        this.f38451e = mapView;
        this.f38452f = imageButton;
        this.f38453g = progressBar;
        this.f38454h = controlButton;
        this.f38455i = button;
    }

    /* renamed from: a */
    public static C8536V2 m80480a(View view) {
        int i = C36585Vg4.container;
        RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
        if (relativeLayout != null) {
            i = C36585Vg4.instructionsContainer;
            RelativeLayout relativeLayout2 = (RelativeLayout) C34328Lp6.m96312a(view, i);
            if (relativeLayout2 != null) {
                i = C36585Vg4.instructionsText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36585Vg4.mapView;
                    MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                    if (mapView != null) {
                        i = C36585Vg4.myLocationButton;
                        ImageButton imageButton = (ImageButton) C34328Lp6.m96312a(view, i);
                        if (imageButton != null) {
                            i = C36585Vg4.progressBar;
                            ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
                            if (progressBar != null) {
                                i = C36585Vg4.reportButton;
                                ControlButton controlButton = (ControlButton) C34328Lp6.m96312a(view, i);
                                if (controlButton != null) {
                                    i = C36585Vg4.skipButton;
                                    Button button = (Button) C34328Lp6.m96312a(view, i);
                                    if (button != null) {
                                        return new C8536V2((FrameLayout) view, relativeLayout, relativeLayout2, textView, mapView, imageButton, progressBar, controlButton, button);
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
    public static C8536V2 m80478c(LayoutInflater layoutInflater) {
        return m80477d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8536V2 m80477d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_bad_riding, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80480a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f38447a;
    }
}
