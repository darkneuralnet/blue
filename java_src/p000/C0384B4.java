package p000;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.MapView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: B4 */
/* loaded from: classes2.dex */
public final class C0384B4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f1590a;

    /* renamed from: b */
    public final AppBarLayout f1591b;

    /* renamed from: c */
    public final TextView f1592c;

    /* renamed from: d */
    public final TextView f1593d;

    /* renamed from: e */
    public final CardView f1594e;

    /* renamed from: f */
    public final ImageButton f1595f;

    /* renamed from: g */
    public final TextView f1596g;

    /* renamed from: h */
    public final TextView f1597h;

    /* renamed from: i */
    public final TextView f1598i;

    /* renamed from: j */
    public final LinearLayout f1599j;

    /* renamed from: k */
    public final LinearLayout f1600k;

    /* renamed from: l */
    public final TextView f1601l;

    /* renamed from: m */
    public final TextView f1602m;

    /* renamed from: n */
    public final TextView f1603n;

    /* renamed from: o */
    public final TextView f1604o;

    /* renamed from: p */
    public final MapView f1605p;

    /* renamed from: q */
    public final ImageButton f1606q;

    /* renamed from: r */
    public final TextView f1607r;

    /* renamed from: s */
    public final CoordinatorLayout f1608s;

    /* renamed from: t */
    public final LinearProgressIndicator f1609t;

    /* renamed from: u */
    public final ImageView f1610u;

    /* renamed from: v */
    public final TextView f1611v;

    /* renamed from: w */
    public final TextView f1612w;

    /* renamed from: x */
    public final Toolbar f1613x;

    public C0384B4(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, TextView textView, TextView textView2, CardView cardView, ImageButton imageButton, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView6, TextView textView7, TextView textView8, TextView textView9, MapView mapView, ImageButton imageButton2, TextView textView10, CoordinatorLayout coordinatorLayout2, LinearProgressIndicator linearProgressIndicator, ImageView imageView, TextView textView11, TextView textView12, Toolbar toolbar) {
        this.f1590a = coordinatorLayout;
        this.f1591b = appBarLayout;
        this.f1592c = textView;
        this.f1593d = textView2;
        this.f1594e = cardView;
        this.f1595f = imageButton;
        this.f1596g = textView3;
        this.f1597h = textView4;
        this.f1598i = textView5;
        this.f1599j = linearLayout;
        this.f1600k = linearLayout2;
        this.f1601l = textView6;
        this.f1602m = textView7;
        this.f1603n = textView8;
        this.f1604o = textView9;
        this.f1605p = mapView;
        this.f1606q = imageButton2;
        this.f1607r = textView10;
        this.f1608s = coordinatorLayout2;
        this.f1609t = linearProgressIndicator;
        this.f1610u = imageView;
        this.f1611v = textView11;
        this.f1612w = textView12;
        this.f1613x = toolbar;
    }

    /* renamed from: a */
    public static C0384B4 m114758a(View view) {
        int i = C36585Vg4.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
        if (appBarLayout != null) {
            i = C36585Vg4.battery;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.batteryLabel;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C36585Vg4.birdFinderView;
                    CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
                    if (cardView != null) {
                        i = C36585Vg4.chirpButton;
                        ImageButton imageButton = (ImageButton) C34328Lp6.m96312a(view, i);
                        if (imageButton != null) {
                            i = C36585Vg4.code;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C36585Vg4.codeLabel;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C36585Vg4.connectionStatus;
                                    TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView5 != null) {
                                        i = C36585Vg4.connectionStatusLayout;
                                        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                                        if (linearLayout != null) {
                                            i = C36585Vg4.infoBanner;
                                            LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                            if (linearLayout2 != null) {
                                                i = C36585Vg4.infoBannerBody;
                                                TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView6 != null) {
                                                    i = C36585Vg4.infoBannerTitle;
                                                    TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView7 != null) {
                                                        i = C36585Vg4.lastSignal;
                                                        TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView8 != null) {
                                                            i = C36585Vg4.lastSignalLabel;
                                                            TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView9 != null) {
                                                                i = C36585Vg4.mapView;
                                                                MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                                                                if (mapView != null) {
                                                                    i = C36585Vg4.myLocationButton;
                                                                    ImageButton imageButton2 = (ImageButton) C34328Lp6.m96312a(view, i);
                                                                    if (imageButton2 != null) {
                                                                        i = C36585Vg4.noOtherLocationWarning;
                                                                        TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView10 != null) {
                                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                                                            i = C36585Vg4.progressBar;
                                                                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                                            if (linearProgressIndicator != null) {
                                                                                i = C36585Vg4.signalStrength;
                                                                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                if (imageView != null) {
                                                                                    i = C36585Vg4.signalStrengthLabel;
                                                                                    TextView textView11 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                    if (textView11 != null) {
                                                                                        i = C36585Vg4.signalStrengthPercentage;
                                                                                        TextView textView12 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                        if (textView12 != null) {
                                                                                            i = C36585Vg4.toolbar;
                                                                                            Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                                                                            if (toolbar != null) {
                                                                                                return new C0384B4(coordinatorLayout, appBarLayout, textView, textView2, cardView, imageButton, textView3, textView4, textView5, linearLayout, linearLayout2, textView6, textView7, textView8, textView9, mapView, imageButton2, textView10, coordinatorLayout, linearProgressIndicator, imageView, textView11, textView12, toolbar);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f1590a;
    }
}
