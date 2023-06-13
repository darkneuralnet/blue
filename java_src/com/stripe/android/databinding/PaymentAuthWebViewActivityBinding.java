package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.C18606R;
import com.stripe.android.view.PaymentAuthWebView;
/* loaded from: classes6.dex */
public final class PaymentAuthWebViewActivityBinding implements InterfaceC34094Kp6 {
    public final CircularProgressIndicator progressBar;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final PaymentAuthWebView webView;
    public final FrameLayout webViewContainer;

    private PaymentAuthWebViewActivityBinding(CoordinatorLayout coordinatorLayout, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar, PaymentAuthWebView paymentAuthWebView, FrameLayout frameLayout) {
        this.rootView = coordinatorLayout;
        this.progressBar = circularProgressIndicator;
        this.toolbar = toolbar;
        this.webView = paymentAuthWebView;
        this.webViewContainer = frameLayout;
    }

    public static PaymentAuthWebViewActivityBinding bind(View view) {
        int i = C18606R.C18608id.progress_bar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
        if (circularProgressIndicator != null) {
            i = C18606R.C18608id.toolbar;
            Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
            if (toolbar != null) {
                i = C18606R.C18608id.web_view;
                PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) C34328Lp6.m96312a(view, i);
                if (paymentAuthWebView != null) {
                    i = C18606R.C18608id.web_view_container;
                    FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                    if (frameLayout != null) {
                        return new PaymentAuthWebViewActivityBinding((CoordinatorLayout) view, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PaymentAuthWebViewActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PaymentAuthWebViewActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.payment_auth_web_view_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
