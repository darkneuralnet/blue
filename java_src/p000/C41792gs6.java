package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BatteryViewV2;
import co.bird.android.widget.FleetMarkerPillPin;
/* renamed from: gs6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41792gs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f84392a;

    /* renamed from: b */
    public final BatteryViewV2 f84393b;

    /* renamed from: c */
    public final TextView f84394c;

    /* renamed from: d */
    public final ImageView f84395d;

    /* renamed from: e */
    public final TextView f84396e;

    /* renamed from: f */
    public final FleetMarkerPillPin f84397f;

    public C41792gs6(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, TextView textView, ImageView imageView, TextView textView2, FleetMarkerPillPin fleetMarkerPillPin) {
        this.f84392a = constraintLayout;
        this.f84393b = batteryViewV2;
        this.f84394c = textView;
        this.f84395d = imageView;
        this.f84396e = textView2;
        this.f84397f = fleetMarkerPillPin;
    }

    /* renamed from: a */
    public static C41792gs6 m37373a(View view) {
        int i = C31680Ah4.battery;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C31680Ah4.code;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C31680Ah4.icon;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C31680Ah4.label;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C31680Ah4.pin;
                        FleetMarkerPillPin fleetMarkerPillPin = (FleetMarkerPillPin) C34328Lp6.m96312a(view, i);
                        if (fleetMarkerPillPin != null) {
                            return new C41792gs6((ConstraintLayout) view, batteryViewV2, textView, imageView, textView2, fleetMarkerPillPin);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C41792gs6 m37371c(LayoutInflater layoutInflater) {
        return m37370d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C41792gs6 m37370d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_fleet_marker_selected, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37373a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f84392a;
    }
}
