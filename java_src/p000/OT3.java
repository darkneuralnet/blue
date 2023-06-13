package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FleetMarkerPin;
/* renamed from: OT3 */
/* loaded from: classes3.dex */
public final class OT3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f26622a;

    /* renamed from: b */
    public final ImageView f26623b;

    /* renamed from: c */
    public final FleetMarkerPin f26624c;

    public OT3(ConstraintLayout constraintLayout, ImageView imageView, FleetMarkerPin fleetMarkerPin) {
        this.f26622a = constraintLayout;
        this.f26623b = imageView;
        this.f26624c = fleetMarkerPin;
    }

    /* renamed from: a */
    public static OT3 m92245a(View view) {
        int i = C32850Fh4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C32850Fh4.pin;
            FleetMarkerPin fleetMarkerPin = (FleetMarkerPin) C34328Lp6.m96312a(view, i);
            if (fleetMarkerPin != null) {
                return new OT3((ConstraintLayout) view, imageView, fleetMarkerPin);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static OT3 m92243c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48815sj4.pin_circle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92245a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f26622a;
    }
}
