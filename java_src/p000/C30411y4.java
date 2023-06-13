package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.drawerlayout.widget.DrawerLayout;
import co.bird.android.widget.PermissionStatusView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;
/* renamed from: y4 */
/* loaded from: classes2.dex */
public final class C30411y4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final DrawerLayout f118675a;

    /* renamed from: b */
    public final AppBarLayout f118676b;

    /* renamed from: c */
    public final PermissionStatusView f118677c;

    /* renamed from: d */
    public final PermissionStatusView f118678d;

    /* renamed from: e */
    public final DrawerLayout f118679e;

    /* renamed from: f */
    public final PermissionStatusView f118680f;

    /* renamed from: g */
    public final Guideline f118681g;

    /* renamed from: h */
    public final NavigationView f118682h;

    /* renamed from: i */
    public final PermissionStatusView f118683i;

    /* renamed from: j */
    public final ConstraintLayout f118684j;

    /* renamed from: k */
    public final TextView f118685k;

    /* renamed from: l */
    public final TextView f118686l;

    /* renamed from: m */
    public final Toolbar f118687m;

    public C30411y4(DrawerLayout drawerLayout, AppBarLayout appBarLayout, PermissionStatusView permissionStatusView, PermissionStatusView permissionStatusView2, DrawerLayout drawerLayout2, PermissionStatusView permissionStatusView3, Guideline guideline, NavigationView navigationView, PermissionStatusView permissionStatusView4, ConstraintLayout constraintLayout, TextView textView, TextView textView2, Toolbar toolbar) {
        this.f118675a = drawerLayout;
        this.f118676b = appBarLayout;
        this.f118677c = permissionStatusView;
        this.f118678d = permissionStatusView2;
        this.f118679e = drawerLayout2;
        this.f118680f = permissionStatusView3;
        this.f118681g = guideline;
        this.f118682h = navigationView;
        this.f118683i = permissionStatusView4;
        this.f118684j = constraintLayout;
        this.f118685k = textView;
        this.f118686l = textView2;
        this.f118687m = toolbar;
    }

    /* renamed from: a */
    public static C30411y4 m4210a(View view) {
        int i = C36585Vg4.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
        if (appBarLayout != null) {
            i = C36585Vg4.bluetoothPermissionStatus;
            PermissionStatusView permissionStatusView = (PermissionStatusView) C34328Lp6.m96312a(view, i);
            if (permissionStatusView != null) {
                i = C36585Vg4.cameraPermissionStatus;
                PermissionStatusView permissionStatusView2 = (PermissionStatusView) C34328Lp6.m96312a(view, i);
                if (permissionStatusView2 != null) {
                    DrawerLayout drawerLayout = (DrawerLayout) view;
                    i = C36585Vg4.locationPermissionStatus;
                    PermissionStatusView permissionStatusView3 = (PermissionStatusView) C34328Lp6.m96312a(view, i);
                    if (permissionStatusView3 != null) {
                        i = C36585Vg4.middle_guideline;
                        Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
                        if (guideline != null) {
                            i = C36585Vg4.navigationView;
                            NavigationView navigationView = (NavigationView) C34328Lp6.m96312a(view, i);
                            if (navigationView != null) {
                                i = C36585Vg4.notificationPermissionStatus;
                                PermissionStatusView permissionStatusView4 = (PermissionStatusView) C34328Lp6.m96312a(view, i);
                                if (permissionStatusView4 != null) {
                                    i = C36585Vg4.permissionRequiredContentContainer;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                    if (constraintLayout != null) {
                                        i = C36585Vg4.permissionRequiredHeader;
                                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView != null) {
                                            i = C36585Vg4.permissionRequiredSubheader;
                                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView2 != null) {
                                                i = C36585Vg4.toolbar;
                                                Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                                if (toolbar != null) {
                                                    return new C30411y4(drawerLayout, appBarLayout, permissionStatusView, permissionStatusView2, drawerLayout, permissionStatusView3, guideline, navigationView, permissionStatusView4, constraintLayout, textView, textView2, toolbar);
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
    public static C30411y4 m4208c(LayoutInflater layoutInflater) {
        return m4207d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30411y4 m4207d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_operator_permissions_required, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m4210a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public DrawerLayout getRoot() {
        return this.f118675a;
    }
}
