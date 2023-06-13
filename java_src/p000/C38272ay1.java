package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: ay1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38272ay1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f56684a;

    /* renamed from: b */
    public final TextView f56685b;

    /* renamed from: c */
    public final RecyclerView f56686c;

    /* renamed from: d */
    public final Button f56687d;

    /* renamed from: e */
    public final TextView f56688e;

    public C38272ay1(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, Button button, TextView textView2) {
        this.f56684a = constraintLayout;
        this.f56685b = textView;
        this.f56686c = recyclerView;
        this.f56687d = button;
        this.f56688e = textView2;
    }

    /* renamed from: a */
    public static C38272ay1 m65197a(View view) {
        int i = C43459jh4.message;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C43459jh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C43459jh4.skipHowTo;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C43459jh4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C38272ay1((ConstraintLayout) view, textView, recyclerView, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C38272ay1 m65195c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36837Wi4.fragment_configurable_tutorial_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m65197a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f56684a;
    }
}
