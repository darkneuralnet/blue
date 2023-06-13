package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: Q3 */
/* loaded from: classes3.dex */
public final class C6655Q3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f29744a;

    /* renamed from: b */
    public final LinearProgressIndicator f29745b;

    /* renamed from: c */
    public final RecyclerView f29746c;

    public C6655Q3(FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f29744a = frameLayout;
        this.f29745b = linearProgressIndicator;
        this.f29746c = recyclerView;
    }

    /* renamed from: a */
    public static C6655Q3 m89026a(View view) {
        int i = C38115ai4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C38115ai4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C6655Q3((FrameLayout) view, linearProgressIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6655Q3 m89024c(LayoutInflater layoutInflater) {
        return m89023d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C6655Q3 m89023d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_id_tools_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m89026a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f29744a;
    }
}
