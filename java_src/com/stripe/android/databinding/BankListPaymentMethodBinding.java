package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class BankListPaymentMethodBinding implements InterfaceC34094Kp6 {
    public final RecyclerView bankList;
    private final LinearLayout rootView;

    private BankListPaymentMethodBinding(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.bankList = recyclerView;
    }

    public static BankListPaymentMethodBinding bind(View view) {
        int i = C18606R.C18608id.bank_list;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new BankListPaymentMethodBinding((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BankListPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BankListPaymentMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.bank_list_payment_method, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
