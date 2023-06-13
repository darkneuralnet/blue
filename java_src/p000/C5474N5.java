package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: N5 */
/* loaded from: classes3.dex */
public final class C5474N5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f24112a;

    /* renamed from: b */
    public final ConstraintLayout f24113b;

    /* renamed from: c */
    public final Button f24114c;

    /* renamed from: d */
    public final LinearProgressIndicator f24115d;

    /* renamed from: e */
    public final RecyclerView f24116e;

    /* renamed from: f */
    public final Button f24117f;

    /* renamed from: g */
    public final Button f24118g;

    public C5474N5(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, Button button2, Button button3) {
        this.f24112a = constraintLayout;
        this.f24113b = constraintLayout2;
        this.f24114c = button;
        this.f24115d = linearProgressIndicator;
        this.f24116e = recyclerView;
        this.f24117f = button2;
        this.f24118g = button3;
    }

    /* renamed from: a */
    public static C5474N5 m94392a(View view) {
        int i = C36126Th4.buttonContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
        if (constraintLayout != null) {
            i = C36126Th4.cancel;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C36126Th4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C36126Th4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C36126Th4.subscribe;
                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                        if (button2 != null) {
                            i = C36126Th4.transfer;
                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                            if (button3 != null) {
                                return new C5474N5((ConstraintLayout) view, constraintLayout, button, linearProgressIndicator, recyclerView, button2, button3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C5474N5 m94390c(LayoutInflater layoutInflater) {
        return m94389d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5474N5 m94389d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C33102Gj4.activity_ride_pass_v4_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94392a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f24112a;
    }
}
