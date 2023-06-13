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
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: Zf3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37511Zf3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f48919a;

    /* renamed from: b */
    public final SilenceableMaterialEditText f48920b;

    /* renamed from: c */
    public final LinearLayout f48921c;

    /* renamed from: d */
    public final TextView f48922d;

    /* renamed from: e */
    public final MapView f48923e;

    /* renamed from: f */
    public final Button f48924f;

    /* renamed from: g */
    public final LinearProgressIndicator f48925g;

    public C37511Zf3(CoordinatorLayout coordinatorLayout, SilenceableMaterialEditText silenceableMaterialEditText, LinearLayout linearLayout, TextView textView, MapView mapView, Button button, LinearProgressIndicator linearProgressIndicator) {
        this.f48919a = coordinatorLayout;
        this.f48920b = silenceableMaterialEditText;
        this.f48921c = linearLayout;
        this.f48922d = textView;
        this.f48923e = mapView;
        this.f48924f = button;
        this.f48925g = linearProgressIndicator;
    }

    /* renamed from: a */
    public static C37511Zf3 m72793a(View view) {
        int i = C36585Vg4.addressText;
        SilenceableMaterialEditText silenceableMaterialEditText = (SilenceableMaterialEditText) C34328Lp6.m96312a(view, i);
        if (silenceableMaterialEditText != null) {
            i = C36585Vg4.dragView;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                i = C36585Vg4.headsUpText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36585Vg4.mapView;
                    MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                    if (mapView != null) {
                        i = C36585Vg4.next;
                        Button button = (Button) C34328Lp6.m96312a(view, i);
                        if (button != null) {
                            i = C36585Vg4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                return new C37511Zf3((CoordinatorLayout) view, silenceableMaterialEditText, linearLayout, textView, mapView, button, linearProgressIndicator);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C37511Zf3 m72791c(LayoutInflater layoutInflater) {
        return m72790d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C37511Zf3 m72790d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.on_demand_setup_location, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m72793a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f48919a;
    }
}
