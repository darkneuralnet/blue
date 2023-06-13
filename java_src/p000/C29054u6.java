package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: u6 */
/* loaded from: classes2.dex */
public final class C29054u6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f111726a;

    /* renamed from: b */
    public final TextView f111727b;

    /* renamed from: c */
    public final TextView f111728c;

    /* renamed from: d */
    public final LinearProgressIndicator f111729d;

    /* renamed from: e */
    public final TextView f111730e;

    public C29054u6(LinearLayout linearLayout, TextView textView, TextView textView2, LinearProgressIndicator linearProgressIndicator, TextView textView3) {
        this.f111726a = linearLayout;
        this.f111727b = textView;
        this.f111728c = textView2;
        this.f111729d = linearProgressIndicator;
        this.f111730e = textView3;
    }

    /* renamed from: a */
    public static C29054u6 m10869a(View view) {
        int i = C36585Vg4.birdsFailedToWake;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.birdsWoken;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C36585Vg4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C36585Vg4.totalBirds;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C29054u6((LinearLayout) view, textView, textView2, linearProgressIndicator, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C29054u6 m10867c(LayoutInflater layoutInflater) {
        return m10866d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29054u6 m10866d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_wake_flock_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m10869a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f111726a;
    }
}
