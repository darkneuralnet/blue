package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: U3 */
/* loaded from: classes3.dex */
public final class C8185U3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f36758a;

    /* renamed from: b */
    public final LinearLayout f36759b;

    /* renamed from: c */
    public final Button f36760c;

    /* renamed from: d */
    public final LinearProgressIndicator f36761d;

    /* renamed from: e */
    public final RecyclerView f36762e;

    /* renamed from: f */
    public final Button f36763f;

    public C8185U3(ConstraintLayout constraintLayout, LinearLayout linearLayout, Button button, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, Button button2) {
        this.f36758a = constraintLayout;
        this.f36759b = linearLayout;
        this.f36760c = button;
        this.f36761d = linearProgressIndicator;
        this.f36762e = recyclerView;
        this.f36763f = button2;
    }

    /* renamed from: a */
    public static C8185U3 m82041a(View view) {
        int i = C44062ki4.buttonContainer;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C44062ki4.pass_all;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C44062ki4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C44062ki4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C44062ki4.submit;
                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                        if (button2 != null) {
                            return new C8185U3((ConstraintLayout) view, linearLayout, button, linearProgressIndicator, recyclerView, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C8185U3 m82039c(LayoutInflater layoutInflater) {
        return m82038d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8185U3 m82038d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37080Xj4.activity_inspection_v3, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m82041a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f36758a;
    }
}
