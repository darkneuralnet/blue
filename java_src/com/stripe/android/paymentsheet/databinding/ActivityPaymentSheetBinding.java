package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.stripe.android.paymentsheet.C19159R;
/* loaded from: classes7.dex */
public final class ActivityPaymentSheetBinding implements InterfaceC34094Kp6 {
    public final LinearLayout bottomSheet;
    public final ComposeView content;
    public final CoordinatorLayout coordinator;
    private final CoordinatorLayout rootView;

    private ActivityPaymentSheetBinding(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, ComposeView composeView, CoordinatorLayout coordinatorLayout2) {
        this.rootView = coordinatorLayout;
        this.bottomSheet = linearLayout;
        this.content = composeView;
        this.coordinator = coordinatorLayout2;
    }

    public static ActivityPaymentSheetBinding bind(View view) {
        int i = C19159R.C19161id.bottom_sheet;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C19159R.C19161id.content;
            ComposeView composeView = (ComposeView) C34328Lp6.m96312a(view, i);
            if (composeView != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                return new ActivityPaymentSheetBinding(coordinatorLayout, linearLayout, composeView, coordinatorLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityPaymentSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPaymentSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19159R.C19162layout.activity_payment_sheet, viewGroup, false);
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
