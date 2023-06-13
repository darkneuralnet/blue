package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: q6 */
/* loaded from: classes3.dex */
public final class C27489q6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f104650a;

    /* renamed from: b */
    public final LinearProgressIndicator f104651b;

    /* renamed from: c */
    public final RecyclerView f104652c;

    public C27489q6(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f104650a = constraintLayout;
        this.f104651b = linearProgressIndicator;
        this.f104652c = recyclerView;
    }

    /* renamed from: a */
    public static C27489q6 m18190a(View view) {
        int i = C38115ai4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C38115ai4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C27489q6((ConstraintLayout) view, linearProgressIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27489q6 m18188c(LayoutInflater layoutInflater) {
        return m18187d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27489q6 m18187d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_vehicles_in_batch, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m18190a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f104650a;
    }
}
