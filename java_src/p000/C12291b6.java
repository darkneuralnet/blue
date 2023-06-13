package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: b6 */
/* loaded from: classes3.dex */
public final class C12291b6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f56920a;

    /* renamed from: b */
    public final FrameLayout f56921b;

    /* renamed from: c */
    public final LinearProgressIndicator f56922c;

    /* renamed from: d */
    public final RecyclerView f56923d;

    /* renamed from: e */
    public final Button f56924e;

    public C12291b6(RelativeLayout relativeLayout, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, Button button) {
        this.f56920a = relativeLayout;
        this.f56921b = frameLayout;
        this.f56922c = linearProgressIndicator;
        this.f56923d = recyclerView;
        this.f56924e = button;
    }

    /* renamed from: a */
    public static C12291b6 m64977a(View view) {
        int i = C38115ai4.background;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C38115ai4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C38115ai4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C38115ai4.submitButton;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        return new C12291b6((RelativeLayout) view, frameLayout, linearProgressIndicator, recyclerView, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C12291b6 m64975c(LayoutInflater layoutInflater) {
        return m64974d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C12291b6 m64974d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_service_progress_update, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m64977a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f56920a;
    }
}
