package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: c4 */
/* loaded from: classes3.dex */
public final class C13383c4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f60018a;

    /* renamed from: b */
    public final FrameLayout f60019b;

    /* renamed from: c */
    public final LinearProgressIndicator f60020c;

    /* renamed from: d */
    public final RecyclerView f60021d;

    /* renamed from: e */
    public final Button f60022e;

    public C13383c4(ConstraintLayout constraintLayout, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, Button button) {
        this.f60018a = constraintLayout;
        this.f60019b = frameLayout;
        this.f60020c = linearProgressIndicator;
        this.f60021d = recyclerView;
        this.f60022e = button;
    }

    /* renamed from: a */
    public static C13383c4 m61987a(View view) {
        int i = C44062ki4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C44062ki4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C44062ki4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C44062ki4.submit;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        return new C13383c4((ConstraintLayout) view, frameLayout, linearProgressIndicator, recyclerView, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C13383c4 m61985c(LayoutInflater layoutInflater) {
        return m61984d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C13383c4 m61984d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37080Xj4.activity_legacy_work_order_inspection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m61987a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f60018a;
    }
}
