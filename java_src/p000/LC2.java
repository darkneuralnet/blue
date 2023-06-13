package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: LC2 */
/* loaded from: classes2.dex */
public final class LC2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f20889a;

    /* renamed from: b */
    public final Button f20890b;

    /* renamed from: c */
    public final RecyclerView f20891c;

    /* renamed from: d */
    public final TextView f20892d;

    /* renamed from: e */
    public final RelativeLayout f20893e;

    /* renamed from: f */
    public final View f20894f;

    public LC2(RelativeLayout relativeLayout, Button button, RecyclerView recyclerView, TextView textView, RelativeLayout relativeLayout2, View view) {
        this.f20889a = relativeLayout;
        this.f20890b = button;
        this.f20891c = recyclerView;
        this.f20892d = textView;
        this.f20893e = relativeLayout2;
        this.f20894f = view;
    }

    /* renamed from: a */
    public static LC2 m97596a(View view) {
        int i = C36585Vg4.learnMore;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.list;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C36585Vg4.prompt;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = C36585Vg4.separator;
                    View m96312a = C34328Lp6.m96312a(view, i);
                    if (m96312a != null) {
                        return new LC2(relativeLayout, button, recyclerView, textView, relativeLayout, m96312a);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static LC2 m97594c(LayoutInflater layoutInflater) {
        return m97593d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static LC2 m97593d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.longterm_setup_list_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m97596a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f20889a;
    }
}
