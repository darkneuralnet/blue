package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.feature.p010ar.resolution.ScanResolutionView;
import co.bird.android.feature.p010ar.view.VpsView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: t6 */
/* loaded from: classes3.dex */
public final class C28523t6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f109848a;

    /* renamed from: b */
    public final ImageView f109849b;

    /* renamed from: c */
    public final TextView f109850c;

    /* renamed from: d */
    public final ImageView f109851d;

    /* renamed from: e */
    public final ScanResolutionView f109852e;

    /* renamed from: f */
    public final MapView f109853f;

    /* renamed from: g */
    public final ImageView f109854g;

    /* renamed from: h */
    public final LinearProgressIndicator f109855h;

    /* renamed from: i */
    public final ImageView f109856i;

    /* renamed from: j */
    public final VpsView f109857j;

    public C28523t6(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, ScanResolutionView scanResolutionView, MapView mapView, ImageView imageView3, LinearProgressIndicator linearProgressIndicator, ImageView imageView4, VpsView vpsView) {
        this.f109848a = constraintLayout;
        this.f109849b = imageView;
        this.f109850c = textView;
        this.f109851d = imageView2;
        this.f109852e = scanResolutionView;
        this.f109853f = mapView;
        this.f109854g = imageView3;
        this.f109855h = linearProgressIndicator;
        this.f109856i = imageView4;
        this.f109857j = vpsView;
    }

    /* renamed from: a */
    public static C28523t6 m13082a(View view) {
        int i = C37521Zg4.buildingsOverlay;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C37521Zg4.debug;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C37521Zg4.inside;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    i = C37521Zg4.instructions;
                    ScanResolutionView scanResolutionView = (ScanResolutionView) C34328Lp6.m96312a(view, i);
                    if (scanResolutionView != null) {
                        i = C37521Zg4.mapView;
                        MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                        if (mapView != null) {
                            i = C37521Zg4.outside;
                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView3 != null) {
                                i = C37521Zg4.progressBar;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                if (linearProgressIndicator != null) {
                                    i = C37521Zg4.qrCodeOverlay;
                                    ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView4 != null) {
                                        i = C37521Zg4.vpsView;
                                        VpsView vpsView = (VpsView) C34328Lp6.m96312a(view, i);
                                        if (vpsView != null) {
                                            return new C28523t6((ConstraintLayout) view, imageView, textView, imageView2, scanResolutionView, mapView, imageView3, linearProgressIndicator, imageView4, vpsView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C28523t6 m13080c(LayoutInflater layoutInflater) {
        return m13079d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C28523t6 m13079d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36378Uj4.activity_vps_resolve, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m13082a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f109848a;
    }
}
