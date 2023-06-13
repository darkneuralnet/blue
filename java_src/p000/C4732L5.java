package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: L5 */
/* loaded from: classes3.dex */
public final class C4732L5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f20727a;

    /* renamed from: b */
    public final LinearProgressIndicator f20728b;

    /* renamed from: c */
    public final RecyclerView f20729c;

    /* renamed from: d */
    public final Button f20730d;

    public C4732L5(RelativeLayout relativeLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, Button button) {
        this.f20727a = relativeLayout;
        this.f20728b = linearProgressIndicator;
        this.f20729c = recyclerView;
        this.f20730d = button;
    }

    /* renamed from: a */
    public static C4732L5 m97799a(View view) {
        int i = C36126Th4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C36126Th4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C36126Th4.rideNow;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    return new C4732L5((RelativeLayout) view, linearProgressIndicator, recyclerView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C4732L5 m97797c(LayoutInflater layoutInflater) {
        return m97796d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C4732L5 m97796d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C33102Gj4.activity_ride_pass_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m97799a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f20727a;
    }
}
