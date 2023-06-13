package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FleetMarkerPin;
/* renamed from: PT3 */
/* loaded from: classes3.dex */
public final class PT3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f28550a;

    /* renamed from: b */
    public final ImageView f28551b;

    /* renamed from: c */
    public final FleetMarkerPin f28552c;

    public PT3(ConstraintLayout constraintLayout, ImageView imageView, FleetMarkerPin fleetMarkerPin) {
        this.f28550a = constraintLayout;
        this.f28551b = imageView;
        this.f28552c = fleetMarkerPin;
    }

    /* renamed from: a */
    public static PT3 m90206a(View view) {
        int i = C32850Fh4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C32850Fh4.pin;
            FleetMarkerPin fleetMarkerPin = (FleetMarkerPin) C34328Lp6.m96312a(view, i);
            if (fleetMarkerPin != null) {
                return new PT3((ConstraintLayout) view, imageView, fleetMarkerPin);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static PT3 m90204c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48815sj4.pin_square, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90206a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f28550a;
    }
}
