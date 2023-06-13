package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: a3 */
/* loaded from: classes3.dex */
public final class C10552a3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f49748a;

    /* renamed from: b */
    public final ConstraintLayout f49749b;

    /* renamed from: c */
    public final Button f49750c;

    /* renamed from: d */
    public final LinearProgressIndicator f49751d;

    /* renamed from: e */
    public final RecyclerView f49752e;

    /* renamed from: f */
    public final Button f49753f;

    /* renamed from: g */
    public final Button f49754g;

    public C10552a3(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, Button button2, Button button3) {
        this.f49748a = constraintLayout;
        this.f49749b = constraintLayout2;
        this.f49750c = button;
        this.f49751d = linearProgressIndicator;
        this.f49752e = recyclerView;
        this.f49753f = button2;
        this.f49754g = button3;
    }

    /* renamed from: a */
    public static C10552a3 m71956a(View view) {
        int i = C38698bh4.buttonContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
        if (constraintLayout != null) {
            i = C38698bh4.cancel;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C38698bh4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C38698bh4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C38698bh4.subscribe;
                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                        if (button2 != null) {
                            i = C38698bh4.transfer;
                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                            if (button3 != null) {
                                return new C10552a3((ConstraintLayout) view, constraintLayout, button, linearProgressIndicator, recyclerView, button2, button3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10552a3 m71954c(LayoutInflater layoutInflater) {
        return m71953d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C10552a3 m71953d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C47640qk4.activity_bird_plus_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m71956a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49748a;
    }
}
