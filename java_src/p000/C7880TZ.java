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
/* renamed from: TZ */
/* loaded from: classes3.dex */
public final class C7880TZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f35672a;

    /* renamed from: b */
    public final Button f35673b;

    /* renamed from: c */
    public final FrameLayout f35674c;

    /* renamed from: d */
    public final ImageView f35675d;

    /* renamed from: e */
    public final View f35676e;

    /* renamed from: f */
    public final LinearProgressIndicator f35677f;

    /* renamed from: g */
    public final RecyclerView f35678g;

    /* renamed from: h */
    public final TextView f35679h;

    /* renamed from: i */
    public final TextView f35680i;

    public C7880TZ(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, ImageView imageView, View view, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f35672a = constraintLayout;
        this.f35673b = button;
        this.f35674c = frameLayout;
        this.f35675d = imageView;
        this.f35676e = view;
        this.f35677f = linearProgressIndicator;
        this.f35678g = recyclerView;
        this.f35679h = textView;
        this.f35680i = textView2;
    }

    /* renamed from: a */
    public static C7880TZ m83396a(View view) {
        View m96312a;
        int i = C45238mh4.apply;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C45238mh4.buttonContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C45238mh4.close;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null && (m96312a = C34328Lp6.m96312a(view, (i = C45238mh4.divider))) != null) {
                    i = C45238mh4.progressBar;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (linearProgressIndicator != null) {
                        i = C45238mh4.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                        if (recyclerView != null) {
                            i = C45238mh4.reset;
                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView != null) {
                                i = C45238mh4.title;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    return new C7880TZ((ConstraintLayout) view, button, frameLayout, imageView, m96312a, linearProgressIndicator, recyclerView, textView, textView2);
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
    public static C7880TZ m83394c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37539Zi4.bottom_sheet_operator_filters, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m83396a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f35672a;
    }
}
