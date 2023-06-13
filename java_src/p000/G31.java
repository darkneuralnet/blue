package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: G31 */
/* loaded from: classes4.dex */
public final class G31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f10837a;

    /* renamed from: b */
    public final Button f10838b;

    /* renamed from: c */
    public final Button f10839c;

    /* renamed from: d */
    public final Button f10840d;

    /* renamed from: e */
    public final ProgressBar f10841e;

    /* renamed from: f */
    public final TextView f10842f;

    /* renamed from: g */
    public final RecyclerView f10843g;

    /* renamed from: h */
    public final ConstraintLayout f10844h;

    /* renamed from: i */
    public final Button f10845i;

    public G31(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, ProgressBar progressBar, TextView textView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, Button button4) {
        this.f10837a = constraintLayout;
        this.f10838b = button;
        this.f10839c = button2;
        this.f10840d = button3;
        this.f10841e = progressBar;
        this.f10842f = textView;
        this.f10843g = recyclerView;
        this.f10844h = constraintLayout2;
        this.f10845i = button4;
    }

    /* renamed from: a */
    public static G31 m105891a(View view) {
        int i = C51769xi4.cancel;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C51769xi4.nextOne;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C51769xi4.okay;
                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                if (button3 != null) {
                    i = C51769xi4.progressBar;
                    ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
                    if (progressBar != null) {
                        i = C51769xi4.progressText;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C51769xi4.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                            if (recyclerView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = C51769xi4.tryAgain;
                                Button button4 = (Button) C34328Lp6.m96312a(view, i);
                                if (button4 != null) {
                                    return new G31(constraintLayout, button, button2, button3, progressBar, textView, recyclerView, constraintLayout, button4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static G31 m105889c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C44082kk4.dialog_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m105891a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f10837a;
    }
}
