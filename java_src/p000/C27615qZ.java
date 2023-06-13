package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: qZ */
/* loaded from: classes3.dex */
public final class C27615qZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f105404a;

    /* renamed from: b */
    public final Button f105405b;

    /* renamed from: c */
    public final View f105406c;

    /* renamed from: d */
    public final ImageView f105407d;

    /* renamed from: e */
    public final View f105408e;

    /* renamed from: f */
    public final LinearLayout f105409f;

    /* renamed from: g */
    public final CircularProgressIndicator f105410g;

    /* renamed from: h */
    public final RecyclerView f105411h;

    /* renamed from: i */
    public final Button f105412i;

    /* renamed from: j */
    public final TextView f105413j;

    public C27615qZ(RelativeLayout relativeLayout, Button button, View view, ImageView imageView, View view2, LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, Button button2, TextView textView) {
        this.f105404a = relativeLayout;
        this.f105405b = button;
        this.f105406c = view;
        this.f105407d = imageView;
        this.f105408e = view2;
        this.f105409f = linearLayout;
        this.f105410g = circularProgressIndicator;
        this.f105411h = recyclerView;
        this.f105412i = button2;
        this.f105413j = textView;
    }

    /* renamed from: a */
    public static C27615qZ m17459a(View view) {
        View m96312a;
        View m96312a2;
        int i = C49981uh4.alternateIdButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null && (m96312a = C34328Lp6.m96312a(view, (i = C49981uh4.buffer))) != null) {
            i = C49981uh4.closeButton;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C49981uh4.divider))) != null) {
                i = C49981uh4.header;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C49981uh4.progressBar;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (circularProgressIndicator != null) {
                        i = C49981uh4.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                        if (recyclerView != null) {
                            i = C49981uh4.submitButton;
                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                            if (button2 != null) {
                                i = C49981uh4.title;
                                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView != null) {
                                    return new C27615qZ((RelativeLayout) view, button, m96312a, imageView, m96312a2, linearLayout, circularProgressIndicator, recyclerView, button2, textView);
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
    public static C27615qZ m17457c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C42293hj4.bottom_manual_entry_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m17459a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f105404a;
    }
}
