package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FleetMarkerPin;
/* renamed from: QT3 */
/* loaded from: classes3.dex */
public final class QT3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f30424a;

    /* renamed from: b */
    public final ImageView f30425b;

    /* renamed from: c */
    public final FleetMarkerPin f30426c;

    public QT3(ConstraintLayout constraintLayout, ImageView imageView, FleetMarkerPin fleetMarkerPin) {
        this.f30424a = constraintLayout;
        this.f30425b = imageView;
        this.f30426c = fleetMarkerPin;
    }

    /* renamed from: a */
    public static QT3 m88481a(View view) {
        int i = C32850Fh4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C32850Fh4.pin;
            FleetMarkerPin fleetMarkerPin = (FleetMarkerPin) C34328Lp6.m96312a(view, i);
            if (fleetMarkerPin != null) {
                return new QT3((ConstraintLayout) view, imageView, fleetMarkerPin);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static QT3 m88479c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48815sj4.pin_teardrop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88481a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f30424a;
    }
}
