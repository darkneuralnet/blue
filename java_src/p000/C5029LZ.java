package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.widget.PaymentButton;
/* renamed from: LZ */
/* loaded from: classes3.dex */
public final class C5029LZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f21663a;

    /* renamed from: b */
    public final View f21664b;

    /* renamed from: c */
    public final View f21665c;

    /* renamed from: d */
    public final Button f21666d;

    /* renamed from: e */
    public final PaymentButton f21667e;

    /* renamed from: f */
    public final View f21668f;

    /* renamed from: g */
    public final View f21669g;

    /* renamed from: h */
    public final LinearLayout f21670h;

    /* renamed from: i */
    public final View f21671i;

    /* renamed from: j */
    public final ProgressBar f21672j;

    /* renamed from: k */
    public final Group f21673k;

    /* renamed from: l */
    public final Button f21674l;

    /* renamed from: m */
    public final TextView f21675m;

    /* renamed from: n */
    public final ImageView f21676n;

    /* renamed from: o */
    public final TextView f21677o;

    /* renamed from: p */
    public final TextView f21678p;

    /* renamed from: q */
    public final TextView f21679q;

    public C5029LZ(ConstraintLayout constraintLayout, View view, View view2, Button button, PaymentButton paymentButton, View view3, View view4, LinearLayout linearLayout, View view5, ProgressBar progressBar, Group group, Button button2, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4) {
        this.f21663a = constraintLayout;
        this.f21664b = view;
        this.f21665c = view2;
        this.f21666d = button;
        this.f21667e = paymentButton;
        this.f21668f = view3;
        this.f21669g = view4;
        this.f21670h = linearLayout;
        this.f21671i = view5;
        this.f21672j = progressBar;
        this.f21673k = group;
        this.f21674l = button2;
        this.f21675m = textView;
        this.f21676n = imageView;
        this.f21677o = textView2;
        this.f21678p = textView3;
        this.f21679q = textView4;
    }

    /* renamed from: a */
    public static C5029LZ m96638a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        int i = C34956Oh4.bottomSpacer;
        View m96312a5 = C34328Lp6.m96312a(view, i);
        if (m96312a5 != null && (m96312a = C34328Lp6.m96312a(view, (i = C34956Oh4.buttonsSpacer))) != null) {
            i = C34956Oh4.cancelButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C34956Oh4.defaultPayment;
                PaymentButton paymentButton = (PaymentButton) C34328Lp6.m96312a(view, i);
                if (paymentButton != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C34956Oh4.divider))) != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C34956Oh4.lineItemSpacer))) != null) {
                    i = C34956Oh4.lineItemsContainer;
                    LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                    if (linearLayout != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C34956Oh4.loadingBackground))) != null) {
                        i = C34956Oh4.loadingProgress;
                        ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
                        if (progressBar != null) {
                            i = C34956Oh4.loadingViews;
                            Group group = (Group) C34328Lp6.m96312a(view, i);
                            if (group != null) {
                                i = C34956Oh4.payButton;
                                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                if (button2 != null) {
                                    i = C34956Oh4.paymentInfoText;
                                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView != null) {
                                        i = C34956Oh4.paymentMethodIcon;
                                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView != null) {
                                            i = C34956Oh4.title;
                                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView2 != null) {
                                                i = C34956Oh4.totalAmountText;
                                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView3 != null) {
                                                    i = C34956Oh4.totalLabel;
                                                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView4 != null) {
                                                        return new C5029LZ((ConstraintLayout) view, m96312a5, m96312a, button, paymentButton, m96312a2, m96312a3, linearLayout, m96312a4, progressBar, group, button2, textView, imageView, textView2, textView3, textView4);
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
    public static C5029LZ m96636c(LayoutInflater layoutInflater) {
        return m96635d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5029LZ m96635d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.bottom_sheet_confirm_purchase, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m96638a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f21663a;
    }
}
