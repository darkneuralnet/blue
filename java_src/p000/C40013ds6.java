package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FleetMarkerPin;
/* renamed from: ds6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40013ds6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f77331a;

    /* renamed from: b */
    public final ImageView f77332b;

    /* renamed from: c */
    public final FleetMarkerPin f77333c;

    public C40013ds6(ConstraintLayout constraintLayout, ImageView imageView, FleetMarkerPin fleetMarkerPin) {
        this.f77331a = constraintLayout;
        this.f77332b = imageView;
        this.f77333c = fleetMarkerPin;
    }

    /* renamed from: a */
    public static C40013ds6 m43569a(View view) {
        int i = C31680Ah4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C31680Ah4.pin;
            FleetMarkerPin fleetMarkerPin = (FleetMarkerPin) C34328Lp6.m96312a(view, i);
            if (fleetMarkerPin != null) {
                return new C40013ds6((ConstraintLayout) view, imageView, fleetMarkerPin);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C40013ds6 m43567c(LayoutInflater layoutInflater) {
        return m43566d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C40013ds6 m43566d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_bounty_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43569a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f77331a;
    }
}
