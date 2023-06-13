package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: e5 */
/* loaded from: classes3.dex */
public final class C19960e5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f77928a;

    /* renamed from: b */
    public final Button f77929b;

    /* renamed from: c */
    public final FrameLayout f77930c;

    /* renamed from: d */
    public final LinearProgressIndicator f77931d;

    /* renamed from: e */
    public final RecyclerView f77932e;

    public C19960e5(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f77928a = constraintLayout;
        this.f77929b = button;
        this.f77930c = frameLayout;
        this.f77931d = linearProgressIndicator;
        this.f77932e = recyclerView;
    }

    /* renamed from: a */
    public static C19960e5 m43297a(View view) {
        int i = C38115ai4.addRepair;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C38115ai4.addRepairContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C38115ai4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C38115ai4.repairRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        return new C19960e5((ConstraintLayout) view, button, frameLayout, linearProgressIndicator, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C19960e5 m43295c(LayoutInflater layoutInflater) {
        return m43294d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C19960e5 m43294d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_repair_list_add, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43297a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f77928a;
    }
}
