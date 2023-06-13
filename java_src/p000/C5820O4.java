package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: O4 */
/* loaded from: classes2.dex */
public final class C5820O4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f25597a;

    /* renamed from: b */
    public final Button f25598b;

    /* renamed from: c */
    public final TextView f25599c;

    /* renamed from: d */
    public final TextView f25600d;

    /* renamed from: e */
    public final LinearLayout f25601e;

    /* renamed from: f */
    public final TextView f25602f;

    /* renamed from: g */
    public final RecyclerView f25603g;

    /* renamed from: h */
    public final TextView f25604h;

    public C5820O4(LinearLayout linearLayout, Button button, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, RecyclerView recyclerView, TextView textView4) {
        this.f25597a = linearLayout;
        this.f25598b = button;
        this.f25599c = textView;
        this.f25600d = textView2;
        this.f25601e = linearLayout2;
        this.f25602f = textView3;
        this.f25603g = recyclerView;
        this.f25604h = textView4;
    }

    /* renamed from: a */
    public static C5820O4 m92957a(View view) {
        int i = C36585Vg4.cantFixButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.header;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.listHeader;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C36585Vg4.listHeaderContainer;
                    LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                    if (linearLayout != null) {
                        i = C36585Vg4.listSubHeader;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C36585Vg4.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                            if (recyclerView != null) {
                                i = C36585Vg4.subHeader;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    return new C5820O4((LinearLayout) view, button, textView, textView2, linearLayout, textView3, recyclerView, textView4);
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
    public static C5820O4 m92955c(LayoutInflater layoutInflater) {
        return m92954d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5820O4 m92954d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_potential_issues, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92957a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f25597a;
    }
}
