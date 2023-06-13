package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: o3 */
/* loaded from: classes3.dex */
public final class C26802o3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f101255a;

    /* renamed from: b */
    public final FrameLayout f101256b;

    /* renamed from: c */
    public final Button f101257c;

    /* renamed from: d */
    public final LinearProgressIndicator f101258d;

    /* renamed from: e */
    public final RecyclerView f101259e;

    /* renamed from: f */
    public final Button f101260f;

    public C26802o3(ConstraintLayout constraintLayout, FrameLayout frameLayout, Button button, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, Button button2) {
        this.f101255a = constraintLayout;
        this.f101256b = frameLayout;
        this.f101257c = button;
        this.f101258d = linearProgressIndicator;
        this.f101259e = recyclerView;
        this.f101260f = button2;
    }

    /* renamed from: a */
    public static C26802o3 m21953a(View view) {
        int i = C42866ih4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C42866ih4.done;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C42866ih4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C42866ih4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C42866ih4.submit;
                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                        if (button2 != null) {
                            return new C26802o3((ConstraintLayout) view, frameLayout, button, linearProgressIndicator, recyclerView, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C26802o3 m21951c(LayoutInflater layoutInflater) {
        return m21950d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C26802o3 m21950d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36603Vi4.activity_complaint_resolution, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m21953a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f101255a;
    }
}
