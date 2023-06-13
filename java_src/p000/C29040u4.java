package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet;
import co.bird.android.widget.NonRiderFlightView;
import co.bird.android.widget.OperatorMapFilterButtonView;
import co.bird.android.widget.ParkingNestView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.guness.widget.NavigationView;
/* renamed from: u4 */
/* loaded from: classes2.dex */
public final class C29040u4 implements InterfaceC34094Kp6 {

    /* renamed from: A */
    public final Group f111638A;

    /* renamed from: B */
    public final ConstraintLayout f111639B;

    /* renamed from: C */
    public final Button f111640C;

    /* renamed from: D */
    public final TabLayout f111641D;

    /* renamed from: E */
    public final Toolbar f111642E;

    /* renamed from: F */
    public final Button f111643F;

    /* renamed from: a */
    public final DrawerLayout f111644a;

    /* renamed from: b */
    public final Button f111645b;

    /* renamed from: c */
    public final AppBarLayout f111646c;

    /* renamed from: d */
    public final OperatorMapBottomSheet f111647d;

    /* renamed from: e */
    public final Group f111648e;

    /* renamed from: f */
    public final Button f111649f;

    /* renamed from: g */
    public final Button f111650g;

    /* renamed from: h */
    public final Button f111651h;

    /* renamed from: i */
    public final CoordinatorLayout f111652i;

    /* renamed from: j */
    public final ImageButton f111653j;

    /* renamed from: k */
    public final DrawerLayout f111654k;

    /* renamed from: l */
    public final ImageView f111655l;

    /* renamed from: m */
    public final OperatorMapFilterButtonView f111656m;

    /* renamed from: n */
    public final NonRiderFlightView f111657n;

    /* renamed from: o */
    public final TextView f111658o;

    /* renamed from: p */
    public final ConstraintLayout f111659p;

    /* renamed from: q */
    public final MapView f111660q;

    /* renamed from: r */
    public final ImageButton f111661r;

    /* renamed from: s */
    public final NavigationView f111662s;

    /* renamed from: t */
    public final Group f111663t;

    /* renamed from: u */
    public final Button f111664u;

    /* renamed from: v */
    public final Button f111665v;

    /* renamed from: w */
    public final ParkingNestView f111666w;

    /* renamed from: x */
    public final LinearProgressIndicator f111667x;

    /* renamed from: y */
    public final Button f111668y;

    /* renamed from: z */
    public final ImageView f111669z;

    public C29040u4(DrawerLayout drawerLayout, Button button, AppBarLayout appBarLayout, OperatorMapBottomSheet operatorMapBottomSheet, Group group, Button button2, Button button3, Button button4, CoordinatorLayout coordinatorLayout, ImageButton imageButton, DrawerLayout drawerLayout2, ImageView imageView, OperatorMapFilterButtonView operatorMapFilterButtonView, NonRiderFlightView nonRiderFlightView, TextView textView, ConstraintLayout constraintLayout, MapView mapView, ImageButton imageButton2, NavigationView navigationView, Group group2, Button button5, Button button6, ParkingNestView parkingNestView, LinearProgressIndicator linearProgressIndicator, Button button7, ImageView imageView2, Group group3, ConstraintLayout constraintLayout2, Button button8, TabLayout tabLayout, Toolbar toolbar, Button button9) {
        this.f111644a = drawerLayout;
        this.f111645b = button;
        this.f111646c = appBarLayout;
        this.f111647d = operatorMapBottomSheet;
        this.f111648e = group;
        this.f111649f = button2;
        this.f111650g = button3;
        this.f111651h = button4;
        this.f111652i = coordinatorLayout;
        this.f111653j = imageButton;
        this.f111654k = drawerLayout2;
        this.f111655l = imageView;
        this.f111656m = operatorMapFilterButtonView;
        this.f111657n = nonRiderFlightView;
        this.f111658o = textView;
        this.f111659p = constraintLayout;
        this.f111660q = mapView;
        this.f111661r = imageButton2;
        this.f111662s = navigationView;
        this.f111663t = group2;
        this.f111664u = button5;
        this.f111665v = button6;
        this.f111666w = parkingNestView;
        this.f111667x = linearProgressIndicator;
        this.f111668y = button7;
        this.f111669z = imageView2;
        this.f111638A = group3;
        this.f111639B = constraintLayout2;
        this.f111640C = button8;
        this.f111641D = tabLayout;
        this.f111642E = toolbar;
        this.f111643F = button9;
    }

