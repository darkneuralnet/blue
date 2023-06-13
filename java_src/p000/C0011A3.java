package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: A3 */
/* loaded from: classes3.dex */
public final class C0011A3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f55a;

    /* renamed from: b */
    public final FrameLayout f56b;

    /* renamed from: c */
    public final RecyclerView f57c;

    /* renamed from: d */
    public final Button f58d;

    public C0011A3(ConstraintLayout constraintLayout, FrameLayout frameLayout, RecyclerView recyclerView, Button button) {
        this.f55a = constraintLayout;
        this.f56b = frameLayout;
        this.f57c = recyclerView;
        this.f58d = button;
    }

    /* renamed from: a */
    public static C0011A3 m116168a(View view) {
        int i = C32382Dh4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C32382Dh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C32382Dh4.send;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    return new C0011A3((ConstraintLayout) view, frameLayout, recyclerView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C0011A3 m116166c(LayoutInflater layoutInflater) {
        return m116165d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C0011A3 m116165d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C47630qj4.activity_flag_nest, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116168a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f55a;
    }
}
