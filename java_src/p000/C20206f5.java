package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: f5 */
/* loaded from: classes3.dex */
public final class C20206f5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f79411a;

    /* renamed from: b */
    public final FloatingActionButton f79412b;

    /* renamed from: c */
    public final LinearProgressIndicator f79413c;

    /* renamed from: d */
    public final RecyclerView f79414d;

    public C20206f5(FrameLayout frameLayout, FloatingActionButton floatingActionButton, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f79411a = frameLayout;
        this.f79412b = floatingActionButton;
        this.f79413c = linearProgressIndicator;
        this.f79414d = recyclerView;
    }

    /* renamed from: a */
    public static C20206f5 m42123a(View view) {
        int i = C38115ai4.addRepair;
        FloatingActionButton floatingActionButton = (FloatingActionButton) C34328Lp6.m96312a(view, i);
        if (floatingActionButton != null) {
            i = C38115ai4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C38115ai4.repairRecyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C20206f5((FrameLayout) view, floatingActionButton, linearProgressIndicator, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C20206f5 m42121c(LayoutInflater layoutInflater) {
        return m42120d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C20206f5 m42120d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_repair_logger_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m42123a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f79411a;
    }
}
