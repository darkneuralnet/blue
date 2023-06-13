package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FleetMarkerPillPin;
/* renamed from: os6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46536os6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f102689a;

    /* renamed from: b */
    public final ImageView f102690b;

    /* renamed from: c */
    public final TextView f102691c;

    /* renamed from: d */
    public final FleetMarkerPillPin f102692d;

    public C46536os6(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, FleetMarkerPillPin fleetMarkerPillPin) {
        this.f102689a = constraintLayout;
        this.f102690b = imageView;
        this.f102691c = textView;
        this.f102692d = fleetMarkerPillPin;
    }

    /* renamed from: a */
    public static C46536os6 m20377a(View view) {
        int i = C31680Ah4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C31680Ah4.label;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C31680Ah4.pin;
                FleetMarkerPillPin fleetMarkerPillPin = (FleetMarkerPillPin) C34328Lp6.m96312a(view, i);
                if (fleetMarkerPillPin != null) {
                    return new C46536os6((ConstraintLayout) view, imageView, textView, fleetMarkerPillPin);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C46536os6 m20375c(LayoutInflater layoutInflater) {
        return m20374d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C46536os6 m20374d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_task_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20377a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f102689a;
    }
}