    /* renamed from: a */
    public static C29040u4 m10920a(View view) {
        int i = C36585Vg4.acceptTaskButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.appBar;
            AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
            if (appBarLayout != null) {
                i = C36585Vg4.bottomSheet;
                OperatorMapBottomSheet operatorMapBottomSheet = (OperatorMapBottomSheet) C34328Lp6.m96312a(view, i);
                if (operatorMapBottomSheet != null) {
                    i = C36585Vg4.bountyButtonGroup;
                    Group group = (Group) C34328Lp6.m96312a(view, i);
                    if (group != null) {
                        i = C36585Vg4.bountyPrimary;
                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                        if (button2 != null) {
                            i = C36585Vg4.bountySecondary;
                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                            if (button3 != null) {
                                i = C36585Vg4.captureButton;
                                Button button4 = (Button) C34328Lp6.m96312a(view, i);
                                if (button4 != null) {
                                    i = C36585Vg4.coordinatorLayout;
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C34328Lp6.m96312a(view, i);
                                    if (coordinatorLayout != null) {
                                        i = C36585Vg4.directionsButton;
                                        ImageButton imageButton = (ImageButton) C34328Lp6.m96312a(view, i);
                                        if (imageButton != null) {
                                            DrawerLayout drawerLayout = (DrawerLayout) view;
                                            i = C36585Vg4.feeAreaButton;
                                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView != null) {
                                                i = C36585Vg4.filterButton;
                                                OperatorMapFilterButtonView operatorMapFilterButtonView = (OperatorMapFilterButtonView) C34328Lp6.m96312a(view, i);
                                                if (operatorMapFilterButtonView != null) {
                                                    i = C36585Vg4.flightView;
                                                    NonRiderFlightView nonRiderFlightView = (NonRiderFlightView) C34328Lp6.m96312a(view, i);
                                                    if (nonRiderFlightView != null) {
                                                        i = C36585Vg4.locationDebugText;
                                                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView != null) {
                                                            i = C36585Vg4.mapButtons;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                                            if (constraintLayout != null) {
                                                                i = C36585Vg4.mapView;
                                                                MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                                                                if (mapView != null) {
                                                                    i = C36585Vg4.myLocationButton;
                                                                    ImageButton imageButton2 = (ImageButton) C34328Lp6.m96312a(view, i);
                                                                    if (imageButton2 != null) {
                                                                        i = C36585Vg4.navigationView;
                                                                        NavigationView navigationView = (NavigationView) C34328Lp6.m96312a(view, i);
                                                                        if (navigationView != null) {
                                                                            i = C36585Vg4.nestButtonGroup;
                                                                            Group group2 = (Group) C34328Lp6.m96312a(view, i);
                                                                            if (group2 != null) {
                                                                                i = C36585Vg4.nestClaim;
                                                                                Button button5 = (Button) C34328Lp6.m96312a(view, i);
                                                                                if (button5 != null) {
                                                                                    i = C36585Vg4.nestRelease;
                                                                                    Button button6 = (Button) C34328Lp6.m96312a(view, i);
                                                                                    if (button6 != null) {
                                                                                        i = C36585Vg4.parkingNestView;
                                                                                        ParkingNestView parkingNestView = (ParkingNestView) C34328Lp6.m96312a(view, i);
                                                                                        if (parkingNestView != null) {
                                                                                            i = C36585Vg4.progressBar;
                                                                                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                                                            if (linearProgressIndicator != null) {
                                                                                                i = C36585Vg4.releaseButton;
                                                                                                Button button7 = (Button) C34328Lp6.m96312a(view, i);
                                                                                                if (button7 != null) {
                                                                                                    i = C36585Vg4.revenueMapButton;
                                                                                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                                    if (imageView2 != null) {
                                                                                                        i = C36585Vg4.scanButtonGroup;
                                                                                                        Group group3 = (Group) C34328Lp6.m96312a(view, i);
                                                                                                        if (group3 != null) {
                                                                                                            i = C36585Vg4.scanFrame;
                                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                                                                                            if (constraintLayout2 != null) {
                                                                                                                i = C36585Vg4.swapBatteryButton;
                                                                                                                Button button8 = (Button) C34328Lp6.m96312a(view, i);
                                                                                                                if (button8 != null) {
                                                                                                                    i = C36585Vg4.tabLayout;
                                                                                                                    TabLayout tabLayout = (TabLayout) C34328Lp6.m96312a(view, i);
                                                                                                                    if (tabLayout != null) {
                                                                                                                        i = C36585Vg4.toolbar;
                                                                                                                        Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                                                                                                        if (toolbar != null) {
                                                                                                                            i = C36585Vg4.warehouseRelease;
                                                                                                                            Button button9 = (Button) C34328Lp6.m96312a(view, i);
                                                                                                                            if (button9 != null) {
                                                                                                                                return new C29040u4(drawerLayout, button, appBarLayout, operatorMapBottomSheet, group, button2, button3, button4, coordinatorLayout, imageButton, drawerLayout, imageView, operatorMapFilterButtonView, nonRiderFlightView, textView, constraintLayout, mapView, imageButton2, navigationView, group2, button5, button6, parkingNestView, linearProgressIndicator, button7, imageView2, group3, constraintLayout2, button8, tabLayout, toolbar, button9);
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
        return this.f111644a;
    }
}
