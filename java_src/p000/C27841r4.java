package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: r4 */
/* loaded from: classes3.dex */
public final class C27841r4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f106368a;

    /* renamed from: b */
    public final FrameLayout f106369b;

    /* renamed from: c */
    public final RecyclerView f106370c;

    /* renamed from: d */
    public final Button f106371d;

    public C27841r4(LinearLayout linearLayout, FrameLayout frameLayout, RecyclerView recyclerView, Button button) {
        this.f106368a = linearLayout;
        this.f106369b = frameLayout;
        this.f106370c = recyclerView;
        this.f106371d = button;
    }

    /* renamed from: a */
    public static C27841r4 m16549a(View view) {
        int i = C35658Rh4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C35658Rh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C35658Rh4.submit;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    return new C27841r4((LinearLayout) view, frameLayout, recyclerView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27841r4 m16547c(LayoutInflater layoutInflater) {
        return m16546d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27841r4 m16546d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_non_repair_survey, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m16549a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f106368a;
    }
}
