package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: f3 */
/* loaded from: classes3.dex */
public final class C20179f3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f79339a;

    /* renamed from: b */
    public final FrameLayout f79340b;

    /* renamed from: c */
    public final Button f79341c;

    /* renamed from: d */
    public final LinearProgressIndicator f79342d;

    /* renamed from: e */
    public final RecyclerView f79343e;

    public C20179f3(ConstraintLayout constraintLayout, FrameLayout frameLayout, Button button, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f79339a = constraintLayout;
        this.f79340b = frameLayout;
        this.f79341c = button;
        this.f79342d = linearProgressIndicator;
        this.f79343e = recyclerView;
    }

    /* renamed from: a */
    public static C20179f3 m42237a(View view) {
        int i = C41087fh4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C41087fh4.okay;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C41087fh4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C41087fh4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        return new C20179f3((ConstraintLayout) view, frameLayout, button, linearProgressIndicator, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C20179f3 m42235c(LayoutInflater layoutInflater) {
        return m42234d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C20179f3 m42234d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35901Si4.activity_bulk_scanner_status_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m42237a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f79339a;
    }
}
