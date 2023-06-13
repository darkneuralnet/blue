package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: r3 */
/* loaded from: classes3.dex */
public final class C27825r3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f106327a;

    /* renamed from: b */
    public final Button f106328b;

    /* renamed from: c */
    public final FrameLayout f106329c;

    /* renamed from: d */
    public final RecyclerView f106330d;

    public C27825r3(LinearLayout linearLayout, Button button, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f106327a = linearLayout;
        this.f106328b = button;
        this.f106329c = frameLayout;
        this.f106330d = recyclerView;
    }

    /* renamed from: a */
    public static C27825r3 m16569a(View view) {
        int i = C39912di4.addBol;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.buttonContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C39912di4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C27825r3((LinearLayout) view, button, frameLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27825r3 m16567c(LayoutInflater layoutInflater) {
        return m16566d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27825r3 m16566d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_container_order_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m16569a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f106327a;
    }
}
