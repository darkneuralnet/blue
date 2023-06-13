package p000;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet;
import co.bird.android.widget.ActionView;
import co.bird.android.widget.ControlButton;
import co.bird.android.widget.NonRiderFlightView;
import co.bird.android.widget.PillButton;
import co.bird.android.widget.SingleBannerFlightView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.guness.widget.NavigationView;
/* renamed from: F5 */
/* loaded from: classes2.dex */
public final class C2136F5 implements InterfaceC34094Kp6 {

    /* renamed from: A */
    public final Space f8658A;

    /* renamed from: B */
    public final ImageView f8659B;

    /* renamed from: C */
    public final C33653Is6 f8660C;

    /* renamed from: D */
    public final ControlButton f8661D;

    /* renamed from: E */
    public final RideStatusBottomSheet f8662E;

    /* renamed from: F */
    public final LinearProgressIndicator f8663F;

    /* renamed from: G */
    public final ImageView f8664G;

    /* renamed from: H */
    public final SingleBannerFlightView f8665H;

    /* renamed from: I */
    public final Toolbar f8666I;

    /* renamed from: J */
    public final ActionView f8667J;

    /* renamed from: K */
    public final ActionView f8668K;

    /* renamed from: a */
    public final DrawerLayout f8669a;

    /* renamed from: b */
    public final ImageView f8670b;

    /* renamed from: c */
    public final ActionView f8671c;

    /* renamed from: d */
    public final AppCompatTextView f8672d;

    /* renamed from: e */
    public final LinearLayout f8673e;

    /* renamed from: f */
    public final ViewStub f8674f;

    /* renamed from: g */
    public final ImageView f8675g;

    /* renamed from: h */
    public final ConstraintLayout f8676h;

    /* renamed from: i */
    public final ImageView f8677i;

    /* renamed from: j */
    public final CoordinatorLayout f8678j;

    /* renamed from: k */
    public final ImageView f8679k;

    /* renamed from: l */
    public final C35741Rq6 f8680l;

    /* renamed from: m */
    public final DrawerLayout f8681m;

    /* renamed from: n */
    public final NonRiderFlightView f8682n;

    /* renamed from: o */
    public final ViewStub f8683o;

    /* renamed from: p */
    public final ImageView f8684p;

    /* renamed from: q */
    public final AppCompatButton f8685q;

    /* renamed from: r */
    public final TextView f8686r;

    /* renamed from: s */
    public final MapView f8687s;

    /* renamed from: t */
    public final ImageView f8688t;

    /* renamed from: u */
    public final NavigationView f8689u;

    /* renamed from: v */
    public final PillButton f8690v;

    /* renamed from: w */
    public final TextView f8691w;

    /* renamed from: x */
    public final TextView f8692x;

    /* renamed from: y */
    public final ImageView f8693y;

    /* renamed from: z */
    public final Space f8694z;

    public C2136F5(DrawerLayout drawerLayout, ImageView imageView, ActionView actionView, AppCompatTextView appCompatTextView, LinearLayout linearLayout, ViewStub viewStub, ImageView imageView2, ConstraintLayout constraintLayout, ImageView imageView3, CoordinatorLayout coordinatorLayout, ImageView imageView4, C35741Rq6 c35741Rq6, DrawerLayout drawerLayout2, NonRiderFlightView nonRiderFlightView, ViewStub viewStub2, ImageView imageView5, AppCompatButton appCompatButton, TextView textView, MapView mapView, ImageView imageView6, NavigationView navigationView, PillButton pillButton, TextView textView2, TextView textView3, ImageView imageView7, Space space, Space space2, ImageView imageView8, C33653Is6 c33653Is6, ControlButton controlButton, RideStatusBottomSheet rideStatusBottomSheet, LinearProgressIndicator linearProgressIndicator, ImageView imageView9, SingleBannerFlightView singleBannerFlightView, Toolbar toolbar, ActionView actionView2, ActionView actionView3) {
        this.f8669a = drawerLayout;
        this.f8670b = imageView;
        this.f8671c = actionView;
        this.f8672d = appCompatTextView;
        this.f8673e = linearLayout;
        this.f8674f = viewStub;
        this.f8675g = imageView2;
        this.f8676h = constraintLayout;
        this.f8677i = imageView3;
        this.f8678j = coordinatorLayout;
        this.f8679k = imageView4;
        this.f8680l = c35741Rq6;
        this.f8681m = drawerLayout2;
        this.f8682n = nonRiderFlightView;
        this.f8683o = viewStub2;
        this.f8684p = imageView5;
        this.f8685q = appCompatButton;
        this.f8686r = textView;
        this.f8687s = mapView;
        this.f8688t = imageView6;
        this.f8689u = navigationView;
        this.f8690v = pillButton;
        this.f8691w = textView2;
        this.f8692x = textView3;
        this.f8693y = imageView7;
        this.f8694z = space;
        this.f8658A = space2;
        this.f8659B = imageView8;
        this.f8660C = c33653Is6;
        this.f8661D = controlButton;
        this.f8662E = rideStatusBottomSheet;
        this.f8663F = linearProgressIndicator;
        this.f8664G = imageView9;
        this.f8665H = singleBannerFlightView;
        this.f8666I = toolbar;
        this.f8667J = actionView2;
        this.f8668K = actionView3;
    }

