package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: e6 */
/* loaded from: classes3.dex */
public final class C19961e6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f77943a;

    /* renamed from: b */
    public final Button f77944b;

    /* renamed from: c */
    public final ConstraintLayout f77945c;

    /* renamed from: d */
    public final Button f77946d;

    /* renamed from: e */
    public final RecyclerView f77947e;

    /* renamed from: f */
    public final Button f77948f;

    public C19961e6(LinearLayout linearLayout, Button button, ConstraintLayout constraintLayout, Button button2, RecyclerView recyclerView, Button button3) {
        this.f77943a = linearLayout;
        this.f77944b = button;
        this.f77945c = constraintLayout;
        this.f77946d = button2;
        this.f77947e = recyclerView;
        this.f77948f = button3;
    }

    /* renamed from: a */
    public static C19961e6 m43285a(View view) {
        int i = C39912di4.addToSkuButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.buttonContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
            if (constraintLayout != null) {
                i = C39912di4.closeIncomplete;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C39912di4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C39912di4.uploadBol;
                        Button button3 = (Button) C34328Lp6.m96312a(view, i);
                        if (button3 != null) {
                            return new C19961e6((LinearLayout) view, button, constraintLayout, button2, recyclerView, button3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C19961e6 m43283c(LayoutInflater layoutInflater) {
        return m43282d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C19961e6 m43282d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_sku_order_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43285a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f77943a;
    }
}
