package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stripe.android.C18606R;
import com.stripe.android.view.PaymentFlowViewPager;
/* loaded from: classes6.dex */
public final class PaymentFlowActivityBinding implements InterfaceC34094Kp6 {
    private final FrameLayout rootView;
    public final PaymentFlowViewPager shippingFlowViewpager;

    private PaymentFlowActivityBinding(FrameLayout frameLayout, PaymentFlowViewPager paymentFlowViewPager) {
        this.rootView = frameLayout;
        this.shippingFlowViewpager = paymentFlowViewPager;
    }

    public static PaymentFlowActivityBinding bind(View view) {
        int i = C18606R.C18608id.shipping_flow_viewpager;
        PaymentFlowViewPager paymentFlowViewPager = (PaymentFlowViewPager) C34328Lp6.m96312a(view, i);
        if (paymentFlowViewPager != null) {
            return new PaymentFlowActivityBinding((FrameLayout) view, paymentFlowViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PaymentFlowActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PaymentFlowActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.payment_flow_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
