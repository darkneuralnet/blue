package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionLayoutBinding implements InterfaceC34094Kp6 {
    public final FragmentContainerView fragmentContainer;
    private final FragmentContainerView rootView;

    private Stripe3ds2TransactionLayoutBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.fragmentContainer = fragmentContainerView2;
    }

    public static Stripe3ds2TransactionLayoutBinding bind(View view) {
        if (view != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
            return new Stripe3ds2TransactionLayoutBinding(fragmentContainerView, fragmentContainerView);
        }
        throw new NullPointerException("rootView");
    }

    public static Stripe3ds2TransactionLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Stripe3ds2TransactionLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.stripe_3ds2_transaction_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public FragmentContainerView getRoot() {
        return this.rootView;
    }
}
