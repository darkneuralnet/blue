package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: E3 */
/* loaded from: classes3.dex */
public final class C1726E3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f6891a;

    /* renamed from: b */
    public final Button f6892b;

    /* renamed from: c */
    public final ConstraintLayout f6893c;

    /* renamed from: d */
    public final Button f6894d;

    /* renamed from: e */
    public final LinearProgressIndicator f6895e;

    /* renamed from: f */
    public final RecyclerView f6896f;

    public C1726E3(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, Button button2, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f6891a = constraintLayout;
        this.f6892b = button;
        this.f6893c = constraintLayout2;
        this.f6894d = button2;
        this.f6895e = linearProgressIndicator;
        this.f6896f = recyclerView;
    }

    /* renamed from: a */
    public static C1726E3 m109475a(View view) {
        int i = C39912di4.begin;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.buttonContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
            if (constraintLayout != null) {
                i = C39912di4.closeIncomplete;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C39912di4.progressBar;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (linearProgressIndicator != null) {
                        i = C39912di4.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                        if (recyclerView != null) {
                            return new C1726E3((ConstraintLayout) view, button, constraintLayout, button2, linearProgressIndicator, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C1726E3 m109473c(LayoutInflater layoutInflater) {
        return m109472d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C1726E3 m109472d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_fm_allocation_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109475a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f6891a;
    }
}
