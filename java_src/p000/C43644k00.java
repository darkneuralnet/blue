package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: k00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43644k00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f93736a;

    /* renamed from: b */
    public final Button f93737b;

    /* renamed from: c */
    public final FrameLayout f93738c;

    /* renamed from: d */
    public final ImageView f93739d;

    /* renamed from: e */
    public final View f93740e;

    /* renamed from: f */
    public final LinearProgressIndicator f93741f;

    /* renamed from: g */
    public final RecyclerView f93742g;

    /* renamed from: h */
    public final TextView f93743h;

    /* renamed from: i */
    public final TextView f93744i;

    public C43644k00(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, ImageView imageView, View view, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f93736a = constraintLayout;
        this.f93737b = button;
        this.f93738c = frameLayout;
        this.f93739d = imageView;
        this.f93740e = view;
        this.f93741f = linearProgressIndicator;
        this.f93742g = recyclerView;
        this.f93743h = textView;
        this.f93744i = textView2;
    }

    /* renamed from: a */
    public static C43644k00 m29496a(View view) {
        View m96312a;
        int i = C39912di4.apply;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.buttonContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C39912di4.close;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null && (m96312a = C34328Lp6.m96312a(view, (i = C39912di4.divider))) != null) {
                    i = C39912di4.progressBar;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (linearProgressIndicator != null) {
                        i = C39912di4.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                        if (recyclerView != null) {
                            i = C39912di4.reset;
                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView != null) {
                                i = C39912di4.title;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    return new C43644k00((ConstraintLayout) view, button, frameLayout, imageView, m96312a, linearProgressIndicator, recyclerView, textView, textView2);
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
    public static C43644k00 m29494c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.bottom_sheet_transfer_order_landing_filters, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m29496a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f93736a;
    }
}
