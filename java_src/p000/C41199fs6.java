package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FleetMarkerPin;
/* renamed from: fs6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41199fs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f80982a;

    /* renamed from: b */
    public final ImageView f80983b;

    /* renamed from: c */
    public final FleetMarkerPin f80984c;

    public C41199fs6(ConstraintLayout constraintLayout, ImageView imageView, FleetMarkerPin fleetMarkerPin) {
        this.f80982a = constraintLayout;
        this.f80983b = imageView;
        this.f80984c = fleetMarkerPin;
    }

    /* renamed from: a */
    public static C41199fs6 m40618a(View view) {
        int i = C31680Ah4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C31680Ah4.pin;
            FleetMarkerPin fleetMarkerPin = (FleetMarkerPin) C34328Lp6.m96312a(view, i);
            if (fleetMarkerPin != null) {
                return new C41199fs6((ConstraintLayout) view, imageView, fleetMarkerPin);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C41199fs6 m40616c(LayoutInflater layoutInflater) {
        return m40615d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C41199fs6 m40615d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_fleet_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m40618a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f80982a;
    }
}
