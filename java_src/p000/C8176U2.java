package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: U2 */
/* loaded from: classes3.dex */
public final class C8176U2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f36734a;

    /* renamed from: b */
    public final Button f36735b;

    /* renamed from: c */
    public final ConstraintLayout f36736c;

    /* renamed from: d */
    public final View f36737d;

    /* renamed from: e */
    public final ProgressBar f36738e;

    /* renamed from: f */
    public final Group f36739f;

    /* renamed from: g */
    public final TextView f36740g;

    /* renamed from: h */
    public final RecyclerView f36741h;

    public C8176U2(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, View view, ProgressBar progressBar, Group group, TextView textView, RecyclerView recyclerView) {
        this.f36734a = constraintLayout;
        this.f36735b = button;
        this.f36736c = constraintLayout2;
        this.f36737d = view;
        this.f36738e = progressBar;
        this.f36739f = group;
        this.f36740g = textView;
        this.f36741h = recyclerView;
    }

    /* renamed from: a */
    public static C8176U2 m82057a(View view) {
        View m96312a;
        int i = C34956Oh4.action;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C34956Oh4.footer;
            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
            if (constraintLayout != null && (m96312a = C34328Lp6.m96312a(view, (i = C34956Oh4.loadingBackground))) != null) {
                i = C34956Oh4.loadingProgress;
                ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
                if (progressBar != null) {
                    i = C34956Oh4.loadingViews;
                    Group group = (Group) C34328Lp6.m96312a(view, i);
                    if (group != null) {
                        i = C34956Oh4.paymentTerms;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C34956Oh4.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                            if (recyclerView != null) {
                                return new C8176U2((ConstraintLayout) view, button, constraintLayout, m96312a, progressBar, group, textView, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C8176U2 m82055c(LayoutInflater layoutInflater) {
        return m82054d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8176U2 m82054d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.activity_autoreload_preload_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m82057a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f36734a;
    }
}
