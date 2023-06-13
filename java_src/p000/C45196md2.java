package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.MapView;
/* renamed from: md2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45196md2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f98447a;

    /* renamed from: b */
    public final TextView f98448b;

    /* renamed from: c */
    public final ImageView f98449c;

    /* renamed from: d */
    public final TextView f98450d;

    /* renamed from: e */
    public final MapView f98451e;

    public C45196md2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, MapView mapView) {
        this.f98447a = constraintLayout;
        this.f98448b = textView;
        this.f98449c = imageView;
        this.f98450d = textView2;
        this.f98451e = mapView;
    }

    /* renamed from: a */
    public static C45196md2 m25307a(View view) {
        int i = C34722Nh4.details;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34722Nh4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C34722Nh4.label;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C34722Nh4.mapView;
                    MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                    if (mapView != null) {
                        return new C45196md2((ConstraintLayout) view, textView, imageView, textView2, mapView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f98447a;
    }
}
