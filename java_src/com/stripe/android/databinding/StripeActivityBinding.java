package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.C18606R;
/* loaded from: classes6.dex */
public final class StripeActivityBinding implements InterfaceC34094Kp6 {
    public final LinearProgressIndicator progressBar;
    private final RelativeLayout rootView;
    public final Toolbar toolbar;
    public final ViewStub viewStub;

    private StripeActivityBinding(RelativeLayout relativeLayout, LinearProgressIndicator linearProgressIndicator, Toolbar toolbar, ViewStub viewStub) {
        this.rootView = relativeLayout;
        this.progressBar = linearProgressIndicator;
        this.toolbar = toolbar;
        this.viewStub = viewStub;
    }

    public static StripeActivityBinding bind(View view) {
        int i = C18606R.C18608id.progress_bar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C18606R.C18608id.toolbar;
            Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
            if (toolbar != null) {
                i = C18606R.C18608id.view_stub;
                ViewStub viewStub = (ViewStub) C34328Lp6.m96312a(view, i);
                if (viewStub != null) {
                    return new StripeActivityBinding((RelativeLayout) view, linearProgressIndicator, toolbar, viewStub);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static StripeActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18606R.C18609layout.stripe_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
