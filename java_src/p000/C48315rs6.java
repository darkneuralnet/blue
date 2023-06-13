package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.ZoneMarkerPin;
/* renamed from: rs6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48315rs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f107812a;

    /* renamed from: b */
    public final TextView f107813b;

    /* renamed from: c */
    public final ImageView f107814c;

    /* renamed from: d */
    public final ZoneMarkerPin f107815d;

    public C48315rs6(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ZoneMarkerPin zoneMarkerPin) {
        this.f107812a = constraintLayout;
        this.f107813b = textView;
        this.f107814c = imageView;
        this.f107815d = zoneMarkerPin;
    }

    /* renamed from: a */
    public static C48315rs6 m15145a(View view) {
        int i = C31680Ah4.capacity;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C31680Ah4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C31680Ah4.pin;
                ZoneMarkerPin zoneMarkerPin = (ZoneMarkerPin) C34328Lp6.m96312a(view, i);
                if (zoneMarkerPin != null) {
                    return new C48315rs6((ConstraintLayout) view, textView, imageView, zoneMarkerPin);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C48315rs6 m15143c(LayoutInflater layoutInflater) {
        return m15142d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C48315rs6 m15142d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_zone_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m15145a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f107812a;
    }
}
