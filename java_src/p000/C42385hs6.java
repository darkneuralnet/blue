package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FleetMarkerPin;
/* renamed from: hs6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42385hs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f86040a;

    /* renamed from: b */
    public final ImageView f86041b;

    /* renamed from: c */
    public final FleetMarkerPin f86042c;

    /* renamed from: d */
    public final TextView f86043d;

    /* renamed from: e */
    public final ImageView f86044e;

    public C42385hs6(ConstraintLayout constraintLayout, ImageView imageView, FleetMarkerPin fleetMarkerPin, TextView textView, ImageView imageView2) {
        this.f86040a = constraintLayout;
        this.f86041b = imageView;
        this.f86042c = fleetMarkerPin;
        this.f86043d = textView;
        this.f86044e = imageView2;
    }

    /* renamed from: a */
    public static C42385hs6 m35679a(View view) {
        int i = C31680Ah4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C31680Ah4.pin;
            FleetMarkerPin fleetMarkerPin = (FleetMarkerPin) C34328Lp6.m96312a(view, i);
            if (fleetMarkerPin != null) {
                i = C31680Ah4.timer;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C31680Ah4.timerBackground;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        return new C42385hs6((ConstraintLayout) view, imageView, fleetMarkerPin, textView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C42385hs6 m35677c(LayoutInflater layoutInflater) {
        return m35676d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C42385hs6 m35676d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_fleet_marker_timer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m35679a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f86040a;
    }
}
