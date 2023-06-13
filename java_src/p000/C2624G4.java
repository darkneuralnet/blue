package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: G4 */
/* loaded from: classes3.dex */
public final class C2624G4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f10858a;

    /* renamed from: b */
    public final LinearProgressIndicator f10859b;

    /* renamed from: c */
    public final RecyclerView f10860c;

    public C2624G4(LinearLayout linearLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f10858a = linearLayout;
        this.f10859b = linearProgressIndicator;
        this.f10860c = recyclerView;
    }

    /* renamed from: a */
    public static C2624G4 m105862a(View view) {
        int i = C34722Nh4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C34722Nh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C2624G4((LinearLayout) view, linearProgressIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2624G4 m105860c(LayoutInflater layoutInflater) {
        return m105859d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C2624G4 m105859d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31698Aj4.activity_owned_birds, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m105862a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f10858a;
    }
}
