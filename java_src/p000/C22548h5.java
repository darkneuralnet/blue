package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: h5 */
/* loaded from: classes3.dex */
public final class C22548h5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f84683a;

    /* renamed from: b */
    public final FrameLayout f84684b;

    /* renamed from: c */
    public final LinearProgressIndicator f84685c;

    /* renamed from: d */
    public final RecyclerView f84686d;

    /* renamed from: e */
    public final Button f84687e;

    public C22548h5(ConstraintLayout constraintLayout, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, Button button) {
        this.f84683a = constraintLayout;
        this.f84684b = frameLayout;
        this.f84685c = linearProgressIndicator;
        this.f84686d = recyclerView;
        this.f84687e = button;
    }

    /* renamed from: a */
    public static C22548h5 m36865a(View view) {
        int i = C35658Rh4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C35658Rh4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C35658Rh4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C35658Rh4.submit;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        return new C22548h5((ConstraintLayout) view, frameLayout, linearProgressIndicator, recyclerView, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C22548h5 m36863c(LayoutInflater layoutInflater) {
        return m36862d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C22548h5 m36862d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_repair_overview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36865a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f84683a;
    }
}
