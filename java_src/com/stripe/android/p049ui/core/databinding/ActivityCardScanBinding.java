package com.stripe.android.p049ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.stripe.android.p049ui.core.C19369R;
/* renamed from: com.stripe.android.ui.core.databinding.ActivityCardScanBinding */
/* loaded from: classes7.dex */
public final class ActivityCardScanBinding implements InterfaceC34094Kp6 {
    public final FragmentContainerView fragmentContainer;
    private final ConstraintLayout rootView;

    private ActivityCardScanBinding(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.rootView = constraintLayout;
        this.fragmentContainer = fragmentContainerView;
    }

    public static ActivityCardScanBinding bind(View view) {
        int i = C19369R.C19371id.fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) C34328Lp6.m96312a(view, i);
        if (fragmentContainerView != null) {
            return new ActivityCardScanBinding((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityCardScanBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCardScanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19369R.C19372layout.activity_card_scan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
