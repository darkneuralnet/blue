package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.actions.OperatorTaskActionBottomSheet;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: C4 */
/* loaded from: classes3.dex */
public final class C0848C4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f3344a;

    /* renamed from: b */
    public final OperatorTaskActionBottomSheet f3345b;

    /* renamed from: c */
    public final LinearProgressIndicator f3346c;

    /* renamed from: d */
    public final RecyclerView f3347d;

    public C0848C4(ConstraintLayout constraintLayout, OperatorTaskActionBottomSheet operatorTaskActionBottomSheet, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f3344a = constraintLayout;
        this.f3345b = operatorTaskActionBottomSheet;
        this.f3346c = linearProgressIndicator;
        this.f3347d = recyclerView;
    }

    /* renamed from: a */
    public static C0848C4 m112928a(View view) {
        int i = C33786Jh4.bottomSheet;
        OperatorTaskActionBottomSheet operatorTaskActionBottomSheet = (OperatorTaskActionBottomSheet) C34328Lp6.m96312a(view, i);
        if (operatorTaskActionBottomSheet != null) {
            i = C33786Jh4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C33786Jh4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C0848C4((ConstraintLayout) view, operatorTaskActionBottomSheet, linearProgressIndicator, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0848C4 m112926c(LayoutInflater layoutInflater) {
        return m112925d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C0848C4 m112925d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C51186wj4.activity_operator_task_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112928a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f3344a;
    }
}
