package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.C18606R;
import com.stripe.android.view.PaymentMethodsRecyclerView;
/* loaded from: classes6.dex */
public final class PaymentMethodsActivityBinding implements InterfaceC34094Kp6 {
    public final CoordinatorLayout coordinator;
    public final FrameLayout footerContainer;
    public final LinearProgressIndicator progressBar;
    public final PaymentMethodsRecyclerView recycler;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;

    private PaymentMethodsActivityBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, PaymentMethodsRecyclerView paymentMethodsRecyclerView, Toolbar toolbar) {
        this.rootView = coordinatorLayout;
        this.coordinator = coordinatorLayout2;
        this.footerContainer = frameLayout;
        this.progressBar = linearProgressIndicator;
        this.recycler = paymentMethodsRecyclerView;
        this.toolbar = toolbar;
    }

    public static PaymentMethodsActivityBinding bind(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = C18606R.C18608id.footer_container;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C18606R.C18608id.progress_bar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C18606R.C18608id.recycler;
                PaymentMethodsRecyclerView paymentMethodsRecyclerView = (PaymentMethodsRecyclerView) C34328Lp6.m96312a(view, i);
                if (paymentMethodsRecyclerView != null) {
                    i = C18606R.C18608id.toolbar;
                    Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                    if (toolbar != null) {
                        return new PaymentMethodsActivityBinding(coordinatorLayout, coordinatorLayout, frameLayout, linearProgressIndicator, paymentMethodsRecyclerView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PaymentMethodsActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PaymentMethodsActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.payment_methods_activity, viewGroup, false);
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
