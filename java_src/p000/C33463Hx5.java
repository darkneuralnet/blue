package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.bird.android.widget.SilenceableMaterialEditText;
import com.google.android.gms.maps.MapView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: Hx5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33463Hx5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f14214a;

    /* renamed from: b */
    public final SilenceableMaterialEditText f14215b;

    /* renamed from: c */
    public final LinearLayout f14216c;

    /* renamed from: d */
    public final TextView f14217d;

    /* renamed from: e */
    public final MapView f14218e;

    /* renamed from: f */
    public final FloatingActionButton f14219f;

    /* renamed from: g */
    public final Button f14220g;

    /* renamed from: h */
    public final LinearProgressIndicator f14221h;

    public C33463Hx5(CoordinatorLayout coordinatorLayout, SilenceableMaterialEditText silenceableMaterialEditText, LinearLayout linearLayout, TextView textView, MapView mapView, FloatingActionButton floatingActionButton, Button button, LinearProgressIndicator linearProgressIndicator) {
        this.f14214a = coordinatorLayout;
        this.f14215b = silenceableMaterialEditText;
        this.f14216c = linearLayout;
        this.f14217d = textView;
        this.f14218e = mapView;
        this.f14219f = floatingActionButton;
        this.f14220g = button;
        this.f14221h = linearProgressIndicator;
    }

    /* renamed from: a */
    public static C33463Hx5 m103195a(View view) {
        int i = C31680Ah4.addressText;
        SilenceableMaterialEditText silenceableMaterialEditText = (SilenceableMaterialEditText) C34328Lp6.m96312a(view, i);
        if (silenceableMaterialEditText != null) {
            i = C31680Ah4.dragView;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                i = C31680Ah4.headsUpText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C31680Ah4.mapView;
                    MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                    if (mapView != null) {
                        i = C31680Ah4.myLocationButton;
                        FloatingActionButton floatingActionButton = (FloatingActionButton) C34328Lp6.m96312a(view, i);
                        if (floatingActionButton != null) {
                            i = C31680Ah4.next;
                            Button button = (Button) C34328Lp6.m96312a(view, i);
                            if (button != null) {
                                i = C31680Ah4.progressBar;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                if (linearProgressIndicator != null) {
                                    return new C33463Hx5((CoordinatorLayout) view, silenceableMaterialEditText, linearLayout, textView, mapView, floatingActionButton, button, linearProgressIndicator);
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
    public static C33463Hx5 m103193c(LayoutInflater layoutInflater) {
        return m103192d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C33463Hx5 m103192d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.setup_location, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m103195a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f14214a;
    }
}
