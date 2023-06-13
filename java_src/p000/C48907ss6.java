package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.ZoneMarkerPin;
/* renamed from: ss6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48907ss6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f109436a;

    /* renamed from: b */
    public final TextView f109437b;

    /* renamed from: c */
    public final ImageView f109438c;

    /* renamed from: d */
    public final ZoneMarkerPin f109439d;

    public C48907ss6(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ZoneMarkerPin zoneMarkerPin) {
        this.f109436a = constraintLayout;
        this.f109437b = textView;
        this.f109438c = imageView;
        this.f109439d = zoneMarkerPin;
    }

    /* renamed from: a */
    public static C48907ss6 m13559a(View view) {
        int i = C31680Ah4.capacity;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C31680Ah4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C31680Ah4.pin;
                ZoneMarkerPin zoneMarkerPin = (ZoneMarkerPin) C34328Lp6.m96312a(view, i);
                if (zoneMarkerPin != null) {
                    return new C48907ss6((ConstraintLayout) view, textView, imageView, zoneMarkerPin);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C48907ss6 m13557c(LayoutInflater layoutInflater) {
        return m13556d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C48907ss6 m13556d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_zone_marker_selected, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m13559a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f109436a;
    }
}
