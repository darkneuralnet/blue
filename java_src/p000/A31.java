package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: A31 */
/* loaded from: classes2.dex */
public final class A31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f60a;

    /* renamed from: b */
    public final TextView f61b;

    /* renamed from: c */
    public final Button f62c;

    /* renamed from: d */
    public final Button f63d;

    /* renamed from: e */
    public final RecyclerView f64e;

    /* renamed from: f */
    public final TextView f65f;

    public A31(ConstraintLayout constraintLayout, TextView textView, Button button, Button button2, RecyclerView recyclerView, TextView textView2) {
        this.f60a = constraintLayout;
        this.f61b = textView;
        this.f62c = button;
        this.f63d = button2;
        this.f64e = recyclerView;
        this.f65f = textView2;
    }

    /* renamed from: a */
    public static A31 m116164a(View view) {
        int i = C36585Vg4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.cancel;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C36585Vg4.confirm;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C36585Vg4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C36585Vg4.title;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new A31((ConstraintLayout) view, textView, button, button2, recyclerView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static A31 m116162c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.dialog_nest_favorite, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116164a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f60a;
    }
}
