package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.guness.widget.NavigationView;
/* renamed from: m4 */
/* loaded from: classes3.dex */
public final class C25902m4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final DrawerLayout f97258a;

    /* renamed from: b */
    public final TextView f97259b;

    /* renamed from: c */
    public final SwitchCompat f97260c;

    /* renamed from: d */
    public final DrawerLayout f97261d;

    /* renamed from: e */
    public final TextView f97262e;

    /* renamed from: f */
    public final Button f97263f;

    /* renamed from: g */
    public final SwitchCompat f97264g;

    /* renamed from: h */
    public final NavigationView f97265h;

    /* renamed from: i */
    public final Toolbar f97266i;

    public C25902m4(DrawerLayout drawerLayout, TextView textView, SwitchCompat switchCompat, DrawerLayout drawerLayout2, TextView textView2, Button button, SwitchCompat switchCompat2, NavigationView navigationView, Toolbar toolbar) {
        this.f97258a = drawerLayout;
        this.f97259b = textView;
        this.f97260c = switchCompat;
        this.f97261d = drawerLayout2;
        this.f97262e = textView2;
        this.f97263f = button;
        this.f97264g = switchCompat2;
        this.f97265h = navigationView;
        this.f97266i = toolbar;
    }

    /* renamed from: a */
    public static C25902m4 m26400a(View view) {
        int i = C31914Bh4.addressLabel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C31914Bh4.autoUpdateLocationSwitch;
            SwitchCompat switchCompat = (SwitchCompat) C34328Lp6.m96312a(view, i);
            if (switchCompat != null) {
                DrawerLayout drawerLayout = (DrawerLayout) view;
                i = C31914Bh4.merchantAddress;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C31914Bh4.merchantEditAddress;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        i = C31914Bh4.merchantOpenSwitch;
                        SwitchCompat switchCompat2 = (SwitchCompat) C34328Lp6.m96312a(view, i);
                        if (switchCompat2 != null) {
                            i = C31914Bh4.navigationView;
                            NavigationView navigationView = (NavigationView) C34328Lp6.m96312a(view, i);
                            if (navigationView != null) {
                                i = C31914Bh4.toolbar;
                                Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                if (toolbar != null) {
                                    return new C25902m4(drawerLayout, textView, switchCompat, drawerLayout, textView2, button, switchCompat2, navigationView, toolbar);
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
    public static C25902m4 m26398c(LayoutInflater layoutInflater) {
        return m26397d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25902m4 m26397d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C46444oj4.activity_merchant_location, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m26400a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public DrawerLayout getRoot() {
        return this.f97258a;
    }
}