    /* renamed from: a */
    public static C2136F5 m107809a(View view) {
        View m96312a;
        View m96312a2;
        int i = C36585Vg4.actionBarLogo;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C36585Vg4.addDestination;
            ActionView actionView = (ActionView) C34328Lp6.m96312a(view, i);
            if (actionView != null) {
                i = C36585Vg4.addRidePill;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                if (appCompatTextView != null) {
                    i = C36585Vg4.additionalCallToActions;
                    LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                    if (linearLayout != null) {
                        i = C36585Vg4.alertContainerStub;
                        ViewStub viewStub = (ViewStub) C34328Lp6.m96312a(view, i);
                        if (viewStub != null) {
                            i = C36585Vg4.blueDot;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C36585Vg4.buttonContainer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                if (constraintLayout != null) {
                                    i = C36585Vg4.communityModeButton;
                                    ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView3 != null) {
                                        i = C36585Vg4.contentView;
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C34328Lp6.m96312a(view, i);
                                        if (coordinatorLayout != null) {
                                            i = C36585Vg4.destination_selection_pin;
                                            ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView4 != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.destinationSelectionView))) != null) {
                                                C35741Rq6 m86273a = C35741Rq6.m86273a(m96312a);
                                                DrawerLayout drawerLayout = (DrawerLayout) view;
                                                i = C36585Vg4.flightView;
                                                NonRiderFlightView nonRiderFlightView = (NonRiderFlightView) C34328Lp6.m96312a(view, i);
                                                if (nonRiderFlightView != null) {
                                                    i = C36585Vg4.frequentFlyerStatusStub;
                                                    ViewStub viewStub2 = (ViewStub) C34328Lp6.m96312a(view, i);
                                                    if (viewStub2 != null) {
                                                        i = C36585Vg4.gift;
                                                        ImageView imageView5 = (ImageView) C34328Lp6.m96312a(view, i);
                                                        if (imageView5 != null) {
                                                            i = C36585Vg4.groupRides;
                                                            AppCompatButton appCompatButton = (AppCompatButton) C34328Lp6.m96312a(view, i);
                                                            if (appCompatButton != null) {
                                                                i = C36585Vg4.locationDebugText;
                                                                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView != null) {
                                                                    i = C36585Vg4.mapView;
                                                                    MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                                                                    if (mapView != null) {
                                                                        i = C36585Vg4.myLocationButton;
                                                                        ImageView imageView6 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                        if (imageView6 != null) {
                                                                            i = C36585Vg4.navigationView;
                                                                            NavigationView navigationView = (NavigationView) C34328Lp6.m96312a(view, i);
                                                                            if (navigationView != null) {
                                                                                i = C36585Vg4.onDemandButton;
                                                                                PillButton pillButton = (PillButton) C34328Lp6.m96312a(view, i);
                                                                                if (pillButton != null) {
                                                                                    i = C36585Vg4.parkingAnnoucementPill;
                                                                                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                    if (textView2 != null) {
                                                                                        i = C36585Vg4.parkingPill;
                                                                                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                        if (textView3 != null) {
                                                                                            i = C36585Vg4.physicalLockButton;
                                                                                            ImageView imageView7 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                            if (imageView7 != null) {
                                                                                                i = C36585Vg4.pillBarrierLeft;
                                                                                                Space space = (Space) C34328Lp6.m96312a(view, i);
                                                                                                if (space != null) {
                                                                                                    i = C36585Vg4.pillBarrierRight;
                                                                                                    Space space2 = (Space) C34328Lp6.m96312a(view, i);
                                                                                                    if (space2 != null) {
                                                                                                        i = C36585Vg4.privateBirdButton;
                                                                                                        ImageView imageView8 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                                        if (imageView8 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C36585Vg4.privateBirdFlightView))) != null) {
                                                                                                            C33653Is6 m101571a = C33653Is6.m101571a(m96312a2);
                                                                                                            i = C36585Vg4.rideButton;
                                                                                                            ControlButton controlButton = (ControlButton) C34328Lp6.m96312a(view, i);
                                                                                                            if (controlButton != null) {
                                                                                                                i = C36585Vg4.rideStatusBottomSheet;
                                                                                                                RideStatusBottomSheet rideStatusBottomSheet = (RideStatusBottomSheet) C34328Lp6.m96312a(view, i);
                                                                                                                if (rideStatusBottomSheet != null) {
                                                                                                                    i = C36585Vg4.secondaryProgressBar;
                                                                                                                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                                                                                    if (linearProgressIndicator != null) {
                                                                                                                        i = C36585Vg4.selectDestinationButton;
                                                                                                                        ImageView imageView9 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                                                        if (imageView9 != null) {
                                                                                                                            i = C36585Vg4.singleBannerFlightView;
                                                                                                                            SingleBannerFlightView singleBannerFlightView = (SingleBannerFlightView) C34328Lp6.m96312a(view, i);
                                                                                                                            if (singleBannerFlightView != null) {
                                                                                                                                i = C36585Vg4.toolbar;
                                                                                                                                Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                                                                                                                if (toolbar != null) {
                                                                                                                                    i = C36585Vg4.turnOnLocation;
                                                                                                                                    ActionView actionView2 = (ActionView) C34328Lp6.m96312a(view, i);
                                                                                                                                    if (actionView2 != null) {
                                                                                                                                        i = C36585Vg4.turnOnLocationPermission;
                                                                                                                                        ActionView actionView3 = (ActionView) C34328Lp6.m96312a(view, i);
                                                                                                                                        if (actionView3 != null) {
                                                                                                                                            return new C2136F5(drawerLayout, imageView, actionView, appCompatTextView, linearLayout, viewStub, imageView2, constraintLayout, imageView3, coordinatorLayout, imageView4, m86273a, drawerLayout, nonRiderFlightView, viewStub2, imageView5, appCompatButton, textView, mapView, imageView6, navigationView, pillButton, textView2, textView3, imageView7, space, space2, imageView8, m101571a, controlButton, rideStatusBottomSheet, linearProgressIndicator, imageView9, singleBannerFlightView, toolbar, actionView2, actionView3);
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
    public DrawerLayout getRoot() {
        return this.f8669a;
    }
}
