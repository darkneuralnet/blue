package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.guness.widget.NavigationView;
/* renamed from: l4 */
/* loaded from: classes3.dex */
public final class C25594l4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final DrawerLayout f95410a;

    /* renamed from: b */
    public final Button f95411b;

    /* renamed from: c */
    public final CardView f95412c;

    /* renamed from: d */
    public final TextView f95413d;

    /* renamed from: e */
    public final CoordinatorLayout f95414e;

    /* renamed from: f */
    public final DrawerLayout f95415f;

    /* renamed from: g */
    public final TextView f95416g;

    /* renamed from: h */
    public final RecyclerView f95417h;

    /* renamed from: i */
    public final NavigationView f95418i;

    /* renamed from: j */
    public final CircularProgressIndicator f95419j;

    /* renamed from: k */
    public final Toolbar f95420k;

    public C25594l4(DrawerLayout drawerLayout, Button button, CardView cardView, TextView textView, CoordinatorLayout coordinatorLayout, DrawerLayout drawerLayout2, TextView textView2, RecyclerView recyclerView, NavigationView navigationView, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar) {
        this.f95410a = drawerLayout;
        this.f95411b = button;
        this.f95412c = cardView;
        this.f95413d = textView;
        this.f95414e = coordinatorLayout;
        this.f95415f = drawerLayout2;
        this.f95416g = textView2;
        this.f95417h = recyclerView;
        this.f95418i = navigationView;
        this.f95419j = circularProgressIndicator;
        this.f95420k = toolbar;
    }

    /* renamed from: a */
    public static C25594l4 m27978a(View view) {
        int i = C31914Bh4.agreementActionButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C31914Bh4.agreementContainer;
            CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
            if (cardView != null) {
                i = C31914Bh4.agreementHeaderTextView;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C31914Bh4.container;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C34328Lp6.m96312a(view, i);
                    if (coordinatorLayout != null) {
                        DrawerLayout drawerLayout = (DrawerLayout) view;
                        i = C31914Bh4.emptyMerchantHistory;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C31914Bh4.historyRecyclerView;
                            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                            if (recyclerView != null) {
                                i = C31914Bh4.navigationView;
                                NavigationView navigationView = (NavigationView) C34328Lp6.m96312a(view, i);
                                if (navigationView != null) {
                                    i = C31914Bh4.progressBar;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                                    if (circularProgressIndicator != null) {
                                        i = C31914Bh4.toolbar;
                                        Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                        if (toolbar != null) {
                                            return new C25594l4(drawerLayout, button, cardView, textView, coordinatorLayout, drawerLayout, textView2, recyclerView, navigationView, circularProgressIndicator, toolbar);
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
    public static C25594l4 m27976c(LayoutInflater layoutInflater) {
        return m27975d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25594l4 m27975d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C46444oj4.activity_merchant_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m27978a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public DrawerLayout getRoot() {
        return this.f95410a;
    }
}
