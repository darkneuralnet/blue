package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: N2 */
/* loaded from: classes3.dex */
public final class C5462N2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f23981a;

    /* renamed from: b */
    public final TextView f23982b;

    /* renamed from: c */
    public final TextView f23983c;

    /* renamed from: d */
    public final TextView f23984d;

    /* renamed from: e */
    public final View f23985e;

    /* renamed from: f */
    public final TextView f23986f;

    /* renamed from: g */
    public final TextView f23987g;

    /* renamed from: h */
    public final TextView f23988h;

    /* renamed from: i */
    public final RecyclerView f23989i;

    /* renamed from: j */
    public final Button f23990j;

    public C5462N2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view, TextView textView4, TextView textView5, TextView textView6, RecyclerView recyclerView, Button button) {
        this.f23981a = constraintLayout;
        this.f23982b = textView;
        this.f23983c = textView2;
        this.f23984d = textView3;
        this.f23985e = view;
        this.f23986f = textView4;
        this.f23987g = textView5;
        this.f23988h = textView6;
        this.f23989i = recyclerView;
        this.f23990j = button;
    }

    /* renamed from: a */
    public static C5462N2 m94446a(View view) {
        View m96312a;
        int i = C34956Oh4.currentBalance;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34956Oh4.currentBalanceLabel;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C34956Oh4.descriptionLabel;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null && (m96312a = C34328Lp6.m96312a(view, (i = C34956Oh4.divider))) != null) {
                    i = C34956Oh4.minRideAmountLabel;
                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView4 != null) {
                        i = C34956Oh4.paymentMethod;
                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView5 != null) {
                            i = C34956Oh4.preloadLabel;
                            TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView6 != null) {
                                i = C34956Oh4.preloadList;
                                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                if (recyclerView != null) {
                                    i = C34956Oh4.primaryButton;
                                    Button button = (Button) C34328Lp6.m96312a(view, i);
                                    if (button != null) {
                                        return new C5462N2((ConstraintLayout) view, textView, textView2, textView3, m96312a, textView4, textView5, textView6, recyclerView, button);
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
    public static C5462N2 m94444c(LayoutInflater layoutInflater) {
        return m94443d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5462N2 m94443d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.activity_add_balance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94446a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f23981a;
    }
}
