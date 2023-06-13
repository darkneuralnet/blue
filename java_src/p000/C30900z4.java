package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import com.google.android.gms.maps.MapView;
/* renamed from: z4 */
/* loaded from: classes3.dex */
public final class C30900z4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ScrollView f120717a;

    /* renamed from: b */
    public final Barrier f120718b;

    /* renamed from: c */
    public final ImageView f120719c;

    /* renamed from: d */
    public final TextView f120720d;

    /* renamed from: e */
    public final TextView f120721e;

    /* renamed from: f */
    public final Barrier f120722f;

    /* renamed from: g */
    public final ImageView f120723g;

    /* renamed from: h */
    public final TextView f120724h;

    /* renamed from: i */
    public final TextView f120725i;

    /* renamed from: j */
    public final TextView f120726j;

    /* renamed from: k */
    public final ImageView f120727k;

    /* renamed from: l */
    public final MapView f120728l;

    /* renamed from: m */
    public final RatingBar f120729m;

    /* renamed from: n */
    public final Barrier f120730n;

    /* renamed from: o */
    public final ImageView f120731o;

    /* renamed from: p */
    public final TextView f120732p;

    /* renamed from: q */
    public final TextView f120733q;

    public C30900z4(ScrollView scrollView, Barrier barrier, ImageView imageView, TextView textView, TextView textView2, Barrier barrier2, ImageView imageView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView3, MapView mapView, RatingBar ratingBar, Barrier barrier3, ImageView imageView4, TextView textView6, TextView textView7) {
        this.f120717a = scrollView;
        this.f120718b = barrier;
        this.f120719c = imageView;
        this.f120720d = textView;
        this.f120721e = textView2;
        this.f120722f = barrier2;
        this.f120723g = imageView2;
        this.f120724h = textView3;
        this.f120725i = textView4;
        this.f120726j = textView5;
        this.f120727k = imageView3;
        this.f120728l = mapView;
        this.f120729m = ratingBar;
        this.f120730n = barrier3;
        this.f120731o = imageView4;
        this.f120732p = textView6;
        this.f120733q = textView7;
    }

    /* renamed from: a */
    public static C30900z4 m1858a(View view) {
        int i = C33552Ih4.distanceBarrier;
        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
        if (barrier != null) {
            i = C33552Ih4.distanceIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C33552Ih4.distanceLabel;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C33552Ih4.distanceText;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C33552Ih4.durationBarrier;
                        Barrier barrier2 = (Barrier) C34328Lp6.m96312a(view, i);
                        if (barrier2 != null) {
                            i = C33552Ih4.durationIcon;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C33552Ih4.durationLabel;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    i = C33552Ih4.durationText;
                                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView4 != null) {
                                        i = C33552Ih4.endRideLabel;
                                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView5 != null) {
                                            i = C33552Ih4.endRidePhoto;
                                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView3 != null) {
                                                i = C33552Ih4.mapView;
                                                MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                                                if (mapView != null) {
                                                    i = C33552Ih4.ratingBar;
                                                    RatingBar ratingBar = (RatingBar) C34328Lp6.m96312a(view, i);
                                                    if (ratingBar != null) {
                                                        i = C33552Ih4.ratingBarrier;
                                                        Barrier barrier3 = (Barrier) C34328Lp6.m96312a(view, i);
                                                        if (barrier3 != null) {
                                                            i = C33552Ih4.ratingIcon;
                                                            ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                                            if (imageView4 != null) {
                                                                i = C33552Ih4.ratingLabel;
                                                                TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView6 != null) {
                                                                    i = C33552Ih4.title;
                                                                    TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                                    if (textView7 != null) {
                                                                        return new C30900z4((ScrollView) view, barrier, imageView, textView, textView2, barrier2, imageView2, textView3, textView4, textView5, imageView3, mapView, ratingBar, barrier3, imageView4, textView6, textView7);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static C30900z4 m1856c(LayoutInflater layoutInflater) {
        return m1855d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30900z4 m1855d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C50593vj4.activity_operator_ride_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m1858a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f120717a;
    }
}
